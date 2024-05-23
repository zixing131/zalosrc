package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class g50 extends AbstractC4759mg implements i50 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.i50
    /* renamed from: j */
    public final void mo22283j(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.i50
    public final void zze() {
        zzbl(2, zza());
    }
}
