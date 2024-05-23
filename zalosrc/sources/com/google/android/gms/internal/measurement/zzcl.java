package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C5536p1();

    /* renamed from: p */
    public final long f32973p;

    /* renamed from: q */
    public final long f32974q;

    /* renamed from: r */
    public final boolean f32975r;

    /* renamed from: s */
    public final String f32976s;

    /* renamed from: t */
    public final String f32977t;

    /* renamed from: u */
    public final String f32978u;

    /* renamed from: v */
    public final Bundle f32979v;

    /* renamed from: w */
    public final String f32980w;

    public zzcl(long j11, long j12, boolean z11, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f32973p = j11;
        this.f32974q = j12;
        this.f32975r = z11;
        this.f32976s = str;
        this.f32977t = str2;
        this.f32978u = str3;
        this.f32979v = bundle;
        this.f32980w = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12929r(parcel, 1, this.f32973p);
        AbstractC2552a.m12929r(parcel, 2, this.f32974q);
        AbstractC2552a.m12914c(parcel, 3, this.f32975r);
        AbstractC2552a.m12934w(parcel, 4, this.f32976s, false);
        AbstractC2552a.m12934w(parcel, 5, this.f32977t, false);
        AbstractC2552a.m12934w(parcel, 6, this.f32978u, false);
        AbstractC2552a.m12916e(parcel, 7, this.f32979v, false);
        AbstractC2552a.m12934w(parcel, 8, this.f32980w, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
