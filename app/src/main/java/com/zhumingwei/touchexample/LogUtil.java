package com.zhumingwei.touchexample;

import android.util.Log;
import android.view.MotionEvent;

/**
 * @author zhumingwei
 * @date 2019/3/19 下午7:16
 * @email zdf312192599@163.com
 */
public class LogUtil {
    //type 0为dispatch 1为touch
    public static void logtouch(String form,int type,int action){
        StringBuilder stringBuilder = new StringBuilder(form);
        stringBuilder.append(" | ");
        if (type == 0){
            stringBuilder.append("dispatchTouchEvent");
        }else if (type == 1){
            stringBuilder.append("onTouchEvent");
        }else if(type ==2){
            stringBuilder.append("onInterceptTouchEvent");
        }
        stringBuilder.append(" --> ");
        final int actionMasked = action & MotionEvent.ACTION_MASK;
        switch (actionMasked){
            case MotionEvent.ACTION_DOWN:{
                stringBuilder.append("ACTION_DOWN");
                break;
            }
            case MotionEvent.ACTION_UP:{
                stringBuilder.append("ACTION_UP");
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                stringBuilder.append("ACTION_MOVE");
                break;
            }
            case MotionEvent.ACTION_CANCEL:{
                stringBuilder.append("ACTION_CANCEL");
                break;
            }
        }

        Log.d("Main",stringBuilder.toString());
    }
}
