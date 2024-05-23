package n00;

import ai.C0862b;
import ai.InterfaceC0861a;
import com.zing.zalo.control.ContactProfile;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ga0.AbstractRunnableC19355q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mm0.AbstractC23350e;
import o00.C23976b;
import org.json.JSONArray;
import org.json.JSONObject;
import p612wk.AbstractC29072d;
import pm0.C24848g0;
import sk.C26300a;
import sk.C26301b;
import sk.C26302c;
import sk.C26303d;

/* renamed from: n00.i */
/* loaded from: classes4.dex */
public final class C23515i extends AbstractRunnableC19355q1 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C18316b f114188s;

    /* renamed from: n00.i$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23515i(InterfaceC18319c interfaceC18319c, C18316b c18316b) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        this.f114188s = c18316b;
    }

    /* renamed from: l */
    private final JSONObject m123421l(C0862b c0862b) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("item_type", 2);
            jSONObject.put("click_action", "action.globalsearch.result.click_ma");
            jSONObject.put("info", C23976b.f116043a.m125474c(c0862b));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: m */
    private final JSONObject m123422m(ContactProfile contactProfile) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("item_type", 1);
            jSONObject.put("click_action", "action.globalsearch.result.click_oa");
            jSONObject.put("info", C23976b.f116043a.m125475d(contactProfile));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private final JSONArray m123423n(List list) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0861a interfaceC0861a = (InterfaceC0861a) it.next();
            try {
                if (interfaceC0861a instanceof C0862b) {
                    jSONObject = m123421l((C0862b) interfaceC0861a);
                } else if (interfaceC0861a instanceof ContactProfile) {
                    jSONObject = m123422m((ContactProfile) interfaceC0861a);
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return jSONArray;
    }

    /* renamed from: o */
    private final JSONObject m123424o(C26300a c26300a) {
        JSONObject m135389a = c26300a.m135389a();
        if (m135389a == null) {
            return new JSONObject();
        }
        return m135389a;
    }

    /* renamed from: p */
    private final JSONArray m123425p(C26301b c26301b) {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(m123426q(c26301b.m135398e()));
            jSONArray.put(m123426q(c26301b.m135396c()));
            jSONArray.put(m123426q(c26301b.m135397d()));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONArray;
    }

    /* renamed from: q */
    private final JSONObject m123426q(C26303d c26303d) {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject();
        try {
            synchronized (c26303d) {
                jSONObject.put("section_id", c26303d.m135425c().m135432c() + 1);
                jSONObject.put("state", m123428s(c26303d.m135426d()));
                arrayList = new ArrayList(c26303d.m135423a());
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            jSONObject.put("list_data", m123423n(arrayList));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: r */
    private final void m123427r(JSONObject jSONObject) {
        m101440g(new C18316b("SearchDiscovery.Task.SubmitData", jSONObject, null, null, 12, null));
    }

    /* renamed from: s */
    private final int m123428s(AbstractC29072d abstractC29072d) {
        if (AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.b.f134804a)) {
            return 0;
        }
        if (AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.c.f134805a)) {
            return 1;
        }
        if (AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.a.f134803a)) {
            return 2;
        }
        if (AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.d.f134806a)) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: t */
    private final JSONObject m123429t(String str, C26300a c26300a, C26301b c26301b, long j11, boolean z11) {
        JSONObject m123424o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("keyword", str);
        jSONObject.put("session_id", j11);
        if (str.length() == 0 || z11) {
            m123424o = m123424o(c26300a);
        } else {
            m123424o = new JSONObject();
        }
        jSONObject.put("pre_state", m123424o);
        jSONObject.put("result", m123425p(c26301b));
        return jSONObject;
    }

    /* renamed from: u */
    static /* synthetic */ JSONObject m123430u(C23515i c23515i, String str, C26300a c26300a, C26301b c26301b, long j11, boolean z11, int i11, Object obj) {
        boolean z12;
        if ((i11 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        return c23515i.m123429t(str, c26300a, c26301b, j11, z12);
    }

    /* renamed from: w */
    private final JSONObject m123431w(C26302c c26302c, C26300a c26300a) {
        return m123429t(c26302c.m135401b(), c26300a, c26302c.m135409j(), c26302c.m135411l(), true);
    }

    /* renamed from: x */
    private final JSONObject m123432x(C26302c c26302c, C26301b c26301b) {
        return m123430u(this, c26302c.m135401b(), c26302c.m135407h(), c26301b, c26302c.m135411l(), false, 16, null);
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C18316b c18316b;
        InterfaceC18319c m101438e = m101438e();
        C26302c c26302c = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C26302c) {
            c26302c = (C26302c) obj;
        }
        if (c26302c != null && AbstractC19074t.m100204b(this.f114188s.m97246b(), "SearchDiscovery.Task.TransformPreStateResultData")) {
            Object m97245a = this.f114188s.m97245a();
            if (m97245a instanceof C26300a) {
                m123427r(m123431w(c26302c, (C26300a) this.f114188s.m97245a()));
            } else if (m97245a instanceof C26301b) {
                m123427r(m123432x(c26302c, (C26301b) this.f114188s.m97245a()));
            }
        }
    }
}
