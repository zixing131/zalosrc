package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class w62 implements i32 {

    /* renamed from: a */
    private final Context f29829a;

    /* renamed from: b */
    private final Executor f29830b;

    /* renamed from: c */
    private final sp1 f29831c;

    public w62(Context context, Executor executor, sp1 sp1Var) {
        this.f29829a = context;
        this.f29830b = executor;
        this.f29831c = sp1Var;
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, final f32 f32Var) {
        op1 mo25608b = this.f29831c.mo25608b(new k41(tq2Var, iq2Var, f32Var.f19948a), new pp1(new sh1() { // from class: com.google.android.gms.internal.ads.v62
            @Override // com.google.android.gms.internal.ads.sh1
            /* renamed from: a */
            public final void mo21616a(boolean z11, Context context, j81 j81Var) {
                f32 f32Var2 = f32.this;
                try {
                    ((yr2) f32Var2.f19949b).m28327x(z11);
                    ((yr2) f32Var2.f19949b).m28301A(context);
                } catch (zzfek e11) {
                    throw new zzdmo(e11.getCause());
                }
            }
        }));
        mo25608b.mo24384c().m23890s0(new dz0((yr2) f32Var.f19949b), this.f29830b);
        ((x42) f32Var.f19950c).m27826Q(mo25608b.mo24391m());
        return mo25608b.mo24389k();
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        try {
            dr2 dr2Var = tq2Var.f28472a.f26941a;
            if (dr2Var.f19409o.f26311a == 3) {
                ((yr2) f32Var.f19949b).m28323t(this.f29829a, dr2Var.f19398d, iq2Var.f22351w.toString(), (ba0) f32Var.f19950c);
            } else {
                ((yr2) f32Var.f19949b).m28322s(this.f29829a, dr2Var.f19398d, iq2Var.f22351w.toString(), (ba0) f32Var.f19950c);
            }
        } catch (Exception e11) {
            yk0.zzk("Fail to load ad from adapter ".concat(String.valueOf(f32Var.f19948a)), e11);
        }
    }
}
