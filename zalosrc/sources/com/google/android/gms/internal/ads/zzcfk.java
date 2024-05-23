package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcfk> CREATOR = new uj0();

    /* renamed from: p */
    public final String f32026p;

    /* renamed from: q */
    public final String f32027q;

    /* renamed from: r */
    public final zzq f32028r;

    /* renamed from: s */
    public final zzl f32029s;

    public zzcfk(String str, String str2, zzq zzqVar, zzl zzlVar) {
        this.f32026p = str;
        this.f32027q = str2;
        this.f32028r = zzqVar;
        this.f32029s = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f32026p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f32027q, false);
        AbstractC2552a.m12932u(parcel, 3, this.f32028r, i11, false);
        AbstractC2552a.m12932u(parcel, 4, this.f32029s, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
