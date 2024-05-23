package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class o72 implements j04 {

    /* renamed from: a */
    private final w04 f25473a;

    /* renamed from: b */
    private final w04 f25474b;

    /* renamed from: c */
    private final w04 f25475c;

    /* renamed from: d */
    private final w04 f25476d;

    /* renamed from: e */
    private final w04 f25477e;

    /* renamed from: f */
    private final w04 f25478f;

    /* renamed from: g */
    private final w04 f25479g;

    public o72(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7) {
        this.f25473a = w04Var;
        this.f25474b = w04Var2;
        this.f25475c = w04Var3;
        this.f25476d = w04Var4;
        this.f25477e = w04Var5;
        this.f25478f = w04Var6;
        this.f25479g = w04Var7;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new n72((Context) this.f25473a.zzb(), ((mt0) this.f25474b).m24707a(), ((m71) this.f25475c).m24483a(), (Executor) this.f25476d.zzb(), (sp1) this.f25477e.zzb(), (jq1) this.f25478f.zzb(), new f40());
    }
}
