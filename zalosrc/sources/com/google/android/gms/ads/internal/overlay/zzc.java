package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzx zzi;
    public final boolean zzj;

    public zzc(Intent intent, zzx zzxVar) {
        this(null, null, null, null, null, null, null, intent, BinderC4273d.m19913I3(zzxVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.zza, false);
        AbstractC2552a.m12934w(parcel, 3, this.zzb, false);
        AbstractC2552a.m12934w(parcel, 4, this.zzc, false);
        AbstractC2552a.m12934w(parcel, 5, this.zzd, false);
        AbstractC2552a.m12934w(parcel, 6, this.zze, false);
        AbstractC2552a.m12934w(parcel, 7, this.zzf, false);
        AbstractC2552a.m12934w(parcel, 8, this.zzg, false);
        AbstractC2552a.m12932u(parcel, 9, this.zzh, i11, false);
        AbstractC2552a.m12923l(parcel, 10, BinderC4273d.m19913I3(this.zzi).asBinder(), false);
        AbstractC2552a.m12914c(parcel, 11, this.zzj);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzx) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder));
        this.zzj = z11;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzx zzxVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, BinderC4273d.m19913I3(zzxVar).asBinder(), false);
    }
}
