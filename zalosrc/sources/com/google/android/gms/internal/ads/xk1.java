package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class xk1 implements j04 {

    /* renamed from: a */
    private final w04 f30497a;

    /* renamed from: b */
    private final w04 f30498b;

    /* renamed from: c */
    private final w04 f30499c;

    /* renamed from: d */
    private final w04 f30500d;

    /* renamed from: e */
    private final w04 f30501e;

    /* renamed from: f */
    private final w04 f30502f;

    /* renamed from: g */
    private final w04 f30503g;

    /* renamed from: h */
    private final w04 f30504h;

    /* renamed from: i */
    private final w04 f30505i;

    public xk1(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8, w04 w04Var9) {
        this.f30497a = w04Var;
        this.f30498b = w04Var2;
        this.f30499c = w04Var3;
        this.f30500d = w04Var4;
        this.f30501e = w04Var5;
        this.f30502f = w04Var6;
        this.f30503g = w04Var7;
        this.f30504h = w04Var8;
        this.f30505i = w04Var9;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wk1 zzb() {
        zzg zzb = ((zs0) this.f30497a).zzb();
        dr2 m24483a = ((m71) this.f30498b).m24483a();
        ak1 ak1Var = (ak1) this.f30499c.zzb();
        vj1 m25474a = ((pk1) this.f30500d).m25474a();
        il1 il1Var = (il1) this.f30501e.zzb();
        ql1 ql1Var = (ql1) this.f30502f.zzb();
        Executor executor = (Executor) this.f30503g.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new wk1(zzb, m24483a, ak1Var, m25474a, il1Var, ql1Var, executor, uc3Var, (sj1) this.f30505i.zzb());
    }
}
