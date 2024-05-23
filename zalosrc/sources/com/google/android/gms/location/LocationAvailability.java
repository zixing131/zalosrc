package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C5881b();

    /* renamed from: p */
    int f33486p;

    /* renamed from: q */
    int f33487q;

    /* renamed from: r */
    long f33488r;

    /* renamed from: s */
    int f33489s;

    /* renamed from: t */
    zzbo[] f33490t;

    public LocationAvailability(int i11, int i12, int i13, long j11, zzbo[] zzboVarArr) {
        this.f33489s = i11;
        this.f33486p = i12;
        this.f33487q = i13;
        this.f33488r = j11;
        this.f33490t = zzboVarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f33486p == locationAvailability.f33486p && this.f33487q == locationAvailability.f33487q && this.f33488r == locationAvailability.f33488r && this.f33489s == locationAvailability.f33489s && Arrays.equals(this.f33490t, locationAvailability.f33490t)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33489s), Integer.valueOf(this.f33486p), Integer.valueOf(this.f33487q), Long.valueOf(this.f33488r), this.f33490t);
    }

    /* renamed from: t */
    public boolean m30602t() {
        return this.f33489s < 1000;
    }

    public String toString() {
        boolean m30602t = m30602t();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(m30602t);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33486p);
        AbstractC2552a.m12924m(parcel, 2, this.f33487q);
        AbstractC2552a.m12929r(parcel, 3, this.f33488r);
        AbstractC2552a.m12924m(parcel, 4, this.f33489s);
        AbstractC2552a.m12937z(parcel, 5, this.f33490t, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
