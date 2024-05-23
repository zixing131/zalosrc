package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30619qh;

/* loaded from: classes2.dex */
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new C30619qh();

    /* renamed from: p */
    private final int f33116p;

    /* renamed from: q */
    private final String f33117q;

    public zzsi(int i11, String str) {
        this.f33116p = i11;
        this.f33117q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33116p);
        AbstractC2552a.m12934w(parcel, 2, this.f33117q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
