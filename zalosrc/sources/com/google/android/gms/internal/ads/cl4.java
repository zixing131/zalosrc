package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class cl4 {

    /* renamed from: a */
    private final Handler f18478a;

    /* renamed from: b */
    private final dl4 f18479b;

    public cl4(Handler handler, dl4 dl4Var) {
        this.f18478a = dl4Var == null ? null : handler;
        this.f18479b = dl4Var;
    }

    /* renamed from: a */
    public final void m20935a(final String str, final long j11, final long j12) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20941g(str, j11, j12);
                }
            });
        }
    }

    /* renamed from: b */
    public final void m20936b(final String str) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bl4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20942h(str);
                }
            });
        }
    }

    /* renamed from: c */
    public final void m20937c(final lv3 lv3Var) {
        lv3Var.m24381a();
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20943i(lv3Var);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m20938d(final int i11, final long j11) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20944j(i11, j11);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m20939e(final lv3 lv3Var) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20945k(lv3Var);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m20940f(final C4671k3 c4671k3, final lw3 lw3Var) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20946l(c4671k3, lw3Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m20941g(String str, long j11, long j12) {
        dl4 dl4Var = this.f18479b;
        int i11 = g92.f20474a;
        dl4Var.mo21487r(str, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m20942h(String str) {
        dl4 dl4Var = this.f18479b;
        int i11 = g92.f20474a;
        dl4Var.mo21485l(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void m20943i(lv3 lv3Var) {
        lv3Var.m24381a();
        dl4 dl4Var = this.f18479b;
        int i11 = g92.f20474a;
        dl4Var.mo21482g(lv3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void m20944j(int i11, long j11) {
        dl4 dl4Var = this.f18479b;
        int i12 = g92.f20474a;
        dl4Var.mo21484k(i11, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void m20945k(lv3 lv3Var) {
        dl4 dl4Var = this.f18479b;
        int i11 = g92.f20474a;
        dl4Var.mo21483h(lv3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void m20946l(C4671k3 c4671k3, lw3 lw3Var) {
        int i11 = g92.f20474a;
        this.f18479b.mo21480a(c4671k3, lw3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void m20947m(Object obj, long j11) {
        dl4 dl4Var = this.f18479b;
        int i11 = g92.f20474a;
        dl4Var.mo21489t(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void m20948n(long j11, int i11) {
        dl4 dl4Var = this.f18479b;
        int i12 = g92.f20474a;
        dl4Var.mo21481b(j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void m20949o(Exception exc) {
        dl4 dl4Var = this.f18479b;
        int i11 = g92.f20474a;
        dl4Var.mo21486q(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void m20950p(s41 s41Var) {
        dl4 dl4Var = this.f18479b;
        int i11 = g92.f20474a;
        dl4Var.mo21488s(s41Var);
    }

    /* renamed from: q */
    public final void m20951q(final Object obj) {
        if (this.f18478a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f18478a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20947m(obj, elapsedRealtime);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m20952r(final long j11, final int i11) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20948n(j11, i11);
                }
            });
        }
    }

    /* renamed from: s */
    public final void m20953s(final Exception exc) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tk4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20949o(exc);
                }
            });
        }
    }

    /* renamed from: t */
    public final void m20954t(final s41 s41Var) {
        Handler handler = this.f18478a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.al4
                @Override // java.lang.Runnable
                public final void run() {
                    cl4.this.m20950p(s41Var);
                }
            });
        }
    }
}
