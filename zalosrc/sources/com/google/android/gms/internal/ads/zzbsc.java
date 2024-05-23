package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsc> CREATOR = new n60();

    /* renamed from: p */
    public final int f31921p;

    /* renamed from: q */
    public final int f31922q;

    /* renamed from: r */
    public final String f31923r;

    /* renamed from: s */
    public final int f31924s;

    public zzbsc(int i11, int i12, String str, int i13) {
        this.f31921p = i11;
        this.f31922q = i12;
        this.f31923r = str;
        this.f31924s = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f31922q);
        AbstractC2552a.m12934w(parcel, 2, this.f31923r, false);
        AbstractC2552a.m12924m(parcel, 3, this.f31924s);
        AbstractC2552a.m12924m(parcel, 1000, this.f31921p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
