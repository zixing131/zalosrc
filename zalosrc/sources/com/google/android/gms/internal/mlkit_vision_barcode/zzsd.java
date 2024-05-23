package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30429gh;

/* loaded from: classes2.dex */
public final class zzsd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsd> CREATOR = new C30429gh();

    /* renamed from: p */
    private final zzsh f33082p;

    /* renamed from: q */
    private final String f33083q;

    /* renamed from: r */
    private final String f33084r;

    /* renamed from: s */
    private final zzsi[] f33085s;

    /* renamed from: t */
    private final zzsf[] f33086t;

    /* renamed from: u */
    private final String[] f33087u;

    /* renamed from: v */
    private final zzsa[] f33088v;

    public zzsd(zzsh zzshVar, String str, String str2, zzsi[] zzsiVarArr, zzsf[] zzsfVarArr, String[] strArr, zzsa[] zzsaVarArr) {
        this.f33082p = zzshVar;
        this.f33083q = str;
        this.f33084r = str2;
        this.f33085s = zzsiVarArr;
        this.f33086t = zzsfVarArr;
        this.f33087u = strArr;
        this.f33088v = zzsaVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 1, this.f33082p, i11, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33083q, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33084r, false);
        AbstractC2552a.m12937z(parcel, 4, this.f33085s, i11, false);
        AbstractC2552a.m12937z(parcel, 5, this.f33086t, i11, false);
        AbstractC2552a.m12935x(parcel, 6, this.f33087u, false);
        AbstractC2552a.m12937z(parcel, 7, this.f33088v, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
