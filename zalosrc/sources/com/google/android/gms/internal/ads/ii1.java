package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ii1 implements j04 {

    /* renamed from: a */
    private final w04 f22182a;

    public ii1(w04 w04Var) {
        this.f22182a = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((fi1) this.f22182a).m22023a().m22952e() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        r04.m25935b(emptySet);
        return emptySet;
    }
}
