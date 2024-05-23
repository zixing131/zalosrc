package com.zing.zalo.p077ui.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.adapters.C7252w7;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class SlidingTabRecyclerView extends RecyclerView {

    /* renamed from: X0 */
    private static final int f71241X0 = (AbstractC23136l9.m118722k0() / AbstractC23136l9.m118742r(48.0f)) - 1;

    /* renamed from: V0 */
    private ViewPager.InterfaceC6875j f71242V0;

    /* renamed from: W0 */
    private boolean f71243W0;

    /* renamed from: com.zing.zalo.ui.widget.recyclerview.SlidingTabRecyclerView$a */
    /* loaded from: classes6.dex */
    private class C13765a implements ViewPager.InterfaceC6875j {

        /* renamed from: p */
        int f71244p;

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            this.f71244p = i11;
            if (SlidingTabRecyclerView.this.f71242V0 != null) {
                SlidingTabRecyclerView.this.f71242V0.onPageScrollStateChanged(i11);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            int childCount = SlidingTabRecyclerView.this.getChildCount();
            if (i11 >= 0 && i11 < childCount && SlidingTabRecyclerView.this.f71242V0 != null) {
                SlidingTabRecyclerView.this.f71242V0.onPageScrolled(i11, f11, i12);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            try {
                if (SlidingTabRecyclerView.this.f71242V0 != null) {
                    SlidingTabRecyclerView.this.f71242V0.onPageSelected(i11);
                }
                SlidingTabRecyclerView.this.m76910c2(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        private C13765a() {
        }
    }

    public SlidingTabRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71243W0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c2 */
    public void m76910c2(int i11) {
        try {
            int childCount = getChildCount();
            if (childCount > 0 && i11 < childCount) {
                View childAt = getChildAt(i11);
                if (childAt instanceof StickerIndicatorView) {
                    ((StickerIndicatorView) childAt).m75914i();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d2 */
    public void m76911d2(int i11) {
        try {
            C7252w7 c7252w7 = (C7252w7) getAdapter();
            c7252w7.m36986f0(i11);
            c7252w7.m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public int getSelectedPage() {
        C7252w7 c7252w7 = (C7252w7) getAdapter();
        if (c7252w7 != null) {
            return c7252w7.m36980O();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (motionEvent.getAction() == 0) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        if (motionEvent != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) && getParent() != null)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setFirstTimeVisible(boolean z11) {
        this.f71243W0 = z11;
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC6875j interfaceC6875j) {
        this.f71242V0 = interfaceC6875j;
    }

    public void setViewpager(ViewPager viewPager) {
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new C13765a());
        }
    }
}
