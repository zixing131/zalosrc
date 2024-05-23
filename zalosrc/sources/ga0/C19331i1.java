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
import on0.AbstractC24342w;
import p056cj.C3554v;
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

/* renamed from: ga0.i1 */
/* loaded from: classes6.dex */
public final class C19331i1 extends AbstractC19358r1 {

    /* renamed from: t */
    private final HashMap f96050t;

    /* renamed from: u */
    private final C29071c f96051u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19331i1(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap, C29071c c29071c) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "uidExistThreadChatMap");
        AbstractC19074t.m100208f(c29071c, "paginationData");
        this.f96050t = hashMap;
        this.f96051u = c29071c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x024a, code lost:            if (r0 == null) goto L90;     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a6 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:20:0x0076, B:23:0x0081, B:26:0x0088, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:34:0x00d3, B:36:0x00dd, B:39:0x00ea, B:41:0x00fa, B:43:0x0104, B:45:0x0121, B:47:0x0148, B:49:0x0154, B:52:0x015b, B:53:0x0178, B:55:0x01a6, B:56:0x01ad, B:59:0x01ab, B:60:0x0174, B:62:0x01d3, B:64:0x01e3, B:66:0x01f1, B:70:0x0200, B:74:0x020e, B:76:0x0212, B:81:0x0222, B:83:0x022e, B:87:0x0233, B:89:0x023f, B:91:0x024e, B:93:0x0274, B:94:0x027b, B:96:0x0279, B:97:0x024c, B:105:0x02a0, B:108:0x02a7, B:111:0x02b4), top: B:19:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:20:0x0076, B:23:0x0081, B:26:0x0088, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:34:0x00d3, B:36:0x00dd, B:39:0x00ea, B:41:0x00fa, B:43:0x0104, B:45:0x0121, B:47:0x0148, B:49:0x0154, B:52:0x015b, B:53:0x0178, B:55:0x01a6, B:56:0x01ad, B:59:0x01ab, B:60:0x0174, B:62:0x01d3, B:64:0x01e3, B:66:0x01f1, B:70:0x0200, B:74:0x020e, B:76:0x0212, B:81:0x0222, B:83:0x022e, B:87:0x0233, B:89:0x023f, B:91:0x024e, B:93:0x0274, B:94:0x027b, B:96:0x0279, B:97:0x024c, B:105:0x02a0, B:108:0x02a7, B:111:0x02b4), top: B:19:0x0076 }] */
    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        String str;
        String str2;
        String str3;
        C1483e c1483e;
        ContactProfile m141798e;
        String str4;
        Long m127109o;
        long j11;
        CharSequence m127168X0;
        ContactProfile m98552o;
        String str5;
        String m153793y;
        Long m127109o2;
        long j12;
        C18316b c18316b;
        String str6 = "group_";
        if (isCancelled()) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
        String str7 = null;
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
        this.f96051u.m145238b();
        if (this.f96051u.m145238b() != 0) {
            mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_ADD_DATA", AbstractC29075g.m145256c(AbstractC29076h.q.f134831b, m101455l(), new ArrayList(), AbstractC29072d.c.f134805a, this.f96051u), null, null, 12, null));
        }
        boolean m101196V = c19325g1.m101196V();
        ArrayList arrayList = new ArrayList();
        try {
            C1483e m119969D = AbstractC23262x6.m119969D(m101455l());
            if (m119969D == null || isCancelled()) {
                return;
            }
            C1483e c1483e2 = m119969D;
            ArrayList<C3554v> m42620R = C7961f.m42620R(C7961f.Companion.m42658b(), (String) m119969D.f6374a, null, null, this.f96051u.m145238b(), 125, this, 6, null);
            if (isCancelled()) {
                return;
            }
            C29071c m101098g = C19318e0.Companion.m101098g(this.f96051u, m42620R, 100, 25);
            for (C3554v c3554v : m42620R) {
                if (isCancelled()) {
                    return;
                }
                if (c3554v.m18062d().length() > 0) {
                    if (AbstractC25495a.m132079d(c3554v.m18062d())) {
                        C31973j5 m4472f = C0943w.f3447a.m4472f(AbstractC25495a.m132088m(c3554v.m18062d()));
                        if (m4472f != null && m4472f.m153781r().length() > 0) {
                            if (!C21927m.m114302u().m114345m(str6 + m4472f.m153781r())) {
                                ContactProfile contactProfile = new ContactProfile(str6 + m4472f.m153781r());
                                str3 = str6;
                                ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, c3554v.m18063e(), false, 2, str7);
                                if (m141800i != null) {
                                    str5 = m141800i.m40383Q(true, false);
                                } else {
                                    str5 = str7;
                                }
                                if (str5 != null && str5.length() != 0) {
                                    m153793y = str5 + " • " + m4472f.m153793y();
                                    contactProfile.f42437s = m153793y;
                                    contactProfile.f42446v = m4472f.m153756e();
                                    c1483e = c1483e2;
                                    contactProfile.f42436r1.append((CharSequence) AbstractC23217t2.m119653e(c3554v.m18060b(), (ArrayList) c1483e.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                                    contactProfile.f42326B1 = true;
                                    m127109o2 = AbstractC24340u.m127109o(c3554v.m18064f());
                                    if (m127109o2 == null) {
                                        j12 = m127109o2.longValue();
                                    } else {
                                        j12 = contactProfile.f42330D;
                                    }
                                    contactProfile.f42330D = j12;
                                    C32020m7 c32020m7 = new C32020m7(contactProfile);
                                    String m119251g = AbstractC23160o0.m119251g(contactProfile.f42330D);
                                    AbstractC19074t.m100207e(m119251g, "formatSearchGlobalItemTime(...)");
                                    arrayList.add(new AbstractC29069a.k(5120, c32020m7, m119251g, c3554v.m18061c()));
                                }
                                m153793y = m4472f.m153793y();
                                contactProfile.f42437s = m153793y;
                                contactProfile.f42446v = m4472f.m153756e();
                                c1483e = c1483e2;
                                contactProfile.f42436r1.append((CharSequence) AbstractC23217t2.m119653e(c3554v.m18060b(), (ArrayList) c1483e.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                                contactProfile.f42326B1 = true;
                                m127109o2 = AbstractC24340u.m127109o(c3554v.m18064f());
                                if (m127109o2 == null) {
                                }
                                contactProfile.f42330D = j12;
                                C32020m7 c32020m72 = new C32020m7(contactProfile);
                                String m119251g2 = AbstractC23160o0.m119251g(contactProfile.f42330D);
                                AbstractC19074t.m100207e(m119251g2, "formatSearchGlobalItemTime(...)");
                                arrayList.add(new AbstractC29069a.k(5120, c32020m72, m119251g2, c3554v.m18061c()));
                            }
                        }
                    } else {
                        str3 = str6;
                        c1483e = c1483e2;
                        if (this.f96050t.containsKey(c3554v.m18062d()) && (m141798e = C28203u6.m141798e(C28203u6.f131407a, c3554v.m18062d(), null, 2, null)) != null) {
                            String str8 = m141798e.f42434r;
                            AbstractC19074t.m100207e(str8, "uid");
                            if (str8.length() != 0 && !C21927m.m114302u().m114345m(m141798e.f42434r) && ((m141798e.f42352K0 <= 0 || C21927m.m114302u().m114318P(m141798e.f42434r)) && (!m101196V || (m98552o = C18644n.m98531l().m98552o(m141798e.f42434r)) == null || m98552o.f42382U0 != 0))) {
                                ContactProfile contactProfile2 = new ContactProfile(m141798e);
                                String m40383Q = contactProfile2.m40383Q(true, false);
                                if (m40383Q != null) {
                                    AbstractC19074t.m100205c(m40383Q);
                                    m127168X0 = AbstractC24342w.m127168X0(m40383Q);
                                    str4 = m127168X0.toString();
                                }
                                str4 = contactProfile2.f42437s;
                                contactProfile2.f42437s = str4;
                                contactProfile2.f42436r1.append((CharSequence) AbstractC23217t2.m119653e(c3554v.m18060b(), (ArrayList) c1483e.f6375b, SearchGlobalView.Companion.m73192a(), 0));
                                contactProfile2.f42326B1 = true;
                                m127109o = AbstractC24340u.m127109o(c3554v.m18064f());
                                if (m127109o != null) {
                                    j11 = m127109o.longValue();
                                } else {
                                    j11 = contactProfile2.f42330D;
                                }
                                contactProfile2.f42330D = j11;
                                C32020m7 c32020m73 = new C32020m7(contactProfile2);
                                String m119251g3 = AbstractC23160o0.m119251g(contactProfile2.f42330D);
                                AbstractC19074t.m100207e(m119251g3, "formatSearchGlobalItemTime(...)");
                                arrayList.add(new AbstractC29069a.k(5120, c32020m73, m119251g3, c3554v.m18061c()));
                            }
                        }
                    }
                    c1483e2 = c1483e;
                    str6 = str3;
                    str7 = null;
                }
                str3 = str6;
                c1483e = c1483e2;
                c1483e2 = c1483e;
                str6 = str3;
                str7 = null;
            }
            if (isCancelled()) {
                return;
            }
            if (this.f96051u.m145238b() <= 0) {
                str2 = "ACTION_SEARCH_TASK_RESULT_SET_DATA";
            } else {
                str2 = "ACTION_SEARCH_TASK_RESULT_ADD_DATA";
            }
            mo205i9(new C18316b(str2, AbstractC29075g.m145256c(AbstractC29076h.q.f134831b, m101455l(), arrayList, AbstractC29072d.d.f134806a, m101098g), null, null, 12, null));
        } catch (Exception e11) {
            e11.printStackTrace();
            if (isCancelled()) {
                return;
            }
            if (this.f96051u.m145238b() <= 0) {
                str = "ACTION_SEARCH_TASK_RESULT_SET_DATA";
            } else {
                str = "ACTION_SEARCH_TASK_RESULT_ADD_DATA";
            }
            mo205i9(new C18316b(str, AbstractC29075g.m145256c(AbstractC29076h.q.f134831b, m101455l(), new ArrayList(), AbstractC29072d.a.f134803a, this.f96051u), null, null, 12, null));
        }
    }
}
