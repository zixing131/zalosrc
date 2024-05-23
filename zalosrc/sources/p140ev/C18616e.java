package p140ev;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Locale;
import on0.AbstractC24342w;
import org.json.JSONObject;

/* renamed from: ev.e */
/* loaded from: classes4.dex */
public final class C18616e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final JSONObject f93624a;

    /* renamed from: b */
    public String f93625b;

    /* renamed from: c */
    private String f93626c;

    /* renamed from: d */
    private String f93627d;

    /* renamed from: e */
    private boolean f93628e;

    /* renamed from: ev.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C18616e(JSONObject jSONObject) {
        boolean m127149O;
        String str = "";
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f93624a = jSONObject;
        this.f93627d = "open";
        try {
            String m98370f = m98370f(jSONObject, "ssid", "");
            m98377h(m98370f == null ? "" : m98370f);
            this.f93626c = m98371g(this, jSONObject, "password", null, 4, null);
            String m98370f2 = m98370f(jSONObject, "securityType", "open");
            if (m98370f2 != null) {
                str = m98370f2;
            }
            this.f93627d = str;
            if (jSONObject.has("hiddenSsid")) {
                this.f93628e = jSONObject.getBoolean("hiddenSsid");
            }
            if (TextUtils.isEmpty(this.f93626c)) {
                this.f93627d = "open";
                return;
            }
            String lowerCase = this.f93627d.toLowerCase(Locale.ROOT);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            m127149O = AbstractC24342w.m127149O(lowerCase, "wpa", false, 2, null);
            if (m127149O) {
                this.f93627d = "wpa_wpa2";
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
        }
    }

    /* renamed from: f */
    private final String m98370f(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.isNull(str)) {
            return str2;
        }
        return jSONObject.optString(str);
    }

    /* renamed from: g */
    static /* synthetic */ String m98371g(C18616e c18616e, JSONObject jSONObject, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        return c18616e.m98370f(jSONObject, str, str2);
    }

    /* renamed from: a */
    public final JSONObject m98372a() {
        return this.f93624a;
    }

    /* renamed from: b */
    public final boolean m98373b() {
        return this.f93628e;
    }

    /* renamed from: c */
    public final String m98374c() {
        return this.f93626c;
    }

    /* renamed from: d */
    public final String m98375d() {
        return this.f93627d;
    }

    /* renamed from: e */
    public final String m98376e() {
        String str = this.f93625b;
        if (str != null) {
            return str;
        }
        AbstractC19074t.m100223u("ssid");
        return null;
    }

    /* renamed from: h */
    public final void m98377h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f93625b = str;
    }
}
