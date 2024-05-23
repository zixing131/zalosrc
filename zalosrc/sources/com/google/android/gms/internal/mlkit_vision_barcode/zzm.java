package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30315ai;

/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C30315ai();

    /* renamed from: p */
    public int f33039p;

    /* renamed from: q */
    public String f33040q;

    public zzm(int i11, String str) {
        this.f33039p = i11;
        this.f33040q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f33039p);
        AbstractC2552a.m12934w(parcel, 3, this.f33040q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
