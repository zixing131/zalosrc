package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new C5892a();

    /* renamed from: p */
    private final int f33530p;

    /* renamed from: q */
    private final String f33531q;

    /* renamed from: r */
    private final String f33532r;

    /* renamed from: s */
    private final String f33533s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceReport(int i11, String str, String str2, String str3) {
        this.f33530p = i11;
        this.f33531q = str;
        this.f33532r = str2;
        this.f33533s = str3;
    }

    /* renamed from: F */
    public String m30628F() {
        return this.f33532r;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return AbstractC4199m.m19701a(this.f33531q, placeReport.f33531q) && AbstractC4199m.m19701a(this.f33532r, placeReport.f33532r) && AbstractC4199m.m19701a(this.f33533s, placeReport.f33533s);
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f33531q, this.f33532r, this.f33533s);
    }

    /* renamed from: t */
    public String m30629t() {
        return this.f33531q;
    }

    public String toString() {
        AbstractC4199m.a m19703c = AbstractC4199m.m19703c(this);
        m19703c.m19704a("placeId", this.f33531q);
        m19703c.m19704a("tag", this.f33532r);
        if (!"unknown".equals(this.f33533s)) {
            m19703c.m19704a("source", this.f33533s);
        }
        return m19703c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33530p);
        AbstractC2552a.m12934w(parcel, 2, m30629t(), false);
        AbstractC2552a.m12934w(parcel, 3, m30628F(), false);
        AbstractC2552a.m12934w(parcel, 4, this.f33533s, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
