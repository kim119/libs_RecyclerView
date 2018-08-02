package com.mj.libs_recyclerview;

import android.content.Context;

/**
 * Created by kim on 2018/8/2.
 */

public class Utils {
        /**
     *  dp 转换 px
     * @param context
     * @param dip
     * @return
     */
    public static int dpToPx(Context context, float dip) {
        final float SCALE = context.getResources().getDisplayMetrics().density;
        return (int) (dip * SCALE + 0.5f);
    }
}
