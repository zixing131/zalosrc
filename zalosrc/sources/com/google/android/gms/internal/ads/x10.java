package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class x10 extends AbstractC4759mg implements z10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.z10
    /* renamed from: s3 */
    public final void mo20861s3(j20 j20Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, j20Var);
        zzbl(1, zza);
    }
}
