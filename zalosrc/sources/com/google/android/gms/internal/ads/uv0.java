package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class uv0 implements nu1 {

    /* renamed from: a */
    private final Context f29052a;

    /* renamed from: b */
    private final f50 f29053b;

    /* renamed from: c */
    private final gu0 f29054c;

    /* renamed from: d */
    private final uv0 f29055d = this;

    /* renamed from: e */
    private final w04 f29056e;

    /* renamed from: f */
    private final w04 f29057f;

    /* renamed from: g */
    private final w04 f29058g;

    /* renamed from: h */
    private final w04 f29059h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ uv0(gu0 gu0Var, Context context, f50 f50Var, tv0 tv0Var) {
        this.f29054c = gu0Var;
        this.f29052a = context;
        this.f29053b = f50Var;
        j04 m23792a = k04.m23792a(this);
        this.f29056e = m23792a;
        j04 m23792a2 = k04.m23792a(f50Var);
        this.f29057f = m23792a2;
        ju1 ju1Var = new ju1(m23792a2);
        this.f29058g = ju1Var;
        this.f29059h = i04.m23104b(new lu1(m23792a, ju1Var));
    }

    @Override // com.google.android.gms.internal.ads.nu1
    public final eu1 zzb() {
        return new ov0(this.f29054c, this.f29055d, null);
    }

    @Override // com.google.android.gms.internal.ads.nu1
    public final ku1 zzd() {
        return (ku1) this.f29059h.zzb();
    }
}
