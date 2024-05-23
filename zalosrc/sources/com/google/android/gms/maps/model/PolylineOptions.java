package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import java.util.ArrayList;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new C5915l();

    /* renamed from: A */
    private List f33685A;

    /* renamed from: p */
    private final List f33686p;

    /* renamed from: q */
    private float f33687q;

    /* renamed from: r */
    private int f33688r;

    /* renamed from: s */
    private float f33689s;

    /* renamed from: t */
    private boolean f33690t;

    /* renamed from: u */
    private boolean f33691u;

    /* renamed from: v */
    private boolean f33692v;

    /* renamed from: w */
    private Cap f33693w;

    /* renamed from: x */
    private Cap f33694x;

    /* renamed from: y */
    private int f33695y;

    /* renamed from: z */
    private List f33696z;

    public PolylineOptions(List list, float f11, int i11, float f12, boolean z11, boolean z12, boolean z13, Cap cap, Cap cap2, int i12, List list2, List list3) {
        this.f33687q = 10.0f;
        this.f33688r = -16777216;
        this.f33689s = 0.0f;
        this.f33690t = true;
        this.f33691u = false;
        this.f33692v = false;
        this.f33693w = new ButtCap();
        this.f33694x = new ButtCap();
        this.f33695y = 0;
        this.f33696z = null;
        this.f33685A = new ArrayList();
        this.f33686p = list;
        this.f33687q = f11;
        this.f33688r = i11;
        this.f33689s = f12;
        this.f33690t = z11;
        this.f33691u = z12;
        this.f33692v = z13;
        if (cap != null) {
            this.f33693w = cap;
        }
        if (cap2 != null) {
            this.f33694x = cap2;
        }
        this.f33695y = i12;
        this.f33696z = list2;
        if (list3 != null) {
            this.f33685A = list3;
        }
    }

    /* renamed from: D0 */
    public boolean m30747D0() {
        return this.f33691u;
    }

    /* renamed from: E0 */
    public boolean m30748E0() {
        return this.f33690t;
    }

    /* renamed from: F */
    public Cap m30749F() {
        return this.f33694x.m30690t();
    }

    /* renamed from: J */
    public int m30750J() {
        return this.f33695y;
    }

    /* renamed from: K */
    public List m30751K() {
        return this.f33696z;
    }

    /* renamed from: M */
    public List m30752M() {
        return this.f33686p;
    }

    /* renamed from: Q */
    public Cap m30753Q() {
        return this.f33693w.m30690t();
    }

    /* renamed from: Z */
    public float m30754Z() {
        return this.f33687q;
    }

    /* renamed from: i0 */
    public float m30755i0() {
        return this.f33689s;
    }

    /* renamed from: o0 */
    public boolean m30756o0() {
        return this.f33692v;
    }

    /* renamed from: t */
    public int m30757t() {
        return this.f33688r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 2, m30752M(), false);
        AbstractC2552a.m12921j(parcel, 3, m30754Z());
        AbstractC2552a.m12924m(parcel, 4, m30757t());
        AbstractC2552a.m12921j(parcel, 5, m30755i0());
        AbstractC2552a.m12914c(parcel, 6, m30748E0());
        AbstractC2552a.m12914c(parcel, 7, m30747D0());
        AbstractC2552a.m12914c(parcel, 8, m30756o0());
        AbstractC2552a.m12932u(parcel, 9, m30753Q(), i11, false);
        AbstractC2552a.m12932u(parcel, 10, m30749F(), i11, false);
        AbstractC2552a.m12924m(parcel, 11, m30750J());
        AbstractC2552a.m12907A(parcel, 12, m30751K(), false);
        ArrayList arrayList = new ArrayList(this.f33685A.size());
        for (StyleSpan styleSpan : this.f33685A) {
            StrokeStyle.C5903a c5903a = new StrokeStyle.C5903a(styleSpan.m30768F());
            c5903a.m30767c(this.f33687q);
            c5903a.m30766b(this.f33690t);
            arrayList.add(new StyleSpan(c5903a.m30765a(), styleSpan.m30769t()));
        }
        AbstractC2552a.m12907A(parcel, 13, arrayList, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
