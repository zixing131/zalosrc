package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30752xh;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C30752xh();

    /* renamed from: p */
    public int f33026p;

    /* renamed from: q */
    public String f33027q;

    /* renamed from: r */
    public String f33028r;

    /* renamed from: s */
    public String f33029s;

    public zzj(int i11, String str, String str2, String str3) {
        this.f33026p = i11;
        this.f33027q = str;
        this.f33028r = str2;
        this.f33029s = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f33026p);
        AbstractC2552a.m12934w(parcel, 3, this.f33027q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33028r, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33029s, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
