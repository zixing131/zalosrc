package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new C5908e();

    /* renamed from: p */
    private LatLng f33613p;

    /* renamed from: q */
    private double f33614q;

    /* renamed from: r */
    private float f33615r;

    /* renamed from: s */
    private int f33616s;

    /* renamed from: t */
    private int f33617t;

    /* renamed from: u */
    private float f33618u;

    /* renamed from: v */
    private boolean f33619v;

    /* renamed from: w */
    private boolean f33620w;

    /* renamed from: x */
    private List f33621x;

    public CircleOptions(LatLng latLng, double d11, float f11, int i11, int i12, float f12, boolean z11, boolean z12, List list) {
        this.f33613p = latLng;
        this.f33614q = d11;
        this.f33615r = f11;
        this.f33616s = i11;
        this.f33617t = i12;
        this.f33618u = f12;
        this.f33619v = z11;
        this.f33620w = z12;
        this.f33621x = list;
    }

    /* renamed from: F */
    public int m30691F() {
        return this.f33617t;
    }

    /* renamed from: J */
    public double m30692J() {
        return this.f33614q;
    }

    /* renamed from: K */
    public int m30693K() {
        return this.f33616s;
    }

    /* renamed from: M */
    public List m30694M() {
        return this.f33621x;
    }

    /* renamed from: Q */
    public float m30695Q() {
        return this.f33615r;
    }

    /* renamed from: Z */
    public float m30696Z() {
        return this.f33618u;
    }

    /* renamed from: i0 */
    public boolean m30697i0() {
        return this.f33620w;
    }

    /* renamed from: o0 */
    public boolean m30698o0() {
        return this.f33619v;
    }

    /* renamed from: t */
    public LatLng m30699t() {
        return this.f33613p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, m30699t(), i11, false);
        AbstractC2552a.m12919h(parcel, 3, m30692J());
        AbstractC2552a.m12921j(parcel, 4, m30695Q());
        AbstractC2552a.m12924m(parcel, 5, m30693K());
        AbstractC2552a.m12924m(parcel, 6, m30691F());
        AbstractC2552a.m12921j(parcel, 7, m30696Z());
        AbstractC2552a.m12914c(parcel, 8, m30698o0());
        AbstractC2552a.m12914c(parcel, 9, m30697i0());
        AbstractC2552a.m12907A(parcel, 10, m30694M(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
