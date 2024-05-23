package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

@Deprecated
/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C4165a1();

    /* renamed from: p */
    final int f16692p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(int i11) {
        this.f16692p = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16692p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
