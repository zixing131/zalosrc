package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcgv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcgv> CREATOR = new dl0();

    /* renamed from: p */
    public String f32030p;

    /* renamed from: q */
    public int f32031q;

    /* renamed from: r */
    public int f32032r;

    /* renamed from: s */
    public boolean f32033s;

    /* renamed from: t */
    public boolean f32034t;

    public zzcgv(int i11, int i12, boolean z11, boolean z12) {
        this(223104000, i12, true, false, z12);
    }

    /* renamed from: t */
    public static zzcgv m28720t() {
        return new zzcgv(AbstractC4150d.f16480a, AbstractC4150d.f16480a, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f32030p, false);
        AbstractC2552a.m12924m(parcel, 3, this.f32031q);
        AbstractC2552a.m12924m(parcel, 4, this.f32032r);
        AbstractC2552a.m12914c(parcel, 5, this.f32033s);
        AbstractC2552a.m12914c(parcel, 6, this.f32034t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzcgv(int i11, int i12, boolean z11, boolean z12, boolean z13) {
        this("afma-sdk-a-v" + i11 + "." + i12 + "." + (z11 ? "0" : "1"), i11, i12, z11, z13);
    }

    public zzcgv(String str, int i11, int i12, boolean z11, boolean z12) {
        this.f32030p = str;
        this.f32031q = i11;
        this.f32032r = i12;
        this.f32033s = z11;
        this.f32034t = z12;
    }
}
