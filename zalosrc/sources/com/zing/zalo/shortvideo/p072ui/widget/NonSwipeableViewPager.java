package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zing.p058v4.view.ViewPager;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class NonSwipeableViewPager extends ViewPager {

    /* renamed from: p */
    private int f54133p;

    /* renamed from: q */
    private boolean f54134q;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.NonSwipeableViewPager$a */
    /* loaded from: classes5.dex */
    public static final class C10700a extends ViewPager.C6879n {
        C10700a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            NonSwipeableViewPager.this.f54133p = i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        addOnPageChangeListener(new C10700a());
    }

    public final int getScrollState() {
        return this.f54133p;
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f54134q && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f54134q && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.p058v4.view.ViewPager
    public void setCurrentItem(int i11) {
        setCurrentItem(i11, this.f54134q);
    }

    public final void setSwipeEnable(boolean z11) {
        this.f54134q = z11;
    }
}
