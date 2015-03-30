package me.vaibhavbsharma.uigesturecollect;

/*
* Copyright (C) 2013 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;


public class BasicGestureDetectFragment extends Fragment {
    private final String MAIN_ACTIVITY="main_activity";
    private final String MAIN_ACTIVITY_NAME_STRING="main_activity_name_string";
    private final String MAIN_ACTIVITY_NUMBER_STRING="main_activity_number_string";
    private final String MAIN_ACTIVITY_QWERTY_STRING="main_activity_qwerty_string";
    private final String MAIN_ACTIVITY_SUBJECT_NUMBER="main_activity_subject_number";
    private final String MAIN_ACTIVITY_NEXT_BUTTON="main_activity_next_button";

    public BasicGestureDetectFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //View gV_main_activity = getActivity().findViewById(R.id.main_activity);
        View gV_name_string = getActivity().findViewById(R.id.name_string);
        View gV_number_string = getActivity().findViewById(R.id.number_string);
        View gV_qwerty_string = getActivity().findViewById(R.id.qwerty_string);
        View gV_subject_number = getActivity().findViewById(R.id.subject_number);
        View gV_next_button = getActivity().findViewById(R.id.mainactivity_button);

        //gV_main_activity.setClickable(true);
        //gV_main_activity.setFocusable(true);

        /*gV_name_string.setClickable(true);
        gV_name_string.setFocusable(true);

        gV_number_string.setClickable(true);
        gV_number_string.setFocusable(true);

        gV_qwerty_string.setClickable(true);
        gV_qwerty_string.setFocusable(true);

        gV_subject_number.setClickable(true);
        gV_subject_number.setFocusable(true);*/

        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);

        // BEGIN_INCLUDE(init_detector)

        // First create the GestureListener that will include all our callbacks.
        // Then create the GestureDetector, which takes that listener as an argument.
        GestureDetector.SimpleOnGestureListener gL_main_activity = new GestureListener(MAIN_ACTIVITY);
        final GestureDetector gD_main_activity = new GestureDetector(getActivity(), gL_main_activity);

        /* For the view where gestures will occur, create an onTouchListener that sends
         * all motion events to the gesture detector.  When the gesture detector
         * actually detects an event, it will use the callbacks you created in the
         * SimpleOnGestureListener to alert your application.
        */

        /*gV_main_activity.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_main_activity.onTouchEvent(motionEvent);
                return false;
            }
        });*/

        /*NAME_STRING*/
        /*GestureDetector.SimpleOnGestureListener gL_name_string = new GestureListener(MAIN_ACTIVITY_NAME_STRING);
        final GestureDetector gD_name_string = new GestureDetector(getActivity(), gL_name_string);
        gV_name_string.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_name_string.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        /*((EditText)gV_name_string).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(MAIN_ACTIVITY_NAME_STRING, "TextChangedCharSequence = " + s + "  at time = " + SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(MAIN_ACTIVITY_NAME_STRING,"beforeTextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(MAIN_ACTIVITY_NAME_STRING,"afterTextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }
        });*/

        /*NUMBER_STRING*/
        /*GestureDetector.SimpleOnGestureListener gL_number_string = new GestureListener(MAIN_ACTIVITY_NUMBER_STRING);
        final GestureDetector gD_number_string = new GestureDetector(getActivity(), gL_number_string);
        gV_number_string.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_number_string.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        /*((EditText)gV_number_string).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(MAIN_ACTIVITY_NUMBER_STRING, "TextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(MAIN_ACTIVITY_NUMBER_STRING,"beforeTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(MAIN_ACTIVITY_NUMBER_STRING,"afterTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }
        });*/

        /*QWERTY_STRING*/
        /*GestureDetector.SimpleOnGestureListener gL_qwerty_string = new GestureListener(MAIN_ACTIVITY_QWERTY_STRING);
        final GestureDetector gD_qwerty_string = new GestureDetector(getActivity(), gL_qwerty_string);
        gV_qwerty_string.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_qwerty_string.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        /*((EditText)gV_qwerty_string).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(MAIN_ACTIVITY_QWERTY_STRING, "TextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(MAIN_ACTIVITY_QWERTY_STRING,"beforeTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(MAIN_ACTIVITY_QWERTY_STRING,"afterTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }
        });*/

        /*SUBJECT_NUMBER*/
        /*GestureDetector.SimpleOnGestureListener gL_subject_number = new GestureListener(MAIN_ACTIVITY_SUBJECT_NUMBER);
        final GestureDetector gD_subject_number = new GestureDetector(getActivity(), gL_subject_number);
        gV_subject_number.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_subject_number.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        /*((EditText)gV_subject_number).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(MAIN_ACTIVITY_SUBJECT_NUMBER, "TextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(MAIN_ACTIVITY_SUBJECT_NUMBER,"beforeTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(MAIN_ACTIVITY_SUBJECT_NUMBER,"afterTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }
        });*/

        /*MAIN_ACTIVITY_NEXT_BUTTON*/
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(MAIN_ACTIVITY_NEXT_BUTTON);
        final GestureDetector gD_next_button = new GestureDetector(getActivity(), gL_next_button);
        gV_next_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_next_button.onTouchEvent(motionEvent);
                return false;
            }
        });



        // END_INCLUDE(init_detector)
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*if (item.getItemId() == R.id.sample_action) {
            clearLog();
        }*/
        return true;
    }

    public void clearLog() {
        /*LogFragment logFragment =  ((LogFragment) getActivity().getSupportFragmentManager()
                .findFragmentById(R.id.log_fragment));
        logFragment.getLogView().setText("");*/
    }
}
