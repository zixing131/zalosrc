package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class t90 extends AbstractC4759mg implements v90 {
    public t90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.v90
    /* renamed from: c */
    public final boolean mo26263c(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.v90
    /* renamed from: o */
    public final boolean mo26264o(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(4, zza);
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.v90
    /* renamed from: t */
    public final pb0 mo26265t(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(3, zza);
        pb0 m25112N = ob0.m25112N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m25112N;
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final y90 zzb(String str) {
        y90 w90Var;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            w90Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof y90) {
                w90Var = (y90) queryLocalInterface;
            } else {
                w90Var = new w90(readStrongBinder);
            }
        }
        zzbk.recycle();
        return w90Var;
    }
}
