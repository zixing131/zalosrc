package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.kr */
/* loaded from: classes2.dex */
public final class C4695kr extends AbstractC4759mg implements InterfaceC4770mr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4695kr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4770mr
    /* renamed from: a1 */
    public final void mo21782a1(InterfaceC4658jr interfaceC4658jr) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4658jr);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4770mr
    /* renamed from: p4 */
    public final void mo21783p4(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4770mr
    public final void zzb(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(2, zza);
    }
}
