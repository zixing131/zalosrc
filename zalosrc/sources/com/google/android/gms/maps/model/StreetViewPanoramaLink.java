package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19251q;

/* loaded from: classes2.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new C19251q();

    /* renamed from: p */
    public final String f33702p;

    /* renamed from: q */
    public final float f33703q;

    public StreetViewPanoramaLink(String str, float f11) {
        this.f33702p = str;
        this.f33703q = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (this.f33702p.equals(streetViewPanoramaLink.f33702p) && Float.floatToIntBits(this.f33703q) == Float.floatToIntBits(streetViewPanoramaLink.f33703q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f33702p, Float.valueOf(this.f33703q));
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("panoId", this.f33702p).m19704a("bearing", Float.valueOf(this.f33703q)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str = this.f33702p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, str, false);
        AbstractC2552a.m12921j(parcel, 3, this.f33703q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
