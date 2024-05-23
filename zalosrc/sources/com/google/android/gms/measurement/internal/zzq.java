package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p031b5.AbstractC2552a;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C6176w9();

    /* renamed from: A */
    public final long f34687A;

    /* renamed from: B */
    public final long f34688B;

    /* renamed from: C */
    public final int f34689C;

    /* renamed from: D */
    public final boolean f34690D;

    /* renamed from: E */
    public final boolean f34691E;

    /* renamed from: F */
    public final String f34692F;

    /* renamed from: G */
    public final Boolean f34693G;

    /* renamed from: H */
    public final long f34694H;

    /* renamed from: I */
    public final List f34695I;

    /* renamed from: J */
    public final String f34696J;

    /* renamed from: K */
    public final String f34697K;

    /* renamed from: L */
    public final String f34698L;

    /* renamed from: M */
    public final String f34699M;

    /* renamed from: N */
    public final boolean f34700N;

    /* renamed from: O */
    public final long f34701O;

    /* renamed from: p */
    public final String f34702p;

    /* renamed from: q */
    public final String f34703q;

    /* renamed from: r */
    public final String f34704r;

    /* renamed from: s */
    public final String f34705s;

    /* renamed from: t */
    public final long f34706t;

    /* renamed from: u */
    public final long f34707u;

    /* renamed from: v */
    public final String f34708v;

    /* renamed from: w */
    public final boolean f34709w;

    /* renamed from: x */
    public final boolean f34710x;

    /* renamed from: y */
    public final long f34711y;

    /* renamed from: z */
    public final String f34712z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(String str, String str2, String str3, long j11, String str4, long j12, long j13, String str5, boolean z11, boolean z12, String str6, long j14, long j15, int i11, boolean z13, boolean z14, String str7, Boolean bool, long j16, List list, String str8, String str9, String str10, String str11, boolean z15, long j17) {
        AbstractC4205o.m19718g(str);
        this.f34702p = str;
        this.f34703q = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f34704r = str3;
        this.f34711y = j11;
        this.f34705s = str4;
        this.f34706t = j12;
        this.f34707u = j13;
        this.f34708v = str5;
        this.f34709w = z11;
        this.f34710x = z12;
        this.f34712z = str6;
        this.f34687A = 0L;
        this.f34688B = j15;
        this.f34689C = i11;
        this.f34690D = z13;
        this.f34691E = z14;
        this.f34692F = str7;
        this.f34693G = bool;
        this.f34694H = j16;
        this.f34695I = list;
        this.f34696J = null;
        this.f34697K = str9;
        this.f34698L = str10;
        this.f34699M = str11;
        this.f34700N = z15;
        this.f34701O = j17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.f34702p, false);
        AbstractC2552a.m12934w(parcel, 3, this.f34703q, false);
        AbstractC2552a.m12934w(parcel, 4, this.f34704r, false);
        AbstractC2552a.m12934w(parcel, 5, this.f34705s, false);
        AbstractC2552a.m12929r(parcel, 6, this.f34706t);
        AbstractC2552a.m12929r(parcel, 7, this.f34707u);
        AbstractC2552a.m12934w(parcel, 8, this.f34708v, false);
        AbstractC2552a.m12914c(parcel, 9, this.f34709w);
        AbstractC2552a.m12914c(parcel, 10, this.f34710x);
        AbstractC2552a.m12929r(parcel, 11, this.f34711y);
        AbstractC2552a.m12934w(parcel, 12, this.f34712z, false);
        AbstractC2552a.m12929r(parcel, 13, this.f34687A);
        AbstractC2552a.m12929r(parcel, 14, this.f34688B);
        AbstractC2552a.m12924m(parcel, 15, this.f34689C);
        AbstractC2552a.m12914c(parcel, 16, this.f34690D);
        AbstractC2552a.m12914c(parcel, 18, this.f34691E);
        AbstractC2552a.m12934w(parcel, 19, this.f34692F, false);
        AbstractC2552a.m12915d(parcel, 21, this.f34693G, false);
        AbstractC2552a.m12929r(parcel, 22, this.f34694H);
        AbstractC2552a.m12936y(parcel, 23, this.f34695I, false);
        AbstractC2552a.m12934w(parcel, 24, this.f34696J, false);
        AbstractC2552a.m12934w(parcel, 25, this.f34697K, false);
        AbstractC2552a.m12934w(parcel, 26, this.f34698L, false);
        AbstractC2552a.m12934w(parcel, 27, this.f34699M, false);
        AbstractC2552a.m12914c(parcel, 28, this.f34700N);
        AbstractC2552a.m12929r(parcel, 29, this.f34701O);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(String str, String str2, String str3, String str4, long j11, long j12, String str5, boolean z11, boolean z12, long j13, String str6, long j14, long j15, int i11, boolean z13, boolean z14, String str7, Boolean bool, long j16, List list, String str8, String str9, String str10, String str11, boolean z15, long j17) {
        this.f34702p = str;
        this.f34703q = str2;
        this.f34704r = str3;
        this.f34711y = j13;
        this.f34705s = str4;
        this.f34706t = j11;
        this.f34707u = j12;
        this.f34708v = str5;
        this.f34709w = z11;
        this.f34710x = z12;
        this.f34712z = str6;
        this.f34687A = j14;
        this.f34688B = j15;
        this.f34689C = i11;
        this.f34690D = z13;
        this.f34691E = z14;
        this.f34692F = str7;
        this.f34693G = bool;
        this.f34694H = j16;
        this.f34695I = list;
        this.f34696J = str8;
        this.f34697K = str9;
        this.f34698L = str10;
        this.f34699M = str11;
        this.f34700N = z15;
        this.f34701O = j17;
    }
}
