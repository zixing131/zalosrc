package com.zing.zalo.uicontrol.contentpickerpopup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.zviews.ProgressDialogView;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.util.ArrayList;
import p500s1.C26088c;
import sc0.InterfaceC26227e;

/* loaded from: classes4.dex */
public abstract class ContentPickerPopupView extends DialogView implements InterfaceC26227e {

    /* renamed from: I0 */
    protected View f83659I0;

    /* renamed from: J0 */
    public View f83660J0;

    /* renamed from: K0 */
    protected InterfaceC16568b f83661K0;

    /* renamed from: L0 */
    protected ProgressDialogView f83662L0;

    /* renamed from: H0 */
    protected boolean f83658H0 = false;

    /* renamed from: M0 */
    protected Handler f83663M0 = new Handler(Looper.getMainLooper());

    /* renamed from: N0 */
    protected View.OnClickListener f83664N0 = new View.OnClickListener() { // from class: sc0.b
        public /* synthetic */ ViewOnClickListenerC26224b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ContentPickerPopupView.this.m88266cL(view);
        }
    };

    /* renamed from: com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView$a */
    /* loaded from: classes4.dex */
    public static class C16567a extends KeyEventCallbackC17462c {

        /* renamed from: I */
        InterfaceC26227e f83665I;

        /* renamed from: J */
        InterfaceC17463d.g f83666J;

        /* renamed from: K */
        Animator f83667K;

        /* renamed from: com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView$a$a */
        /* loaded from: classes4.dex */
        public class a implements Animator.AnimatorListener {
            a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                InterfaceC26227e interfaceC26227e = C16567a.this.f83665I;
                if (interfaceC26227e != null) {
                    interfaceC26227e.mo88270Uo();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView$a$b */
        /* loaded from: classes4.dex */
        public class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C16567a.super.dismiss();
            }
        }

        public C16567a(Context context, int i11, InterfaceC26227e interfaceC26227e) {
            super(context, i11);
            this.f83665I = interfaceC26227e;
            super.mo88280H(new InterfaceC17463d.g() { // from class: sc0.d
                public /* synthetic */ C26226d() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
                /* renamed from: a */
                public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                    ContentPickerPopupView.C16567a.this.m88279N(interfaceC17463d);
                }
            });
        }

        /* renamed from: N */
        public /* synthetic */ void m88279N(InterfaceC17463d interfaceC17463d) {
            Animator animator;
            InterfaceC26227e interfaceC26227e = this.f83665I;
            if (interfaceC26227e != null) {
                animator = interfaceC26227e.mo76797GH();
            } else {
                animator = null;
            }
            if (animator != null) {
                animator.addListener(new a());
                animator.start();
            } else {
                InterfaceC26227e interfaceC26227e2 = this.f83665I;
                if (interfaceC26227e2 != null) {
                    interfaceC26227e2.mo88270Uo();
                }
            }
            InterfaceC17463d.g gVar = this.f83666J;
            if (gVar != null) {
                gVar.mo12456a(interfaceC17463d);
            }
        }

        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
        /* renamed from: H */
        public void mo88280H(InterfaceC17463d.g gVar) {
            this.f83666J = gVar;
        }

        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, com.zing.zalo.zview.dialog.InterfaceC17463d
        public void dismiss() {
            Animator animator;
            if (!m92868m()) {
                return;
            }
            Animator animator2 = this.f83667K;
            if (animator2 != null && animator2.isStarted()) {
                return;
            }
            InterfaceC26227e interfaceC26227e = this.f83665I;
            if (interfaceC26227e != null) {
                animator = interfaceC26227e.mo76798ef();
            } else {
                animator = null;
            }
            if (animator != null) {
                animator.addListener(new b());
                this.f83667K = animator;
                animator.start();
                return;
            }
            super.dismiss();
        }

        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
        /* renamed from: l */
        public void mo88281l() {
            InterfaceC26227e interfaceC26227e = this.f83665I;
            if (interfaceC26227e != null && interfaceC26227e.mo88269Cu()) {
                return;
            }
            super.mo88281l();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16568b {
        /* renamed from: a */
        void mo60387a();

        void onDismiss();
    }

    /* renamed from: bL */
    public /* synthetic */ void m88265bL() {
        try {
            ProgressDialogView progressDialogView = this.f83662L0;
            if (progressDialogView != null && progressDialogView.m92595KK()) {
                this.f83662L0.dismiss();
                this.f83662L0 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cL */
    public /* synthetic */ void m88266cL(View view) {
        dismiss();
    }

    /* renamed from: dL */
    public /* synthetic */ void m88267dL(InterfaceC17463d interfaceC17463d) {
        m88273fL();
    }

    /* renamed from: B8 */
    public void m88268B8(CharSequence charSequence, boolean z11) {
        try {
            ProgressDialogView progressDialogView = this.f83662L0;
            if (progressDialogView != null && progressDialogView.m92595KK()) {
                this.f83662L0.dismiss();
                this.f83662L0 = null;
            }
            if (this.f83662L0 == null) {
                this.f83662L0 = new ProgressDialogView();
            }
            this.f83662L0.mo43041MK(z11);
            if (charSequence != null) {
                this.f83662L0.m83097WK(charSequence);
            } else {
                this.f83662L0.m83097WK(m92652XI(AbstractC8020f0.PROCESSING));
            }
            this.f83662L0.mo83093TK(m92649TI());
            this.f83662L0.m92597OK(new InterfaceC17463d.c() { // from class: sc0.c
                public /* synthetic */ C26225c() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    ContentPickerPopupView.this.m88267dL(interfaceC17463d);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92642L3() == null) {
            return;
        }
        this.f83658H0 = m92642L3().getBoolean("showDim", true);
    }

    @Override // sc0.InterfaceC26227e
    /* renamed from: Cu */
    public final boolean mo88269Cu() {
        return mo60294yp();
    }

    /* renamed from: GH */
    public Animator mo76797GH() {
        int i11;
        if (m92642L3() != null) {
            i11 = m92642L3().getInt("window_animation_type", 0);
        } else {
            i11 = 0;
        }
        if (this.f83659I0 != null && i11 != 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(mo78532ZK(true));
            animatorSet.setInterpolator(new C26088c());
            ArrayList arrayList = new ArrayList();
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int i12 = m92594JK().m92867k().m92901h().gravity & 112;
                        if (i12 == 48) {
                            this.f83659I0.setPivotY(0.0f);
                        } else if (i12 == 80) {
                            this.f83659I0.setPivotY(r0.getHeight());
                        }
                        View view = this.f83659I0;
                        arrayList.add(ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f));
                    }
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.f83659I0, "alpha", 0.0f, 1.0f));
                }
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.f83659I0, "translationY", r0.getHeight(), 0.0f));
            }
            if (!arrayList.isEmpty()) {
                animatorSet.playTogether(arrayList);
                return animatorSet;
            }
            return null;
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public final View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mo88276iL();
        View mo62728eL = mo62728eL(layoutInflater, viewGroup, bundle);
        this.f83659I0 = mo62728eL;
        if (mo62728eL != null) {
            this.f83660J0 = mo62728eL.findViewById(AbstractC6918a0.popup_content_container);
            this.f83659I0.setVisibility(4);
        }
        return this.f83659I0;
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        if (bundle != null) {
            try {
                dismiss();
                return super.mo13885LK(bundle);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return new C16567a(m92648SI(), mo78533aL(), this);
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        InterfaceC16568b interfaceC16568b = this.f83661K0;
        if (interfaceC16568b != null) {
            interfaceC16568b.onDismiss();
        }
        super.mo12457Tv(interfaceC17463d);
    }

    @Override // sc0.InterfaceC26227e
    /* renamed from: Uo */
    public void mo88270Uo() {
        View view = this.f83659I0;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: Y */
    public void m88271Y() {
        m88268B8(null, true);
    }

    /* renamed from: ZK */
    protected int mo78532ZK(boolean z11) {
        return 200;
    }

    /* renamed from: aL */
    protected int mo78533aL() {
        return AbstractC8915g0.ContentPickerPopup;
    }

    /* renamed from: c4 */
    public void m88272c4() {
        try {
            if (m92648SI() != null && this.f83662L0 != null) {
                if (this.f83663M0 == null) {
                    this.f83663M0 = new Handler(Looper.getMainLooper());
                }
                this.f83663M0.post(new Runnable() { // from class: sc0.a
                    public /* synthetic */ RunnableC26223a() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ContentPickerPopupView.this.m88265bL();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.DialogView
    public void dismiss() {
        KeyEventCallbackC17462c m92594JK = m92594JK();
        if (m92594JK != null && m92594JK.m92868m() && (m92594JK instanceof C16567a)) {
            m92594JK.dismiss();
            return;
        }
        InterfaceC16568b interfaceC16568b = this.f83661K0;
        if (interfaceC16568b != null) {
            interfaceC16568b.mo60387a();
        }
        super.dismiss();
    }

    /* renamed from: eL */
    protected abstract View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    /* renamed from: ef */
    public Animator mo76798ef() {
        int i11;
        if (m92642L3() != null) {
            i11 = m92642L3().getInt("window_animation_type", 0);
        } else {
            i11 = 0;
        }
        if (this.f83659I0 != null && i11 != 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(mo78532ZK(false));
            animatorSet.setInterpolator(new C26088c());
            ArrayList arrayList = new ArrayList();
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int i12 = m92594JK().m92867k().m92901h().gravity & 112;
                        if (i12 == 48) {
                            this.f83659I0.setPivotY(0.0f);
                        } else if (i12 == 80) {
                            this.f83659I0.setPivotY(r0.getHeight());
                        }
                        View view = this.f83659I0;
                        arrayList.add(ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 0.0f));
                    }
                } else {
                    View view2 = this.f83659I0;
                    arrayList.add(ObjectAnimator.ofFloat(view2, "alpha", view2.getAlpha(), 0.0f));
                }
            } else {
                View view3 = this.f83659I0;
                arrayList.add(ObjectAnimator.ofFloat(view3, "translationY", AbstractC1579n0.m7836S(view3), this.f83659I0.getHeight()));
            }
            if (!arrayList.isEmpty()) {
                animatorSet.playTogether(arrayList);
                return animatorSet;
            }
            return null;
        }
        return null;
    }

    /* renamed from: fL */
    protected void m88273fL() {
    }

    /* renamed from: gL */
    public void m88274gL(float f11) {
        KeyEventCallbackC17462c m92594JK = m92594JK();
        if (m92594JK != null && m92594JK.m92867k() != null) {
            m92594JK.m92867k().m92886E(f11);
        }
    }

    /* renamed from: hL */
    public final void m88275hL(InterfaceC16568b interfaceC16568b) {
        this.f83661K0 = interfaceC16568b;
    }

    /* renamed from: iL */
    public void mo88276iL() {
        KeyEventCallbackC17462c m92594JK = m92594JK();
        if (m92594JK == null) {
            m92594JK = mo13885LK(new Bundle());
        }
        C17465f m92867k = m92594JK.m92867k();
        if (m92676n2() != null && m92676n2().mo35567d1() && Build.VERSION.SDK_INT >= 26) {
            m92867k.m92890I(2);
        } else {
            m92867k.m92890I(1);
            m92867k.m92895b(131072);
        }
        if (!this.f83658H0) {
            m92867k.m92897d(2);
            if (m92867k.m92901h() != null) {
                m92867k.m92901h().windowAnimations = 0;
            }
        }
        m92594JK.m92870v(1);
    }

    /* renamed from: jL */
    public void mo62729jL(WindowManager.LayoutParams layoutParams) {
        if (m92642L3() == null) {
            return;
        }
        if (m92642L3().containsKey("x")) {
            layoutParams.x = m92642L3().getInt("x");
        }
        if (m92642L3().containsKey("y")) {
            layoutParams.y = m92642L3().getInt("y");
        }
        if (m92642L3().containsKey("gravity")) {
            layoutParams.gravity = m92642L3().getInt("gravity");
        }
        if (m92642L3().containsKey("width")) {
            layoutParams.width = m92642L3().getInt("width");
        } else {
            layoutParams.width = -1;
        }
        if (m92642L3().containsKey("height")) {
            layoutParams.height = m92642L3().getInt("height");
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (m92594JK() == null) {
            return;
        }
        C17465f m92867k = m92594JK().m92867k();
        WindowManager.LayoutParams m92901h = m92867k.m92901h();
        mo62729jL(m92901h);
        m92867k.m92912v(m92901h);
    }
}
