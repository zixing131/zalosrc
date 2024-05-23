package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p538u5.AbstractBinderC27035b;
import p538u5.AbstractC27036c;

/* renamed from: com.google.android.gms.common.internal.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4218s0 extends AbstractBinderC27035b implements InterfaceC4190j {
    public AbstractBinderC4218s0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p538u5.AbstractBinderC27035b
    /* renamed from: E */
    protected final boolean mo19751E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                zzj zzjVar = (zzj) AbstractC27036c.m139178a(parcel, zzj.CREATOR);
                AbstractC27036c.m139179b(parcel);
                mo19645Y3(readInt, readStrongBinder, zzjVar);
            } else {
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC27036c.m139178a(parcel, Bundle.CREATOR);
                AbstractC27036c.m139179b(parcel);
                mo19644I(readInt2, bundle);
            }
        } else {
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) AbstractC27036c.m139178a(parcel, Bundle.CREATOR);
            AbstractC27036c.m139179b(parcel);
            mo19646j1(readInt3, readStrongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
