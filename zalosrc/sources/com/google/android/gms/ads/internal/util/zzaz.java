package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.cs2;
import com.google.android.gms.internal.ads.z53;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    public final String zza;
    public final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(String str, int i11) {
        this.zza = str == null ? "" : str;
        this.zzb = i11;
    }

    public static zzaz zza(Throwable th2) {
        String message;
        com.google.android.gms.ads.internal.client.zze m20996a = cs2.m20996a(th2);
        if (z53.m28438d(th2.getMessage())) {
            message = m20996a.zzb;
        } else {
            message = th2.getMessage();
        }
        return new zzaz(message, m20996a.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.zza, false);
        AbstractC2552a.m12924m(parcel, 2, this.zzb);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
