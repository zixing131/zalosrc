package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.q00;
import com.google.android.gms.internal.ads.r00;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ue0;
import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaq extends zzav {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzau zzauVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzauVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zzc, "native_ad_view_delegate");
        return new zzet();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzh(BinderC4273d.m19913I3(this.zza), BinderC4273d.m19913I3(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        ue0 ue0Var;
        l20 l20Var;
        AbstractC4554gx.m22622c(this.zzc);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21375s8)).booleanValue()) {
            try {
                return n00.zzbB(((r00) bl0.m20569b(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzap
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.al0
                    public final Object zza(Object obj) {
                        return q00.m25625N(obj);
                    }
                })).mo25367i2(BinderC4273d.m19913I3(this.zzc), BinderC4273d.m19913I3(this.zza), BinderC4273d.m19913I3(this.zzb), 223104000));
            } catch (RemoteException | zzcgs | NullPointerException e11) {
                this.zzd.zzh = se0.m26287c(this.zzc);
                ue0Var = this.zzd.zzh;
                ue0Var.mo26290b(e11, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        l20Var = this.zzd.zzd;
        return l20Var.m24107a(this.zzc, this.zza, this.zzb);
    }
}
