package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new C5914k();

    /* renamed from: p */
    private final List f33674p;

    /* renamed from: q */
    private final List f33675q;

    /* renamed from: r */
    private float f33676r;

    /* renamed from: s */
    private int f33677s;

    /* renamed from: t */
    private int f33678t;

    /* renamed from: u */
    private float f33679u;

    /* renamed from: v */
    private boolean f33680v;

    /* renamed from: w */
    private boolean f33681w;

    /* renamed from: x */
    private boolean f33682x;

    /* renamed from: y */
    private int f33683y;

    /* renamed from: z */
    private List f33684z;

    public PolygonOptions(List list, List list2, float f11, int i11, int i12, float f12, boolean z11, boolean z12, boolean z13, int i13, List list3) {
        this.f33674p = list;
        this.f33675q = list2;
        this.f33676r = f11;
        this.f33677s = i11;
        this.f33678t = i12;
        this.f33679u = f12;
        this.f33680v = z11;
        this.f33681w = z12;
        this.f33682x = z13;
        this.f33683y = i13;
        this.f33684z = list3;
    }

    /* renamed from: D0 */
    public boolean m30737D0() {
        return this.f33680v;
    }

    /* renamed from: F */
    public List m30738F() {
        return this.f33674p;
    }

    /* renamed from: J */
    public int m30739J() {
        return this.f33677s;
    }

    /* renamed from: K */
    public int m30740K() {
        return this.f33683y;
    }

    /* renamed from: M */
    public List m30741M() {
        return this.f33684z;
    }

    /* renamed from: Q */
    public float m30742Q() {
        return this.f33676r;
    }

    /* renamed from: Z */
    public float m30743Z() {
        return this.f33679u;
    }

    /* renamed from: i0 */
    public boolean m30744i0() {
        return this.f33682x;
    }

    /* renamed from: o0 */
    public boolean m30745o0() {
        return this.f33681w;
    }

    /* renamed from: t */
    public int m30746t() {
        return this.f33678t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 2, m30738F(), false);
        AbstractC2552a.m12928q(parcel, 3, this.f33675q, false);
        AbstractC2552a.m12921j(parcel, 4, m30742Q());
        AbstractC2552a.m12924m(parcel, 5, m30739J());
        AbstractC2552a.m12924m(parcel, 6, m30746t());
        AbstractC2552a.m12921j(parcel, 7, m30743Z());
        AbstractC2552a.m12914c(parcel, 8, m30737D0());
        AbstractC2552a.m12914c(parcel, 9, m30745o0());
        AbstractC2552a.m12914c(parcel, 10, m30744i0());
        AbstractC2552a.m12924m(parcel, 11, m30740K());
        AbstractC2552a.m12907A(parcel, 12, m30741M(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
