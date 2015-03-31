package me.vaibhavbsharma.uigesturecollect1;

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

import android.os.SystemClock;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

//import com.example.android.common.logger.Log;


public class GestureListener extends GestureDetector.SimpleOnGestureListener {

    private String TAG;

    public GestureListener(String _TAG){
        TAG=_TAG;
    }

    // BEGIN_INCLUDE(init_gestureListener)
    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        // Up motion completing a single tap occurred.
        Log.i(TAG, "Single Tap Up at time = " + SystemClock.uptimeMillis());
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                        " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
            }
        }
        Log.i(TAG, "At time "+ event.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                    " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
        }
        return false;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        // Touch has been long enough to indicate a long press.
        // Does not indicate motion is complete yet (no up event necessarily)
        Log.i(TAG, "Long Press at time = "+ SystemClock.uptimeMillis());
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                        " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
            }
        }
        Log.i(TAG, "At time "+ event.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                    " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
        }
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        // User attempted to scroll
        Log.i(TAG, "Scroll at time = "+ SystemClock.uptimeMillis());
        if(event1==null || event2 == null) {
            Log.i(TAG,"Scroll returned");
            return false;
        }
        int historySize = event1.getHistorySize();
        int pointerCount = event1.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event1.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event1.getPointerId(p) + " " + event1.getX(p) + " " + event1.getY(p) +
                        " " + event1.getPressure(p) + " " + event1.getOrientation(p) +" "+event1.getSize());
            }
        }
        Log.i(TAG, "At time "+ event1.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event1.getPointerId(p) + " " + event1.getX(p) + " " + event1.getY(p) +
                    " " + event1.getPressure(p) + " " + event1.getOrientation(p) +" "+event1.getSize());
        }

        historySize = event2.getHistorySize();
        pointerCount = event2.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event2.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event2.getPointerId(p) + " " + event2.getX(p) + " " + event2.getY(p) +
                        " " + event2.getPressure(p) + " " + event2.getOrientation(p) +" "+event2.getSize());
            }
        }
        Log.i(TAG, "At time "+ event2.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event2.getPointerId(p) + " " + event2.getX(p) + " " + event2.getY(p) +
                    " " + event2.getPressure(p) + " " + event2.getOrientation(p) +" "+event2.getSize());
        }
        return false;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX,
                           float velocityY) {
        // Fling event occurred.  Notification of this one happens after an "up" event.
        Log.i(TAG, "Fling at time = "+ SystemClock.uptimeMillis());
        int historySize = event1.getHistorySize();
        int pointerCount = event1.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event1.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event1.getPointerId(p) + " " + event1.getX(p) + " " + event1.getY(p) +
                        " " + event1.getPressure(p) + " " + event1.getOrientation(p) +" "+event1.getSize());
            }
        }
        Log.i(TAG, "At time "+ event1.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event1.getPointerId(p) + " " + event1.getX(p) + " " + event1.getY(p) +
                    " " + event1.getPressure(p) + " " + event1.getOrientation(p) +" "+event1.getSize());
        }

        historySize = event2.getHistorySize();
        pointerCount = event2.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event2.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event2.getPointerId(p) + " " + event2.getX(p) + " " + event2.getY(p) +
                        " " + event2.getPressure(p) + " " + event2.getOrientation(p) +" "+event2.getSize());
            }
        }
        Log.i(TAG, "At time "+ event2.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event2.getPointerId(p) + " " + event2.getX(p) + " " + event2.getY(p) +
                    " " + event2.getPressure(p) + " " + event2.getOrientation(p) +" "+event2.getSize());
        }
        return false;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        // User performed a down event, and hasn't moved yet.
        Log.i(TAG, "Show Press at time = "+ SystemClock.uptimeMillis());
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                        " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
            }
        }
        Log.i(TAG, "At time "+ event.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                    " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
        }
    }

    @Override
    public boolean onDown(MotionEvent event) {
        // "Down" event - User touched the screen.
        Log.i(TAG, "Down at time = "+ SystemClock.uptimeMillis());
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                        " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
            }
        }
        Log.i(TAG, "At time "+ event.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                    " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
        }
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        // User tapped the screen twice.
        Log.i(TAG, "Double tap at time = "+ SystemClock.uptimeMillis());
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                        " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
            }
        }
        Log.i(TAG, "At time "+ event.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                    " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
        }
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        // Since double-tap is actually several events which are considered one aggregate
        // gesture, there's a separate callback for an individual event within the doubletap
        // occurring.  This occurs for down, up, and move.
        Log.i(TAG, "Event within double tap at time = "+ SystemClock.uptimeMillis());
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                        " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
            }
        }
        Log.i(TAG, "At time "+ event.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                    " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
        }
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        // A confirmed single-tap event has occurred.  Only called when the detector has
        // determined that the first tap stands alone, and is not part of a double tap.
        Log.i(TAG, "Single tap confirmed at time = "+ SystemClock.uptimeMillis());
        final int historySize = event.getHistorySize();
        final int pointerCount = event.getPointerCount();
        for (int h = 0; h < historySize; h++) {
            System.out.printf("At time %d:", event.getHistoricalEventTime(h));
            for (int p = 0; p < pointerCount; p++) {
                Log.i(TAG, "  pointer " +
                        event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                        " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
            }
        }
        Log.i(TAG, "At time "+ event.getEventTime());
        for (int p = 0; p < pointerCount; p++) {
            Log.i(TAG, "  pointer " +
                    event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                    " " + event.getPressure(p) + " " + event.getOrientation(p) +" "+event.getSize());
        }
        return false;
    }
    // END_INCLUDE(init_gestureListener)
}
