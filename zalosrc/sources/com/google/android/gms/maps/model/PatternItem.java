package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19247m;

/* loaded from: classes2.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new C19247m();

    /* renamed from: p */
    private final int f33662p;

    /* renamed from: q */
    private final Float f33663q;

    public PatternItem(int i11, Float f11) {
        boolean z11 = true;
        if (i11 != 1 && (f11 == null || f11.floatValue() < 0.0f)) {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "Invalid PatternItem: type=" + i11 + " length=" + f11);
        this.f33662p = i11;
        this.f33663q = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.f33662p == patternItem.f33662p && AbstractC4199m.m19701a(this.f33663q, patternItem.f33663q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33662p), this.f33663q);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f33662p + " length=" + this.f33663q + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f33662p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, i12);
        AbstractC2552a.m12922k(parcel, 3, this.f33663q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
