package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19254t;

/* loaded from: classes2.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new C19254t();

    /* renamed from: q */
    public static final StreetViewSource f33711q = new StreetViewSource(0);

    /* renamed from: r */
    public static final StreetViewSource f33712r = new StreetViewSource(1);

    /* renamed from: p */
    private final int f33713p;

    public StreetViewSource(int i11) {
        this.f33713p = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.f33713p == ((StreetViewSource) obj).f33713p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33713p));
    }

    public String toString() {
        String str;
        int i11 = this.f33713p;
        if (i11 != 0) {
            if (i11 != 1) {
                str = String.format("UNKNOWN(%s)", Integer.valueOf(i11));
            } else {
                str = "OUTDOOR";
            }
        } else {
            str = "DEFAULT";
        }
        return String.format("StreetViewSource:%s", str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f33713p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, i12);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
