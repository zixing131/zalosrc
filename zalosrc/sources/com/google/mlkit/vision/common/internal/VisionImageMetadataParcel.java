package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import pa.C24707g;

/* loaded from: classes3.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new C24707g();

    /* renamed from: p */
    public final int f37184p;

    /* renamed from: q */
    public final int f37185q;

    /* renamed from: r */
    public final long f37186r;

    /* renamed from: s */
    public final int f37187s;

    /* renamed from: t */
    public final int f37188t;

    public VisionImageMetadataParcel(int i11, int i12, int i13, long j11, int i14) {
        this.f37184p = i11;
        this.f37185q = i12;
        this.f37188t = i13;
        this.f37186r = j11;
        this.f37187s = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f37184p);
        AbstractC2552a.m12924m(parcel, 2, this.f37185q);
        AbstractC2552a.m12924m(parcel, 3, this.f37188t);
        AbstractC2552a.m12929r(parcel, 4, this.f37186r);
        AbstractC2552a.m12924m(parcel, 5, this.f37187s);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
