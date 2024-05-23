package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
final class ew0 implements mo2 {

    /* renamed from: a */
    private final gu0 f19834a;

    /* renamed from: b */
    private final ew0 f19835b = this;

    /* renamed from: c */
    private final w04 f19836c;

    /* renamed from: d */
    private final w04 f19837d;

    /* renamed from: e */
    private final w04 f19838e;

    /* renamed from: f */
    private final w04 f19839f;

    /* renamed from: g */
    private final w04 f19840g;

    /* renamed from: h */
    private final w04 f19841h;

    /* renamed from: i */
    private final w04 f19842i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ew0(gu0 gu0Var, Context context, String str, zzq zzqVar, dw0 dw0Var) {
        w04 w04Var;
        w04 w04Var2;
        w04 w04Var3;
        w04 w04Var4;
        w04 w04Var5;
        this.f19834a = gu0Var;
        j04 m23792a = k04.m23792a(context);
        this.f19836c = m23792a;
        j04 m23792a2 = k04.m23792a(zzqVar);
        this.f19837d = m23792a2;
        j04 m23792a3 = k04.m23792a(str);
        this.f19838e = m23792a3;
        w04Var = gu0Var.f20877p;
        w04 m23104b = i04.m23104b(new oa2(w04Var));
        this.f19839f = m23104b;
        w04Var2 = gu0Var.f20818A0;
        w04 m23104b2 = i04.m23104b(new lp2(w04Var2));
        this.f19840g = m23104b2;
        w04Var3 = gu0Var.f20879q;
        w04Var4 = gu0Var.f20840S;
        w04 m23104b3 = i04.m23104b(new ko2(m23792a, w04Var3, w04Var4, m23104b, m23104b2, fr2.m22149a()));
        this.f19841h = m23104b3;
        w04Var5 = gu0Var.f20865j;
        this.f19842i = i04.m23104b(new wa2(m23792a, m23792a2, m23792a3, m23104b3, m23104b, m23104b2, w04Var5));
    }

    @Override // com.google.android.gms.internal.ads.mo2
    public final va2 zza() {
        return (va2) this.f19842i.zzb();
    }
}
