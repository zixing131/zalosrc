package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.gf */
/* loaded from: classes2.dex */
public final class CallableC4536gf implements Callable {

    /* renamed from: a */
    private final C4719le f20569a;

    /* renamed from: b */
    private final C4939ra f20570b;

    public CallableC4536gf(C4719le c4719le, C4939ra c4939ra) {
        this.f20569a = c4719le;
        this.f20570b = c4939ra;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f20569a.m24249l() != null) {
            this.f20569a.m24249l().get();
        }
        C4606ib m24241c = this.f20569a.m24241c();
        if (m24241c != null) {
            try {
                synchronized (this.f20570b) {
                    C4939ra c4939ra = this.f20570b;
                    byte[] mo27346a = m24241c.mo27346a();
                    c4939ra.m25897m(mo27346a, 0, mo27346a.length, gu3.m22615a());
                }
                return null;
            } catch (zzgrq | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
