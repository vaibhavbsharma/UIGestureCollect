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


public class PickerGDFragment extends Fragment{
    private final String PICKER_ACTIVITY_NEXT_BUTTON="picker_activity_next_button";

    private final String PICKER_ACTIVITY_ANSWER1="number_picker1";

    private final String PICKER_ACTIVITY_ANSWER2="number_picker2";

    private final String PICKER_ACTIVITY_ANSWER3="number_picker3";

    private final String PICKER_ACTIVITY_ANSWER4="number_picker4";

    private final String PICKER_ACTIVITY_ANSWER5="number_picker5";

    private final String PICKER_ACTIVITY_ANSWER6="number_picker6";

    private final String PICKER_ACTIVITY_ANSWER7="number_picker7";

    private final String PICKER_ACTIVITY_ANSWER8="number_picker8";

    private final String PICKER_ACTIVITY_ANSWER9="number_picker9";

    private final String PICKER_ACTIVITY_ANSWER10="number_picker10";


    public PickerGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View gV_next_button = getActivity().findViewById(R.id.pickeractivity_button);

        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);


        /*picker_ACTIVITY_NEXT_BUTTON*/
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(PICKER_ACTIVITY_NEXT_BUTTON);
        final GestureDetector gD_next_button = new GestureDetector(getActivity(), gL_next_button);
        gV_next_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_next_button.onTouchEvent(motionEvent);
                return false;
            }
        });

        View gV_answer11 = getActivity().findViewById(R.id.numberPicker1);

        gV_answer11.setClickable(true);
        gV_answer11.setFocusable(true);;

        /*PICKER_ACTIVITY_ANSWER11*/
        GestureDetector.SimpleOnGestureListener gL_answer11 = new GestureListener(PICKER_ACTIVITY_ANSWER1);
        final GestureDetector gD_answer11 = new GestureDetector(getActivity(), gL_answer11);
        gV_answer11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer11.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer21 = getActivity().findViewById(R.id.numberPicker2);

        gV_answer21.setClickable(true);
        gV_answer21.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER21*/
        GestureDetector.SimpleOnGestureListener gL_answer21 = new GestureListener(PICKER_ACTIVITY_ANSWER2);
        final GestureDetector gD_answer21 = new GestureDetector(getActivity(), gL_answer21);
        gV_answer21.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer21.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer31 = getActivity().findViewById(R.id.numberPicker3);

        gV_answer31.setClickable(true);
        gV_answer31.setFocusable(true);


        /*PICKER_ACTIVITY_ANSWER31*/
        GestureDetector.SimpleOnGestureListener gL_answer31 = new GestureListener(PICKER_ACTIVITY_ANSWER3);
        final GestureDetector gD_answer31 = new GestureDetector(getActivity(), gL_answer31);
        gV_answer31.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer31.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer41 = getActivity().findViewById(R.id.numberPicker4);

        gV_answer41.setClickable(true);
        gV_answer41.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER41*/
        GestureDetector.SimpleOnGestureListener gL_answer41 = new GestureListener(PICKER_ACTIVITY_ANSWER4);
        final GestureDetector gD_answer41 = new GestureDetector(getActivity(), gL_answer41);
        gV_answer41.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer41.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer51 = getActivity().findViewById(R.id.numberPicker5);

        gV_answer51.setClickable(true);
        gV_answer51.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER51*/
        GestureDetector.SimpleOnGestureListener gL_answer51 = new GestureListener(PICKER_ACTIVITY_ANSWER5);
        final GestureDetector gD_answer51 = new GestureDetector(getActivity(), gL_answer51);
        gV_answer51.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer51.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer61 = getActivity().findViewById(R.id.numberPicker6);

        gV_answer61.setClickable(true);
        gV_answer61.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER61*/
        GestureDetector.SimpleOnGestureListener gL_answer61 = new GestureListener(PICKER_ACTIVITY_ANSWER6);
        final GestureDetector gD_answer61 = new GestureDetector(getActivity(), gL_answer61);
        gV_answer61.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer61.onTouchEvent(motionEvent);
                return false;
            }
        });



        View gV_answer71 = getActivity().findViewById(R.id.numberPicker7);

        gV_answer71.setClickable(true);
        gV_answer71.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER71*/
        GestureDetector.SimpleOnGestureListener gL_answer71 = new GestureListener(PICKER_ACTIVITY_ANSWER7);
        final GestureDetector gD_answer71 = new GestureDetector(getActivity(), gL_answer71);
        gV_answer71.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer71.onTouchEvent(motionEvent);
                return false;
            }
        });




        View gV_answer81 = getActivity().findViewById(R.id.numberPicker8);

        gV_answer81.setClickable(true);
        gV_answer81.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER81*/
        GestureDetector.SimpleOnGestureListener gL_answer81 = new GestureListener(PICKER_ACTIVITY_ANSWER8);
        final GestureDetector gD_answer81 = new GestureDetector(getActivity(), gL_answer81);
        gV_answer81.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer81.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer91 = getActivity().findViewById(R.id.numberPicker9);

        gV_answer91.setClickable(true);
        gV_answer91.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER91*/
        GestureDetector.SimpleOnGestureListener gL_answer91 = new GestureListener(PICKER_ACTIVITY_ANSWER9);
        final GestureDetector gD_answer91 = new GestureDetector(getActivity(), gL_answer91);
        gV_answer91.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_answer91.onTouchEvent(motionEvent);
                return false;
            }
        });


        View gV_answer101 = getActivity().findViewById(R.id.numberPicker10);

        gV_answer101.setClickable(true);
        gV_answer101.setFocusable(true);

        /*PICKER_ACTIVITY_ANSWER101*/
        GestureDetector.SimpleOnGestureListener gL_answer101 = new GestureListener(PICKER_ACTIVITY_ANSWER10);
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
