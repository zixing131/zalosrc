package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p181g6.C19242h;

/* loaded from: classes2.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new C19242h();

    /* renamed from: p */
    public final int f33726p;

    /* renamed from: q */
    public final int f33727q;

    /* renamed from: r */
    public final byte[] f33728r;

    public Tile(int i11, int i12, byte[] bArr) {
        this.f33726p = i11;
        this.f33727q = i12;
        this.f33728r = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f33726p;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 2, i12);
        AbstractC2552a.m12924m(parcel, 3, this.f33727q);
        AbstractC2552a.m12918g(parcel, 4, this.f33728r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
