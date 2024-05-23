package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p031b5.AbstractC2552a;
import p123e6.AbstractC18259i;
import p151f6.AbstractC18757h;

/* loaded from: classes2.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C5893a();

    /* renamed from: I */
    private static final Integer f33553I = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* renamed from: A */
    private Boolean f33554A;

    /* renamed from: B */
    private Boolean f33555B;

    /* renamed from: C */
    private Float f33556C;

    /* renamed from: D */
    private Float f33557D;

    /* renamed from: E */
    private LatLngBounds f33558E;

    /* renamed from: F */
    private Boolean f33559F;

    /* renamed from: G */
    private Integer f33560G;

    /* renamed from: H */
    private String f33561H;

    /* renamed from: p */
    private Boolean f33562p;

    /* renamed from: q */
    private Boolean f33563q;

    /* renamed from: r */
    private int f33564r;

    /* renamed from: s */
    private CameraPosition f33565s;

    /* renamed from: t */
    private Boolean f33566t;

    /* renamed from: u */
    private Boolean f33567u;

    /* renamed from: v */
    private Boolean f33568v;

    /* renamed from: w */
    private Boolean f33569w;

    /* renamed from: x */
    private Boolean f33570x;

    /* renamed from: y */
    private Boolean f33571y;

    /* renamed from: z */
    private Boolean f33572z;

    public GoogleMapOptions() {
        this.f33564r = -1;
        this.f33556C = null;
        this.f33557D = null;
        this.f33558E = null;
        this.f33560G = null;
        this.f33561H = null;
    }

    /* renamed from: M */
    public static GoogleMapOptions m30630M(Context context, AttributeSet attributeSet) {
        String string;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC18259i.MapAttrs);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_mapType)) {
                googleMapOptions.m30643K0(obtainAttributes.getInt(AbstractC18259i.MapAttrs_mapType, -1));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_zOrderOnTop)) {
                googleMapOptions.m30652S0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_zOrderOnTop, false));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_useViewLifecycle)) {
                googleMapOptions.m30651R0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_useViewLifecycle, false));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiCompass)) {
                googleMapOptions.m30642K(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiCompass, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiRotateGestures)) {
                googleMapOptions.m30646N0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiRotateGestures, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
                googleMapOptions.m30648P0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiScrollGestures)) {
                googleMapOptions.m30647O0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiScrollGestures, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiTiltGestures)) {
                googleMapOptions.m30650Q0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiTiltGestures, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiZoomGestures)) {
                googleMapOptions.m30654U0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiZoomGestures, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiZoomControls)) {
                googleMapOptions.m30653T0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiZoomControls, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_liteMode)) {
                googleMapOptions.m30638H0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_liteMode, false));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_uiMapToolbar)) {
                googleMapOptions.m30641J0(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_uiMapToolbar, true));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_ambientEnabled)) {
                googleMapOptions.m30658t(obtainAttributes.getBoolean(AbstractC18259i.MapAttrs_ambientEnabled, false));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_cameraMinZoomPreference)) {
                googleMapOptions.m30645M0(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_cameraMinZoomPreference)) {
                googleMapOptions.m30644L0(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_backgroundColor)) {
                googleMapOptions.m30635F(Integer.valueOf(obtainAttributes.getColor(AbstractC18259i.MapAttrs_backgroundColor, f33553I.intValue())));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_mapId) && (string = obtainAttributes.getString(AbstractC18259i.MapAttrs_mapId)) != null && !string.isEmpty()) {
                googleMapOptions.m30639I0(string);
            }
            googleMapOptions.m30637G0(m30632W0(context, attributeSet));
            googleMapOptions.m30640J(m30631V0(context, attributeSet));
            obtainAttributes.recycle();
            return googleMapOptions;
        }
        return null;
    }

    /* renamed from: V0 */
    public static CameraPosition m30631V0(Context context, AttributeSet attributeSet) {
        float f11;
        float f12;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC18259i.MapAttrs);
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_cameraTargetLat)) {
                f11 = obtainAttributes.getFloat(AbstractC18259i.MapAttrs_cameraTargetLat, 0.0f);
            } else {
                f11 = 0.0f;
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_cameraTargetLng)) {
                f12 = obtainAttributes.getFloat(AbstractC18259i.MapAttrs_cameraTargetLng, 0.0f);
            } else {
                f12 = 0.0f;
            }
            LatLng latLng = new LatLng(f11, f12);
            CameraPosition.C5901a m30684t = CameraPosition.m30684t();
            m30684t.m30687c(latLng);
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_cameraZoom)) {
                m30684t.m30689e(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_cameraZoom, 0.0f));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_cameraBearing)) {
                m30684t.m30685a(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_cameraBearing, 0.0f));
            }
            if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_cameraTilt)) {
                m30684t.m30688d(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_cameraTilt, 0.0f));
            }
            obtainAttributes.recycle();
            return m30684t.m30686b();
        }
        return null;
    }

    /* renamed from: W0 */
    public static LatLngBounds m30632W0(Context context, AttributeSet attributeSet) {
        Float f11;
        Float f12;
        Float f13;
        Float f14;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC18259i.MapAttrs);
        if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_latLngBoundsSouthWestLatitude)) {
            f11 = Float.valueOf(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f));
        } else {
            f11 = null;
        }
        if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_latLngBoundsSouthWestLongitude)) {
            f12 = Float.valueOf(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f));
        } else {
            f12 = null;
        }
        if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_latLngBoundsNorthEastLatitude)) {
            f13 = Float.valueOf(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f));
        } else {
            f13 = null;
        }
        if (obtainAttributes.hasValue(AbstractC18259i.MapAttrs_latLngBoundsNorthEastLongitude)) {
            f14 = Float.valueOf(obtainAttributes.getFloat(AbstractC18259i.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f));
        } else {
            f14 = null;
        }
        obtainAttributes.recycle();
        if (f11 == null || f12 == null || f13 == null || f14 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(f11.floatValue(), f12.floatValue()), new LatLng(f13.floatValue(), f14.floatValue()));
    }

    /* renamed from: D0 */
    public int m30633D0() {
        return this.f33564r;
    }

    /* renamed from: E0 */
    public Float m30634E0() {
        return this.f33557D;
    }

    /* renamed from: F */
    public GoogleMapOptions m30635F(Integer num) {
        this.f33560G = num;
        return this;
    }

    /* renamed from: F0 */
    public Float m30636F0() {
        return this.f33556C;
    }

    /* renamed from: G0 */
    public GoogleMapOptions m30637G0(LatLngBounds latLngBounds) {
        this.f33558E = latLngBounds;
        return this;
    }

    /* renamed from: H0 */
    public GoogleMapOptions m30638H0(boolean z11) {
        this.f33572z = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: I0 */
    public GoogleMapOptions m30639I0(String str) {
        this.f33561H = str;
        return this;
    }

    /* renamed from: J */
    public GoogleMapOptions m30640J(CameraPosition cameraPosition) {
        this.f33565s = cameraPosition;
        return this;
    }

    /* renamed from: J0 */
    public GoogleMapOptions m30641J0(boolean z11) {
        this.f33554A = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: K */
    public GoogleMapOptions m30642K(boolean z11) {
        this.f33567u = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: K0 */
    public GoogleMapOptions m30643K0(int i11) {
        this.f33564r = i11;
        return this;
    }

    /* renamed from: L0 */
    public GoogleMapOptions m30644L0(float f11) {
        this.f33557D = Float.valueOf(f11);
        return this;
    }

    /* renamed from: M0 */
    public GoogleMapOptions m30645M0(float f11) {
        this.f33556C = Float.valueOf(f11);
        return this;
    }

    /* renamed from: N0 */
    public GoogleMapOptions m30646N0(boolean z11) {
        this.f33571y = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: O0 */
    public GoogleMapOptions m30647O0(boolean z11) {
        this.f33568v = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: P0 */
    public GoogleMapOptions m30648P0(boolean z11) {
        this.f33559F = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: Q */
    public Integer m30649Q() {
        return this.f33560G;
    }

    /* renamed from: Q0 */
    public GoogleMapOptions m30650Q0(boolean z11) {
        this.f33570x = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: R0 */
    public GoogleMapOptions m30651R0(boolean z11) {
        this.f33563q = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: S0 */
    public GoogleMapOptions m30652S0(boolean z11) {
        this.f33562p = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: T0 */
    public GoogleMapOptions m30653T0(boolean z11) {
        this.f33566t = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: U0 */
    public GoogleMapOptions m30654U0(boolean z11) {
        this.f33569w = Boolean.valueOf(z11);
        return this;
    }

    /* renamed from: Z */
    public CameraPosition m30655Z() {
        return this.f33565s;
    }

    /* renamed from: i0 */
    public LatLngBounds m30656i0() {
        return this.f33558E;
    }

    /* renamed from: o0 */
    public String m30657o0() {
        return this.f33561H;
    }

    /* renamed from: t */
    public GoogleMapOptions m30658t(boolean z11) {
        this.f33555B = Boolean.valueOf(z11);
        return this;
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("MapType", Integer.valueOf(this.f33564r)).m19704a("LiteMode", this.f33572z).m19704a("Camera", this.f33565s).m19704a("CompassEnabled", this.f33567u).m19704a("ZoomControlsEnabled", this.f33566t).m19704a("ScrollGesturesEnabled", this.f33568v).m19704a("ZoomGesturesEnabled", this.f33569w).m19704a("TiltGesturesEnabled", this.f33570x).m19704a("RotateGesturesEnabled", this.f33571y).m19704a("ScrollGesturesEnabledDuringRotateOrZoom", this.f33559F).m19704a("MapToolbarEnabled", this.f33554A).m19704a("AmbientEnabled", this.f33555B).m19704a("MinZoomPreference", this.f33556C).m19704a("MaxZoomPreference", this.f33557D).m19704a("BackgroundColor", this.f33560G).m19704a("LatLngBoundsForCameraTarget", this.f33558E).m19704a("ZOrderOnTop", this.f33562p).m19704a("UseViewLifecycleInFragment", this.f33563q).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12917f(parcel, 2, AbstractC18757h.m98770a(this.f33562p));
        AbstractC2552a.m12917f(parcel, 3, AbstractC18757h.m98770a(this.f33563q));
        AbstractC2552a.m12924m(parcel, 4, m30633D0());
        AbstractC2552a.m12932u(parcel, 5, m30655Z(), i11, false);
        AbstractC2552a.m12917f(parcel, 6, AbstractC18757h.m98770a(this.f33566t));
        AbstractC2552a.m12917f(parcel, 7, AbstractC18757h.m98770a(this.f33567u));
        AbstractC2552a.m12917f(parcel, 8, AbstractC18757h.m98770a(this.f33568v));
        AbstractC2552a.m12917f(parcel, 9, AbstractC18757h.m98770a(this.f33569w));
        AbstractC2552a.m12917f(parcel, 10, AbstractC18757h.m98770a(this.f33570x));
        AbstractC2552a.m12917f(parcel, 11, AbstractC18757h.m98770a(this.f33571y));
        AbstractC2552a.m12917f(parcel, 12, AbstractC18757h.m98770a(this.f33572z));
        AbstractC2552a.m12917f(parcel, 14, AbstractC18757h.m98770a(this.f33554A));
        AbstractC2552a.m12917f(parcel, 15, AbstractC18757h.m98770a(this.f33555B));
        AbstractC2552a.m12922k(parcel, 16, m30636F0(), false);
        AbstractC2552a.m12922k(parcel, 17, m30634E0(), false);
        AbstractC2552a.m12932u(parcel, 18, m30656i0(), i11, false);
        AbstractC2552a.m12917f(parcel, 19, AbstractC18757h.m98770a(this.f33559F));
        AbstractC2552a.m12927p(parcel, 20, m30649Q(), false);
        AbstractC2552a.m12934w(parcel, 21, m30657o0(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapOptions(byte b11, byte b12, int i11, CameraPosition cameraPosition, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b21, byte b22, Float f11, Float f12, LatLngBounds latLngBounds, byte b23, Integer num, String str) {
        this.f33564r = -1;
        this.f33556C = null;
        this.f33557D = null;
        this.f33558E = null;
        this.f33560G = null;
        this.f33561H = null;
        this.f33562p = AbstractC18757h.m98771b(b11);
        this.f33563q = AbstractC18757h.m98771b(b12);
        this.f33564r = i11;
        this.f33565s = cameraPosition;
        this.f33566t = AbstractC18757h.m98771b(b13);
        this.f33567u = AbstractC18757h.m98771b(b14);
        this.f33568v = AbstractC18757h.m98771b(b15);
        this.f33569w = AbstractC18757h.m98771b(b16);
        this.f33570x = AbstractC18757h.m98771b(b17);
        this.f33571y = AbstractC18757h.m98771b(b18);
        this.f33572z = AbstractC18757h.m98771b(b19);
        this.f33554A = AbstractC18757h.m98771b(b21);
        this.f33555B = AbstractC18757h.m98771b(b22);
        this.f33556C = f11;
        this.f33557D = f12;
        this.f33558E = latLngBounds;
        this.f33559F = AbstractC18757h.m98771b(b23);
        this.f33560G = num;
        this.f33561H = str;
    }
}
