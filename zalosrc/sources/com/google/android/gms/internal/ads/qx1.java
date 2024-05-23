package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class qx1 implements j04 {

    /* renamed from: a */
    private final w04 f26985a;

    /* renamed from: b */
    private final w04 f26986b;

    public qx1(w04 w04Var, w04 w04Var2) {
        this.f26985a = w04Var;
        this.f26986b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return C21472e.m111067a((Context) this.f26985a.zzb()).m111064f(((lx1) this.f26986b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
