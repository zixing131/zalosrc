package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ia0 extends AbstractC4759mg implements ka0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ia0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: E2 */
    public final void mo23147E2(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: K */
    public final void mo23148K(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: a */
    public final String mo23149a() {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    /* renamed from: s4 */
    public final void mo23150s4(InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, interfaceC4271b2);
        AbstractC4871pg.m25460g(zza, interfaceC4271b3);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final boolean zzA() {
        Parcel zzbk = zzbk(18, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final boolean zzB() {
        Parcel zzbk = zzbk(17, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final double zze() {
        Parcel zzbk = zzbk(8, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final float zzf() {
        Parcel zzbk = zzbk(23, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final float zzg() {
        Parcel zzbk = zzbk(25, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final float zzh() {
        Parcel zzbk = zzbk(24, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final Bundle zzi() {
        Parcel zzbk = zzbk(16, zza());
        Bundle bundle = (Bundle) AbstractC4871pg.m25454a(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final com.google.android.gms.ads.internal.client.zzdk zzj() {
        Parcel zzbk = zzbk(11, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final b00 zzk() {
        Parcel zzbk = zzbk(12, zza());
        b00 m19941N = a00.m19941N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19941N;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final k00 zzl() {
        Parcel zzbk = zzbk(5, zza());
        k00 m23497N = j00.m23497N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m23497N;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final InterfaceC4271b zzm() {
        Parcel zzbk = zzbk(13, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final InterfaceC4271b zzn() {
        Parcel zzbk = zzbk(14, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final InterfaceC4271b zzo() {
        Parcel zzbk = zzbk(15, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzp() {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzq() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzr() {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzs() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final String zzt() {
        Parcel zzbk = zzbk(10, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final List zzv() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList m25455b = AbstractC4871pg.m25455b(zzbk);
        zzbk.recycle();
        return m25455b;
    }

    @Override // com.google.android.gms.internal.ads.ka0
    public final void zzx() {
        zzbl(19, zza());
    }
}
