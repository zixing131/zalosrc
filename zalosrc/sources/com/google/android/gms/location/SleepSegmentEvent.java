package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.C17757a0;

/* loaded from: classes2.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new C17757a0();

    /* renamed from: p */
    private final long f33523p;

    /* renamed from: q */
    private final long f33524q;

    /* renamed from: r */
    private final int f33525r;

    /* renamed from: s */
    private final int f33526s;

    /* renamed from: t */
    private final int f33527t;

    public SleepSegmentEvent(long j11, long j12, int i11, int i12, int i13) {
        boolean z11;
        if (j11 <= j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f33523p = j11;
        this.f33524q = j12;
        this.f33525r = i11;
        this.f33526s = i12;
        this.f33527t = i13;
    }

    /* renamed from: F */
    public long m30624F() {
        return this.f33523p;
    }

    /* renamed from: J */
    public int m30625J() {
        return this.f33525r;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f33523p == sleepSegmentEvent.m30624F() && this.f33524q == sleepSegmentEvent.m30626t() && this.f33525r == sleepSegmentEvent.m30625J() && this.f33526s == sleepSegmentEvent.f33526s && this.f33527t == sleepSegmentEvent.f33527t) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Long.valueOf(this.f33523p), Long.valueOf(this.f33524q), Integer.valueOf(this.f33525r));
    }

    /* renamed from: t */
    public long m30626t() {
        return this.f33524q;
    }

    public String toString() {
        long j11 = this.f33523p;
        long j12 = this.f33524q;
        int i11 = this.f33525r;
        StringBuilder sb2 = new StringBuilder(84);
        sb2.append("startMillis=");
        sb2.append(j11);
        sb2.append(", endMillis=");
        sb2.append(j12);
        sb2.append(", status=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12929r(parcel, 1, m30624F());
        AbstractC2552a.m12929r(parcel, 2, m30626t());
        AbstractC2552a.m12924m(parcel, 3, m30625J());
        AbstractC2552a.m12924m(parcel, 4, this.f33526s);
        AbstractC2552a.m12924m(parcel, 5, this.f33527t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
