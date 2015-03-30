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


import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;


public class TextGDFragment extends Fragment{
    private final String TEXT_ACTIVITY="text_activity";
    private final String TEXT_ACTIVITY_NAME_STRING="text_activity_name_string";
    private final String TEXT_ACTIVITY_SUBJECT_NUMBER="text_activity_subject_number";
    private final String TEXT_ACTIVITY_TEXT="text_activity_text";
    private final String TEXT_ACTIVITY_NEXT_BUTTON="text_activity_next_button";
    private final String TEXT_ACTIVITY_ANSWER3="text_activity_answer3";
    private final String TEXT_ACTIVITY_ANSWER4="text_activity_answer4";


    public TextGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View gV_answer3 = getActivity().findViewById(R.id.text_answer3);
        View gV_answer4 = getActivity().findViewById(R.id.text_answer4);

        //View gV_text_activity = getActivity().findViewById(R.id.text_activity);
        View gV_name_string = getActivity().findViewById(R.id.text_name_string);
        View gV_subject_number = getActivity().findViewById(R.id.text_subject_number);
        //View gV_text = getActivity().findViewById(R.id.text);
        View gV_next_button = getActivity().findViewById(R.id.textactivity_button);

        //gV_text_activity.setClickable(true);
        //gV_text_activity.setFocusable(true);

        /*gV_name_string.setClickable(true);
        gV_name_string.setFocusable(true);

        gV_subject_number.setClickable(true);
        gV_subject_number.setFocusable(true);

        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);

        gV_answer3.setClickable(true);
        gV_answer3.setFocusable(true);

        gV_answer4.setClickable(true);
        gV_answer4.setFocusable(true); */

        /*gV_text.setClickable(true);
        gV_text.setFocusable(true);*/

        /*ANSWER1*/
        /*GestureDetector.SimpleOnGestureListener gL_name_string = new GestureListener(CHECKBOX_ACTIVITY_ANSWER1);
        final GestureDetector gD_name_string = new GestureDetector(getActivity(), gL_name_string);
        gV_answer1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_name_string.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        ((EditText)gV_answer3).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(TEXT_ACTIVITY_ANSWER3, "TextChangedCharSequence = "+s+"  at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(TEXT_ACTIVITY_ANSWER3,"beforeTextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(TEXT_ACTIVITY_ANSWER3,"afterTextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }
        });

        /*ANSWER2*/
        /*GestureDetector.SimpleOnGestureListener gL_subject_number = new GestureListener(CHECKBOX_ACTIVITY_ANSWER2);
        final GestureDetector gD_subject_number = new GestureDetector(getActivity(), gL_subject_number);
        gV_answer2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_subject_number.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        ((EditText)gV_answer4).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(TEXT_ACTIVITY_ANSWER4, "TextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(TEXT_ACTIVITY_ANSWER4,"beforeTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(TEXT_ACTIVITY_ANSWER4,"afterTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }
        });



        // BEGIN_INCLUDE(init_detector)

        // First create the GestureListener that will include all our callbacks.
        // Then create the GestureDetector, which takes that listener as an argument.
        GestureDetector.SimpleOnGestureListener gL_text_activity = new GestureListener(TEXT_ACTIVITY);
        final GestureDetector gD_text_activity = new GestureDetector(getActivity(), gL_text_activity);

        /* For the view where gestures will occur, create an onTouchListener that sends
         * all motion events to the gesture detector.  When the gesture detector
         * actually detects an event, it will use the callbacks you created in the
         * SimpleOnGestureListener to alert your application.
        */

        /*gV_text_activity.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_text_activity.onTouchEvent(motionEvent);
                return false;
            }
        });*/

        /*NAME_STRING*/
        /*GestureDetector.SimpleOnGestureListener gL_name_string = new GestureListener(TEXT_ACTIVITY_NAME_STRING);
        final GestureDetector gD_name_string = new GestureDetector(getActivity(), gL_name_string);
        gV_name_string.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_name_string.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        ((EditText)gV_name_string).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(TEXT_ACTIVITY_NAME_STRING, "TextChangedCharSequence = "+s+"  at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(TEXT_ACTIVITY_NAME_STRING,"beforeTextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(TEXT_ACTIVITY_NAME_STRING,"afterTextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }
        });

        /*SUBJECT_NUMBER*/
        /*GestureDetector.SimpleOnGestureListener gL_subject_number = new GestureListener(TEXT_ACTIVITY_SUBJECT_NUMBER);
        final GestureDetector gD_subject_number = new GestureDetector(getActivity(), gL_subject_number);
        gV_subject_number.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_subject_number.onTouchEvent(motionEvent);
                return false;
            }
        });*/
        ((EditText)gV_subject_number).addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(TEXT_ACTIVITY_SUBJECT_NUMBER, "TextChanged CharSequence = "+s+" at time = "+ SystemClock.uptimeMillis());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i(TEXT_ACTIVITY_SUBJECT_NUMBER,"beforeTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(TEXT_ACTIVITY_SUBJECT_NUMBER,"afterTextChanged CharSequence = "+s+" at time = "+SystemClock.uptimeMillis());
            }
        });

        /*TEXT*/
        /*GestureDetector.SimpleOnGestureListener gL_text = new GestureListener(TEXT_ACTIVITY_TEXT);
        final GestureDetector gD_text = new GestureDetector(getActivity(), gL_text);
        gV_text.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_text.onTouchEvent(motionEvent);
                return false;
            }
        });*/

        /*text_ACTIVITY_NEXT_BUTTON*/
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(TEXT_ACTIVITY_NEXT_BUTTON);
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
