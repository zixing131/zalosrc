package ik0;

import al0.C0895b;
import com.zing.zalo.zinstant.ZinstantNative;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import gl0.C19488j;
import gl0.C19489k;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import jk0.C21282a;
import lk0.C22504b;
import lk0.C22505c;
import lk0.C22507e;
import lk0.C22509g;
import lk0.InterfaceC22508f;
import pj0.C24777c;
import pj0.InterfaceC24782h;
import pj0.InterfaceC24792r;

/* renamed from: ik0.v */
/* loaded from: classes.dex */
public class C20599v {

    /* renamed from: h */
    private static C20599v f101329h;

    /* renamed from: a */
    private final InterfaceC24782h f101330a;

    /* renamed from: b */
    private final C20594q f101331b;

    /* renamed from: c */
    private final InterfaceC24792r f101332c;

    /* renamed from: d */
    private final C22507e f101333d;

    /* renamed from: e */
    private final InterfaceC20585h f101334e;

    /* renamed from: f */
    protected ZinstantNative f101335f = ZinstantNative.getInstance();

    /* renamed from: g */
    protected C22509g f101336g = C22509g.m116378g();

    public C20599v(C20594q c20594q, C20600w c20600w, InterfaceC20603z interfaceC20603z, InterfaceC24782h interfaceC24782h, InterfaceC24792r interfaceC24792r, C22507e c22507e, InterfaceC20585h interfaceC20585h) {
        this.f101331b = c20594q;
        this.f101330a = interfaceC24782h;
        this.f101332c = interfaceC24792r;
        this.f101334e = interfaceC20585h;
        this.f101333d = c22507e;
        C0895b.m2769d(interfaceC20603z);
        C0895b.m2768c(c20600w);
    }

    /* renamed from: a */
    public static C20599v m107204a() {
        return f101329h;
    }

    /* renamed from: b */
    public static String m107205b(String str) {
        return str.concat("_lc");
    }

    /* renamed from: c */
    public static String m107206c(String str) {
        return str.concat("_l");
    }

    /* renamed from: h */
    public static void m107207h(C20599v c20599v) {
        if (c20599v != null) {
            f101329h = c20599v;
            return;
        }
        throw new IllegalArgumentException("The given instance must not be null");
    }

    /* renamed from: j */
    public static void m107208j(String str, ArrayList arrayList) {
        String m107206c = m107206c(str);
        String m107205b = m107205b(str);
        arrayList.add(str);
        arrayList.add(m107206c);
        arrayList.add(m107205b);
    }

    /* renamed from: n */
    private void m107209n(AbstractC20601x abstractC20601x, InterfaceC20587j interfaceC20587j) {
        C19488j.m101908d(new C19489k(this.f101330a, this.f101335f, this.f101331b, this.f101336g, this.f101333d, this.f101332c, m107212d(), this.f101334e, abstractC20601x, interfaceC20587j, null));
    }

    /* renamed from: p */
    private boolean m107210p(AbstractC20601x abstractC20601x, InterfaceC20587j interfaceC20587j) {
        int mo107094m = abstractC20601x.mo107094m();
        if (mo107094m != 0 && mo107094m != 1) {
            return false;
        }
        try {
            m107209n(abstractC20601x, interfaceC20587j);
        } catch (Exception e11) {
            AbstractC20110a.m104543l("ZinstantManager").mo104552e(e11);
            m107220o(abstractC20601x, interfaceC20587j);
        }
        return true;
    }

    /* renamed from: r */
    public static File m107211r(String str, int i11) {
        return C24777c.m128777q(str, i11);
    }

    /* renamed from: d */
    public int m107212d() {
        return this.f101335f.getZinstantClientVersion();
    }

    /* renamed from: e */
    public C22504b m107213e(C22505c c22505c) {
        if (c22505c == null) {
            return null;
        }
        return this.f101336g.m116382f(this.f101333d.m116374b(AbstractC20595r.m107194b(c22505c).mo107049a()));
    }

    /* renamed from: f */
    public AbstractC20601x m107214f(InterfaceC22508f interfaceC22508f) {
        if (interfaceC22508f == null) {
            return null;
        }
        if (interfaceC22508f instanceof C22505c) {
            return AbstractC20601x.m107225c(AbstractC20595r.m107194b((C22505c) interfaceC22508f).mo107049a()).mo107107g(interfaceC22508f.getFeatureType()).mo107103c();
        }
        if (!(interfaceC22508f instanceof C22504b)) {
            return null;
        }
        return AbstractC20601x.m107226d(AbstractC20597t.m107198a((C22504b) interfaceC22508f).mo107081a()).mo107107g(interfaceC22508f.getFeatureType()).mo107103c();
    }

    /* renamed from: g */
    public boolean m107215g(InterfaceC22508f interfaceC22508f) {
        C22504b c22504b;
        File m107211r;
        if (interfaceC22508f == null) {
            return false;
        }
        if (interfaceC22508f instanceof C22505c) {
            c22504b = this.f101336g.m116382f(this.f101333d.m116374b(AbstractC20595r.m107194b((C22505c) interfaceC22508f).mo107049a()));
        } else if (interfaceC22508f instanceof C22504b) {
            c22504b = (C22504b) interfaceC22508f;
        } else {
            c22504b = null;
        }
        if (c22504b == null || (m107211r = m107211r(c22504b.f110129c, c22504b.f110131e)) == null || !m107211r.exists() || !m107211r.isFile()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void m107216i() {
        this.f101331b.m107188b();
    }

    /* renamed from: k */
    protected AbstractC20601x m107217k(AbstractC20601x abstractC20601x) {
        if (abstractC20601x.mo107097p() == null) {
            return abstractC20601x.mo107093l().mo107113m(C21282a.m110230b()).mo107103c();
        }
        return abstractC20601x;
    }

    /* renamed from: l */
    public void m107218l(ZOMDocument zOMDocument) {
        if (zOMDocument != null && !zOMDocument.isStrongCache()) {
            this.f101331b.m107192g(zOMDocument);
        }
    }

    /* renamed from: m */
    public void m107219m(AbstractC20601x abstractC20601x, InterfaceC20587j interfaceC20587j) {
        AbstractC20601x m107217k = m107217k(abstractC20601x);
        if (m107210p(m107217k, interfaceC20587j)) {
            return;
        }
        m107220o(m107217k, interfaceC20587j);
    }

    /* renamed from: o */
    protected void m107220o(AbstractC20601x abstractC20601x, InterfaceC20587j interfaceC20587j) {
        interfaceC20587j.mo61858b(abstractC20601x, new ZinstantException(0, "not support - " + abstractC20601x));
    }

    /* renamed from: q */
    public ZOMDocument m107221q(AbstractC20601x abstractC20601x, int i11) {
        AbstractC20597t abstractC20597t;
        AbstractC20596s mo107079g;
        if (abstractC20601x != null) {
            abstractC20597t = abstractC20601x.mo107100s();
        } else {
            abstractC20597t = null;
        }
        if (abstractC20597t == null) {
            return null;
        }
        if (i11 == 0) {
            mo107079g = abstractC20597t.mo107078f();
        } else {
            mo107079g = abstractC20597t.mo107079g();
        }
        C20594q c20594q = this.f101331b;
        if (c20594q == null || mo107079g == null) {
            return null;
        }
        ZOMDocument m107189c = c20594q.m107189c(abstractC20601x, mo107079g, 1);
        if (m107189c == null) {
            return this.f101331b.m107189c(abstractC20601x, mo107079g, 0);
        }
        return m107189c;
    }
}
