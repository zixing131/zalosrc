package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzcao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcao> CREATOR = new bf0();

    /* renamed from: A */
    public final Bundle f31938A;

    /* renamed from: B */
    public final int f31939B;

    /* renamed from: C */
    public final List f31940C;

    /* renamed from: D */
    public final Bundle f31941D;

    /* renamed from: E */
    public final boolean f31942E;

    /* renamed from: F */
    public final int f31943F;

    /* renamed from: G */
    public final int f31944G;

    /* renamed from: H */
    public final float f31945H;

    /* renamed from: I */
    public final String f31946I;

    /* renamed from: J */
    public final long f31947J;

    /* renamed from: K */
    public final String f31948K;

    /* renamed from: L */
    public final List f31949L;

    /* renamed from: M */
    public final String f31950M;

    /* renamed from: N */
    public final zzbls f31951N;

    /* renamed from: O */
    public final List f31952O;

    /* renamed from: P */
    public final long f31953P;

    /* renamed from: Q */
    public final String f31954Q;

    /* renamed from: R */
    public final float f31955R;

    /* renamed from: S */
    public final int f31956S;

    /* renamed from: T */
    public final int f31957T;

    /* renamed from: U */
    public final boolean f31958U;

    /* renamed from: V */
    public final String f31959V;

    /* renamed from: W */
    public final boolean f31960W;

    /* renamed from: X */
    public final String f31961X;

    /* renamed from: Y */
    public final boolean f31962Y;

    /* renamed from: Z */
    public final int f31963Z;

    /* renamed from: a0 */
    public final Bundle f31964a0;

    /* renamed from: b0 */
    public final String f31965b0;

    /* renamed from: c0 */
    public final zzdo f31966c0;

    /* renamed from: d0 */
    public final boolean f31967d0;

    /* renamed from: e0 */
    public final Bundle f31968e0;

    /* renamed from: f0 */
    public final String f31969f0;

    /* renamed from: g0 */
    public final String f31970g0;

    /* renamed from: h0 */
    public final String f31971h0;

    /* renamed from: i0 */
    public final boolean f31972i0;

    /* renamed from: j0 */
    public final List f31973j0;

    /* renamed from: k0 */
    public final String f31974k0;

    /* renamed from: l0 */
    public final List f31975l0;

    /* renamed from: m0 */
    public final int f31976m0;

    /* renamed from: n0 */
    public final boolean f31977n0;

    /* renamed from: o0 */
    public final boolean f31978o0;

    /* renamed from: p */
    public final int f31979p;

    /* renamed from: p0 */
    public final boolean f31980p0;

    /* renamed from: q */
    public final Bundle f31981q;

    /* renamed from: q0 */
    public final ArrayList f31982q0;

    /* renamed from: r */
    public final zzl f31983r;

    /* renamed from: r0 */
    public final String f31984r0;

    /* renamed from: s */
    public final zzq f31985s;

    /* renamed from: s0 */
    public final zzbsc f31986s0;

    /* renamed from: t */
    public final String f31987t;

    /* renamed from: t0 */
    public final String f31988t0;

    /* renamed from: u */
    public final ApplicationInfo f31989u;

    /* renamed from: u0 */
    public final Bundle f31990u0;

    /* renamed from: v */
    public final PackageInfo f31991v;

    /* renamed from: w */
    public final String f31992w;

    /* renamed from: x */
    public final String f31993x;

    /* renamed from: y */
    public final String f31994y;

    /* renamed from: z */
    public final zzcgv f31995z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcao(int i11, Bundle bundle, zzl zzlVar, zzq zzqVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzcgv zzcgvVar, Bundle bundle2, int i12, List list, Bundle bundle3, boolean z11, int i13, int i14, float f11, String str5, long j11, String str6, List list2, String str7, zzbls zzblsVar, List list3, long j12, String str8, float f12, boolean z12, int i15, int i16, boolean z13, String str9, String str10, boolean z14, int i17, Bundle bundle4, String str11, zzdo zzdoVar, boolean z15, Bundle bundle5, String str12, String str13, String str14, boolean z16, List list4, String str15, List list5, int i18, boolean z17, boolean z18, boolean z19, ArrayList arrayList, String str16, zzbsc zzbscVar, String str17, Bundle bundle6) {
        List unmodifiableList;
        List unmodifiableList2;
        this.f31979p = i11;
        this.f31981q = bundle;
        this.f31983r = zzlVar;
        this.f31985s = zzqVar;
        this.f31987t = str;
        this.f31989u = applicationInfo;
        this.f31991v = packageInfo;
        this.f31992w = str2;
        this.f31993x = str3;
        this.f31994y = str4;
        this.f31995z = zzcgvVar;
        this.f31938A = bundle2;
        this.f31939B = i12;
        this.f31940C = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.f31952O = unmodifiableList;
        this.f31941D = bundle3;
        this.f31942E = z11;
        this.f31943F = i13;
        this.f31944G = i14;
        this.f31945H = f11;
        this.f31946I = str5;
        this.f31947J = j11;
        this.f31948K = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.f31949L = unmodifiableList2;
        this.f31950M = str7;
        this.f31951N = zzblsVar;
        this.f31953P = j12;
        this.f31954Q = str8;
        this.f31955R = f12;
        this.f31960W = z12;
        this.f31956S = i15;
        this.f31957T = i16;
        this.f31958U = z13;
        this.f31959V = str9;
        this.f31961X = str10;
        this.f31962Y = z14;
        this.f31963Z = i17;
        this.f31964a0 = bundle4;
        this.f31965b0 = str11;
        this.f31966c0 = zzdoVar;
        this.f31967d0 = z15;
        this.f31968e0 = bundle5;
        this.f31969f0 = str12;
        this.f31970g0 = str13;
        this.f31971h0 = str14;
        this.f31972i0 = z16;
        this.f31973j0 = list4;
        this.f31974k0 = str15;
        this.f31975l0 = list5;
        this.f31976m0 = i18;
        this.f31977n0 = z17;
        this.f31978o0 = z18;
        this.f31980p0 = z19;
        this.f31982q0 = arrayList;
        this.f31984r0 = str16;
        this.f31986s0 = zzbscVar;
        this.f31988t0 = str17;
        this.f31990u0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f31979p);
        AbstractC2552a.m12916e(parcel, 2, this.f31981q, false);
        AbstractC2552a.m12932u(parcel, 3, this.f31983r, i11, false);
        AbstractC2552a.m12932u(parcel, 4, this.f31985s, i11, false);
        AbstractC2552a.m12934w(parcel, 5, this.f31987t, false);
        AbstractC2552a.m12932u(parcel, 6, this.f31989u, i11, false);
        AbstractC2552a.m12932u(parcel, 7, this.f31991v, i11, false);
        AbstractC2552a.m12934w(parcel, 8, this.f31992w, false);
        AbstractC2552a.m12934w(parcel, 9, this.f31993x, false);
        AbstractC2552a.m12934w(parcel, 10, this.f31994y, false);
        AbstractC2552a.m12932u(parcel, 11, this.f31995z, i11, false);
        AbstractC2552a.m12916e(parcel, 12, this.f31938A, false);
        AbstractC2552a.m12924m(parcel, 13, this.f31939B);
        AbstractC2552a.m12936y(parcel, 14, this.f31940C, false);
        AbstractC2552a.m12916e(parcel, 15, this.f31941D, false);
        AbstractC2552a.m12914c(parcel, 16, this.f31942E);
        AbstractC2552a.m12924m(parcel, 18, this.f31943F);
        AbstractC2552a.m12924m(parcel, 19, this.f31944G);
        AbstractC2552a.m12921j(parcel, 20, this.f31945H);
        AbstractC2552a.m12934w(parcel, 21, this.f31946I, false);
        AbstractC2552a.m12929r(parcel, 25, this.f31947J);
        AbstractC2552a.m12934w(parcel, 26, this.f31948K, false);
        AbstractC2552a.m12936y(parcel, 27, this.f31949L, false);
        AbstractC2552a.m12934w(parcel, 28, this.f31950M, false);
        AbstractC2552a.m12932u(parcel, 29, this.f31951N, i11, false);
        AbstractC2552a.m12936y(parcel, 30, this.f31952O, false);
        AbstractC2552a.m12929r(parcel, 31, this.f31953P);
        AbstractC2552a.m12934w(parcel, 33, this.f31954Q, false);
        AbstractC2552a.m12921j(parcel, 34, this.f31955R);
        AbstractC2552a.m12924m(parcel, 35, this.f31956S);
        AbstractC2552a.m12924m(parcel, 36, this.f31957T);
        AbstractC2552a.m12914c(parcel, 37, this.f31958U);
        AbstractC2552a.m12934w(parcel, 39, this.f31959V, false);
        AbstractC2552a.m12914c(parcel, 40, this.f31960W);
        AbstractC2552a.m12934w(parcel, 41, this.f31961X, false);
        AbstractC2552a.m12914c(parcel, 42, this.f31962Y);
        AbstractC2552a.m12924m(parcel, 43, this.f31963Z);
        AbstractC2552a.m12916e(parcel, 44, this.f31964a0, false);
        AbstractC2552a.m12934w(parcel, 45, this.f31965b0, false);
        AbstractC2552a.m12932u(parcel, 46, this.f31966c0, i11, false);
        AbstractC2552a.m12914c(parcel, 47, this.f31967d0);
        AbstractC2552a.m12916e(parcel, 48, this.f31968e0, false);
        AbstractC2552a.m12934w(parcel, 49, this.f31969f0, false);
        AbstractC2552a.m12934w(parcel, 50, this.f31970g0, false);
        AbstractC2552a.m12934w(parcel, 51, this.f31971h0, false);
        AbstractC2552a.m12914c(parcel, 52, this.f31972i0);
        AbstractC2552a.m12926o(parcel, 53, this.f31973j0, false);
        AbstractC2552a.m12934w(parcel, 54, this.f31974k0, false);
        AbstractC2552a.m12936y(parcel, 55, this.f31975l0, false);
        AbstractC2552a.m12924m(parcel, 56, this.f31976m0);
        AbstractC2552a.m12914c(parcel, 57, this.f31977n0);
        AbstractC2552a.m12914c(parcel, 58, this.f31978o0);
        AbstractC2552a.m12914c(parcel, 59, this.f31980p0);
        AbstractC2552a.m12936y(parcel, 60, this.f31982q0, false);
        AbstractC2552a.m12934w(parcel, 61, this.f31984r0, false);
        AbstractC2552a.m12932u(parcel, 63, this.f31986s0, i11, false);
        AbstractC2552a.m12934w(parcel, 64, this.f31988t0, false);
        AbstractC2552a.m12916e(parcel, 65, this.f31990u0, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
