package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C6214e();

    /* renamed from: p */
    final int f34725p;

    /* renamed from: q */
    private final ConnectionResult f34726q;

    /* renamed from: r */
    private final zav f34727r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zak(int i11, ConnectionResult connectionResult, zav zavVar) {
        this.f34725p = i11;
        this.f34726q = connectionResult;
        this.f34727r = zavVar;
    }

    /* renamed from: F */
    public final zav m31523F() {
        return this.f34727r;
    }

    /* renamed from: t */
    public final ConnectionResult m31524t() {
        return this.f34726q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f34725p);
        AbstractC2552a.m12932u(parcel, 2, this.f34726q, i11, false);
        AbstractC2552a.m12932u(parcel, 3, this.f34727r, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
