package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class a51 {

    /* renamed from: a */
    private final ly1 f16925a;

    /* renamed from: b */
    private final dr2 f16926b;

    /* renamed from: c */
    private final hv2 f16927c;

    /* renamed from: d */
    private final gy0 f16928d;

    /* renamed from: e */
    private final t62 f16929e;

    /* renamed from: f */
    private final fd1 f16930f;

    /* renamed from: g */
    private tq2 f16931g;

    /* renamed from: h */
    private final pz1 f16932h;

    /* renamed from: i */
    private final b71 f16933i;

    /* renamed from: j */
    private final Executor f16934j;

    /* renamed from: k */
    private final dz1 f16935k;

    /* renamed from: l */
    private final g32 f16936l;

    public a51(ly1 ly1Var, dr2 dr2Var, hv2 hv2Var, gy0 gy0Var, t62 t62Var, fd1 fd1Var, tq2 tq2Var, pz1 pz1Var, b71 b71Var, Executor executor, dz1 dz1Var, g32 g32Var) {
        this.f16925a = ly1Var;
        this.f16926b = dr2Var;
        this.f16927c = hv2Var;
        this.f16928d = gy0Var;
        this.f16929e = t62Var;
        this.f16930f = fd1Var;
        this.f16931g = tq2Var;
        this.f16932h = pz1Var;
        this.f16933i = b71Var;
        this.f16934j = executor;
        this.f16935k = dz1Var;
        this.f16936l = g32Var;
    }

    /* renamed from: a */
    public final zze m19989a(Throwable th2) {
        return cs2.m20997b(th2, this.f16936l);
    }

    /* renamed from: c */
    public final fd1 m19990c() {
        return this.f16930f;
    }

    /* renamed from: d */
    public final /* synthetic */ tq2 m19991d(tq2 tq2Var) {
        this.f16928d.m22636a(tq2Var);
        return tq2Var;
    }

    /* renamed from: e */
    public final tc3 m19992e(zzffx zzffxVar) {
        lu2 m28018a = this.f16927c.m28361b(bv2.GET_CACHE_KEY, this.f16933i.m20426c()).m28023f(new qb3() { // from class: com.google.android.gms.internal.ads.x41

            /* renamed from: b */
            public final /* synthetic */ zzffx f30317b;

            public /* synthetic */ x41(zzffx zzffxVar2) {
                r2 = zzffxVar2;
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return a51.this.m19993f(r2, (zzcbc) obj);
            }
        }).m28018a();
        kc3.m23886r(m28018a, new y41(this), this.f16934j);
        return m28018a;
    }

    /* renamed from: f */
    public final /* synthetic */ tc3 m19993f(zzffx zzffxVar, zzcbc zzcbcVar) {
        zzcbcVar.f32009x = zzffxVar;
        return this.f16932h.m25615a(zzcbcVar);
    }

    /* renamed from: g */
    public final tc3 m19994g(zzcbc zzcbcVar) {
        lu2 m28018a = this.f16927c.m28361b(bv2.NOTIFY_CACHE_HIT, this.f16932h.m25620f(zzcbcVar)).m28018a();
        kc3.m23886r(m28018a, new z41(this), this.f16934j);
        return m28018a;
    }

    /* renamed from: h */
    public final tc3 m19995h(tc3 tc3Var) {
        xu2 m28023f = this.f16927c.m28361b(bv2.RENDERER, tc3Var).m28022e(new ju2() { // from class: com.google.android.gms.internal.ads.w41
            public /* synthetic */ w41() {
            }

            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                tq2 tq2Var = (tq2) obj;
                a51.this.m19991d(tq2Var);
                return tq2Var;
            }
        }).m28023f(this.f16929e);
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20966D4)).booleanValue()) {
            m28023f = m28023f.m28026i(((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20976E4)).intValue(), TimeUnit.SECONDS);
        }
        return m28023f.m28018a();
    }

    /* renamed from: i */
    public final tc3 m19996i() {
        zzl zzlVar = this.f16926b.f19398d;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return m19997j(this.f16933i.m20426c());
        }
        hv2 hv2Var = this.f16927c;
        return qu2.m25890c(this.f16925a.m24417a(), bv2.PRELOADED_LOADER, hv2Var).m28018a();
    }

    /* renamed from: j */
    public final tc3 m19997j(tc3 tc3Var) {
        tq2 tq2Var = this.f16931g;
        if (tq2Var != null) {
            hv2 hv2Var = this.f16927c;
            return qu2.m25890c(kc3.m23877i(tq2Var), bv2.SERVER_TRANSACTION, hv2Var).m28018a();
        }
        zzt.zzc().m27996j();
        return this.f16927c.m28361b(bv2.SERVER_TRANSACTION, tc3Var).m28023f(new qb3() { // from class: com.google.android.gms.internal.ads.v41
            public /* synthetic */ v41() {
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return dz1.this.mo21571a((zzcbc) obj);
            }
        }).m28018a();
    }

    /* renamed from: k */
    public final void m19998k(tq2 tq2Var) {
        this.f16931g = tq2Var;
    }
}
