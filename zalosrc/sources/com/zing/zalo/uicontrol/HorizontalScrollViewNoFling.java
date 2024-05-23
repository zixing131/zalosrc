package com.zing.zalo.uicontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: classes4.dex */
public class HorizontalScrollViewNoFling extends HorizontalScrollView {
    public HorizontalScrollViewNoFling(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i11) {
    }

    public HorizontalScrollViewNoFling(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
