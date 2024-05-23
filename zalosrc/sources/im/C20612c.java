package im;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p148f3.C18711c;
import p227i3.AbstractC20216t;
import p227i3.C20215s;
import p227i3.C20218v;
import pm0.C24848g0;

/* renamed from: im.c */
/* loaded from: classes3.dex */
public final class C20612c {

    /* renamed from: a */
    private int f101361a;

    /* renamed from: b */
    private int f101362b;

    /* renamed from: c */
    private C20620k f101363c;

    /* renamed from: d */
    private C20611b f101364d;

    /* renamed from: e */
    private C20619j f101365e;

    /* renamed from: f */
    private C20624o f101366f;

    /* renamed from: g */
    private C20621l f101367g;

    /* renamed from: h */
    private C20625p f101368h;

    /* renamed from: i */
    private List f101369i;

    /* renamed from: j */
    private List f101370j;

    /* renamed from: k */
    private List f101371k;

    /* renamed from: l */
    private List f101372l;

    /* renamed from: m */
    private List f101373m;

    /* renamed from: n */
    private int f101374n;

    /* renamed from: o */
    private int f101375o;

    /* renamed from: p */
    private double f101376p;

    /* renamed from: q */
    private double f101377q;

    /* renamed from: r */
    private boolean f101378r;

    /* renamed from: s */
    private boolean f101379s;

    /* renamed from: t */
    private boolean f101380t;

    /* renamed from: u */
    private boolean f101381u;

    /* renamed from: v */
    private String f101382v;

    /* renamed from: w */
    private boolean f101383w;

    /* renamed from: x */
    private boolean f101384x;

    /* renamed from: y */
    private boolean f101385y;

    /* renamed from: z */
    private C20618i f101386z;

    public C20612c() {
        this(0, 0, null, 7, null);
    }

    /* renamed from: A */
    public final void m107259A(C20618i c20618i) {
        this.f101386z = c20618i;
    }

    /* renamed from: B */
    public final void m107260B(int i11) {
        this.f101375o = i11;
    }

    /* renamed from: C */
    public final void m107261C(double d11) {
        this.f101376p = d11;
    }

    /* renamed from: D */
    public final void m107262D(C20619j c20619j) {
        this.f101365e = c20619j;
    }

    /* renamed from: E */
    public final void m107263E(double d11) {
        this.f101377q = d11;
    }

    /* renamed from: F */
    public final void m107264F(C20620k c20620k) {
        this.f101363c = c20620k;
    }

    /* renamed from: G */
    public final void m107265G(boolean z11) {
        this.f101379s = z11;
    }

    /* renamed from: H */
    public final void m107266H(boolean z11) {
        this.f101385y = z11;
    }

    /* renamed from: I */
    public final void m107267I(C20621l c20621l) {
        this.f101367g = c20621l;
    }

    /* renamed from: J */
    public final void m107268J(String str) {
        this.f101382v = str;
    }

    /* renamed from: K */
    public final void m107269K(boolean z11) {
        this.f101378r = z11;
    }

    /* renamed from: L */
    public final void m107270L(int i11) {
        this.f101361a = i11;
    }

    /* renamed from: M */
    public final void m107271M(boolean z11) {
        this.f101380t = z11;
    }

    /* renamed from: N */
    public final void m107272N(boolean z11) {
        this.f101383w = z11;
    }

    /* renamed from: O */
    public final void m107273O(boolean z11) {
        this.f101384x = z11;
    }

    /* renamed from: P */
    public final void m107274P(C20624o c20624o) {
        this.f101366f = c20624o;
    }

    /* renamed from: Q */
    public final void m107275Q(C20625p c20625p) {
        this.f101368h = c20625p;
    }

    /* renamed from: R */
    public final void m107276R(int i11) {
        this.f101374n = i11;
    }

