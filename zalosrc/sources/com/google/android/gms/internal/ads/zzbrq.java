package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbrq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrq> CREATOR = new c60();

    /* renamed from: p */
    public final String f31915p;

    /* renamed from: q */
    public final boolean f31916q;

    /* renamed from: r */
    public final int f31917r;

    /* renamed from: s */
    public final String f31918s;

    public zzbrq(String str, boolean z11, int i11, String str2) {
        this.f31915p = str;
        this.f31916q = z11;
        this.f31917r = i11;
        this.f31918s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f31915p, false);
        AbstractC2552a.m12914c(parcel, 2, this.f31916q);
        AbstractC2552a.m12924m(parcel, 3, this.f31917r);
        AbstractC2552a.m12934w(parcel, 4, this.f31918s, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
