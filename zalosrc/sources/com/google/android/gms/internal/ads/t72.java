package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class t72 implements i32 {

    /* renamed from: a */
    private final Context f28251a;

    /* renamed from: b */
    private final Executor f28252b;

    /* renamed from: c */
    private final sp1 f28253c;

    public t72(Context context, Executor executor, sp1 sp1Var) {
        this.f28251a = context;
        this.f28252b = executor;
        this.f28253c = sp1Var;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ Executor m26582c(t72 t72Var) {
        return t72Var.f28252b;
    }

    /* renamed from: e */
    public static final void m26584e(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        try {
            ((yr2) f32Var.f19949b).m28317n(tq2Var.f28472a.f26941a.f19398d, iq2Var.f22351w.toString());
        } catch (Exception e11) {
            yk0.zzk("Fail to load ad from adapter ".concat(String.valueOf(f32Var.f19948a)), e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, final f32 f32Var) {
        op1 mo25608b = this.f28253c.mo25608b(new k41(tq2Var, iq2Var, f32Var.f19948a), new pp1(new sh1() { // from class: com.google.android.gms.internal.ads.p72
            @Override // com.google.android.gms.internal.ads.sh1
            /* renamed from: a */
            public final void mo21616a(boolean z11, Context context, j81 j81Var) {
                f32 f32Var2 = f32.this;
                try {
                    ((yr2) f32Var2.f19949b).m28327x(z11);
                    ((yr2) f32Var2.f19949b).m28302B();
                } catch (zzfek e11) {
                    yk0.zzk("Cannot show rewarded video.", e11);
                    throw new zzdmo(e11.getCause());
                }
            }
        }));
        mo25608b.mo24384c().m23890s0(new dz0((yr2) f32Var.f19949b), this.f28252b);
        e91 mo24385d = mo25608b.mo24385d();
        t71 mo24383a = mo25608b.mo24383a();
        ((y42) f32Var.f19950c).m28125Q(new s72(this, mo25608b.mo24386h(), mo24383a, mo24385d, mo25608b.mo24387i()));
        return mo25608b.mo24389k();
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        if (!((yr2) f32Var.f19949b).m28304a()) {
            ((y42) f32Var.f19950c).m28124I3(new r72(this, tq2Var, iq2Var, f32Var));
            ((yr2) f32Var.f19949b).m28314k(this.f28251a, tq2Var.f28472a.f26941a.f19398d, null, (ng0) f32Var.f19950c, iq2Var.f22351w.toString());
            return;
        }
        m26584e(tq2Var, iq2Var, f32Var);
    }
}
