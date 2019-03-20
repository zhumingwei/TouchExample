package com.zhumingwei.touchexample;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author zhumingwei
 * @date 2019/3/19 下午7:20
 * @email zdf312192599@163.com
 */
public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context,  @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(200,200);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction()==MotionEvent.ACTION_DOWN) {
            LogUtil.logtouch("View", 0, ev.getAction());
        }
        if (ev.getAction()==MotionEvent.ACTION_UP){
            LogUtil.logtouch("View", 0, ev.getAction());
        }
        if (ev.getAction()==MotionEvent.ACTION_MOVE){
            LogUtil.logtouch("View", 0, ev.getAction());
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN) {
            LogUtil.logtouch("View", 1, event.getAction());
            return true;
        }
        if (event.getAction()==MotionEvent.ACTION_UP){
            LogUtil.logtouch("View", 1, event.getAction());
        }
        if (event.getAction()==MotionEvent.ACTION_MOVE){
            LogUtil.logtouch("View", 1, event.getAction());
        }
        if (event.getAction()==MotionEvent.ACTION_CANCEL){
            LogUtil.logtouch("View", 1, event.getAction());
        }
        return super.onTouchEvent(event);
    }
}
