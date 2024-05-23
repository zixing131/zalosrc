package com.adtima.control;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class CustomMediaView extends FrameLayout {
    public CustomMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, (measuredWidth * 9) / 16);
    }

    public CustomMediaView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
