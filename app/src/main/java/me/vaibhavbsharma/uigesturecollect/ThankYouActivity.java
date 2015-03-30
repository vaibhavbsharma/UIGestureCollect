package me.vaibhavbsharma.uigesturecollect;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.view.VelocityTrackerCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class ThankYouActivity extends Activity {
    private VelocityTracker mVelocityTracker = null;
    public static final String TAG = "ThankYouActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_thank_you, menu);
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
            Log.i(TAG,"SubjectNumber.txt could not be opened/read");
            //You'll need to add proper error handling here
        }
        subjectNumber.setTitle("Subject # "+text);

        FileOutputStream outputStream;
        subjNumber = Integer.parseInt(text.toString())+1;

        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(("00"+Integer.toString(subjNumber)).getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        /*int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);*/
        return true;
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
}
