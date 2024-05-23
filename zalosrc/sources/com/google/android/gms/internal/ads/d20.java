package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class d20 extends AbstractC4759mg implements f20 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.f20
    /* renamed from: j */
    public final void mo21249j(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void zze() {
        zzbl(2, zza());
    }
}
