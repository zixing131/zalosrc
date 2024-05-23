package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class an2 implements un2 {

    /* renamed from: a */
    private final un2 f17195a;

    /* renamed from: b */
    private final un2 f17196b;

    /* renamed from: c */
    private final kt2 f17197c;

    /* renamed from: d */
    private final String f17198d;

    /* renamed from: e */
    private e71 f17199e;

    /* renamed from: f */
    private final Executor f17200f;

    public an2(un2 un2Var, un2 un2Var2, kt2 kt2Var, String str, Executor executor) {
        this.f17195a = un2Var;
        this.f17196b = un2Var2;
        this.f17197c = kt2Var;
        this.f17198d = str;
        this.f17200f = executor;
    }

    /* renamed from: f */
    private final tc3 m20181f(ws2 ws2Var, wn2 wn2Var) {
        e71 e71Var = ws2Var.f30091a;
        this.f17199e = e71Var;
        if (ws2Var.f30093c != null) {
            if (e71Var.zzf() != null) {
                ws2Var.f30093c.m27148f().mo24008g(ws2Var.f30091a.zzf());
            }
            return kc3.m23877i(ws2Var.f30093c);
        }
        e71Var.zzb().m19998k(ws2Var.f30092b);
        return ((kn2) this.f17195a).m23976c(wn2Var, null, ws2Var.f30091a);
    }

    @Override // com.google.android.gms.internal.ads.un2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ tc3 mo20182a(wn2 wn2Var, tn2 tn2Var, Object obj) {
        return m20186e(wn2Var, tn2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.un2
    /* renamed from: b */
    public final synchronized e71 zzd() {
        return this.f17199e;
    }

    /* renamed from: c */
    public final /* synthetic */ tc3 m20184c(wn2 wn2Var, zm2 zm2Var, tn2 tn2Var, e71 e71Var, fn2 fn2Var) {
        if (fn2Var != null) {
            zm2 zm2Var2 = new zm2(zm2Var.f31584a, zm2Var.f31585b, zm2Var.f31586c, zm2Var.f31587d, zm2Var.f31588e, zm2Var.f31589f, fn2Var.f20201a);
            if (fn2Var.f20203c != null) {
                this.f17199e = null;
                this.f17197c.m24043e(zm2Var2);
                return m20181f(fn2Var.f20203c, wn2Var);
            }
            tc3 m24042a = this.f17197c.m24042a(zm2Var2);
            if (m24042a != null) {
                this.f17199e = null;
                return kc3.m23882n(m24042a, new qb3() { // from class: com.google.android.gms.internal.ads.wm2
                    public /* synthetic */ wm2() {
                    }

                    @Override // com.google.android.gms.internal.ads.qb3
                    public final tc3 zza(Object obj) {
                        return an2.this.m20185d((ht2) obj);
                    }
                }, this.f17200f);
            }
            this.f17197c.m24043e(zm2Var2);
            wn2Var = new wn2(wn2Var.f30034b, fn2Var.f20202b);
        }
        tc3 m23976c = ((kn2) this.f17195a).m23976c(wn2Var, tn2Var, e71Var);
        this.f17199e = e71Var;
        return m23976c;
    }

    /* renamed from: d */
    public final /* synthetic */ tc3 m20185d(ht2 ht2Var) {
        jt2 jt2Var;
        if (ht2Var != null && ht2Var.f21902a != null && (jt2Var = ht2Var.f21903b) != null) {
            C4439dt m24028F = C4697kt.m24028F();
            C4366bt m21000F = C4402ct.m21000F();
            m21000F.m20709u(2);
            m21000F.m20707r(C4550gt.m22520H());
            m24028F.m21537q(m21000F);
            ht2Var.f21902a.f30091a.zzb().m19990c().mo21990r((C4697kt) m24028F.m25898n());
            return m20181f(ht2Var.f21902a, ((zm2) jt2Var).f31585b);
        }
        throw new zzebh(1, "Empty prefetch");
    }

    /* renamed from: e */
    public final synchronized tc3 m20186e(wn2 wn2Var, tn2 tn2Var, e71 e71Var) {
        d71 mo20933a = tn2Var.mo20933a(wn2Var.f30034b);
        mo20933a.mo20242l(new bn2(this.f17198d));
        e71 e71Var2 = (e71) mo20933a.zzh();
        e71Var2.zzg();
        e71Var2.zzg();
        zzl zzlVar = e71Var2.zzg().f19398d;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            dr2 zzg = e71Var2.zzg();
            return kc3.m23882n(ac3.m20071D(((gn2) this.f17196b).m22485c(wn2Var, tn2Var, e71Var2)), new qb3() { // from class: com.google.android.gms.internal.ads.xm2

                /* renamed from: b */
                public final /* synthetic */ wn2 f30538b;

                /* renamed from: c */
                public final /* synthetic */ zm2 f30539c;

                /* renamed from: d */
                public final /* synthetic */ tn2 f30540d;

                /* renamed from: e */
                public final /* synthetic */ e71 f30541e;

                public /* synthetic */ xm2(wn2 wn2Var2, zm2 zm2Var, tn2 tn2Var2, e71 e71Var22) {
                    r2 = wn2Var2;
                    r3 = zm2Var;
                    r4 = tn2Var2;
                    r5 = e71Var22;
                }

                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    return an2.this.m20184c(r2, r3, r4, r5, (fn2) obj);
                }
            }, this.f17200f);
        }
        this.f17199e = e71Var22;
        return ((kn2) this.f17195a).m23976c(wn2Var2, tn2Var2, e71Var22);
    }
}
