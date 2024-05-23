package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30316b;

/* loaded from: classes2.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C30316b();

    /* renamed from: p */
    public String f33041p;

    /* renamed from: q */
    public String f33042q;

    public zzn(String str, String str2) {
        this.f33041p = str;
        this.f33042q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f33041p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33042q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
