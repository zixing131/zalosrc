package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class u13 extends AbstractC4759mg implements w13 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u13(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.w13
    /* renamed from: B */
    public final void mo26821B(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.w13
    /* renamed from: C */
    public final void mo26822C(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.w13
    /* renamed from: L */
    public final void mo26823L(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.w13
    /* renamed from: b */
    public final void mo26824b(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.w13
    /* renamed from: s2 */
    public final void mo26825s2(InterfaceC4271b interfaceC4271b, String str, String str2) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        zza.writeString(null);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.w13
    public final void zzf() {
        zzbl(3, zza());
    }
}
