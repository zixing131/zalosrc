package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
final class gv0 implements pm2 {

    /* renamed from: a */
    private final Context f20904a;

    /* renamed from: b */
    private final zzq f20905b;

    /* renamed from: c */
    private final String f20906c;

    /* renamed from: d */
    private final gu0 f20907d;

    /* renamed from: e */
    private final gv0 f20908e = this;

    /* renamed from: f */
    private final w04 f20909f;

    /* renamed from: g */
    private final w04 f20910g;

    /* renamed from: h */
    private final w04 f20911h;

    /* renamed from: i */
    private final w04 f20912i;

    /* renamed from: j */
    private final w04 f20913j;

    /* renamed from: k */
    private final w04 f20914k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ gv0(gu0 gu0Var, Context context, String str, zzq zzqVar, fv0 fv0Var) {
        w04 w04Var;
        w04 w04Var2;
        w04 w04Var3;
        this.f20907d = gu0Var;
        this.f20904a = context;
        this.f20905b = zzqVar;
        this.f20906c = str;
        j04 m23792a = k04.m23792a(context);
        this.f20909f = m23792a;
        j04 m23792a2 = k04.m23792a(zzqVar);
        this.f20910g = m23792a2;
        w04Var = gu0Var.f20877p;
        w04 m23104b = i04.m23104b(new oa2(w04Var));
        this.f20911h = m23104b;
        w04 m23104b2 = i04.m23104b(ta2.m26595a());
        this.f20912i = m23104b2;
        w04 m23104b3 = i04.m23104b(xc1.m27883a());
        this.f20913j = m23104b3;
        w04Var2 = gu0Var.f20879q;
        w04Var3 = gu0Var.f20840S;
        this.f20914k = i04.m23104b(new nm2(m23792a, w04Var2, m23792a2, w04Var3, m23104b, m23104b2, fr2.m22149a(), m23104b3));
    }

    @Override // com.google.android.gms.internal.ads.pm2
    public final t92 zza() {
        ys0 ys0Var;
        Context context = this.f20904a;
        zzq zzqVar = this.f20905b;
        String str = this.f20906c;
        mm2 mm2Var = (mm2) this.f20914k.zzb();
        na2 na2Var = (na2) this.f20911h.zzb();
        ys0Var = this.f20907d.f20849b;
        zzcgv m28333d = ys0Var.m28333d();
        r04.m25935b(m28333d);
        return new t92(context, zzqVar, str, mm2Var, na2Var, m28333d);
    }
}
