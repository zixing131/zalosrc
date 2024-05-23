package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class n52 implements i32 {

    /* renamed from: a */
    private final Context f25036a;

    /* renamed from: b */
    private final lh1 f25037b;

    public n52(Context context, lh1 lh1Var) {
        this.f25036a = context;
        this.f25037b = lh1Var;
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        h52 h52Var = new h52(iq2Var, (pb0) f32Var.f19949b, false);
        kg1 mo20307c = this.f25037b.mo20307c(new k41(tq2Var, iq2Var, f32Var.f19948a), new ng1(h52Var, null));
        h52Var.m22709b(mo20307c.mo23401b());
        ((x42) f32Var.f19950c).m27826Q(mo20307c.mo24742f());
        return mo20307c.mo23944i();
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        try {
            ((pb0) f32Var.f19949b).mo20067l(iq2Var.f22314a0);
            ((pb0) f32Var.f19949b).mo20068n0(iq2Var.f22308V, iq2Var.f22351w.toString(), tq2Var.f28472a.f26941a.f19398d, BinderC4273d.m19913I3(this.f25036a), new m52(this, f32Var, null), (ba0) f32Var.f19950c);
        } catch (RemoteException e11) {
            throw new zzfek(e11);
        }
    }
}
