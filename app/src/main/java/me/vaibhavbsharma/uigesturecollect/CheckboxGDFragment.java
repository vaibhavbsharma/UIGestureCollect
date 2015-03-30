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


public class CheckboxGDFragment extends Fragment{
    private final String CHECKBOX_ACTIVITY="checkbox_activity";

    private final String CHECKBOX_ACTIVITY_NEXT_BUTTON="checkbox_activity_next_button";

    private final String CHECKBOX_ACTIVITY_ANSWER31="checkbox_answer31";
    private final String CHECKBOX_ACTIVITY_ANSWER32="checkbox_answer32";

    private final String CHECKBOX_ACTIVITY_ANSWER41="checkbox_answer41";
    private final String CHECKBOX_ACTIVITY_ANSWER42="checkbox_answer42";

    private final String CHECKBOX_ACTIVITY_ANSWER51="checkbox_answer51";
    private final String CHECKBOX_ACTIVITY_ANSWER52="checkbox_answer52";

    private final String CHECKBOX_ACTIVITY_ANSWER61="checkbox_answer61";
    private final String CHECKBOX_ACTIVITY_ANSWER62="checkbox_answer62";

    private final String CHECKBOX_ACTIVITY_ANSWER71="checkbox_answer71";
    private final String CHECKBOX_ACTIVITY_ANSWER72="checkbox_answer72";

    private final String CHECKBOX_ACTIVITY_ANSWER81="checkbox_answer81";
    private final String CHECKBOX_ACTIVITY_ANSWER82="checkbox_answer82";

    private final String CHECKBOX_ACTIVITY_ANSWER91="checkbox_answer91";
    private final String CHECKBOX_ACTIVITY_ANSWER92="checkbox_answer92";

    private final String CHECKBOX_ACTIVITY_ANSWER101="checkbox_answer101";
    private final String CHECKBOX_ACTIVITY_ANSWER102="checkbox_answer102";

    private final String CHECKBOX_ACTIVITY_ANSWER111="checkbox_answer111";
    private final String CHECKBOX_ACTIVITY_ANSWER112="checkbox_answer112";

    private final String CHECKBOX_ACTIVITY_ANSWER121="checkbox_answer121";
    private final String CHECKBOX_ACTIVITY_ANSWER122="checkbox_answer122";

    public CheckboxGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //View gV_checkbox_activity = getActivity().findViewById(R.id.checkbox_activity);

        View gV_next_button = getActivity().findViewById(R.id.checkboxactivity_button);

        View gV_answer31 = getActivity().findViewById(R.id.checkbox_answer31);
        View gV_answer32 = getActivity().findViewById(R.id.checkbox_answer32);

        View gV_answer41 = getActivity().findViewById(R.id.checkbox_answer41);
        View gV_answer42 = getActivity().findViewById(R.id.checkbox_answer42);

        View gV_answer51 = getActivity().findViewById(R.id.checkbox_answer51);
        View gV_answer52 = getActivity().findViewById(R.id.checkbox_answer52);

        View gV_answer61 = getActivity().findViewById(R.id.checkbox_answer61);
        View gV_answer62 = getActivity().findViewById(R.id.checkbox_answer62);

        View gV_answer71 = getActivity().findViewById(R.id.checkbox_answer71);
        View gV_answer72 = getActivity().findViewById(R.id.checkbox_answer72);

        View gV_answer81 = getActivity().findViewById(R.id.checkbox_answer81);
        View gV_answer82 = getActivity().findViewById(R.id.checkbox_answer82);

        View gV_answer91 = getActivity().findViewById(R.id.checkbox_answer91);
        View gV_answer92 = getActivity().findViewById(R.id.checkbox_answer92);

        gV_answer91.setClickable(true);
        gV_answer91.setFocusable(true);

        gV_answer92.setClickable(true);
        gV_answer92.setFocusable(true);

