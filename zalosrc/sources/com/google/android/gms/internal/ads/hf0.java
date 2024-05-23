package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;

/* loaded from: classes2.dex */
public final class hf0 extends AbstractC4759mg implements jf0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public hf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.jf0
    /* renamed from: O3 */
    public final void mo22817O3(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, parcelFileDescriptor);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.jf0
    /* renamed from: n2 */
    public final void mo22818n2(zzaz zzazVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzazVar);
        zzbl(2, zza);
    }
}
