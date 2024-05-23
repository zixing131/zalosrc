package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class GridLayout extends FrameLayout {

    /* renamed from: p */
    private int f54076p;

    /* renamed from: q */
    private final int f54077q;

    /* renamed from: r */
    private final int f54078r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100205c(context);
        this.f54076p = 2;
        this.f54077q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_4);
        this.f54078r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int i17 = i16 % this.f54076p;
            View childAt = getChildAt(i16);
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            i15 = Math.max(i15, childAt.getMeasuredHeight());
            if (i17 == this.f54076p - 1) {
                paddingLeft = getPaddingLeft();
                paddingTop += i15 + this.f54078r;
                i15 = 0;
            } else {
                paddingLeft += childAt.getMeasuredWidth() + this.f54077q;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int size = (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight();
        int i14 = this.f54078r;
        int i15 = this.f54076p;
        int i16 = (size - ((i15 - 1) * i14)) / i15;
        int i17 = size - ((i14 + i16) * (i15 - 1));
        int childCount = getChildCount();
        int i18 = 0;
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            int i22 = this.f54076p;
            int i23 = i21 % i22;
            if (i23 == i22 - 1) {
                i13 = i17;
            } else {
                i13 = i16;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            View childAt = getChildAt(i21);
            childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            i19 = Math.max(i19, childAt.getMeasuredHeight());
            if (i23 == this.f54076p - 1 || i21 == childCount - 1) {
                i18 += i19 + this.f54077q;
                i19 = 0;
            }
        }
        setMeasuredDimension(size, (i18 - this.f54077q) + getPaddingTop() + getPaddingBottom());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100205c(context);
        this.f54076p = 2;
        this.f54077q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_4);
        this.f54078r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_4);
    }
}
