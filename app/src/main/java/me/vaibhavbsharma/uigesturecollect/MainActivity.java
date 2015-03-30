package me.vaibhavbsharma.uigesturecollect;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/*
* Copyright 2013 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.VelocityTrackerCompat;
import android.view.MenuItem;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


/**
 * A simple launcher activity containing a summary sample description
 * and a few action bar buttons.
 */
public class MainActivity extends FragmentActivity {

    public static final String TAG = "MainActivity";

    public static final String FRAGTAG = "BasicGestureDetectFragment";

    private VelocityTracker mVelocityTracker = null;

    CustomKeyboard mCustomKeyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportFragmentManager().findFragmentByTag(FRAGTAG) == null ) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            BasicGestureDetectFragment fragment = new BasicGestureDetectFragment();
            transaction.add(fragment, FRAGTAG);
            transaction.commit();
        }
        mCustomKeyboard= new CustomKeyboard(this, R.id.keyboardview, R.xml.hexkbd );
        mCustomKeyboard.registerEditText(R.id.name_string);
        mCustomKeyboard.registerEditText(R.id.number_string);
        mCustomKeyboard.registerEditText(R.id.subject_number);
        mCustomKeyboard.registerEditText(R.id.qwerty_string);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        FileOutputStream outputStream;

        /*
        //SubjectNumber writing code
        try {
            outputStream = openFileOutput("SubjectNumber.txt", Context.MODE_PRIVATE);
            outputStream.write(("001").getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        MenuItem subjectNumber = menu.findItem(R.id.subject_number);
        String filename = "SubjectNumber.txt";
        int subjNumber=-1;

        File file = new File(getApplicationContext().getFilesDir(),filename);
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                Log.i(TAG,"read: "+line);
                text.append(line);
            }
            br.close();
        }
        catch (IOException e) {
            //You'll need to add proper error handling here
        }
        subjectNumber.setTitle("Subject # "+text);
        return true;
    }

    /** Create a chain of targets that will receive log data */
    /*@Override
    public void initializeLogging() {
        // Wraps Android's native log framework.
        LogWrapper logWrapper = new LogWrapper();
        // Using Log, front-end to the logging chain, emulates android.util.log method signatures.
        Log.setLogNode(logWrapper);

        // Filter strips out everything except the message text.
        MessageOnlyLogFilter msgFilter = new MessageOnlyLogFilter();
        logWrapper.setNext(msgFilter);

        // On screen logging via a fragment with a TextView.
        LogFragment logFragment = (LogFragment) getSupportFragmentManager()
                .findFragmentById(R.id.log_fragment);
        msgFilter.setNext(logFragment.getLogView());
        logFragment.getLogView().setTextAppearance(this, R.style.Log);
        logFragment.getLogView().setBackgroundColor(Color.WHITE);

        Log.i(TAG, "Ready called at "+ SystemClock.uptimeMillis());
    }*/

    /* Called when the user clicks the Next button */
    public void startTextActivity(View view) {
        Log.i(TAG, "startTextActivity called at "+ SystemClock.uptimeMillis());
        Intent intent = new Intent(this, TextActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart called at "+ SystemClock.uptimeMillis());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop called at "+ SystemClock.uptimeMillis());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart called at "+ SystemClock.uptimeMillis());
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG, "dispatchTouchEvent called");
        int index = event.getActionIndex();
        int action = event.getActionMasked();
        int pointerId = event.getPointerId(index);
        int historySize;
        int pointerCount;

        switch(action) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "ACTION_DOWN at time = " + SystemClock.uptimeMillis());
                historySize = event.getHistorySize();
                pointerCount = event.getPointerCount();
                for (int h = 0; h < historySize; h++) {
                    System.out.printf("At time %d:", event.getHistoricalEventTime(h));
                    for (int p = 0; p < pointerCount; p++) {
                        Log.i(TAG, "  pointer " +
                                event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                                " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
                    }
                }
                Log.i(TAG, "At time " + event.getEventTime());
                for (int p = 0; p < pointerCount; p++) {
                    Log.i(TAG, "  pointer " +
                            event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                            " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
                }
                if(mVelocityTracker == null) {
                    // Retrieve a new VelocityTracker object to watch the velocity of a motion.
                    mVelocityTracker = VelocityTracker.obtain();
                }
                else {
                    // Reset the velocity tracker back to its initial state.
                    mVelocityTracker.clear();
                }
                // Add a user's movement to the tracker.
                mVelocityTracker.addMovement(event);
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "ACTION_MOVE at time = " + SystemClock.uptimeMillis());
                mVelocityTracker.addMovement(event);
                // When you want to determine the velocity, call
                // computeCurrentVelocity(). Then call getXVelocity()
                // and getYVelocity() to retrieve the velocity for each pointer ID.
                mVelocityTracker.computeCurrentVelocity(1000);
                // Log velocity of pixels per second
                // Best practice to use VelocityTrackerCompat where possible.
                Log.d("", "X velocity: " +
                        VelocityTrackerCompat.getXVelocity(mVelocityTracker,
                                pointerId));
                Log.d("", "Y velocity: " +
                        VelocityTrackerCompat.getYVelocity(mVelocityTracker,
                                pointerId));

                historySize = event.getHistorySize();
                pointerCount = event.getPointerCount();
                for (int h = 0; h < historySize; h++) {
                    System.out.printf("At time %d:", event.getHistoricalEventTime(h));
                    for (int p = 0; p < pointerCount; p++) {
                        Log.i(TAG, "  pointer " +
                                event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                                " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
                    }
                }
                Log.i(TAG, "At time " + event.getEventTime());
                for (int p = 0; p < pointerCount; p++) {
                    Log.i(TAG, "  pointer " +
                            event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                            " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
                }

                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "ACTION_UP at time = " + SystemClock.uptimeMillis());
                historySize = event.getHistorySize();
                pointerCount = event.getPointerCount();
                for (int h = 0; h < historySize; h++) {
                    System.out.printf("At time %d:", event.getHistoricalEventTime(h));
                    for (int p = 0; p < pointerCount; p++) {
                        Log.i(TAG, "  pointer " +
                                event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                                " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
                    }
                }
                Log.i(TAG, "At time " + event.getEventTime());
                for (int p = 0; p < pointerCount; p++) {
                    Log.i(TAG, "  pointer " +
                            event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                            " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
                }
            case MotionEvent.ACTION_CANCEL:
                // Return a VelocityTracker object back to be re-used by others.
                mVelocityTracker.recycle();
                mVelocityTracker=null;
                break;
        }
        return super.dispatchTouchEvent(event);
    }
    @Override public void onBackPressed() {
        // NOTE Trap the back key: when the CustomKeyboard is still visible hide it, only when it is invisible, finish activity
        if( mCustomKeyboard.isCustomKeyboardVisible() ) mCustomKeyboard.hideCustomKeyboard(); else this.finish();
    }


}






/*package nl.fampennings.keyboardoriginal;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    CustomKeyboard mCustomKeyboard;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomKeyboard= new CustomKeyboard(this, R.id.keyboardview, R.xml.hexkbd );

        mCustomKeyboard.registerEditText(R.id.edittext0);
        mCustomKeyboard.registerEditText(R.id.edittext1);
        mCustomKeyboard.registerEditText(R.id.edittext2);
        mCustomKeyboard.registerEditText(R.id.edittext3);
        mCustomKeyboard.registerEditText(R.id.edittext4);
    }

    @Override public void onBackPressed() {
        // NOTE Trap the back key: when the CustomKeyboard is still visible hide it, only when it is invisible, finish activity
        if( mCustomKeyboard.isCustomKeyboardVisible() ) mCustomKeyboard.hideCustomKeyboard(); else this.finish();
    }

}*/


