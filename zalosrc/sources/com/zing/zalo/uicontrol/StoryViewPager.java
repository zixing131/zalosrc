package com.zing.zalo.uicontrol;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.adapters.C7286z8;
import com.zing.zalo.uicontrol.StoryViewPager;
import java.lang.reflect.Field;
import me0.AbstractC23136l9;
import p500s1.C26088c;
import xc0.C29576b;

/* loaded from: classes4.dex */
public class StoryViewPager extends ViewPager {

    /* renamed from: p */
    C16526a f83529p;

    /* renamed from: q */
    final C16527b f83530q;

    /* renamed from: r */
    float f83531r;

    /* renamed from: s */
    int f83532s;

    /* renamed from: t */
    final int f83533t;

    /* renamed from: u */
    int f83534u;

    /* renamed from: v */
    int f83535v;

    /* renamed from: w */
    int f83536w;

    /* renamed from: x */
    private int f83537x;

    /* renamed from: y */
    boolean f83538y;

    /* renamed from: com.zing.zalo.uicontrol.StoryViewPager$a */
    /* loaded from: classes4.dex */
    private static class C16526a extends Scroller {
        public C16526a(Context context) {
            super(context, new C26088c());
        }

        @Override // android.widget.Scroller
        public void startScroll(int i11, int i12, int i13, int i14, int i15) {
            super.startScroll(i11, i12, i13, i14, 350);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.uicontrol.StoryViewPager$b */
    /* loaded from: classes4.dex */
    public class C16527b {

        /* renamed from: a */
        float f83539a;

        /* renamed from: b */
        ValueAnimator f83540b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.uicontrol.StoryViewPager$b$a */
        /* loaded from: classes4.dex */
        public class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C16527b.this.m88139f(0.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m88135c(ValueAnimator valueAnimator) {
            m88138e(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        /* renamed from: b */
        boolean m88136b() {
            if (StoryViewPager.this.getCurrentItem() == 0 && this.f83539a < 0.0f) {
                return true;
            }
            if (StoryViewPager.this.getAdapter() != null && StoryViewPager.this.getAdapter().mo35335g() - 1 == StoryViewPager.this.getCurrentItem() && this.f83539a > 0.0f) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        void m88137d() {
            ValueAnimator valueAnimator = this.f83540b;
            if (valueAnimator != null) {
                valueAnimator.isRunning();
            }
            ValueAnimator valueAnimator2 = this.f83540b;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f83540b.removeAllListeners();
                this.f83540b.addListener(new a());
                this.f83540b.cancel();
                return;
            }
            m88139f(0.0f);
        }

        /* renamed from: e */
        public void m88138e(float f11) {
            this.f83539a = f11;
            StoryViewPager.this.m88132x();
            StoryViewPager.this.m88133y();
        }

        /* renamed from: f */
        void m88139f(float f11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f83539a, f11);
            this.f83540b = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicontrol.f2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryViewPager.C16527b.this.m88135c(valueAnimator);
                }
            });
            this.f83540b.setInterpolator(new C26088c());
            this.f83540b.setDuration(StoryViewPager.this.f83536w * Math.abs(f11 - this.f83539a));
            this.f83540b.start();
        }

        private C16527b() {
        }
    }

