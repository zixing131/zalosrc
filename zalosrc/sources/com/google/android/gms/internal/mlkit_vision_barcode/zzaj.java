package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30468j;

/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C30468j();

    /* renamed from: p */
    public int f32983p;

    /* renamed from: q */
    public int f32984q;

    /* renamed from: r */
    public int f32985r;

    /* renamed from: s */
    public long f32986s;

    /* renamed from: t */
    public int f32987t;

    public zzaj(int i11, int i12, int i13, long j11, int i14) {
        this.f32983p = i11;
        this.f32984q = i12;
        this.f32985r = i13;
        this.f32986s = j11;
        this.f32987t = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f32983p);
        AbstractC2552a.m12924m(parcel, 3, this.f32984q);
        AbstractC2552a.m12924m(parcel, 4, this.f32985r);
        AbstractC2552a.m12929r(parcel, 5, this.f32986s);
        AbstractC2552a.m12924m(parcel, 6, this.f32987t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
