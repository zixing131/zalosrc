package p189gv;

import android.graphics.Bitmap;
import fn0.AbstractC19074t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p218hv.C20132a;
import yt.AbstractC31072b;
import yt.EnumC31074d;

/* renamed from: gv.h */
/* loaded from: classes4.dex */
public final class C19609h extends AbstractC31072b implements Serializable {

    /* renamed from: p */
    private String f97388p;

    /* renamed from: q */
    private String f97389q;

    /* renamed from: r */
    private String f97390r;

    /* renamed from: s */
    private String f97391s;

    /* renamed from: t */
    private String f97392t;

    /* renamed from: u */
    private boolean f97393u;

    /* renamed from: v */
    private String f97394v;

    /* renamed from: w */
    private Map f97395w;

    /* renamed from: x */
    private List f97396x;

    /* renamed from: y */
    private String f97397y;

    public C19609h(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z11;
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f97388p = "";
        this.f97389q = "";
        this.f97390r = "";
        this.f97391s = "";
        this.f97392t = "";
        this.f97394v = "";
        this.f97395w = new LinkedHashMap();
        this.f97396x = new ArrayList();
        String optString = jSONObject.optString("mpUrl");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f97388p = optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("mpInfo");
        if (optJSONObject != null) {
            str = optJSONObject.optString("appId");
        } else {
            str = null;
        }
        this.f97389q = str == null ? "" : str;
        if (optJSONObject != null) {
            str2 = optJSONObject.optString("appAvtUrl");
        } else {
            str2 = null;
        }
        this.f97390r = str2 == null ? "" : str2;
        if (optJSONObject != null) {
            str3 = optJSONObject.optString("appName");
        } else {
            str3 = null;
        }
        this.f97391s = str3 == null ? "" : str3;
        if (optJSONObject != null) {
            str4 = optJSONObject.optString("appQRUrl");
        } else {
            str4 = null;
        }
        this.f97392t = str4 == null ? "" : str4;
        if (optJSONObject != null) {
            z11 = optJSONObject.optBoolean("isDebugging");
        } else {
            z11 = false;
        }
        this.f97393u = z11;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
        String jSONObject2 = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f97394v = jSONObject2 != null ? jSONObject2 : "";
    }

    @Override // yt.AbstractC31072b
    /* renamed from: a */
    public Bitmap mo102607a() {
        return null;
    }

    @Override // yt.AbstractC31072b
    /* renamed from: b */
    public String mo102608b() {
        return null;
    }

    @Override // yt.AbstractC31072b
    /* renamed from: c */
    public EnumC31074d mo102609c() {
        return EnumC31074d.f143266q;
    }

    @Override // yt.AbstractC31072b
    /* renamed from: d */
    public String mo102610d() {
        return this.f97389q;
    }

    @Override // yt.AbstractC31072b
    /* renamed from: e */
    public String mo102611e() {
        return this.f97390r;
    }

    /* renamed from: f */
    public final String m102612f() {
        return this.f97390r;
    }

    /* renamed from: g */
    public final String m102613g() {
        return this.f97397y;
    }

    /* renamed from: h */
    public final JSONObject m102614h() {
        try {
            return new JSONObject(this.f97394v);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    /* renamed from: i */
    public final C20132a m102615i(String str) {
        AbstractC19074t.m100208f(str, "action");
        if (!this.f97395w.containsKey(str)) {
            return null;
        }
        return (C20132a) this.f97395w.get(str);
    }

    /* renamed from: j */
    public final String m102616j() {
        return this.f97389q;
    }

    /* renamed from: k */
    public final long m102617k() {
        try {
            return Long.parseLong(this.f97389q);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: l */
    public final String m102618l() {
        return this.f97392t;
    }

    /* renamed from: m */
    public final String m102619m() {
        return this.f97391s;
    }

    /* renamed from: n */
    public final String m102620n() {
        return this.f97388p;
    }

    /* renamed from: o */
    public final boolean m102621o(String str) {
        AbstractC19074t.m100208f(str, "permission");
        return this.f97396x.contains(str);
    }

    /* renamed from: p */
    public final boolean m102622p() {
        return this.f97393u;
    }

    /* renamed from: q */
    public final void m102623q(String str) {
        this.f97397y = str;
    }

    /* renamed from: r */
    public final void m102624r(Map map) {
        AbstractC19074t.m100208f(map, "dynamicAPIs");
        this.f97395w = map;
    }

    /* renamed from: s */
    public final void m102625s(List list) {
        AbstractC19074t.m100208f(list, "permissions");
        this.f97396x = list;
    }
}
