package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C5880a();

    /* renamed from: p */
    private final List f33482p;

    /* renamed from: q */
    private final int f33483q;

    /* renamed from: r */
    private final String f33484r;

    /* renamed from: s */
    private final String f33485s;

    public GeofencingRequest(List list, int i11, String str, String str2) {
        this.f33482p = list;
        this.f33483q = i11;
        this.f33484r = str;
        this.f33485s = str2;
    }

    /* renamed from: t */
    public int m30601t() {
        return this.f33483q;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f33482p + ", initialTrigger=" + this.f33483q + ", tag=" + this.f33484r + ", attributionTag=" + this.f33485s + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, this.f33482p, false);
        AbstractC2552a.m12924m(parcel, 2, m30601t());
        AbstractC2552a.m12934w(parcel, 3, this.f33484r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33485s, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