    /* renamed from: a */
    public final void m107277a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        List list = this.f101369i;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(AbstractC20616g.m107318h((C20623n) it.next()));
        }
        if (jSONArray.length() > 0) {
            jSONObject.accumulate("at2", jSONArray);
        }
    }

    /* renamed from: b */
    public final void m107278b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        JSONArray jSONArray = new JSONArray();
        for (C20610a c20610a : this.f101370j) {
            jSONArray.put(AbstractC20616g.m107311a(c20610a));
            this.f101381u = c20610a.m107254c();
        }
        for (C20610a c20610a2 : this.f101371k) {
            jSONArray.put(AbstractC20616g.m107321k(c20610a2));
            this.f101381u = c20610a2.m107254c();
        }
        if (jSONArray.length() > 0) {
            jSONObject.accumulate("af", jSONArray);
        }
    }

    /* renamed from: c */
    public final void m107279c(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        C20611b c20611b = this.f101364d;
        if (c20611b != null) {
            jSONObject.accumulate(C18711c.f94014e, Integer.valueOf(!c20611b.m107256b() ? 1 : 0));
            jSONObject.accumulate("f", Integer.valueOf(c20611b.m107255a()));
        }
    }

    /* renamed from: d */
    public final String m107280d() {
        JSONObject jSONObject = new JSONObject();
        try {
            m107289m(jSONObject);
            m107278b(jSONObject);
            m107284h(jSONObject);
            m107290n(jSONObject);
            m107277a(jSONObject);
            m107281e(jSONObject);
            m107292p(jSONObject);
            m107283g(jSONObject);
            m107279c(jSONObject);
            m107285i(jSONObject);
            m107288l(jSONObject);
            m107291o(jSONObject);
            jSONObject.accumulate("p", Integer.valueOf(this.f101381u ? 1 : 0));
            jSONObject.accumulate("sbf", Integer.valueOf(this.f101378r ? 1 : 0));
            jSONObject.accumulate("cp", Integer.valueOf(this.f101379s ? 1 : 0));
            if (this.f101380t) {
                jSONObject.accumulate("dsc", 1);
            }
            AbstractC20110a.f98889a.mo104548a(jSONObject.toString(), new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: e */
    public final void m107281e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        List list = this.f101372l;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(AbstractC20616g.m107312b((C20615f) it.next()));
        }
        if (jSONArray.length() > 0) {
            jSONObject.accumulate("d2", jSONArray);
        }
    }

    /* renamed from: f */
    public final void m107282f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        C20618i c20618i = this.f101386z;
        if (c20618i != null) {
            jSONObject.put("fw", AbstractC20616g.m107313c(c20618i));
        }
    }

    /* renamed from: g */
    public final void m107283g(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.accumulate("lat", Double.valueOf(this.f101376p));
        jSONObject2.accumulate("lon", Double.valueOf(this.f101377q));
        C24848g0 c24848g0 = C24848g0.f119245a;
        jSONObject.accumulate("ld", jSONObject2);
    }

    /* renamed from: h */
    public final void m107284h(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        C20619j c20619j = this.f101365e;
        if (c20619j != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(AbstractC20616g.m107314d(c20619j));
            this.f101381u = c20619j.m107329b();
            jSONObject.accumulate("lf", jSONArray);
        }
    }

    /* renamed from: i */
    public final void m107285i(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        C20620k c20620k = this.f101363c;
        if (c20620k != null) {
            jSONObject.accumulate("ofs", AbstractC20616g.m107315e(c20620k));
        }
    }

    /* renamed from: j */
    public final void m107286j(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        JSONObject jSONObject2 = new JSONObject();
        if (this.f101385y) {
            jSONObject2.accumulate("hd", 1);
        }
        if (jSONObject2.length() > 0) {
            jSONObject.accumulate("ph", jSONObject2);
        }
    }

    /* renamed from: k */
    public final void m107287k(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        C20621l c20621l = this.f101367g;
        if (c20621l != null) {
            jSONObject.accumulate("ps", AbstractC20616g.m107316f(c20621l));
        }
    }

    /* renamed from: l */
    public final void m107288l(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        String str = this.f101382v;
        if (str != null && str.length() > 0) {
            jSONObject.accumulate("pid", this.f101382v);
        }
    }

    /* renamed from: m */
    public final void m107289m(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        jSONObject.accumulate(C20215s.f99966b, Integer.valueOf(this.f101361a));
        jSONObject.accumulate("ds", Integer.valueOf(this.f101362b));
    }

    /* renamed from: n */
    public final void m107290n(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        List list = this.f101373m;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(AbstractC20616g.m107317g((C20622m) it.next()));
        }
        if (jSONArray.length() > 0) {
            jSONObject.accumulate("st", jSONArray);
        }
    }

    /* renamed from: o */
    public final void m107291o(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.accumulate("ic", Integer.valueOf(this.f101383w ? 1 : 0));
        C20625p c20625p = this.f101368h;
        if (c20625p != null) {
            jSONObject2.accumulate(AbstractC20216t.f99969a, AbstractC20616g.m107320j(c20625p));
        }
        if (this.f101384x) {
            jSONObject2.accumulate("hd", 1);
        }
        if (jSONObject2.length() > 0) {
            jSONObject.accumulate(C20218v.f100059b, jSONObject2);
        }
    }

    /* renamed from: p */
    public final void m107292p(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonReport");
        C20624o c20624o = this.f101366f;
        if (c20624o != null) {
            jSONObject.accumulate("lp", AbstractC20616g.m107319i(c20624o));
        }
    }

    /* renamed from: q */
    public final String m107293q() {
        JSONObject jSONObject = new JSONObject();
        try {
            m107289m(jSONObject);
            m107283g(jSONObject);
            m107285i(jSONObject);
            m107287k(jSONObject);
            m107288l(jSONObject);
            m107291o(jSONObject);
            m107286j(jSONObject);
            m107282f(jSONObject);
            AbstractC20110a.f98889a.mo104548a(jSONObject.toString(), new Object[0]);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: r */
    public final List m107294r() {
        return this.f101369i;
    }

    /* renamed from: s */
    public final List m107295s() {
        return this.f101370j;
    }

    /* renamed from: t */
    public final List m107296t() {
        return this.f101371k;
    }

    /* renamed from: u */
    public final C20611b m107297u() {
        return this.f101364d;
    }

    /* renamed from: v */
    public final List m107298v() {
        return this.f101372l;
    }

    /* renamed from: w */
    public final C20620k m107299w() {
        return this.f101363c;
    }

    /* renamed from: x */
    public final List m107300x() {
        return this.f101373m;
    }

    /* renamed from: y */
    public final void m107301y(C20611b c20611b) {
        this.f101364d = c20611b;
    }

    /* renamed from: z */
    public final void m107302z(int i11) {
        this.f101362b = i11;
    }

    public C20612c(int i11, int i12) {
        this(i11, i12, null, 4, null);
    }

    public C20612c(int i11, int i12, C20620k c20620k) {
        this.f101361a = i11;
        this.f101362b = i12;
        this.f101363c = c20620k;
        this.f101369i = new ArrayList();
        this.f101370j = new ArrayList();
        this.f101371k = new ArrayList();
        this.f101372l = new ArrayList();
        this.f101373m = new ArrayList();
        this.f101382v = "";
    }

    public /* synthetic */ C20612c(int i11, int i12, C20620k c20620k, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? -1 : i11, (i13 & 2) != 0 ? -1 : i12, (i13 & 4) != 0 ? null : c20620k);
    }
}
