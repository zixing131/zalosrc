package com.adtima.ads.partner;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public class ZAdsBannerSwipeListener implements View.OnTouchListener {
    private GestureDetector gestureDetector;

    /* loaded from: classes2.dex */
    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final int SWIPE_THRESHOLD = 100;
        private static final int SWIPE_VELOCITY_THRESHOLD = 100;

        private GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            try {
                float y11 = motionEvent2.getY() - motionEvent.getY();
                float x11 = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x11) > Math.abs(y11)) {
                    if (Math.abs(x11) > 100.0f && Math.abs(f11) > 100.0f) {
                        if (x11 > 0.0f) {
                            ZAdsBannerSwipeListener.this.onSwipeRight();
                        } else {
                            ZAdsBannerSwipeListener.this.onSwipeLeft();
                        }
                    }
                } else if (Math.abs(y11) > 100.0f && Math.abs(f12) > 100.0f) {
                    if (y11 > 0.0f) {
                        ZAdsBannerSwipeListener.this.onSwipeDown();
                    } else {
                        ZAdsBannerSwipeListener.this.onSwipeUp();
                    }
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }

    public ZAdsBannerSwipeListener(Context context) {
        this.gestureDetector = new GestureDetector(context, new GestureListener());
    }

    public void onSwipeDown() {
    }

    public void onSwipeLeft() {
    }

    public void onSwipeRight() {
    }

    public void onSwipeUp() {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
}
