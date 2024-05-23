package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzeh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeh> CREATOR = new zzei();
    private final int zza;
    private final int zzb;
    private final String zzc;

    public zzeh() {
        this(ModuleDescriptor.MODULE_VERSION, 223104000, "21.3.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.zza);
        AbstractC2552a.m12924m(parcel, 2, this.zzb);
        AbstractC2552a.m12934w(parcel, 3, this.zzc, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public final int zza() {
        return this.zzb;
    }

    public zzeh(int i11, int i12, String str) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = str;
    }
}
