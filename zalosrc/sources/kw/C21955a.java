package kw;

import ag0.C0815e1;
import b40.C2526d;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p361nb.C23649f;

/* renamed from: kw.a */
/* loaded from: classes4.dex */
public final class C21955a {

    /* renamed from: a */
    public static final C21955a f108070a = new C21955a();

    private C21955a() {
    }

    /* renamed from: a */
    private final JSONObject m114634a(JSONObject jSONObject, boolean z11) {
        String str;
        if (z11) {
            str = "pinned";
        } else {
            str = "manual";
        }
        jSONObject.put("ct", str);
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m114635b(JSONObject jSONObject, String str) {
        jSONObject.put("src", str);
        return jSONObject;
    }

    /* renamed from: c */
    private final JSONObject m114636c(JSONObject jSONObject, HashMap hashMap) {
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).intValue());
        }
        jSONObject.put("mt", jSONObject2);
        return jSONObject;
    }

    /* renamed from: d */
    public final String m114637d(String str, HashMap hashMap, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(hashMap, "mapStatsMsgType");
        JSONObject jSONObject = new JSONObject();
        C21955a c21955a = f108070a;
        c21955a.m114635b(jSONObject, str);
        c21955a.m114634a(jSONObject, z11);
        c21955a.m114636c(jSONObject, hashMap);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        C21956b.m114657g("ActionLogV2", jSONObject2);
        return jSONObject2;
    }

    /* renamed from: e */
    public final String m114638e(String str, JSONObject jSONObject, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(jSONObject, "jsObjectStatsMsgType");
        JSONObject jSONObject2 = new JSONObject();
        C21955a c21955a = f108070a;
        c21955a.m114635b(jSONObject2, str);
        c21955a.m114634a(jSONObject2, z11);
        jSONObject2.put("mt", jSONObject);
        String jSONObject3 = jSONObject2.toString();
        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
        C21956b.m114657g("ActionLogV2", jSONObject3);
        return jSONObject3;
    }

    /* renamed from: f */
    public final String m114639f(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        JSONObject jSONObject = new JSONObject();
        f108070a.m114635b(jSONObject, str);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        C21956b.m114657g("ActionLogV2", jSONObject2);
        return jSONObject2;
    }

    /* renamed from: g */
    public final String m114640g(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        JSONObject jSONObject = new JSONObject();
        f108070a.m114635b(jSONObject, str);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        C21956b.m114657g("ActionLogV2", jSONObject2);
        return jSONObject2;
    }

    /* renamed from: h */
    public final String m114641h(String str, HashMap hashMap, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(hashMap, "mapStatsMsgType");
        return m114637d(str, hashMap, z11);
    }

    /* renamed from: i */
    public final String m114642i(String str, JSONObject jSONObject, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(jSONObject, "jsObjectStatsMsgType");
        return m114638e(str, jSONObject, z11);
    }

    /* renamed from: j */
    public final String m114643j(List list) {
        AbstractC19074t.m100208f(list, "listMessage");
        C0815e1 m2075D = C0815e1.m2075D();
        C23649f[] m12715j = C2526d.f10270a.m12715j(list);
        String m2118s = m2075D.m2118s("4", (C23649f[]) Arrays.copyOf(m12715j, m12715j.length));
        AbstractC19074t.m100207e(m2118s, "generateParamActionLogV2ChatCore(...)");
        return m2118s;
    }

    /* renamed from: k */
    public final void m114644k(String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "extendParam");
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(53).m123923p("message_collection_additem").m123924q(1).m123925r(str).m123926s(str2), false);
    }

    /* renamed from: l */
    public final void m114645l(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(53).m123923p("mycloud_collection_addmore").m123924q(1).m123925r(str), false);
    }

    /* renamed from: m */
    public final void m114646m(String str, boolean z11) {
        String str2;
        AbstractC19074t.m100208f(str, "entryPoint");
        if (z11) {
            str2 = "pinned";
        } else {
            str2 = "manual";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, str2);
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(53).m123923p("mycloud_collection_detail").m123924q(1).m123925r(str).m123926s("", jSONObject.toString()), false);
    }

    /* renamed from: n */
    public final void m114647n() {
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(53).m123923p("mycloud_collection_list").m123924q(1).m123925r(""), false);
    }

    /* renamed from: o */
    public final void m114648o(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(53).m123923p("mycloud_collection_name").m123924q(1).m123925r(str), false);
    }

    /* renamed from: p */
    public final void m114649p(boolean z11) {
        String str;
        if (z11) {
            str = "mycloud_collection_toggle_show";
        } else {
            str = "mycloud_collection_toggle_hide";
        }
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(53).m123923p(str).m123924q(0).m123925r(""), false);
    }

    /* renamed from: q */
    public final void m114650q(long j11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "extendParam");
        C0815e1.m2075D().m2100V(C23648e.Companion.m123929a().m123927t(53).m123923p("mycloud_collection_detail_stats").m123924q(1).m123925r(str).m123926s(str2), false);
        AbstractC23306f.m120602N0().m109058K1(j11);
    }
}
