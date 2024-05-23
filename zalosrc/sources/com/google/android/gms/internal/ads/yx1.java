package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class yx1 implements j04 {
    /* renamed from: a */
    public static yx1 m28379a() {
        yx1 yx1Var;
        yx1Var = xx1.f30662a;
        return yx1Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* synthetic */ Object zzb() {
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        r04.m25935b(uuid);
        return uuid;
    }
}
