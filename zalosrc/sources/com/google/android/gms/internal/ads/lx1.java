package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes2.dex */
public final class lx1 implements j04 {

    /* renamed from: a */
    private final w04 f24290a;

    public lx1(w04 w04Var) {
        this.f24290a = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.f24290a.zzb()).getApplicationInfo();
        r04.m25935b(applicationInfo);
        return applicationInfo;
    }
}
