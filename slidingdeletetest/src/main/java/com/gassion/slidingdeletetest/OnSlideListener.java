package com.gassion.slidingdeletetest;

import android.view.View;

public interface OnSlideListener {
    public static final int SLIDE_STATUS_OFF = 0;
    public static final int SLIDE_STATUS_START_SCROLL = 1;
    public static final int SLIDE_STATUS_ON = 2;

    public void onSlide(View view, int status);
}
