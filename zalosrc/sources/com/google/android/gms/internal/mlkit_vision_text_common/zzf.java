package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p012a6.C0207d5;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C0207d5();

    /* renamed from: p */
    public final int f33152p;

    /* renamed from: q */
    public final int f33153q;

    /* renamed from: r */
    public final int f33154r;

    /* renamed from: s */
    public final int f33155s;

    /* renamed from: t */
    public final float f33156t;

    public zzf(int i11, int i12, int i13, int i14, float f11) {
        this.f33152p = i11;
        this.f33153q = i12;
        this.f33154r = i13;
        this.f33155s = i14;
        this.f33156t = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f33152p);
        AbstractC2552a.m12924m(parcel, 3, this.f33153q);
        AbstractC2552a.m12924m(parcel, 4, this.f33154r);
        AbstractC2552a.m12924m(parcel, 5, this.f33155s);
        AbstractC2552a.m12921j(parcel, 6, this.f33156t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
