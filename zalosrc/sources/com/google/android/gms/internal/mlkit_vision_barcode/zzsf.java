package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30467ih;

/* loaded from: classes2.dex */
public final class zzsf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsf> CREATOR = new C30467ih();

    /* renamed from: p */
    private final int f33103p;

    /* renamed from: q */
    private final String f33104q;

    /* renamed from: r */
    private final String f33105r;

    /* renamed from: s */
    private final String f33106s;

    public zzsf(int i11, String str, String str2, String str3) {
        this.f33103p = i11;
        this.f33104q = str;
        this.f33105r = str2;
        this.f33106s = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33103p);
        AbstractC2552a.m12934w(parcel, 2, this.f33104q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33105r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33106s, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
