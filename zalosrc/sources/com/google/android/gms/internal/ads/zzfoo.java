package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzfoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoo> CREATOR = new l13();

    /* renamed from: p */
    public final int f32121p;

    /* renamed from: q */
    public final int f32122q;

    /* renamed from: r */
    public final String f32123r;

    /* renamed from: s */
    public final String f32124s;

    /* renamed from: t */
    public final int f32125t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoo(int i11, int i12, int i13, String str, String str2) {
        this.f32121p = i11;
        this.f32122q = i12;
        this.f32123r = str;
        this.f32124s = str2;
        this.f32125t = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f32121p);
        AbstractC2552a.m12924m(parcel, 2, this.f32122q);
        AbstractC2552a.m12934w(parcel, 3, this.f32123r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f32124s, false);
        AbstractC2552a.m12924m(parcel, 5, this.f32125t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzfoo(int i11, int i12, String str, String str2) {
        this(1, 1, i12 - 1, str, str2);
    }
}
