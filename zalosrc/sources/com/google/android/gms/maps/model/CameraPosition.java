package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import p031b5.AbstractC2552a;
import p181g6.C19240f;

/* loaded from: classes2.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C19240f();

    /* renamed from: p */
    public final LatLng f33602p;

    /* renamed from: q */
    public final float f33603q;

    /* renamed from: r */
    public final float f33604r;

    /* renamed from: s */
    public final float f33605s;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    /* loaded from: classes2.dex */
    public static final class C5901a {

        /* renamed from: a */
        private LatLng f33606a;

        /* renamed from: b */
        private float f33607b;

        /* renamed from: c */
        private float f33608c;

        /* renamed from: d */
        private float f33609d;

        /* renamed from: a */
        public C5901a m30685a(float f11) {
            this.f33609d = f11;
            return this;
        }

        /* renamed from: b */
        public CameraPosition m30686b() {
            return new CameraPosition(this.f33606a, this.f33607b, this.f33608c, this.f33609d);
        }

        /* renamed from: c */
        public C5901a m30687c(LatLng latLng) {
            this.f33606a = (LatLng) AbstractC4205o.m19723l(latLng, "location must not be null.");
            return this;
        }

        /* renamed from: d */
        public C5901a m30688d(float f11) {
            this.f33608c = f11;
            return this;
        }

        /* renamed from: e */
        public C5901a m30689e(float f11) {
            this.f33607b = f11;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f11, float f12, float f13) {
        boolean z11;
        AbstractC4205o.m19723l(latLng, "camera target must not be null.");
        if (f12 >= 0.0f && f12 <= 90.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19714c(z11, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f12));
        this.f33602p = latLng;
        this.f33603q = f11;
        this.f33604r = f12 + 0.0f;
        this.f33605s = (((double) f13) <= 0.0d ? (f13 % 360.0f) + 360.0f : f13) % 360.0f;
    }

    /* renamed from: F */
    public static final CameraPosition m30683F(LatLng latLng, float f11) {
        return new CameraPosition(latLng, f11, 0.0f, 0.0f);
    }

    /* renamed from: t */
    public static C5901a m30684t() {
        return new C5901a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.f33602p.equals(cameraPosition.f33602p) && Float.floatToIntBits(this.f33603q) == Float.floatToIntBits(cameraPosition.f33603q) && Float.floatToIntBits(this.f33604r) == Float.floatToIntBits(cameraPosition.f33604r) && Float.floatToIntBits(this.f33605s) == Float.floatToIntBits(cameraPosition.f33605s)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f33602p, Float.valueOf(this.f33603q), Float.valueOf(this.f33604r), Float.valueOf(this.f33605s));
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a(ZinstantMetaConstant.TARGET_VIEWPORT, this.f33602p).m19704a("zoom", Float.valueOf(this.f33603q)).m19704a("tilt", Float.valueOf(this.f33604r)).m19704a("bearing", Float.valueOf(this.f33605s)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        LatLng latLng = this.f33602p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, latLng, i11, false);
        AbstractC2552a.m12921j(parcel, 3, this.f33603q);
        AbstractC2552a.m12921j(parcel, 4, this.f33604r);
        AbstractC2552a.m12921j(parcel, 5, this.f33605s);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
