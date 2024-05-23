package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class y52 implements i32 {

    /* renamed from: a */
    private final Context f30778a;

    /* renamed from: b */
    private final hi1 f30779b;

    /* renamed from: c */
    private final Executor f30780c;

    public y52(Context context, hi1 hi1Var, Executor executor) {
        this.f30778a = context;
        this.f30779b = hi1Var;
        this.f30780c = executor;
    }

    /* renamed from: c */
    private static final boolean m28131c(tq2 tq2Var, int i11) {
        return tq2Var.f28472a.f26941a.f19401g.contains(Integer.toString(i11));
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        vj1 m27232D;
        ga0 m28305b = ((yr2) f32Var.f19949b).m28305b();
        ha0 m28306c = ((yr2) f32Var.f19949b).m28306c();
        ka0 m28310g = ((yr2) f32Var.f19949b).m28310g();
        if (m28310g != null && m28131c(tq2Var, 6)) {
            m27232D = vj1.m27238a0(m28310g);
        } else if (m28305b != null && m28131c(tq2Var, 6)) {
            m27232D = vj1.m27233E(m28305b);
        } else if (m28305b != null && m28131c(tq2Var, 2)) {
            m27232D = vj1.m27231C(m28305b);
        } else if (m28306c != null && m28131c(tq2Var, 6)) {
            m27232D = vj1.m27234F(m28306c);
        } else if (m28306c != null && m28131c(tq2Var, 1)) {
            m27232D = vj1.m27232D(m28306c);
        } else {
            throw new zzekr(1, "No native ad mappers");
        }
        if (tq2Var.f28472a.f26941a.f19401g.contains(Integer.toString(m27232D.m27242K()))) {
            xj1 mo21063d = this.f30779b.mo21063d(new k41(tq2Var, iq2Var, f32Var.f19948a), new ik1(m27232D), new xl1(m28306c, m28305b, m28310g, null));
            ((x42) f32Var.f19950c).m27826Q(mo21063d.mo24743g());
            mo21063d.mo24384c().m23890s0(new dz0((yr2) f32Var.f19949b), this.f30780c);
            return mo21063d.mo24744h();
        }
        throw new zzekr(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        yr2 yr2Var = (yr2) f32Var.f19949b;
        Context context = this.f30778a;
        zzl zzlVar = tq2Var.f28472a.f26941a.f19398d;
        String jSONObject = iq2Var.f22351w.toString();
        String zzl = com.google.android.gms.ads.internal.util.zzbu.zzl(iq2Var.f22348t);
        ba0 ba0Var = (ba0) f32Var.f19950c;
        dr2 dr2Var = tq2Var.f28472a.f26941a;
        yr2Var.m28321r(context, zzlVar, jSONObject, zzl, ba0Var, dr2Var.f19403i, dr2Var.f19401g);
    }
}
