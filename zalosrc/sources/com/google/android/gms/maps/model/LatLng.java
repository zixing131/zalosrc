package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19245k;

/* loaded from: classes2.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C19245k();

    /* renamed from: p */
    public final double f33638p;

    /* renamed from: q */
    public final double f33639q;

    public LatLng(double d11, double d12) {
        if (d12 >= -180.0d && d12 < 180.0d) {
            this.f33639q = d12;
        } else {
            this.f33639q = ((((d12 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f33638p = Math.max(-90.0d, Math.min(90.0d, d11));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.f33638p) == Double.doubleToLongBits(latLng.f33638p) && Double.doubleToLongBits(this.f33639q) == Double.doubleToLongBits(latLng.f33639q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f33638p);
        long j11 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f33639q);
        return ((((int) j11) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f33638p + "," + this.f33639q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        double d11 = this.f33638p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12919h(parcel, 2, d11);
        AbstractC2552a.m12919h(parcel, 3, this.f33639q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
