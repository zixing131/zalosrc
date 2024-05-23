package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class c42 implements c32 {

    /* renamed from: a */
    private final p21 f18100a;

    /* renamed from: b */
    private final Context f18101b;

    /* renamed from: c */
    private final jq1 f18102c;

    /* renamed from: d */
    private final dr2 f18103d;

    /* renamed from: e */
    private final Executor f18104e;

    /* renamed from: f */
    private final y43 f18105f;

    public c42(p21 p21Var, Context context, Executor executor, jq1 jq1Var, dr2 dr2Var, y43 y43Var) {
        this.f18101b = context;
        this.f18100a = p21Var;
        this.f18104e = executor;
        this.f18102c = jq1Var;
        this.f18103d = dr2Var;
        this.f18105f = y43Var;
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
        return kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.v32
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return c42.this.m20795c(tq2Var, iq2Var, obj);
            }
        }, this.f18104e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final /* synthetic */ tc3 m20795c(tq2 tq2Var, iq2 iq2Var, Object obj) {
        View zzdvbVar;
        zzq m23005a = hr2.m23005a(this.f18101b, iq2Var.f22350v);
        final zq0 m23723a = this.f18102c.m23723a(m23005a, iq2Var, tq2Var.f28473b.f27823b);
        m23723a.mo26689U(iq2Var.f22310X);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21028J6)).booleanValue() && iq2Var.f22330i0) {
            zzdvbVar = zzcyq.m28807a(this.f18101b, (View) m23723a, iq2Var);
        } else {
            zzdvbVar = new zzdvb(this.f18101b, (View) m23723a, (zzas) this.f18105f.apply(iq2Var));
        }
        final t11 mo21153a = this.f18100a.mo21153a(new k41(tq2Var, iq2Var, null), new z11(zzdvbVar, m23723a, new t31() { // from class: com.google.android.gms.internal.ads.w32
            @Override // com.google.android.gms.internal.ads.t31
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zq0.this.zzs();
            }
        }, hr2.m23007c(m23005a)));
        mo21153a.mo26532j().m23337i(m23723a, false, null);
        o81 mo23401b = mo21153a.mo23401b();
        q81 q81Var = new q81() { // from class: com.google.android.gms.internal.ads.x32
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
        mo21153a.mo26532j();
        mq2 mq2Var = iq2Var.f22348t;
        tc3 m23330j = iq1.m23330j(m23723a, mq2Var.f24722b, mq2Var.f24721a);
        if (iq2Var.f22300N) {
            m23330j.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.y32
                @Override // java.lang.Runnable
                public final void run() {
                    zq0.this.mo26670C();
                }
            }, this.f18104e);
        }
        m23330j.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.a42
            @Override // java.lang.Runnable
            public final void run() {
                c42.this.m20796d(m23723a);
            }
        }, this.f18104e);
        return kc3.m23881m(m23330j, new y43() { // from class: com.google.android.gms.internal.ads.b42
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj2) {
                return t11.this.mo26530h();
            }
        }, uc3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m20796d(zq0 zq0Var) {
        zq0Var.mo26715z0();
        wr0 zzs = zq0Var.zzs();
        zzff zzffVar = this.f18103d.f19395a;
        if (zzffVar != null && zzs != null) {
            zzs.m27700W4(zzffVar);
        }
    }
}
