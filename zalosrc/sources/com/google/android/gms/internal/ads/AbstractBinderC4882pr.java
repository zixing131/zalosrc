package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.pr */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4882pr extends AbstractBinderC4833og implements InterfaceC4919qr {
    public AbstractBinderC4882pr() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
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
                        zzb();
                    } else {
                        zze();
                    }
                } else {
                    zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                    AbstractC4871pg.m25456c(parcel);
                    zzd(zzeVar);
                }
            } else {
                zzc();
            }
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
