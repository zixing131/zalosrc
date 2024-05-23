package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class g42 implements i32 {

    /* renamed from: a */
    private final Context f20400a;

    /* renamed from: b */
    private final p21 f20401b;

    /* renamed from: c */
    private final Executor f20402c;

    public g42(Context context, p21 p21Var, Executor executor) {
        this.f20400a = context;
        this.f20401b = p21Var;
        this.f20402c = executor;
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, final iq2 iq2Var, f32 f32Var) {
        final View m28307d;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21028J6)).booleanValue() && iq2Var.f22330i0) {
            ea0 m28309f = ((yr2) f32Var.f19949b).m28309f();
            if (m28309f != null) {
                try {
                    m28307d = (View) BinderC4273d.m19914Q(m28309f.zze());
                    boolean zzf = m28309f.zzf();
                    if (m28307d != null) {
                        if (zzf) {
                            try {
                                m28307d = (View) kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.f42
                                    @Override // com.google.android.gms.internal.ads.qb3
                                    public final tc3 zza(Object obj) {
                                        return g42.this.m22279c(m28307d, iq2Var, obj);
                                    }
                                }, kl0.f23367e).get();
                            } catch (InterruptedException | ExecutionException e11) {
                                throw new zzfek(e11);
                            }
                        }
                    } else {
                        throw new zzfek(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                } catch (RemoteException e12) {
                    throw new zzfek(e12);
                }
            } else {
                yk0.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfek(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            m28307d = ((yr2) f32Var.f19949b).m28307d();
        }
        p21 p21Var = this.f20401b;
        k41 k41Var = new k41(tq2Var, iq2Var, f32Var.f19948a);
        final yr2 yr2Var = (yr2) f32Var.f19949b;
        t11 mo21153a = p21Var.mo21153a(k41Var, new z11(m28307d, null, new t31() { // from class: com.google.android.gms.internal.ads.e42
            @Override // com.google.android.gms.internal.ads.t31
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return yr2.this.m28308e();
            }
        }, (jq2) iq2Var.f22350v.get(0)));
        mo21153a.mo26531i().m23936B0(m28307d);
        mo21153a.mo24384c().m23890s0(new dz0((yr2) f32Var.f19949b), this.f20402c);
        ((x42) f32Var.f19950c).m27826Q(mo21153a.mo24743g());
        return mo21153a.mo26530h();
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        zzq m23005a;
        zzq zzqVar = tq2Var.f28472a.f26941a.f19399e;
        if (zzqVar.zzn) {
            m23005a = new zzq(this.f20400a, zzb.zzd(zzqVar.zze, zzqVar.zzb));
        } else {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21028J6)).booleanValue() && iq2Var.f22330i0) {
                m23005a = new zzq(this.f20400a, zzb.zze(zzqVar.zze, zzqVar.zzb));
            } else {
                m23005a = hr2.m23005a(this.f20400a, iq2Var.f22350v);
            }
        }
        zzq zzqVar2 = m23005a;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21028J6)).booleanValue() && iq2Var.f22330i0) {
            ((yr2) f32Var.f19949b).m28319p(this.f20400a, zzqVar2, tq2Var.f28472a.f26941a.f19398d, iq2Var.f22351w.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(iq2Var.f22348t), (ba0) f32Var.f19950c);
        } else {
            ((yr2) f32Var.f19949b).m28318o(this.f20400a, zzqVar2, tq2Var.f28472a.f26941a.f19398d, iq2Var.f22351w.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(iq2Var.f22348t), (ba0) f32Var.f19950c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ tc3 m22279c(View view, iq2 iq2Var, Object obj) {
        return kc3.m23877i(zzcyq.m28807a(this.f20400a, view, iq2Var));
    }
}
