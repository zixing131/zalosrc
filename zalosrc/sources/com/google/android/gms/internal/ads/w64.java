package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class w64 {

    /* renamed from: a */
    private final ho0 f29834a;

    /* renamed from: b */
    private c83 f29835b = c83.m20832w();

    /* renamed from: c */
    private f83 f29836c = f83.m21967d();

    /* renamed from: d */
    private gf4 f29837d;

    /* renamed from: e */
    private gf4 f29838e;

    /* renamed from: f */
    private gf4 f29839f;

    public w64(ho0 ho0Var) {
        this.f29834a = ho0Var;
    }

    /* renamed from: j */
    private static gf4 m27551j(jk0 jk0Var, c83 c83Var, gf4 gf4Var, ho0 ho0Var) {
        Object mo20110f;
        int i11;
        mr0 zzn = jk0Var.zzn();
        int zzg = jk0Var.zzg();
        if (zzn.m24700o()) {
            mo20110f = null;
        } else {
            mo20110f = zzn.mo20110f(zzg);
        }
        if (jk0Var.zzs() || zzn.m24700o()) {
            i11 = -1;
        } else {
            i11 = zzn.mo20108d(zzg, ho0Var, false).m22981c(g92.m22344f0(jk0Var.zzl()));
        }
        for (int i12 = 0; i12 < c83Var.size(); i12++) {
            gf4 gf4Var2 = (gf4) c83Var.get(i12);
            if (m27554m(gf4Var2, mo20110f, jk0Var.zzs(), jk0Var.zzd(), jk0Var.zze(), i11)) {
                return gf4Var2;
            }
        }
        if (c83Var.isEmpty() && gf4Var != null) {
            if (m27554m(gf4Var, mo20110f, jk0Var.zzs(), jk0Var.zzd(), jk0Var.zze(), i11)) {
                return gf4Var;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final void m27552k(e83 e83Var, gf4 gf4Var, mr0 mr0Var) {
        if (gf4Var == null) {
            return;
        }
        if (mr0Var.mo20105a(gf4Var.f20363a) != -1) {
            e83Var.m21628a(gf4Var, mr0Var);
            return;
        }
        mr0 mr0Var2 = (mr0) this.f29836c.get(gf4Var);
        if (mr0Var2 != null) {
            e83Var.m21628a(gf4Var, mr0Var2);
        }
    }

    /* renamed from: l */
    private final void m27553l(mr0 mr0Var) {
        e83 e83Var = new e83();
        if (this.f29835b.isEmpty()) {
            m27552k(e83Var, this.f29838e, mr0Var);
            if (!e53.m21617a(this.f29839f, this.f29838e)) {
                m27552k(e83Var, this.f29839f, mr0Var);
            }
            if (!e53.m21617a(this.f29837d, this.f29838e) && !e53.m21617a(this.f29837d, this.f29839f)) {
                m27552k(e83Var, this.f29837d, mr0Var);
            }
        } else {
            for (int i11 = 0; i11 < this.f29835b.size(); i11++) {
                m27552k(e83Var, (gf4) this.f29835b.get(i11), mr0Var);
            }
            if (!this.f29835b.contains(this.f29837d)) {
                m27552k(e83Var, this.f29837d, mr0Var);
            }
        }
        this.f29836c = e83Var.m21630c();
    }

    /* renamed from: m */
    private static boolean m27554m(gf4 gf4Var, Object obj, boolean z11, int i11, int i12, int i13) {
        if (!gf4Var.f20363a.equals(obj)) {
            return false;
        }
        if (z11) {
            if (gf4Var.f20364b != i11 || gf4Var.f20365c != i12) {
                return false;
            }
        } else if (gf4Var.f20364b != -1 || gf4Var.f20367e != i13) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final mr0 m27555a(gf4 gf4Var) {
        return (mr0) this.f29836c.get(gf4Var);
    }

    /* renamed from: b */
    public final gf4 m27556b() {
        return this.f29837d;
    }

    /* renamed from: c */
    public final gf4 m27557c() {
        Object next;
        Object obj;
        if (this.f29835b.isEmpty()) {
            return null;
        }
        c83 c83Var = this.f29835b;
        if (c83Var instanceof List) {
            if (!c83Var.isEmpty()) {
                obj = c83Var.get(c83Var.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = c83Var.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (gf4) obj;
    }

    /* renamed from: d */
    public final gf4 m27558d() {
        return this.f29838e;
    }

    /* renamed from: e */
    public final gf4 m27559e() {
        return this.f29839f;
    }

    /* renamed from: g */
    public final void m27560g(jk0 jk0Var) {
        this.f29837d = m27551j(jk0Var, this.f29835b, this.f29838e, this.f29834a);
    }

    /* renamed from: h */
    public final void m27561h(List list, gf4 gf4Var, jk0 jk0Var) {
        this.f29835b = c83.m20830u(list);
        if (!list.isEmpty()) {
            this.f29838e = (gf4) list.get(0);
            gf4Var.getClass();
            this.f29839f = gf4Var;
        }
        if (this.f29837d == null) {
            this.f29837d = m27551j(jk0Var, this.f29835b, this.f29838e, this.f29834a);
        }
        m27553l(jk0Var.zzn());
    }

    /* renamed from: i */
    public final void m27562i(jk0 jk0Var) {
        this.f29837d = m27551j(jk0Var, this.f29835b, this.f29838e, this.f29834a);
        m27553l(jk0Var.zzn());
    }
}
