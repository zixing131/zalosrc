package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30486jh;

/* loaded from: classes2.dex */
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new C30486jh();

    /* renamed from: p */
    private final double f33107p;

    /* renamed from: q */
    private final double f33108q;

    public zzsg(double d11, double d12) {
        this.f33107p = d11;
        this.f33108q = d12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12919h(parcel, 1, this.f33107p);
        AbstractC2552a.m12919h(parcel, 2, this.f33108q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
