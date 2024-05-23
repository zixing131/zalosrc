package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p670y5.C30391eh;

/* loaded from: classes2.dex */
public final class zzsb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsb> CREATOR = new C30391eh();

    /* renamed from: p */
    private final int f33067p;

    /* renamed from: q */
    private final int f33068q;

    /* renamed from: r */
    private final int f33069r;

    /* renamed from: s */
    private final int f33070s;

    /* renamed from: t */
    private final int f33071t;

    /* renamed from: u */
    private final int f33072u;

    /* renamed from: v */
    private final boolean f33073v;

    /* renamed from: w */
    private final String f33074w;

    public zzsb(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, String str) {
        this.f33067p = i11;
        this.f33068q = i12;
        this.f33069r = i13;
        this.f33070s = i14;
        this.f33071t = i15;
        this.f33072u = i16;
        this.f33073v = z11;
        this.f33074w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f33067p);
        AbstractC2552a.m12924m(parcel, 2, this.f33068q);
        AbstractC2552a.m12924m(parcel, 3, this.f33069r);
        AbstractC2552a.m12924m(parcel, 4, this.f33070s);
        AbstractC2552a.m12924m(parcel, 5, this.f33071t);
        AbstractC2552a.m12924m(parcel, 6, this.f33072u);
        AbstractC2552a.m12914c(parcel, 7, this.f33073v);
        AbstractC2552a.m12934w(parcel, 8, this.f33074w, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
