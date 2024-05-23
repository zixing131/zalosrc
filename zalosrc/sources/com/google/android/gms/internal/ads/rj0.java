package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class rj0 extends AbstractC4759mg implements tj0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public rj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.tj0
    /* renamed from: y */
    public final qj0 mo26083y(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) {
        qj0 oj0Var;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            oj0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof qj0) {
                oj0Var = (qj0) queryLocalInterface;
            } else {
                oj0Var = new oj0(readStrongBinder);
            }
        }
        zzbk.recycle();
        return oj0Var;
    }
}
