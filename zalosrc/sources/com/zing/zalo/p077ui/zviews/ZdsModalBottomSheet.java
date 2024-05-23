package com.zing.zalo.p077ui.zviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import me0.C23212s8;
import p227i3.C20218v;
import p363nh.C23744a;
import p494rv.C25979a;
import p500s1.C26086a;
import p500s1.C26088c;

/* loaded from: classes6.dex */
public abstract class ZdsModalBottomSheet extends CommonZaloview implements View.OnClickListener, ZaloView.InterfaceC17421f {
    public static final C15409a Companion = new C15409a(null);

    /* renamed from: L0 */
    private View f79710L0;

    /* renamed from: M0 */
    private FrameLayout f79711M0;

    /* renamed from: N0 */
    private BottomSheet f79712N0;

    /* renamed from: O0 */
    private boolean f79713O0;

    /* renamed from: P0 */
    private boolean f79714P0;

    /* renamed from: Q0 */
    private String f79715Q0;

    /* renamed from: R0 */
    private AnimatorSet f79716R0;

    /* renamed from: com.zing.zalo.ui.zviews.ZdsModalBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C15409a {
        private C15409a() {
        }

        public /* synthetic */ C15409a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZdsModalBottomSheet$b */
    /* loaded from: classes6.dex */
    public static final class C15410b extends AnimatorListenerAdapter {
        C15410b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            ZdsModalBottomSheet.this.m87196oM(false);
            View m87195jM = ZdsModalBottomSheet.this.m87195jM();
            if (m87195jM != null) {
                m87195jM.setVisibility(8);
            }
            ZdsModalBottomSheet.this.finish();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            ZdsModalBottomSheet.this.m87196oM(false);
            View m87195jM = ZdsModalBottomSheet.this.m87195jM();
            if (m87195jM != null) {
                m87195jM.setVisibility(8);
            }
            ZdsModalBottomSheet.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZdsModalBottomSheet$c */
    /* loaded from: classes6.dex */
    public static final class C15411c extends BottomSheet.AbstractC16910a {
        C15411c() {
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            ZdsModalBottomSheet.this.close();
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
            BottomSheet m87194iM = ZdsModalBottomSheet.this.m87194iM();
            if (m87194iM != null) {
                m87194iM.mo66255nL();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public static final void m87190hM(ZdsModalBottomSheet zdsModalBottomSheet) {
        AbstractC19074t.m100208f(zdsModalBottomSheet, "this$0");
        zdsModalBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m87191lM(ZdsModalBottomSheet zdsModalBottomSheet) {
        AbstractC19074t.m100208f(zdsModalBottomSheet, "this$0");
        zdsModalBottomSheet.m87197pM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m87192mM(ZdsModalBottomSheet zdsModalBottomSheet, View view) {
        AbstractC19074t.m100208f(zdsModalBottomSheet, "this$0");
        zdsModalBottomSheet.m87193gM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.frame_layout_btm_sheet, viewGroup, false);
        this.f79710L0 = inflate;
        if (inflate != null) {
            frameLayout = (FrameLayout) inflate.findViewById(AbstractC6918a0.fl_bottom_container);
        } else {
            frameLayout = null;
        }
        this.f79711M0 = frameLayout;
        View view = this.f79710L0;
        if (view != null) {
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC2807a.overlay_background));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.d81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ZdsModalBottomSheet.m87192mM(ZdsModalBottomSheet.this, view2);
                }
            });
            view.setVisibility(4);
        }
        return this.f79710L0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        if (this.f79715Q0 != null) {
            C23744a.Companion.m124119a().m124117e(this, 92);
        }
    }

    public void close() {
        AnimatorSet animatorSet = this.f79716R0;
        if (animatorSet != null && animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ObjectAnimator.ofFloat(this.f79710L0, "alpha", 0.0f));
        animatorSet2.setDuration(50L);
        animatorSet2.setInterpolator(new C26086a());
        animatorSet2.addListener(new C15410b());
        animatorSet2.start();
    }

    /* renamed from: gM */
    public final void m87193gM() {
        if (!this.f79713O0) {
            this.f79713O0 = true;
            BottomSheet bottomSheet = this.f79712N0;
            if (bottomSheet != null) {
                bottomSheet.close();
            }
        }
    }

    /* renamed from: iM */
    public final BottomSheet m87194iM() {
        return this.f79712N0;
    }

    /* renamed from: jM */
    public final View m87195jM() {
        return this.f79710L0;
    }

    /* renamed from: kM */
    public String mo50389kM() {
        return "BottomSheet";
    }

    /* renamed from: nM */
    protected abstract BottomSheet mo45673nM();

    /* renamed from: oM */
    public final void m87196oM(boolean z11) {
        this.f79713O0 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m92643OI(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent)) {
            return true;
        }
        BottomSheet bottomSheet = this.f79712N0;
        if (bottomSheet != null) {
            AbstractC19074t.m100205c(bottomSheet);
            if (bottomSheet.onKeyUp(i11, keyEvent)) {
                return true;
            }
        }
        if (i11 == 4) {
            m87193gM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f79714P0) {
            View m92656bJ = m92656bJ();
            if (m92656bJ != null) {
                m92656bJ.bringToFront();
            }
            this.f79714P0 = false;
        }
    }

    /* renamed from: pM */
    public final void m87197pM() {
        View view = this.f79710L0;
        if (view != null) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f79710L0, "alpha", 1.0f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new C26088c());
        animatorSet.start();
        this.f79716R0 = animatorSet;
        BottomSheet bottomSheet = this.f79712N0;
        if (bottomSheet != null) {
            bottomSheet.m90508EL();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 92) {
            try {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                if (TextUtils.equals((String) obj, this.f79715Q0)) {
                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.b81
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZdsModalBottomSheet.m87190hM(ZdsModalBottomSheet.this);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z11 = true;
        if (m92642L3 != null) {
            this.f79715Q0 = m92642L3.getString("CONVERSATION_ID", null);
            String mo50389kM = mo50389kM();
            ZaloView m92996E0 = m92649TI().m92996E0(mo50389kM);
            if (m92996E0 != null) {
                m92649TI().mo92702G1(m92996E0, 0);
            }
            BottomSheet mo45673nM = mo45673nM();
            this.f79712N0 = mo45673nM;
            if (mo45673nM != null) {
                mo45673nM.m90507AL(false);
                mo45673nM.m90528wL(true);
                mo45673nM.m90530xL(new C15411c());
                m92649TI().mo93055b2(AbstractC6918a0.fl_bottom_container, mo45673nM, m92642L3, 0, mo50389kM, 0, false);
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.c81
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZdsModalBottomSheet.m87191lM(ZdsModalBottomSheet.this);
                    }
                });
            }
            if (this.f79715Q0 != null) {
                C23744a.Companion.m124119a().m124115b(this, 92);
            }
        }
        if (bundle == null) {
            z11 = false;
        }
        this.f79714P0 = z11;
    }
}
