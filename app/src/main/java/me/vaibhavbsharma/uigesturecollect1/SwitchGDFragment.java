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


public class SwitchGDFragment extends Fragment{
    private final String SWITCH_ACTIVITY_NEXT_BUTTON="switch_activity_next_button";

    private final String SWITCH_ACTIVITY_ANSWER1="switch_answer1";

    private final String SWITCH_ACTIVITY_ANSWER2="switch_answer2";

    private final String SWITCH_ACTIVITY_ANSWER3="switch_answer3";

    private final String SWITCH_ACTIVITY_ANSWER4="switch_answer4";

    private final String SWITCH_ACTIVITY_ANSWER5="switch_answer5";

    private final String SWITCH_ACTIVITY_ANSWER6="switch_answer6";

    private final String SWITCH_ACTIVITY_ANSWER7="switch_answer7";

    private final String SWITCH_ACTIVITY_ANSWER8="switch_answer8";

    private final String SWITCH_ACTIVITY_ANSWER9="switch_answer9";

    private final String SWITCH_ACTIVITY_ANSWER10="switch_answer10";

    private final String SWITCH_ACTIVITY_ANSWER11="switch_answer11";

    private final String SWITCH_ACTIVITY_ANSWER12="switch_answer12";

    private final String SWITCH_ACTIVITY_ANSWER13="switch_answer13";

    private final String SWITCH_ACTIVITY_ANSWER14="switch_answer14";

    private final String SWITCH_ACTIVITY_ANSWER15="switch_answer15";

    private final String SWITCH_ACTIVITY_ANSWER16="switch_answer16";

    private final String SWITCH_ACTIVITY_ANSWER17="switch_answer17";

    private final String SWITCH_ACTIVITY_ANSWER18="switch_answer18";

    private final String SWITCH_ACTIVITY_ANSWER19="switch_answer19";

    private final String SWITCH_ACTIVITY_ANSWER20="switch_answer20";


