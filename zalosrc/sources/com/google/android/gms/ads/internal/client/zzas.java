package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.t00;
import com.google.android.gms.internal.ads.ue0;
import com.google.android.gms.internal.ads.w00;
import com.google.android.gms.internal.ads.x00;
import com.google.android.gms.internal.ads.zzcgs;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzas extends zzav {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzau zzauVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzauVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzi(BinderC4273d.m19913I3(this.zza), BinderC4273d.m19913I3(this.zzb), BinderC4273d.m19913I3(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        ue0 ue0Var;
        m20 m20Var;
        AbstractC4554gx.m22622c(this.zza.getContext());
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21375s8)).booleanValue()) {
            try {
                return t00.zze(((x00) bl0.m20569b(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzar
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.al0
                    public final Object zza(Object obj) {
                        return w00.m27441N(obj);
                    }
                })).mo27109a0(BinderC4273d.m19913I3(this.zza), BinderC4273d.m19913I3(this.zzb), BinderC4273d.m19913I3(this.zzc)));
            } catch (RemoteException | zzcgs | NullPointerException e11) {
                this.zzd.zzh = se0.m26287c(this.zza.getContext());
                ue0Var = this.zzd.zzh;
                ue0Var.mo26290b(e11, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        m20Var = this.zzd.zzg;
        return m20Var.m24448a(this.zza, this.zzb, this.zzc);
    }
}
