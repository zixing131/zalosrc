package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p538u5.AbstractBinderC27035b;
import p538u5.AbstractC27036c;

/* renamed from: com.google.android.gms.common.internal.x1 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4234x1 extends AbstractBinderC27035b implements InterfaceC4237y1 {
    public AbstractBinderC4234x1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: N */
    public static InterfaceC4237y1 m19811N(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof InterfaceC4237y1) {
            return (InterfaceC4237y1) queryLocalInterface;
        }
        return new C4231w1(iBinder);
    }

    @Override // p538u5.AbstractBinderC27035b
    /* renamed from: E */
    protected final boolean mo19751E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        } else {
            InterfaceC4271b zzd = zzd();
            parcel2.writeNoException();
            AbstractC27036c.m139182e(parcel2, zzd);
        }
        return true;
    }
}
