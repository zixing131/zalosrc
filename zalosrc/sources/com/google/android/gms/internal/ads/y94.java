package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class y94 {

    /* renamed from: a */
    private final Handler f30842a;

    /* renamed from: b */
    private final z94 f30843b;

    public y94(Handler handler, z94 z94Var) {
        this.f30842a = z94Var == null ? null : handler;
        this.f30843b = z94Var;
    }

    /* renamed from: a */
    public final void m28143a(final Exception exc) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.o94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28150h(exc);
                }
            });
        }
    }

    /* renamed from: b */
    public final void m28144b(final Exception exc) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.u94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28151i(exc);
                }
            });
        }
    }

    /* renamed from: c */
    public final void m28145c(final String str, final long j11, final long j12) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.t94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28152j(str, j11, j12);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m28146d(final String str) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.v94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28153k(str);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m28147e(final lv3 lv3Var) {
        lv3Var.m24381a();
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.p94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28154l(lv3Var);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m28148f(final lv3 lv3Var) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.q94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28155m(lv3Var);
                }
            });
        }
    }

    /* renamed from: g */
    public final void m28149g(final C4671k3 c4671k3, final lw3 lw3Var) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.w94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28156n(c4671k3, lw3Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m28150h(Exception exc) {
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26239m(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void m28151i(Exception exc) {
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26235e(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void m28152j(String str, long j11, long j12) {
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26240n(str, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void m28153k(String str) {
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26241o(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void m28154l(lv3 lv3Var) {
        lv3Var.m24381a();
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26233c(lv3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void m28155m(lv3 lv3Var) {
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26234d(lv3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void m28156n(C4671k3 c4671k3, lw3 lw3Var) {
        int i11 = g92.f20474a;
        this.f30843b.mo26236f(c4671k3, lw3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void m28157o(long j11) {
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26237i(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void m28158p(boolean z11) {
        z94 z94Var = this.f30843b;
        int i11 = g92.f20474a;
        z94Var.mo26238j(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m28159q(int i11, long j11, long j12) {
        z94 z94Var = this.f30843b;
        int i12 = g92.f20474a;
        z94Var.mo26242p(i11, j11, j12);
    }

    /* renamed from: r */
    public final void m28160r(final long j11) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.r94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28157o(j11);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m28161s(final boolean z11) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.s94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28158p(z11);
                }
            });
        }
    }

    /* renamed from: t */
    public final void m28162t(final int i11, final long j11, final long j12) {
        Handler handler = this.f30842a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.x94
                @Override // java.lang.Runnable
                public final void run() {
                    y94.this.m28159q(i11, j11, j12);
                }
            });
        }
    }
}
