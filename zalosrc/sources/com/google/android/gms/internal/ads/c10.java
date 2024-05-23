package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c10 extends AbstractC4759mg implements e10 {
    public c10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: B4 */
    public final String mo20780B4(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(1, zza);
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: Z */
    public final k00 mo20781Z(String str) {
        k00 i00Var;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            i00Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof k00) {
                i00Var = (k00) queryLocalInterface;
            } else {
                i00Var = new i00(readStrongBinder);
            }
        }
        zzbk.recycle();
        return i00Var;
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: e1 */
    public final void mo20782e1(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.e10
    /* renamed from: r */
    public final boolean mo20783r(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        Parcel zzbk = zzbk(10, zza);
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        Parcel zzbk = zzbk(7, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final h00 zzf() {
        h00 e00Var;
        Parcel zzbk = zzbk(16, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            e00Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof h00) {
                e00Var = (h00) queryLocalInterface;
            } else {
                e00Var = new e00(readStrongBinder);
            }
        }
        zzbk.recycle();
        return e00Var;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final InterfaceC4271b zzh() {
        Parcel zzbk = zzbk(9, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final String zzi() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final List zzk() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList<String> createStringArrayList = zzbk.createStringArrayList();
        zzbk.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzl() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzm() {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzn(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzo() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final boolean zzq() {
        Parcel zzbk = zzbk(12, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final boolean zzs() {
        Parcel zzbk = zzbk(13, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }
}
