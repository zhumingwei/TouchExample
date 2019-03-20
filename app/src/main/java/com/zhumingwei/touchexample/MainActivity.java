package com.zhumingwei.touchexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.zhumingwei.touchexample.LogUtil.logtouch;

public class MainActivity extends AppCompatActivity {
    ViewGroup1 viewGroup1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewGroup1 = findViewById(R.id.vg1);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        if(ev.getAction()==MotionEvent.ACTION_DOWN)
        logtouch("Activity",0,ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        if(event.getAction()==MotionEvent.ACTION_DOWN)
        logtouch("Activity",1,event.getAction());
        return super.onTouchEvent(event);
    }



}
