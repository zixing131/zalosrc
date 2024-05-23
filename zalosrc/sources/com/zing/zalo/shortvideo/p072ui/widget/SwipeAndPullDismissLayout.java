package com.zing.zalo.shortvideo.p072ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;
import s20.AbstractC26105g;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public class SwipeAndPullDismissLayout extends FrameLayout {

    /* renamed from: A */
    private VelocityTracker f54161A;

    /* renamed from: B */
    private Boolean f54162B;

    /* renamed from: C */
    private boolean f54163C;

    /* renamed from: D */
    private boolean f54164D;

    /* renamed from: E */
    private boolean f54165E;

    /* renamed from: F */
    private boolean f54166F;

    /* renamed from: G */
    private boolean f54167G;

    /* renamed from: H */
    private final int f54168H;

    /* renamed from: I */
    private Handler f54169I;

    /* renamed from: p */
    private View f54170p;

    /* renamed from: q */
    private int f54171q;

    /* renamed from: r */
    private int f54172r;

    /* renamed from: s */
    private int f54173s;

    /* renamed from: t */
    private long f54174t;

    /* renamed from: u */
    private int f54175u;

    /* renamed from: v */
    private int f54176v;

    /* renamed from: w */
    private float f54177w;

    /* renamed from: x */
    private float f54178x;

    /* renamed from: y */
    private boolean f54179y;

    /* renamed from: z */
    private int f54180z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SwipeAndPullDismissLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10708a {
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SwipeAndPullDismissLayout$b */
    /* loaded from: classes5.dex */
    public static final class C10709b extends AnimatorListenerAdapter {
        C10709b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            SwipeAndPullDismissLayout.this.f54163C = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            SwipeAndPullDismissLayout.this.f54163C = true;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SwipeAndPullDismissLayout$c */
    /* loaded from: classes5.dex */
    public static final class C10710c extends AnimatorListenerAdapter {
        C10710c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            SwipeAndPullDismissLayout.this.f54163C = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            SwipeAndPullDismissLayout.this.f54163C = true;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SwipeAndPullDismissLayout$d */
    /* loaded from: classes5.dex */
    public static final class AnimationAnimationListenerC10711d implements Animation.AnimationListener {

        /* renamed from: b */
        final /* synthetic */ boolean f54184b;

        AnimationAnimationListenerC10711d(boolean z11) {
            this.f54184b = z11;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeAndPullDismissLayout.this.f54163C = false;
            SwipeAndPullDismissLayout.this.m55804d(this.f54184b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            SwipeAndPullDismissLayout.this.f54163C = true;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SwipeAndPullDismissLayout$e */
    /* loaded from: classes5.dex */
    public static final class AnimationAnimationListenerC10712e implements Animation.AnimationListener {

        /* renamed from: b */
        final /* synthetic */ boolean f54186b;

        AnimationAnimationListenerC10712e(boolean z11) {
            this.f54186b = z11;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeAndPullDismissLayout.this.f54163C = false;
            SwipeAndPullDismissLayout.this.m55804d(this.f54186b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            SwipeAndPullDismissLayout.this.f54163C = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeAndPullDismissLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54174t = 300L;
        this.f54175u = 1;
        this.f54176v = 1;
        this.f54164D = true;
        this.f54165E = true;
        this.f54166F = true;
        this.f54168H = AbstractC26112n.m134365F(this) + AbstractC26105g.m134347n(8);
        this.f54169I = new Handler(Looper.getMainLooper());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f54171q = viewConfiguration.getScaledTouchSlop();
        this.f54172r = viewConfiguration.getScaledMinimumFlingVelocity() * 10;
        this.f54173s = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: c */
    private final void m55801c(boolean z11) {
        if (z11) {
            animate().translationX(0.0f).alpha(1.0f).setDuration(100L).setListener(new C10709b());
        } else {
            animate().translationY(0.0f).alpha(1.0f).setDuration(this.f54174t).setListener(new C10710c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m55802g(SwipeAndPullDismissLayout swipeAndPullDismissLayout) {
        AbstractC19074t.m100208f(swipeAndPullDismissLayout, "this$0");
        swipeAndPullDismissLayout.m55805e(true, false, 500L);
    }

    /* renamed from: h */
    private final void m55803h(float f11, boolean z11) {
        if (!z11 && f11 - this.f54180z > 0.0f) {
            if (getTranslationY() != 0.0f) {
                setTranslationY(0.0f);
            }
        } else if (z11) {
            setTranslationX(f11 - this.f54180z);
        } else {
            setTranslationY(f11 - this.f54180z);
        }
    }

    /* renamed from: d */
    public final void m55804d(boolean z11) {
        AbstractC26112n.m134367H(this);
        this.f54169I.removeCallbacksAndMessages(null);
        setTranslationY(0.0f);
        setTranslationX(0.0f);
    }

    /* renamed from: e */
    public final void m55805e(boolean z11, boolean z12, long j11) {
        float f11;
        if (z12) {
            if (z11) {
                f11 = getWidth();
            } else {
                f11 = -getWidth();
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, f11, 0.0f, 0.0f);
            translateAnimation.setDuration(j11);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(j11);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setFillAfter(false);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new AnimationAnimationListenerC10711d(z12));
            startAnimation(animationSet);
            return;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.f54168H);
        translateAnimation2.setDuration(j11);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(j11);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setFillAfter(false);
        animationSet2.addAnimation(translateAnimation2);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setAnimationListener(new AnimationAnimationListenerC10712e(z12));
        startAnimation(animationSet2);
    }

    /* renamed from: f */
    public final void m55806f(long j11, long j12) {
        this.f54169I.removeCallbacksAndMessages(null);
        setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -this.f54168H, 0.0f);
        translateAnimation.setDuration(j11);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j11);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        startAnimation(animationSet);
        this.f54169I.postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.q
            @Override // java.lang.Runnable
            public final void run() {
                SwipeAndPullDismissLayout.m55802g(SwipeAndPullDismissLayout.this);
            }
        }, j12);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float rawY;
        float rawX;
        float f11;
        float f12;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            this.f54177w = motionEvent.getRawX();
            this.f54178x = motionEvent.getRawY();
        }
        boolean z12 = false;
        if (!this.f54164D || this.f54163C) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2 || this.f54161A == null) {
                return false;
            }
            if (!this.f54167G) {
                this.f54177w = motionEvent.getRawX();
                this.f54178x = motionEvent.getRawY();
                this.f54167G = true;
            }
            VelocityTracker velocityTracker = this.f54161A;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            Boolean bool = this.f54162B;
            if (bool == null) {
                if (Math.abs(motionEvent.getRawX() - this.f54177w) > Math.abs(motionEvent.getRawY() - this.f54178x)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((z11 && !this.f54165E) || (!z11 && !this.f54166F)) {
                    return false;
                }
                if (z11) {
                    rawY = motionEvent.getRawX() - this.f54177w;
                    f12 = motionEvent.getRawY() - this.f54178x;
                    this.f54162B = Boolean.TRUE;
                } else {
                    rawY = motionEvent.getRawY() - this.f54178x;
                    f12 = motionEvent.getRawX() - this.f54177w;
                    this.f54162B = Boolean.FALSE;
                }
            } else {
                Boolean bool2 = Boolean.TRUE;
                if ((AbstractC19074t.m100204b(bool, bool2) && !this.f54165E) || (!AbstractC19074t.m100204b(this.f54162B, bool2) && !this.f54166F)) {
                    return false;
                }
                if (AbstractC19074t.m100204b(this.f54162B, bool2)) {
                    rawY = motionEvent.getRawX() - this.f54177w;
                    rawX = motionEvent.getRawY();
                    f11 = this.f54178x;
                } else {
                    rawY = motionEvent.getRawY() - this.f54178x;
                    rawX = motionEvent.getRawX();
                    f11 = this.f54177w;
                }
                f12 = rawX - f11;
            }
            if (AbstractC19074t.m100204b(this.f54162B, Boolean.FALSE) && rawY > 0.0f) {
                return false;
            }
            if (Math.abs(rawY) > this.f54171q && Math.abs(f12) < Math.abs(rawY) / 2) {
                this.f54179y = true;
                if (rawY > 0.0f) {
                    i11 = this.f54171q;
                } else {
                    i11 = -this.f54171q;
                }
                this.f54180z = i11;
            }
            if (this.f54179y) {
                Boolean bool3 = this.f54162B;
                if (bool3 != null && AbstractC19074t.m100204b(bool3, Boolean.TRUE)) {
                    z12 = true;
                }
                m55803h(rawY, z12);
                return true;
            }
            this.f54162B = null;
            return false;
        }
        this.f54177w = motionEvent.getRawX();
        this.f54178x = motionEvent.getRawY();
        VelocityTracker obtain = VelocityTracker.obtain();
        this.f54161A = obtain;
        if (obtain != null) {
            obtain.addMovement(motionEvent);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.f54170p;
        if (view != null) {
            this.f54175u = view.getWidth();
        }
        View view2 = this.f54170p;
        if (view2 != null) {
            this.f54176v = view2.getHeight();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019b, code lost:            if (r5 > 600.0f) goto L115;     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019d, code lost:            r7 = 100;     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0228, code lost:            if (r5 <= 600.0f) goto L168;     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0241  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f11;
        float f12;
        boolean z11;
        float f13;
        boolean z12;
        boolean z13;
        VelocityTracker velocityTracker;
        boolean z14;
        boolean z15;
        boolean z16;
        float f14;
        boolean z17;
        float rawY;
        float rawX;
        float f15;
        float f16;
        int i11;
        AbstractC19074t.m100208f(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        boolean z18 = false;
        if (actionMasked != 0) {
            boolean z19 = true;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3 || this.f54161A == null) {
                        return false;
                    }
                    Boolean bool = this.f54162B;
                    if (bool == null || !AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                        z19 = false;
                    }
                    m55801c(z19);
                    VelocityTracker velocityTracker2 = this.f54161A;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                    }
                    this.f54161A = null;
                    this.f54177w = 0.0f;
                    this.f54178x = 0.0f;
                    this.f54179y = false;
                    this.f54162B = null;
                } else {
                    VelocityTracker velocityTracker3 = this.f54161A;
                    if (velocityTracker3 == null) {
                        return false;
                    }
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    Boolean bool2 = this.f54162B;
                    if (bool2 == null) {
                        if (motionEvent.getRawX() - this.f54177w > motionEvent.getRawY() - this.f54178x) {
                            rawY = motionEvent.getRawX() - this.f54177w;
                            f16 = motionEvent.getRawY() - this.f54178x;
                            this.f54162B = Boolean.TRUE;
                        } else {
                            rawY = motionEvent.getRawY() - this.f54178x;
                            f16 = motionEvent.getRawX() - this.f54177w;
                            this.f54162B = Boolean.FALSE;
                        }
                    } else {
                        if (AbstractC19074t.m100204b(bool2, Boolean.TRUE)) {
                            rawY = motionEvent.getRawX() - this.f54177w;
                            rawX = motionEvent.getRawY();
                            f15 = this.f54178x;
                        } else {
                            rawY = motionEvent.getRawY() - this.f54178x;
                            rawX = motionEvent.getRawX();
                            f15 = this.f54177w;
                        }
                        f16 = rawX - f15;
                    }
                    if (Math.abs(rawY) > this.f54171q && Math.abs(f16) < Math.abs(rawY) / 2) {
                        this.f54179y = true;
                        if (rawY > 0.0f) {
                            i11 = this.f54171q;
                        } else {
                            i11 = -this.f54171q;
                        }
                        this.f54180z = i11;
                    }
                    if (this.f54179y) {
                        Boolean bool3 = this.f54162B;
                        if (bool3 != null && AbstractC19074t.m100204b(bool3, Boolean.TRUE)) {
                            z18 = true;
                        }
                        m55803h(rawY, z18);
                        return true;
                    }
                }
            } else {
                if (this.f54161A == null) {
                    return false;
                }
                long j11 = this.f54174t;
                Boolean bool4 = this.f54162B;
                if (bool4 != null && AbstractC19074t.m100204b(bool4, Boolean.TRUE)) {
                    float rawX2 = motionEvent.getRawX() - this.f54177w;
                    VelocityTracker velocityTracker4 = this.f54161A;
                    if (velocityTracker4 != null) {
                        velocityTracker4.addMovement(motionEvent);
                    }
                    VelocityTracker velocityTracker5 = this.f54161A;
                    if (velocityTracker5 != null) {
                        velocityTracker5.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker6 = this.f54161A;
                    AbstractC19074t.m100205c(velocityTracker6);
                    float xVelocity = velocityTracker6.getXVelocity();
                    float abs = Math.abs(xVelocity);
                    VelocityTracker velocityTracker7 = this.f54161A;
                    AbstractC19074t.m100205c(velocityTracker7);
                    float abs2 = Math.abs(velocityTracker7.getYVelocity());
                    if (Math.abs(rawX2) > this.f54175u / 3.0f && this.f54179y) {
                        if (rawX2 > 0.0f) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z12 = z17;
                        z11 = true;
                    } else {
                        if (this.f54172r <= abs && abs <= this.f54173s && abs2 < abs && this.f54179y) {
                            if (xVelocity < 0.0f) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (rawX2 < 0.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z15 == z16) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            VelocityTracker velocityTracker8 = this.f54161A;
                            if (velocityTracker8 != null) {
                                f14 = velocityTracker8.getXVelocity();
                            } else {
                                f14 = 0.0f;
                            }
                            if (f14 > 0.0f) {
                                z12 = true;
                            }
                        } else {
                            z11 = false;
                        }
                        z12 = false;
                    }
                    if (abs <= 300.0f || abs >= 600.0f) {
                    }
                    j11 = 150;
                    if (!z11) {
                    }
                    velocityTracker = this.f54161A;
                    if (velocityTracker != null) {
                    }
                    this.f54161A = null;
                    this.f54177w = 0.0f;
                    this.f54178x = 0.0f;
                    this.f54179y = false;
                    this.f54162B = null;
                } else {
                    float rawY2 = motionEvent.getRawY() - this.f54178x;
                    VelocityTracker velocityTracker9 = this.f54161A;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    VelocityTracker velocityTracker10 = this.f54161A;
                    if (velocityTracker10 != null) {
                        velocityTracker10.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker11 = this.f54161A;
                    if (velocityTracker11 != null) {
                        f11 = velocityTracker11.getYVelocity();
                    } else {
                        f11 = 0.0f;
                    }
                    float abs3 = Math.abs(f11);
                    VelocityTracker velocityTracker12 = this.f54161A;
                    if (velocityTracker12 != null) {
                        f12 = velocityTracker12.getXVelocity();
                    } else {
                        f12 = 0.0f;
                    }
                    float abs4 = Math.abs(f12);
                    if (Math.abs(rawY2) > this.f54176v / 3.0f && this.f54179y && rawY2 < 0.0f) {
                        z11 = true;
                    } else if (this.f54172r <= abs3 && abs3 <= this.f54173s && abs4 < abs3 && this.f54179y && rawY2 < 0.0f) {
                        if (f11 < 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        VelocityTracker velocityTracker13 = this.f54161A;
                        if (velocityTracker13 != null) {
                            f13 = velocityTracker13.getYVelocity();
                        } else {
                            f13 = 0.0f;
                        }
                        if (f13 > 0.0f) {
                            z12 = true;
                            if (abs3 > 300.0f || abs3 >= 600.0f) {
                            }
                            j11 = 150;
                            if (!z11) {
                                Boolean bool5 = this.f54162B;
                                if (bool5 != null && AbstractC19074t.m100204b(bool5, Boolean.TRUE)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                m55805e(z12, z14, j11);
                            } else if (this.f54179y) {
                                Boolean bool6 = this.f54162B;
                                if (bool6 != null && AbstractC19074t.m100204b(bool6, Boolean.TRUE)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                m55801c(z13);
                            }
                            velocityTracker = this.f54161A;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                            }
                            this.f54161A = null;
                            this.f54177w = 0.0f;
                            this.f54178x = 0.0f;
                            this.f54179y = false;
                            this.f54162B = null;
                        }
                    } else {
                        z11 = false;
                    }
                    z12 = false;
                    if (abs3 > 300.0f) {
                    }
                }
            }
            return false;
        }
        this.f54177w = motionEvent.getRawX();
        this.f54178x = motionEvent.getRawY();
        VelocityTracker obtain = VelocityTracker.obtain();
        this.f54161A = obtain;
        if (obtain != null) {
            obtain.addMovement(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        AbstractC19074t.m100208f(view, "child");
        super.onViewAdded(view);
        this.f54170p = view;
    }

    public final void setEnable(boolean z11) {
        this.f54164D = z11;
    }

    public final void setEnablePull(boolean z11) {
        this.f54166F = z11;
        if (z11) {
            this.f54167G = false;
        }
    }

    public final void setEnableSwipe(boolean z11) {
        this.f54165E = z11;
    }

    public final void setIsSwipe(Boolean bool) {
        this.f54162B = bool;
    }

    public final void setSwipeAndPullCallback(InterfaceC10708a interfaceC10708a) {
    }
}
