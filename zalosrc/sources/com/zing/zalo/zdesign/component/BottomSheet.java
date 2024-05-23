package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayoutNestedParent;
import com.zing.zalo.zdesign.layout.ZDSLoadingZaloView;
import com.zing.zalo.zview.AbstractC17484n;
import di0.EnumC17943b;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import p227i3.C20218v;
import p500s1.C26086a;
import p500s1.C26088c;
import ri0.C25808b;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public abstract class BottomSheet extends ZDSLoadingZaloView implements View.OnClickListener, BottomSheetLayout.InterfaceC16954a, InterfaceC16976f1 {

    /* renamed from: A0 */
    private AnimatorSet f86193A0;

    /* renamed from: B0 */
    private AbstractC16910a f86194B0;

    /* renamed from: F0 */
    private BottomSheetLayout f86198F0;

    /* renamed from: G0 */
    private LinearLayout f86199G0;

    /* renamed from: H0 */
    private FrameLayout f86200H0;

    /* renamed from: M0 */
    private int f86205M0;

    /* renamed from: N0 */
    private int f86206N0;

    /* renamed from: O0 */
    private int f86207O0;

    /* renamed from: P0 */
    private boolean f86208P0;

    /* renamed from: Q0 */
    private float f86209Q0;

    /* renamed from: R0 */
    private int f86210R0;

    /* renamed from: S0 */
    private boolean f86211S0;

    /* renamed from: T0 */
    private boolean f86212T0;

    /* renamed from: Y0 */
    private FrameLayout f86217Y0;

    /* renamed from: Z0 */
    private boolean f86218Z0;

    /* renamed from: a1 */
    private boolean f86219a1;

    /* renamed from: z0 */
    private C25808b f86220z0;

    /* renamed from: C0 */
    private boolean f86195C0 = true;

    /* renamed from: D0 */
    private int f86196D0 = 250;

    /* renamed from: E0 */
    private int f86197E0 = 150;

    /* renamed from: I0 */
    private float f86201I0 = 0.5f;

    /* renamed from: J0 */
    private float f86202J0 = 1.0f;

    /* renamed from: K0 */
    private float f86203K0 = 0.2f;

    /* renamed from: L0 */
    private boolean f86204L0 = true;

    /* renamed from: U0 */
    private boolean f86213U0 = true;

    /* renamed from: V0 */
    private boolean f86214V0 = true;

    /* renamed from: W0 */
    private EnumC17017m f86215W0 = EnumC17017m.DETENTS;

    /* renamed from: X0 */
    private EnumC17943b f86216X0 = EnumC17943b.DEFAULT;

    /* renamed from: com.zing.zalo.zdesign.component.BottomSheet$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC16910a {
        /* renamed from: a */
        public abstract void mo45955a();

        /* renamed from: b */
        public abstract void mo45956b();
    }

    /* renamed from: com.zing.zalo.zdesign.component.BottomSheet$b */
    /* loaded from: classes7.dex */
    public static final class C16911b extends AnimatorListenerAdapter {
        C16911b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            if (BottomSheet.this.f86194B0 != null) {
                AbstractC16910a abstractC16910a = BottomSheet.this.f86194B0;
                AbstractC19074t.m100205c(abstractC16910a);
                abstractC16910a.mo45955a();
                if (BottomSheet.this.m90519iL()) {
                    BottomSheet.this.finish();
                }
            }
            BottomSheetLayout bottomSheetLayout = BottomSheet.this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout);
            bottomSheetLayout.setAnimating(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            if (BottomSheet.this.f86194B0 != null) {
                AbstractC16910a abstractC16910a = BottomSheet.this.f86194B0;
                AbstractC19074t.m100205c(abstractC16910a);
                abstractC16910a.mo45955a();
                if (BottomSheet.this.m90519iL()) {
                    BottomSheet.this.finish();
                }
            }
            BottomSheetLayout bottomSheetLayout = BottomSheet.this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout);
            bottomSheetLayout.setAnimating(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationStart(animator);
            BottomSheetLayout bottomSheetLayout = BottomSheet.this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout);
            bottomSheetLayout.setAnimating(true);
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.BottomSheet$c */
    /* loaded from: classes7.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC16912c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: q */
        final /* synthetic */ BottomSheetLayout f86223q;

        ViewTreeObserverOnPreDrawListenerC16912c(BottomSheetLayout bottomSheetLayout) {
            this.f86223q = bottomSheetLayout;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            BottomSheet.this.mo66254mL();
            this.f86223q.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.BottomSheet$d */
    /* loaded from: classes7.dex */
    public static final class C16913d extends AnimatorListenerAdapter {
        C16913d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            BottomSheetLayout bottomSheetLayout = BottomSheet.this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout);
            bottomSheetLayout.setAnimating(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            BottomSheetLayout bottomSheetLayout = BottomSheet.this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout);
            bottomSheetLayout.setAnimating(false);
            if (BottomSheet.this.f86194B0 != null) {
                AbstractC16910a abstractC16910a = BottomSheet.this.f86194B0;
                AbstractC19074t.m100205c(abstractC16910a);
                abstractC16910a.mo45956b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationStart(animator);
            BottomSheetLayout bottomSheetLayout = BottomSheet.this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout);
            bottomSheetLayout.setAnimating(true);
        }
    }

    /* renamed from: BL */
    private final void m90494BL(boolean z11) {
        boolean z12;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout;
        if (z11 && !this.f86208P0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 == this.f86218Z0) {
            return;
        }
        this.f86218Z0 = z12;
        FrameLayout frameLayout = this.f86217Y0;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (getContext() != null && this.f86198F0 != null && (linearLayout = this.f86199G0) != null) {
            if (this.f86218Z0) {
                AbstractC19074t.m100205c(linearLayout);
                Context context = getContext();
                AbstractC19074t.m100205c(context);
                linearLayout.setBackground(C27280g.m139658a(context, AbstractC2810d.bg_bottom_sheet_shadow));
                FrameLayout frameLayout2 = this.f86200H0;
                if (frameLayout2 != null) {
                    Context context2 = getContext();
                    AbstractC19074t.m100205c(context2);
                    frameLayout2.setPadding(0, C27276c.m139649b(context2, 14), 0, 0);
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    Context context3 = getContext();
                    AbstractC19074t.m100205c(context3);
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C27276c.m139649b(context3, 4);
                    FrameLayout frameLayout3 = this.f86217Y0;
                    if (frameLayout3 != null) {
                        frameLayout3.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC19074t.m100205c(linearLayout);
            Context context4 = getContext();
            AbstractC19074t.m100205c(context4);
            linearLayout.setBackground(C27280g.m139658a(context4, AbstractC2810d.bg_bottom_sheet));
            FrameLayout frameLayout4 = this.f86200H0;
            if (frameLayout4 != null) {
                Context context5 = getContext();
                AbstractC19074t.m100205c(context5);
                frameLayout4.setPadding(0, C27276c.m139649b(context5, 10), 0, 0);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                FrameLayout frameLayout5 = this.f86217Y0;
                if (frameLayout5 != null) {
                    frameLayout5.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: CL */
    private final void m90495CL() {
        float f11;
        if (this.f86215W0 != EnumC17017m.DETENTS) {
            return;
        }
        int m90514dL = m90514dL();
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.setCanCollapse(this.f86212T0);
            if (!this.f86212T0) {
                bottomSheetLayout.setMaxTranslationY(m90514dL);
                return;
            }
            int i11 = this.f86207O0;
            if (i11 != 0) {
                f11 = m90514dL - i11;
            } else {
                f11 = m90514dL * (1.0f - this.f86203K0);
            }
            bottomSheetLayout.setMaxTranslationY(f11);
        }
    }

    /* renamed from: DL */
    private final void m90496DL() {
        float max;
        if (this.f86215W0 != EnumC17017m.DETENTS) {
            return;
        }
        int m90514dL = m90514dL();
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.setCanExpand(this.f86211S0);
            if (!this.f86211S0) {
                bottomSheetLayout.setMinTranslationY(Math.max(bottomSheetLayout.getDefaultTranslationY() - (m90514dL * 0.1f), AbstractC17484n.Companion.m92931b()));
            } else {
                if (this.f86206N0 != 0) {
                    max = Math.max(m90514dL - r2, AbstractC17484n.Companion.m92931b());
                } else {
                    max = Math.max((1 - this.f86202J0) * m90514dL, AbstractC17484n.Companion.m92931b());
                }
                bottomSheetLayout.setMinTranslationY(max);
            }
            if (!this.f86204L0 && this.f86211S0) {
                bottomSheetLayout.setViewTranslationY(bottomSheetLayout.getMinTranslationY());
            } else {
                bottomSheetLayout.setViewTranslationY(bottomSheetLayout.getDefaultTranslationY());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FL */
    public static final void m90497FL(BottomSheet bottomSheet, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(bottomSheet, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        bottomSheet.mo45942T2(((Float) animatedValue).floatValue());
    }

    /* renamed from: HL */
    public static /* synthetic */ void m90498HL(BottomSheet bottomSheet, boolean z11, int i11, boolean z12, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                z12 = false;
            }
            bottomSheet.m90509GL(z11, i11, z12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateKeyboardHeightDetents");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public static final void m90504ZK(BottomSheet bottomSheet, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(bottomSheet, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        bottomSheet.mo45942T2(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kL */
    public static final void m90505kL(BottomSheet bottomSheet) {
        AbstractC19074t.m100208f(bottomSheet, "this$0");
        bottomSheet.m90508EL();
    }

    /* renamed from: pL */
    private final void m90506pL() {
        int i11;
        if (this.f86215W0 == EnumC17017m.DETENTS && this.f86208P0 && m90520jL()) {
            BottomSheetLayout bottomSheetLayout = this.f86198F0;
            if (bottomSheetLayout != null) {
                i11 = (int) bottomSheetLayout.getTranslationY();
            } else {
                i11 = 0;
            }
            LinearLayout linearLayout = this.f86199G0;
            if (linearLayout != null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), i11);
            }
        }
    }

    /* renamed from: AL */
    public final void m90507AL(boolean z11) {
        this.f86213U0 = z11;
    }

    /* renamed from: EL */
    public final void m90508EL() {
        float f11;
        float max;
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout == null) {
            return;
        }
        AbstractC19074t.m100205c(bottomSheetLayout);
        bottomSheetLayout.setViewTranslationY(m90514dL() - 1);
        this.f86193A0 = new AnimatorSet();
        int i11 = this.f86205M0;
        if (i11 == 0) {
            i11 = m90512bL();
        }
        float f12 = 0.0f;
        if (!this.f86204L0 && this.f86211S0) {
            BottomSheetLayout bottomSheetLayout2 = this.f86198F0;
            if (bottomSheetLayout2 != null) {
                max = bottomSheetLayout2.getMinTranslationY();
            } else {
                max = 0.0f;
            }
        } else {
            BottomSheetLayout bottomSheetLayout3 = this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout3);
            float minTranslationY = bottomSheetLayout3.getMinTranslationY();
            if (this.f86208P0) {
                f11 = AbstractC17484n.Companion.m92931b();
            } else {
                f11 = 0.0f;
            }
            float max2 = Math.max(minTranslationY, f11);
            if (this.f86205M0 != 0) {
                max = Math.max(m90514dL() - this.f86205M0, max2);
            } else {
                max = Math.max((1.0f - this.f86201I0) * m90514dL(), max2);
            }
        }
        BottomSheetLayout bottomSheetLayout4 = this.f86198F0;
        float[] fArr = new float[1];
        if (this.f86215W0 == EnumC17017m.HUG_CONTENT) {
            float m90514dL = m90514dL() - i11;
            BottomSheetLayout bottomSheetLayout5 = this.f86198F0;
            if (bottomSheetLayout5 != null) {
                f12 = bottomSheetLayout5.getMinTranslationY();
            }
            max = Math.max(m90514dL, f12);
        }
        fArr[0] = max;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bottomSheetLayout4, "translationY", fArr);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheet.m90497FL(BottomSheet.this, valueAnimator);
            }
        });
        AnimatorSet animatorSet = this.f86193A0;
        AbstractC19074t.m100205c(animatorSet);
        animatorSet.play(ofFloat);
        AnimatorSet animatorSet2 = this.f86193A0;
        AbstractC19074t.m100205c(animatorSet2);
        animatorSet2.setDuration(this.f86196D0);
        AnimatorSet animatorSet3 = this.f86193A0;
        AbstractC19074t.m100205c(animatorSet3);
        animatorSet3.setInterpolator(new C26088c());
        AnimatorSet animatorSet4 = this.f86193A0;
        AbstractC19074t.m100205c(animatorSet4);
        animatorSet4.addListener(new C16913d());
        AnimatorSet animatorSet5 = this.f86193A0;
        AbstractC19074t.m100205c(animatorSet5);
        animatorSet5.start();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public final View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext()");
        BottomSheetLayoutNestedParent bottomSheetLayoutNestedParent = new BottomSheetLayoutNestedParent(m92689tK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 1;
        bottomSheetLayoutNestedParent.setLayoutParams(layoutParams);
        this.f86198F0 = bottomSheetLayoutNestedParent;
        layoutInflater.inflate(AbstractC2812f.zds_bottom_sheet_layout, (ViewGroup) bottomSheetLayoutNestedParent, true);
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.setOnClickListener(this);
        }
        BottomSheetLayout bottomSheetLayout2 = this.f86198F0;
        if (bottomSheetLayout2 != null) {
            bottomSheetLayout2.setBottomSheetLayoutListener(this);
        }
        BottomSheetLayout bottomSheetLayout3 = this.f86198F0;
        FrameLayout frameLayout2 = null;
        if (bottomSheetLayout3 != null) {
            linearLayout = (LinearLayout) bottomSheetLayout3.findViewById(AbstractC2811e.bottom_sheet_container);
        } else {
            linearLayout = null;
        }
        this.f86199G0 = linearLayout;
        BottomSheetLayout bottomSheetLayout4 = this.f86198F0;
        if (bottomSheetLayout4 != null) {
            frameLayout = (FrameLayout) bottomSheetLayout4.findViewById(AbstractC2811e.icn_slide_hint);
        } else {
            frameLayout = null;
        }
        this.f86200H0 = frameLayout;
        BottomSheetLayout bottomSheetLayout5 = this.f86198F0;
        if (bottomSheetLayout5 != null) {
            frameLayout2 = (FrameLayout) bottomSheetLayout5.findViewById(AbstractC2811e.bottom_sheet_visible_layout);
        }
        this.f86217Y0 = frameLayout2;
        m90533zL(EnumC17017m.DETENTS);
        m90528wL(this.f86208P0);
        m90532yL(this.f86219a1);
        this.f86220z0 = new C25808b(new WeakReference(this.f86198F0));
        mo45682lL(layoutInflater, this.f86199G0, bundle);
        return this.f86198F0;
    }

    /* renamed from: GL */
    public final void m90509GL(boolean z11, int i11, boolean z12) {
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.m90795m(z11, i11, z12);
        }
    }

    /* renamed from: P2 */
    public View mo45941P2() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:            if (r4.f86209Q0 != 0.0f) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:            if (r5 != r4.f86209Q0) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:            if (r5 != 0.0f) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:            r1 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003d, code lost:            m90494BL(true ^ r1);        r4.f86209Q0 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0015, code lost:            if (r4.f86211S0 != false) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:            if (r0.getWidth() == r4.f86210R0) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:            r0 = r4.f86199G0;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:            if (r0 == null) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:            fn0.AbstractC19074t.m100205c(r0);        r4.f86210R0 = r0.getWidth();     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:            if (r5 != 0.0f) goto L16;     */
    /* renamed from: T2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo45942T2(float f11) {
        LinearLayout linearLayout = this.f86199G0;
        if (linearLayout != null) {
            AbstractC19074t.m100205c(linearLayout);
        }
        if (!this.f86208P0) {
        }
        FrameLayout frameLayout = this.f86217Y0;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            int m90517gL = m90517gL();
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (m90517gL > f11) {
                m90517gL -= (int) f11;
            }
            layoutParams.height = m90517gL;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: X0 */
    public boolean mo47166X0(float f11, boolean z11, float f12) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            m90521oL();
        }
    }

    /* renamed from: YK */
    public final void m90510YK(EnumC17943b enumC17943b) {
        AbstractC19074t.m100208f(enumC17943b, "state");
        this.f86216X0 = enumC17943b;
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.m90789c(enumC17943b);
        }
    }

    /* renamed from: aL */
    public final boolean m90511aL() {
        return this.f86211S0;
    }

    /* renamed from: bL */
    public int m90512bL() {
        LinearLayout linearLayout = this.f86199G0;
        if (linearLayout != null) {
            return linearLayout.getHeight();
        }
        return 0;
    }

    /* renamed from: cL */
    public final EnumC17943b m90513cL() {
        EnumC17943b currentState;
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout == null || (currentState = bottomSheetLayout.getCurrentState()) == null) {
            return EnumC17943b.DEFAULT;
        }
        return currentState;
    }

    public void close() {
        AnimatorSet animatorSet = this.f86193A0;
        if (animatorSet != null) {
            AbstractC19074t.m100205c(animatorSet);
            animatorSet.cancel();
        }
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            AbstractC19074t.m100205c(bottomSheetLayout);
            bottomSheetLayout.m90794k();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f86198F0, "translationY", m90514dL());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zdesign.component.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheet.m90504ZK(BottomSheet.this, valueAnimator);
            }
        });
        animatorSet2.playTogether(ofFloat);
        animatorSet2.setDuration(this.f86197E0);
        animatorSet2.setInterpolator(new C26086a());
        animatorSet2.addListener(new C16911b());
        animatorSet2.start();
    }

    /* renamed from: dL */
    public int m90514dL() {
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout == null) {
            return 0;
        }
        AbstractC19074t.m100205c(bottomSheetLayout);
        return bottomSheetLayout.getHeight();
    }

    /* renamed from: e2 */
    public void mo66253e2(boolean z11, float f11) {
    }

    /* renamed from: eL */
    public final AbstractC16910a m90515eL() {
        return this.f86194B0;
    }

    /* renamed from: fL */
    public final EnumC17017m m90516fL() {
        return this.f86215W0;
    }

    /* renamed from: gL */
    public int m90517gL() {
        int i11;
        int m90512bL = m90512bL();
        if (this.f86208P0) {
            return m90512bL;
        }
        if (this.f86218Z0) {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext()");
            i11 = C27276c.m139649b(m92689tK, 4);
        } else {
            i11 = 0;
        }
        int i12 = this.f86205M0;
        if (i12 > 0) {
            return i12 - i11;
        }
        if (m90512bL <= 0) {
            return 0;
        }
        return m90512bL - i11;
    }

    /* renamed from: hL */
    public final BottomSheetLayout m90518hL() {
        return this.f86198F0;
    }

    /* renamed from: iL */
    public final boolean m90519iL() {
        return this.f86214V0;
    }

    /* renamed from: jL */
    public final boolean m90520jL() {
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout == null) {
            return false;
        }
        if (this.f86215W0 == EnumC17017m.DETENTS) {
            if (this.f86211S0) {
                AbstractC19074t.m100205c(bottomSheetLayout);
                int translationY = (int) bottomSheetLayout.getTranslationY();
                BottomSheetLayout bottomSheetLayout2 = this.f86198F0;
                AbstractC19074t.m100205c(bottomSheetLayout2);
                if (translationY != ((int) bottomSheetLayout2.getMinTranslationY())) {
                    return false;
                }
            } else {
                AbstractC19074t.m100205c(bottomSheetLayout);
                int translationY2 = (int) bottomSheetLayout.getTranslationY();
                BottomSheetLayout bottomSheetLayout3 = this.f86198F0;
                AbstractC19074t.m100205c(bottomSheetLayout3);
                if (translationY2 != ((int) bottomSheetLayout3.getDefaultTranslationY())) {
                    return false;
                }
            }
        } else {
            AbstractC19074t.m100205c(bottomSheetLayout);
            if (bottomSheetLayout.getTranslationY() != 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: lL */
    protected abstract void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle);

    /* renamed from: mL */
    public void mo66254mL() {
        float f11;
        if (this.f86198F0 == null) {
            return;
        }
        int m90514dL = m90514dL();
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        AbstractC19074t.m100205c(bottomSheetLayout);
        bottomSheetLayout.setMaxY(m90514dL());
        if (this.f86215W0 == EnumC17017m.HUG_CONTENT) {
            int i11 = this.f86205M0;
            if (i11 == 0) {
                i11 = m90512bL();
            }
            BottomSheetLayout bottomSheetLayout2 = this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout2);
            bottomSheetLayout2.setMaxTranslationY(m90514dL);
            BottomSheetLayout bottomSheetLayout3 = this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout3);
            float f12 = m90514dL - i11;
            bottomSheetLayout3.setMinTranslationY(f12);
            BottomSheetLayout bottomSheetLayout4 = this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout4);
            bottomSheetLayout4.setDefaultTranslationY(f12);
            BottomSheetLayout bottomSheetLayout5 = this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout5);
            BottomSheetLayout bottomSheetLayout6 = this.f86198F0;
            AbstractC19074t.m100205c(bottomSheetLayout6);
            bottomSheetLayout5.setViewTranslationY(bottomSheetLayout6.getDefaultTranslationY());
            return;
        }
        BottomSheetLayout bottomSheetLayout7 = this.f86198F0;
        AbstractC19074t.m100205c(bottomSheetLayout7);
        int i12 = this.f86205M0;
        if (i12 != 0) {
            f11 = m90514dL - i12;
        } else {
            f11 = m90514dL * (1.0f - this.f86201I0);
        }
        bottomSheetLayout7.setDefaultTranslationY(f11);
        m90496DL();
        m90495CL();
    }

    /* renamed from: nL */
    public void mo66255nL() {
        m90506pL();
    }

    /* renamed from: oL */
    public final void m90521oL() {
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC16912c(bottomSheetLayout));
        }
    }

    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
    }

    @Override // com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m90532yL(this.f86219a1);
    }

    /* renamed from: qL */
    public final void m90522qL(boolean z11) {
        this.f86211S0 = z11;
        m90496DL();
    }

    /* renamed from: rL */
    public final void m90523rL(int i11) {
        this.f86205M0 = i11;
        LinearLayout linearLayout = this.f86199G0;
        if (linearLayout != null && this.f86215W0 != EnumC17017m.DETENTS) {
            AbstractC19074t.m100205c(linearLayout);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (i11 == 0) {
                layoutParams.height = -2;
            } else {
                layoutParams.height = this.f86205M0;
            }
            LinearLayout linearLayout2 = this.f86199G0;
            AbstractC19074t.m100205c(linearLayout2);
            linearLayout2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: sL */
    public final void m90524sL(float f11) {
        if (f11 <= 0.0f || f11 > 1.0f) {
            f11 = 0.5f;
        }
        this.f86201I0 = f11;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86220z0;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86220z0;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* renamed from: st */
    public void mo66256st(float f11) {
        m90506pL();
    }

    /* renamed from: tL */
    public final void m90525tL(boolean z11) {
        this.f86195C0 = z11;
    }

    /* renamed from: uL */
    public final void m90526uL(View view, FrameLayout.LayoutParams layoutParams) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(layoutParams, "layoutParams");
        FrameLayout frameLayout = this.f86217Y0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
        view.setVisibility(0);
        FrameLayout frameLayout2 = this.f86217Y0;
        if (frameLayout2 != null) {
            frameLayout2.addView(view, layoutParams);
        }
    }

    /* renamed from: vL */
    public final void m90527vL(int i11) {
        FrameLayout frameLayout = this.f86200H0;
        AbstractC19074t.m100205c(frameLayout);
        frameLayout.setVisibility(i11);
    }

    /* renamed from: wL */
    public final void m90528wL(boolean z11) {
        this.f86208P0 = z11;
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.setIsModalType(z11);
        }
        m90494BL(!z11);
    }

    @Override // com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: x3 */
    public void mo90529x3() {
        if (this.f86195C0) {
            close();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        View m92656bJ;
        super.mo37135xJ(bundle);
        if (this.f86213U0 && (m92656bJ = m92656bJ()) != null) {
            m92656bJ.post(new Runnable() { // from class: com.zing.zalo.zdesign.component.j
                @Override // java.lang.Runnable
                public final void run() {
                    BottomSheet.m90505kL(BottomSheet.this);
                }
            });
        }
    }

    /* renamed from: xL */
    public final void m90530xL(AbstractC16910a abstractC16910a) {
        this.f86194B0 = abstractC16910a;
    }

    @Override // com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: y3 */
    public void mo90531y3() {
    }

    /* renamed from: yL */
    public final void m90532yL(boolean z11) {
        ViewGroup.LayoutParams layoutParams;
        int i11 = m92651WI().getDisplayMetrics().widthPixels;
        this.f86219a1 = z11;
        if (this.f86199G0 == null) {
            return;
        }
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext()");
        int m139649b = C27276c.m139649b(m92689tK, 1);
        LinearLayout linearLayout = this.f86199G0;
        AbstractC19074t.m100205c(linearLayout);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        FrameLayout frameLayout = this.f86217Y0;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (z11) {
            layoutParams2.width = -1;
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
        } else {
            Context m92689tK2 = m92689tK();
            AbstractC19074t.m100207e(m92689tK2, "requireContext()");
            int min = Math.min(i11, C27276c.m139649b(m92689tK2, 512));
            layoutParams2.width = min;
            if (layoutParams != null) {
                layoutParams.width = min;
            }
        }
        LinearLayout linearLayout2 = this.f86199G0;
        AbstractC19074t.m100205c(linearLayout2);
        linearLayout2.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.f86217Y0;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams);
        }
        if (!this.f86208P0) {
            LinearLayout linearLayout3 = this.f86199G0;
            AbstractC19074t.m100205c(linearLayout3);
            LinearLayout linearLayout4 = this.f86199G0;
            AbstractC19074t.m100205c(linearLayout4);
            int paddingTop = linearLayout4.getPaddingTop();
            LinearLayout linearLayout5 = this.f86199G0;
            AbstractC19074t.m100205c(linearLayout5);
            linearLayout3.setPadding(m139649b, paddingTop, m139649b, linearLayout5.getPaddingBottom());
        }
    }

    /* renamed from: zL */
    public final void m90533zL(EnumC17017m enumC17017m) {
        boolean z11;
        AbstractC19074t.m100208f(enumC17017m, "mode");
        this.f86215W0 = enumC17017m;
        LinearLayout linearLayout = this.f86199G0;
        if (linearLayout == null) {
            return;
        }
        AbstractC19074t.m100205c(linearLayout);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (enumC17017m == EnumC17017m.HUG_CONTENT) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = -1;
        }
        LinearLayout linearLayout2 = this.f86199G0;
        AbstractC19074t.m100205c(linearLayout2);
        linearLayout2.setLayoutParams(layoutParams);
        BottomSheetLayout bottomSheetLayout = this.f86198F0;
        if (bottomSheetLayout != null) {
            if (enumC17017m == EnumC17017m.DETENTS) {
                z11 = true;
            } else {
                z11 = false;
            }
            bottomSheetLayout.setIsDetentsMode(z11);
        }
    }
}
