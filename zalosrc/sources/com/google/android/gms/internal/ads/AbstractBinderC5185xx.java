package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: com.google.android.gms.internal.ads.xx */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5185xx extends AbstractBinderC4833og implements InterfaceC5222yx {
    public AbstractBinderC5185xx() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return false;
                        }
                        zzf();
                        parcel2.writeNoException();
                    } else {
                        zze();
                        parcel2.writeNoException();
                    }
                } else {
                    InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                    AbstractC4871pg.m25456c(parcel);
                    zzd(m19911N);
                    parcel2.writeNoException();
                }
            } else {
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
            }
        } else {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        }
        return true;
    }
}
