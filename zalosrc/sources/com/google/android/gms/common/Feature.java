package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p632x4.C29323i;

/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C29323i();

    /* renamed from: p */
    private final String f16144p;

    /* renamed from: q */
    private final int f16145q;

    /* renamed from: r */
    private final long f16146r;

    public Feature(String str, int i11, long j11) {
        this.f16144p = str;
        this.f16145q = i11;
        this.f16146r = j11;
    }

    /* renamed from: F */
    public long m19190F() {
        long j11 = this.f16146r;
        return j11 == -1 ? this.f16145q : j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((m19191t() != null && m19191t().equals(feature.m19191t())) || (m19191t() == null && feature.m19191t() == null)) && m19190F() == feature.m19190F()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(m19191t(), Long.valueOf(m19190F()));
    }

    /* renamed from: t */
    public String m19191t() {
        return this.f16144p;
    }

    public final String toString() {
        AbstractC4199m.a m19703c = AbstractC4199m.m19703c(this);
        m19703c.m19704a("name", m19191t());
        m19703c.m19704a("version", Long.valueOf(m19190F()));
        return m19703c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, m19191t(), false);
        AbstractC2552a.m12924m(parcel, 2, this.f16145q);
        AbstractC2552a.m12929r(parcel, 3, m19190F());
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public Feature(String str, long j11) {
        this.f16144p = str;
        this.f16146r = j11;
        this.f16145q = -1;
    }
}
