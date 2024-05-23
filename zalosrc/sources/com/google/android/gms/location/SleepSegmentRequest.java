package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;
import p093d6.C17759b0;

/* loaded from: classes2.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new C17759b0();

    /* renamed from: p */
    private final List f33528p;

    /* renamed from: q */
    private final int f33529q;

    public SleepSegmentRequest(List list, int i11) {
        this.f33528p = list;
        this.f33529q = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        if (AbstractC4199m.m19701a(this.f33528p, sleepSegmentRequest.f33528p) && this.f33529q == sleepSegmentRequest.f33529q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f33528p, Integer.valueOf(this.f33529q));
    }

    /* renamed from: t */
    public int m30627t() {
        return this.f33529q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, this.f33528p, false);
        AbstractC2552a.m12924m(parcel, 2, m30627t());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
