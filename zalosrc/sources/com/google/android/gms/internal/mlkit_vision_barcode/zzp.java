package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30354d;

/* loaded from: classes2.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C30354d();

    /* renamed from: p */
    public String f33045p;

    /* renamed from: q */
    public String f33046q;

    /* renamed from: r */
    public int f33047r;

    public zzp(String str, String str2, int i11) {
        this.f33045p = str;
        this.f33046q = str2;
        this.f33047r = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f33045p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33046q, false);
        AbstractC2552a.m12924m(parcel, 4, this.f33047r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
