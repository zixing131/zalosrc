package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class fj3 {

    /* renamed from: b */
    private static final fj3 f20136b = new fj3();

    /* renamed from: c */
    private static final ej3 f20137c = new ej3(null);

    /* renamed from: a */
    private final AtomicReference f20138a = new AtomicReference();

    /* renamed from: a */
    public static fj3 m22029a() {
        return f20136b;
    }

    /* renamed from: b */
    public final wk3 m22030b() {
        wk3 wk3Var = (wk3) this.f20138a.get();
        if (wk3Var == null) {
            return f20137c;
        }
        return wk3Var;
    }
}
