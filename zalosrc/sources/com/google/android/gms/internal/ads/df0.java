package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class df0 extends AbstractC4759mg implements ff0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public df0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: B2 */
    public final void mo21363B2(zzcbc zzcbcVar, jf0 jf0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzcbcVar);
        AbstractC4871pg.m25460g(zza, jf0Var);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: S3 */
    public final void mo21364S3(String str, jf0 jf0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, jf0Var);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: j3 */
    public final void mo21365j3(zzcbc zzcbcVar, jf0 jf0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzcbcVar);
        AbstractC4871pg.m25460g(zza, jf0Var);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: y3 */
    public final void mo21366y3(zzcbc zzcbcVar, jf0 jf0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzcbcVar);
        AbstractC4871pg.m25460g(zza, jf0Var);
        zzbl(5, zza);
    }
}
