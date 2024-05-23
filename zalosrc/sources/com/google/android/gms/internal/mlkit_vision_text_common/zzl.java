package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p012a6.C0308ib;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C0308ib();

    /* renamed from: p */
    public final zzr[] f33157p;

    /* renamed from: q */
    public final zzf f33158q;

    /* renamed from: r */
    public final zzf f33159r;

    /* renamed from: s */
    public final zzf f33160s;

    /* renamed from: t */
    public final String f33161t;

    /* renamed from: u */
    public final float f33162u;

    /* renamed from: v */
    public final String f33163v;

    /* renamed from: w */
    public final int f33164w;

    /* renamed from: x */
    public final boolean f33165x;

    /* renamed from: y */
    public final int f33166y;

    /* renamed from: z */
    public final int f33167z;

    public zzl(zzr[] zzrVarArr, zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, float f11, String str2, int i11, boolean z11, int i12, int i13) {
        this.f33157p = zzrVarArr;
        this.f33158q = zzfVar;
        this.f33159r = zzfVar2;
        this.f33160s = zzfVar3;
        this.f33161t = str;
        this.f33162u = f11;
        this.f33163v = str2;
        this.f33164w = i11;
        this.f33165x = z11;
        this.f33166y = i12;
        this.f33167z = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12937z(parcel, 2, this.f33157p, i11, false);
        AbstractC2552a.m12932u(parcel, 3, this.f33158q, i11, false);
        AbstractC2552a.m12932u(parcel, 4, this.f33159r, i11, false);
        AbstractC2552a.m12932u(parcel, 5, this.f33160s, i11, false);
        AbstractC2552a.m12934w(parcel, 6, this.f33161t, false);
        AbstractC2552a.m12921j(parcel, 7, this.f33162u);
        AbstractC2552a.m12934w(parcel, 8, this.f33163v, false);
        AbstractC2552a.m12924m(parcel, 9, this.f33164w);
        AbstractC2552a.m12914c(parcel, 10, this.f33165x);
        AbstractC2552a.m12924m(parcel, 11, this.f33166y);
        AbstractC2552a.m12924m(parcel, 12, this.f33167z);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
