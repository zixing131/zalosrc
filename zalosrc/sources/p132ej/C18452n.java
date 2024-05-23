package p132ej;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import p716zh.C31937h;
import tj.C26715g;

/* renamed from: ej.n */
/* loaded from: classes3.dex */
public final class C18452n extends C18451m {

    /* renamed from: e */
    private final C26715g f92994e;

    /* renamed from: f */
    public int f92995f;

    /* renamed from: g */
    private String f92996g;

    /* renamed from: h */
    private C31937h f92997h;

    /* renamed from: i */
    public int f92998i;

    /* renamed from: j */
    public String f92999j;

    /* renamed from: k */
    public String f93000k;

    /* renamed from: l */
    public int f93001l;

    /* renamed from: m */
    public int f93002m;

    /* renamed from: n */
    public String f93003n;

    /* renamed from: o */
    public String f93004o;

    public C18452n(C26715g c26715g) {
        AbstractC19074t.m100208f(c26715g, "sm");
        this.f92994e = c26715g;
        this.f92996g = "";
        C31937h c31937h = new C31937h(new JSONObject(c26715g.m137371a()));
        this.f92997h = c31937h;
        this.f92999j = "";
        this.f93000k = "";
        String m153488i = c31937h.m153488i();
        AbstractC19074t.m100207e(m153488i, "getHref(...)");
        this.f93003n = m153488i;
        String m153491l = this.f92997h.m153491l();
        AbstractC19074t.m100207e(m153491l, "getParams(...)");
        this.f93004o = m153491l;
        this.f92995f = c26715g.m137377g();
    }

    /* renamed from: o */
    public final C31937h m97769o() {
        return this.f92997h;
    }

    /* renamed from: p */
    public final String m97770p() {
        return this.f92996g;
    }

    /* renamed from: q */
    public final C26715g m97771q() {
        return this.f92994e;
    }

    /* renamed from: r */
    public final long m97772r() {
        return this.f92994e.m137375e();
    }
}
