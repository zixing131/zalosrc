package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import p031b5.AbstractC2552a;
import p151f6.AbstractC18757h;

/* loaded from: classes2.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C5897e();

    /* renamed from: p */
    private StreetViewPanoramaCamera f33574p;

    /* renamed from: q */
    private String f33575q;

    /* renamed from: r */
    private LatLng f33576r;

    /* renamed from: s */
    private Integer f33577s;

    /* renamed from: t */
    private Boolean f33578t;

    /* renamed from: u */
    private Boolean f33579u;

    /* renamed from: v */
    private Boolean f33580v;

    /* renamed from: w */
    private Boolean f33581w;

    /* renamed from: x */
    private Boolean f33582x;

    /* renamed from: y */
    private StreetViewSource f33583y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b11, byte b12, byte b13, byte b14, byte b15, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.f33578t = bool;
        this.f33579u = bool;
        this.f33580v = bool;
        this.f33581w = bool;
        this.f33583y = StreetViewSource.f33711q;
        this.f33574p = streetViewPanoramaCamera;
        this.f33576r = latLng;
        this.f33577s = num;
        this.f33575q = str;
        this.f33578t = AbstractC18757h.m98771b(b11);
        this.f33579u = AbstractC18757h.m98771b(b12);
        this.f33580v = AbstractC18757h.m98771b(b13);
        this.f33581w = AbstractC18757h.m98771b(b14);
        this.f33582x = AbstractC18757h.m98771b(b15);
        this.f33583y = streetViewSource;
    }

    /* renamed from: F */
    public LatLng m30667F() {
        return this.f33576r;
    }

    /* renamed from: J */
    public Integer m30668J() {
        return this.f33577s;
    }

    /* renamed from: K */
    public StreetViewSource m30669K() {
        return this.f33583y;
    }

    /* renamed from: M */
    public StreetViewPanoramaCamera m30670M() {
        return this.f33574p;
    }

    /* renamed from: t */
    public String m30671t() {
        return this.f33575q;
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("PanoramaId", this.f33575q).m19704a("Position", this.f33576r).m19704a("Radius", this.f33577s).m19704a("Source", this.f33583y).m19704a("StreetViewPanoramaCamera", this.f33574p).m19704a("UserNavigationEnabled", this.f33578t).m19704a("ZoomGesturesEnabled", this.f33579u).m19704a("PanningGesturesEnabled", this.f33580v).m19704a("StreetNamesEnabled", this.f33581w).m19704a("UseViewLifecycleInFragment", this.f33582x).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, m30670M(), i11, false);
        AbstractC2552a.m12934w(parcel, 3, m30671t(), false);
        AbstractC2552a.m12932u(parcel, 4, m30667F(), i11, false);
        AbstractC2552a.m12927p(parcel, 5, m30668J(), false);
        AbstractC2552a.m12917f(parcel, 6, AbstractC18757h.m98770a(this.f33578t));
        AbstractC2552a.m12917f(parcel, 7, AbstractC18757h.m98770a(this.f33579u));
        AbstractC2552a.m12917f(parcel, 8, AbstractC18757h.m98770a(this.f33580v));
        AbstractC2552a.m12917f(parcel, 9, AbstractC18757h.m98770a(this.f33581w));
        AbstractC2552a.m12917f(parcel, 10, AbstractC18757h.m98770a(this.f33582x));
        AbstractC2552a.m12932u(parcel, 11, m30669K(), i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
