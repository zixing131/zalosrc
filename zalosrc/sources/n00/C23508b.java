package n00;

import com.zing.zalo.control.ContactProfile;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ga0.AbstractRunnableC19355q1;
import ga0.C19310b1;
import ga0.C19322f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me0.C23024b7;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p461qu.AbstractC25495a;
import p578vk.AbstractC28275a;
import pm0.AbstractC24862s;
import pm0.C24861r;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import sk.C26300a;
import sk.C26302c;

/* renamed from: n00.b */
/* loaded from: classes4.dex */
public final class C23508b extends AbstractRunnableC19355q1 {

    /* renamed from: s */
    private final C18316b f114153s;

    public /* synthetic */ C23508b(InterfaceC18319c interfaceC18319c, C18316b c18316b, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, (i11 & 2) != 0 ? new C18316b("SearchDiscovery.Task.LoadPreState", null, null, null, 14, null) : c18316b);
    }

    /* renamed from: l */
    private final void m123389l(C26302c c26302c) {
        List m131185M0;
        List m131185M02;
        Object obj;
        Object obj2;
        int m131511r;
        boolean z11;
        CharSequence m127168X0;
        C19310b1 c19310b1 = C19310b1.f95897a;
        c19310b1.m101079n();
        m131185M0 = AbstractC25332a0.m131185M0(c19310b1.m101076h());
        ArrayList<AbstractC28275a.g> arrayList = new ArrayList();
        m131185M02 = AbstractC25332a0.m131185M0(c19310b1.m101077i());
        Iterator it = m131185M02.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            ContactProfile m118050n = C23024b7.m118050n(C23024b7.f111993a, (String) it.next(), false, 2, null);
            if (m118050n != null) {
                String m40383Q = m118050n.m40383Q(true, false);
                AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                m127168X0 = AbstractC24342w.m127168X0(m40383Q);
                String obj3 = m127168X0.toString();
                String str = m118050n.f42446v;
                AbstractC19074t.m100207e(str, "avt");
                arrayList.add(new AbstractC28275a.g(m118050n, obj3, str, null, null, null, 56, null));
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C24861r.a aVar = C24861r.f119264q;
            C19310b1 c19310b12 = C19310b1.f95897a;
            jSONObject.put("save_keywords", c19310b12.m101074f());
            jSONObject.put("save_oas", c19310b12.m101075g());
            jSONObject.put("search_keywords", new JSONArray((Collection) m131185M0));
            m131511r = AbstractC25370t.m131511r(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            for (AbstractC28275a.g gVar : arrayList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", gVar.m142475c().mo2478b());
                jSONObject2.put("click_action", "action.globalsearch.prestate.click_oa");
                jSONObject2.put("click_data", "{\"uid\": " + gVar.m142475c().mo2478b() + "}");
                jSONObject2.put("title", gVar.m142476d());
                jSONObject2.put("icon", gVar.m142474b());
                ContactProfile m118066m = C23024b7.f111993a.m118066m(gVar);
                if (m118066m == null || (!m118066m.m40359B0() && !m118066m.m40372J0() && !AbstractC25495a.m132086k(m118066m.f42434r))) {
                    z11 = false;
                    jSONObject2.put("verify", z11);
                    arrayList2.add(jSONObject2);
                }
                z11 = true;
                jSONObject2.put("verify", z11);
                arrayList2.add(jSONObject2);
            }
            obj2 = C24861r.m129218b(jSONObject.put("search_oas", new JSONArray((Collection) arrayList2)));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            obj2 = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (!C24861r.m129223g(obj2)) {
            obj = obj2;
        }
        m123390m(c26302c.m135407h(), (JSONObject) obj, arrayList);
        m123391n(c26302c.m135407h());
    }

    /* renamed from: m */
    private final void m123390m(C26300a c26300a, JSONObject jSONObject, List list) {
        c26300a.m135391c(jSONObject);
        c26300a.m135392d(list);
    }

    /* renamed from: n */
    private final void m123391n(C26300a c26300a) {
        new C23515i(this, new C18316b("SearchDiscovery.Task.TransformPreStateResultData", c26300a, null, null, 12, null)).m101441i();
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C18316b c18316b;
        if (isCancelled()) {
            return;
        }
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
        if (c26302c == null) {
            return;
        }
        C19322f1.f95950a.m101144W();
        if (AbstractC19074t.m100204b(this.f114153s.m97246b(), "SearchDiscovery.Task.LoadPreState")) {
            m123389l(c26302c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23508b(InterfaceC18319c interfaceC18319c, C18316b c18316b) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        this.f114153s = c18316b;
    }
}
