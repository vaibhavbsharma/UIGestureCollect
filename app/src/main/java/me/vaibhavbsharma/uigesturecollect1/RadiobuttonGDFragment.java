package me.vaibhavbsharma.uigesturecollect1;
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


public class RadiobuttonGDFragment extends Fragment{
    private final String RADIO_ACTIVITY="radiobutton_activity";
    private final String RADIOBUTTON_ACTIVITY_NEXT_BUTTON="radiobutton_activity_next_button";

    private final String RADIOBUTTON_ACTIVITY_ANSWER11="radiobutton_answer11";
    private final String RADIOBUTTON_ACTIVITY_ANSWER12="radiobutton_answer12";

    private final String RADIOBUTTON_ACTIVITY_ANSWER21="radiobutton_answer21";
    private final String RADIOBUTTON_ACTIVITY_ANSWER22="radiobutton_answer22";

    private final String RADIOBUTTON_ACTIVITY_ANSWER31="radiobutton_answer31";
    private final String RADIOBUTTON_ACTIVITY_ANSWER32="radiobutton_answer32";

    private final String RADIOBUTTON_ACTIVITY_ANSWER41="radiobutton_answer41";
    private final String RADIOBUTTON_ACTIVITY_ANSWER42="radiobutton_answer42";

    private final String RADIOBUTTON_ACTIVITY_ANSWER51="radiobutton_answer51";
    private final String RADIOBUTTON_ACTIVITY_ANSWER52="radiobutton_answer52";

    private final String RADIOBUTTON_ACTIVITY_ANSWER61="radiobutton_answer61";
    private final String RADIOBUTTON_ACTIVITY_ANSWER62="radiobutton_answer62";

    private final String RADIOBUTTON_ACTIVITY_ANSWER71="radiobutton_answer71";
    private final String RADIOBUTTON_ACTIVITY_ANSWER72="radiobutton_answer72";

    private final String RADIOBUTTON_ACTIVITY_ANSWER81="radiobutton_answer81";
    private final String RADIOBUTTON_ACTIVITY_ANSWER82="radiobutton_answer82";

    private final String RADIOBUTTON_ACTIVITY_ANSWER91="radiobutton_answer91";
    private final String RADIOBUTTON_ACTIVITY_ANSWER92="radiobutton_answer92";

    private final String RADIOBUTTON_ACTIVITY_ANSWER101="radiobutton_answer101";
    private final String RADIOBUTTON_ACTIVITY_ANSWER102="radiobutton_answer102";


    public RadiobuttonGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //View gV_radiobutton_activity = getActivity().findViewById(R.id.radiobutton_activity);

        View gV_next_button = getActivity().findViewById(R.id.radiobuttonactivity_button);

