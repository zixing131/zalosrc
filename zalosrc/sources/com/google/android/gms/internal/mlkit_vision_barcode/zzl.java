package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30790zh;

/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C30790zh();

    /* renamed from: p */
    public String f33032p;

    /* renamed from: q */
    public String f33033q;

    /* renamed from: r */
    public String f33034r;

    /* renamed from: s */
    public String f33035s;

    /* renamed from: t */
    public String f33036t;

    /* renamed from: u */
    public String f33037u;

    /* renamed from: v */
    public String f33038v;

    public zzl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f33032p = str;
        this.f33033q = str2;
        this.f33034r = str3;
        this.f33035s = str4;
        this.f33036t = str5;
        this.f33037u = str6;
        this.f33038v = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f33032p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33033q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33034r, false);
        AbstractC2552a.m12934w(parcel, 5, this.f33035s, false);
        AbstractC2552a.m12934w(parcel, 6, this.f33036t, false);
        AbstractC2552a.m12934w(parcel, 7, this.f33037u, false);
        AbstractC2552a.m12934w(parcel, 8, this.f33038v, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
