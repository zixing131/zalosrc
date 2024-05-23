package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class p01 implements j04 {

    /* renamed from: a */
    private final m01 f26013a;

    /* renamed from: b */
    private final w04 f26014b;

    public p01(m01 m01Var, w04 w04Var) {
        this.f26013a = m01Var;
        this.f26014b = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new if1((j31) this.f26014b.zzb(), kl0.f23368f));
        r04.m25935b(singleton);
        return singleton;
    }
}
