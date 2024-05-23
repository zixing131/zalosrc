package p667y2;

import android.content.Context;
import com.adtima.Adtima;
import org.json.JSONObject;
import p009a3.C0097b;
import p116e.C18151b;
import p116e.C18153d;
import p144f.AbstractC18681a;

/* renamed from: y2.c */
/* loaded from: classes2.dex */
public final class C30266c extends AbstractC18681a {

    /* renamed from: d */
    private static final String f140614d = "c";

    /* renamed from: e */
    private static C30266c f140615e;

    private C30266c(Context context) {
        m98583b(context, C30266c.class);
    }

    /* renamed from: e */
    public static C30266c m149335e(Context context) {
        if (f140615e == null) {
            f140615e = new C30266c(context);
        }
        return f140615e;
    }

    /* renamed from: f */
    public boolean m149336f(C0097b c0097b) {
        try {
            C18153d m149338h = m149338h();
            String str = f140614d;
            m149338h.m96449d(str, c0097b.m439e(), 0L);
            return m98585d(str, c0097b.m439e().toString(), 0L);
        } catch (Exception e11) {
            Adtima.m18329e(f140614d, "setConfigCache", e11);
            return false;
        }
    }

    /* renamed from: g */
    public C0097b m149337g() {
        String str;
        String m98582a;
        JSONObject jSONObject;
        C0097b c0097b = null;
        try {
            C18153d m149338h = m149338h();
            try {
                c0097b = C0097b.m437d((JSONObject) m149338h.m96447b(f140614d));
            } catch (Exception e11) {
                Adtima.m18329e(f140614d, "getLocalConfig0", e11);
            }
            if (c0097b == null && (m98582a = m98582a((str = f140614d))) != null && (c0097b = C0097b.m437d((jSONObject = new JSONObject(m98582a)))) != null) {
                m149338h.m96449d(str, jSONObject, 0L);
            }
        } catch (Exception e12) {
            Adtima.m18329e(f140614d, "getLocalConfig1", e12);
        }
        return c0097b;
    }

    /* renamed from: h */
    public C18153d m149338h() {
        try {
            return C18151b.m96441a().m96442b(f140614d, 1024);
        } catch (Exception e11) {
            Adtima.m18329e(f140614d, "getLRUCacheAdapter", e11);
            return null;
        }
    }
}
