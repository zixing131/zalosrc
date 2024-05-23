package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class hd0 extends AbstractC4759mg implements jd0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public hd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.jd0
    /* renamed from: y */
    public final gd0 mo22785y(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) {
        gd0 ed0Var;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            ed0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof gd0) {
                ed0Var = (gd0) queryLocalInterface;
            } else {
                ed0Var = new ed0(readStrongBinder);
            }
        }
        zzbk.recycle();
        return ed0Var;
    }
}
