package ga0;

import am.C0943w;
import androidx.core.util.C1483e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p077ui.searchglobal.SearchGlobalView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23160o0;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import on0.AbstractC24340u;
import p056cj.C3555w;
import p142ey.C18644n;
import p304ks.C21927m;
import p461qu.AbstractC25495a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29075g;
import p612wk.AbstractC29076h;
import p612wk.C29071c;
import p716zh.C31973j5;
import p716zh.C32020m7;
import vg.C28203u6;

/* renamed from: ga0.j1 */
/* loaded from: classes6.dex */
public final class C19334j1 extends AbstractC19358r1 {

    /* renamed from: t */
    private final HashMap f96055t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19334j1(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "uidExistThreadChatMap");
        this.f96055t = hashMap;
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        C1483e m119969D;
        Long m127109o;
        long j11;
        ContactProfile m141798e;
        Long m127109o2;
        long j12;
        C18316b c18316b;
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        } else {
            c19325g1 = null;
        }
        if (c19325g1 == null) {
            return;
        }
        boolean m101196V = c19325g1.m101196V();
        ArrayList arrayList = new ArrayList();
        try {
            m119969D = AbstractC23262x6.m119969D(m101455l());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m119969D == null) {
            return;
        }
        C7961f m42658b = C7961f.Companion.m42658b();
        Object obj2 = m119969D.f6374a;
        AbstractC19074t.m100207e(obj2, "first");
        for (C3555w c3555w : m42658b.m42651S((String) obj2)) {
            if (c3555w.m18062d().length() > 0) {
                if (AbstractC25495a.m132079d(c3555w.m18062d())) {
                    C31973j5 m4472f = C0943w.f3447a.m4472f(AbstractC25495a.m132088m(c3555w.m18062d()));
                    if (m4472f != null && m4472f.m153781r().length() > 0) {
                        if (!C21927m.m114302u().m114345m("group_" + m4472f.m153781r())) {
                            ContactProfile contactProfile = new ContactProfile("group_" + m4472f.m153781r());
                            contactProfile.f42437s = m4472f.m153793y();
                            contactProfile.f42446v = m4472f.m153756e();
                            contactProfile.f42436r1.append((CharSequence) AbstractC23217t2.m119653e(c3555w.m18060b(), (ArrayList) m119969D.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                            contactProfile.f42326B1 = true;
                            m127109o = AbstractC24340u.m127109o(c3555w.m18064f());
                            if (m127109o != null) {
                                j11 = m127109o.longValue();
                            } else {
                                j11 = contactProfile.f42330D;
                            }
                            contactProfile.f42330D = j11;
                            C32020m7 c32020m7 = new C32020m7(contactProfile);
                            String m119251g = AbstractC23160o0.m119251g(contactProfile.f42330D);
                            AbstractC19074t.m100207e(m119251g, "formatSearchGlobalItemTime(...)");
                            arrayList.add(new AbstractC29069a.k(3072, c32020m7, m119251g, c3555w.m18061c()));
                        }
                    }
                } else if (this.f96055t.containsKey(c3555w.m18062d()) && (m141798e = C28203u6.m141798e(C28203u6.f131407a, c3555w.m18062d(), null, 2, null)) != null) {
                    String str = m141798e.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    if (str.length() != 0 && !C21927m.m114302u().m114345m(m141798e.f42434r) && (m141798e.f42352K0 <= 0 || C21927m.m114302u().m114318P(m141798e.f42434r))) {
                        ContactProfile m98552o = C18644n.m98531l().m98552o(m141798e.f42434r);
                        if (!m101196V || m98552o == null || m98552o.f42382U0 != 0) {
                            ContactProfile contactProfile2 = new ContactProfile(m141798e);
                            contactProfile2.f42436r1.append((CharSequence) AbstractC23217t2.m119653e(c3555w.m18060b(), (ArrayList) m119969D.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                            contactProfile2.f42326B1 = true;
                            m127109o2 = AbstractC24340u.m127109o(c3555w.m18064f());
                            if (m127109o2 != null) {
                                j12 = m127109o2.longValue();
                            } else {
                                j12 = contactProfile2.f42330D;
                            }
                            contactProfile2.f42330D = j12;
                            C32020m7 c32020m72 = new C32020m7(contactProfile2);
                            String m119251g2 = AbstractC23160o0.m119251g(contactProfile2.f42330D);
                            AbstractC19074t.m100207e(m119251g2, "formatSearchGlobalItemTime(...)");
                            arrayList.add(new AbstractC29069a.k(3072, c32020m72, m119251g2, c3555w.m18061c()));
                        }
                    }
                }
            }
        }
        if (isCancelled()) {
            return;
        }
        mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", AbstractC29075g.m145256c(AbstractC29076h.q.f134831b, m101455l(), arrayList, AbstractC29072d.d.f134806a, new C29071c(arrayList.size(), true)), null, null, 12, null));
    }
}
