package bo;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p217hs.C20120e;
import p348mi.AbstractC23309i;

/* renamed from: bo.g1 */
/* loaded from: classes4.dex */
public final class C2976g1 {

    /* renamed from: b */
    private long f11774b;

    /* renamed from: e */
    private boolean f11777e;

    /* renamed from: a */
    private String f11773a = "";

    /* renamed from: c */
    private boolean f11775c = true;

    /* renamed from: d */
    private List f11776d = new ArrayList();

    /* renamed from: e */
    private final boolean m14113e() {
        return !this.f11776d.isEmpty();
    }

    /* renamed from: f */
    private final boolean m14114f() {
        int size = this.f11776d.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C2988i3) this.f11776d.get(i11)).m14165d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String m14115a() {
        return this.f11773a;
    }

    /* renamed from: b */
    public final boolean m14116b() {
        return this.f11777e;
    }

    /* renamed from: c */
    public final List m14117c() {
        return this.f11776d;
    }

    /* renamed from: d */
    public final long m14118d() {
        return this.f11774b;
    }

    /* renamed from: g */
    public final boolean m14119g() {
        if (!m14113e()) {
            return false;
        }
        if (m14114f() && !AbstractC23309i.m121305Pd()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m14120h() {
        if (!this.f11775c || !m14119g() || !C20120e.f99217a.m104724c(0)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void m14121i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11773a = str;
    }

    /* renamed from: j */
    public final void m14122j(boolean z11) {
        this.f11777e = z11;
    }

    /* renamed from: k */
    public final void m14123k(boolean z11) {
        this.f11775c = z11;
    }

    /* renamed from: l */
    public final void m14124l(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f11776d = list;
    }

    /* renamed from: m */
    public final void m14125m(long j11) {
        this.f11774b = j11;
    }

    /* renamed from: n */
    public final JSONObject m14126n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedId", this.f11773a);
            jSONObject.put("timestamp", this.f11774b);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f11776d.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C2988i3) it.next()).m14170i());
            }
            jSONObject.put("suggests", jSONArray);
            jSONObject.put("showOnTimeline", this.f11775c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
