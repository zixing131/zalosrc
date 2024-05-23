package com.zing.zalo.p077ui.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class CustomRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    int f71240V0;

    public CustomRecyclerView(Context context) {
        super(context);
        this.f71240V0 = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13 = this.f71240V0;
        if (i13 >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
    }

    public void setMaxHeight(int i11) {
        this.f71240V0 = i11;
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71240V0 = -1;
    }

    public CustomRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f71240V0 = -1;
    }
}
