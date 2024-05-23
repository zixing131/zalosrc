package p667y2;

import android.content.Context;
import org.json.JSONObject;
import p116e.C18151b;
import p116e.C18153d;
import p144f.AbstractC18681a;
import p148f3.C18709a;

/* renamed from: y2.h */
/* loaded from: classes2.dex */
public class C30271h extends AbstractC18681a {

    /* renamed from: d */
    public static final String f140642d = "h";

    /* renamed from: e */
    private static C30271h f140643e;

    private C30271h(Context context) {
        m98583b(context, C30271h.class);
    }

    /* renamed from: e */
    private String m149386e(String str, String str2) {
        return "Prio_Banner_" + str + "_" + str2;
    }

    /* renamed from: f */
    public static C30271h m149387f(Context context) {
        if (f140643e == null) {
            f140643e = new C30271h(context);
        }
        return f140643e;
    }

    /* renamed from: g */
    public boolean m149388g(String str, String str2, C18709a c18709a) {
        try {
            m149389h().m96449d(m149386e(str, str2), c18709a.m98676d(), 0L);
            return super.m98585d(m149386e(str, str2), c18709a.m98676d().toString(), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    public C18153d m149389h() {
        try {
            return C18151b.m96441a().m96442b(f140642d, 1024);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public C18709a m149390i(String str, String str2) {
        String m98582a;
        JSONObject jSONObject;
        C18709a c18709a = null;
        try {
            C18153d m149389h = m149389h();
            try {
                c18709a = C18709a.m98674b((JSONObject) m149389h.m96447b(m149386e(str, str2)));
            } catch (Exception unused) {
            }
            if (c18709a == null && (m98582a = super.m98582a(m149386e(str, str2))) != null && (c18709a = C18709a.m98674b((jSONObject = new JSONObject(m98582a)))) != null) {
                m149389h.m96449d(m149386e(str, str2), jSONObject, 0L);
            }
        } catch (Exception unused2) {
        }
        return c18709a;
    }
}
