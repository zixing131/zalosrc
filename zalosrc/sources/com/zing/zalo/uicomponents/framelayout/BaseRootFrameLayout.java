package com.zing.zalo.uicomponents.framelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import h40.AbstractC19849s1;
import ho0.AbstractC20110a;

/* loaded from: classes.dex */
public class BaseRootFrameLayout extends FrameLayout {
    public BaseRootFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        AbstractC20110a.m104535d("onMeasure", new Object[0]);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        AbstractC20110a.m104535d("onSizeChanged", new Object[0]);
        AbstractC19849s1.m103554f(i11, i12);
    }
}
