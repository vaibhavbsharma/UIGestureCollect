package me.vaibhavbsharma.uigesturecollect;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.VelocityTrackerCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class TextActivity extends FragmentActivity {
    public static final String TAG = "TextActivity";
    private VelocityTracker mVelocityTracker = null;
    public static final String FRAGTAG = "TextGDFragment";
    CustomKeyboard mCustomKeyboard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        if (getSupportFragmentManager().findFragmentByTag(FRAGTAG) == null ) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            TextGDFragment fragment = new TextGDFragment();
            transaction.add(fragment, FRAGTAG);
            transaction.commit();
        }
        mCustomKeyboard= new CustomKeyboard(this, R.id.keyboardview, R.xml.hexkbd );
        mCustomKeyboard.registerEditText(R.id.text_name_string);
        mCustomKeyboard.registerEditText(R.id.text_subject_number);
        mCustomKeyboard.registerEditText(R.id.text_answer3);
        mCustomKeyboard.registerEditText(R.id.text_answer4);
        mCustomKeyboard.registerEditText(R.id.text_answer5);
        mCustomKeyboard.registerEditText(R.id.text_answer6);
        mCustomKeyboard.registerEditText(R.id.text_answer7);
        mCustomKeyboard.registerEditText(R.id.text_answer8);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_text, menu);
        MenuItem subjectNumber = menu.findItem(R.id.subject_number);
        String filename = "SubjectNumber.txt";
        int subjNumber=-1;

        File file = new File(getApplicationContext().getFilesDir(),filename);
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                Log.i(TAG, "read: " + line);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }

    /* Called when the user clicks the Next button */
    public void startCheckboxActivity(View view) {
        Log.i(TAG, "startCheckboxActivity called");
        Intent intent = new Intent(this, CheckboxActivity.class);
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
    @Override
    public void onBackPressed() {
        // NOTE Trap the back key: when the CustomKeyboard is still visible hide it, only when it is invisible, finish activity
        if( mCustomKeyboard.isCustomKeyboardVisible() ) mCustomKeyboard.hideCustomKeyboard(); else this.finish();
    }

}
