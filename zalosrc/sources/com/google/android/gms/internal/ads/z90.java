package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class z90 extends AbstractC4759mg implements ba0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: B0 */
    public final void mo20443B0(zzcce zzcceVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: D */
    public final void mo20444D(int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: K0 */
    public final void mo20445K0(e10 e10Var, String str) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, e10Var);
        zza.writeString(str);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: N3 */
    public final void mo20446N3(rg0 rg0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, rg0Var);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: a */
    public final void mo20447a() {
        zzbl(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: b */
    public final void mo20448b(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: g */
    public final void mo20449g() {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: g0 */
    public final void mo20450g0(int i11, String str) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeString(str);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: k */
    public final void mo20451k() {
        zzbl(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: o0 */
    public final void mo20452o0(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: q4 */
    public final void mo20453q4(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: x */
    public final void mo20454x(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    /* renamed from: z */
    public final void mo20455z(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zze() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zzf() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zzm() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zzn() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zzo() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zzp() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zzv() {
        zzbl(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void zzx() {
        zzbl(20, zza());
    }
}
