package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30334bh;

/* loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C30334bh();

    /* renamed from: p */
    public int f32990p;

    /* renamed from: q */
    public int f32991q;

    /* renamed from: r */
    public int f32992r;

    /* renamed from: s */
    public int f32993s;

    /* renamed from: t */
    public int f32994t;

    /* renamed from: u */
    public int f32995u;

    /* renamed from: v */
    public boolean f32996v;

    /* renamed from: w */
    public String f32997w;

    public zzf(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, String str) {
        this.f32990p = i11;
        this.f32991q = i12;
        this.f32992r = i13;
        this.f32993s = i14;
        this.f32994t = i15;
        this.f32995u = i16;
        this.f32996v = z11;
        this.f32997w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, this.f32990p);
        AbstractC2552a.m12924m(parcel, 3, this.f32991q);
        AbstractC2552a.m12924m(parcel, 4, this.f32992r);
        AbstractC2552a.m12924m(parcel, 5, this.f32993s);
        AbstractC2552a.m12924m(parcel, 6, this.f32994t);
        AbstractC2552a.m12924m(parcel, 7, this.f32995u);
        AbstractC2552a.m12914c(parcel, 8, this.f32996v);
        AbstractC2552a.m12934w(parcel, 9, this.f32997w, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
