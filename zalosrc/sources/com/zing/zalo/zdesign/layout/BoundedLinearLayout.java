package com.zing.zalo.zdesign.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class BoundedLinearLayout extends LinearLayout {

    /* renamed from: p */
    private int f87412p;

    /* renamed from: q */
    private int f87413q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    public final int getMaxHeight() {
        return this.f87413q;
    }

    public final int getMaxWidth() {
        return this.f87412p;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f87412p;
        if (1 <= i13 && i13 < size) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f87412p, View.MeasureSpec.getMode(i11));
        }
        int size2 = View.MeasureSpec.getSize(i12);
        int i14 = this.f87413q;
        if (1 <= i14 && i14 < size2) {
            i12 = View.MeasureSpec.makeMeasureSpec(this.f87413q, View.MeasureSpec.getMode(i12));
        }
        super.onMeasure(i11, i12);
    }

    public final void setMaxHeight(int i11) {
        this.f87413q = i11;
        requestLayout();
    }

    public final void setMaxWidth(int i11) {
        this.f87412p = i11;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
