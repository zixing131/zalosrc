package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30695uh;

/* loaded from: classes2.dex */
public final class zztf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztf> CREATOR = new C30695uh();

    /* renamed from: p */
    private final int f33142p;

    /* renamed from: q */
    private final int f33143q;

    /* renamed from: r */
    private final int f33144r;

    /* renamed from: s */
    private final int f33145s;

    /* renamed from: t */
    private final long f33146t;

    public zztf(int i11, int i12, int i13, int i14, long j11) {
        this.f33142p = i11;
        this.f33143q = i12;
        this.f33144r = i13;
        this.f33145s = i14;
        this.f33146t = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33142p);
        AbstractC2552a.m12924m(parcel, 2, this.f33143q);
        AbstractC2552a.m12924m(parcel, 3, this.f33144r);
        AbstractC2552a.m12924m(parcel, 4, this.f33145s);
        AbstractC2552a.m12929r(parcel, 5, this.f33146t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
