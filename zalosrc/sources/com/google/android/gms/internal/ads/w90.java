package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.List;

/* loaded from: classes2.dex */
public final class w90 extends AbstractC4759mg implements y90 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: G0 */
    public final void mo26887G0(InterfaceC4271b interfaceC4271b, f60 f60Var, List list) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, f60Var);
        zza.writeTypedList(list);
        zzbl(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: I1 */
    public final void mo26888I1(InterfaceC4271b interfaceC4271b, zzq zzqVar, zzl zzlVar, String str, String str2, ba0 ba0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzqVar);
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: P2 */
    public final void mo26891P2(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: V0 */
    public final void mo26893V0(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, String str2, ba0 ba0Var, zzbls zzblsVar, List list) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25460g(zza, ba0Var);
        AbstractC4871pg.m25458e(zza, zzblsVar);
        zza.writeStringList(list);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: X3 */
    public final void mo26894X3(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: a2 */
    public final void mo26895a2(zzl zzlVar, String str) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(str);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: d */
    public final boolean mo26896d() {
        Parcel zzbk = zzbk(22, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: d4 */
    public final void mo26897d4(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: e */
    public final void mo26898e() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: h */
    public final void mo26899h() {
        zzbl(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: i3 */
    public final void mo26900i3(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, ng0 ng0Var, String str2) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(null);
        AbstractC4871pg.m25460g(zza, ng0Var);
        zza.writeString(str2);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: l0 */
    public final void mo26901l0(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, ba0 ba0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: m1 */
    public final void mo26902m1(InterfaceC4271b interfaceC4271b, zzq zzqVar, zzl zzlVar, String str, String str2, ba0 ba0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzqVar);
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: q0 */
    public final void mo26903q0(InterfaceC4271b interfaceC4271b, ng0 ng0Var, List list) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, ng0Var);
        zza.writeStringList(list);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: q1 */
    public final void mo26904q1(boolean z11) {
        Parcel zza = zza();
        AbstractC4871pg.m25457d(zza, z11);
        zzbl(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: s1 */
    public final void mo26905s1(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, ba0 ba0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: u */
    public final boolean mo26906u() {
        Parcel zzbk = zzbk(13, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: z0 */
    public final void mo26907z0(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, String str2, ba0 ba0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void zzD() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void zzE() {
        zzbl(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ga0 zzM() {
        ga0 ga0Var;
        Parcel zzbk = zzbk(15, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            ga0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof ga0) {
                ga0Var = (ga0) queryLocalInterface;
            } else {
                ga0Var = new ga0(readStrongBinder);
            }
        }
        zzbk.recycle();
        return ga0Var;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ha0 zzN() {
        ha0 ha0Var;
        Parcel zzbk = zzbk(16, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            ha0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof ha0) {
                ha0Var = (ha0) queryLocalInterface;
            } else {
                ha0Var = new ha0(readStrongBinder);
            }
        }
        zzbk.recycle();
        return ha0Var;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel zzbk = zzbk(26, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ea0 zzj() {
        ea0 ca0Var;
        Parcel zzbk = zzbk(36, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            ca0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof ea0) {
                ca0Var = (ea0) queryLocalInterface;
            } else {
                ca0Var = new ca0(readStrongBinder);
            }
        }
        zzbk.recycle();
        return ca0Var;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ka0 zzk() {
        ka0 ia0Var;
        Parcel zzbk = zzbk(27, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            ia0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof ka0) {
                ia0Var = (ka0) queryLocalInterface;
            } else {
                ia0Var = new ia0(readStrongBinder);
            }
        }
        zzbk.recycle();
        return ia0Var;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final zzbxq zzl() {
        Parcel zzbk = zzbk(33, zza());
        zzbxq zzbxqVar = (zzbxq) AbstractC4871pg.m25454a(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final zzbxq zzm() {
        Parcel zzbk = zzbk(34, zza());
        zzbxq zzbxqVar = (zzbxq) AbstractC4871pg.m25454a(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final InterfaceC4271b zzn() {
        Parcel zzbk = zzbk(2, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void zzo() {
        zzbl(5, zza());
    }
}
