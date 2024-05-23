package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class g20 extends AbstractC4759mg implements j20 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: T1 */
    public final boolean mo22106T1(Bundle bundle) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, bundle);
        Parcel zzbk = zzbk(16, zza);
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: W1 */
    public final void mo22107W1(zzde zzdeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzdeVar);
        zzbl(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: Y0 */
    public final void mo22108Y0(zzcu zzcuVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzcuVar);
        zzbl(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: a */
    public final List mo22109a() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList m25455b = AbstractC4871pg.m25455b(zzbk);
        zzbk.recycle();
        return m25455b;
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: e */
    public final boolean mo22110e() {
        Parcel zzbk = zzbk(30, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: e2 */
    public final void mo22111e2(zzcq zzcqVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzcqVar);
        zzbl(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: g */
    public final void mo22112g() {
        zzbl(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: i */
    public final boolean mo22113i() {
        Parcel zzbk = zzbk(24, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: v2 */
    public final void mo22114v2(Bundle bundle) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, bundle);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: x4 */
    public final void mo22115x4(f20 f20Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, f20Var);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.j20
    /* renamed from: z3 */
    public final void mo22116z3(Bundle bundle) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, bundle);
        zzbl(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final void zzA() {
        zzbl(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final void zzC() {
        zzbl(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final double zze() {
        Parcel zzbk = zzbk(8, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final Bundle zzf() {
        Parcel zzbk = zzbk(20, zza());
        Bundle bundle = (Bundle) AbstractC4871pg.m25454a(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final zzdh zzg() {
        Parcel zzbk = zzbk(31, zza());
        zzdh zzb = zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel zzbk = zzbk(11, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final b00 zzi() {
        b00 c5261zz;
        Parcel zzbk = zzbk(14, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            c5261zz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof b00) {
                c5261zz = (b00) queryLocalInterface;
            } else {
                c5261zz = new C5261zz(readStrongBinder);
            }
        }
        zzbk.recycle();
        return c5261zz;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final h00 zzj() {
        h00 e00Var;
        Parcel zzbk = zzbk(29, zza());
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

    @Override // com.google.android.gms.internal.ads.j20
    public final k00 zzk() {
        k00 i00Var;
        Parcel zzbk = zzbk(5, zza());
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

    @Override // com.google.android.gms.internal.ads.j20
    public final InterfaceC4271b zzl() {
        Parcel zzbk = zzbk(19, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final InterfaceC4271b zzm() {
        Parcel zzbk = zzbk(18, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final String zzn() {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final String zzo() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final String zzp() {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final String zzq() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final String zzr() {
        Parcel zzbk = zzbk(12, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final String zzs() {
        Parcel zzbk = zzbk(10, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final String zzt() {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final List zzv() {
        Parcel zzbk = zzbk(23, zza());
        ArrayList m25455b = AbstractC4871pg.m25455b(zzbk);
        zzbk.recycle();
        return m25455b;
    }

    @Override // com.google.android.gms.internal.ads.j20
    public final void zzx() {
        zzbl(13, zza());
    }
}
