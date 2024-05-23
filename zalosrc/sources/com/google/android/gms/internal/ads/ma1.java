package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class ma1 implements Runnable {

    /* renamed from: p */
    private final WeakReference f24449p;

    @Override // java.lang.Runnable
    public final void run() {
        na1 na1Var = (na1) this.f24449p.get();
        if (na1Var != null) {
            na1Var.m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.ka1
                @Override // com.google.android.gms.internal.ads.jd1
                public final void zza(Object obj) {
                    ((oa1) obj).zza();
                }
            });
        }
    }
}
