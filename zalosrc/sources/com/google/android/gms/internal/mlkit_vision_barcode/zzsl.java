package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30676th;

/* loaded from: classes2.dex */
public final class zzsl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsl> CREATOR = new C30676th();

    /* renamed from: p */
    private final String f33122p;

    /* renamed from: q */
    private final String f33123q;

    /* renamed from: r */
    private final int f33124r;

    public zzsl(String str, String str2, int i11) {
        this.f33122p = str;
        this.f33123q = str2;
        this.f33124r = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33122p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33123q, false);
        AbstractC2552a.m12924m(parcel, 3, this.f33124r);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
