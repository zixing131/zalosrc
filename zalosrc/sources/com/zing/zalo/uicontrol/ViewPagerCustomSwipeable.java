package com.zing.zalo.uicontrol;

import ac.C0718n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.uicontrols.FeedGroupViewPager;
import com.zing.zalo.uicontrol.recyclerview.FeedRecyclerView;
import com.zing.zalo.zplayer.C17395R;
import ho0.AbstractC20110a;
import mm0.AbstractC23350e;

/* loaded from: classes4.dex */
public class ViewPagerCustomSwipeable extends ViewPager {

    /* renamed from: r */
    private static final String f83597r = "ViewPagerCustomSwipeable";

    /* renamed from: p */
    private boolean f83598p;

    /* renamed from: q */
    private C0718n f83599q;

    public ViewPagerCustomSwipeable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83598p = true;
        this.f83599q = new C0718n(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.p058v4.view.ViewPager
    public boolean canScroll(View view, boolean z11, int i11, int i12, int i13) {
        try {
            if (view instanceof HorizontalScrollView) {
                return true;
            }
            if (view != this && (view instanceof FeedGroupViewPager)) {
                return ((FeedGroupViewPager) view).m47305x(i11);
            }
            if (view != this && (view instanceof FeedRecyclerView)) {
                return ((FeedRecyclerView) view).m88422a2(i11);
            }
            if (view != this && view.getId() == C17395R.id.youtube_video_view) {
                return true;
            }
            if (view != this && view.getId() == AbstractC6918a0.story_bar) {
                return true;
            }
            return super.canScroll(view, z11, i11, i12, i13);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83597r, e11);
            return false;
        }
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i11) {
        if (this.f83598p) {
            return super.canScrollHorizontally(i11);
        }
        return false;
    }

    public boolean getSwipeEnabled() {
        return this.f83598p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0718n c0718n = this.f83599q;
        if (c0718n != null) {
            c0718n.m1129c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f83599q.m1128b();
        super.onDetachedFromWindow();
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f83598p) {
                return false;
            }
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f83598p) {
                return false;
            }
            if (!super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    @Override // com.zing.p058v4.view.ViewPager
    public void setOnPageChangeListener(ViewPager.InterfaceC6875j interfaceC6875j) {
        C0718n c0718n = this.f83599q;
        if (interfaceC6875j == c0718n) {
            super.setOnPageChangeListener(interfaceC6875j);
        } else {
            c0718n.m1131e(interfaceC6875j);
        }
    }

    public void setSwipeEnabled(boolean z11) {
        this.f83598p = z11;
    }
}
