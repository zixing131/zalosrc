package com.zing.mp3.sdk.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;
import p000.AbstractC23494n;
import p156fb.AbstractC18858d;
import p227i3.C20218v;

/* loaded from: classes3.dex */
public final class SongBtsFooter extends FrameLayout {

    /* renamed from: p */
    public final int f37632p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SongBtsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f37632p = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_bts_spacing_between_items);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingStart = getPaddingStart();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            AbstractC19074t.m100207e(childAt, C20218v.f100059b);
            AbstractC23494n.m123327c(childAt, 0, paddingStart);
            paddingStart += childAt.getMeasuredWidth() + this.f37632p;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i11);
        int paddingEnd = size - (getPaddingEnd() + getPaddingStart());
        int size2 = View.MeasureSpec.getSize(i12) - (getPaddingBottom() + getPaddingTop());
        int i13 = (paddingEnd - ((childCount - 1) * this.f37632p)) / childCount;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            AbstractC19074t.m100207e(childAt, C20218v.f100059b);
            if (childAt.getVisibility() != 8) {
                childAt.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), 0, childAt.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), 0, childAt.getLayoutParams().height));
                i14 = Math.max(i14, childAt.getMeasuredHeight());
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            AbstractC19074t.m100207e(childAt2, C20218v.f100059b);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), 0, childAt2.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i14);
    }
}
