package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class jm3 extends mr0 {

    /* renamed from: c */
    private final int f22886c;

    /* renamed from: d */
    private final zg4 f22887d;

    public jm3(boolean z11, zg4 zg4Var, byte[] bArr) {
        this.f22887d = zg4Var;
        this.f22886c = zg4Var.m28504c();
    }

    /* renamed from: w */
    private final int m23644w(int i11, boolean z11) {
        if (z11) {
            return this.f22887d.m28505d(i11);
        }
        if (i11 >= this.f22886c - 1) {
            return -1;
        }
        return i11 + 1;
    }

    /* renamed from: x */
    private final int m23645x(int i11, boolean z11) {
        if (z11) {
            return this.f22887d.m28506e(i11);
        }
        if (i11 <= 0) {
            return -1;
        }
        return i11 - 1;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: a */
    public final int mo20105a(Object obj) {
        int mo20105a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo23651p = mo23651p(obj2);
        if (mo23651p == -1 || (mo20105a = mo23656u(mo23651p).mo20105a(obj3)) == -1) {
            return -1;
        }
        return mo23654s(mo23651p) + mo20105a;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: d */
    public final ho0 mo20108d(int i11, ho0 ho0Var, boolean z11) {
        int mo23652q = mo23652q(i11);
        int mo23655t = mo23655t(mo23652q);
        mo23656u(mo23652q).mo20108d(i11 - mo23654s(mo23652q), ho0Var, z11);
        ho0Var.f21855c += mo23655t;
        if (z11) {
            Object mo23657v = mo23657v(mo23652q);
            Object obj = ho0Var.f21854b;
            obj.getClass();
            ho0Var.f21854b = Pair.create(mo23657v, obj);
        }
        return ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: e */
    public final jq0 mo20109e(int i11, jq0 jq0Var, long j11) {
        int mo23653r = mo23653r(i11);
        int mo23655t = mo23655t(mo23653r);
        int mo23654s = mo23654s(mo23653r);
        mo23656u(mo23653r).mo20109e(i11 - mo23655t, jq0Var, j11);
        Object mo23657v = mo23657v(mo23653r);
        if (!jq0.f22926o.equals(jq0Var.f22930a)) {
            mo23657v = Pair.create(mo23657v, jq0Var.f22930a);
        }
        jq0Var.f22930a = mo23657v;
        jq0Var.f22942m += mo23654s;
        jq0Var.f22943n += mo23654s;
        return jq0Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: f */
    public final Object mo20110f(int i11) {
        int mo23652q = mo23652q(i11);
        return Pair.create(mo23657v(mo23652q), mo23656u(mo23652q).mo20110f(i11 - mo23654s(mo23652q)));
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: g */
    public final int mo23646g(boolean z11) {
        int i11;
        if (this.f22886c == 0) {
            return -1;
        }
        if (z11) {
            i11 = this.f22887d.m28502a();
        } else {
            i11 = 0;
        }
        while (mo23656u(i11).m24700o()) {
            i11 = m23644w(i11, z11);
            if (i11 == -1) {
                return -1;
            }
        }
        return mo23655t(i11) + mo23656u(i11).mo23646g(z11);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: h */
    public final int mo23647h(boolean z11) {
        int i11;
        int i12 = this.f22886c;
        if (i12 == 0) {
            return -1;
        }
        if (z11) {
            i11 = this.f22887d.m28503b();
        } else {
            i11 = i12 - 1;
        }
        while (mo23656u(i11).m24700o()) {
            i11 = m23645x(i11, z11);
            if (i11 == -1) {
                return -1;
            }
        }
        return mo23655t(i11) + mo23656u(i11).mo23647h(z11);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: j */
    public final int mo23648j(int i11, int i12, boolean z11) {
        int i13;
        int mo23653r = mo23653r(i11);
        int mo23655t = mo23655t(mo23653r);
        mr0 mo23656u = mo23656u(mo23653r);
        int i14 = i11 - mo23655t;
        if (i12 == 2) {
            i13 = 0;
        } else {
            i13 = i12;
        }
        int mo23648j = mo23656u.mo23648j(i14, i13, z11);
        if (mo23648j != -1) {
            return mo23655t + mo23648j;
        }
        int m23644w = m23644w(mo23653r, z11);
        while (m23644w != -1 && mo23656u(m23644w).m24700o()) {
            m23644w = m23644w(m23644w, z11);
        }
        if (m23644w != -1) {
            return mo23655t(m23644w) + mo23656u(m23644w).mo23646g(z11);
        }
        if (i12 != 2) {
            return -1;
        }
        return mo23646g(z11);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: k */
    public final int mo23649k(int i11, int i12, boolean z11) {
        int mo23653r = mo23653r(i11);
        int mo23655t = mo23655t(mo23653r);
        int mo23649k = mo23656u(mo23653r).mo23649k(i11 - mo23655t, 0, false);
        if (mo23649k != -1) {
            return mo23655t + mo23649k;
        }
        int m23645x = m23645x(mo23653r, false);
        while (m23645x != -1 && mo23656u(m23645x).m24700o()) {
            m23645x = m23645x(m23645x, false);
        }
        if (m23645x == -1) {
            return -1;
        }
        return mo23655t(m23645x) + mo23656u(m23645x).mo23647h(false);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: n */
    public final ho0 mo23650n(Object obj, ho0 ho0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo23651p = mo23651p(obj2);
        int mo23655t = mo23655t(mo23651p);
        mo23656u(mo23651p).mo23650n(obj3, ho0Var);
        ho0Var.f21855c += mo23655t;
        ho0Var.f21854b = obj;
        return ho0Var;
    }

    /* renamed from: p */
    protected abstract int mo23651p(Object obj);

    /* renamed from: q */
    protected abstract int mo23652q(int i11);

    /* renamed from: r */
    protected abstract int mo23653r(int i11);

    /* renamed from: s */
    protected abstract int mo23654s(int i11);

    /* renamed from: t */
    protected abstract int mo23655t(int i11);

    /* renamed from: u */
    protected abstract mr0 mo23656u(int i11);

    /* renamed from: v */
    protected abstract Object mo23657v(int i11);
}
