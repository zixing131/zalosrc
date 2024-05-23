package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: p */
    private final List f33501p;

    /* renamed from: q */
    static final List f33500q = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new C5883d();

    public LocationResult(List list) {
        this.f33501p = list;
    }

    /* renamed from: F */
    public List m30612F() {
        return this.f33501p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f33501p.size() != this.f33501p.size()) {
            return false;
        }
        Iterator it = locationResult.f33501p.iterator();
        Iterator it2 = this.f33501p.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator it = this.f33501p.iterator();
        int i11 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i11 = (i11 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i11;
    }

    /* renamed from: t */
    public Location m30613t() {
        int size = this.f33501p.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f33501p.get(size - 1);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33501p);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("LocationResult[locations: ");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, m30612F(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
