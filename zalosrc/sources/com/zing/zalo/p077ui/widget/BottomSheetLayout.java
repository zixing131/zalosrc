package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import me0.AbstractC23136l9;
import p500s1.C26087b;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class BottomSheetLayout extends FrameLayout {

    /* renamed from: S */
    private static final float f68963S = AbstractC23136l9.m118742r(75.0f);

    /* renamed from: A */
    int f68964A;

    /* renamed from: B */
    public boolean f68965B;

    /* renamed from: C */
    public boolean f68966C;

    /* renamed from: D */
    VelocityTracker f68967D;

    /* renamed from: E */
    float f68968E;

    /* renamed from: F */
    boolean f68969F;

    /* renamed from: G */
    private boolean f68970G;

    /* renamed from: H */
    boolean f68971H;

    /* renamed from: I */
    boolean f68972I;

    /* renamed from: J */
    private boolean f68973J;

    /* renamed from: K */
    Animator f68974K;

    /* renamed from: L */
    public boolean f68975L;

    /* renamed from: M */
    private long f68976M;

    /* renamed from: N */
    boolean f68977N;

    /* renamed from: O */
    boolean f68978O;

    /* renamed from: P */
    boolean f68979P;

    /* renamed from: Q */
    boolean f68980Q;

    /* renamed from: R */
    InterfaceC13470b f68981R;

    /* renamed from: p */
    public float f68982p;

    /* renamed from: q */
    public float f68983q;

    /* renamed from: r */
    protected boolean f68984r;

    /* renamed from: s */
    boolean f68985s;

    /* renamed from: t */
    MotionEvent f68986t;

    /* renamed from: u */
    boolean f68987u;

    /* renamed from: v */
    int f68988v;

    /* renamed from: w */
    int f68989w;

    /* renamed from: x */
    int f68990x;

    /* renamed from: y */
    int f68991y;

    /* renamed from: z */
    int f68992z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.BottomSheetLayout$a */
    /* loaded from: classes6.dex */
    public class C13469a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ float f68993p;

        /* renamed from: q */
        final /* synthetic */ boolean f68994q;

        C13469a(float f11, boolean z11) {
            this.f68993p = f11;
            this.f68994q = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            BottomSheetLayout bottomSheetLayout = BottomSheetLayout.this;
            bottomSheetLayout.f68974K = null;
            bottomSheetLayout.f68975L = false;
            bottomSheetLayout.setViewTranslationY(this.f68993p);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC13470b interfaceC13470b;
            super.onAnimationEnd(animator);
            BottomSheetLayout bottomSheetLayout = BottomSheetLayout.this;
            if (bottomSheetLayout.f68974K == animator && (interfaceC13470b = bottomSheetLayout.f68981R) != null) {
                interfaceC13470b.mo46528Lh(this.f68994q);
            }
            BottomSheetLayout.this.setViewTranslationY(this.f68993p);
            BottomSheetLayout.this.f68975L = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            BottomSheetLayout.this.f68975L = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.BottomSheetLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13470b {
        /* renamed from: Lh */
        void mo46528Lh(boolean z11);

        /* renamed from: P2 */
        View mo37117P2();

        /* renamed from: T2 */
        void mo42955T2(float f11);

        /* renamed from: X0 */
        boolean mo37120X0(float f11, boolean z11, float f12);

        /* renamed from: e2 */
        void mo72068e2(boolean z11, float f11);

        /* renamed from: x3 */
        void mo72543x3();

        /* renamed from: y3 */
        void mo46557y3();
    }

    public BottomSheetLayout(Context context) {
        super(context);
        this.f68982p = 0.0f;
        this.f68983q = 0.0f;
        this.f68984r = true;
        this.f68985s = true;
        this.f68987u = false;
        this.f68988v = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f68965B = false;
        this.f68966C = false;
        this.f68968E = 0.0f;
        this.f68969F = false;
        this.f68970G = false;
        this.f68971H = false;
        this.f68972I = false;
        this.f68973J = true;
        this.f68974K = null;
        this.f68975L = false;
        this.f68976M = 200L;
        this.f68977N = true;
        this.f68978O = true;
        this.f68979P = true;
        this.f68980Q = true;
    }

    /* renamed from: c */
    private boolean m75547c(MotionEvent motionEvent, MotionEvent... motionEventArr) {
        MotionEvent motionEvent2;
        boolean z11;
        if (motionEvent == null) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                if (Build.VERSION.SDK_INT < 34) {
                    motionEvent2 = MotionEvent.obtainNoHistory(motionEvent);
                } else {
                    motionEvent2 = motionEvent;
                }
                if (motionEvent2.getActionMasked() != 0 || rect.contains((int) motionEvent2.getX(), (int) motionEvent2.getY())) {
                    float f11 = -childAt.getLeft();
                    float f12 = -childAt.getTop();
                    if (motionEventArr != null) {
                        z11 = false;
                        for (MotionEvent motionEvent3 : motionEventArr) {
                            if (motionEvent3 != null) {
                                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent3);
                                obtainNoHistory.offsetLocation(f11, f12);
                                z11 |= childAt.dispatchTouchEvent(obtainNoHistory);
                            }
                        }
                    } else {
                        z11 = false;
                    }
                    motionEvent2.offsetLocation(f11, f12);
                    if (childAt.dispatchTouchEvent(motionEvent2) | z11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m75548f(int i11, int i12) {
        InterfaceC13470b interfaceC13470b = this.f68981R;
        if (interfaceC13470b != null && interfaceC13470b.mo37117P2() != null) {
            return AbstractC23136l9.m118662L0(this.f68981R.mo37117P2(), i11, i12, this);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m75549h(float f11, float f12, ValueAnimator valueAnimator) {
        setViewTranslationY(f11 + ((f12 - f11) * valueAnimator.getAnimatedFraction()));
    }

    /* renamed from: b */
    public boolean m75550b() {
        if (getTranslationY() == this.f68982p) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m75551d() {
        boolean z11;
        boolean z12;
        if (this.f68968E >= f68963S) {
            z11 = true;
        } else {
            z11 = false;
        }
        InterfaceC13470b interfaceC13470b = this.f68981R;
        if (interfaceC13470b != null) {
            z12 = interfaceC13470b.mo37120X0(getTranslationY(), z11, this.f68968E);
        } else {
            z12 = false;
        }
        if (this.f68973J && !z12) {
            float f11 = this.f68968E;
            if (f11 >= 0.0f) {
                setMinimizedWithAnimation(true);
            } else if (f11 < 0.0f) {
                setMinimizedWithAnimation(false);
            }
        }
        this.f68968E = 0.0f;
    }

    /* renamed from: e */
    boolean m75552e(int i11, int i12) {
        Rect rect;
        InterfaceC13470b interfaceC13470b = this.f68981R;
        if (interfaceC13470b != null && interfaceC13470b.mo37117P2() != null) {
            rect = AbstractC23136l9.m118644C0(this.f68981R.mo37117P2());
        } else {
            rect = null;
        }
        if (rect != null && rect.contains(i11, i12)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m75553g() {
        return this.f68984r;
    }

    public float getMaxTranslationY() {
        return this.f68982p;
    }

    float getMaximizeMinimizeThreshold() {
        return (this.f68982p - this.f68983q) / 2.0f;
    }

    public float getMinTranslationY() {
        return this.f68983q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m75554i(float f11) {
        this.f68972I = false;
        float f12 = this.f68982p;
        if (f11 > f12) {
            if (!this.f68971H) {
                f11 = f12;
            }
            this.f68972I = true;
        } else {
            float f13 = this.f68983q;
            if (f11 < f13) {
                f11 = f13;
            }
        }
        this.f68968E += f11 - getTranslationY();
        setViewTranslationY(f11);
    }

    /* renamed from: j */
    public void m75555j() {
        Animator animator = this.f68974K;
        if (animator != null) {
            animator.pause();
        }
    }

    /* renamed from: k */
    public void m75556k() {
        setMinimizedWithAnimation(!this.f68984r);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f68986t = MotionEvent.obtainNoHistory(motionEvent);
        this.f68987u = true;
        return this.f68985s;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean m75552e;
        boolean m75547c;
        boolean m75547c2;
        InterfaceC13470b interfaceC13470b;
        InterfaceC13470b interfaceC13470b2;
        if (!this.f68975L && motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (this.f68969F && pointerId == this.f68989w) {
                if (this.f68987u) {
                    this.f68987u = false;
                    MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(this.f68986t);
                    motionEvent.setLocation(motionEvent.getX(), motionEvent.getY());
                    m75547c(motionEvent, obtainNoHistory);
                } else {
                    m75547c(motionEvent, new MotionEvent[0]);
                }
                if (actionMasked == 3 || actionMasked == 1 || actionMasked == 6) {
                    this.f68969F = false;
                    this.f68965B = false;
                    this.f68966C = false;
                }
            } else {
                if (actionMasked == 0 && !this.f68965B && !this.f68966C) {
                    this.f68966C = true;
                    this.f68989w = pointerId;
                    this.f68990x = (int) motionEvent.getX();
                    this.f68991y = (int) motionEvent.getY();
                    this.f68992z = (int) motionEvent.getRawX();
                    this.f68964A = (int) motionEvent.getRawY();
                    VelocityTracker velocityTracker = this.f68967D;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                    this.f68968E = 0.0f;
                    if (this.f68985s) {
                        m75547c(motionEvent, new MotionEvent[0]);
                    }
                    return true;
                }
                int i11 = this.f68989w;
                if (pointerId == i11 && (actionMasked == 3 || actionMasked == 1 || actionMasked == 6)) {
                    if (this.f68972I && (interfaceC13470b2 = this.f68981R) != null) {
                        interfaceC13470b2.mo72543x3();
                        this.f68972I = false;
                    }
                    boolean z11 = this.f68965B;
                    this.f68965B = false;
                    this.f68966C = false;
                    VelocityTracker velocityTracker2 = this.f68967D;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    if (!z11) {
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() / 2;
                        if (Math.abs(motionEvent.getX() - this.f68990x) <= scaledTouchSlop && Math.abs(motionEvent.getY() - this.f68991y) <= scaledTouchSlop && motionEvent.getEventTime() - motionEvent.getDownTime() <= ViewConfiguration.getTapTimeout() + ViewConfiguration.getPressedStateDuration()) {
                            if (m75550b() && !this.f68977N) {
                                m75547c2 = false;
                            } else if (this.f68987u) {
                                this.f68987u = false;
                                MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(this.f68986t);
                                motionEvent.setLocation(motionEvent.getX(), motionEvent.getY());
                                m75547c2 = m75547c(motionEvent, obtainNoHistory2);
                            } else {
                                m75547c2 = m75547c(motionEvent, new MotionEvent[0]);
                            }
                            if (!m75547c2 && this.f68980Q) {
                                m75556k();
                            }
                            if (!m75547c2 && (interfaceC13470b = this.f68981R) != null) {
                                interfaceC13470b.mo46557y3();
                            }
                        }
                    } else {
                        this.f68987u = false;
                        VelocityTracker velocityTracker3 = this.f68967D;
                        if (velocityTracker3 != null) {
                            velocityTracker3.computeCurrentVelocity(1000);
                            m75551d();
                        }
                    }
                    if (this.f68985s) {
                        m75547c(motionEvent, new MotionEvent[0]);
                    }
                } else if (pointerId == i11 && actionMasked == 2) {
                    int x11 = ((int) motionEvent.getX()) - this.f68990x;
                    int y11 = ((int) motionEvent.getY()) - this.f68991y;
                    float m155454b = AbstractC32232i.m155454b(0.4f, false);
                    if (this.f68966C && !this.f68965B) {
                        if (this.f68970G) {
                            m75552e = m75548f(this.f68990x, this.f68991y);
                        } else {
                            m75552e = m75552e(this.f68992z, this.f68964A);
                        }
                        if (m75552e && ((this.f68978O && Math.abs(x11) >= this.f68988v && Math.abs(x11) / 3 > Math.abs(y11)) || (this.f68979P && Math.abs(y11) >= this.f68988v && Math.abs(y11) / 3 > Math.abs(x11)))) {
                            if (this.f68987u) {
                                this.f68987u = false;
                                MotionEvent obtainNoHistory3 = MotionEvent.obtainNoHistory(this.f68986t);
                                motionEvent.setLocation(motionEvent.getX(), motionEvent.getY());
                                m75547c = m75547c(motionEvent, obtainNoHistory3);
                            } else {
                                m75547c = m75547c(motionEvent, new MotionEvent[0]);
                            }
                            if (m75547c) {
                                this.f68969F = true;
                            }
                        }
                        if (Math.abs(y11) >= m155454b && Math.abs(y11) / 3 > Math.abs(x11)) {
                            this.f68966C = false;
                            this.f68965B = true;
                            this.f68990x = (int) motionEvent.getX();
                            this.f68991y = (int) motionEvent.getY();
                            if (this.f68967D == null) {
                                this.f68967D = VelocityTracker.obtain();
                            }
                            this.f68967D.addMovement(motionEvent);
                            this.f68968E = 0.0f;
                            m75547c(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()), new MotionEvent[0]);
                        }
                    } else if (this.f68965B) {
                        VelocityTracker velocityTracker4 = this.f68967D;
                        if (velocityTracker4 != null) {
                            velocityTracker4.addMovement(motionEvent);
                        }
                        m75554i(getTranslationY() + y11);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBottomSheetLayoutListener(InterfaceC13470b interfaceC13470b) {
        this.f68981R = interfaceC13470b;
    }

    public void setCanOverTranslateMaxY(boolean z11) {
        this.f68971H = z11;
    }

    public void setClickHandledByChildWhenMinimized(boolean z11) {
        this.f68977N = z11;
    }

    public void setEnableScrollX(boolean z11) {
        this.f68978O = z11;
    }

    public void setEnableScrollY(boolean z11) {
        this.f68979P = z11;
    }

    public void setEnableToggleWHenClickNoConsume(boolean z11) {
        this.f68980Q = z11;
    }

    public void setMaxTranslationY(float f11) {
        this.f68982p = f11;
    }

    public void setMinMaxAnimDuration(long j11) {
        this.f68976M = j11;
    }

    public void setMinTranslationY(float f11) {
        this.f68983q = f11;
    }

    public void setMinimized(boolean z11) {
        float f11;
        this.f68984r = z11;
        if (z11) {
            f11 = this.f68982p;
        } else {
            f11 = this.f68983q;
        }
        setViewTranslationY(f11);
    }

    public void setMinimizedWithAnimation(boolean z11) {
        final float f11;
        if (this.f68975L) {
            return;
        }
        Animator animator = this.f68974K;
        if (animator != null) {
            animator.cancel();
        }
        this.f68984r = z11;
        final float translationY = getTranslationY();
        if (z11) {
            f11 = this.f68982p;
        } else {
            f11 = this.f68983q;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheetLayout.this.m75549h(translationY, f11, valueAnimator);
            }
        });
        InterfaceC13470b interfaceC13470b = this.f68981R;
        if (interfaceC13470b != null) {
            interfaceC13470b.mo72068e2(z11, f11);
        }
        ofFloat.addListener(new C13469a(f11, z11));
        ofFloat.setInterpolator(new C26087b());
        ofFloat.setDuration(this.f68976M);
        ofFloat.start();
        this.f68974K = ofFloat;
    }

    public void setShouldInterceptTouchEvent(boolean z11) {
        this.f68985s = z11;
    }

    public void setSnapSCroll(boolean z11) {
        this.f68973J = z11;
    }

    public void setSupportNestedScrollInBubble(boolean z11) {
        this.f68970G = z11;
    }

    public void setViewTranslationY(float f11) {
        setTranslationY(f11);
        InterfaceC13470b interfaceC13470b = this.f68981R;
        if (interfaceC13470b != null) {
            interfaceC13470b.mo42955T2(getTranslationY());
        }
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68982p = 0.0f;
        this.f68983q = 0.0f;
        this.f68984r = true;
        this.f68985s = true;
        this.f68987u = false;
        this.f68988v = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f68965B = false;
        this.f68966C = false;
        this.f68968E = 0.0f;
        this.f68969F = false;
        this.f68970G = false;
        this.f68971H = false;
        this.f68972I = false;
        this.f68973J = true;
        this.f68974K = null;
        this.f68975L = false;
        this.f68976M = 200L;
        this.f68977N = true;
        this.f68978O = true;
        this.f68979P = true;
        this.f68980Q = true;
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f68982p = 0.0f;
        this.f68983q = 0.0f;
        this.f68984r = true;
        this.f68985s = true;
        this.f68987u = false;
        this.f68988v = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f68965B = false;
        this.f68966C = false;
        this.f68968E = 0.0f;
        this.f68969F = false;
        this.f68970G = false;
        this.f68971H = false;
        this.f68972I = false;
        this.f68973J = true;
        this.f68974K = null;
        this.f68975L = false;
        this.f68976M = 200L;
        this.f68977N = true;
        this.f68978O = true;
        this.f68979P = true;
        this.f68980Q = true;
    }
}
