package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30638rh;

/* loaded from: classes2.dex */
public final class zzsj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsj> CREATOR = new C30638rh();

    /* renamed from: p */
    private final String f33118p;

    /* renamed from: q */
    private final String f33119q;

    public zzsj(String str, String str2) {
        this.f33118p = str;
        this.f33119q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33118p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33119q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
