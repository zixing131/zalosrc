package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30299a2;

/* loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new C30299a2();

    /* renamed from: p */
    public int f32988p;

    /* renamed from: q */
    public String[] f32989q;

    public zze(int i11, String[] strArr) {
        this.f32988p = i11;
        this.f32989q = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f32988p);
        AbstractC2552a.m12935x(parcel, 3, this.f32989q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
