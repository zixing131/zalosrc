package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class n32 implements c32 {

    /* renamed from: a */
    private final f11 f24987a;

    /* renamed from: b */
    private final Context f24988b;

    /* renamed from: c */
    private final jq1 f24989c;

    /* renamed from: d */
    private final dr2 f24990d;

    /* renamed from: e */
    private final Executor f24991e;

    /* renamed from: f */
    private final zzcgv f24992f;

    /* renamed from: g */
    private final f40 f24993g;

    /* renamed from: h */
    private final boolean f24994h = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20969D7)).booleanValue();

    public n32(f11 f11Var, Context context, Executor executor, jq1 jq1Var, dr2 dr2Var, zzcgv zzcgvVar, f40 f40Var) {
        this.f24988b = context;
        this.f24987a = f11Var;
        this.f24991e = executor;
        this.f24989c = jq1Var;
        this.f24990d = dr2Var;
        this.f24992f = zzcgvVar;
        this.f24993g = f40Var;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        mq2 mq2Var = iq2Var.f22348t;
        if (mq2Var != null && mq2Var.f24721a != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(final tq2 tq2Var, final iq2 iq2Var) {
        final nq1 nq1Var = new nq1();
        tc3 m23882n = kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.l32
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return n32.this.m24804c(iq2Var, tq2Var, nq1Var, obj);
            }
        }, this.f24991e);
        m23882n.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.m32
            @Override // java.lang.Runnable
            public final void run() {
                nq1.this.m24977b();
            }
        }, this.f24991e);
        return m23882n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final /* synthetic */ tc3 m24804c(final iq2 iq2Var, tq2 tq2Var, nq1 nq1Var, Object obj) {
        f40 f40Var;
        final zq0 m23723a = this.f24989c.m23723a(this.f24990d.f19399e, iq2Var, tq2Var.f28473b.f27823b);
        m23723a.mo26689U(iq2Var.f22310X);
        nq1Var.m24976a(this.f24988b, (View) m23723a);
        pl0 pl0Var = new pl0();
        final c11 mo21865a = this.f24987a.mo21865a(new k41(tq2Var, iq2Var, null), new ng1(new p32(this.f24992f, pl0Var, iq2Var, m23723a, this.f24990d, this.f24994h, this.f24993g), m23723a), new d11(iq2Var.f22316b0));
        iq1 mo20786j = mo21865a.mo20786j();
        if (this.f24994h) {
            f40Var = this.f24993g;
        } else {
            f40Var = null;
        }
        mo20786j.m23337i(m23723a, false, f40Var);
        pl0Var.zzd(mo21865a);
        mo21865a.mo23401b().m23890s0(new q81() { // from class: com.google.android.gms.internal.ads.j32
            @Override // com.google.android.gms.internal.ads.q81
            public final void zzl() {
                zq0 zq0Var = zq0.this;
                if (zq0Var.zzP() != null) {
                    zq0Var.zzP().zzp();
                }
            }
        }, kl0.f23368f);
        mo21865a.mo20786j();
        mq2 mq2Var = iq2Var.f22348t;
        return kc3.m23881m(iq1.m23330j(m23723a, mq2Var.f24722b, mq2Var.f24721a), new y43() { // from class: com.google.android.gms.internal.ads.k32
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj2) {
                zq0 zq0Var = m23723a;
                iq2 iq2Var2 = iq2Var;
                c11 c11Var = mo21865a;
                if (iq2Var2.f22300N) {
                    zq0Var.mo26670C();
                }
                zq0Var.mo26715z0();
                zq0Var.onPause();
                return c11Var.mo20784h();
            }
        }, this.f24991e);
    }
}
