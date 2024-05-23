package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19252r;

/* loaded from: classes2.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new C19252r();

    /* renamed from: p */
    public final StreetViewPanoramaLink[] f33704p;

    /* renamed from: q */
    public final LatLng f33705q;

    /* renamed from: r */
    public final String f33706r;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f33704p = streetViewPanoramaLinkArr;
        this.f33705q = latLng;
        this.f33706r = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        if (this.f33706r.equals(streetViewPanoramaLocation.f33706r) && this.f33705q.equals(streetViewPanoramaLocation.f33705q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f33705q, this.f33706r);
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("panoId", this.f33706r).m19704a("position", this.f33705q.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = this.f33704p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12937z(parcel, 2, streetViewPanoramaLinkArr, i11, false);
        AbstractC2552a.m12932u(parcel, 3, this.f33705q, i11, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33706r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
