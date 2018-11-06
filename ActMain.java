-----------------------------------------------------------------
ActMain.java
-----------------------------------------------------------------
package com.example.iii.vibraterelaxer;

import android.app.Service;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActMain extends AppCompatActivity {


    private View.OnClickListener btnShortV_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Vibrator vibrator =(Vibrator)getApplication().getSystemService(Service.VIBRATOR_SERVICE);
            vibrator.vibrate(500);
            Log.i("ACT_DEMO","短震動");
        }

    };
    private View.OnClickListener btnShortCV_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Vibrator vibrator =(Vibrator)getApplication().getSystemService(Service.VIBRATOR_SERVICE);
            vibrator.vibrate(new long[]{100,500,100,500,100,500},2);
            Log.i("ACT_DEMO","連續短震動");
        }

    };
    private View.OnClickListener btnLongV_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Vibrator vibrator =(Vibrator)getApplication().getSystemService(Service.VIBRATOR_SERVICE);
            vibrator.vibrate(3000);
            Log.i("ACT_DEMO","長震動");
        }

    };
    private View.OnClickListener btnLongShortV_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Vibrator vibrator =(Vibrator)getApplication().getSystemService(Service.VIBRATOR_SERVICE);
            vibrator.vibrate(new long[]{100,2000,100,2000,100,2000,100,500,100,500},2);
            Log.i("ACT_DEMO","三長兩短震動");
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }

    private void InitialComponent() {

        btnShortV = findViewById(R.id.btnShortV);
        btnShortV.setOnClickListener(btnShortV_Click);
        btnShortCV = findViewById(R.id.btnShortCV);
        btnShortCV.setOnClickListener(btnShortCV_Click);
        btnLongV = findViewById(R.id.btnShortV);
        btnLongV.setOnClickListener(btnLongV_Click);
        btnLongShortV = findViewById(R.id.btnLongShortV);
        btnLongShortV.setOnClickListener(btnLongShortV_Click);


    }
    Button btnShortV;
    Button btnShortCV;
    Button btnLongV;
    Button btnLongShortV;
}


-------------------------------------------------------------------------
actMain.xml
-------------------------------------------------------------------------
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent">"
    <TextView
        android:text="歡迎使用舒壓小物"
        android:textSize="40sp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <Button
        android:id="@+id/btnShortV"
        android:text="短震動"
        android:textSize="40sp"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"/>

    <Button
        android:id="@+id/btnShortCV"
        android:text="連續短震動"
        android:textSize="40sp"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"/>

    <Button
        android:id="@+id/btnLongV"
        android:text="長震動"
        android:textSize="40sp"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"/>
    <Button
        android:id="@+id/btnLongShortV"
        android:text="三長二短震動"
        android:textSize="40sp"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"/>
</LinearLayout>
