package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class g13 extends AbstractC4759mg implements IInterface {
    public g13(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: E */
    public final zzfoh m22264E(zzfof zzfofVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzfofVar);
        Parcel zzbk = zzbk(1, zza);
        zzfoh zzfohVar = (zzfoh) AbstractC4871pg.m25454a(zzbk, zzfoh.CREATOR);
        zzbk.recycle();
        return zzfohVar;
    }

    /* renamed from: N */
    public final zzfoq m22265N(zzfoo zzfooVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzfooVar);
        Parcel zzbk = zzbk(3, zza);
        zzfoq zzfoqVar = (zzfoq) AbstractC4871pg.m25454a(zzbk, zzfoq.CREATOR);
        zzbk.recycle();
        return zzfoqVar;
    }

    /* renamed from: Q */
    public final void m22266Q(zzfoc zzfocVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzfocVar);
        zzbl(2, zza);
    }
}
