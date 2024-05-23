package is;

import ag0.C0815e1;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p142ey.C18644n;
import p361nb.C23648e;

/* renamed from: is.b */
/* loaded from: classes4.dex */
public final class C20785b {

    /* renamed from: a */
    public static final C20785b f102138a = new C20785b();

    private C20785b() {
    }

    /* renamed from: a */
    private final C23648e m108451a(String str, int i11, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("owner_type", i11);
        jSONObject.put("id", str2);
        return new C23648e(40, str3, 0, str, jSONObject.toString());
    }

    /* renamed from: b */
    private final C23648e m108452b(String str, int i11, String str2, String str3, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("owner_type", i11);
        jSONObject.put("id", str2);
        jSONObject.put("like_status", !z11 ? 1 : 0);
        return new C23648e(40, str3, 0, str, jSONObject.toString());
    }

    /* renamed from: c */
    private final void m108453c(C23648e c23648e) {
        C0815e1.m2075D().m2100V(c23648e, false);
    }

    /* renamed from: d */
    private final int m108454d(String str) {
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            return 0;
        }
        if (C18644n.m98531l().m98558u(str)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: e */
    public final void m108455e(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("comment_avt", m108454d(str), str, str2));
    }

    /* renamed from: f */
    public final void m108456f(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("comment_cover", m108454d(str), str, str2));
    }

    /* renamed from: g */
    public final void m108457g(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("download_avt", m108454d(str), str, str2));
    }

    /* renamed from: h */
    public final void m108458h(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("download_cover", m108454d(str), str, str2));
    }

    /* renamed from: i */
    public final void m108459i(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108452b("like_avt", m108454d(str), str, str2, z11));
    }

    /* renamed from: j */
    public final void m108460j(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108452b("like_cover", m108454d(str), str, str2, z11));
    }

    /* renamed from: k */
    public final void m108461k(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("screenshot_avt", m108454d(str), str, str2));
    }

    /* renamed from: l */
    public final void m108462l(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("screenshot_cover", m108454d(str), str, str2));
    }

    /* renamed from: m */
    public final void m108463m(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("share_avt", m108454d(str), str, str2));
    }

    /* renamed from: n */
    public final void m108464n(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("share_cover", m108454d(str), str, str2));
    }

    /* renamed from: o */
    public final void m108465o(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("viewfull_avt", m108454d(str), str, str2));
    }

    /* renamed from: p */
    public final void m108466p(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m108453c(m108451a("viewfull_cover", m108454d(str), str, str2));
    }
}
