package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class j50 extends AbstractC4759mg implements l50 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.l50
    /* renamed from: G3 */
    public final i50 mo23529G3(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11, f50 f50Var) {
        i50 g50Var;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        AbstractC4871pg.m25460g(zza, f50Var);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            g50Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof i50) {
                g50Var = (i50) queryLocalInterface;
            } else {
                g50Var = new g50(readStrongBinder);
            }
        }
        zzbk.recycle();
        return g50Var;
    }
}
