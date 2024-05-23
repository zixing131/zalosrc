package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class jq0 {

    /* renamed from: o */
    public static final Object f22926o = new Object();

    /* renamed from: p */
    private static final Object f22927p = new Object();

    /* renamed from: q */
    private static final C4330au f22928q;

    /* renamed from: r */
    public static final g94 f22929r;

    /* renamed from: a */
    public Object f22930a = f22926o;

    /* renamed from: b */
    public C4330au f22931b = f22928q;

    /* renamed from: c */
    public long f22932c;

    /* renamed from: d */
    public long f22933d;

    /* renamed from: e */
    public long f22934e;

    /* renamed from: f */
    public boolean f22935f;

    /* renamed from: g */
    public boolean f22936g;

    /* renamed from: h */
    public boolean f22937h;

    /* renamed from: i */
    public C4688kk f22938i;

    /* renamed from: j */
    public boolean f22939j;

    /* renamed from: k */
    public long f22940k;

    /* renamed from: l */
    public long f22941l;

    /* renamed from: m */
    public int f22942m;

    /* renamed from: n */
    public int f22943n;

    static {
        C4787n7 c4787n7 = new C4787n7();
        c4787n7.m24856a("androidx.media3.common.Timeline");
        c4787n7.m24857b(Uri.EMPTY);
        f22928q = c4787n7.m24858c();
        f22929r = new g94() { // from class: com.google.android.gms.internal.ads.ip0
        };
    }

    /* renamed from: a */
    public final jq0 m23720a(Object obj, C4330au c4330au, Object obj2, long j11, long j12, long j13, boolean z11, boolean z12, C4688kk c4688kk, long j14, long j15, int i11, int i12, long j16) {
        this.f22930a = obj;
        this.f22931b = c4330au != null ? c4330au : f22928q;
        this.f22932c = -9223372036854775807L;
        this.f22933d = -9223372036854775807L;
        this.f22934e = -9223372036854775807L;
        this.f22935f = z11;
        this.f22936g = z12;
        this.f22937h = c4688kk != null;
        this.f22938i = c4688kk;
        this.f22940k = 0L;
        this.f22941l = j15;
        this.f22942m = 0;
        this.f22943n = 0;
        this.f22939j = false;
        return this;
    }

    /* renamed from: b */
    public final boolean m23721b() {
        boolean z11;
        boolean z12;
        boolean z13 = this.f22937h;
        if (this.f22938i == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z13 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        v71.m27175f(z12);
        if (this.f22938i != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jq0.class.equals(obj.getClass())) {
            jq0 jq0Var = (jq0) obj;
            if (g92.m22362t(this.f22930a, jq0Var.f22930a) && g92.m22362t(this.f22931b, jq0Var.f22931b) && g92.m22362t(null, null) && g92.m22362t(this.f22938i, jq0Var.f22938i) && this.f22932c == jq0Var.f22932c && this.f22933d == jq0Var.f22933d && this.f22934e == jq0Var.f22934e && this.f22935f == jq0Var.f22935f && this.f22936g == jq0Var.f22936g && this.f22939j == jq0Var.f22939j && this.f22941l == jq0Var.f22941l && this.f22942m == jq0Var.f22942m && this.f22943n == jq0Var.f22943n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f22930a.hashCode() + 217) * 31) + this.f22931b.hashCode()) * 961;
        C4688kk c4688kk = this.f22938i;
        if (c4688kk == null) {
            hashCode = 0;
        } else {
            hashCode = c4688kk.hashCode();
        }
        long j11 = this.f22932c;
        long j12 = this.f22933d;
        long j13 = this.f22934e;
        boolean z11 = this.f22935f;
        boolean z12 = this.f22936g;
        boolean z13 = this.f22939j;
        long j14 = this.f22941l;
        return (((((((((((((((((((hashCode2 + hashCode) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 31) + (z13 ? 1 : 0)) * 961) + ((int) ((j14 >>> 32) ^ j14))) * 31) + this.f22942m) * 31) + this.f22943n) * 31;
    }
}
