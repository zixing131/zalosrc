package com.zing.zalo.zdesign.component.bottomsheet;

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
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import com.zing.zalo.zview.AbstractC17484n;
import di0.EnumC17943b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19053g0;
import kotlin.NoWhenBranchMatchedException;
import p500s1.C26087b;
import ui0.C27276c;
import zl0.AbstractC32232i;

/* loaded from: classes7.dex */
public class BottomSheetLayout extends FrameLayout {
    public static final C16955b Companion = new C16955b(null);

    /* renamed from: A */
    private boolean f86535A;

    /* renamed from: B */
    private MotionEvent f86536B;

    /* renamed from: C */
    private boolean f86537C;

    /* renamed from: D */
    private int f86538D;

    /* renamed from: E */
    private int f86539E;

    /* renamed from: F */
    private int f86540F;

    /* renamed from: G */
    private int f86541G;

    /* renamed from: H */
    private int f86542H;

    /* renamed from: I */
    private int f86543I;

    /* renamed from: J */
    private boolean f86544J;

    /* renamed from: K */
    private boolean f86545K;

    /* renamed from: L */
    private VelocityTracker f86546L;

    /* renamed from: M */
    private float f86547M;

    /* renamed from: N */
    private boolean f86548N;

    /* renamed from: O */
    private boolean f86549O;

    /* renamed from: P */
    private boolean f86550P;

    /* renamed from: Q */
    private boolean f86551Q;

    /* renamed from: R */
    private Animator f86552R;

    /* renamed from: S */
    private boolean f86553S;

    /* renamed from: T */
    private long f86554T;

    /* renamed from: U */
    private boolean f86555U;

    /* renamed from: V */
    private boolean f86556V;

    /* renamed from: W */
    private boolean f86557W;

    /* renamed from: a0 */
    private boolean f86558a0;

    /* renamed from: b0 */
    private InterfaceC16954a f86559b0;

    /* renamed from: p */
    private float f86560p;

    /* renamed from: q */
    private float f86561q;

    /* renamed from: r */
    private float f86562r;

    /* renamed from: s */
    private float f86563s;

    /* renamed from: t */
    private boolean f86564t;

    /* renamed from: u */
    private boolean f86565u;

    /* renamed from: v */
    private boolean f86566v;

    /* renamed from: w */
    private boolean f86567w;

    /* renamed from: x */
    private final float f86568x;

    /* renamed from: y */
    private final float f86569y;

    /* renamed from: z */
    private final float f86570z;

    /* renamed from: com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC16954a {
        /* renamed from: P2 */
        View mo45941P2();

        /* renamed from: T2 */
        void mo45942T2(float f11);

        /* renamed from: X0 */
        boolean mo47166X0(float f11, boolean z11, float f12);

        /* renamed from: e2 */
        void mo66253e2(boolean z11, float f11);

        /* renamed from: st */
        void mo66256st(float f11);

        /* renamed from: x3 */
        void mo90529x3();

