package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p031b5.AbstractC2552a;
import p181g6.C19236b;

/* loaded from: classes2.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new C5911h();

    /* renamed from: A */
    private boolean f33626A;

    /* renamed from: p */
    private C19236b f33627p;

    /* renamed from: q */
    private LatLng f33628q;

    /* renamed from: r */
    private float f33629r;

    /* renamed from: s */
    private float f33630s;

    /* renamed from: t */
    private LatLngBounds f33631t;

    /* renamed from: u */
    private float f33632u;

    /* renamed from: v */
    private float f33633v;

    /* renamed from: w */
    private boolean f33634w;

    /* renamed from: x */
    private float f33635x;

    /* renamed from: y */
    private float f33636y;

    /* renamed from: z */
    private float f33637z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f11, float f12, LatLngBounds latLngBounds, float f13, float f14, boolean z11, float f15, float f16, float f17, boolean z12) {
        this.f33634w = true;
        this.f33635x = 0.0f;
        this.f33636y = 0.5f;
        this.f33637z = 0.5f;
        this.f33626A = false;
        this.f33627p = new C19236b(InterfaceC4271b.a.m19911N(iBinder));
        this.f33628q = latLng;
        this.f33629r = f11;
        this.f33630s = f12;
        this.f33631t = latLngBounds;
        this.f33632u = f13;
        this.f33633v = f14;
        this.f33634w = z11;
        this.f33635x = f15;
        this.f33636y = f16;
        this.f33637z = f17;
        this.f33626A = z12;
    }

    /* renamed from: D0 */
    public boolean m30700D0() {
        return this.f33626A;
    }

    /* renamed from: E0 */
    public boolean m30701E0() {
        return this.f33634w;
    }

    /* renamed from: F */
    public float m30702F() {
        return this.f33637z;
    }

    /* renamed from: J */
    public float m30703J() {
        return this.f33632u;
    }

    /* renamed from: K */
    public LatLngBounds m30704K() {
        return this.f33631t;
    }

    /* renamed from: M */
    public float m30705M() {
        return this.f33630s;
    }

    /* renamed from: Q */
    public LatLng m30706Q() {
        return this.f33628q;
    }

    /* renamed from: Z */
    public float m30707Z() {
        return this.f33635x;
    }

    /* renamed from: i0 */
    public float m30708i0() {
        return this.f33629r;
    }

    /* renamed from: o0 */
    public float m30709o0() {
        return this.f33633v;
    }

    /* renamed from: t */
    public float m30710t() {
        return this.f33636y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12923l(parcel, 2, this.f33627p.m100918a().asBinder(), false);
        AbstractC2552a.m12932u(parcel, 3, m30706Q(), i11, false);
        AbstractC2552a.m12921j(parcel, 4, m30708i0());
        AbstractC2552a.m12921j(parcel, 5, m30705M());
        AbstractC2552a.m12932u(parcel, 6, m30704K(), i11, false);
        AbstractC2552a.m12921j(parcel, 7, m30703J());
        AbstractC2552a.m12921j(parcel, 8, m30709o0());
        AbstractC2552a.m12914c(parcel, 9, m30701E0());
        AbstractC2552a.m12921j(parcel, 10, m30707Z());
        AbstractC2552a.m12921j(parcel, 11, m30710t());
        AbstractC2552a.m12921j(parcel, 12, m30702F());
        AbstractC2552a.m12914c(parcel, 13, m30700D0());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
