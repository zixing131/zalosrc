package com.zing.zalo.p077ui.picker.landingpage.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.showingphotolib.view.HackyViewPager;

/* loaded from: classes6.dex */
public class LandingViewPager extends HackyViewPager {

    /* renamed from: p */
    private boolean f66361p;

    public LandingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66361p = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.p058v4.view.ViewPager
    public boolean canScroll(View view, boolean z11, int i11, int i12, int i13) {
        if (view != null && view.getVisibility() == 0) {
            return super.canScroll(view, z11, i11, i12, i13);
        }
        return false;
    }

    public boolean getEnableSwipe() {
        return this.f66361p;
    }

    @Override // com.showingphotolib.view.HackyViewPager, com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f66361p) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.showingphotolib.view.HackyViewPager, com.zing.p058v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f66361p) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEnableSwipe(boolean z11) {
        this.f66361p = z11;
    }
}
