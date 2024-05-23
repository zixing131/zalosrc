package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class t32 implements c32 {

    /* renamed from: a */
    private final u01 f28188a;

    /* renamed from: b */
    private final Context f28189b;

    /* renamed from: c */
    private final jq1 f28190c;

    /* renamed from: d */
    private final Executor f28191d;

    public t32(u01 u01Var, Context context, Executor executor, jq1 jq1Var) {
        this.f28189b = context;
        this.f28188a = u01Var;
        this.f28191d = executor;
        this.f28190c = jq1Var;
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
        return kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.q32
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return t32.this.m26562c(tq2Var, iq2Var, obj);
            }
        }, this.f28191d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final /* synthetic */ tc3 m26562c(tq2 tq2Var, iq2 iq2Var, Object obj) {
        zzq m23005a = hr2.m23005a(this.f28189b, iq2Var.f22350v);
        final zq0 m23723a = this.f28190c.m23723a(m23005a, iq2Var, tq2Var.f28473b.f27823b);
        final l01 mo26441a = this.f28188a.mo26441a(new k41(tq2Var, iq2Var, null), new m01((View) m23723a, m23723a, hr2.m23007c(m23005a), iq2Var.f22316b0, iq2Var.f22324f0, iq2Var.f22302P));
        mo26441a.mo23403i().m23337i(m23723a, false, null);
        o81 mo23401b = mo26441a.mo23401b();
        q81 q81Var = new q81() { // from class: com.google.android.gms.internal.ads.r32
            @Override // com.google.android.gms.internal.ads.q81
            public final void zzl() {
                zq0 zq0Var = zq0.this;
                if (zq0Var.zzP() != null) {
                    zq0Var.zzP().zzp();
                }
            }
        };
        uc3 uc3Var = kl0.f23368f;
        mo23401b.m23890s0(q81Var, uc3Var);
        mo26441a.mo23403i();
        mq2 mq2Var = iq2Var.f22348t;
        return kc3.m23881m(iq1.m23330j(m23723a, mq2Var.f24722b, mq2Var.f24721a), new y43() { // from class: com.google.android.gms.internal.ads.s32
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj2) {
                return l01.this.mo23402h();
            }
        }, uc3Var);
    }
}
