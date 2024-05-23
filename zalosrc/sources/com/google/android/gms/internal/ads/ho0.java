package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ho0 {

    /* renamed from: h */
    public static final g94 f21852h = new g94() { // from class: com.google.android.gms.internal.ads.hn0
    };

    /* renamed from: a */
    public Object f21853a;

    /* renamed from: b */
    public Object f21854b;

    /* renamed from: c */
    public int f21855c;

    /* renamed from: d */
    public long f21856d;

    /* renamed from: e */
    public long f21857e;

    /* renamed from: f */
    public boolean f21858f;

    /* renamed from: g */
    private r41 f21859g = r41.f27076d;

    /* renamed from: a */
    public final int m22979a(int i11) {
        return this.f21859g.m25957a(i11).f24484b;
    }

    /* renamed from: b */
    public final int m22980b() {
        int i11 = this.f21859g.f27079a;
        return 0;
    }

    /* renamed from: c */
    public final int m22981c(long j11) {
        return -1;
    }

    /* renamed from: d */
    public final int m22982d(long j11) {
        return -1;
    }

    /* renamed from: e */
    public final int m22983e(int i11) {
        return this.f21859g.m25957a(i11).m24552a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ho0.class.equals(obj.getClass())) {
            ho0 ho0Var = (ho0) obj;
            if (g92.m22362t(this.f21853a, ho0Var.f21853a) && g92.m22362t(this.f21854b, ho0Var.f21854b) && this.f21855c == ho0Var.f21855c && this.f21856d == ho0Var.f21856d && this.f21858f == ho0Var.f21858f && g92.m22362t(this.f21859g, ho0Var.f21859g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m22984f(int i11, int i12) {
        return this.f21859g.m25957a(i11).m24552a(i12);
    }

    /* renamed from: g */
    public final long m22985g(int i11, int i12) {
        me0 m25957a = this.f21859g.m25957a(i11);
        if (m25957a.f24484b != -1) {
            return m25957a.f24487e[i12];
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final long m22986h(int i11) {
        long j11 = this.f21859g.m25957a(i11).f24483a;
        return 0L;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f21853a;
        int i11 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i12 = (hashCode + 217) * 31;
        Object obj2 = this.f21854b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        int i13 = this.f21855c;
        long j11 = this.f21856d;
        return ((((((((i12 + i11) * 31) + i13) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 961) + (this.f21858f ? 1 : 0)) * 31) + this.f21859g.hashCode();
    }

    /* renamed from: i */
    public final long m22987i() {
        long j11 = this.f21859g.f27080b;
        return 0L;
    }

    /* renamed from: j */
    public final long m22988j(int i11) {
        long j11 = this.f21859g.m25957a(i11).f24488f;
        return 0L;
    }

    /* renamed from: k */
    public final ho0 m22989k(Object obj, Object obj2, int i11, long j11, long j12, r41 r41Var, boolean z11) {
        this.f21853a = obj;
        this.f21854b = obj2;
        this.f21855c = 0;
        this.f21856d = j11;
        this.f21857e = 0L;
        this.f21859g = r41Var;
        this.f21858f = z11;
        return this;
    }

    /* renamed from: l */
    public final boolean m22990l(int i11) {
        boolean z11 = this.f21859g.m25957a(i11).f24489g;
        return false;
    }
}
