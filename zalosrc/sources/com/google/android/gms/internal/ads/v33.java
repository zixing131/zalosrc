package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class v33 extends AbstractC4759mg implements x33 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v33(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.x33
    /* renamed from: E0 */
    public final void mo27150E0(Bundle bundle, z33 z33Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, bundle);
        AbstractC4871pg.m25460g(zza, z33Var);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.x33
    /* renamed from: F3 */
    public final void mo27151F3(String str, Bundle bundle, z33 z33Var) {
        Parcel zza = zza();
        zza.writeString(str);
        AbstractC4871pg.m25458e(zza, bundle);
        AbstractC4871pg.m25460g(zza, z33Var);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.x33
    /* renamed from: N4 */
    public final void mo27152N4(Bundle bundle, z33 z33Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, bundle);
        AbstractC4871pg.m25460g(zza, z33Var);
        zzbm(3, zza);
    }
}
