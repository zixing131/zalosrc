package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class n34 {

    /* renamed from: a */
    private final ho0 f24999a = new ho0();

    /* renamed from: b */
    private final jq0 f25000b = new jq0();

    /* renamed from: c */
    private final r44 f25001c;

    /* renamed from: d */
    private final Handler f25002d;

    /* renamed from: e */
    private long f25003e;

    /* renamed from: f */
    private int f25004f;

    /* renamed from: g */
    private boolean f25005g;

    /* renamed from: h */
    private k34 f25006h;

    /* renamed from: i */
    private k34 f25007i;

    /* renamed from: j */
    private k34 f25008j;

    /* renamed from: k */
    private int f25009k;

    /* renamed from: l */
    private Object f25010l;

    /* renamed from: m */
    private long f25011m;

    public n34(r44 r44Var, Handler handler) {
        this.f25001c = r44Var;
        this.f25002d = handler;
    }

    /* renamed from: A */
    private static gf4 m24811A(mr0 mr0Var, Object obj, long j11, long j12, jq0 jq0Var, ho0 ho0Var) {
        mr0Var.mo23650n(obj, ho0Var);
        mr0Var.mo20109e(ho0Var.f21855c, jq0Var, 0L);
        mr0Var.mo20105a(obj);
        if (ho0Var.f21856d == 0) {
            ho0Var.m22980b();
        }
        mr0Var.mo23650n(obj, ho0Var);
        int m22982d = ho0Var.m22982d(j11);
        if (m22982d == -1) {
            return new gf4(obj, j12, ho0Var.m22981c(j11));
        }
        return new gf4(obj, m22982d, ho0Var.m22983e(m22982d), j12);
    }

    /* renamed from: B */
    private final void m24812B() {
        gf4 gf4Var;
        z73 m20826p = c83.m20826p();
        for (k34 k34Var = this.f25006h; k34Var != null; k34Var = k34Var.m23821g()) {
            m20826p.m28452f(k34Var.f23130f.f23712a);
        }
        k34 k34Var2 = this.f25007i;
        if (k34Var2 == null) {
            gf4Var = null;
        } else {
            gf4Var = k34Var2.f23130f.f23712a;
        }
        this.f25002d.post(new Runnable() { // from class: com.google.android.gms.internal.ads.m34

            /* renamed from: q */
            public final /* synthetic */ z73 f24363q;

            /* renamed from: r */
            public final /* synthetic */ gf4 f24364r;

            public /* synthetic */ m34(z73 m20826p2, gf4 gf4Var2) {
                r2 = m20826p2;
                r3 = gf4Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n34.this.m24831m(r2, r3);
            }
        });
    }

    /* renamed from: C */
    private final boolean m24813C(mr0 mr0Var, gf4 gf4Var, boolean z11) {
        int mo20105a = mr0Var.mo20105a(gf4Var.f20363a);
        if (mr0Var.mo20109e(mr0Var.mo20108d(mo20105a, this.f24999a, false).f21855c, this.f25000b, 0L).f22936g || mr0Var.m24697i(mo20105a, this.f24999a, this.f25000b, this.f25004f, this.f25005g) != -1 || !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m24814a(mr0 mr0Var, gf4 gf4Var) {
        if (!m24816c(gf4Var)) {
            return false;
        }
        int i11 = mr0Var.mo23650n(gf4Var.f20363a, this.f24999a).f21855c;
        if (mr0Var.mo20109e(i11, this.f25000b, 0L).f22943n != mr0Var.mo20105a(gf4Var.f20363a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m24815b(mr0 mr0Var) {
        k34 k34Var = this.f25006h;
        if (k34Var == null) {
            return true;
        }
        int mo20105a = mr0Var.mo20105a(k34Var.f23126b);
        while (true) {
            mo20105a = mr0Var.m24697i(mo20105a, this.f24999a, this.f25000b, this.f25004f, this.f25005g);
            while (k34Var.m23821g() != null && !k34Var.f23130f.f23718g) {
                k34Var = k34Var.m23821g();
            }
            k34 m23821g = k34Var.m23821g();
            if (mo20105a == -1 || m23821g == null || mr0Var.mo20105a(m23821g.f23126b) != mo20105a) {
                break;
            }
            k34Var = m23821g;
        }
        boolean m24834p = m24834p(k34Var);
        k34Var.f23130f = m24828j(mr0Var, k34Var.f23130f);
        if (!m24834p) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m24816c(gf4 gf4Var) {
        return !gf4Var.m22262b() && gf4Var.f20367e == -1;
    }

    /* renamed from: v */
    private final long m24817v(mr0 mr0Var, Object obj, int i11) {
        mr0Var.mo23650n(obj, this.f24999a);
        this.f24999a.m22986h(i11);
        this.f24999a.m22988j(i11);
        return 0L;
    }

    /* renamed from: w */
    private final l34 m24818w(mr0 mr0Var, k34 k34Var, long j11) {
        long j12;
        l34 l34Var = k34Var.f23130f;
        long m23819e = (k34Var.m23819e() + l34Var.f23716e) - j11;
        if (l34Var.f23718g) {
            long j13 = 0;
            int m24697i = mr0Var.m24697i(mr0Var.mo20105a(l34Var.f23712a.f20363a), this.f24999a, this.f25000b, this.f25004f, this.f25005g);
            if (m24697i == -1) {
                return null;
            }
            int i11 = mr0Var.mo20108d(m24697i, this.f24999a, true).f21855c;
            Object obj = this.f24999a.f21854b;
            obj.getClass();
            long j14 = l34Var.f23712a.f20366d;
            if (mr0Var.mo20109e(i11, this.f25000b, 0L).f22942m == m24697i) {
                Pair m24699m = mr0Var.m24699m(this.f25000b, this.f24999a, i11, -9223372036854775807L, Math.max(0L, m23819e));
                if (m24699m == null) {
                    return null;
                }
                obj = m24699m.first;
                long longValue = ((Long) m24699m.second).longValue();
                k34 m23821g = k34Var.m23821g();
                if (m23821g != null && m23821g.f23126b.equals(obj)) {
                    j14 = m23821g.f23130f.f23712a.f20366d;
                } else {
                    j14 = this.f25003e;
                    this.f25003e = 1 + j14;
                }
                j12 = longValue;
                j13 = -9223372036854775807L;
            } else {
                j12 = 0;
            }
            gf4 m24811A = m24811A(mr0Var, obj, j12, j14, this.f25000b, this.f24999a);
            if (j13 != -9223372036854775807L && l34Var.f23714c != -9223372036854775807L) {
                mr0Var.mo23650n(l34Var.f23712a.f20363a, this.f24999a).m22980b();
            }
            return m24819x(mr0Var, m24811A, j13, j12);
        }
        gf4 gf4Var = l34Var.f23712a;
        mr0Var.mo23650n(gf4Var.f20363a, this.f24999a);
        if (gf4Var.m22262b()) {
            int i12 = gf4Var.f20364b;
            if (this.f24999a.m22979a(i12) == -1) {
                return null;
            }
            int m22984f = this.f24999a.m22984f(i12, gf4Var.f20365c);
            if (m22984f < 0) {
                return m24820y(mr0Var, gf4Var.f20363a, i12, m22984f, l34Var.f23714c, gf4Var.f20366d);
            }
            long j15 = l34Var.f23714c;
            if (j15 == -9223372036854775807L) {
                jq0 jq0Var = this.f25000b;
                ho0 ho0Var = this.f24999a;
                Pair m24699m2 = mr0Var.m24699m(jq0Var, ho0Var, ho0Var.f21855c, -9223372036854775807L, Math.max(0L, m23819e));
                if (m24699m2 == null) {
                    return null;
                }
                j15 = ((Long) m24699m2.second).longValue();
            }
            m24817v(mr0Var, gf4Var.f20363a, gf4Var.f20364b);
            return m24821z(mr0Var, gf4Var.f20363a, Math.max(0L, j15), l34Var.f23714c, gf4Var.f20366d);
        }
        int m22983e = this.f24999a.m22983e(gf4Var.f20367e);
        this.f24999a.m22990l(gf4Var.f20367e);
        if (m22983e != this.f24999a.m22979a(gf4Var.f20367e)) {
            return m24820y(mr0Var, gf4Var.f20363a, gf4Var.f20367e, m22983e, l34Var.f23716e, gf4Var.f20366d);
        }
        m24817v(mr0Var, gf4Var.f20363a, gf4Var.f20367e);
        return m24821z(mr0Var, gf4Var.f20363a, 0L, l34Var.f23716e, gf4Var.f20366d);
    }

    /* renamed from: x */
    private final l34 m24819x(mr0 mr0Var, gf4 gf4Var, long j11, long j12) {
        mr0Var.mo23650n(gf4Var.f20363a, this.f24999a);
        if (gf4Var.m22262b()) {
            return m24820y(mr0Var, gf4Var.f20363a, gf4Var.f20364b, gf4Var.f20365c, j11, gf4Var.f20366d);
        }
        return m24821z(mr0Var, gf4Var.f20363a, j12, j11, gf4Var.f20366d);
    }

    /* renamed from: y */
    private final l34 m24820y(mr0 mr0Var, Object obj, int i11, int i12, long j11, long j12) {
        gf4 gf4Var = new gf4(obj, i11, i12, j12);
        long m22985g = mr0Var.mo23650n(gf4Var.f20363a, this.f24999a).m22985g(gf4Var.f20364b, gf4Var.f20365c);
        if (i12 == this.f24999a.m22983e(i11)) {
            this.f24999a.m22987i();
        }
        this.f24999a.m22990l(gf4Var.f20364b);
        long j13 = 0;
        if (m22985g != -9223372036854775807L && m22985g <= 0) {
            j13 = Math.max(0L, (-1) + m22985g);
        }
        return new l34(gf4Var, j13, j11, -9223372036854775807L, m22985g, false, false, false, false);
    }

    /* renamed from: z */
    private final l34 m24821z(mr0 mr0Var, Object obj, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17 = j11;
        mr0Var.mo23650n(obj, this.f24999a);
        int m22981c = this.f24999a.m22981c(j17);
        if (m22981c == -1) {
            this.f24999a.m22980b();
        } else {
            this.f24999a.m22990l(m22981c);
        }
        gf4 gf4Var = new gf4(obj, j13, m22981c);
        boolean m24816c = m24816c(gf4Var);
        boolean m24814a = m24814a(mr0Var, gf4Var);
        boolean m24813C = m24813C(mr0Var, gf4Var, m24816c);
        if (m22981c != -1) {
            this.f24999a.m22990l(m22981c);
        }
        if (m22981c != -1) {
            this.f24999a.m22986h(m22981c);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L) {
            j16 = j14;
            j15 = j16;
        } else {
            j15 = this.f24999a.f21856d;
            j16 = -9223372036854775807L;
        }
        if (j15 != -9223372036854775807L && j17 >= j15) {
            j17 = Math.max(0L, j15 - 1);
        }
        return new l34(gf4Var, j17, j12, j16, j15, false, m24816c, m24814a, m24813C);
    }

    /* renamed from: d */
    public final k34 m24822d() {
        k34 k34Var = this.f25006h;
        if (k34Var == null) {
            return null;
        }
        if (k34Var == this.f25007i) {
            this.f25007i = k34Var.m23821g();
        }
        k34Var.m23828n();
        int i11 = this.f25009k - 1;
        this.f25009k = i11;
        if (i11 == 0) {
            this.f25008j = null;
            k34 k34Var2 = this.f25006h;
            this.f25010l = k34Var2.f23126b;
            this.f25011m = k34Var2.f23130f.f23712a.f20366d;
        }
        this.f25006h = this.f25006h.m23821g();
        m24812B();
        return this.f25006h;
    }

    /* renamed from: e */
    public final k34 m24823e() {
        k34 k34Var = this.f25007i;
        boolean z11 = false;
        if (k34Var != null && k34Var.m23821g() != null) {
            z11 = true;
        }
        v71.m27175f(z11);
        this.f25007i = this.f25007i.m23821g();
        m24812B();
        return this.f25007i;
    }

    /* renamed from: f */
    public final k34 m24824f() {
        return this.f25008j;
    }

    /* renamed from: g */
    public final k34 m24825g() {
        return this.f25006h;
    }

    /* renamed from: h */
    public final k34 m24826h() {
        return this.f25007i;
    }

    /* renamed from: i */
    public final l34 m24827i(long j11, v34 v34Var) {
        k34 k34Var = this.f25008j;
        if (k34Var == null) {
            return m24819x(v34Var.f29164a, v34Var.f29165b, v34Var.f29166c, v34Var.f29181r);
        }
        return m24818w(v34Var.f29164a, k34Var, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l34 m24828j(mr0 mr0Var, l34 l34Var) {
        long j11;
        long j12;
        long j13;
        long j14;
        int i11;
        gf4 gf4Var = l34Var.f23712a;
        boolean m24816c = m24816c(gf4Var);
        boolean m24814a = m24814a(mr0Var, gf4Var);
        boolean m24813C = m24813C(mr0Var, gf4Var, m24816c);
        mr0Var.mo23650n(l34Var.f23712a.f20363a, this.f24999a);
        if (gf4Var.m22262b() || (i11 = gf4Var.f20367e) == -1) {
            j11 = -9223372036854775807L;
        } else {
            this.f24999a.m22986h(i11);
            j11 = 0;
        }
        if (gf4Var.m22262b()) {
            j12 = this.f24999a.m22985g(gf4Var.f20364b, gf4Var.f20365c);
        } else {
            if (j11 != -9223372036854775807L) {
                j13 = 0;
                j14 = 0;
                if (!gf4Var.m22262b()) {
                    this.f24999a.m22990l(gf4Var.f20364b);
                } else {
                    int i12 = gf4Var.f20367e;
                    if (i12 != -1) {
                        this.f24999a.m22990l(i12);
                    }
                }
                return new l34(gf4Var, l34Var.f23713b, l34Var.f23714c, j13, j14, false, m24816c, m24814a, m24813C);
            }
            j12 = this.f24999a.f21856d;
        }
        j13 = j11;
        j14 = j12;
        if (!gf4Var.m22262b()) {
        }
        return new l34(gf4Var, l34Var.f23713b, l34Var.f23714c, j13, j14, false, m24816c, m24814a, m24813C);
    }

    /* renamed from: k */
    public final gf4 m24829k(mr0 mr0Var, Object obj, long j11) {
        long j12;
        int mo20105a;
        int i11 = mr0Var.mo23650n(obj, this.f24999a).f21855c;
        Object obj2 = this.f25010l;
        if (obj2 != null && (mo20105a = mr0Var.mo20105a(obj2)) != -1 && mr0Var.mo20108d(mo20105a, this.f24999a, false).f21855c == i11) {
            j12 = this.f25011m;
        } else {
            k34 k34Var = this.f25006h;
            while (true) {
                if (k34Var != null) {
                    if (k34Var.f23126b.equals(obj)) {
                        j12 = k34Var.f23130f.f23712a.f20366d;
                        break;
                    }
                    k34Var = k34Var.m23821g();
                } else {
                    k34 k34Var2 = this.f25006h;
                    while (true) {
                        if (k34Var2 != null) {
                            int mo20105a2 = mr0Var.mo20105a(k34Var2.f23126b);
                            if (mo20105a2 != -1 && mr0Var.mo20108d(mo20105a2, this.f24999a, false).f21855c == i11) {
                                j12 = k34Var2.f23130f.f23712a.f20366d;
                                break;
                            }
                            k34Var2 = k34Var2.m23821g();
                        } else {
                            j12 = this.f25003e;
                            this.f25003e = 1 + j12;
                            if (this.f25006h == null) {
                                this.f25010l = obj;
                                this.f25011m = j12;
                            }
                        }
                    }
                }
            }
        }
        long j13 = j12;
        mr0Var.mo23650n(obj, this.f24999a);
        mr0Var.mo20109e(this.f24999a.f21855c, this.f25000b, 0L);
        int mo20105a3 = mr0Var.mo20105a(obj);
        Object obj3 = obj;
        while (true) {
            jq0 jq0Var = this.f25000b;
            if (mo20105a3 >= jq0Var.f22942m) {
                mr0Var.mo20108d(mo20105a3, this.f24999a, true);
                this.f24999a.m22980b();
                ho0 ho0Var = this.f24999a;
                if (ho0Var.m22982d(ho0Var.f21856d) != -1) {
                    obj3 = this.f24999a.f21854b;
                    obj3.getClass();
                }
                mo20105a3--;
            } else {
                return m24811A(mr0Var, obj3, j11, j13, jq0Var, this.f24999a);
            }
        }
    }

    /* renamed from: l */
    public final void m24830l() {
        if (this.f25009k == 0) {
            return;
        }
        k34 k34Var = this.f25006h;
        v71.m27171b(k34Var);
        this.f25010l = k34Var.f23126b;
        this.f25011m = k34Var.f23130f.f23712a.f20366d;
        while (k34Var != null) {
            k34Var.m23828n();
            k34Var = k34Var.m23821g();
        }
        this.f25006h = null;
        this.f25008j = null;
        this.f25007i = null;
        this.f25009k = 0;
        m24812B();
    }

    /* renamed from: m */
    public final /* synthetic */ void m24831m(z73 z73Var, gf4 gf4Var) {
        this.f25001c.mo25974j(z73Var.m28454h(), gf4Var);
    }

    /* renamed from: n */
    public final void m24832n(long j11) {
        k34 k34Var = this.f25008j;
        if (k34Var != null) {
            k34Var.m23827m(j11);
        }
    }

    /* renamed from: o */
    public final boolean m24833o(ef4 ef4Var) {
        k34 k34Var = this.f25008j;
        return k34Var != null && k34Var.f23125a == ef4Var;
    }

    /* renamed from: p */
    public final boolean m24834p(k34 k34Var) {
        boolean z11;
        boolean z12 = false;
        if (k34Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        if (k34Var.equals(this.f25008j)) {
            return false;
        }
        this.f25008j = k34Var;
        while (k34Var.m23821g() != null) {
            k34Var = k34Var.m23821g();
            if (k34Var == this.f25007i) {
                this.f25007i = this.f25006h;
                z12 = true;
            }
            k34Var.m23828n();
            this.f25009k--;
        }
        this.f25008j.m23829o(null);
        m24812B();
        return z12;
    }

    /* renamed from: q */
    public final boolean m24835q() {
        k34 k34Var = this.f25008j;
        if (k34Var == null) {
            return true;
        }
        if (!k34Var.f23130f.f23720i && k34Var.m23832r() && this.f25008j.f23130f.f23716e != -9223372036854775807L && this.f25009k < 100) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m24836r(mr0 mr0Var, long j11, long j12) {
        l34 l34Var;
        long m23819e;
        boolean z11;
        k34 k34Var = null;
        for (k34 k34Var2 = this.f25006h; k34Var2 != null; k34Var2 = k34Var2.m23821g()) {
            l34 l34Var2 = k34Var2.f23130f;
            if (k34Var == null) {
                l34Var = m24828j(mr0Var, l34Var2);
            } else {
                l34 m24818w = m24818w(mr0Var, k34Var, j11);
                if (m24818w == null) {
                    if (!m24834p(k34Var)) {
                        return true;
                    }
                    return false;
                }
                if (l34Var2.f23713b == m24818w.f23713b && l34Var2.f23712a.equals(m24818w.f23712a)) {
                    l34Var = m24818w;
                } else {
                    if (!m24834p(k34Var)) {
                        return true;
                    }
                    return false;
                }
            }
            k34Var2.f23130f = l34Var.m24110a(l34Var2.f23714c);
            long j13 = l34Var2.f23716e;
            long j14 = l34Var.f23716e;
            if (j13 != -9223372036854775807L && j13 != j14) {
                k34Var2.m23831q();
                long j15 = l34Var.f23716e;
                if (j15 == -9223372036854775807L) {
                    m23819e = Long.MAX_VALUE;
                } else {
                    m23819e = j15 + k34Var2.m23819e();
                }
                if (k34Var2 == this.f25007i) {
                    boolean z12 = k34Var2.f23130f.f23717f;
                    if (j12 == Long.MIN_VALUE || j12 >= m23819e) {
                        z11 = true;
                        if (m24834p(k34Var2) && !z11) {
                            return true;
                        }
                        return false;
                    }
                }
                z11 = false;
                if (m24834p(k34Var2)) {
                }
                return false;
            }
            k34Var = k34Var2;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m24837s(mr0 mr0Var, int i11) {
        this.f25004f = i11;
        return m24815b(mr0Var);
    }

    /* renamed from: t */
    public final boolean m24838t(mr0 mr0Var, boolean z11) {
        this.f25005g = z11;
        return m24815b(mr0Var);
    }

    /* renamed from: u */
    public final k34 m24839u(d44[] d44VarArr, aj4 aj4Var, jj4 jj4Var, u34 u34Var, l34 l34Var, bj4 bj4Var) {
        long m23819e;
        k34 k34Var = this.f25008j;
        if (k34Var == null) {
            m23819e = 1000000000000L;
        } else {
            m23819e = (k34Var.m23819e() + k34Var.f23130f.f23716e) - l34Var.f23713b;
        }
        k34 k34Var2 = new k34(d44VarArr, m23819e, aj4Var, jj4Var, u34Var, l34Var, bj4Var, null);
        k34 k34Var3 = this.f25008j;
        if (k34Var3 != null) {
            k34Var3.m23829o(k34Var2);
        } else {
            this.f25006h = k34Var2;
            this.f25007i = k34Var2;
        }
        this.f25010l = null;
        this.f25008j = k34Var2;
        this.f25009k++;
        m24812B();
        return k34Var2;
    }
}
