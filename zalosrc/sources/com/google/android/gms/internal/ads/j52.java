package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j52 implements i32 {

    /* renamed from: a */
    private final Context f22661a;

    /* renamed from: b */
    private final lh1 f22662b;

    /* renamed from: c */
    private final zzcgv f22663c;

    /* renamed from: d */
    private final Executor f22664d;

    public j52(Context context, zzcgv zzcgvVar, lh1 lh1Var, Executor executor) {
        this.f22661a = context;
        this.f22663c = zzcgvVar;
        this.f22662b = lh1Var;
        this.f22664d = executor;
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, final f32 f32Var) {
        kg1 mo20307c = this.f22662b.mo20307c(new k41(tq2Var, iq2Var, f32Var.f19948a), new ng1(new sh1() { // from class: com.google.android.gms.internal.ads.i52
            @Override // com.google.android.gms.internal.ads.sh1
            /* renamed from: a */
            public final void mo21616a(boolean z11, Context context, j81 j81Var) {
                j52.this.m23530c(f32Var, z11, context, j81Var);
            }
        }, null));
        mo20307c.mo24384c().m23890s0(new dz0((yr2) f32Var.f19949b), this.f22664d);
        ((x42) f32Var.f19950c).m27826Q(mo20307c.mo24743g());
        return mo20307c.mo23944i();
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        ((yr2) f32Var.f19949b).m28320q(this.f22661a, tq2Var.f28472a.f26941a.f19398d, iq2Var.f22351w.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(iq2Var.f22348t), (ba0) f32Var.f19950c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m23530c(f32 f32Var, boolean z11, Context context, j81 j81Var) {
        try {
            ((yr2) f32Var.f19949b).m28327x(z11);
            if (this.f22663c.f32032r < ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20942B0)).intValue()) {
                ((yr2) f32Var.f19949b).m28328y();
            } else {
                ((yr2) f32Var.f19949b).m28329z(context);
            }
        } catch (zzfek e11) {
            yk0.zzi("Cannot show interstitial.");
            throw new zzdmo(e11.getCause());
        }
    }
}
