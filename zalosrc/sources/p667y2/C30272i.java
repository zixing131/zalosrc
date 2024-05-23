package p667y2;

import android.content.Context;
import org.json.JSONObject;
import p116e.C18151b;
import p116e.C18153d;
import p144f.AbstractC18681a;
import p148f3.C18709a;
import p148f3.C18710b;
import p148f3.C18711c;

/* renamed from: y2.i */
/* loaded from: classes2.dex */
public final class C30272i extends AbstractC18681a {

    /* renamed from: d */
    public static final String f140644d = "i";

    /* renamed from: e */
    private static C30272i f140645e;

    private C30272i(Context context) {
        m98583b(context, C30272i.class);
    }

    /* renamed from: e */
    private String m149391e(int i11) {
        return "ABTesting_" + i11;
    }

    /* renamed from: f */
    private String m149392f(String str, String str2) {
        return "Banner_" + str + "_" + str2;
    }

    /* renamed from: g */
    public static C30272i m149393g(Context context) {
        if (f140645e == null) {
            f140645e = new C30272i(context);
        }
        return f140645e;
    }

    /* renamed from: o */
    private String m149394o(String str) {
        return "Interstitial_" + str;
    }

    /* renamed from: p */
    private String m149395p(String str) {
        return "VideoReward_" + str;
    }

    /* renamed from: h */
    public boolean m149396h(int i11, C18709a c18709a) {
        try {
            c18709a.f94008e = System.currentTimeMillis();
            m149400l().m96449d(m149391e(i11), c18709a.m98676d(), 0L);
            return super.m98585d(m149391e(i11), c18709a.m98676d().toString(), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public boolean m149397i(String str, C18710b c18710b) {
        try {
            m149400l().m96449d(m149394o(str), c18710b.m98679c(), 0L);
            return super.m98585d(m149394o(str), c18710b.m98679c().toString(), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    public boolean m149398j(String str, C18711c c18711c) {
        try {
            m149400l().m96449d(m149395p(str), c18711c.m98682c(), 0L);
            return super.m98585d(m149395p(str), c18711c.m98682c().toString(), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public boolean m149399k(String str, String str2, C18709a c18709a) {
        try {
            m149400l().m96449d(m149392f(str, str2), c18709a.m98676d(), 0L);
            return super.m98585d(m149392f(str, str2), c18709a.m98676d().toString(), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    public C18153d m149400l() {
        try {
            return C18151b.m96441a().m96442b(f140644d, 1024);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public C18709a m149401m(int i11) {
        String m98582a;
        JSONObject jSONObject;
        C18709a c18709a = null;
        try {
            C18153d m149400l = m149400l();
            try {
                c18709a = C18709a.m98674b((JSONObject) m149400l.m96447b(m149391e(i11)));
            } catch (Exception unused) {
            }
            if (c18709a == null && (m98582a = super.m98582a(m149391e(i11))) != null && (c18709a = C18709a.m98674b((jSONObject = new JSONObject(m98582a)))) != null) {
                m149400l.m96448c(m149391e(i11), jSONObject);
            }
        } catch (Exception unused2) {
        }
        return c18709a;
    }

    /* renamed from: n */
    public C18709a m149402n(String str, String str2) {
        String m98582a;
        JSONObject jSONObject;
        C18709a c18709a = null;
        try {
            C18153d m149400l = m149400l();
            try {
                c18709a = C18709a.m98674b((JSONObject) m149400l.m96447b(m149392f(str, str2)));
            } catch (Exception unused) {
            }
            if (c18709a == null && (m98582a = super.m98582a(m149392f(str, str2))) != null && (c18709a = C18709a.m98674b((jSONObject = new JSONObject(m98582a)))) != null) {
                m149400l.m96449d(m149392f(str, str2), jSONObject, 0L);
            }
        } catch (Exception unused2) {
        }
        return c18709a;
    }

    /* renamed from: q */
    public C18710b m149403q(String str) {
        String m98582a;
        JSONObject jSONObject;
        C18710b c18710b = null;
        try {
            C18153d m149400l = m149400l();
            try {
                c18710b = C18710b.m98677a((JSONObject) m149400l.m96447b(m149394o(str)));
            } catch (Exception unused) {
            }
            if (c18710b == null && (m98582a = super.m98582a(m149394o(str))) != null && (c18710b = C18710b.m98677a((jSONObject = new JSONObject(m98582a)))) != null) {
                m149400l.m96448c(m149394o(str), jSONObject);
            }
        } catch (Exception unused2) {
        }
        return c18710b;
    }

    /* renamed from: r */
    public C18711c m149404r(String str) {
        String m98582a;
        JSONObject jSONObject;
        C18711c c18711c = null;
        try {
            C18153d m149400l = m149400l();
            try {
                c18711c = C18711c.m98680a((JSONObject) m149400l.m96447b(m149395p(str)));
            } catch (Exception unused) {
            }
            if (c18711c == null && (m98582a = super.m98582a(m149395p(str))) != null && (c18711c = C18711c.m98680a((jSONObject = new JSONObject(m98582a)))) != null) {
                m149400l.m96448c(m149395p(str), jSONObject);
            }
        } catch (Exception unused2) {
        }
        return c18711c;
    }
}
