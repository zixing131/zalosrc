package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class v13 extends AbstractBinderC4833og implements w13 {
    public v13() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 2:
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC4871pg.m25456c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC4871pg.m25456c(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                break;
            case 8:
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
