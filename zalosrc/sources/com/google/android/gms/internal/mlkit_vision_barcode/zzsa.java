package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30314ah;

/* loaded from: classes2.dex */
public final class zzsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsa> CREATOR = new C30314ah();

    /* renamed from: p */
    private final int f33065p;

    /* renamed from: q */
    private final String[] f33066q;

    public zzsa(int i11, String[] strArr) {
        this.f33065p = i11;
        this.f33066q = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33065p);
        AbstractC2552a.m12935x(parcel, 2, this.f33066q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
