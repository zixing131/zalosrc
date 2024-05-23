package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19241g;

/* loaded from: classes2.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new C19241g();

    /* renamed from: p */
    private final StrokeStyle f33724p;

    /* renamed from: q */
    private final double f33725q;

    public StyleSpan(StrokeStyle strokeStyle, double d11) {
        if (d11 > 0.0d) {
            this.f33724p = strokeStyle;
            this.f33725q = d11;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    /* renamed from: F */
    public StrokeStyle m30768F() {
        return this.f33724p;
    }

    /* renamed from: t */
    public double m30769t() {
        return this.f33725q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, m30768F(), i11, false);
        AbstractC2552a.m12919h(parcel, 3, m30769t());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
