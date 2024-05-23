package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p355n4.C23539d;

/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C23539d();

    /* renamed from: p */
    private final String f15892p;

    /* renamed from: q */
    private final String f15893q;

    public zza(String str, String str2) {
        this.f15892p = str;
        this.f15893q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f15892p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f15893q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
