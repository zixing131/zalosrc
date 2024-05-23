package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C5888i();

    /* renamed from: p */
    private final int f33467p;

    /* renamed from: q */
    private final int f33468q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityTransition(int i11, int i12) {
        this.f33467p = i11;
        this.f33468q = i12;
    }

    /* renamed from: J */
    public static void m30592J(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= 1) {
            z11 = true;
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Transition type ");
        sb2.append(i11);
        sb2.append(" is not valid.");
        AbstractC4205o.m19713b(z11, sb2.toString());
    }

    /* renamed from: F */
    public int m30593F() {
        return this.f33468q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.f33467p == activityTransition.f33467p && this.f33468q == activityTransition.f33468q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f33467p), Integer.valueOf(this.f33468q));
    }

    /* renamed from: t */
    public int m30594t() {
        return this.f33467p;
    }

    public String toString() {
        int i11 = this.f33467p;
        int i12 = this.f33468q;
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i11);
        sb2.append(", mTransitionType=");
        sb2.append(i12);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, m30594t());
        AbstractC2552a.m12924m(parcel, 2, m30593F());
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
