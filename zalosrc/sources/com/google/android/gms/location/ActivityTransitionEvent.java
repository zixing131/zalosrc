package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p093d6.C17765e0;

/* loaded from: classes2.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new C17765e0();

    /* renamed from: p */
    private final int f33469p;

    /* renamed from: q */
    private final int f33470q;

    /* renamed from: r */
    private final long f33471r;

    public ActivityTransitionEvent(int i11, int i12, long j11) {
        ActivityTransition.m30592J(i12);
        this.f33469p = i11;
        this.f33470q = i12;
        this.f33471r = j11;
    }

    /* renamed from: F */
    public long m30595F() {
        return this.f33471r;
    }

    /* renamed from: J */
    public int m30596J() {
        return this.f33470q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (this.f33469p == activityTransitionEvent.f33469p && this.f33470q == activityTransitionEvent.f33470q && this.f33471r == activityTransitionEvent.f33471r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33469p), Integer.valueOf(this.f33470q), Long.valueOf(this.f33471r));
    }

    /* renamed from: t */
    public int m30597t() {
        return this.f33469p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f33469p;
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append("ActivityType ");
        sb3.append(i11);
        sb2.append(sb3.toString());
        sb2.append(" ");
        int i12 = this.f33470q;
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("TransitionType ");
        sb4.append(i12);
        sb2.append(sb4.toString());
        sb2.append(" ");
        long j11 = this.f33471r;
        StringBuilder sb5 = new StringBuilder(41);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(j11);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, m30597t());
        AbstractC2552a.m12924m(parcel, 2, m30596J());
        AbstractC2552a.m12929r(parcel, 3, m30595F());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
