package com.zing.zalo.p077ui.widget.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zing.p058v4.view.ViewPager;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class GestureControlViewPager extends ViewPager {

    /* renamed from: p */
    private boolean f71457p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureControlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f71457p = true;
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (this.f71457p) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (this.f71457p) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setSwipeGestureEnabled(boolean z11) {
        this.f71457p = z11;
    }
}