    public StoryViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83530q = new C16527b();
        this.f83532s = -1;
        this.f83534u = AbstractC23136l9.m118742r(50.0f);
        this.f83535v = 10;
        this.f83536w = 350;
        this.f83538y = false;
        setOverScrollMode(0);
        setPageTransformer(true, new C29576b());
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            C16526a c16526a = new C16526a(getContext());
            this.f83529p = c16526a;
            declaredField.set(this, c16526a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f83533t = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f83538y && motionEvent != null && motionEvent.getAction() == 2) {
            return false;
        }
        C16526a c16526a = this.f83529p;
        if (c16526a != null && !c16526a.isFinished()) {
            return true;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x013e A[ADDED_TO_REGION] */
    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        int i11;
        C16526a c16526a = this.f83529p;
        if (c16526a != null && !c16526a.isFinished()) {
            return true;
        }
        try {
            if (getAdapter() == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (getCurrentItem() != 0 && getCurrentItem() != getAdapter().mo35335g() - 1) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    int action2 = (motionEvent.getAction() & 65280) >> 8;
                                    if (motionEvent.getPointerId(action2) == this.f83532s) {
                                        if (action2 == 0) {
                                            i11 = 1;
                                        } else {
                                            i11 = 0;
                                        }
                                        this.f83531r = motionEvent.getX(i11);
                                        this.f83532s = motionEvent.getPointerId(i11);
                                        z11 = true;
                                    }
                                }
                                z11 = false;
                            }
                        }
                    } else {
                        int i12 = this.f83532s;
                        if (i12 != -1) {
                            float x11 = motionEvent.getX(motionEvent.findPointerIndex(i12));
                            int mo35335g = getAdapter().mo35335g() - 1;
                            int currentItem = getCurrentItem();
                            if (currentItem != 0 && currentItem != mo35335g) {
                                this.f83531r = x11;
                                z11 = false;
                            }
                            float f11 = this.f83531r - x11;
                            if ((currentItem == 0 && f11 < 0.0f) || (currentItem == mo35335g && f11 > 0.0f)) {
                                float scrollX = getScrollX();
                                int width = getWidth();
                                int pageMargin = getPageMargin() + width;
                                float max = Math.max(0, (currentItem - 1) * pageMargin);
                                float min = Math.min(currentItem + 1, mo35335g) * pageMargin;
                                if (currentItem == mo35335g && scrollX + f11 < min) {
                                    scrollX = min;
                                }
                                float f12 = scrollX + f11;
                                if (f12 < max) {
                                    if (max == 0.0f) {
                                        this.f83530q.m88138e((f11 + this.f83533t) / width);
                                    }
                                } else if (f12 > min && min == mo35335g * pageMargin) {
                                    this.f83530q.m88138e(((f12 - min) - this.f83533t) / width);
                                }
                            } else {
                                this.f83530q.m88138e(0.0f);
                            }
                            z11 = false;
                        } else {
                            this.f83530q.m88137d();
                            int actionIndex = motionEvent.getActionIndex();
                            this.f83531r = motionEvent.getX(actionIndex);
                            this.f83532s = motionEvent.getPointerId(actionIndex);
                            z11 = true;
                        }
                    }
                    if (!this.f83530q.m88136b() && !z11) {
                        return true;
                    }
                    return super.onTouchEvent(motionEvent);
                }
                this.f83532s = -1;
                this.f83530q.m88137d();
                z11 = true;
                if (!this.f83530q.m88136b()) {
                }
                return super.onTouchEvent(motionEvent);
            }
            int actionIndex2 = motionEvent.getActionIndex();
            this.f83531r = motionEvent.getX(actionIndex2);
            this.f83532s = motionEvent.getPointerId(actionIndex2);
            z11 = true;
            if (!this.f83530q.m88136b()) {
            }
            return super.onTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e11) {
            e11.printStackTrace();
            return false;
        } catch (IllegalArgumentException e12) {
            e12.printStackTrace();
            return false;
        }
    }

    public void setDisableScrolling(boolean z11) {
        this.f83538y = z11;
    }

    public void setFirstOpenedPage(int i11) {
        this.f83537x = i11;
    }

    /* renamed from: x */
    void m88132x() {
        if (getWidth() != 0 && getAdapter() != null && getAdapter().mo35335g() != 0 && (getAdapter() instanceof C7286z8)) {
            C7286z8 c7286z8 = (C7286z8) getAdapter();
            int currentItem = getCurrentItem();
            boolean z11 = true;
            if (currentItem == 0 || currentItem == c7286z8.mo35335g() - 1) {
                float sin = (float) Math.sin(Math.abs(this.f83530q.f83539a) * 3.141592653589793d);
                float f11 = 0.0f;
                if (sin != 0.0f) {
                    int mo35335g = c7286z8.mo35335g() - 1;
                    int width = getWidth() + getPageMargin();
                    int i11 = this.f83537x;
                    int i12 = -(i11 * width);
                    int i13 = (mo35335g - i11) * width;
                    if (currentItem == 0 && getScrollX() != i12) {
                        setScrollX(i12);
                    }
                    if (currentItem == c7286z8.mo35335g() - 1 && getScrollX() != i13) {
                        setScrollX(i13);
                    }
                }
                float f12 = this.f83534u * sin;
                float f13 = this.f83535v * sin;
                View view = c7286z8.f39938z;
                try {
                    if (currentItem == c7286z8.mo35335g() - 1 && (currentItem != 0 || this.f83530q.f83539a > 0.0f)) {
                        z11 = false;
                    }
                    view.setPivotY(view.getHeight() * 0.5f);
                    if (!z11) {
                        f11 = view.getWidth();
                    }
                    view.setPivotX(f11);
                    if (!z11) {
                        f13 = -f13;
                    }
                    view.setRotationY(f13);
                    if (!z11) {
                        f12 = -f12;
                    }
                    view.setTranslationX(f12);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: y */
    void m88133y() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).invalidate();
        }
        invalidate();
    }
}
