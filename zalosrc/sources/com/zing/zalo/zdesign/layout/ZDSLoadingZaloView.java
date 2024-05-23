package com.zing.zalo.zdesign.layout;

import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import p542ub.InterfaceC27218a;

/* loaded from: classes7.dex */
public class ZDSLoadingZaloView extends ZaloView {
    public static final C17081a Companion = new C17081a(null);

    /* renamed from: w0 */
    private ProgressDialogView f87424w0;

    /* renamed from: x0 */
    private Handler f87425x0 = new Handler(Looper.getMainLooper());

    /* renamed from: y0 */
    private Runnable f87426y0 = new Runnable() { // from class: com.zing.zalo.zdesign.layout.d
        public /* synthetic */ RunnableC17085d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ZDSLoadingZaloView.m91387QK(ZDSLoadingZaloView.this);
        }
    };

    /* renamed from: com.zing.zalo.zdesign.layout.ZDSLoadingZaloView$a */
    /* loaded from: classes7.dex */
    public static final class C17081a {
        private C17081a() {
        }

        public /* synthetic */ C17081a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: NK */
    public static final void m91385NK(ZDSLoadingZaloView zDSLoadingZaloView) {
        AbstractC19074t.m100208f(zDSLoadingZaloView, "this$0");
        try {
            ProgressDialogView progressDialogView = zDSLoadingZaloView.f87424w0;
            if (progressDialogView != null) {
                AbstractC19074t.m100205c(progressDialogView);
                if (progressDialogView.m92595KK()) {
                    ProgressDialogView progressDialogView2 = zDSLoadingZaloView.f87424w0;
                    AbstractC19074t.m100205c(progressDialogView2);
                    progressDialogView2.dismiss();
                    zDSLoadingZaloView.f87424w0 = null;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZDSLoadingZaloView", e11);
        }
    }

    /* renamed from: PK */
    public static final void m91386PK(ZDSLoadingZaloView zDSLoadingZaloView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(zDSLoadingZaloView, "this$0");
        zDSLoadingZaloView.m91391RK();
    }

    /* renamed from: QK */
    public static final void m91387QK(ZDSLoadingZaloView zDSLoadingZaloView) {
        AbstractC19074t.m100208f(zDSLoadingZaloView, "this$0");
        zDSLoadingZaloView.m91393c4();
    }

    /* renamed from: SK */
    public static final void m91388SK(ZDSLoadingZaloView zDSLoadingZaloView, CharSequence charSequence, boolean z11) {
        AbstractC19074t.m100208f(zDSLoadingZaloView, "this$0");
        zDSLoadingZaloView.m91390OK(charSequence, z11);
    }

    /* renamed from: B8 */
    public void m91389B8(CharSequence charSequence, boolean z11) {
        if (AbstractC19074t.m100204b(Looper.myLooper(), Looper.getMainLooper())) {
            m91390OK(charSequence, z11);
        } else {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.zdesign.layout.e

                /* renamed from: q */
                public final /* synthetic */ CharSequence f87432q;

                /* renamed from: r */
                public final /* synthetic */ boolean f87433r;

                public /* synthetic */ RunnableC17086e(CharSequence charSequence2, boolean z112) {
                    r2 = charSequence2;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZDSLoadingZaloView.m91388SK(ZDSLoadingZaloView.this, r2, r3);
                }
            });
        }
    }

    /* renamed from: OK */
    public void m91390OK(CharSequence charSequence, boolean z11) {
        try {
            ProgressDialogView progressDialogView = this.f87424w0;
            if (progressDialogView != null) {
                AbstractC19074t.m100205c(progressDialogView);
                if (progressDialogView.m92595KK()) {
                    ProgressDialogView progressDialogView2 = this.f87424w0;
                    AbstractC19074t.m100205c(progressDialogView2);
                    progressDialogView2.dismiss();
                    this.f87424w0 = null;
                }
            }
            if (this.f87424w0 == null) {
                this.f87424w0 = new ProgressDialogView();
            }
            ProgressDialogView progressDialogView3 = this.f87424w0;
            AbstractC19074t.m100205c(progressDialogView3);
            progressDialogView3.mo43041MK(z11);
            ProgressDialogView progressDialogView4 = this.f87424w0;
            AbstractC19074t.m100205c(progressDialogView4);
            progressDialogView4.m92596NK(z11);
            if (charSequence != null && charSequence.length() != 0) {
                ProgressDialogView progressDialogView5 = this.f87424w0;
                AbstractC19074t.m100205c(progressDialogView5);
                progressDialogView5.m91380WK(charSequence);
                ProgressDialogView progressDialogView6 = this.f87424w0;
                AbstractC19074t.m100205c(progressDialogView6);
                C17487o0 m92649TI = m92649TI();
                AbstractC19074t.m100207e(m92649TI, "childZaloViewManager");
                progressDialogView6.mo83093TK(m92649TI);
                ProgressDialogView progressDialogView7 = this.f87424w0;
                AbstractC19074t.m100205c(progressDialogView7);
                progressDialogView7.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.zdesign.layout.f
                    public /* synthetic */ C17087f() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        ZDSLoadingZaloView.m91386PK(ZDSLoadingZaloView.this, interfaceC17463d);
                    }
                });
            }
            ProgressDialogView progressDialogView8 = this.f87424w0;
            AbstractC19074t.m100205c(progressDialogView8);
            progressDialogView8.m91380WK("");
            ProgressDialogView progressDialogView62 = this.f87424w0;
            AbstractC19074t.m100205c(progressDialogView62);
            C17487o0 m92649TI2 = m92649TI();
            AbstractC19074t.m100207e(m92649TI2, "childZaloViewManager");
            progressDialogView62.mo83093TK(m92649TI2);
            ProgressDialogView progressDialogView72 = this.f87424w0;
            AbstractC19074t.m100205c(progressDialogView72);
            progressDialogView72.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.zdesign.layout.f
                public /* synthetic */ C17087f() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    ZDSLoadingZaloView.m91386PK(ZDSLoadingZaloView.this, interfaceC17463d);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZDSLoadingZaloView", e11);
        }
    }

    /* renamed from: RK */
    protected void m91391RK() {
    }

    /* renamed from: Y */
    public void m91392Y() {
        m91389B8(null, true);
    }

    /* renamed from: c4 */
    public void m91393c4() {
        try {
            if (m92648SI() != null && this.f87424w0 != null) {
                this.f87425x0.post(new Runnable() { // from class: com.zing.zalo.zdesign.layout.g
                    public /* synthetic */ RunnableC17088g() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZDSLoadingZaloView.m91385NK(ZDSLoadingZaloView.this);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZDSLoadingZaloView", e11);
        }
    }

    /* renamed from: cq */
    public void m91394cq(CharSequence charSequence) {
        m91389B8(charSequence, true);
    }

    /* renamed from: kl */
    public void m91395kl(Runnable runnable, long j11) {
        AbstractC19074t.m100208f(runnable, "runnable");
        this.f87425x0.postDelayed(runnable, j11);
    }

    /* renamed from: q3 */
    public void m91396q3() {
        mo70710wy(this.f87426y0);
    }

    /* renamed from: wy */
    public void mo70710wy(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "runnable");
        if (m92676n2() != null) {
            InterfaceC27218a m92676n2 = m92676n2();
            AbstractC19074t.m100205c(m92676n2);
            m92676n2.runOnUiThread(runnable);
        }
    }
}
