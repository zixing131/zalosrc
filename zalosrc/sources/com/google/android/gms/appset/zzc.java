package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p355n4.C23540e;

/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C23540e();

    /* renamed from: p */
    private final String f15894p;

    /* renamed from: q */
    private final int f15895q;

    public zzc(String str, int i11) {
        this.f15894p = str;
        this.f15895q = i11;
    }

    /* renamed from: t */
    public final String m19023t() {
        return this.f15894p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f15894p, false);
        AbstractC2552a.m12924m(parcel, 2, this.f15895q);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public final int zza() {
        return this.f15895q;
    }
}