        /* renamed from: y3 */
        void mo90531y3();
    }

    /* renamed from: com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout$b */
    /* loaded from: classes7.dex */
    public static final class C16955b {
        private C16955b() {
        }

        public /* synthetic */ C16955b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Rect m90796a(View view) {
            AbstractC19074t.m100208f(view, "view");
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            return new Rect(i11, i12, view.getMeasuredWidth() + i11, view.getMeasuredHeight() + i12);
        }

        /* renamed from: b */
        public final boolean m90797b(View view, int i11, int i12, View view2) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(view2, "viewTriggerEvent");
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            view2.getLocationOnScreen(iArr);
            int i15 = iArr[0] + i11;
            int i16 = iArr[1] + i12;
            if (i15 <= i13 || i15 >= i13 + view.getMeasuredWidth() || i16 <= i14 || i16 >= i14 + view.getMeasuredHeight()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout$c */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16956c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86571a;

        static {
            int[] iArr = new int[EnumC17943b.values().length];
            try {
                iArr[EnumC17943b.EXPAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17943b.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17943b.COLLAPSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17943b.CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f86571a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout$d */
    /* loaded from: classes7.dex */
    public static final class C16957d extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ C19053g0 f86573q;

        C16957d(C19053g0 c19053g0) {
            this.f86573q = c19053g0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            BottomSheetLayout.this.setMCurAnimator(null);
            BottomSheetLayout.this.setAnimating(false);
            BottomSheetLayout.this.setViewTranslationY(this.f86573q.f94930p);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            if (AbstractC19074t.m100204b(BottomSheetLayout.this.getMCurAnimator(), animator) && BottomSheetLayout.this.getMBottomSheetLayoutListener() != null) {
                InterfaceC16954a mBottomSheetLayoutListener = BottomSheetLayout.this.getMBottomSheetLayoutListener();
                AbstractC19074t.m100205c(mBottomSheetLayoutListener);
                mBottomSheetLayoutListener.mo66256st(this.f86573q.f94930p);
            }
            BottomSheetLayout.this.setViewTranslationY(this.f86573q.f94930p);
            BottomSheetLayout.this.setAnimating(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationStart(animator);
            BottomSheetLayout.this.setAnimating(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetLayout(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f86566v = true;
        float f11 = getResources().getDisplayMetrics().density;
        this.f86568x = f11;
        this.f86569y = 50 * f11;
        this.f86570z = 8000 * f11;
        this.f86535A = true;
        this.f86538D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f86554T = 200L;
        this.f86555U = true;
        this.f86556V = true;
        this.f86557W = true;
        this.f86558a0 = true;
    }

    /* renamed from: b */
    private final void m90784b(float f11, float f12) {
        float f13;
        float f14;
        getTranslationY();
        if (f12 == 0.0f) {
            float translationY = getTranslationY();
            f13 = this.f86562r;
            if (translationY >= f13) {
                if (getTranslationY() >= this.f86562r) {
                    float translationY2 = getTranslationY();
                    float f15 = this.f86563s;
                    if (translationY2 <= f15) {
                        float abs = Math.abs(this.f86562r + f15) / 2;
                        if (!this.f86564t) {
                            f14 = this.f86563s;
                        } else if (getTranslationY() > abs) {
                            f14 = this.f86563s;
                        } else {
                            f14 = this.f86562r;
                        }
                        f13 = f14;
                    }
                }
                if (getTranslationY() > this.f86563s) {
                    float translationY3 = getTranslationY();
                    float f16 = this.f86561q;
                    if (translationY3 <= f16) {
                        if (getTranslationY() > Math.abs(f16 + this.f86563s) / 2) {
                            f14 = this.f86561q;
                        } else {
                            f14 = this.f86563s;
                        }
                        f13 = f14;
                    }
                }
                float translationY4 = getTranslationY();
                float f17 = this.f86561q;
                if (translationY4 > f17) {
                    float abs2 = Math.abs(this.f86560p + f17) / 2;
                    if (f11 < 0.0f) {
                        if (getTranslationY() > abs2) {
                            f14 = this.f86561q;
                        } else {
                            f14 = this.f86560p;
                        }
                    } else if (getTranslationY() > abs2) {
                        f14 = this.f86560p;
                    } else {
                        f14 = this.f86561q;
                    }
                    f13 = f14;
                } else {
                    f13 = this.f86560p;
                }
            }
        } else {
            float translationY5 = getTranslationY();
            f13 = this.f86562r;
            if (translationY5 >= f13) {
                if (getTranslationY() >= this.f86562r) {
                    float translationY6 = getTranslationY();
                    f13 = this.f86563s;
                    if (translationY6 <= f13) {
                        if (this.f86564t) {
                            if (f11 >= 0.0f && getTranslationY() != this.f86562r) {
                                f14 = this.f86563s;
                            } else {
                                f14 = this.f86562r;
                            }
                            f13 = f14;
                        }
                    }
                }
                if (getTranslationY() > this.f86563s) {
                    float translationY7 = getTranslationY();
                    f13 = this.f86561q;
                    if (translationY7 <= f13) {
                        if (f11 < 0.0f) {
                            f14 = this.f86563s;
                            f13 = f14;
                        }
                    }
                }
                float translationY8 = getTranslationY();
                f13 = this.f86561q;
                if (translationY8 > f13) {
                    if (f11 >= 0.0f) {
                        f14 = this.f86560p;
                        f13 = f14;
                    }
                } else {
                    f13 = this.f86560p;
                }
            }
        }
        setMinimizedWithAnimation(f13);
    }

    /* renamed from: e */
    private final float m90785e(float f11, float f12, float f13) {
        float abs = Math.abs(f11);
        if (abs < f12) {
            return 0.0f;
        }
        if (abs > f13) {
            if (f11 > 0.0f) {
                return f13;
            }
            return -f13;
        }
        return f11;
    }

    /* renamed from: f */
    private final boolean m90786f(MotionEvent motionEvent, MotionEvent... motionEventArr) {
        MotionEvent obtainNoHistory;
        boolean z11;
        if (motionEvent == null) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                if (Build.VERSION.SDK_INT >= 34) {
                    obtainNoHistory = motionEvent;
                } else {
                    obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                }
                if (obtainNoHistory.getActionMasked() != 0 || rect.contains((int) obtainNoHistory.getX(), (int) obtainNoHistory.getY())) {
                    float f11 = -childAt.getLeft();
                    float f12 = -childAt.getTop();
                    if (motionEventArr != null) {
                        z11 = false;
                        for (MotionEvent motionEvent2 : motionEventArr) {
                            if (motionEvent2 != null) {
                                MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(motionEvent2);
                                obtainNoHistory2.offsetLocation(f11, f12);
                                z11 |= childAt.dispatchTouchEvent(obtainNoHistory2);
                            }
                        }
                    } else {
                        z11 = false;
                    }
                    obtainNoHistory.offsetLocation(f11, f12);
                    if (childAt.dispatchTouchEvent(obtainNoHistory) | z11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    private final boolean m90787i(int i11, int i12) {
        InterfaceC16954a interfaceC16954a = this.f86559b0;
        if (interfaceC16954a != null) {
            AbstractC19074t.m100205c(interfaceC16954a);
            if (interfaceC16954a.mo45941P2() != null) {
                C16955b c16955b = Companion;
                InterfaceC16954a interfaceC16954a2 = this.f86559b0;
                AbstractC19074t.m100205c(interfaceC16954a2);
                View mo45941P2 = interfaceC16954a2.mo45941P2();
                AbstractC19074t.m100205c(mo45941P2);
                return c16955b.m90797b(mo45941P2, i11, i12, this);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m90788l(float f11, C19053g0 c19053g0, BottomSheetLayout bottomSheetLayout, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19053g0, "$endTranslationY");
        AbstractC19074t.m100208f(bottomSheetLayout, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        bottomSheetLayout.setViewTranslationY(f11 + ((c19053g0.f94930p - f11) * valueAnimator.getAnimatedFraction()));
    }

    /* renamed from: c */
    public final void m90789c(EnumC17943b enumC17943b) {
        float f11;
        AbstractC19074t.m100208f(enumC17943b, "state");
        int i11 = C16956c.f86571a[enumC17943b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        f11 = this.f86560p;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (this.f86565u) {
                    f11 = this.f86561q;
                } else {
                    f11 = this.f86563s;
                }
            } else {
                f11 = this.f86563s;
            }
        } else if (this.f86564t) {
            f11 = this.f86562r;
        } else {
            f11 = this.f86563s;
        }
        setMinimizedWithAnimation(f11);
    }

    /* renamed from: d */
    public final boolean m90790d() {
        if (getTranslationY() == this.f86561q) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m90791g(float f11) {
        boolean z11;
        AbstractC19074t.m100207e(getContext(), "context");
        if (this.f86547M >= C27276c.m139649b(r0, 75)) {
            z11 = true;
        } else {
            z11 = false;
        }
        InterfaceC16954a interfaceC16954a = this.f86559b0;
        if (interfaceC16954a != null) {
            AbstractC19074t.m100205c(interfaceC16954a);
            interfaceC16954a.mo47166X0(getTranslationY(), z11, this.f86547M);
        }
        m90784b(this.f86547M, f11);
        this.f86547M = 0.0f;
    }

    public final EnumC17943b getCurrentState() {
        float translationY = getTranslationY();
        if (translationY == this.f86563s) {
            return EnumC17943b.DEFAULT;
        }
        if (translationY == this.f86562r) {
            return EnumC17943b.EXPAND;
        }
        if (translationY == this.f86561q) {
            return EnumC17943b.COLLAPSE;
        }
        return EnumC17943b.CLOSE;
    }

    public final float getDefaultTranslationY() {
        return this.f86563s;
    }

    public final boolean getEnableToggleWhenClickNoConsume() {
        return this.f86558a0;
    }

    public final InterfaceC16954a getMBottomSheetLayoutListener() {
        return this.f86559b0;
    }

    public final Animator getMCurAnimator() {
        return this.f86552R;
    }

    public final boolean getMDownMotionEventPended() {
        return this.f86537C;
    }

    public final MotionEvent getMPendingDownMotionEvent() {
        return this.f86536B;
    }

    public final float getMaxTranslationY() {
        return this.f86561q;
    }

    public final float getMaxY() {
        return this.f86560p;
    }

    public final float getMaximizeMinimizeThreshold() {
        return (this.f86561q - this.f86562r) / 2.0f;
    }

    public final boolean getMaybeStartTracking() {
        return this.f86545K;
    }

    public final float getMinTranslationY() {
        return this.f86562r;
    }

    public final boolean getStartedTracking() {
        return this.f86544J;
    }

    public final int getStartedTrackingPointerId() {
        return this.f86539E;
    }

    public final int getStartedTrackingRawX() {
        return this.f86542H;
    }

    public final int getStartedTrackingRawY() {
        return this.f86543I;
    }

    public final int getStartedTrackingX() {
        return this.f86540F;
    }

    public final int getStartedTrackingY() {
        return this.f86541G;
    }

    public final float getTotalTranslationY() {
        return this.f86547M;
    }

    public final int getTouchSlop() {
        return this.f86538D;
    }

    public final VelocityTracker getVelocityTracker() {
        return this.f86546L;
    }

    /* renamed from: h */
    public final boolean m90792h(int i11, int i12) {
        Rect rect;
        InterfaceC16954a interfaceC16954a = this.f86559b0;
        if (interfaceC16954a != null) {
            AbstractC19074t.m100205c(interfaceC16954a);
            if (interfaceC16954a.mo45941P2() != null) {
                C16955b c16955b = Companion;
                InterfaceC16954a interfaceC16954a2 = this.f86559b0;
                AbstractC19074t.m100205c(interfaceC16954a2);
                View mo45941P2 = interfaceC16954a2.mo45941P2();
                AbstractC19074t.m100205c(mo45941P2);
                rect = c16955b.m90796a(mo45941P2);
                if (rect == null && rect.contains(i11, i12)) {
                    return true;
                }
                return false;
            }
        }
        rect = null;
        if (rect == null) {
        }
        return false;
    }

    /* renamed from: j */
    public final void m90793j(float f11) {
        this.f86551Q = false;
        float f12 = this.f86561q;
        if (f11 > f12) {
            if (!this.f86550P) {
                f11 = f12;
            }
            this.f86551Q = true;
        } else {
            float f13 = this.f86562r;
            if (f11 < f13) {
                f11 = f13;
            }
        }
        this.f86547M += f11 - getTranslationY();
        setViewTranslationY(f11);
    }

    /* renamed from: k */
    public final void m90794k() {
        Animator animator = this.f86552R;
        if (animator != null) {
            AbstractC19074t.m100205c(animator);
            animator.pause();
        }
    }

    /* renamed from: m */
    public final void m90795m(boolean z11, int i11, boolean z12) {
        if (this.f86553S) {
            return;
        }
        Animator animator = this.f86552R;
        if (animator != null) {
            animator.cancel();
        }
        float translationY = getTranslationY();
        float translationY2 = getTranslationY();
        float f11 = this.f86562r;
        if (translationY2 <= f11 && z11) {
            return;
        }
        if (z11) {
            if (!z12) {
                f11 = translationY - i11;
            }
            if (f11 <= 0.0f) {
                f11 = 0.0f;
            }
        } else {
            f11 = this.f86563s;
        }
        float f12 = this.f86561q;
        if (translationY == f12) {
            f11 = f12;
        }
        setMinimizedWithAnimation(f11);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        this.f86536B = MotionEvent.obtainNoHistory(motionEvent);
        this.f86537C = true;
        return this.f86535A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:            if (r2 == false) goto L59;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean m90792h;
        boolean m90786f;
        boolean m90786f2;
        InterfaceC16954a interfaceC16954a;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!this.f86553S) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (this.f86548N && pointerId == this.f86539E) {
                if (this.f86537C) {
                    this.f86537C = false;
                    MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(this.f86536B);
                    motionEvent.setLocation(motionEvent.getX(), motionEvent.getY());
                    AbstractC19074t.m100207e(obtainNoHistory, "downEvent");
                    m90786f(motionEvent, obtainNoHistory);
                } else {
                    m90786f(motionEvent, new MotionEvent[0]);
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    this.f86548N = false;
                    this.f86544J = false;
                    this.f86545K = false;
                }
            } else {
                if (actionMasked == 0 && !this.f86544J && !this.f86545K) {
                    this.f86545K = true;
                    this.f86539E = pointerId;
                    this.f86540F = (int) motionEvent.getX();
                    this.f86541G = (int) motionEvent.getY();
                    this.f86542H = (int) motionEvent.getRawX();
                    this.f86543I = (int) motionEvent.getRawY();
                    VelocityTracker velocityTracker = this.f86546L;
                    if (velocityTracker != null) {
                        AbstractC19074t.m100205c(velocityTracker);
                        velocityTracker.clear();
                    }
                    this.f86547M = 0.0f;
                    if (this.f86535A) {
                        m90786f(motionEvent, new MotionEvent[0]);
                    }
                    return true;
                }
                int i11 = this.f86539E;
                if (pointerId == i11 && (actionMasked == 3 || actionMasked == 1 || actionMasked == 6)) {
                    if (this.f86551Q && (interfaceC16954a = this.f86559b0) != null) {
                        AbstractC19074t.m100205c(interfaceC16954a);
                        interfaceC16954a.mo90529x3();
                        this.f86551Q = false;
                    }
                    boolean z11 = this.f86544J;
                    this.f86544J = false;
                    this.f86545K = false;
                    VelocityTracker velocityTracker2 = this.f86546L;
                    if (velocityTracker2 != null) {
                        AbstractC19074t.m100205c(velocityTracker2);
                        velocityTracker2.addMovement(motionEvent);
                    }
                    if (!z11) {
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() / 2;
                        if (Math.abs(motionEvent.getX() - this.f86540F) <= scaledTouchSlop && Math.abs(motionEvent.getY() - this.f86541G) <= scaledTouchSlop && motionEvent.getEventTime() - motionEvent.getDownTime() <= ViewConfiguration.getTapTimeout() + ViewConfiguration.getPressedStateDuration()) {
                            if (!m90790d() || this.f86555U) {
                                if (this.f86537C) {
                                    this.f86537C = false;
                                    MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(this.f86536B);
                                    motionEvent.setLocation(motionEvent.getX(), motionEvent.getY());
                                    AbstractC19074t.m100207e(obtainNoHistory2, "downEvent");
                                    m90786f2 = m90786f(motionEvent, obtainNoHistory2);
                                } else {
                                    m90786f2 = m90786f(motionEvent, new MotionEvent[0]);
                                }
                            }
                            InterfaceC16954a interfaceC16954a2 = this.f86559b0;
                            if (interfaceC16954a2 != null) {
                                AbstractC19074t.m100205c(interfaceC16954a2);
                                interfaceC16954a2.mo90531y3();
                            }
                        }
                    } else {
                        this.f86537C = false;
                        VelocityTracker velocityTracker3 = this.f86546L;
                        if (velocityTracker3 != null) {
                            AbstractC19074t.m100205c(velocityTracker3);
                            velocityTracker3.computeCurrentVelocity(1000);
                            VelocityTracker velocityTracker4 = this.f86546L;
                            AbstractC19074t.m100205c(velocityTracker4);
                            m90791g(m90785e(velocityTracker4.getYVelocity(), this.f86569y, this.f86570z));
                        }
                    }
                    if (this.f86535A) {
                        m90786f(motionEvent, new MotionEvent[0]);
                    }
                } else if (pointerId == i11 && actionMasked == 2) {
                    int x11 = ((int) motionEvent.getX()) - this.f86540F;
                    int y11 = ((int) motionEvent.getY()) - this.f86541G;
                    float m155454b = AbstractC32232i.m155454b(0.4f, false);
                    if (this.f86545K && !this.f86544J) {
                        if (this.f86549O) {
                            m90792h = m90787i(this.f86540F, this.f86541G);
                        } else {
                            m90792h = m90792h(this.f86542H, this.f86543I);
                        }
                        if (m90792h && ((this.f86556V && Math.abs(x11) >= this.f86538D && Math.abs(x11) / 3 > Math.abs(y11)) || (this.f86557W && Math.abs(y11) >= this.f86538D && Math.abs(y11) / 3 > Math.abs(x11)))) {
                            if (this.f86537C) {
                                this.f86537C = false;
                                MotionEvent obtainNoHistory3 = MotionEvent.obtainNoHistory(this.f86536B);
                                motionEvent.setLocation(motionEvent.getX(), motionEvent.getY());
                                AbstractC19074t.m100207e(obtainNoHistory3, "downEvent");
                                m90786f = m90786f(motionEvent, obtainNoHistory3);
                            } else {
                                m90786f = m90786f(motionEvent, new MotionEvent[0]);
                            }
                            if (m90786f) {
                                this.f86548N = true;
                            }
                        }
                        if (Math.abs(y11) >= m155454b && Math.abs(y11) / 3 > Math.abs(x11)) {
                            this.f86545K = false;
                            this.f86544J = true;
                            this.f86540F = (int) motionEvent.getX();
                            this.f86541G = (int) motionEvent.getY();
                            if (this.f86546L == null) {
                                this.f86546L = VelocityTracker.obtain();
                            }
                            VelocityTracker velocityTracker5 = this.f86546L;
                            AbstractC19074t.m100205c(velocityTracker5);
                            velocityTracker5.addMovement(motionEvent);
                            this.f86547M = 0.0f;
                            m90786f(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()), new MotionEvent[0]);
                        }
                    } else if (this.f86544J) {
                        VelocityTracker velocityTracker6 = this.f86546L;
                        if (velocityTracker6 != null) {
                            AbstractC19074t.m100205c(velocityTracker6);
                            velocityTracker6.addMovement(motionEvent);
                        }
                        m90793j(getTranslationY() + y11);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAnimating(boolean z11) {
        this.f86553S = z11;
    }

    public final void setBottomSheetLayoutListener(InterfaceC16954a interfaceC16954a) {
        this.f86559b0 = interfaceC16954a;
    }

    public final void setCanCollapse(boolean z11) {
        this.f86565u = z11;
    }

    public final void setCanExpand(boolean z11) {
        this.f86564t = z11;
    }

    public final void setCanOverTranslateMaxY(boolean z11) {
        this.f86550P = z11;
    }

    public final void setClickHandledByChildWhenMinimized(boolean z11) {
        this.f86555U = z11;
    }

    public final void setDefaultTranslationY(float f11) {
        this.f86563s = Math.max(f11, this.f86562r);
    }

    public final void setEnableScrollX(boolean z11) {
        this.f86556V = z11;
    }

    public final void setEnableScrollY(boolean z11) {
        this.f86557W = z11;
    }

    public final void setEnableToggleWHenClickNoConsume(boolean z11) {
        this.f86558a0 = z11;
    }

    public final void setEnableToggleWhenClickNoConsume(boolean z11) {
        this.f86558a0 = z11;
    }

    public final void setIsDetentsMode(boolean z11) {
        this.f86566v = z11;
    }

    public final void setIsModalType(boolean z11) {
        this.f86567w = z11;
    }

    public final void setMBottomSheetLayoutListener(InterfaceC16954a interfaceC16954a) {
        this.f86559b0 = interfaceC16954a;
    }

    public final void setMCurAnimator(Animator animator) {
        this.f86552R = animator;
    }

    public final void setMDownMotionEventPended(boolean z11) {
        this.f86537C = z11;
    }

    public final void setMPendingDownMotionEvent(MotionEvent motionEvent) {
        this.f86536B = motionEvent;
    }

    public final void setMaxTranslationY(float f11) {
        this.f86561q = f11;
    }

    public final void setMaxY(float f11) {
        this.f86560p = f11;
    }

    public final void setMaybeStartTracking(boolean z11) {
        this.f86545K = z11;
    }

    public final void setMinMaxAnimDuration(long j11) {
        this.f86554T = j11;
    }

    public final void setMinTranslationY(float f11) {
        float f12;
        if (this.f86566v && this.f86567w) {
            f12 = AbstractC17484n.Companion.m92931b();
        } else {
            f12 = 0.0f;
        }
        this.f86562r = Math.max(f11, f12);
    }

    public final void setMinimizedWithAnimation(float f11) {
        boolean z11;
        InterfaceC16954a interfaceC16954a;
        if (this.f86553S) {
            return;
        }
        Animator animator = this.f86552R;
        if (animator != null) {
            AbstractC19074t.m100205c(animator);
            animator.cancel();
        }
        final float translationY = getTranslationY();
        final C19053g0 c19053g0 = new C19053g0();
        c19053g0.f94930p = f11;
        if (f11 > getTranslationY()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: di0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheetLayout.m90788l(translationY, c19053g0, this, valueAnimator);
            }
        });
        InterfaceC16954a interfaceC16954a2 = this.f86559b0;
        if (interfaceC16954a2 != null) {
            AbstractC19074t.m100205c(interfaceC16954a2);
            interfaceC16954a2.mo66253e2(z11, translationY);
        }
        ofFloat.addListener(new C16957d(c19053g0));
        ofFloat.setInterpolator(new C26087b());
        ofFloat.setDuration(this.f86554T);
        ofFloat.start();
        this.f86552R = ofFloat;
        if (f11 >= this.f86560p && (interfaceC16954a = this.f86559b0) != null) {
            interfaceC16954a.mo90529x3();
        }
    }

    public final void setPassingTouchToChild(boolean z11) {
        this.f86548N = z11;
    }

    public final void setScrollOverMaxY(boolean z11) {
        this.f86551Q = z11;
    }

    public final void setShouldInterceptTouchEvent(boolean z11) {
        this.f86535A = z11;
    }

    public final void setStartedTracking(boolean z11) {
        this.f86544J = z11;
    }

    public final void setStartedTrackingPointerId(int i11) {
        this.f86539E = i11;
    }

    public final void setStartedTrackingRawX(int i11) {
        this.f86542H = i11;
    }

    public final void setStartedTrackingRawY(int i11) {
        this.f86543I = i11;
    }

    public final void setStartedTrackingX(int i11) {
        this.f86540F = i11;
    }

    public final void setStartedTrackingY(int i11) {
        this.f86541G = i11;
    }

    public final void setSupportNestedScrollInBubble(boolean z11) {
        this.f86549O = z11;
    }

    public final void setTotalTranslationY(float f11) {
        this.f86547M = f11;
    }

    public final void setTouchSlop(int i11) {
        this.f86538D = i11;
    }

    public final void setVelocityTracker(VelocityTracker velocityTracker) {
        this.f86546L = velocityTracker;
    }

    public final void setViewTranslationY(float f11) {
        setTranslationY(f11);
        InterfaceC16954a interfaceC16954a = this.f86559b0;
        if (interfaceC16954a != null) {
            AbstractC19074t.m100205c(interfaceC16954a);
            interfaceC16954a.mo45942T2(getTranslationY());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f86566v = true;
        float f11 = getResources().getDisplayMetrics().density;
        this.f86568x = f11;
        this.f86569y = 50 * f11;
        this.f86570z = 8000 * f11;
        this.f86535A = true;
        this.f86538D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f86554T = 200L;
        this.f86555U = true;
        this.f86556V = true;
        this.f86557W = true;
        this.f86558a0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86566v = true;
        float f11 = getResources().getDisplayMetrics().density;
        this.f86568x = f11;
        this.f86569y = 50 * f11;
        this.f86570z = 8000 * f11;
        this.f86535A = true;
        this.f86538D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f86554T = 200L;
        this.f86555U = true;
        this.f86556V = true;
        this.f86557W = true;
        this.f86558a0 = true;
    }
}
