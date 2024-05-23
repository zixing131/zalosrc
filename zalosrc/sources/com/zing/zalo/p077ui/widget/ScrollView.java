package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes6.dex */
public class ScrollView extends android.widget.ScrollView {

    /* renamed from: p */
    private boolean f69581p;

    public ScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69581p = true;
    }

    /* renamed from: a */
    public boolean m75867a() {
        return this.f69581p;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m75867a()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception unused) {
            super.onRestoreInstanceState(onSaveInstanceState());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m75867a()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setEnableScrolling(boolean z11) {
        this.f69581p = z11;
    }
}
