package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class mr0 {

    /* renamed from: a */
    public static final mr0 f24725a = new im0();

    /* renamed from: b */
    public static final g94 f24726b = hl0.f21824a;

    /* renamed from: a */
    public abstract int mo20105a(Object obj);

    /* renamed from: b */
    public abstract int mo20106b();

    /* renamed from: c */
    public abstract int mo20107c();

    /* renamed from: d */
    public abstract ho0 mo20108d(int i11, ho0 ho0Var, boolean z11);

    /* renamed from: e */
    public abstract jq0 mo20109e(int i11, jq0 jq0Var, long j11);

    public final boolean equals(Object obj) {
        int mo23647h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr0)) {
            return false;
        }
        mr0 mr0Var = (mr0) obj;
        if (mr0Var.mo20107c() == mo20107c() && mr0Var.mo20106b() == mo20106b()) {
            jq0 jq0Var = new jq0();
            ho0 ho0Var = new ho0();
            jq0 jq0Var2 = new jq0();
            ho0 ho0Var2 = new ho0();
            for (int i11 = 0; i11 < mo20107c(); i11++) {
                if (!mo20109e(i11, jq0Var, 0L).equals(mr0Var.mo20109e(i11, jq0Var2, 0L))) {
                    return false;
                }
            }
            for (int i12 = 0; i12 < mo20106b(); i12++) {
                if (!mo20108d(i12, ho0Var, true).equals(mr0Var.mo20108d(i12, ho0Var2, true))) {
                    return false;
                }
            }
            int mo23646g = mo23646g(true);
            if (mo23646g == mr0Var.mo23646g(true) && (mo23647h = mo23647h(true)) == mr0Var.mo23647h(true)) {
                while (mo23646g != mo23647h) {
                    int mo23648j = mo23648j(mo23646g, 0, true);
                    if (mo23648j != mr0Var.mo23648j(mo23646g, 0, true)) {
                        return false;
                    }
                    mo23646g = mo23648j;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract Object mo20110f(int i11);

    /* renamed from: g */
    public int mo23646g(boolean z11) {
        if (m24700o()) {
            return -1;
        }
        return 0;
    }

    /* renamed from: h */
    public int mo23647h(boolean z11) {
        if (m24700o()) {
            return -1;
        }
        return mo20107c() - 1;
    }

    public final int hashCode() {
        jq0 jq0Var = new jq0();
        ho0 ho0Var = new ho0();
        int mo20107c = mo20107c() + 217;
        for (int i11 = 0; i11 < mo20107c(); i11++) {
            mo20107c = (mo20107c * 31) + mo20109e(i11, jq0Var, 0L).hashCode();
        }
        int mo20106b = (mo20107c * 31) + mo20106b();
        for (int i12 = 0; i12 < mo20106b(); i12++) {
            mo20106b = (mo20106b * 31) + mo20108d(i12, ho0Var, true).hashCode();
        }
        int mo23646g = mo23646g(true);
        while (mo23646g != -1) {
            mo20106b = (mo20106b * 31) + mo23646g;
            mo23646g = mo23648j(mo23646g, 0, true);
        }
        return mo20106b;
    }

    /* renamed from: i */
    public final int m24697i(int i11, ho0 ho0Var, jq0 jq0Var, int i12, boolean z11) {
        int i13 = mo20108d(i11, ho0Var, false).f21855c;
        if (mo20109e(i13, jq0Var, 0L).f22943n == i11) {
            int mo23648j = mo23648j(i13, i12, z11);
            if (mo23648j == -1) {
                return -1;
            }
            return mo20109e(mo23648j, jq0Var, 0L).f22942m;
        }
        return i11 + 1;
    }

    /* renamed from: j */
    public int mo23648j(int i11, int i12, boolean z11) {
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    if (i11 == mo23647h(z11)) {
                        return mo23646g(z11);
                    }
                    return i11 + 1;
                }
                throw new IllegalStateException();
            }
            return i11;
        }
        if (i11 == mo23647h(z11)) {
            return -1;
        }
        return i11 + 1;
    }

    /* renamed from: k */
    public int mo23649k(int i11, int i12, boolean z11) {
        if (i11 == mo23646g(false)) {
            return -1;
        }
        return i11 - 1;
    }

    /* renamed from: l */
    public final Pair m24698l(jq0 jq0Var, ho0 ho0Var, int i11, long j11) {
        Pair m24699m = m24699m(jq0Var, ho0Var, i11, j11, 0L);
        m24699m.getClass();
        return m24699m;
    }

    /* renamed from: m */
    public final Pair m24699m(jq0 jq0Var, ho0 ho0Var, int i11, long j11, long j12) {
        v71.m27170a(i11, 0, mo20107c());
        mo20109e(i11, jq0Var, j12);
        if (j11 == -9223372036854775807L) {
            long j13 = jq0Var.f22940k;
            j11 = 0;
        }
        int i12 = jq0Var.f22942m;
        mo20108d(i12, ho0Var, false);
        while (i12 < jq0Var.f22943n) {
            long j14 = ho0Var.f21857e;
            if (j11 == 0) {
                break;
            }
            int i13 = i12 + 1;
            long j15 = mo20108d(i13, ho0Var, false).f21857e;
            if (j11 < 0) {
                break;
            }
            i12 = i13;
        }
        mo20108d(i12, ho0Var, true);
        long j16 = ho0Var.f21857e;
        long j17 = ho0Var.f21856d;
        if (j17 != -9223372036854775807L) {
            j11 = Math.min(j11, j17 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = ho0Var.f21854b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public ho0 mo23650n(Object obj, ho0 ho0Var) {
        return mo20108d(mo20105a(obj), ho0Var, true);
    }

    /* renamed from: o */
    public final boolean m24700o() {
        if (mo20107c() == 0) {
            return true;
        }
        return false;
    }
}
