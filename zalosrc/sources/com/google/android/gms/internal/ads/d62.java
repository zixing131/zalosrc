package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class d62 implements i32 {

    /* renamed from: a */
    private final Context f19115a;

    /* renamed from: b */
    private final hi1 f19116b;

    /* renamed from: c */
    private ka0 f19117c;

    /* renamed from: d */
    private final zzcgv f19118d;

    public d62(Context context, hi1 hi1Var, zzcgv zzcgvVar) {
        this.f19115a = context;
        this.f19116b = hi1Var;
        this.f19118d = zzcgvVar;
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        if (tq2Var.f28472a.f26941a.f19401g.contains(Integer.toString(6))) {
            vj1 m27238a0 = vj1.m27238a0(this.f19117c);
            if (tq2Var.f28472a.f26941a.f19401g.contains(Integer.toString(m27238a0.m27242K()))) {
                xj1 mo21063d = this.f19116b.mo21063d(new k41(tq2Var, iq2Var, f32Var.f19948a), new ik1(m27238a0), new xl1(null, null, this.f19117c, null));
                ((x42) f32Var.f19950c).m27826Q(mo21063d.mo24742f());
                return mo21063d.mo24744h();
            }
            throw new zzekr(1, "No corresponding native ad listener");
        }
        throw new zzekr(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        try {
            ((pb0) f32Var.f19949b).mo20067l(iq2Var.f22314a0);
            if (this.f19118d.f32032r < ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21398v1)).intValue()) {
                ((pb0) f32Var.f19949b).mo20062R2(iq2Var.f22308V, iq2Var.f22351w.toString(), tq2Var.f28472a.f26941a.f19398d, BinderC4273d.m19913I3(this.f19115a), new c62(this, f32Var, null), (ba0) f32Var.f19950c);
            } else {
                ((pb0) f32Var.f19949b).mo20070y1(iq2Var.f22308V, iq2Var.f22351w.toString(), tq2Var.f28472a.f26941a.f19398d, BinderC4273d.m19913I3(this.f19115a), new c62(this, f32Var, null), (ba0) f32Var.f19950c, tq2Var.f28472a.f26941a.f19403i);
            }
        } catch (RemoteException e11) {
            throw new zzfek(e11);
        }
    }
}
