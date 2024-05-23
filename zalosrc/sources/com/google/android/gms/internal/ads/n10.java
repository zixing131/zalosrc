package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class n10 extends AbstractC4759mg implements p10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.p10
    /* renamed from: R4 */
    public final void mo24791R4(e10 e10Var, String str) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, e10Var);
        zza.writeString(str);
        zzbl(1, zza);
    }
}
