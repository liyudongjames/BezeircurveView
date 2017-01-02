package com.liyudong.home.beisaierdemo;

import android.content.Context;

/**
 * Created by liyudongjames on 2017/1/2.
 */
public class DensityUtil {

    public static float dip2px(Context context,float dpValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (dpValue * scale + 0.5f);
    }

    public static float sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (spValue * fontScale + 0.5f);
    }
}
