package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.p058v4.view.ViewPager;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FeedGroupViewPager extends ViewPager {

    /* renamed from: p */
    public HashMap f47334p;

    /* renamed from: q */
    public HashMap f47335q;

    /* renamed from: r */
    long f47336r;

    /* renamed from: s */
    InterfaceC8861b f47337s;

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedGroupViewPager$a */
    /* loaded from: classes4.dex */
    class C8860a extends ViewPager.C6879n {
        C8860a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            InterfaceC8861b interfaceC8861b;
            if (i11 == 0 && (interfaceC8861b = FeedGroupViewPager.this.f47337s) != null) {
                interfaceC8861b.mo44144c();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedGroupViewPager$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8861b {
        /* renamed from: a */
        void mo44142a();

        /* renamed from: b */
        void mo44143b();

        /* renamed from: c */
        void mo44144c();
    }

    public FeedGroupViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47336r = 0L;
        this.f47335q = new HashMap();
        this.f47334p = new HashMap();
        addOnPageChangeListener(new C8860a());
    }

    protected int getMeasuredHeightOfFirstItem() {
        View childAt = getChildAt(0);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        if (measuredHeight > 0) {
            return measuredHeight;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE), 0);
        return childAt.getMeasuredHeight();
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC8861b interfaceC8861b;
        InterfaceC8861b interfaceC8861b2;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && (interfaceC8861b2 = this.f47337s) != null) {
            interfaceC8861b2.mo44142a();
        }
        if (motionEvent != null && ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (interfaceC8861b = this.f47337s) != null)) {
            interfaceC8861b.mo44143b();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (getVisibility() != 8 && getChildCount() != 0) {
            int measuredHeight = getChildAt(0).getMeasuredHeight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            if (measuredHeight > 0) {
                setMeasuredDimension(getMeasuredWidth(), measuredHeight + paddingTop);
            } else {
                super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeightOfFirstItem() + paddingTop, 1073741824));
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        if (getScrollX() != i11) {
            this.f47336r = SystemClock.elapsedRealtime();
        }
        super.scrollTo(i11, i12);
    }

    public void setCatchTouchEventListener(InterfaceC8861b interfaceC8861b) {
        this.f47337s = interfaceC8861b;
    }

    /* renamed from: x */
    public boolean m47305x(int i11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f47336r;
        int currentItem = getCurrentItem();
        if (getAdapter() == null) {
            return true;
        }
        int mo35335g = getAdapter().mo35335g();
        if (currentItem == 0 && i11 > 0 && elapsedRealtime > 1000) {
            return false;
        }
        if (currentItem != mo35335g - 1 || i11 >= 0 || elapsedRealtime <= 1000) {
            return true;
        }
        return false;
    }
}
