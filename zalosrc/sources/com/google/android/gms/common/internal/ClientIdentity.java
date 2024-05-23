package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C4223u();

    /* renamed from: p */
    public final int f16527p;

    /* renamed from: q */
    public final String f16528q;

    public ClientIdentity(int i11, String str) {
        this.f16527p = i11;
        this.f16528q = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.f16527p == this.f16527p && AbstractC4199m.m19701a(clientIdentity.f16528q, this.f16528q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16527p;
    }

    public final String toString() {
        return this.f16527p + ":" + this.f16528q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16527p);
        AbstractC2552a.m12934w(parcel, 2, this.f16528q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
