package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C4188i0();

    /* renamed from: p */
    private final int f16552p;

    /* renamed from: q */
    private final int f16553q;

    /* renamed from: r */
    private final int f16554r;

    /* renamed from: s */
    private final long f16555s;

    /* renamed from: t */
    private final long f16556t;

    /* renamed from: u */
    private final String f16557u;

    /* renamed from: v */
    private final String f16558v;

    /* renamed from: w */
    private final int f16559w;

    /* renamed from: x */
    private final int f16560x;

    public MethodInvocation(int i11, int i12, int i13, long j11, long j12, String str, String str2, int i14) {
        this(i11, i12, i13, j11, j12, str, str2, i14, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16552p);
        AbstractC2552a.m12924m(parcel, 2, this.f16553q);
        AbstractC2552a.m12924m(parcel, 3, this.f16554r);
        AbstractC2552a.m12929r(parcel, 4, this.f16555s);
        AbstractC2552a.m12929r(parcel, 5, this.f16556t);
        AbstractC2552a.m12934w(parcel, 6, this.f16557u, false);
        AbstractC2552a.m12934w(parcel, 7, this.f16558v, false);
        AbstractC2552a.m12924m(parcel, 8, this.f16559w);
        AbstractC2552a.m12924m(parcel, 9, this.f16560x);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public MethodInvocation(int i11, int i12, int i13, long j11, long j12, String str, String str2, int i14, int i15) {
        this.f16552p = i11;
        this.f16553q = i12;
        this.f16554r = i13;
        this.f16555s = j11;
        this.f16556t = j12;
        this.f16557u = str;
        this.f16558v = str2;
        this.f16559w = i14;
        this.f16560x = i15;
    }
}
