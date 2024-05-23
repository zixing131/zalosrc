package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbc> CREATOR = new nf0();

    /* renamed from: p */
    public final Bundle f32001p;

    /* renamed from: q */
    public final zzcgv f32002q;

    /* renamed from: r */
    public final ApplicationInfo f32003r;

    /* renamed from: s */
    public final String f32004s;

    /* renamed from: t */
    public final List f32005t;

    /* renamed from: u */
    public final PackageInfo f32006u;

    /* renamed from: v */
    public final String f32007v;

    /* renamed from: w */
    public final String f32008w;

    /* renamed from: x */
    public zzffx f32009x;

    /* renamed from: y */
    public String f32010y;

    /* renamed from: z */
    public final boolean f32011z;

    public zzcbc(Bundle bundle, zzcgv zzcgvVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzffx zzffxVar, String str4, boolean z11) {
        this.f32001p = bundle;
        this.f32002q = zzcgvVar;
        this.f32004s = str;
        this.f32003r = applicationInfo;
        this.f32005t = list;
        this.f32006u = packageInfo;
        this.f32007v = str2;
        this.f32008w = str3;
        this.f32009x = zzffxVar;
        this.f32010y = str4;
        this.f32011z = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12916e(parcel, 1, this.f32001p, false);
        AbstractC2552a.m12932u(parcel, 2, this.f32002q, i11, false);
        AbstractC2552a.m12932u(parcel, 3, this.f32003r, i11, false);
        AbstractC2552a.m12934w(parcel, 4, this.f32004s, false);
        AbstractC2552a.m12936y(parcel, 5, this.f32005t, false);
        AbstractC2552a.m12932u(parcel, 6, this.f32006u, i11, false);
        AbstractC2552a.m12934w(parcel, 7, this.f32007v, false);
        AbstractC2552a.m12934w(parcel, 9, this.f32008w, false);
        AbstractC2552a.m12932u(parcel, 10, this.f32009x, i11, false);
        AbstractC2552a.m12934w(parcel, 11, this.f32010y, false);
        AbstractC2552a.m12914c(parcel, 12, this.f32011z);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
