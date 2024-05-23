package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class nb0 extends AbstractC4759mg implements pb0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public nb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: C0 */
    public final void mo20060C0(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, cb0 cb0Var, ba0 ba0Var, zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, cb0Var);
        AbstractC4871pg.m25460g(zza, ba0Var);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: Q1 */
    public final void mo20061Q1(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, mb0 mb0Var, ba0 ba0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, mb0Var);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: R2 */
    public final void mo20062R2(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, ib0 ib0Var, ba0 ba0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, ib0Var);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: W0 */
    public final boolean mo20063W0(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        Parcel zzbk = zzbk(15, zza);
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: b0 */
    public final void mo20064b0(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, cb0 cb0Var, ba0 ba0Var, zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, cb0Var);
        AbstractC4871pg.m25460g(zza, ba0Var);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: c2 */
    public final void mo20065c2(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, mb0 mb0Var, ba0 ba0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, mb0Var);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: c4 */
    public final void mo20066c4(InterfaceC4271b interfaceC4271b, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, sb0 sb0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        AbstractC4871pg.m25458e(zza, bundle);
        AbstractC4871pg.m25458e(zza, bundle2);
        AbstractC4871pg.m25458e(zza, zzqVar);
        AbstractC4871pg.m25460g(zza, sb0Var);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: l */
    public final void mo20067l(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: n0 */
    public final void mo20068n0(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, fb0 fb0Var, ba0 ba0Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, fb0Var);
        AbstractC4871pg.m25460g(zza, ba0Var);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: r */
    public final boolean mo20069r(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        Parcel zzbk = zzbk(17, zza);
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: y1 */
    public final void mo20070y1(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, ib0 ib0Var, ba0 ba0Var, zzbls zzblsVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, ib0Var);
        AbstractC4871pg.m25460g(zza, ba0Var);
        AbstractC4871pg.m25458e(zza, zzblsVar);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        Parcel zzbk = zzbk(5, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final zzbxq zzf() {
        Parcel zzbk = zzbk(2, zza());
        zzbxq zzbxqVar = (zzbxq) AbstractC4871pg.m25454a(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final zzbxq zzg() {
        Parcel zzbk = zzbk(3, zza());
        zzbxq zzbxqVar = (zzbxq) AbstractC4871pg.m25454a(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }
}
