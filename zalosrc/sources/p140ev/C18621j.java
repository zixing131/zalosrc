package p140ev;

import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p621wu.C29249f;

/* renamed from: ev.j */
/* loaded from: classes4.dex */
public final class C18621j {

    /* renamed from: a */
    private final HashMap f93705a = new HashMap();

    /* renamed from: b */
    private String f93706b = "";

    /* renamed from: a */
    public final void m98409a() {
        this.f93706b = "";
        this.f93705a.clear();
    }

    /* renamed from: b */
    public final String m98410b() {
        C18622k m146029d = C29249f.Companion.m146032b().m146029d(this.f93706b);
        if (m146029d != null && m146029d.m98419d() && m146029d.m98418c() != null) {
            return m146029d.m98418c();
        }
        return "";
    }

    /* renamed from: c */
    public final Map m98411c() {
        return this.f93705a;
    }

    /* renamed from: d */
    public final C18623l m98412d(String str) {
        if (str == null) {
            return null;
        }
        return (C18623l) this.f93705a.get(str);
    }

    /* renamed from: e */
    public final synchronized void m98413e() {
        String str;
        String str2;
        try {
            C18622k m146029d = C29249f.Companion.m146032b().m146029d(this.f93706b);
            if (m146029d == null) {
                return;
            }
            List<C18624m> m98416a = m146029d.m98416a();
            if (m98416a.isEmpty()) {
                return;
            }
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            for (C18624m c18624m : m98416a) {
                if (c18624m != null && c18624m.m98428c()) {
                    str = "https";
                } else {
                    str = "http";
                }
                String str3 = null;
                if (c18624m != null) {
                    str2 = c18624m.m98426a();
                } else {
                    str2 = null;
                }
                if (c18624m != null) {
                    str3 = c18624m.m98427b();
                }
                cookieManager.setCookie(str + "://" + str2 + str3, String.valueOf(c18624m));
            }
            CookieManager.getInstance().flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public final void m98414f(String str, String str2, List list) {
        if (str == null) {
            return;
        }
        this.f93706b = str;
        C18622k c18622k = new C18622k(str, str2, System.currentTimeMillis(), list);
        if (c18622k.m98419d()) {
            C29249f.Companion.m146032b().m146030e(str, c18622k);
        }
    }

    /* renamed from: g */
    public final void m98415g(HashMap hashMap) {
        this.f93705a.clear();
        if (hashMap != null) {
            this.f93705a.putAll(hashMap);
        }
    }
}
