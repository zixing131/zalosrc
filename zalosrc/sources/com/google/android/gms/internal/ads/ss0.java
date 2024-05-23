package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class ss0 extends AbstractC4759mg implements us0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.us0
    /* renamed from: o4 */
    public final void mo26396o4(InterfaceC4271b interfaceC4271b, rs0 rs0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, rs0Var);
        zzbl(2, zza);
    }
}
