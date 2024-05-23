package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class le3 {

    /* renamed from: a */
    private final up3 f23895a;

    private le3(up3 up3Var) {
        this.f23895a = up3Var;
    }

    /* renamed from: d */
    public static le3 m24262d() {
        return new le3(xp3.m27966H());
    }

    /* renamed from: e */
    private final synchronized int m24263e() {
        int m28222a;
        m28222a = yj3.m28222a();
        while (m24265g(m28222a)) {
            m28222a = yj3.m28222a();
        }
        return m28222a;
    }

    /* renamed from: f */
    private final synchronized wp3 m24264f(pp3 pp3Var) {
        return m24266h(df3.m21369c(pp3Var), pp3Var.m25512M());
    }

    /* renamed from: g */
    private final synchronized boolean m24265g(int i11) {
        Iterator it = this.f23895a.m27040s().iterator();
        while (it.hasNext()) {
            if (((wp3) it.next()).m27683F() == i11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final synchronized wp3 m24266h(jp3 jp3Var, int i11) {
        vp3 m27677H;
        int m24263e = m24263e();
        if (i11 != 2) {
            m27677H = wp3.m27677H();
            m27677H.m27328q(jp3Var);
            m27677H.m27329r(m24263e);
            m27677H.m27331u(3);
            m27677H.m27330s(i11);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (wp3) m27677H.m25898n();
    }

    /* renamed from: a */
    public final synchronized int m24267a(pp3 pp3Var, boolean z11) {
        wp3 m24264f;
        m24264f = m24264f(pp3Var);
        this.f23895a.m27038q(m24264f);
        this.f23895a.m27039r(m24264f.m27683F());
        return m24264f.m27683F();
    }

    /* renamed from: b */
    public final synchronized ke3 m24268b() {
        return ke3.m23930a((xp3) this.f23895a.m25898n());
    }

    /* renamed from: c */
    public final synchronized le3 m24269c(pp3 pp3Var) {
        m24267a(pp3Var, true);
        return this;
    }
}
