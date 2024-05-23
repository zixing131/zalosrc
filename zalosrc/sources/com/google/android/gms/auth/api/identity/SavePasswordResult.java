package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p437q4.C25109b;

/* loaded from: classes2.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new C25109b();

    /* renamed from: p */
    private final PendingIntent f16003p;

    public SavePasswordResult(PendingIntent pendingIntent) {
        this.f16003p = (PendingIntent) AbstractC4205o.m19722k(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordResult)) {
            return false;
        }
        return AbstractC4199m.m19701a(this.f16003p, ((SavePasswordResult) obj).f16003p);
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f16003p);
    }

    /* renamed from: t */
    public PendingIntent m19081t() {
        return this.f16003p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, m19081t(), i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
