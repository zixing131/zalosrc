package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.al2;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.f50;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gd0;
import com.google.android.gms.internal.ads.i50;
import com.google.android.gms.internal.ads.lo2;
import com.google.android.gms.internal.ads.mu1;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.om2;
import com.google.android.gms.internal.ads.q92;
import com.google.android.gms.internal.ads.qj0;
import com.google.android.gms.internal.ads.qk1;
import com.google.android.gms.internal.ads.sk1;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.zk2;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ClientApi extends zzcb {
    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(InterfaceC4271b interfaceC4271b, String str, v90 v90Var, int i11) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        return new q92(vs0.m27343e(context, v90Var, i11), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(InterfaceC4271b interfaceC4271b, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, v90 v90Var, int i11) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        zk2 mo22609u = vs0.m27343e(context, v90Var, i11).mo22609u();
        mo22609u.zza(str);
        mo22609u.mo27060a(context);
        al2 zzc = mo22609u.zzc();
        if (i11 >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21351q4)).intValue()) {
            return zzc.zzb();
        }
        return zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(InterfaceC4271b interfaceC4271b, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, v90 v90Var, int i11) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        om2 mo22610v = vs0.m27343e(context, v90Var, i11).mo22610v();
        mo22610v.mo21817b(context);
        mo22610v.mo21816a(zzqVar);
        mo22610v.zzb(str);
        return mo22610v.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(InterfaceC4271b interfaceC4271b, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, v90 v90Var, int i11) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        lo2 mo22611w = vs0.m27343e(context, v90Var, i11).mo22611w();
        mo22611w.mo21161b(context);
        mo22611w.mo21160a(zzqVar);
        mo22611w.zzb(str);
        return mo22611w.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(InterfaceC4271b interfaceC4271b, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i11) {
        return new zzs((Context) BinderC4273d.m19914Q(interfaceC4271b), zzqVar, str, new zzcgv(223104000, i11, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(InterfaceC4271b interfaceC4271b, int i11) {
        return vs0.m27343e((Context) BinderC4273d.m19914Q(interfaceC4271b), null, i11).mo22594f();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final o00 zzh(InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2) {
        return new sk1((FrameLayout) BinderC4273d.m19914Q(interfaceC4271b), (FrameLayout) BinderC4273d.m19914Q(interfaceC4271b2), 223104000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final u00 zzi(InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3) {
        return new qk1((View) BinderC4273d.m19914Q(interfaceC4271b), (HashMap) BinderC4273d.m19914Q(interfaceC4271b2), (HashMap) BinderC4273d.m19914Q(interfaceC4271b3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final i50 zzj(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11, f50 f50Var) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        mu1 mo22602n = vs0.m27343e(context, v90Var, i11).mo22602n();
        mo22602n.mo24740a(context);
        mo22602n.mo24741b(f50Var);
        return mo22602n.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final gd0 zzk(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) {
        return vs0.m27343e((Context) BinderC4273d.m19914Q(interfaceC4271b), v90Var, i11).mo22604p();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final od0 zzl(InterfaceC4271b interfaceC4271b) {
        Activity activity = (Activity) BinderC4273d.m19914Q(interfaceC4271b);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i11 = zza.zzk;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
                        }
                        return new zzac(activity);
                    }
                    return new zzy(activity, zza);
                }
                return new zzaf(activity);
            }
            return new zzae(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final fg0 zzm(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        bq2 mo22612x = vs0.m27343e(context, v90Var, i11).mo22612x();
        mo22612x.mo20644a(context);
        return mo22612x.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final ug0 zzn(InterfaceC4271b interfaceC4271b, String str, v90 v90Var, int i11) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        bq2 mo22612x = vs0.m27343e(context, v90Var, i11).mo22612x();
        mo22612x.mo20644a(context);
        mo22612x.zza(str);
        return mo22612x.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final qj0 zzo(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) {
        return vs0.m27343e((Context) BinderC4273d.m19914Q(interfaceC4271b), v90Var, i11).mo22607s();
    }
}
