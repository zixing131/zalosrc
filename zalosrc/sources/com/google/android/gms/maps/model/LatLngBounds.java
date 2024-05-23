package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19244j;

/* loaded from: classes2.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C19244j();

    /* renamed from: p */
    public final LatLng f33640p;

    /* renamed from: q */
    public final LatLng f33641q;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        AbstractC4205o.m19723l(latLng, "southwest must not be null.");
        AbstractC4205o.m19723l(latLng2, "northeast must not be null.");
        double d11 = latLng2.f33638p;
        double d12 = latLng.f33638p;
        AbstractC4205o.m19714c(d11 >= d12, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d12), Double.valueOf(latLng2.f33638p));
        this.f33640p = latLng;
        this.f33641q = latLng2;
    }

    /* renamed from: J */
    private final boolean m30711J(double d11) {
        LatLng latLng = this.f33641q;
        double d12 = this.f33640p.f33639q;
        double d13 = latLng.f33639q;
        if (d12 <= d13) {
            if (d12 > d11 || d11 > d13) {
                return false;
            }
            return true;
        }
        if (d12 > d11 && d11 > d13) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public LatLng m30712F() {
        LatLng latLng = this.f33641q;
        LatLng latLng2 = this.f33640p;
        double d11 = latLng2.f33638p + latLng.f33638p;
        double d12 = latLng.f33639q;
        double d13 = latLng2.f33639q;
        if (d13 > d12) {
            d12 += 360.0d;
        }
        return new LatLng(d11 / 2.0d, (d12 + d13) / 2.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.f33640p.equals(latLngBounds.f33640p) && this.f33641q.equals(latLngBounds.f33641q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f33640p, this.f33641q);
    }

    /* renamed from: t */
    public boolean m30713t(LatLng latLng) {
        LatLng latLng2 = (LatLng) AbstractC4205o.m19723l(latLng, "point must not be null.");
        double d11 = latLng2.f33638p;
        if (this.f33640p.f33638p <= d11 && d11 <= this.f33641q.f33638p && m30711J(latLng2.f33639q)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("southwest", this.f33640p).m19704a("northeast", this.f33641q).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        LatLng latLng = this.f33640p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, latLng, i11, false);
        AbstractC2552a.m12932u(parcel, 3, this.f33641q, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
