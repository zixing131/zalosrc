package com.zing.zalo.p077ui.zviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import bi0.AbstractC2807a;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.C23212s8;
import p494rv.C25979a;
import p500s1.C26086a;
import p500s1.C26088c;
import p667y2.C30268e;

/* loaded from: classes6.dex */
public abstract class ModalBottomSheet extends CommonZaloview implements ZaloView.InterfaceC17421f {
    public static final C14647a Companion = new C14647a(null);

    /* renamed from: S0 */
    private static final int f75349S0 = View.generateViewId();

    /* renamed from: L0 */
    private ViewGroup f75350L0;

    /* renamed from: M0 */
    private ViewGroup f75351M0;

    /* renamed from: N0 */
    private BottomSheet f75352N0;

    /* renamed from: O0 */
    private boolean f75353O0;

    /* renamed from: P0 */
    private BottomSheet.AbstractC16910a f75354P0;

    /* renamed from: Q0 */
    private boolean f75355Q0;

    /* renamed from: R0 */
    private AnimatorSet f75356R0;

    /* loaded from: classes6.dex */
    public static class ContentBottomSheet extends BottomSheet {
        @Override // com.zing.zalo.zdesign.component.BottomSheet
        /* renamed from: lL */
        protected final void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
            ModalBottomSheet modalBottomSheet;
            AbstractC19074t.m100208f(layoutInflater, "inflater");
            ZaloView m92650VI = m92650VI();
            if (m92650VI instanceof ModalBottomSheet) {
                modalBottomSheet = (ModalBottomSheet) m92650VI;
            } else {
                modalBottomSheet = null;
            }
            if (modalBottomSheet != null) {
                modalBottomSheet.mo49571nM(this, layoutInflater, linearLayout, bundle);
            }
        }
    }

    /* loaded from: classes6.dex */
    private static final class InterceptTouchFrameLayout extends FrameLayout {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public InterceptTouchFrameLayout(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
            AbstractC19074t.m100208f(context, "context");
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 3) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public /* synthetic */ InterceptTouchFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterceptTouchFrameLayout(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            AbstractC19074t.m100208f(context, "context");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ModalBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C14647a {
        private C14647a() {
        }

        public /* synthetic */ C14647a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m81935a() {
            return ModalBottomSheet.f75349S0;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ModalBottomSheet$b */
    /* loaded from: classes6.dex */
    public static final class C14648b extends AnimatorListenerAdapter {
        C14648b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            ModalBottomSheet.this.m81932pM(false);
            ViewGroup m81930kM = ModalBottomSheet.this.m81930kM();
            if (m81930kM != null) {
                m81930kM.setVisibility(8);
            }
            ModalBottomSheet.this.finish();
            BottomSheet.AbstractC16910a m81929jM = ModalBottomSheet.this.m81929jM();
            if (m81929jM != null) {
                m81929jM.mo45955a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            ModalBottomSheet.this.m81932pM(false);
            ViewGroup m81930kM = ModalBottomSheet.this.m81930kM();
            if (m81930kM != null) {
                m81930kM.setVisibility(8);
            }
            ModalBottomSheet.this.finish();
            BottomSheet.AbstractC16910a m81929jM = ModalBottomSheet.this.m81929jM();
            if (m81929jM != null) {
                m81929jM.mo45955a();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ModalBottomSheet$c */
    /* loaded from: classes6.dex */
    public static final class C14649c extends BottomSheet.AbstractC16910a {
        C14649c() {
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            ModalBottomSheet.this.m81927hM();
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
            BottomSheet bottomSheet = ModalBottomSheet.this.f75352N0;
            if (bottomSheet != null) {
                bottomSheet.mo66255nL();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ModalBottomSheet$d */
    /* loaded from: classes6.dex */
    public static final class C14650d implements Animator.AnimatorListener {
        public C14650d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            BottomSheet.AbstractC16910a m81929jM = ModalBottomSheet.this.m81929jM();
            if (m81929jM != null) {
                m81929jM.mo45956b();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m81925lM(ModalBottomSheet modalBottomSheet) {
        AbstractC19074t.m100208f(modalBottomSheet, "this$0");
        modalBottomSheet.m81934rM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m81926oM(ModalBottomSheet modalBottomSheet, View view) {
        AbstractC19074t.m100208f(modalBottomSheet, "this$0");
        modalBottomSheet.m81928iM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        InterceptTouchFrameLayout interceptTouchFrameLayout = new InterceptTouchFrameLayout(context, null, 0, 6, null);
        interceptTouchFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        interceptTouchFrameLayout.setAlpha(0.0f);
        interceptTouchFrameLayout.setVisibility(4);
        interceptTouchFrameLayout.setBackgroundColor(C23212s8.m119607o(interceptTouchFrameLayout.getContext(), AbstractC2807a.overlay_background));
        interceptTouchFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.xy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModalBottomSheet.m81926oM(ModalBottomSheet.this, view);
            }
        });
        this.f75350L0 = interceptTouchFrameLayout;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(f75349S0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        ViewGroup viewGroup2 = this.f75350L0;
        if (viewGroup2 != null) {
            viewGroup2.addView(frameLayout);
        }
        this.f75351M0 = frameLayout;
        return this.f75350L0;
    }

    public final void close() {
        m81928iM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        BottomSheet bottomSheet = this.f75352N0;
        if (bottomSheet != null) {
            bottomSheet.finish();
        }
        super.finish();
    }

    /* renamed from: hM */
    public final void m81927hM() {
        AnimatorSet animatorSet = this.f75356R0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ObjectAnimator.ofFloat(this.f75350L0, "alpha", 0.0f));
        animatorSet2.setDuration(250L);
        animatorSet2.setInterpolator(new C26086a());
        animatorSet2.addListener(new C14648b());
        animatorSet2.start();
    }

    /* renamed from: iM */
    public final void m81928iM() {
        if (!this.f75353O0) {
            this.f75353O0 = true;
            BottomSheet bottomSheet = this.f75352N0;
            if (bottomSheet != null) {
                bottomSheet.close();
            }
        }
    }

    /* renamed from: jM */
    public final BottomSheet.AbstractC16910a m81929jM() {
        return this.f75354P0;
    }

    /* renamed from: kM */
    public final ViewGroup m81930kM() {
        return this.f75350L0;
    }

    /* renamed from: mM */
    protected final ContentBottomSheet m81931mM() {
        return new ContentBottomSheet();
    }

    /* renamed from: nM */
    protected abstract void mo49571nM(BottomSheet bottomSheet, LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle);

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m92643OI(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent)) {
            return true;
        }
        BottomSheet bottomSheet = this.f75352N0;
        if (bottomSheet != null && bottomSheet.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            m81928iM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f75355Q0) {
            View m92656bJ = m92656bJ();
            if (m92656bJ != null) {
                m92656bJ.bringToFront();
            }
            this.f75355Q0 = false;
        }
    }

    /* renamed from: pM */
    public final void m81932pM(boolean z11) {
        this.f75353O0 = z11;
    }

    /* renamed from: qM */
    public final void m81933qM(BottomSheet.AbstractC16910a abstractC16910a) {
        this.f75354P0 = abstractC16910a;
    }

    /* renamed from: rM */
    public final void m81934rM() {
        ViewGroup viewGroup = this.f75350L0;
        if (viewGroup != null) {
            viewGroup.setAlpha(0.0f);
        }
        ViewGroup viewGroup2 = this.f75350L0;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f75350L0, "alpha", 1.0f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new C26088c());
        animatorSet.start();
        animatorSet.addListener(new C14650d());
        this.f75356R0 = animatorSet;
        BottomSheet bottomSheet = this.f75352N0;
        if (bottomSheet != null) {
            bottomSheet.m90508EL();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null) {
            m92642L3 = AbstractC1438d.m7340a();
        }
        Bundle bundle2 = m92642L3;
        AbstractC19074t.m100205c(bundle2);
        ContentBottomSheet m81931mM = m81931mM();
        this.f75352N0 = m81931mM;
        boolean z11 = true;
        if (m81931mM != null) {
            m81931mM.m90528wL(true);
        }
        ZaloView m92996E0 = m92649TI().m92996E0("inner-bottom-sheet");
        if (m92996E0 != null) {
            m92649TI().mo92702G1(m92996E0, 0);
        }
        m92649TI().mo93055b2(f75349S0, this.f75352N0, bundle2, 0, "inner-bottom-sheet", 0, false);
        BottomSheet bottomSheet = this.f75352N0;
        if (bottomSheet != null) {
            bottomSheet.m90530xL(new C14649c());
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.yy
            @Override // java.lang.Runnable
            public final void run() {
                ModalBottomSheet.m81925lM(ModalBottomSheet.this);
            }
        });
        if (bundle == null) {
            z11 = false;
        }
        this.f75355Q0 = z11;
    }
}
