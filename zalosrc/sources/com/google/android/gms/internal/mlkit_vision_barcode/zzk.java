package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30771yh;

/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C30771yh();

    /* renamed from: p */
    public double f33030p;

    /* renamed from: q */
    public double f33031q;

    public zzk(double d11, double d12) {
        this.f33030p = d11;
        this.f33031q = d12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12919h(parcel, 2, this.f33030p);
        AbstractC2552a.m12919h(parcel, 3, this.f33031q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
