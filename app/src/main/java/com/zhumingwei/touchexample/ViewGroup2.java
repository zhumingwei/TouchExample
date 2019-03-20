package com.zhumingwei.touchexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * @author zhumingwei
 * @date 2019/3/19 下午7:13
 * @email zdf312192599@163.com
 */
public class ViewGroup2 extends FrameLayout {
    public ViewGroup2(Context context) {
        super(context);
    }

    public ViewGroup2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroup2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN) {
            LogUtil.logtouch("ViewGroup2", 0, ev.getAction());
        }
        if(ev.getAction()==MotionEvent.ACTION_MOVE) {
            LogUtil.logtouch("ViewGroup2", 0, ev.getAction());
        }
        if(ev.getAction()==MotionEvent.ACTION_UP) {
            LogUtil.logtouch("ViewGroup2", 0, ev.getAction());
        }

        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_MOVE) {
            LogUtil.logtouch("ViewGroup2", 3, event.getAction());
            return true;
        }

        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN) {
            LogUtil.logtouch("ViewGroup2", 1, event.getAction());

        }
        if (event.getAction()==MotionEvent.ACTION_UP){
            LogUtil.logtouch("ViewGroup2", 1, event.getAction());
        }
        if (event.getAction()==MotionEvent.ACTION_MOVE){
            LogUtil.logtouch("ViewGroup2", 1, event.getAction());
        }
        if (event.getAction()==MotionEvent.ACTION_CANCEL){
            LogUtil.logtouch("ViewGroup2", 1, event.getAction());
        }
        return super.onTouchEvent(event);
    }
}
