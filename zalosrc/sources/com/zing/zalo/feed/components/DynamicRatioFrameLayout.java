package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class DynamicRatioFrameLayout extends RelativeLayout {

    /* renamed from: p */
    private float f44198p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f44198p = 0.5625f;
    }

    public final float getRatioHeight() {
        return this.f44198p;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i13 = size - paddingLeft;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13 + paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((int) (i13 * this.f44198p)) + getPaddingTop() + getPaddingBottom(), size2), 1073741824));
    }

    public final void setRatioHeight(float f11) {
        this.f44198p = f11;
    }
}
