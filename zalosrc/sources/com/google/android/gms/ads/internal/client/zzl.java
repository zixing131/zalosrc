package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zk0;
import java.util.ArrayList;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzn();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfb zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;
    public final zzc zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;

    public zzl(int i11, long j11, Bundle bundle, int i12, List list, boolean z11, int i13, boolean z12, String str, zzfb zzfbVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z13, zzc zzcVar, int i14, String str5, List list3, int i15, String str6) {
        this.zza = i11;
        this.zzb = j11;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i12;
        this.zze = list;
        this.zzf = z11;
        this.zzg = i13;
        this.zzh = z12;
        this.zzi = str;
        this.zzj = zzfbVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z13;
        this.zzs = zzcVar;
        this.zzt = i14;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i15;
        this.zzx = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        if (this.zza != zzlVar.zza || this.zzb != zzlVar.zzb || !zk0.m28532a(this.zzc, zzlVar.zzc) || this.zzd != zzlVar.zzd || !AbstractC4199m.m19701a(this.zze, zzlVar.zze) || this.zzf != zzlVar.zzf || this.zzg != zzlVar.zzg || this.zzh != zzlVar.zzh || !AbstractC4199m.m19701a(this.zzi, zzlVar.zzi) || !AbstractC4199m.m19701a(this.zzj, zzlVar.zzj) || !AbstractC4199m.m19701a(this.zzk, zzlVar.zzk) || !AbstractC4199m.m19701a(this.zzl, zzlVar.zzl) || !zk0.m28532a(this.zzm, zzlVar.zzm) || !zk0.m28532a(this.zzn, zzlVar.zzn) || !AbstractC4199m.m19701a(this.zzo, zzlVar.zzo) || !AbstractC4199m.m19701a(this.zzp, zzlVar.zzp) || !AbstractC4199m.m19701a(this.zzq, zzlVar.zzq) || this.zzr != zzlVar.zzr || this.zzt != zzlVar.zzt || !AbstractC4199m.m19701a(this.zzu, zzlVar.zzu) || !AbstractC4199m.m19701a(this.zzv, zzlVar.zzv) || this.zzw != zzlVar.zzw || !AbstractC4199m.m19701a(this.zzx, zzlVar.zzx)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.zza);
        AbstractC2552a.m12929r(parcel, 2, this.zzb);
        AbstractC2552a.m12916e(parcel, 3, this.zzc, false);
        AbstractC2552a.m12924m(parcel, 4, this.zzd);
        AbstractC2552a.m12936y(parcel, 5, this.zze, false);
        AbstractC2552a.m12914c(parcel, 6, this.zzf);
        AbstractC2552a.m12924m(parcel, 7, this.zzg);
        AbstractC2552a.m12914c(parcel, 8, this.zzh);
        AbstractC2552a.m12934w(parcel, 9, this.zzi, false);
        AbstractC2552a.m12932u(parcel, 10, this.zzj, i11, false);
        AbstractC2552a.m12932u(parcel, 11, this.zzk, i11, false);
        AbstractC2552a.m12934w(parcel, 12, this.zzl, false);
        AbstractC2552a.m12916e(parcel, 13, this.zzm, false);
        AbstractC2552a.m12916e(parcel, 14, this.zzn, false);
        AbstractC2552a.m12936y(parcel, 15, this.zzo, false);
        AbstractC2552a.m12934w(parcel, 16, this.zzp, false);
        AbstractC2552a.m12934w(parcel, 17, this.zzq, false);
        AbstractC2552a.m12914c(parcel, 18, this.zzr);
        AbstractC2552a.m12932u(parcel, 19, this.zzs, i11, false);
        AbstractC2552a.m12924m(parcel, 20, this.zzt);
        AbstractC2552a.m12934w(parcel, 21, this.zzu, false);
        AbstractC2552a.m12936y(parcel, 22, this.zzv, false);
        AbstractC2552a.m12924m(parcel, 23, this.zzw);
        AbstractC2552a.m12934w(parcel, 24, this.zzx, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
