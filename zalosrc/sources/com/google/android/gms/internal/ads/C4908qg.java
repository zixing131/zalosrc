package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: com.google.android.gms.internal.ads.qg */
/* loaded from: classes2.dex */
public final class C4908qg extends AbstractC4759mg implements InterfaceC4982sg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4908qg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4982sg
    /* renamed from: B */
    public final void mo25701B(int i11) {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4982sg
    /* renamed from: C */
    public final void mo25702C(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4982sg
    /* renamed from: L */
    public final void mo25703L(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4982sg
    /* renamed from: O1 */
    public final void mo25704O1(InterfaceC4271b interfaceC4271b, String str) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString("GMA_SDK");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4982sg
    /* renamed from: b */
    public final void mo25705b(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4982sg
    public final void zzf() {
        zzbl(3, zza());
    }
}
