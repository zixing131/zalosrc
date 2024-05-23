package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzccz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzccz> CREATOR = new jh0();

    /* renamed from: p */
    public final String f32016p;

    /* renamed from: q */
    public final String f32017q;

    public zzccz(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f32016p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f32017q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzccz(String str, String str2) {
        this.f32016p = str;
        this.f32017q = str2;
    }
}
