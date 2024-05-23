package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class ca0 extends AbstractC4759mg implements ea0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ca0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.ea0
    public final InterfaceC4271b zze() {
        Parcel zzbk = zzbk(1, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.ea0
    public final boolean zzf() {
        Parcel zzbk = zzbk(2, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }
}
