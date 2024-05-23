package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19243i;

/* loaded from: classes2.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C19243i();

    /* renamed from: p */
    public final LatLng f33735p;

    /* renamed from: q */
    public final LatLng f33736q;

    /* renamed from: r */
    public final LatLng f33737r;

    /* renamed from: s */
    public final LatLng f33738s;

    /* renamed from: t */
    public final LatLngBounds f33739t;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f33735p = latLng;
        this.f33736q = latLng2;
        this.f33737r = latLng3;
        this.f33738s = latLng4;
        this.f33739t = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (this.f33735p.equals(visibleRegion.f33735p) && this.f33736q.equals(visibleRegion.f33736q) && this.f33737r.equals(visibleRegion.f33737r) && this.f33738s.equals(visibleRegion.f33738s) && this.f33739t.equals(visibleRegion.f33739t)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f33735p, this.f33736q, this.f33737r, this.f33738s, this.f33739t);
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("nearLeft", this.f33735p).m19704a("nearRight", this.f33736q).m19704a("farLeft", this.f33737r).m19704a("farRight", this.f33738s).m19704a("latLngBounds", this.f33739t).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        LatLng latLng = this.f33735p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, latLng, i11, false);
        AbstractC2552a.m12932u(parcel, 3, this.f33736q, i11, false);
        AbstractC2552a.m12932u(parcel, 4, this.f33737r, i11, false);
        AbstractC2552a.m12932u(parcel, 5, this.f33738s, i11, false);
        AbstractC2552a.m12932u(parcel, 6, this.f33739t, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
