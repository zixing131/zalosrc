package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30714vh;

/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C30714vh();

    /* renamed from: p */
    public zzl f33005p;

    /* renamed from: q */
    public String f33006q;

    /* renamed from: r */
    public String f33007r;

    /* renamed from: s */
    public zzm[] f33008s;

    /* renamed from: t */
    public zzj[] f33009t;

    /* renamed from: u */
    public String[] f33010u;

    /* renamed from: v */
    public zze[] f33011v;

    public zzh(zzl zzlVar, String str, String str2, zzm[] zzmVarArr, zzj[] zzjVarArr, String[] strArr, zze[] zzeVarArr) {
        this.f33005p = zzlVar;
        this.f33006q = str;
        this.f33007r = str2;
        this.f33008s = zzmVarArr;
        this.f33009t = zzjVarArr;
        this.f33010u = strArr;
        this.f33011v = zzeVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, this.f33005p, i11, false);
        AbstractC2552a.m12934w(parcel, 3, this.f33006q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33007r, false);
        AbstractC2552a.m12937z(parcel, 5, this.f33008s, i11, false);
        AbstractC2552a.m12937z(parcel, 6, this.f33009t, i11, false);
        AbstractC2552a.m12935x(parcel, 7, this.f33010u, false);
        AbstractC2552a.m12937z(parcel, 8, this.f33011v, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
