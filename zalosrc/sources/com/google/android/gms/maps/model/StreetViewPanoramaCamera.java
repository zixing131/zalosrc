package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import p031b5.AbstractC2552a;
import p181g6.C19250p;

/* loaded from: classes2.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new C19250p();

    /* renamed from: p */
    public final float f33698p;

    /* renamed from: q */
    public final float f33699q;

    /* renamed from: r */
    public final float f33700r;

    /* renamed from: s */
    private final StreetViewPanoramaOrientation f33701s;

    public StreetViewPanoramaCamera(float f11, float f12, float f13) {
        float f14;
        boolean z11 = false;
        if (f12 >= -90.0f && f12 <= 90.0f) {
            z11 = true;
        }
        AbstractC4205o.m19713b(z11, "Tilt needs to be between -90 and 90 inclusive: " + f12);
        this.f33698p = ((double) f11) <= 0.0d ? 0.0f : f11;
        this.f33699q = 0.0f + f12;
        if (f13 <= 0.0d) {
            f14 = (f13 % 360.0f) + 360.0f;
        } else {
            f14 = f13;
        }
        this.f33700r = f14 % 360.0f;
        StreetViewPanoramaOrientation.C5902a c5902a = new StreetViewPanoramaOrientation.C5902a();
        c5902a.m30760c(f12);
        c5902a.m30758a(f13);
        this.f33701s = c5902a.m30759b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.f33698p) == Float.floatToIntBits(streetViewPanoramaCamera.f33698p) && Float.floatToIntBits(this.f33699q) == Float.floatToIntBits(streetViewPanoramaCamera.f33699q) && Float.floatToIntBits(this.f33700r) == Float.floatToIntBits(streetViewPanoramaCamera.f33700r)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Float.valueOf(this.f33698p), Float.valueOf(this.f33699q), Float.valueOf(this.f33700r));
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("zoom", Float.valueOf(this.f33698p)).m19704a("tilt", Float.valueOf(this.f33699q)).m19704a("bearing", Float.valueOf(this.f33700r)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        float f11 = this.f33698p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12921j(parcel, 2, f11);
        AbstractC2552a.m12921j(parcel, 3, this.f33699q);
        AbstractC2552a.m12921j(parcel, 4, this.f33700r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
