package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbz> CREATOR = new kg0();

    /* renamed from: p */
    public final zzl f32012p;

    /* renamed from: q */
    public final String f32013q;

    public zzcbz(zzl zzlVar, String str) {
        this.f32012p = zzlVar;
        this.f32013q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12932u(parcel, 2, this.f32012p, i11, false);
        AbstractC2552a.m12934w(parcel, 3, this.f32013q, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
