package ca0;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import bg0.C2797c;
import bg0.InterfaceC2798d;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTrackingLogPanelLayout;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Arrays;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p612wk.AbstractC29069a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import sk.C26302c;

/* renamed from: ca0.f */
/* loaded from: classes6.dex */
public final class C3388f {

    /* renamed from: a */
    public static final C3388f f14324a = new C3388f();

    /* renamed from: b */
    private static final InterfaceC2798d f14325b = new C2797c(AbstractC0837p0.Companion.m2237f());

    private C3388f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m17049g(C26302c c26302c, String str) {
        Object m129218b;
        AbstractC19074t.m100208f(c26302c, "$sessionData");
        AbstractC19074t.m100208f(str, "$currentTextSearch");
        C3388f c3388f = f14324a;
        try {
            C24861r.a aVar = C24861r.f119264q;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", String.valueOf(c26302c.m135411l()));
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c3388f.m17052l(3, 13, 33, "1", c26302c.m135400a(), str, String.valueOf(System.currentTimeMillis() - c26302c.m135411l()), jSONObject2, "", "", "");
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC23350e.m122776f("SearchDiscovery", m129221e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m17050i(C26302c c26302c, String str, String str2) {
        Object m129218b;
        AbstractC19074t.m100208f(c26302c, "$sessionData");
        AbstractC19074t.m100208f(str, "$currentTextSearch");
        AbstractC19074t.m100208f(str2, "$dataCopied");
        C3388f c3388f = f14324a;
        try {
            C24861r.a aVar = C24861r.f119264q;
            c3388f.m17054n(c26302c, str, str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", String.valueOf(c26302c.m135411l()));
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c3388f.m17052l(3, 11, 33, "1", c26302c.m135405f(), str, "", jSONObject2, "", "", "");
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC23350e.m122776f("SearchDiscovery", m129221e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m17051k(String str, C26302c c26302c) {
        Object m129218b;
        AbstractC19074t.m100208f(str, "$openSourceAction");
        AbstractC19074t.m100208f(c26302c, "$sessionData");
        C3388f c3388f = f14324a;
        try {
            C24861r.a aVar = C24861r.f119264q;
            long m4280v6 = AbstractC0924m0.m4280v6();
            if (m4280v6 > 0) {
                m4280v6 = System.currentTimeMillis() - m4280v6;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", String.valueOf(c26302c.m135411l()));
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c3388f.m17052l(3, 10, 33, "1", "10", str, String.valueOf(m4280v6), jSONObject2, "", "", "");
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC23350e.m122776f("SearchDiscovery", m129221e);
        }
    }

    /* renamed from: l */
    private final void m17052l(final int i11, final int i12, final int i13, final String... strArr) {
        C0815e1.m2075D().m2099U(i11, i12, i13, (String[]) Arrays.copyOf(strArr, strArr.length));
        AbstractC19444a.m101695c(new Runnable() { // from class: ca0.d
            @Override // java.lang.Runnable
            public final void run() {
                C3388f.m17053m(i11, i12, i13, strArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m17053m(int i11, int i12, int i13, String[] strArr) {
        AbstractC19074t.m100208f(strArr, "$params");
        SearchGlobalTrackingLogPanelLayout.Companion.m73464c(new AbstractC29069a.x(i11, i12, i13, strArr));
    }

    /* renamed from: n */
    private final void m17054n(C26302c c26302c, String str, String str2) {
        if (str.length() == 0) {
            c26302c.m135420u("0");
            c26302c.m135419t("0");
            c26302c.m135418s("1");
            return;
        }
        if (AbstractC19074t.m100204b(str, str2) && !AbstractC19074t.m100204b(c26302c.m135403d(), str2)) {
            c26302c.m135417r(str2);
            c26302c.m135418s("2");
        }
        if (!AbstractC19074t.m100204b(c26302c.m135404e(), "1")) {
            c26302c.m135419t(c26302c.m135404e());
            c26302c.m135418s("1");
        } else {
            c26302c.m135419t("1");
        }
        if (!AbstractC19074t.m100204b(c26302c.m135406g(), "0") && !AbstractC19074t.m100204b(c26302c.m135406g(), c26302c.m135405f())) {
            c26302c.m135419t("3");
        }
        c26302c.m135420u(c26302c.m135405f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m17055p() {
        AbstractC0924m0.m3911ip(System.currentTimeMillis());
    }

    /* renamed from: f */
    public final void m17056f(final C26302c c26302c) {
        AbstractC19074t.m100208f(c26302c, "sessionData");
        final String m135401b = c26302c.m135401b();
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ca0.c
            @Override // java.lang.Runnable
            public final void run() {
                C3388f.m17049g(C26302c.this, m135401b);
            }
        });
    }

    /* renamed from: h */
    public final void m17057h(final C26302c c26302c) {
        AbstractC19074t.m100208f(c26302c, "sessionData");
        final String m135401b = c26302c.m135401b();
        if (m135401b.length() == 0) {
            return;
        }
        final String m135402c = c26302c.m135402c();
        f14325b.mo13474a(new Runnable() { // from class: ca0.e
            @Override // java.lang.Runnable
            public final void run() {
                C3388f.m17050i(C26302c.this, m135401b, m135402c);
            }
        });
    }

    /* renamed from: j */
    public final void m17058j(final C26302c c26302c, final String str) {
        AbstractC19074t.m100208f(c26302c, "sessionData");
        AbstractC19074t.m100208f(str, "openSourceAction");
        f14325b.mo13474a(new Runnable() { // from class: ca0.b
            @Override // java.lang.Runnable
            public final void run() {
                C3388f.m17051k(str, c26302c);
            }
        });
    }

    /* renamed from: o */
    public final void m17059o() {
        f14325b.mo13474a(new Runnable() { // from class: ca0.a
            @Override // java.lang.Runnable
            public final void run() {
                C3388f.m17055p();
            }
        });
    }
}
