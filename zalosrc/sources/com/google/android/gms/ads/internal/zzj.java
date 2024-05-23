package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(boolean z11, boolean z12, String str, boolean z13, float f11, int i11, boolean z14, boolean z15, boolean z16) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = str;
        this.zzd = z13;
        this.zze = f11;
        this.zzf = i11;
        this.zzg = z14;
        this.zzh = z15;
        this.zzi = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 2, this.zza);
        AbstractC2552a.m12914c(parcel, 3, this.zzb);
        AbstractC2552a.m12934w(parcel, 4, this.zzc, false);
        AbstractC2552a.m12914c(parcel, 5, this.zzd);
        AbstractC2552a.m12921j(parcel, 6, this.zze);
        AbstractC2552a.m12924m(parcel, 7, this.zzf);
        AbstractC2552a.m12914c(parcel, 8, this.zzg);
        AbstractC2552a.m12914c(parcel, 9, this.zzh);
        AbstractC2552a.m12914c(parcel, 10, this.zzi);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzj(boolean z11, boolean z12, boolean z13, float f11, int i11, boolean z14, boolean z15, boolean z16) {
        this(z11, z12, null, z13, f11, -1, z14, z15, z16);
    }
}