        //gV_radiobutton_activity.setClickable(true);
        //gV_radiobutton_activity.setFocusable(true);

        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);


        /*radiobutton_ACTIVITY_NEXT_BUTTON*/
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(RADIOBUTTON_ACTIVITY_NEXT_BUTTON);
        final GestureDetector gD_next_button = new GestureDetector(getActivity(), gL_next_button);
        gV_next_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_next_button.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer11 = getActivity().findViewById(R.id.RadioButton_answer11);
        View gV_answer12 = getActivity().findViewById(R.id.RadioButton_answer12);

        gV_answer11.setClickable(true);
        gV_answer11.setFocusable(true);

        gV_answer12.setClickable(true);
        gV_answer12.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER11*/
        GestureDetector.SimpleOnGestureListener gL_answer11 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER11);
        final GestureDetector gD_answer11 = new GestureDetector(getActivity(), gL_answer11);
        gV_answer11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer11.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER12*/
        GestureDetector.SimpleOnGestureListener gL_answer12 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER12);
        final GestureDetector gD_answer12 = new GestureDetector(getActivity(), gL_answer12);
        gV_answer12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer12.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer21 = getActivity().findViewById(R.id.RadioButton_answer21);
        View gV_answer22 = getActivity().findViewById(R.id.RadioButton_answer22);

        gV_answer21.setClickable(true);
        gV_answer21.setFocusable(true);

        gV_answer22.setClickable(true);
        gV_answer22.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER21*/
        GestureDetector.SimpleOnGestureListener gL_answer21 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER21);
        final GestureDetector gD_answer21 = new GestureDetector(getActivity(), gL_answer21);
        gV_answer21.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer21.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER22*/
        GestureDetector.SimpleOnGestureListener gL_answer22 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER22);
        final GestureDetector gD_answer22 = new GestureDetector(getActivity(), gL_answer22);
        gV_answer22.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer22.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer31 = getActivity().findViewById(R.id.RadioButton_answer31);
        View gV_answer32 = getActivity().findViewById(R.id.RadioButton_answer32);

        gV_answer31.setClickable(true);
        gV_answer31.setFocusable(true);

        gV_answer32.setClickable(true);
        gV_answer32.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER31*/
        GestureDetector.SimpleOnGestureListener gL_answer31 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER31);
        final GestureDetector gD_answer31 = new GestureDetector(getActivity(), gL_answer31);
        gV_answer31.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer31.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER32*/
        GestureDetector.SimpleOnGestureListener gL_answer32 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER32);
        final GestureDetector gD_answer32 = new GestureDetector(getActivity(), gL_answer32);
        gV_answer32.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer32.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer41 = getActivity().findViewById(R.id.RadioButton_answer41);
        View gV_answer42 = getActivity().findViewById(R.id.RadioButton_answer42);

        gV_answer41.setClickable(true);
        gV_answer41.setFocusable(true);

        gV_answer42.setClickable(true);
        gV_answer42.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER41*/
        GestureDetector.SimpleOnGestureListener gL_answer41 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER41);
        final GestureDetector gD_answer41 = new GestureDetector(getActivity(), gL_answer41);
        gV_answer41.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer41.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER42*/
        GestureDetector.SimpleOnGestureListener gL_answer42 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER42);
        final GestureDetector gD_answer42 = new GestureDetector(getActivity(), gL_answer42);
        gV_answer42.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer42.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer51 = getActivity().findViewById(R.id.RadioButton_answer51);
        View gV_answer52 = getActivity().findViewById(R.id.RadioButton_answer52);

        gV_answer51.setClickable(true);
        gV_answer51.setFocusable(true);

        gV_answer52.setClickable(true);
        gV_answer52.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER51*/
        GestureDetector.SimpleOnGestureListener gL_answer51 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER51);
        final GestureDetector gD_answer51 = new GestureDetector(getActivity(), gL_answer51);
        gV_answer51.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer51.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER52*/
        GestureDetector.SimpleOnGestureListener gL_answer52 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER52);
        final GestureDetector gD_answer52 = new GestureDetector(getActivity(), gL_answer52);
        gV_answer52.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer52.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer61 = getActivity().findViewById(R.id.RadioButton_answer61);
        View gV_answer62 = getActivity().findViewById(R.id.RadioButton_answer62);

        gV_answer61.setClickable(true);
        gV_answer61.setFocusable(true);

        gV_answer62.setClickable(true);
        gV_answer62.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER61*/
        GestureDetector.SimpleOnGestureListener gL_answer61 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER61);
        final GestureDetector gD_answer61 = new GestureDetector(getActivity(), gL_answer61);
        gV_answer61.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer61.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER62*/
        GestureDetector.SimpleOnGestureListener gL_answer62 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER62);
        final GestureDetector gD_answer62 = new GestureDetector(getActivity(), gL_answer62);
        gV_answer62.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer62.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer71 = getActivity().findViewById(R.id.RadioButton_answer71);
        View gV_answer72 = getActivity().findViewById(R.id.RadioButton_answer72);

        gV_answer71.setClickable(true);
        gV_answer71.setFocusable(true);

        gV_answer72.setClickable(true);
        gV_answer72.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER71*/
        GestureDetector.SimpleOnGestureListener gL_answer71 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER71);
        final GestureDetector gD_answer71 = new GestureDetector(getActivity(), gL_answer71);
        gV_answer71.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer71.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER72*/
        GestureDetector.SimpleOnGestureListener gL_answer72 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER72);
        final GestureDetector gD_answer72 = new GestureDetector(getActivity(), gL_answer72);
        gV_answer72.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer72.onTouchEvent(motionEvent);
                return false;
            }
        });




        View gV_answer81 = getActivity().findViewById(R.id.RadioButton_answer81);
        View gV_answer82 = getActivity().findViewById(R.id.RadioButton_answer82);

        gV_answer81.setClickable(true);
        gV_answer81.setFocusable(true);

        gV_answer82.setClickable(true);
        gV_answer82.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER81*/
        GestureDetector.SimpleOnGestureListener gL_answer81 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER81);
        final GestureDetector gD_answer81 = new GestureDetector(getActivity(), gL_answer81);
        gV_answer81.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer81.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER82*/
        GestureDetector.SimpleOnGestureListener gL_answer82 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER82);
        final GestureDetector gD_answer82 = new GestureDetector(getActivity(), gL_answer82);
        gV_answer82.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer82.onTouchEvent(motionEvent);
                return false;
            }
        });




        View gV_answer91 = getActivity().findViewById(R.id.RadioButton_answer91);
        View gV_answer92 = getActivity().findViewById(R.id.RadioButton_answer92);

        gV_answer91.setClickable(true);
        gV_answer91.setFocusable(true);

        gV_answer92.setClickable(true);
        gV_answer92.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER91*/
        GestureDetector.SimpleOnGestureListener gL_answer91 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER91);
        final GestureDetector gD_answer91 = new GestureDetector(getActivity(), gL_answer91);
        gV_answer91.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer91.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER92*/
        GestureDetector.SimpleOnGestureListener gL_answer92 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER92);
        final GestureDetector gD_answer92 = new GestureDetector(getActivity(), gL_answer92);
        gV_answer92.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer92.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer101 = getActivity().findViewById(R.id.RadioButton_answer101);
        View gV_answer102 = getActivity().findViewById(R.id.RadioButton_answer102);

        gV_answer101.setClickable(true);
        gV_answer101.setFocusable(true);

        gV_answer102.setClickable(true);
        gV_answer102.setFocusable(true);

        /*RADIOBUTTON_ACTIVITY_ANSWER101*/
        GestureDetector.SimpleOnGestureListener gL_answer101 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER101);
        final GestureDetector gD_answer101 = new GestureDetector(getActivity(), gL_answer101);
        gV_answer101.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer101.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*RADIOBUTTON_ACTIVITY_ANSWER102*/
        GestureDetector.SimpleOnGestureListener gL_answer102 = new GestureListener(RADIOBUTTON_ACTIVITY_ANSWER102);
        final GestureDetector gD_answer102 = new GestureDetector(getActivity(), gL_answer102);
        gV_answer102.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer102.onTouchEvent(motionEvent);
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
