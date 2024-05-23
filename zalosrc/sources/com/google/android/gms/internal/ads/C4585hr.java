package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: com.google.android.gms.internal.ads.hr */
/* loaded from: classes2.dex */
public final class C4585hr extends AbstractC4759mg implements InterfaceC4658jr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4585hr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    /* renamed from: E1 */
    public final void mo23001E1(zzde zzdeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzdeVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    /* renamed from: u2 */
    public final void mo23002u2(boolean z11) {
        Parcel zza = zza();
        AbstractC4871pg.m25457d(zza, z11);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    /* renamed from: x3 */
    public final void mo23003x3(InterfaceC4271b interfaceC4271b, InterfaceC4919qr interfaceC4919qr) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, interfaceC4919qr);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    public final zzdh zzf() {
        Parcel zzbk = zzbk(5, zza());
        zzdh zzb = zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }
}
