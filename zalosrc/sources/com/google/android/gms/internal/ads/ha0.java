package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ha0 extends AbstractC4759mg implements IInterface {
    public ha0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: E */
    public final com.google.android.gms.ads.internal.client.zzdk m22756E() {
        Parcel zzbk = zzbk(16, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    /* renamed from: I3 */
    public final InterfaceC4271b m22757I3() {
        Parcel zzbk = zzbk(20, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    /* renamed from: N */
    public final b00 m22758N() {
        Parcel zzbk = zzbk(19, zza());
        b00 m19941N = a00.m19941N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19941N;
    }

    /* renamed from: Q */
    public final k00 m22759Q() {
        Parcel zzbk = zzbk(5, zza());
        k00 m23497N = j00.m23497N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m23497N;
    }

    /* renamed from: W4 */
    public final InterfaceC4271b m22760W4() {
        Parcel zzbk = zzbk(21, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    /* renamed from: X4 */
    public final List m22761X4() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList m25455b = AbstractC4871pg.m25455b(zzbk);
        zzbk.recycle();
        return m25455b;
    }

    /* renamed from: Y4 */
    public final void m22762Y4(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(9, zza);
    }

    /* renamed from: Z4 */
    public final void m22763Z4(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(10, zza);
    }

    /* renamed from: a5 */
    public final void m22764a5(InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, interfaceC4271b2);
        AbstractC4871pg.m25460g(zza, interfaceC4271b3);
        zzbl(22, zza);
    }

    /* renamed from: b5 */
    public final void m22765b5(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(14, zza);
    }

    /* renamed from: c5 */
    public final boolean m22766c5() {
        Parcel zzbk = zzbk(12, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    /* renamed from: d5 */
    public final boolean m22767d5() {
        Parcel zzbk = zzbk(11, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    public final Bundle zze() {
        Parcel zzbk = zzbk(13, zza());
        Bundle bundle = (Bundle) AbstractC4871pg.m25454a(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    public final InterfaceC4271b zzi() {
        Parcel zzbk = zzbk(15, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    public final String zzl() {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzm() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final void zzr() {
        zzbl(8, zza());
    }
}
