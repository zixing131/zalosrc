package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i12 {

    /* renamed from: a */
    private final e12 f22011a;

    /* renamed from: b */
    private final uc3 f22012b;

    public i12(e12 e12Var, uc3 uc3Var) {
        this.f22011a = e12Var;
        this.f22012b = uc3Var;
    }

    /* renamed from: a */
    public final void m23109a(ju2 ju2Var) {
        uc3 uc3Var = this.f22012b;
        final e12 e12Var = this.f22011a;
        kc3.m23886r(uc3Var.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.g12
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e12.this.getWritableDatabase();
            }
        }), new h12(this, ju2Var), this.f22012b);
    }
}
