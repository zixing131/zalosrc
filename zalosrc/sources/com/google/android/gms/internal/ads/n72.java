package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class n72 implements c32 {

    /* renamed from: a */
    private final Context f25073a;

    /* renamed from: b */
    private final jq1 f25074b;

    /* renamed from: c */
    private final sp1 f25075c;

    /* renamed from: d */
    private final dr2 f25076d;

    /* renamed from: e */
    private final Executor f25077e;

    /* renamed from: f */
    private final zzcgv f25078f;

    /* renamed from: g */
    private final f40 f25079g;

    /* renamed from: h */
    private final boolean f25080h = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20969D7)).booleanValue();

    public n72(Context context, zzcgv zzcgvVar, dr2 dr2Var, Executor executor, sp1 sp1Var, jq1 jq1Var, f40 f40Var) {
        this.f25073a = context;
        this.f25076d = dr2Var;
        this.f25075c = sp1Var;
        this.f25077e = executor;
        this.f25078f = zzcgvVar;
        this.f25074b = jq1Var;
        this.f25079g = f40Var;
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
        tc3 m23882n = kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.g72
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return n72.this.m24860c(iq2Var, tq2Var, nq1Var, obj);
            }
        }, this.f25077e);
        m23882n.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.h72
            @Override // java.lang.Runnable
            public final void run() {
                nq1.this.m24977b();
            }
        }, this.f25077e);
        return m23882n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final /* synthetic */ tc3 m24860c(final iq2 iq2Var, tq2 tq2Var, nq1 nq1Var, Object obj) {
        f40 f40Var;
        final zq0 m23723a = this.f25074b.m23723a(this.f25076d.f19399e, iq2Var, tq2Var.f28473b.f27823b);
        m23723a.mo26689U(iq2Var.f22310X);
        nq1Var.m24976a(this.f25073a, (View) m23723a);
        pl0 pl0Var = new pl0();
        final op1 mo25608b = this.f25075c.mo25608b(new k41(tq2Var, iq2Var, null), new pp1(new m72(this.f25073a, this.f25074b, this.f25076d, this.f25078f, iq2Var, pl0Var, m23723a, this.f25079g, this.f25080h), m23723a));
        pl0Var.zzd(mo25608b);
        t40.m26563b(m23723a, mo25608b.mo24387i());
        mo25608b.mo23401b().m23890s0(new q81() { // from class: com.google.android.gms.internal.ads.i72
            @Override // com.google.android.gms.internal.ads.q81
            public final void zzl() {
                zq0 zq0Var = zq0.this;
                if (zq0Var.zzP() != null) {
                    zq0Var.zzP().zzp();
                }
            }
        }, kl0.f23368f);
        iq1 mo24390l = mo25608b.mo24390l();
        if (this.f25080h) {
            f40Var = this.f25079g;
        } else {
            f40Var = null;
        }
        mo24390l.m23337i(m23723a, true, f40Var);
        mo25608b.mo24390l();
        mq2 mq2Var = iq2Var.f22348t;
        return kc3.m23881m(iq1.m23330j(m23723a, mq2Var.f24722b, mq2Var.f24721a), new y43() { // from class: com.google.android.gms.internal.ads.j72
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj2) {
                zq0 zq0Var = m23723a;
                iq2 iq2Var2 = iq2Var;
                op1 op1Var = mo25608b;
                if (iq2Var2.f22300N) {
                    zq0Var.mo26670C();
                }
                zq0Var.mo26715z0();
                zq0Var.onPause();
                return op1Var.mo24389k();
            }
        }, this.f25077e);
    }
}
