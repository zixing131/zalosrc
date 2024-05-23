package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19253s;

/* loaded from: classes2.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new C19253s();

    /* renamed from: p */
    public final float f33707p;

    /* renamed from: q */
    public final float f33708q;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    /* loaded from: classes2.dex */
    public static final class C5902a {

        /* renamed from: a */
        public float f33709a;

        /* renamed from: b */
        public float f33710b;

        /* renamed from: a */
        public C5902a m30758a(float f11) {
            this.f33709a = f11;
            return this;
        }

        /* renamed from: b */
        public StreetViewPanoramaOrientation m30759b() {
            return new StreetViewPanoramaOrientation(this.f33710b, this.f33709a);
        }

        /* renamed from: c */
        public C5902a m30760c(float f11) {
            this.f33710b = f11;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f11, float f12) {
        boolean z11 = false;
        if (f11 >= -90.0f && f11 <= 90.0f) {
            z11 = true;
        }
        AbstractC4205o.m19713b(z11, "Tilt needs to be between -90 and 90 inclusive: " + f11);
        this.f33707p = f11 + 0.0f;
        this.f33708q = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        if (Float.floatToIntBits(this.f33707p) == Float.floatToIntBits(streetViewPanoramaOrientation.f33707p) && Float.floatToIntBits(this.f33708q) == Float.floatToIntBits(streetViewPanoramaOrientation.f33708q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Float.valueOf(this.f33707p), Float.valueOf(this.f33708q));
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("tilt", Float.valueOf(this.f33707p)).m19704a("bearing", Float.valueOf(this.f33708q)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        float f11 = this.f33707p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12921j(parcel, 2, f11);
        AbstractC2552a.m12921j(parcel, 3, this.f33708q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
