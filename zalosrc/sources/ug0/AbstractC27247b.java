package ug0;

import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import hn0.AbstractC20104d;
import java.io.InputStream;
import k30.C21459a;
import p461qu.AbstractC25495a;
import p487rl.C25823d;
import p487rl.EnumC25825f;
import sg0.C26245a;
import tg0.C26676b;

/* renamed from: ug0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC27247b {
    /* renamed from: a */
    public static final long m139389a(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "<this>");
        if (c25823d.m133181g() > 0) {
            return c25823d.m133181g();
        }
        return c25823d.m133183i().m106845r();
    }

    /* renamed from: b */
    public static final long m139390b(C25823d c25823d, int i11) {
        long m104530f;
        AbstractC19074t.m100208f(c25823d, "<this>");
        long j11 = 10000;
        if (c25823d.m133191q() == EnumC25825f.f123208q) {
            if (m139395g(c25823d) || m139394f(c25823d) || m139397i(c25823d)) {
                return 10000L;
            }
            long m139389a = m139389a(c25823d);
            if (1 <= m139389a && m139389a < C21459a.m111040i(1)) {
                return 10000L;
            }
            if (1 <= m139389a && m139389a < C21459a.m111040i(10)) {
                return 30000L;
            }
            if (1 <= m139389a && m139389a < C21459a.m111040i(100)) {
                return 180000L;
            }
            return m139391c(m139389a(c25823d));
        }
        long m139389a2 = m139389a(c25823d);
        if (1 > m139389a2 || m139389a2 >= C21459a.m111040i(1)) {
            if (1 <= m139389a2 && m139389a2 < C21459a.m111040i(10)) {
                j11 = 60000;
            } else if (1 <= m139389a2 && m139389a2 < C21459a.m111040i(100)) {
                j11 = 300000;
            } else {
                j11 = m139391c(m139389a(c25823d));
            }
        }
        m104530f = AbstractC20104d.m104530f(Math.scalb(j11, i11));
        return m104530f;
    }

    /* renamed from: c */
    private static final long m139391c(long j11) {
        return (C21459a.m111034b(j11) * 2000) + 300000;
    }

    /* renamed from: d */
    public static final String m139392d(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "<this>");
        String m133178d = c25823d.m133178d();
        if (m133178d != null && m133178d.length() != 0) {
            return c25823d.m133178d();
        }
        String str = null;
        try {
            InputStream m106838k = c25823d.m133183i().m106838k();
            if (m106838k != null) {
                str = C26245a.m134940o(C26245a.f124654a, m106838k, 0, 2, null);
            }
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
        return str;
    }

    /* renamed from: e */
    public static final int m139393e(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "<this>");
        return 2;
    }

    /* renamed from: f */
    public static final boolean m139394f(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "<this>");
        return AbstractC19646n0.m102995k1(c25823d.m133187m());
    }

    /* renamed from: g */
    public static final boolean m139395g(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "<this>");
        return AbstractC19646n0.m103031t1(c25823d.m133187m());
    }

    /* renamed from: h */
    public static final boolean m139396h(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "<this>");
        return AbstractC25495a.m132078c(c25823d.m133185k().m41048l());
    }

    /* renamed from: i */
    public static final boolean m139397i(C25823d c25823d) {
        AbstractC19074t.m100208f(c25823d, "<this>");
        return AbstractC19646n0.m102886D1(c25823d.m133187m());
    }
}
