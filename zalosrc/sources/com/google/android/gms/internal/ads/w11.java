package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class w11 implements j04 {

    /* renamed from: a */
    private final w04 f29651a;

    /* renamed from: b */
    private final w04 f29652b;

    /* renamed from: c */
    private final w04 f29653c;

    /* renamed from: d */
    private final w04 f29654d;

    /* renamed from: e */
    private final w04 f29655e;

    /* renamed from: f */
    private final w04 f29656f;

    /* renamed from: g */
    private final w04 f29657g;

    /* renamed from: h */
    private final w04 f29658h;

    /* renamed from: i */
    private final w04 f29659i;

    /* renamed from: j */
    private final w04 f29660j;

    public w11(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8, w04 w04Var9, w04 w04Var10) {
        this.f29651a = w04Var;
        this.f29652b = w04Var2;
        this.f29653c = w04Var3;
        this.f29654d = w04Var4;
        this.f29655e = w04Var5;
        this.f29656f = w04Var6;
        this.f29657g = w04Var7;
        this.f29658h = w04Var8;
        this.f29659i = w04Var9;
        this.f29660j = w04Var10;
    }

    /* renamed from: b */
    public static v11 m27455b(u31 u31Var, Context context, jq2 jq2Var, View view, zq0 zq0Var, t31 t31Var, hk1 hk1Var, rf1 rf1Var, d04 d04Var, Executor executor) {
        return new v11(u31Var, context, jq2Var, view, zq0Var, t31Var, hk1Var, rf1Var, d04Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v11 zzb() {
        return new v11(((s51) this.f29651a).zzb(), (Context) this.f29652b.zzb(), ((c21) this.f29653c).m20787a(), ((b21) this.f29654d).m20370a(), ((n21) this.f29655e).m24793a(), ((d21) this.f29656f).m21250a(), ((fi1) this.f29657g).m22023a(), (rf1) this.f29658h.zzb(), i04.m23103a(this.f29659i), (Executor) this.f29660j.zzb());
    }
}
