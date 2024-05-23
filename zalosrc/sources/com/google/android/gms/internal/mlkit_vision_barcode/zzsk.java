package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30657sh;

/* loaded from: classes2.dex */
public final class zzsk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsk> CREATOR = new C30657sh();

    /* renamed from: p */
    private final String f33120p;

    /* renamed from: q */
    private final String f33121q;

    public zzsk(String str, String str2) {
        this.f33120p = str;
        this.f33121q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33120p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33121q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
