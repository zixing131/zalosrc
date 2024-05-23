package com.zing.zalo.p077ui.widget.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC8923h0;

/* loaded from: classes6.dex */
public class AspectRatioRelativeLayout extends RelativeLayout {

    /* renamed from: p */
    private float f70598p;

    public AspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70598p = 0.0f;
        m76368a(context, attributeSet);
    }

    /* renamed from: a */
    private void m76368a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.AspectRatioRelativeLayout, 0, 0);
        try {
            this.f70598p = obtainStyledAttributes.getFloat(AbstractC8923h0.AspectRatioRelativeLayout_ratio, 1.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f70598p > 0.0f) {
            int size = View.MeasureSpec.getSize(i11);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((int) ((size - paddingLeft) / this.f70598p)) + getPaddingTop() + getPaddingBottom(), 1073741824));
            return;
        }
        super.onMeasure(i11, i12);
    }

    public AspectRatioRelativeLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f70598p = 0.0f;
        m76368a(context, attributeSet);
    }
}
