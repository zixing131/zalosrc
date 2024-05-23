package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzu(String str, long j11, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j11;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.zza, false);
        AbstractC2552a.m12929r(parcel, 2, this.zzb);
        AbstractC2552a.m12932u(parcel, 3, this.zzc, i11, false);
        AbstractC2552a.m12916e(parcel, 4, this.zzd, false);
        AbstractC2552a.m12934w(parcel, 5, this.zze, false);
        AbstractC2552a.m12934w(parcel, 6, this.zzf, false);
        AbstractC2552a.m12934w(parcel, 7, this.zzg, false);
        AbstractC2552a.m12934w(parcel, 8, this.zzh, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
