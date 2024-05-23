package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19249o;

/* loaded from: classes2.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new C19249o();

    /* renamed from: p */
    public final LatLng f33671p;

    /* renamed from: q */
    public final String f33672q;

    /* renamed from: r */
    public final String f33673r;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f33671p = latLng;
        this.f33672q = str;
        this.f33673r = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        LatLng latLng = this.f33671p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, latLng, i11, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33672q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33673r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
