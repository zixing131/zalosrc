package ml;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import p269jj.C21275a;
import sj.C26275a;

/* renamed from: ml.a */
/* loaded from: classes3.dex */
public final class C23343a {

    /* renamed from: a */
    public static final C23343a f113550a = new C23343a();

    private C23343a() {
    }

    /* renamed from: a */
    private final boolean m122748a(C26275a c26275a, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!c26275a.m135168d() && c26275a.m135171g() == i11 && c26275a.m135174j().length() > 0 && c26275a.m135172h() > 0 && c26275a.m135172h() < c26275a.m135167c() && c26275a.m135172h() <= currentTimeMillis && c26275a.m135167c() > 0 && currentTimeMillis <= c26275a.m135167c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m122749b(C21275a c21275a, int i11, int i12) {
        AbstractC19074t.m100208f(c21275a, "commonRepo");
        Map m110203e = c21275a.m110203e();
        C26275a c26275a = (C26275a) m110203e.get(Integer.valueOf(i11));
        if (c26275a != null && i12 == c26275a.m135170f()) {
            c26275a.m135175k(true);
            c21275a.m110207m(m110203e, m122750c(m110203e));
        }
    }

    /* renamed from: c */
    public static final JSONArray m122750c(Map map) {
        AbstractC19074t.m100208f(map, "newDataMap");
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(((C26275a) it.next()).m135176l());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static final C26275a m122751d(C21275a c21275a, int i11) {
        AbstractC19074t.m100208f(c21275a, "commonRepo");
        C26275a c26275a = (C26275a) c21275a.m110203e().get(Integer.valueOf(i11));
        if (c26275a != null && !f113550a.m122748a(c26275a, i11)) {
            return null;
        }
        return c26275a;
    }
}
