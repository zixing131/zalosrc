package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.p058v4.view.ViewPager;

/* loaded from: classes6.dex */
public class ViewPagerFakeDragFixed extends ViewPager {

    /* renamed from: p */
    private boolean f69854p;

    public ViewPagerFakeDragFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69854p = false;
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isFakeDragging()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public void onMeasure(int i11, int i12) {
        try {
            if (this.f69854p) {
                super.onMeasure(i11, i12);
                int i13 = 0;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > i13) {
                        i13 = measuredHeight;
                    }
                }
                super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(i13 + getPaddingTop() + getPaddingBottom(), 1073741824));
                return;
            }
            super.onMeasure(i11, i12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setModeWrapContent(boolean z11) {
        this.f69854p = z11;
    }
}
