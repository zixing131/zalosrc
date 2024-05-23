package p667y2;

import android.content.Context;
import org.json.JSONObject;
import p009a3.C0097b;
import p116e.C18151b;
import p116e.C18153d;
import p144f.AbstractC18681a;

/* renamed from: y2.g */
/* loaded from: classes2.dex */
public class C30270g extends AbstractC18681a {

    /* renamed from: d */
    private static final String f140640d = "g";

    /* renamed from: e */
    private static C30270g f140641e;

    private C30270g(Context context) {
        m98583b(context, C30270g.class);
    }

    /* renamed from: e */
    public static C30270g m149382e(Context context) {
        if (f140641e == null) {
            f140641e = new C30270g(context);
        }
        return f140641e;
    }

    /* renamed from: f */
    public boolean m149383f(C0097b c0097b) {
        try {
            C18153d m149385h = m149385h();
            String str = f140640d;
            m149385h.m96449d(str, c0097b.m439e(), 0L);
            return m98585d(str, c0097b.m439e().toString(), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public C0097b m149384g() {
        String str;
        String m98582a;
        JSONObject jSONObject;
        C0097b c0097b = null;
        try {
            C18153d m149385h = m149385h();
            try {
                c0097b = C0097b.m437d((JSONObject) m149385h.m96447b(f140640d));
            } catch (Exception unused) {
            }
            if (c0097b == null && (m98582a = m98582a((str = f140640d))) != null && (c0097b = C0097b.m437d((jSONObject = new JSONObject(m98582a)))) != null) {
                m149385h.m96449d(str, jSONObject, 0L);
            }
        } catch (Exception unused2) {
        }
        return c0097b;
    }

    /* renamed from: h */
    public C18153d m149385h() {
        try {
            return C18151b.m96441a().m96442b(f140640d, 1024);
        } catch (Exception unused) {
            return null;
        }
    }
}
