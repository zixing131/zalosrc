package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class f52 implements c32 {

    /* renamed from: a */
    private final Context f20017a;

    /* renamed from: b */
    private final jq1 f20018b;

    /* renamed from: c */
    private final lh1 f20019c;

    /* renamed from: d */
    private final dr2 f20020d;

    /* renamed from: e */
    private final Executor f20021e;

    /* renamed from: f */
    private final zzcgv f20022f;

    /* renamed from: g */
    private final f40 f20023g;

    /* renamed from: h */
    private final boolean f20024h = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20969D7)).booleanValue();

    public f52(Context context, zzcgv zzcgvVar, dr2 dr2Var, Executor executor, lh1 lh1Var, jq1 jq1Var, f40 f40Var) {
        this.f20017a = context;
        this.f20020d = dr2Var;
        this.f20019c = lh1Var;
        this.f20021e = executor;
        this.f20022f = zzcgvVar;
        this.f20018b = jq1Var;
        this.f20023g = f40Var;
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
        tc3 m23882n = kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.z42
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return f52.this.m21946c(iq2Var, tq2Var, nq1Var, obj);
            }
        }, this.f20021e);
        m23882n.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.b52
            @Override // java.lang.Runnable
            public final void run() {
                nq1.this.m24977b();
            }
        }, this.f20021e);
        return m23882n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final /* synthetic */ tc3 m21946c(final iq2 iq2Var, tq2 tq2Var, nq1 nq1Var, Object obj) {
        f40 f40Var;
        final zq0 m23723a = this.f20018b.m23723a(this.f20020d.f19399e, iq2Var, tq2Var.f28473b.f27823b);
        m23723a.mo26689U(iq2Var.f22310X);
        nq1Var.m24976a(this.f20017a, (View) m23723a);
        pl0 pl0Var = new pl0();
        final kg1 mo20307c = this.f20019c.mo20307c(new k41(tq2Var, iq2Var, null), new ng1(new e52(this.f20017a, this.f20022f, pl0Var, iq2Var, m23723a, this.f20020d, this.f20024h, this.f20023g), m23723a));
        pl0Var.zzd(mo20307c);
        mo20307c.mo23401b().m23890s0(new q81() { // from class: com.google.android.gms.internal.ads.c52
            @Override // com.google.android.gms.internal.ads.q81
            public final void zzl() {
                zq0 zq0Var = zq0.this;
                if (zq0Var.zzP() != null) {
                    zq0Var.zzP().zzp();
                }
            }
        }, kl0.f23368f);
        iq1 mo23946k = mo20307c.mo23946k();
        if (this.f20024h) {
            f40Var = this.f20023g;
        } else {
            f40Var = null;
        }
        mo23946k.m23337i(m23723a, true, f40Var);
        mo20307c.mo23946k();
        mq2 mq2Var = iq2Var.f22348t;
        return kc3.m23881m(iq1.m23330j(m23723a, mq2Var.f24722b, mq2Var.f24721a), new y43() { // from class: com.google.android.gms.internal.ads.d52
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj2) {
                zq0 zq0Var = m23723a;
                iq2 iq2Var2 = iq2Var;
                kg1 kg1Var = mo20307c;
                if (iq2Var2.f22300N) {
                    zq0Var.mo26670C();
                }
                zq0Var.mo26715z0();
                zq0Var.onPause();
                return kg1Var.mo23944i();
            }
        }, this.f20021e);
    }
}
