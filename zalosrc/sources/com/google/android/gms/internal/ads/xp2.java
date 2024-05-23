package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xp2 implements pi2 {

    /* renamed from: a */
    private final Context f30569a;

    /* renamed from: b */
    private final pi2 f30570b;

    public xp2(Context context) {
        xr2 xr2Var = new xr2();
        this.f30569a = context.getApplicationContext();
        this.f30570b = xr2Var;
    }

    @Override // com.google.android.gms.internal.ads.pi2
    public final /* bridge */ /* synthetic */ qj2 zza() {
        return new xq2(this.f30569a, ((xr2) this.f30570b).zza());
    }
}
