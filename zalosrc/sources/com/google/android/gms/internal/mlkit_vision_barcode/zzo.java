package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30335c;

/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C30335c();

    /* renamed from: p */
    public String f33043p;

    /* renamed from: q */
    public String f33044q;

    public zzo(String str, String str2) {
        this.f33043p = str;
        this.f33044q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f33043p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33044q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
