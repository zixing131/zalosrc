package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class m42 implements i32 {

    /* renamed from: a */
    private final Context f24378a;

    /* renamed from: b */
    private final p21 f24379b;

    /* renamed from: c */
    private View f24380c;

    /* renamed from: d */
    private ea0 f24381d;

    public m42(Context context, p21 p21Var) {
        this.f24378a = context;
        this.f24379b = p21Var;
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20427a(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        View view;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21028J6)).booleanValue() && iq2Var.f22330i0) {
            try {
                view = (View) BinderC4273d.m19914Q(this.f24381d.zze());
                boolean zzf = this.f24381d.zzf();
                if (view != null) {
                    if (zzf) {
                        try {
                            view = (View) kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.i42

                                /* renamed from: b */
                                public final /* synthetic */ View f22060b;

                                /* renamed from: c */
                                public final /* synthetic */ iq2 f22061c;

                                public /* synthetic */ i42(View view2, iq2 iq2Var2) {
                                    r2 = view2;
                                    r3 = iq2Var2;
                                }

                                @Override // com.google.android.gms.internal.ads.qb3
                                public final tc3 zza(Object obj) {
                                    return m42.this.m24466c(r2, r3, obj);
                                }
                            }, kl0.f23367e).get();
                        } catch (InterruptedException | ExecutionException e11) {
                            throw new zzfek(e11);
                        }
                    }
                } else {
                    throw new zzfek(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e12) {
                throw new zzfek(e12);
            }
        } else {
            view2 = this.f24380c;
        }
        t11 mo21153a = this.f24379b.mo21153a(new k41(tq2Var, iq2Var2, f32Var.f19948a), new z11(view2, null, new t31() { // from class: com.google.android.gms.internal.ads.j42
            public /* synthetic */ j42() {
            }

            @Override // com.google.android.gms.internal.ads.t31
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                try {
                    return ((pb0) f32.this.f19949b).zze();
                } catch (RemoteException e13) {
                    throw new zzfek(e13);
                }
            }
        }, (jq2) iq2Var2.f22350v.get(0)));
        mo21153a.mo26531i().m23936B0(view2);
        ((x42) f32Var.f19950c).m27826Q(mo21153a.mo24742f());
        return mo21153a.mo26530h();
    }

    @Override // com.google.android.gms.internal.ads.i32
    /* renamed from: b */
    public final void mo20428b(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
        try {
            ((pb0) f32Var.f19949b).mo20067l(iq2Var.f22314a0);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21028J6)).booleanValue() && iq2Var.f22330i0) {
                ((pb0) f32Var.f19949b).mo20060C0(iq2Var.f22308V, iq2Var.f22351w.toString(), tq2Var.f28472a.f26941a.f19398d, BinderC4273d.m19913I3(this.f24378a), new l42(this, f32Var, null), (ba0) f32Var.f19950c, tq2Var.f28472a.f26941a.f19399e);
            } else {
                ((pb0) f32Var.f19949b).mo20064b0(iq2Var.f22308V, iq2Var.f22351w.toString(), tq2Var.f28472a.f26941a.f19398d, BinderC4273d.m19913I3(this.f24378a), new l42(this, f32Var, null), (ba0) f32Var.f19950c, tq2Var.f28472a.f26941a.f19399e);
            }
        } catch (RemoteException e11) {
            throw new zzfek(e11);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ tc3 m24466c(View view, iq2 iq2Var, Object obj) {
        return kc3.m23877i(zzcyq.m28807a(this.f24378a, view, iq2Var));
    }
}
