package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class ab0 extends AbstractC4759mg implements cb0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ab0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.cb0
    /* renamed from: E3 */
    public final void mo20045E3(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    /* renamed from: c */
    public final void mo20046c(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    /* renamed from: p3 */
    public final void mo20047p3(ea0 ea0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, ea0Var);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(3, zza);
    }
}
