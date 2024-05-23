package com.adtima.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: q */
    static final /* synthetic */ boolean f15338q = true;

    /* renamed from: p */
    private int f15339p;

    /* renamed from: com.adtima.control.FlowLayout$a */
    /* loaded from: classes2.dex */
    public static class C3850a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        protected int f15340a;

        /* renamed from: b */
        protected int f15341b;

        public C3850a(int i11, int i12) {
            super(0, 0);
            this.f15340a = i11;
            this.f15341b = i12;
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3850a;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3850a(1, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                C3850a c3850a = (C3850a) childAt.getLayoutParams();
                if (paddingLeft + measuredWidth > i15) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.f15339p;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
                paddingLeft += measuredWidth + c3850a.f15340a;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        if (!f15338q && View.MeasureSpec.getMode(i11) == 0) {
            throw new AssertionError();
        }
        int size = (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i12) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int makeMeasureSpec = View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C3850a c3850a = (C3850a) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                i14 = Math.max(i14, childAt.getMeasuredHeight() + c3850a.f15341b);
                if (paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i14;
                }
                paddingLeft += measuredWidth + c3850a.f15340a;
            }
        }
        this.f15339p = i14;
        if (View.MeasureSpec.getMode(i12) == 0) {
            size2 = paddingTop + i14;
        } else if (View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i13 = paddingTop + i14) < size2) {
            size2 = i13;
        }
        setMeasuredDimension(size, size2);
    }
}
