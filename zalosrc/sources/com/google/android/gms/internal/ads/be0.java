package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class be0 extends AbstractC4759mg implements de0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public be0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: c */
    public final void mo20484c(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: t0 */
    public final void mo20485t0(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbl(1, zza);
    }
}
