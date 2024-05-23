package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zm2 implements jt2 {

    /* renamed from: a */
    public final tn2 f31584a;

    /* renamed from: b */
    public final wn2 f31585b;

    /* renamed from: c */
    public final zzl f31586c;

    /* renamed from: d */
    public final String f31587d;

    /* renamed from: e */
    public final Executor f31588e;

    /* renamed from: f */
    public final com.google.android.gms.ads.internal.client.zzw f31589f;

    /* renamed from: g */
    public final ys2 f31590g;

    public zm2(tn2 tn2Var, wn2 wn2Var, zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, ys2 ys2Var) {
        this.f31584a = tn2Var;
        this.f31585b = wn2Var;
        this.f31586c = zzlVar;
        this.f31587d = str;
        this.f31588e = executor;
        this.f31589f = zzwVar;
        this.f31590g = ys2Var;
    }

    @Override // com.google.android.gms.internal.ads.jt2
    public final ys2 zza() {
        return this.f31590g;
    }

    @Override // com.google.android.gms.internal.ads.jt2
    public final Executor zzb() {
        return this.f31588e;
    }
}
