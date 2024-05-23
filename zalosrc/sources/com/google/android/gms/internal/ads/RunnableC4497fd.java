package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fd */
/* loaded from: classes2.dex */
public final class RunnableC4497fd implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C4534gd f20087p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4497fd(C4534gd c4534gd) {
        this.f20087p = c4534gd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z11;
        xz2 xz2Var;
        Object obj2;
        obj = this.f20087p.f20542A;
        synchronized (obj) {
            z11 = this.f20087p.f20543B;
            if (!z11) {
                this.f20087p.f20543B = true;
                try {
                    C4534gd.m22419f(this.f20087p);
                } catch (Exception e11) {
                    xz2Var = this.f20087p.f20551u;
                    xz2Var.m28094c(2023, -1L, e11);
                }
                obj2 = this.f20087p.f20542A;
                synchronized (obj2) {
                    this.f20087p.f20543B = false;
                }
            }
        }
    }
}
