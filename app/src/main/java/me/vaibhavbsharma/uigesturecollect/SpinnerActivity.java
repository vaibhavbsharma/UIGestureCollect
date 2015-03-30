package me.vaibhavbsharma.uigesturecollect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.VelocityTrackerCompat;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SpinnerActivity extends FragmentActivity {
    public static final String TAG = "SpinnerActivity";
    private static final String SPINNER_ACTIVITY_NEXT_BUTTON = "spinneractivity_next_button";
    private VelocityTracker mVelocityTracker = null;
    public static final String FRAGTAG = "SpinnerGDFragment";
    PopupWindow popupWindow2;
    Button spinner2;

    PopupWindow popupWindow1;
    Button spinner1;

    PopupWindow popupWindow3;
    Button spinner3;

    PopupWindow popupWindow4;
    Button spinner4;

    PopupWindow popupWindow5;
    Button spinner5;

    PopupWindow popupWindow6;
    Button spinner6;

    PopupWindow popupWindow7;
    Button spinner7;

    PopupWindow popupWindow8;
    Button spinner8;

    PopupWindow popupWindow9;
    Button spinner9;

    PopupWindow popupWindow10;
    Button spinner10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Button nextButton = (Button) findViewById(R.id.spinneractivity_button);
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(SPINNER_ACTIVITY_NEXT_BUTTON);
        final GestureDetector gD_next_button = new GestureDetector(this, gL_next_button);
        nextButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_next_button.onTouchEvent(motionEvent);
                return false;
            }
        });

        popupWindow10 = popupWindow10();
        spinner10 = (Button) findViewById(R.id.spinner10);
        spinner10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner10:
                        // show the list view as dropdown
                        popupWindow10.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow9 = popupWindow9();
        spinner9 = (Button) findViewById(R.id.spinner9);
        spinner9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner9:
                        // show the list view as dropdown
                        popupWindow9.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow8 = popupWindow8();
        spinner8 = (Button) findViewById(R.id.spinner8);
        spinner8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner8:
                        // show the list view as dropdown
                        popupWindow8.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow7 = popupWindow7();
        spinner7 = (Button) findViewById(R.id.spinner7);
        spinner7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner7:
                        // show the list view as dropdown
                        popupWindow7.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow6 = popupWindow6();
        spinner6 = (Button) findViewById(R.id.spinner6);
        spinner6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner6:
                        // show the list view as dropdown
                        popupWindow6.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow5 = popupWindow5();
        spinner5 = (Button) findViewById(R.id.spinner5);
        spinner5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner5:
                        // show the list view as dropdown
                        popupWindow5.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow4 = popupWindow4();
        spinner4 = (Button) findViewById(R.id.spinner4);
        spinner4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner4:
                        // show the list view as dropdown
                        popupWindow4.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow3 = popupWindow3();
        spinner3 = (Button) findViewById(R.id.spinner3);
        spinner3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner3:
                        // show the list view as dropdown
                        popupWindow3.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow2 = popupWindow2();
        spinner2 = (Button) findViewById(R.id.spinner2);
        spinner2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner2:
                        // show the list view as dropdown
                        popupWindow2.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });

        popupWindow1 = popupWindow1();
        spinner1 = (Button) findViewById(R.id.spinner1);
        spinner1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.spinner1:
                        // show the list view as dropdown
                        popupWindow1.showAsDropDown(v, -5, 0);
                        break;
                }
            }
        });
    }

    public PopupWindow popupWindow10() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView10 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner10_array);
        listView10.setAdapter(Spinner10Adapter(popUpContents));
        listView10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg10) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow10.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner10.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow10 = new GestureListener("spinner10");
        final GestureDetector gD_popupWindow10 = new GestureDetector(this, gL_popupWindow10);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow10.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView10);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner10Adapter(String Spinner10Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner10Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow9() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView9 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner9_array);
        listView9.setAdapter(Spinner9Adapter(popUpContents));
        listView9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg9) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow9.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner9.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow9 = new GestureListener("spinner9");
        final GestureDetector gD_popupWindow9 = new GestureDetector(this, gL_popupWindow9);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow9.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView9);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner9Adapter(String Spinner9Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner9Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow8() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView8 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner8_array);
        listView8.setAdapter(Spinner8Adapter(popUpContents));
        listView8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg8) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow8.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner8.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow8 = new GestureListener("spinner8");
        final GestureDetector gD_popupWindow8 = new GestureDetector(this, gL_popupWindow8);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow8.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView8);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner8Adapter(String Spinner8Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner8Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow7() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView7 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner7_array);
        listView7.setAdapter(Spinner7Adapter(popUpContents));
        listView7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg7) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow7.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner7.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow7 = new GestureListener("spinner7");
        final GestureDetector gD_popupWindow7 = new GestureDetector(this, gL_popupWindow7);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow7.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView7);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner7Adapter(String Spinner7Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner7Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow6() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView6 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner6_array);
        listView6.setAdapter(Spinner6Adapter(popUpContents));
        listView6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg6) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow6.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner6.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow6 = new GestureListener("spinner6");
        final GestureDetector gD_popupWindow6 = new GestureDetector(this, gL_popupWindow6);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow6.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView6);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner6Adapter(String Spinner6Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner6Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow5() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView5 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner5_array);
        listView5.setAdapter(Spinner5Adapter(popUpContents));
        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg5) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow5.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner5.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow5 = new GestureListener("spinner5");
        final GestureDetector gD_popupWindow5 = new GestureDetector(this, gL_popupWindow5);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow5.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView5);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner5Adapter(String Spinner5Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner5Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow4() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView4 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner4_array);
        listView4.setAdapter(Spinner4Adapter(popUpContents));
        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg4) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow4.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner4.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow4 = new GestureListener("spinner4");
        final GestureDetector gD_popupWindow4 = new GestureDetector(this, gL_popupWindow4);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow4.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView4);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner4Adapter(String Spinner4Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner4Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow3() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView3 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner3_array);
        listView3.setAdapter(Spinner3Adapter(popUpContents));
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg3) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow3.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner3.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow3 = new GestureListener("spinner3");
        final GestureDetector gD_popupWindow3 = new GestureDetector(this, gL_popupWindow3);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow3.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView3);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner3Adapter(String Spinner3Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner3Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow1() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView1 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner1_array);
        listView1.setAdapter(Spinner1Adapter(popUpContents));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg1, long arg3) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow1.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner1.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow1 = new GestureListener("spinner1");
        final GestureDetector gD_popupWindow1 = new GestureDetector(this, gL_popupWindow1);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow1.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView1);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner1Adapter(String Spinner1Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner1Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }

    public PopupWindow popupWindow2() {
        PopupWindow popupWindow = new PopupWindow(this);
        ListView listView2 = new ListView(this);
        String popUpContents[]=getResources().getStringArray(R.array.spinner2_array);
        listView2.setAdapter(Spinner2Adapter(popUpContents));
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int arg2, long arg3) {
                SpinnerActivity spinnerActivity = ((SpinnerActivity) v.getContext());
                spinnerActivity.popupWindow2.dismiss();
                String selectedItemText = ((TextView) v).getText().toString();
                spinnerActivity.spinner2.setText(selectedItemText);
            }
        });
        popupWindow.setFocusable(true);
        popupWindow.setWidth(250);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        GestureDetector.SimpleOnGestureListener gL_popupWindow2 = new GestureListener("spinner2");
        final GestureDetector gD_popupWindow2 = new GestureDetector(this, gL_popupWindow2);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_popupWindow2.onTouchEvent(motionEvent);
                return false;
            }
        });
        popupWindow.setContentView(listView2);
        return popupWindow;
    }

    private ArrayAdapter<String> Spinner2Adapter(String Spinner2Array[]) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Spinner2Array) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String text = getItem(position);
                TextView listItem = new TextView(SpinnerActivity.this);
                listItem.setText(text);
                listItem.setTextSize(22);
                listItem.setPadding(10, 10, 10, 10);
                listItem.setTextColor(Color.WHITE);
                return listItem;
            }
        };
        return adapter;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_spinner, menu);
        MenuItem subjectNumber = menu.findItem(R.id.subject_number);
        String filename = "SubjectNumber.txt";
        int subjNumber=-1;

        File file = new File(getApplicationContext().getFilesDir(),filename);
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                android.util.Log.i(TAG, "read: " + line);
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
    protected void onStart(){
        super.onStart();
        android.util.Log.i(TAG, "onStart called at " + SystemClock.uptimeMillis());
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i(TAG, "onStop called at " + SystemClock.uptimeMillis());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i(TAG, "onRestart called at " + SystemClock.uptimeMillis());
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*// Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);*/
        return true;
    }

    /* Called when the user clicks the Next button */
    public void startPickerActivity(View view) {
        android.util.Log.i(TAG, "startPickerActivity called");
        Intent intent = new Intent(this, PickerActivity.class);
        startActivity(intent);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        android.util.Log.i(TAG, "dispatchTouchEvent called");
        int index = event.getActionIndex();
        int action = event.getActionMasked();
        int pointerId = event.getPointerId(index);
        int historySize;
        int pointerCount;

        switch(action) {
            case MotionEvent.ACTION_DOWN:
                android.util.Log.i(TAG, "ACTION_DOWN at time = " + SystemClock.uptimeMillis());
                historySize = event.getHistorySize();
                pointerCount = event.getPointerCount();
                for (int h = 0; h < historySize; h++) {
                    System.out.printf("At time %d:", event.getHistoricalEventTime(h));
                    for (int p = 0; p < pointerCount; p++) {
                        android.util.Log.i(TAG, "  pointer " +
                                event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                                " " + event.getPressure(p) + " " + event.getOrientation(p) + " " + event.getSize());
                    }
                }
                android.util.Log.i(TAG, "At time " + event.getEventTime());
                for (int p = 0; p < pointerCount; p++) {
                    android.util.Log.i(TAG, "  pointer " +
                            event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                            " " + event.getPressure(p) + " " + event.getOrientation(p) + " " + event.getSize());
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
                android.util.Log.i(TAG, "ACTION_MOVE at time = " + SystemClock.uptimeMillis());
                mVelocityTracker.addMovement(event);
                // When you want to determine the velocity, call
                // computeCurrentVelocity(). Then call getXVelocity()
                // and getYVelocity() to retrieve the velocity for each pointer ID.
                mVelocityTracker.computeCurrentVelocity(1000);
                // Log velocity of pixels per second
                // Best practice to use VelocityTrackerCompat where possible.
                android.util.Log.d("", "X velocity: " +
                        VelocityTrackerCompat.getXVelocity(mVelocityTracker,
                                pointerId));
                android.util.Log.d("", "Y velocity: " +
                        VelocityTrackerCompat.getYVelocity(mVelocityTracker,
                                pointerId));

                historySize = event.getHistorySize();
                pointerCount = event.getPointerCount();
                for (int h = 0; h < historySize; h++) {
                    System.out.printf("At time %d:", event.getHistoricalEventTime(h));
                    for (int p = 0; p < pointerCount; p++) {
                        android.util.Log.i(TAG, "  pointer " +
                                event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                                " " + event.getPressure(p) + " " + event.getOrientation(p) + " " + event.getSize());
                    }
                }
                android.util.Log.i(TAG, "At time " + event.getEventTime());
                for (int p = 0; p < pointerCount; p++) {
                    android.util.Log.i(TAG, "  pointer " +
                            event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                            " " + event.getPressure(p) + " " + event.getOrientation(p) + " " + event.getSize());
                }

                break;
            case MotionEvent.ACTION_UP:
                android.util.Log.i(TAG, "ACTION_UP at time = " + SystemClock.uptimeMillis());
                historySize = event.getHistorySize();
                pointerCount = event.getPointerCount();
                for (int h = 0; h < historySize; h++) {
                    System.out.printf("At time %d:", event.getHistoricalEventTime(h));
                    for (int p = 0; p < pointerCount; p++) {
                        android.util.Log.i(TAG, "  pointer " +
                                event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                                " " + event.getPressure(p) + " " + event.getOrientation(p) + " " + event.getSize());
                    }
                }
                android.util.Log.i(TAG, "At time " + event.getEventTime());
                for (int p = 0; p < pointerCount; p++) {
                    android.util.Log.i(TAG, "  pointer " +
                            event.getPointerId(p) + " " + event.getX(p) + " " + event.getY(p) +
                            " " + event.getPressure(p) + " " + event.getOrientation(p) + " " + event.getSize());
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
