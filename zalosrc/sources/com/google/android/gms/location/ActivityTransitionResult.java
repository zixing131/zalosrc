package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p031b5.AbstractC2552a;
import p093d6.C17769g0;

/* loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C17769g0();

    /* renamed from: p */
    private final List f33477p;

    /* renamed from: q */
    private Bundle f33478q;

    public ActivityTransitionResult(List list) {
        this.f33478q = null;
        AbstractC4205o.m19723l(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i11 = 1; i11 < list.size(); i11++) {
                AbstractC4205o.m19712a(((ActivityTransitionEvent) list.get(i11)).m30595F() >= ((ActivityTransitionEvent) list.get(i11 + (-1))).m30595F());
            }
        }
        this.f33477p = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f33477p.equals(((ActivityTransitionResult) obj).f33477p);
        }
        return false;
    }

    public int hashCode() {
        return this.f33477p.hashCode();
    }

    /* renamed from: t */
    public List m30598t() {
        return this.f33477p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, m30598t(), false);
        AbstractC2552a.m12916e(parcel, 2, this.f33478q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.f33478q = bundle;
    }
}
