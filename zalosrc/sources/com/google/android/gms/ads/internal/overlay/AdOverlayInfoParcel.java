package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.dt1;
import com.google.android.gms.internal.ads.j81;
import com.google.android.gms.internal.ads.n22;
import com.google.android.gms.internal.ads.pf1;
import com.google.android.gms.internal.ads.rv2;
import com.google.android.gms.internal.ads.x20;
import com.google.android.gms.internal.ads.z20;
import com.google.android.gms.internal.ads.zq0;
import com.google.android.gms.internal.ads.zzcgv;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzo zzc;
    public final zq0 zzd;
    public final z20 zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzz zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final zzcgv zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzj zzo;
    public final x20 zzp;
    public final String zzq;
    public final n22 zzr;
    public final dt1 zzs;
    public final rv2 zzt;
    public final zzbr zzu;
    public final String zzv;
    public final String zzw;
    public final j81 zzx;
    public final pf1 zzy;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, x20 x20Var, z20 z20Var, zzz zzzVar, zq0 zq0Var, boolean z11, int i11, String str, zzcgv zzcgvVar, pf1 pf1Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zq0Var;
        this.zzp = x20Var;
        this.zze = z20Var;
        this.zzf = null;
        this.zzg = z11;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i11;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcgvVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = pf1Var;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, this.zza, i11, false);
        AbstractC2552a.m12923l(parcel, 3, BinderC4273d.m19913I3(this.zzb).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 4, BinderC4273d.m19913I3(this.zzc).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 5, BinderC4273d.m19913I3(this.zzd).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 6, BinderC4273d.m19913I3(this.zze).asBinder(), false);
        AbstractC2552a.m12934w(parcel, 7, this.zzf, false);
        AbstractC2552a.m12914c(parcel, 8, this.zzg);
        AbstractC2552a.m12934w(parcel, 9, this.zzh, false);
        AbstractC2552a.m12923l(parcel, 10, BinderC4273d.m19913I3(this.zzi).asBinder(), false);
        AbstractC2552a.m12924m(parcel, 11, this.zzj);
        AbstractC2552a.m12924m(parcel, 12, this.zzk);
        AbstractC2552a.m12934w(parcel, 13, this.zzl, false);
        AbstractC2552a.m12932u(parcel, 14, this.zzm, i11, false);
        AbstractC2552a.m12934w(parcel, 16, this.zzn, false);
        AbstractC2552a.m12932u(parcel, 17, this.zzo, i11, false);
        AbstractC2552a.m12923l(parcel, 18, BinderC4273d.m19913I3(this.zzp).asBinder(), false);
        AbstractC2552a.m12934w(parcel, 19, this.zzq, false);
        AbstractC2552a.m12923l(parcel, 20, BinderC4273d.m19913I3(this.zzr).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 21, BinderC4273d.m19913I3(this.zzs).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 22, BinderC4273d.m19913I3(this.zzt).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 23, BinderC4273d.m19913I3(this.zzu).asBinder(), false);
        AbstractC2552a.m12934w(parcel, 24, this.zzv, false);
        AbstractC2552a.m12934w(parcel, 25, this.zzw, false);
        AbstractC2552a.m12923l(parcel, 26, BinderC4273d.m19913I3(this.zzx).asBinder(), false);
        AbstractC2552a.m12923l(parcel, 27, BinderC4273d.m19913I3(this.zzy).asBinder(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, x20 x20Var, z20 z20Var, zzz zzzVar, zq0 zq0Var, boolean z11, int i11, String str, String str2, zzcgv zzcgvVar, pf1 pf1Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zq0Var;
        this.zzp = x20Var;
        this.zze = z20Var;
        this.zzf = str2;
        this.zzg = z11;
        this.zzh = str;
        this.zzi = zzzVar;
        this.zzj = i11;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcgvVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = pf1Var;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zq0 zq0Var, int i11, zzcgv zzcgvVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4, j81 j81Var) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzoVar;
        this.zzd = zq0Var;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20952C0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i11;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcgvVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
        this.zzx = j81Var;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zq0 zq0Var, boolean z11, int i11, zzcgv zzcgvVar, pf1 pf1Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zq0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z11;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i11;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcgvVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = pf1Var;
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z11, String str2, IBinder iBinder5, int i11, int i12, String str3, zzcgv zzcgvVar, String str4, com.google.android.gms.ads.internal.zzj zzjVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder));
        this.zzc = (zzo) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder2));
        this.zzd = (zq0) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder3));
        this.zzp = (x20) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder6));
        this.zze = (z20) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder4));
        this.zzf = str;
        this.zzg = z11;
        this.zzh = str2;
        this.zzi = (zzz) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder5));
        this.zzj = i11;
        this.zzk = i12;
        this.zzl = str3;
        this.zzm = zzcgvVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (n22) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder7));
        this.zzs = (dt1) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder8));
        this.zzt = (rv2) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder9));
        this.zzu = (zzbr) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder10));
        this.zzw = str7;
        this.zzx = (j81) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder11));
        this.zzy = (pf1) BinderC4273d.m19914Q(InterfaceC4271b.a.m19911N(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzcgv zzcgvVar, zq0 zq0Var, pf1 pf1Var) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zq0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcgvVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = pf1Var;
    }

    public AdOverlayInfoParcel(zzo zzoVar, zq0 zq0Var, int i11, zzcgv zzcgvVar) {
        this.zzc = zzoVar;
        this.zzd = zq0Var;
        this.zzj = 1;
        this.zzm = zzcgvVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zq0 zq0Var, zzcgv zzcgvVar, zzbr zzbrVar, n22 n22Var, dt1 dt1Var, rv2 rv2Var, String str, String str2, int i11) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zq0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcgvVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = n22Var;
        this.zzs = dt1Var;
        this.zzt = rv2Var;
        this.zzu = zzbrVar;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }
}
