package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsa> CREATOR = new m60();

    /* renamed from: p */
    public final String f31919p;

    /* renamed from: q */
    public final Bundle f31920q;

    public zzbsa(String str, Bundle bundle) {
        this.f31919p = str;
        this.f31920q = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f31919p, false);
        AbstractC2552a.m12916e(parcel, 2, this.f31920q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
