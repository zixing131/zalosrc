package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class j21 implements j04 {

    /* renamed from: a */
    private final z11 f22598a;

    /* renamed from: b */
    private final w04 f22599b;

    public j21(z11 z11Var, w04 w04Var) {
        this.f22598a = z11Var;
        this.f22599b = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new if1((j31) this.f22599b.zzb(), kl0.f23368f));
        r04.m25935b(singleton);
        return singleton;
    }
}