    public SwitchGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View gV_next_button = getActivity().findViewById(R.id.switchactivity_button);

        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);


        /*switch_ACTIVITY_NEXT_BUTTON*/
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(SWITCH_ACTIVITY_NEXT_BUTTON);
        final GestureDetector gD_next_button = new GestureDetector(getActivity(), gL_next_button);
        gV_next_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_next_button.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer11 = getActivity().findViewById(R.id.switch_answer1);

        gV_answer11.setClickable(true);
        gV_answer11.setFocusable(true);;

        /*SWITCH_ACTIVITY_ANSWER11*/
        GestureDetector.SimpleOnGestureListener gL_answer11 = new GestureListener(SWITCH_ACTIVITY_ANSWER1);
        final GestureDetector gD_answer11 = new GestureDetector(getActivity(), gL_answer11);
        gV_answer11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer11.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer21 = getActivity().findViewById(R.id.switch_answer2);

        gV_answer21.setClickable(true);
        gV_answer21.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER21*/
        GestureDetector.SimpleOnGestureListener gL_answer21 = new GestureListener(SWITCH_ACTIVITY_ANSWER2);
        final GestureDetector gD_answer21 = new GestureDetector(getActivity(), gL_answer21);
        gV_answer21.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer21.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer31 = getActivity().findViewById(R.id.switch_answer3);

        gV_answer31.setClickable(true);
        gV_answer31.setFocusable(true);


        /*SWITCH_ACTIVITY_ANSWER31*/
        GestureDetector.SimpleOnGestureListener gL_answer31 = new GestureListener(SWITCH_ACTIVITY_ANSWER3);
        final GestureDetector gD_answer31 = new GestureDetector(getActivity(), gL_answer31);
        gV_answer31.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer31.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer41 = getActivity().findViewById(R.id.switch_answer4);

        gV_answer41.setClickable(true);
        gV_answer41.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER41*/
        GestureDetector.SimpleOnGestureListener gL_answer41 = new GestureListener(SWITCH_ACTIVITY_ANSWER4);
        final GestureDetector gD_answer41 = new GestureDetector(getActivity(), gL_answer41);
        gV_answer41.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer41.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer51 = getActivity().findViewById(R.id.switch_answer5);

        gV_answer51.setClickable(true);
        gV_answer51.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER51*/
        GestureDetector.SimpleOnGestureListener gL_answer51 = new GestureListener(SWITCH_ACTIVITY_ANSWER5);
        final GestureDetector gD_answer51 = new GestureDetector(getActivity(), gL_answer51);
        gV_answer51.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer51.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer61 = getActivity().findViewById(R.id.switch_answer6);

        gV_answer61.setClickable(true);
        gV_answer61.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER61*/
        GestureDetector.SimpleOnGestureListener gL_answer61 = new GestureListener(SWITCH_ACTIVITY_ANSWER6);
        final GestureDetector gD_answer61 = new GestureDetector(getActivity(), gL_answer61);
        gV_answer61.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer61.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer71 = getActivity().findViewById(R.id.switch_answer7);

        gV_answer71.setClickable(true);
        gV_answer71.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER71*/
        GestureDetector.SimpleOnGestureListener gL_answer71 = new GestureListener(SWITCH_ACTIVITY_ANSWER7);
        final GestureDetector gD_answer71 = new GestureDetector(getActivity(), gL_answer71);
        gV_answer71.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer71.onTouchEvent(motionEvent);
                return false;
            }
        });




        View gV_answer81 = getActivity().findViewById(R.id.switch_answer8);

        gV_answer81.setClickable(true);
        gV_answer81.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER81*/
        GestureDetector.SimpleOnGestureListener gL_answer81 = new GestureListener(SWITCH_ACTIVITY_ANSWER8);
        final GestureDetector gD_answer81 = new GestureDetector(getActivity(), gL_answer81);
        gV_answer81.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer81.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer91 = getActivity().findViewById(R.id.switch_answer9);

        gV_answer91.setClickable(true);
        gV_answer91.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER91*/
        GestureDetector.SimpleOnGestureListener gL_answer91 = new GestureListener(SWITCH_ACTIVITY_ANSWER9);
        final GestureDetector gD_answer91 = new GestureDetector(getActivity(), gL_answer91);
        gV_answer91.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer91.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer101 = getActivity().findViewById(R.id.switch_answer10);

        gV_answer101.setClickable(true);
        gV_answer101.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER101*/
        GestureDetector.SimpleOnGestureListener gL_answer101 = new GestureListener(SWITCH_ACTIVITY_ANSWER10);
        final GestureDetector gD_answer101 = new GestureDetector(getActivity(), gL_answer101);
        gV_answer101.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer101.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer111 = getActivity().findViewById(R.id.switch_answer11);

        gV_answer111.setClickable(true);
        gV_answer111.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER111*/
        GestureDetector.SimpleOnGestureListener gL_answer111 = new GestureListener(SWITCH_ACTIVITY_ANSWER11);
        final GestureDetector gD_answer111 = new GestureDetector(getActivity(), gL_answer111);
        gV_answer111.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer111.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer121 = getActivity().findViewById(R.id.switch_answer12);

        gV_answer121.setClickable(true);
        gV_answer121.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER121*/
        GestureDetector.SimpleOnGestureListener gL_answer121 = new GestureListener(SWITCH_ACTIVITY_ANSWER12);
        final GestureDetector gD_answer121 = new GestureDetector(getActivity(), gL_answer121);
        gV_answer121.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer121.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer131 = getActivity().findViewById(R.id.switch_answer13);

        gV_answer131.setClickable(true);
        gV_answer131.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER131*/
        GestureDetector.SimpleOnGestureListener gL_answer131 = new GestureListener(SWITCH_ACTIVITY_ANSWER13);
        final GestureDetector gD_answer131 = new GestureDetector(getActivity(), gL_answer131);
        gV_answer131.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer131.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer141 = getActivity().findViewById(R.id.switch_answer14);

        gV_answer141.setClickable(true);
        gV_answer141.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER141*/
        GestureDetector.SimpleOnGestureListener gL_answer141 = new GestureListener(SWITCH_ACTIVITY_ANSWER14);
        final GestureDetector gD_answer141 = new GestureDetector(getActivity(), gL_answer141);
        gV_answer141.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer141.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer151 = getActivity().findViewById(R.id.switch_answer15);

        gV_answer151.setClickable(true);
        gV_answer151.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER151*/
        GestureDetector.SimpleOnGestureListener gL_answer151 = new GestureListener(SWITCH_ACTIVITY_ANSWER15);
        final GestureDetector gD_answer151 = new GestureDetector(getActivity(), gL_answer151);
        gV_answer151.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer151.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer161 = getActivity().findViewById(R.id.switch_answer16);

        gV_answer161.setClickable(true);
        gV_answer161.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER161*/
        GestureDetector.SimpleOnGestureListener gL_answer161 = new GestureListener(SWITCH_ACTIVITY_ANSWER16);
        final GestureDetector gD_answer161 = new GestureDetector(getActivity(), gL_answer161);
        gV_answer161.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer161.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer171 = getActivity().findViewById(R.id.switch_answer17);

        gV_answer171.setClickable(true);
        gV_answer171.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER171*/
        GestureDetector.SimpleOnGestureListener gL_answer171 = new GestureListener(SWITCH_ACTIVITY_ANSWER17);
        final GestureDetector gD_answer171 = new GestureDetector(getActivity(), gL_answer171);
        gV_answer171.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer171.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer181 = getActivity().findViewById(R.id.switch_answer18);

        gV_answer181.setClickable(true);
        gV_answer181.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER181*/
        GestureDetector.SimpleOnGestureListener gL_answer181 = new GestureListener(SWITCH_ACTIVITY_ANSWER18);
        final GestureDetector gD_answer181 = new GestureDetector(getActivity(), gL_answer181);
        gV_answer181.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer181.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer191 = getActivity().findViewById(R.id.switch_answer19);

        gV_answer191.setClickable(true);
        gV_answer191.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER191*/
        GestureDetector.SimpleOnGestureListener gL_answer191 = new GestureListener(SWITCH_ACTIVITY_ANSWER19);
        final GestureDetector gD_answer191 = new GestureDetector(getActivity(), gL_answer191);
        gV_answer191.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer191.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer201 = getActivity().findViewById(R.id.switch_answer20);

        gV_answer201.setClickable(true);
        gV_answer201.setFocusable(true);

        /*SWITCH_ACTIVITY_ANSWER201*/
        GestureDetector.SimpleOnGestureListener gL_answer201 = new GestureListener(SWITCH_ACTIVITY_ANSWER20);
        final GestureDetector gD_answer201 = new GestureDetector(getActivity(), gL_answer201);
        gV_answer201.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer201.onTouchEvent(motionEvent);
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
