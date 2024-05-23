package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzbrf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrf> CREATOR = new s50();

    /* renamed from: p */
    public final boolean f31907p;

    /* renamed from: q */
    public final String f31908q;

    /* renamed from: r */
    public final int f31909r;

    /* renamed from: s */
    public final byte[] f31910s;

    /* renamed from: t */
    public final String[] f31911t;

    /* renamed from: u */
    public final String[] f31912u;

    /* renamed from: v */
    public final boolean f31913v;

    /* renamed from: w */
    public final long f31914w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrf(boolean z11, String str, int i11, byte[] bArr, String[] strArr, String[] strArr2, boolean z12, long j11) {
        this.f31907p = z11;
        this.f31908q = str;
        this.f31909r = i11;
        this.f31910s = bArr;
        this.f31911t = strArr;
        this.f31912u = strArr2;
        this.f31913v = z12;
        this.f31914w = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12914c(parcel, 1, this.f31907p);
        AbstractC2552a.m12934w(parcel, 2, this.f31908q, false);
        AbstractC2552a.m12924m(parcel, 3, this.f31909r);
        AbstractC2552a.m12918g(parcel, 4, this.f31910s, false);
        AbstractC2552a.m12935x(parcel, 5, this.f31911t, false);
        AbstractC2552a.m12935x(parcel, 6, this.f31912u, false);
        AbstractC2552a.m12914c(parcel, 7, this.f31913v);
        AbstractC2552a.m12929r(parcel, 8, this.f31914w);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
