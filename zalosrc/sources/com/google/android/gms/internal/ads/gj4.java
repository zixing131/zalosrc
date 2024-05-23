package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class gj4 {

    /* renamed from: a */
    private final CopyOnWriteArrayList f20620a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m22457a(Handler handler, hj4 hj4Var) {
        m22459c(hj4Var);
        this.f20620a.add(new fj4(handler, hj4Var));
    }

    /* renamed from: b */
    public final void m22458b(final int i11, final long j11, final long j12) {
        boolean z11;
        Handler handler;
        Iterator it = this.f20620a.iterator();
        while (it.hasNext()) {
            final fj4 fj4Var = (fj4) it.next();
            z11 = fj4Var.f20141c;
            if (!z11) {
                handler = fj4Var.f20139a;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ej4
                    @Override // java.lang.Runnable
                    public final void run() {
                        hj4 hj4Var;
                        fj4 fj4Var2 = fj4.this;
                        int i12 = i11;
                        long j13 = j11;
                        long j14 = j12;
                        hj4Var = fj4Var2.f20140b;
                        hj4Var.mo22924T(i12, j13, j14);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void m22459c(hj4 hj4Var) {
        hj4 hj4Var2;
        Iterator it = this.f20620a.iterator();
        while (it.hasNext()) {
            fj4 fj4Var = (fj4) it.next();
            hj4Var2 = fj4Var.f20140b;
            if (hj4Var2 == hj4Var) {
                fj4Var.m22034c();
                this.f20620a.remove(fj4Var);
            }
        }
    }
}
