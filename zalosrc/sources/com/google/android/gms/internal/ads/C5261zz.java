package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zz */
/* loaded from: classes2.dex */
public final class C5261zz extends AbstractC4759mg implements b00 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5261zz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.b00
    public final String zzg() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.b00
    public final List zzh() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList m25455b = AbstractC4871pg.m25455b(zzbk);
        zzbk.recycle();
        return m25455b;
    }
}
