package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    /* renamed from: p */
    private final int f16022p;

    /* renamed from: q */
    public final String f16023q;

    /* renamed from: r */
    public final int f16024r;

    /* renamed from: s */
    public final long f16025s;

    /* renamed from: t */
    public final byte[] f16026t;

    /* renamed from: u */
    private Bundle f16027u;
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C4036a();

    /* renamed from: v */
    public static final int f16017v = 0;

    /* renamed from: w */
    public static final int f16018w = 1;

    /* renamed from: x */
    public static final int f16019x = 2;

    /* renamed from: y */
    public static final int f16020y = 3;

    /* renamed from: z */
    public static final int f16021z = 4;

    /* renamed from: A */
    public static final int f16013A = 5;

    /* renamed from: B */
    public static final int f16014B = 6;

    /* renamed from: C */
    public static final int f16015C = 7;

    /* renamed from: D */
    public static final int f16016D = 7;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyRequest(int i11, String str, int i12, long j11, byte[] bArr, Bundle bundle) {
        this.f16022p = i11;
        this.f16023q = str;
        this.f16024r = i12;
        this.f16025s = j11;
        this.f16026t = bArr;
        this.f16027u = bundle;
    }

    public String toString() {
        String str = this.f16023q;
        int i11 = this.f16024r;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 42);
        sb2.append("ProxyRequest[ url: ");
        sb2.append(str);
        sb2.append(", method: ");
        sb2.append(i11);
        sb2.append(" ]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f16023q, false);
        AbstractC2552a.m12924m(parcel, 2, this.f16024r);
        AbstractC2552a.m12929r(parcel, 3, this.f16025s);
        AbstractC2552a.m12918g(parcel, 4, this.f16026t, false);
        AbstractC2552a.m12916e(parcel, 5, this.f16027u, false);
        AbstractC2552a.m12924m(parcel, 1000, this.f16022p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
