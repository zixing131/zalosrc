package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public final class LeftTitleHeaderLayout extends HeaderLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeftTitleHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        View lytLeft = getLytLeft();
        if (lytLeft != null) {
            AbstractC26112n.m134383X(lytLeft, 0, 0);
        }
        View lytRight = getLytRight();
        if (lytRight != null) {
            AbstractC26112n.m134384Y(lytRight, 0, getMeasuredWidth());
        }
        View lytCenter = getLytCenter();
        if (lytCenter != null) {
            View lytLeft2 = getLytLeft();
            if (lytLeft2 != null) {
                i15 = lytLeft2.getRight();
            } else {
                i15 = 0;
            }
            AbstractC26112n.m134383X(lytCenter, 0, i15);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        View lytLeft = getLytLeft();
        if (lytLeft != null && AbstractC26112n.m134378S(lytLeft)) {
            AbstractC26112n.m134387a0(lytLeft, 0, 0, getHeaderHeight(), 1073741824);
            i13 = lytLeft.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        View lytRight = getLytRight();
        if (lytRight != null && AbstractC26112n.m134378S(lytRight)) {
            AbstractC26112n.m134387a0(lytRight, 0, 0, getHeaderHeight(), 1073741824);
            i13 += lytRight.getMeasuredWidth();
        }
        View lytCenter = getLytCenter();
        if (lytCenter != null && AbstractC26112n.m134378S(lytCenter)) {
            AbstractC26112n.m134387a0(lytCenter, size - i13, 1073741824, getHeaderHeight(), 1073741824);
        }
        setMeasuredDimension(size, getHeaderHeight());
    }
}
