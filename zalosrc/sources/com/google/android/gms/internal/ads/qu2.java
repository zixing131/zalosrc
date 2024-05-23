package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class qu2 {
    /* renamed from: a */
    public static final xu2 m25888a(Callable callable, Object obj, yu2 yu2Var) {
        uc3 uc3Var;
        uc3Var = yu2Var.f31220a;
        return m25889b(callable, uc3Var, obj, yu2Var);
    }

    /* renamed from: b */
    public static final xu2 m25889b(Callable callable, uc3 uc3Var, Object obj, yu2 yu2Var) {
        tc3 tc3Var;
        tc3Var = yu2.f31219d;
        return new xu2(yu2Var, obj, tc3Var, Collections.emptyList(), uc3Var.mo21339R(callable));
    }

    /* renamed from: c */
    public static final xu2 m25890c(tc3 tc3Var, Object obj, yu2 yu2Var) {
        tc3 tc3Var2;
        tc3Var2 = yu2.f31219d;
        return new xu2(yu2Var, obj, tc3Var2, Collections.emptyList(), tc3Var);
    }

    /* renamed from: d */
    public static final xu2 m25891d(final ku2 ku2Var, uc3 uc3Var, Object obj, yu2 yu2Var) {
        return m25889b(new Callable() { // from class: com.google.android.gms.internal.ads.pu2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ku2.this.zza();
                return null;
            }
        }, uc3Var, obj, yu2Var);
    }
}
