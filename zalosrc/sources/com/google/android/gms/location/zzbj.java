package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new C5884e();

    /* renamed from: p */
    private final String f33534p;

    /* renamed from: q */
    private final String f33535q;

    /* renamed from: r */
    private final String f33536r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(String str, String str2, String str3) {
        this.f33536r = str;
        this.f33534p = str2;
        this.f33535q = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33534p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33535q, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33536r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
