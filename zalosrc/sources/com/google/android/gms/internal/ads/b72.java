package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class b72 implements i32 {

    /* renamed from: a */
    private final Context f17649a;

    /* renamed from: b */
    private final sp1 f17650b;

    public b72(Context context, sp1 sp1Var) {
        this.f17649a = context;
        this.f17650b = sp1Var;
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        h52 h52Var = new h52(iq2Var, (pb0) f32Var.f19949b, true);
        op1 mo25608b = this.f17650b.mo25608b(new k41(tq2Var, iq2Var, f32Var.f19948a), new pp1(h52Var));
        h52Var.m22709b(mo25608b.mo23401b());
        ((x42) f32Var.f19950c).m27826Q(mo25608b.mo24392n());
        return mo25608b.mo24389k();
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        try {
            ((pb0) f32Var.f19949b).mo20067l(iq2Var.f22314a0);
            if (tq2Var.f28472a.f26941a.f19409o.f26311a == 3) {
                ((pb0) f32Var.f19949b).mo20065c2(iq2Var.f22308V, iq2Var.f22351w.toString(), tq2Var.f28472a.f26941a.f19398d, BinderC4273d.m19913I3(this.f17649a), new z62(this, f32Var, null), (ba0) f32Var.f19950c);
            } else {
                ((pb0) f32Var.f19949b).mo20061Q1(iq2Var.f22308V, iq2Var.f22351w.toString(), tq2Var.f28472a.f26941a.f19398d, BinderC4273d.m19913I3(this.f17649a), new z62(this, f32Var, null), (ba0) f32Var.f19950c);
            }
        } catch (RemoteException e11) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e11);
        }
    }
}
