package im;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import p148f3.C18711c;
import p227i3.AbstractC20216t;
import p227i3.C20215s;
import p227i3.C20219w;
import p667y2.C30268e;
import p667y2.C30271h;

/* renamed from: im.g */
/* loaded from: classes3.dex */
public abstract class AbstractC20616g {
    /* renamed from: a */
    public static final JSONObject m107311a(C20610a c20610a) {
        AbstractC19074t.m100208f(c20610a, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("cid", c20610a.m107252a());
        jSONObject.accumulate("id", c20610a.m107253b());
        jSONObject.accumulate(C20215s.f99966b, 0);
        return jSONObject;
    }

    /* renamed from: b */
    public static final JSONObject m107312b(C20615f c20615f) {
        AbstractC19074t.m100208f(c20615f, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate(C18711c.f94014e, c20615f.m107308a());
        jSONObject.accumulate(C20215s.f99966b, Integer.valueOf(c20615f.m107309b()));
        jSONObject.accumulate(AbstractC20216t.f99969a, Integer.valueOf(c20615f.m107310c()));
        return jSONObject;
    }

    /* renamed from: c */
    public static final JSONObject m107313c(C20618i c20618i) {
        AbstractC19074t.m100208f(c20618i, "<this>");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("st", c20618i.m107326b().m107323b());
        jSONObject2.put("ts", c20618i.m107326b().m107324c());
        jSONObject2.put("id", c20618i.m107326b().m107322a());
        jSONObject.put("pmsg", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("st", c20618i.m107327c().m107323b());
        jSONObject3.put("ts", c20618i.m107327c().m107324c());
        jSONObject3.put("id", c20618i.m107327c().m107322a());
        jSONObject.put("rmsg", jSONObject3);
        jSONObject.put("fwLvl", c20618i.m107325a());
        return jSONObject;
    }

    /* renamed from: d */
    public static final JSONObject m107314d(C20619j c20619j) {
        AbstractC19074t.m100208f(c20619j, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("id", Integer.valueOf(c20619j.m107328a()));
        return jSONObject;
    }

    /* renamed from: e */
    public static final JSONObject m107315e(C20620k c20620k) {
        AbstractC19074t.m100208f(c20620k, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ct", c20620k.m107332c());
        jSONObject.put("di", c20620k.m107335f() ? 1 : 0);
        jSONObject.put(C30268e.f140632a, c20620k.m107333d());
        jSONObject.put("fn", c20620k.m107334e());
        jSONObject.put(C30271h.f140642d, c20620k.m107336g());
        jSONObject.put("la", c20620k.m107337h());
        jSONObject.put("lo", c20620k.m107338i());
        jSONObject.put("po", c20620k.m107339j());
        jSONObject.put(C20215s.f99966b, c20620k.m107341l());
        jSONObject.put(AbstractC20216t.f99969a, c20620k.m107342m());
        jSONObject.put(C20219w.f100062c, c20620k.m107348s());
        jSONObject.put("ss", c20620k.m107340k());
        jSONObject.put("an", c20620k.m107331b());
        jSONObject.put("vc", c20620k.m107344o());
        jSONObject.put("vb", c20620k.m107343n());
        jSONObject.put("vfr", c20620k.m107345p());
        jSONObject.put("vl", c20620k.m107346q());
        jSONObject.put("vp", c20620k.m107347r());
        jSONObject.put("scsh", c20620k.m107349t() ? 1 : 0);
        return jSONObject;
    }

    /* renamed from: f */
    public static final JSONObject m107316f(C20621l c20621l) {
        AbstractC19074t.m100208f(c20621l, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("fo", Integer.valueOf(c20621l.m107372a() ? 1 : 0));
        jSONObject.accumulate("hu", Integer.valueOf(c20621l.m107373b() ? 1 : 0));
        return jSONObject;
    }

    /* renamed from: g */
    public static final JSONObject m107317g(C20622m c20622m) {
        AbstractC19074t.m100208f(c20622m, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("cid", Integer.valueOf(c20622m.m107374a()));
        jSONObject.accumulate("id", Integer.valueOf(c20622m.m107375b()));
        return jSONObject;
    }

    /* renamed from: h */
    public static final JSONObject m107318h(C20623n c20623n) {
        AbstractC19074t.m100208f(c20623n, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("a", Integer.valueOf(c20623n.m107376a()));
        jSONObject.accumulate(C18711c.f94014e, Integer.valueOf(c20623n.m107378c()));
        jSONObject.accumulate("f", Integer.valueOf(c20623n.m107379d()));
        jSONObject.accumulate(AbstractC20216t.f99969a, Integer.valueOf(c20623n.m107377b()));
        return jSONObject;
    }

    /* renamed from: i */
    public static final JSONObject m107319i(C20624o c20624o) {
        AbstractC19074t.m100208f(c20624o, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("l", c20624o.m107380a());
        jSONObject.put("r", c20624o.m107381b());
        jSONObject.put(C20215s.f99966b, c20624o.m107382c());
        return jSONObject;
    }

    /* renamed from: j */
    public static final JSONObject m107320j(C20625p c20625p) {
        AbstractC19074t.m100208f(c20625p, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C20215s.f99966b, c20625p.m107384b());
        jSONObject.put(C30268e.f140632a, c20625p.m107383a());
        return jSONObject;
    }

    /* renamed from: k */
    public static final JSONObject m107321k(C20610a c20610a) {
        AbstractC19074t.m100208f(c20610a, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("cid", c20610a.m107252a());
        jSONObject.accumulate("id", c20610a.m107253b());
        jSONObject.accumulate(C20215s.f99966b, 1);
        return jSONObject;
    }
}
