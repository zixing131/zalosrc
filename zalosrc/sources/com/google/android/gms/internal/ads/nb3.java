package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
final class nb3 extends lb3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ nb3(kb3 kb3Var) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lb3
    /* renamed from: a */
    public final int mo24190a(ob3 ob3Var) {
        int m25113D;
        synchronized (ob3Var) {
            m25113D = ob3.m25113D(ob3Var);
        }
        return m25113D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lb3
    /* renamed from: b */
    public final void mo24191b(ob3 ob3Var, Set set, Set set2) {
        Set set3;
        synchronized (ob3Var) {
            try {
                set3 = ob3Var.f25533w;
                if (set3 == null) {
                    ob3Var.f25533w = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
