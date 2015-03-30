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


public class TogglebuttonGDFragment extends Fragment{
    private final String RADIO_ACTIVITY="togglebutton_activity";
    private final String TOGGLEBUTTON_ACTIVITY_NEXT_BUTTON="togglebutton_activity_next_button";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER1="togglebutton_answer1";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER2="togglebutton_answer2";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER3="togglebutton_answer3";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER4="togglebutton_answer4";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER5="togglebutton_answer5";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER6="togglebutton_answer6";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER7="togglebutton_answer7";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER8="togglebutton_answer8";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER9="togglebutton_answer9";

    private final String TOGGLEBUTTON_ACTIVITY_ANSWER10="togglebutton_answer10";


    public TogglebuttonGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //View gV_togglebutton_activity = getActivity().findViewById(R.id.togglebutton_activity);

        View gV_next_button = getActivity().findViewById(R.id.togglebuttonactivity_button);

        //gV_togglebutton_activity.setClickable(true);
        //gV_togglebutton_activity.setFocusable(true);

        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);


        /*togglebutton_ACTIVITY_NEXT_BUTTON*/
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(TOGGLEBUTTON_ACTIVITY_NEXT_BUTTON);
        final GestureDetector gD_next_button = new GestureDetector(getActivity(), gL_next_button);
        gV_next_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_next_button.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer11 = getActivity().findViewById(R.id.ToggleButton_answer1);

        gV_answer11.setClickable(true);
        gV_answer11.setFocusable(true);;

        /*TOGGLEBUTTON_ACTIVITY_ANSWER11*/
        GestureDetector.SimpleOnGestureListener gL_answer11 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER1);
        final GestureDetector gD_answer11 = new GestureDetector(getActivity(), gL_answer11);
        gV_answer11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer11.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer21 = getActivity().findViewById(R.id.ToggleButton_answer2);

        gV_answer21.setClickable(true);
        gV_answer21.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER21*/
        GestureDetector.SimpleOnGestureListener gL_answer21 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER2);
        final GestureDetector gD_answer21 = new GestureDetector(getActivity(), gL_answer21);
        gV_answer21.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer21.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer31 = getActivity().findViewById(R.id.ToggleButton_answer3);

        gV_answer31.setClickable(true);
        gV_answer31.setFocusable(true);


        /*TOGGLEBUTTON_ACTIVITY_ANSWER31*/
        GestureDetector.SimpleOnGestureListener gL_answer31 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER3);
        final GestureDetector gD_answer31 = new GestureDetector(getActivity(), gL_answer31);
        gV_answer31.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer31.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer41 = getActivity().findViewById(R.id.ToggleButton_answer4);

        gV_answer41.setClickable(true);
        gV_answer41.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER41*/
        GestureDetector.SimpleOnGestureListener gL_answer41 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER4);
        final GestureDetector gD_answer41 = new GestureDetector(getActivity(), gL_answer41);
        gV_answer41.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer41.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer51 = getActivity().findViewById(R.id.ToggleButton_answer5);

        gV_answer51.setClickable(true);
        gV_answer51.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER51*/
        GestureDetector.SimpleOnGestureListener gL_answer51 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER5);
        final GestureDetector gD_answer51 = new GestureDetector(getActivity(), gL_answer51);
        gV_answer51.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer51.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer61 = getActivity().findViewById(R.id.ToggleButton_answer6);

        gV_answer61.setClickable(true);
        gV_answer61.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER61*/
        GestureDetector.SimpleOnGestureListener gL_answer61 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER6);
        final GestureDetector gD_answer61 = new GestureDetector(getActivity(), gL_answer61);
        gV_answer61.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer61.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer71 = getActivity().findViewById(R.id.ToggleButton_answer7);

        gV_answer71.setClickable(true);
        gV_answer71.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER71*/
        GestureDetector.SimpleOnGestureListener gL_answer71 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER7);
        final GestureDetector gD_answer71 = new GestureDetector(getActivity(), gL_answer71);
        gV_answer71.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer71.onTouchEvent(motionEvent);
                return false;
            }
        });




        View gV_answer81 = getActivity().findViewById(R.id.ToggleButton_answer8);

        gV_answer81.setClickable(true);
        gV_answer81.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER81*/
        GestureDetector.SimpleOnGestureListener gL_answer81 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER8);
        final GestureDetector gD_answer81 = new GestureDetector(getActivity(), gL_answer81);
        gV_answer81.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer81.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer91 = getActivity().findViewById(R.id.ToggleButton_answer9);

        gV_answer91.setClickable(true);
        gV_answer91.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER91*/
        GestureDetector.SimpleOnGestureListener gL_answer91 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER9);
        final GestureDetector gD_answer91 = new GestureDetector(getActivity(), gL_answer91);
        gV_answer91.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer91.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer101 = getActivity().findViewById(R.id.ToggleButton_answer10);

        gV_answer101.setClickable(true);
        gV_answer101.setFocusable(true);

        /*TOGGLEBUTTON_ACTIVITY_ANSWER101*/
        GestureDetector.SimpleOnGestureListener gL_answer101 = new GestureListener(TOGGLEBUTTON_ACTIVITY_ANSWER10);
        final GestureDetector gD_answer101 = new GestureDetector(getActivity(), gL_answer101);
        gV_answer101.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer101.onTouchEvent(motionEvent);
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
