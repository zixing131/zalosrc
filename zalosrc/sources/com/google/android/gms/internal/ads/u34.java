package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class u34 {

    /* renamed from: a */
    private final i94 f28735a;

    /* renamed from: e */
    private final t34 f28739e;

    /* renamed from: f */
    private final pf4 f28740f;

    /* renamed from: g */
    private final dc4 f28741g;

    /* renamed from: h */
    private final HashMap f28742h;

    /* renamed from: i */
    private final Set f28743i;

    /* renamed from: j */
    private boolean f28744j;

    /* renamed from: k */
    private dc3 f28745k;

    /* renamed from: l */
    private zg4 f28746l = new zg4(0);

    /* renamed from: c */
    private final IdentityHashMap f28737c = new IdentityHashMap();

    /* renamed from: d */
    private final Map f28738d = new HashMap();

    /* renamed from: b */
    private final List f28736b = new ArrayList();

    public u34(t34 t34Var, r44 r44Var, Handler handler, i94 i94Var) {
        this.f28735a = i94Var;
        this.f28739e = t34Var;
        pf4 pf4Var = new pf4();
        this.f28740f = pf4Var;
        dc4 dc4Var = new dc4();
        this.f28741g = dc4Var;
        this.f28742h = new HashMap();
        this.f28743i = new HashSet();
        pf4Var.m25442b(handler, r44Var);
        dc4Var.m21346b(handler, r44Var);
    }

    /* renamed from: o */
    private final void m26840o(int i11, int i12) {
        while (i11 < this.f28736b.size()) {
            ((s34) this.f28736b.get(i11)).f27518d += i12;
            i11++;
        }
    }

    /* renamed from: p */
    private final void m26841p(s34 s34Var) {
        r34 r34Var = (r34) this.f28742h.get(s34Var);
        if (r34Var != null) {
            r34Var.f27066a.mo22804l(r34Var.f27067b);
        }
    }

    /* renamed from: q */
    private final void m26842q() {
        Iterator it = this.f28743i.iterator();
        while (it.hasNext()) {
            s34 s34Var = (s34) it.next();
            if (s34Var.f27517c.isEmpty()) {
                m26841p(s34Var);
                it.remove();
            }
        }
    }

    /* renamed from: r */
    private final void m26843r(s34 s34Var) {
        if (s34Var.f27519e && s34Var.f27517c.isEmpty()) {
            r34 r34Var = (r34) this.f28742h.remove(s34Var);
            r34Var.getClass();
            r34Var.f27066a.mo22798b(r34Var.f27067b);
            r34Var.f27066a.mo22801h(r34Var.f27068c);
            r34Var.f27066a.mo22800f(r34Var.f27068c);
            this.f28743i.remove(s34Var);
        }
    }

    /* renamed from: s */
    private final void m26844s(s34 s34Var) {
        bf4 bf4Var = s34Var.f27515a;
        p34 p34Var = new hf4() { // from class: com.google.android.gms.internal.ads.p34
            public /* synthetic */ p34() {
            }

            @Override // com.google.android.gms.internal.ads.hf4
            /* renamed from: a */
            public final void mo22819a(if4 if4Var, mr0 mr0Var) {
                u34.this.m26848e(if4Var, mr0Var);
            }
        };
        q34 q34Var = new q34(this, s34Var);
        this.f28742h.put(s34Var, new r34(bf4Var, p34Var, q34Var));
        bf4Var.mo22803k(new Handler(g92.m22341e(), null), q34Var);
        bf4Var.mo22806n(new Handler(g92.m22341e(), null), q34Var);
        bf4Var.mo22805m(p34Var, this.f28745k, this.f28735a);
    }

    /* renamed from: t */
    private final void m26845t(int i11, int i12) {
        while (true) {
            i12--;
            if (i12 >= i11) {
                s34 s34Var = (s34) this.f28736b.remove(i12);
                this.f28738d.remove(s34Var.f27516b);
                m26840o(i12, -s34Var.f27515a.m20504C().mo20107c());
                s34Var.f27519e = true;
                if (this.f28744j) {
                    m26843r(s34Var);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int m26846a() {
        return this.f28736b.size();
    }

    /* renamed from: b */
    public final mr0 m26847b() {
        if (!this.f28736b.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f28736b.size(); i12++) {
                s34 s34Var = (s34) this.f28736b.get(i12);
                s34Var.f27518d = i11;
                i11 += s34Var.f27515a.m20504C().mo20107c();
            }
            return new z34(this.f28736b, this.f28746l, null);
        }
        return mr0.f24725a;
    }

    /* renamed from: e */
    public final /* synthetic */ void m26848e(if4 if4Var, mr0 mr0Var) {
        this.f28739e.zzh();
    }

    /* renamed from: f */
    public final void m26849f(dc3 dc3Var) {
        v71.m27175f(!this.f28744j);
        this.f28745k = dc3Var;
        for (int i11 = 0; i11 < this.f28736b.size(); i11++) {
            s34 s34Var = (s34) this.f28736b.get(i11);
            m26844s(s34Var);
            this.f28743i.add(s34Var);
        }
        this.f28744j = true;
    }

    /* renamed from: g */
    public final void m26850g() {
        for (r34 r34Var : this.f28742h.values()) {
            try {
                r34Var.f27066a.mo22798b(r34Var.f27067b);
            } catch (RuntimeException e11) {
                lr1.m24354c("MediaSourceList", "Failed to release child source.", e11);
            }
            r34Var.f27066a.mo22801h(r34Var.f27068c);
            r34Var.f27066a.mo22800f(r34Var.f27068c);
        }
        this.f28742h.clear();
        this.f28743i.clear();
        this.f28744j = false;
    }

    /* renamed from: h */
    public final void m26851h(ef4 ef4Var) {
        s34 s34Var = (s34) this.f28737c.remove(ef4Var);
        s34Var.getClass();
        s34Var.f27515a.mo20506d(ef4Var);
        s34Var.f27517c.remove(((ye4) ef4Var).f30915p);
        if (!this.f28737c.isEmpty()) {
            m26842q();
        }
        m26843r(s34Var);
    }

    /* renamed from: i */
    public final boolean m26852i() {
        return this.f28744j;
    }

    /* renamed from: j */
    public final mr0 m26853j(int i11, List list, zg4 zg4Var) {
        if (!list.isEmpty()) {
            this.f28746l = zg4Var;
            for (int i12 = i11; i12 < list.size() + i11; i12++) {
                s34 s34Var = (s34) list.get(i12 - i11);
                if (i12 > 0) {
                    s34 s34Var2 = (s34) this.f28736b.get(i12 - 1);
                    s34Var.m26243a(s34Var2.f27518d + s34Var2.f27515a.m20504C().mo20107c());
                } else {
                    s34Var.m26243a(0);
                }
                m26840o(i12, s34Var.f27515a.m20504C().mo20107c());
                this.f28736b.add(i12, s34Var);
                this.f28738d.put(s34Var.f27516b, s34Var);
                if (this.f28744j) {
                    m26844s(s34Var);
                    if (this.f28737c.isEmpty()) {
                        this.f28743i.add(s34Var);
                    } else {
                        m26841p(s34Var);
                    }
                }
            }
        }
        return m26847b();
    }

    /* renamed from: k */
    public final mr0 m26854k(int i11, int i12, zg4 zg4Var) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12 && i12 <= m26846a()) {
            z11 = true;
        }
        v71.m27173d(z11);
        this.f28746l = zg4Var;
        m26845t(i11, i12);
        return m26847b();
    }

    /* renamed from: l */
    public final mr0 m26855l(List list, zg4 zg4Var) {
        m26845t(0, this.f28736b.size());
        return m26853j(this.f28736b.size(), list, zg4Var);
    }

    /* renamed from: m */
    public final mr0 m26856m(zg4 zg4Var) {
        int m26846a = m26846a();
        if (zg4Var.m28504c() != m26846a) {
            zg4Var = zg4Var.m28507f().m28508g(0, m26846a);
        }
        this.f28746l = zg4Var;
        return m26847b();
    }

    /* renamed from: n */
    public final ef4 m26857n(gf4 gf4Var, jj4 jj4Var, long j11) {
        Object obj = gf4Var.f20363a;
        Object obj2 = ((Pair) obj).first;
        gf4 m22434c = gf4Var.m22434c(((Pair) obj).second);
        s34 s34Var = (s34) this.f28738d.get(obj2);
        s34Var.getClass();
        this.f28743i.add(s34Var);
        r34 r34Var = (r34) this.f28742h.get(s34Var);
        if (r34Var != null) {
            r34Var.f27066a.mo22802i(r34Var.f27067b);
        }
        s34Var.f27517c.add(m22434c);
        ye4 mo20508j = s34Var.f27515a.mo20508j(m22434c, jj4Var, j11);
        this.f28737c.put(mo20508j, s34Var);
        m26842q();
        return mo20508j;
    }
}
