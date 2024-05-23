package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class iw0 implements cq2 {

    /* renamed from: a */
    private final gu0 f22508a;

    /* renamed from: b */
    private final iw0 f22509b = this;

    /* renamed from: c */
    private final w04 f22510c;

    /* renamed from: d */
    private final w04 f22511d;

    /* renamed from: e */
    private final w04 f22512e;

    /* renamed from: f */
    private final w04 f22513f;

    /* renamed from: g */
    private final w04 f22514g;

    /* renamed from: h */
    private final w04 f22515h;

    /* renamed from: i */
    private final w04 f22516i;

    /* renamed from: j */
    private final w04 f22517j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ iw0(gu0 gu0Var, Context context, String str, hw0 hw0Var) {
        w04 w04Var;
        w04 w04Var2;
        w04 w04Var3;
        w04 w04Var4;
        w04 w04Var5;
        w04 w04Var6;
        this.f22508a = gu0Var;
        j04 m23792a = k04.m23792a(context);
        this.f22510c = m23792a;
        w04Var = gu0Var.f20818A0;
        w04Var2 = gu0Var.f20820B0;
        ao2 ao2Var = new ao2(m23792a, w04Var, w04Var2);
        this.f22511d = ao2Var;
        w04Var3 = gu0Var.f20818A0;
        w04 m23104b = i04.m23104b(new lp2(w04Var3));
        this.f22512e = m23104b;
        w04 m23104b2 = i04.m23104b(ar2.m20226a());
        this.f22513f = m23104b2;
        w04Var4 = gu0Var.f20879q;
        w04Var5 = gu0Var.f20840S;
        w04 m23104b3 = i04.m23104b(new vp2(m23792a, w04Var4, w04Var5, ao2Var, m23104b, fr2.m22149a(), m23104b2));
        this.f22514g = m23104b3;
        this.f22515h = i04.m23104b(new gq2(m23104b3, m23104b, m23104b2));
        j04 m23793b = k04.m23793b(str);
        this.f22516i = m23793b;
        w04Var6 = gu0Var.f20865j;
        this.f22517j = i04.m23104b(new aq2(m23793b, m23104b3, m23792a, m23104b, m23104b2, w04Var6));
    }

    @Override // com.google.android.gms.internal.ads.cq2
    public final zp2 zza() {
        return (zp2) this.f22517j.zzb();
    }

    @Override // com.google.android.gms.internal.ads.cq2
    public final fq2 zzb() {
        return (fq2) this.f22515h.zzb();
    }
}
