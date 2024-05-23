package com.zing.zalo.p077ui.widget.springback;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* renamed from: com.zing.zalo.ui.widget.springback.a */
/* loaded from: classes6.dex */
public class C13790a {

    /* renamed from: a */
    int f71369a = -1;

    /* renamed from: b */
    float f71370b;

    /* renamed from: c */
    float f71371c;

    /* renamed from: d */
    int f71372d;

    /* renamed from: e */
    private ViewGroup f71373e;

    /* renamed from: f */
    int f71374f;

    /* renamed from: g */
    private int f71375g;

    public C13790a(ViewGroup viewGroup, int i11) {
        this.f71373e = viewGroup;
        this.f71374f = i11;
        this.f71375g = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    public void m77034a(MotionEvent motionEvent) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i11 = 1;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i12 = this.f71369a;
                    if (i12 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i12)) >= 0) {
                        float y11 = motionEvent.getY(findPointerIndex);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float f11 = y11 - this.f71371c;
                        float f12 = x11 - this.f71370b;
                        if (Math.abs(f12) <= this.f71375g && Math.abs(f11) <= this.f71375g) {
                            return;
                        }
                        if (Math.abs(f12) <= Math.abs(f11)) {
                            i11 = 2;
                        }
                        this.f71372d = i11;
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    return;
                }
            }
            this.f71372d = 0;
            this.f71373e.requestDisallowInterceptTouchEvent(false);
            return;
        }
        int pointerId = motionEvent.getPointerId(0);
        this.f71369a = pointerId;
        int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
        if (findPointerIndex2 >= 0) {
            this.f71371c = motionEvent.getY(findPointerIndex2);
            this.f71370b = motionEvent.getX(findPointerIndex2);
            this.f71372d = 0;
        }
    }

    /* renamed from: b */
    public boolean m77035b(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        if (findPointerIndex < 0) {
            return false;
        }
        float y11 = motionEvent.getY(findPointerIndex);
        float x11 = motionEvent.getX(findPointerIndex);
        int[] iArr = {0, 0};
        this.f71373e.getLocationInWindow(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        return new Rect(i11, i12, this.f71373e.getWidth() + i11, this.f71373e.getHeight() + i12).contains((int) x11, (int) y11);
    }
}