        /*CHECKBOX_ACTIVITY_ANSWER91*/
        GestureDetector.SimpleOnGestureListener gL_answer91 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER91);
        final GestureDetector gD_answer91 = new GestureDetector(getActivity(), gL_answer91);
        gV_answer91.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer91.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER92*/
        GestureDetector.SimpleOnGestureListener gL_answer92 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER92);
        final GestureDetector gD_answer92 = new GestureDetector(getActivity(), gL_answer92);
        gV_answer92.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer92.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer101 = getActivity().findViewById(R.id.checkbox_answer101);
        View gV_answer102 = getActivity().findViewById(R.id.checkbox_answer102);

        gV_answer101.setClickable(true);
        gV_answer101.setFocusable(true);

        gV_answer102.setClickable(true);
        gV_answer102.setFocusable(true);

        /*CHECKBOX_ACTIVITY_ANSWER101*/
        GestureDetector.SimpleOnGestureListener gL_answer101 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER101);
        final GestureDetector gD_answer101 = new GestureDetector(getActivity(), gL_answer101);
        gV_answer101.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer101.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER102*/
        GestureDetector.SimpleOnGestureListener gL_answer102 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER102);
        final GestureDetector gD_answer102 = new GestureDetector(getActivity(), gL_answer102);
        gV_answer102.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer102.onTouchEvent(motionEvent);
                return false;
            }
        });




        View gV_answer111 = getActivity().findViewById(R.id.checkbox_answer111);
        View gV_answer112 = getActivity().findViewById(R.id.checkbox_answer112);

        gV_answer111.setClickable(true);
        gV_answer111.setFocusable(true);

        gV_answer112.setClickable(true);
        gV_answer112.setFocusable(true);

        /*CHECKBOX_ACTIVITY_ANSWER111*/
        GestureDetector.SimpleOnGestureListener gL_answer111 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER111);
        final GestureDetector gD_answer111 = new GestureDetector(getActivity(), gL_answer111);
        gV_answer111.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer111.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER112*/
        GestureDetector.SimpleOnGestureListener gL_answer112 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER112);
        final GestureDetector gD_answer112 = new GestureDetector(getActivity(), gL_answer112);
        gV_answer112.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer112.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer121 = getActivity().findViewById(R.id.checkbox_answer121);
        View gV_answer122 = getActivity().findViewById(R.id.checkbox_answer122);

        gV_answer121.setClickable(true);
        gV_answer121.setFocusable(true);

        gV_answer122.setClickable(true);
        gV_answer122.setFocusable(true);

        /*CHECKBOX_ACTIVITY_ANSWER121*/
        GestureDetector.SimpleOnGestureListener gL_answer121 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER121);
        final GestureDetector gD_answer121 = new GestureDetector(getActivity(), gL_answer121);
        gV_answer121.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer121.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER122*/
        GestureDetector.SimpleOnGestureListener gL_answer122 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER122);
        final GestureDetector gD_answer122 = new GestureDetector(getActivity(), gL_answer122);
        gV_answer122.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer122.onTouchEvent(motionEvent);
                return false;
            }
        });




        //gV_checkbox_activity.setClickable(true);
        //gV_checkbox_activity.setFocusable(true);



        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);

        gV_answer31.setClickable(true);
        gV_answer31.setFocusable(true);

        gV_answer32.setClickable(true);
        gV_answer32.setFocusable(true);

        gV_answer41.setClickable(true);
        gV_answer41.setFocusable(true);

        gV_answer42.setClickable(true);
        gV_answer42.setFocusable(true);

        gV_answer51.setClickable(true);
        gV_answer51.setFocusable(true);

        gV_answer52.setClickable(true);
        gV_answer52.setFocusable(true);

        gV_answer61.setClickable(true);
        gV_answer61.setFocusable(true);

        gV_answer62.setClickable(true);
        gV_answer62.setFocusable(true);

        gV_answer71.setClickable(true);
        gV_answer71.setFocusable(true);

        gV_answer72.setClickable(true);
        gV_answer72.setFocusable(true);

        gV_answer81.setClickable(true);
        gV_answer81.setFocusable(true);

        gV_answer82.setClickable(true);
        gV_answer82.setFocusable(true);

        // BEGIN_INCLUDE(init_detector)

        // First create the GestureListener that will include all our callbacks.
        // Then create the GestureDetector, which takes that listener as an argument.
        GestureDetector.SimpleOnGestureListener gL_checkbox_activity = new GestureListener(CHECKBOX_ACTIVITY);
        final GestureDetector gD_checkbox_activity = new GestureDetector(getActivity(), gL_checkbox_activity);

        /* For the view where gestures will occur, create an onTouchListener that sends
         * all motion events to the gesture detector.  When the gesture detector
         * actually detects an event, it will use the callbacks you created in the
         * SimpleOnGestureListener to alert your application.
        */

        /*gV_checkbox_activity.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_checkbox_activity.onTouchEvent(motionEvent);
                return false;
            }
        });*/



        /*CHECKBOX_ACTIVITY_ANSWER31*/
        GestureDetector.SimpleOnGestureListener gL_answer31 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER31);
        final GestureDetector gD_answer31 = new GestureDetector(getActivity(), gL_answer31);
        gV_answer31.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer31.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER32*/
        GestureDetector.SimpleOnGestureListener gL_answer32 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER32);
        final GestureDetector gD_answer32 = new GestureDetector(getActivity(), gL_answer32);
        gV_answer32.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer32.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER41*/
        GestureDetector.SimpleOnGestureListener gL_answer41 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER41);
        final GestureDetector gD_answer41 = new GestureDetector(getActivity(), gL_answer41);
        gV_answer41.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer41.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER42*/
        GestureDetector.SimpleOnGestureListener gL_answer42 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER42);
        final GestureDetector gD_answer42 = new GestureDetector(getActivity(), gL_answer42);
        gV_answer42.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer42.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER51*/
        GestureDetector.SimpleOnGestureListener gL_answer51 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER51);
        final GestureDetector gD_answer51 = new GestureDetector(getActivity(), gL_answer51);
        gV_answer51.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer51.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER52*/
        GestureDetector.SimpleOnGestureListener gL_answer52 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER52);
        final GestureDetector gD_answer52 = new GestureDetector(getActivity(), gL_answer52);
        gV_answer52.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer52.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER61*/
        GestureDetector.SimpleOnGestureListener gL_answer61 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER61);
        final GestureDetector gD_answer61 = new GestureDetector(getActivity(), gL_answer61);
        gV_answer61.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer61.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER62*/
        GestureDetector.SimpleOnGestureListener gL_answer62 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER62);
        final GestureDetector gD_answer62 = new GestureDetector(getActivity(), gL_answer62);
        gV_answer62.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer62.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER71*/
        GestureDetector.SimpleOnGestureListener gL_answer71 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER71);
        final GestureDetector gD_answer71 = new GestureDetector(getActivity(), gL_answer71);
        gV_answer71.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer71.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER72*/
        GestureDetector.SimpleOnGestureListener gL_answer72 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER72);
        final GestureDetector gD_answer72 = new GestureDetector(getActivity(), gL_answer72);
        gV_answer72.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer72.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER81*/
        GestureDetector.SimpleOnGestureListener gL_answer81 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER81);
        final GestureDetector gD_answer81 = new GestureDetector(getActivity(), gL_answer81);
        gV_answer81.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer81.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*CHECKBOX_ACTIVITY_ANSWER82*/
        GestureDetector.SimpleOnGestureListener gL_answer82 = new GestureListener(CHECKBOX_ACTIVITY_ANSWER82);
        final GestureDetector gD_answer82 = new GestureDetector(getActivity(), gL_answer82);
        gV_answer82.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer82.onTouchEvent(motionEvent);
                return false;
            }
        });


        /*checkbox_ACTIVITY_NEXT_BUTTON*/
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(CHECKBOX_ACTIVITY_NEXT_BUTTON);
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
