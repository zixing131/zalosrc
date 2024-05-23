package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bs */
/* loaded from: classes2.dex */
public final class C4365bs extends AbstractC4759mg implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4365bs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: E */
    public final long m20702E(zzbeb zzbebVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzbebVar);
        Parcel zzbk = zzbk(3, zza);
        long readLong = zzbk.readLong();
        zzbk.recycle();
        return readLong;
    }

    /* renamed from: N */
    public final zzbdy m20703N(zzbeb zzbebVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzbebVar);
        Parcel zzbk = zzbk(1, zza);
        zzbdy zzbdyVar = (zzbdy) AbstractC4871pg.m25454a(zzbk, zzbdy.CREATOR);
        zzbk.recycle();
        return zzbdyVar;
    }

    /* renamed from: Q */
    public final zzbdy m20704Q(zzbeb zzbebVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzbebVar);
        Parcel zzbk = zzbk(2, zza);
        zzbdy zzbdyVar = (zzbdy) AbstractC4871pg.m25454a(zzbk, zzbdy.CREATOR);
        zzbk.recycle();
        return zzbdyVar;
    }
}
