package com.zing.zalo.zinstant;

/* renamed from: com.zing.zalo.zinstant.h */
/* loaded from: classes.dex */
public abstract class AbstractC17153h {

    /* renamed from: a */
    private static InterfaceC17147f f87688a;

    /* renamed from: a */
    public static void m91709a(Exception exc) {
        m91715g(110023, exc);
    }

    /* renamed from: b */
    public static void m91710b(Exception exc) {
        m91715g(110019, exc);
    }

    /* renamed from: c */
    public static void m91711c() {
        m91721m(110017);
    }

    /* renamed from: d */
    public static void m91712d(Exception exc) {
        m91715g(110001, exc);
    }

    /* renamed from: e */
    public static void m91713e() {
        m91721m(110001);
    }

    /* renamed from: f */
    public static void m91714f() {
        m91721m(113001);
    }

    /* renamed from: g */
    public static void m91715g(int i11, Exception exc) {
        InterfaceC17147f interfaceC17147f = f87688a;
        if (interfaceC17147f != null) {
            interfaceC17147f.mo91680b(i11, exc);
        }
        if (exc != null && exc.getMessage() != null) {
            m91717i(i11, exc);
        }
    }

    /* renamed from: h */
    public static void m91716h(InterfaceC17147f interfaceC17147f) {
        if (interfaceC17147f != null) {
            f87688a = interfaceC17147f;
            return;
        }
        throw new IllegalArgumentException("qos must not be null");
    }

    /* renamed from: i */
    public static void m91717i(int i11, Exception exc) {
        String message;
        if (exc == null) {
            message = null;
        } else {
            message = exc.getMessage();
        }
        m91718j(i11, message);
    }

    /* renamed from: j */
    public static void m91718j(int i11, String str) {
        InterfaceC17147f interfaceC17147f = f87688a;
        if (interfaceC17147f != null) {
            interfaceC17147f.mo91681c(i11, str);
        }
    }

    /* renamed from: k */
    public static void m91719k(Exception exc) {
        m91715g(110028, exc);
    }

    /* renamed from: l */
    public static void m91720l() {
        m91721m(110028);
    }

    /* renamed from: m */
    public static void m91721m(int i11) {
        InterfaceC17147f interfaceC17147f = f87688a;
        if (interfaceC17147f != null) {
            interfaceC17147f.mo91679a(i11, System.currentTimeMillis(), System.currentTimeMillis());
        }
    }

    /* renamed from: n */
    public static void m91722n(int i11, long j11, long j12) {
        InterfaceC17147f interfaceC17147f = f87688a;
        if (interfaceC17147f != null) {
            interfaceC17147f.mo91679a(i11, j11, j12);
        }
    }

    /* renamed from: o */
    public static void m91723o(Exception exc) {
        m91715g(115001, exc);
    }

    /* renamed from: p */
    public static void m91724p() {
        m91721m(115001);
    }

    /* renamed from: q */
    public static void m91725q(Exception exc) {
        m91715g(115000, exc);
    }

    /* renamed from: r */
    public static void m91726r() {
        m91721m(115000);
    }

    /* renamed from: s */
    public static void m91727s(Exception exc) {
        m91715g(115002, exc);
    }

    /* renamed from: t */
    public static void m91728t() {
        m91721m(115002);
    }

    /* renamed from: u */
    public static void m91729u(Exception exc) {
        m91715g(114000, exc);
    }

    /* renamed from: v */
    public static void m91730v() {
        m91721m(114000);
    }

    /* renamed from: w */
    public static void m91731w(Exception exc) {
        m91715g(119000, exc);
    }

    /* renamed from: x */
    public static void m91732x() {
        m91721m(119001);
    }

    /* renamed from: y */
    public static void m91733y(String str) {
        m91715g(110002, new Exception(str));
    }
}
