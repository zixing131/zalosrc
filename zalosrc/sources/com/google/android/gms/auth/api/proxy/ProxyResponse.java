package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C4037b();

    /* renamed from: p */
    private final int f16028p;

    /* renamed from: q */
    public final int f16029q;

    /* renamed from: r */
    public final PendingIntent f16030r;

    /* renamed from: s */
    public final int f16031s;

    /* renamed from: t */
    private final Bundle f16032t;

    /* renamed from: u */
    public final byte[] f16033u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyResponse(int i11, int i12, PendingIntent pendingIntent, int i13, Bundle bundle, byte[] bArr) {
        this.f16028p = i11;
        this.f16029q = i12;
        this.f16031s = i13;
        this.f16032t = bundle;
        this.f16033u = bArr;
        this.f16030r = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16029q);
        AbstractC2552a.m12932u(parcel, 2, this.f16030r, i11, false);
        AbstractC2552a.m12924m(parcel, 3, this.f16031s);
        AbstractC2552a.m12916e(parcel, 4, this.f16032t, false);
        AbstractC2552a.m12918g(parcel, 5, this.f16033u, false);
        AbstractC2552a.m12924m(parcel, 1000, this.f16028p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
