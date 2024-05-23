package ga0;

import am.AbstractC0924m0;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p461qu.AbstractC25495a;
import pm0.C24848g0;
import qm0.AbstractC25332a0;

/* renamed from: ga0.b1 */
/* loaded from: classes6.dex */
public final class C19310b1 {

    /* renamed from: a */
    public static final C19310b1 f95897a = new C19310b1();

    /* renamed from: b */
    private static boolean f95898b = true;

    /* renamed from: c */
    private static final List f95899c;

    /* renamed from: d */
    private static final List f95900d;

    /* renamed from: e */
    private static boolean f95901e;

    /* renamed from: f */
    private static boolean f95902f;

    static {
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        f95899c = synchronizedList;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        f95900d = synchronizedList2;
        f95901e = true;
        f95902f = true;
    }

    private C19310b1() {
    }

    /* renamed from: b */
    public static final boolean m101062b(List list) {
        List m131187O0;
        List m131199Y;
        AbstractC19074t.m100208f(list, "uid");
        try {
            f95897a.m101079n();
            List list2 = f95900d;
            synchronized (list2) {
                try {
                    m131187O0 = AbstractC25332a0.m131187O0(list2);
                    m131187O0.removeAll(list);
                    if (list2.size() > 5) {
                        m131199Y = AbstractC25332a0.m131199Y(m131187O0, list2.size() - 5);
                        m131187O0 = AbstractC25332a0.m131187O0(m131199Y);
                    }
                    list2.clear();
                    list2.addAll(m131187O0);
                } finally {
                }
            }
            m101069o(list2);
            f95898b = true;
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m101063c(List list) {
        List m131187O0;
        List m131199Y;
        AbstractC19074t.m100208f(list, "uid");
        try {
            f95897a.m101079n();
            List list2 = f95899c;
            synchronized (list2) {
                try {
                    m131187O0 = AbstractC25332a0.m131187O0(list2);
                    m131187O0.removeAll(list);
                    if (list2.size() > 20) {
                        m131199Y = AbstractC25332a0.m131199Y(m131187O0, list2.size() - 20);
                        m131187O0 = AbstractC25332a0.m131187O0(m131199Y);
                    }
                    list2.clear();
                    list2.addAll(m131187O0);
                } finally {
                }
            }
            m101070p(list2);
            f95898b = true;
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: d */
    public static final List m101064d() {
        ArrayList arrayList = new ArrayList();
        try {
            String m3621Z4 = AbstractC0924m0.m3621Z4();
            if (m3621Z4 != null && m3621Z4.length() != 0) {
                JSONArray jSONArray = new JSONArray(m3621Z4);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String optString = jSONArray.optString(i11);
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final List m101065e() {
        ArrayList arrayList = new ArrayList();
        try {
            String m3651a5 = AbstractC0924m0.m3651a5();
            if (m3651a5 != null && m3651a5.length() != 0) {
                JSONArray jSONArray = new JSONArray(m3651a5);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String optString = jSONArray.optString(i11);
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: j */
    public static final boolean m101066j(String str) {
        List m131187O0;
        List m131199Y;
        AbstractC19074t.m100208f(str, "keyword");
        if (!f95902f) {
            return false;
        }
        try {
            f95897a.m101079n();
            List list = f95900d;
            synchronized (list) {
                try {
                    m131187O0 = AbstractC25332a0.m131187O0(list);
                    m131187O0.remove(str);
                    m131187O0.add(0, str);
                    if (list.size() > 5) {
                        m131199Y = AbstractC25332a0.m131199Y(m131187O0, list.size() - 5);
                        m131187O0 = AbstractC25332a0.m131187O0(m131199Y);
                    }
                    list.clear();
                    list.addAll(m131187O0);
                } finally {
                }
            }
            m101069o(list);
            f95898b = true;
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: k */
    public static final boolean m101067k(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "profile");
        if (f95897a.m101078m(contactProfile)) {
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            if (m101068l(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m101068l(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (!f95901e) {
            return false;
        }
        try {
            f95897a.m101079n();
            List list = f95899c;
            list.remove(str);
            list.add(0, str);
            m101070p(list);
            f95898b = true;
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: o */
    private static final boolean m101069o(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            String jSONArray2 = jSONArray.toString();
            AbstractC19074t.m100207e(jSONArray2, "toString(...)");
            AbstractC0924m0.m3552Wm(jSONArray2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    private static final boolean m101070p(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            String jSONArray2 = jSONArray.toString();
            AbstractC19074t.m100207e(jSONArray2, "toString(...)");
            AbstractC0924m0.m3581Xm(jSONArray2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static final void m101071q(boolean z11) {
        AbstractC0924m0.m3494Um(z11);
        f95898b = true;
    }

    /* renamed from: r */
    public static final void m101072r(boolean z11) {
        AbstractC0924m0.m3523Vm(z11);
        f95898b = true;
    }

    /* renamed from: a */
    public final void m101073a() {
        f95898b = true;
        f95899c.clear();
        f95900d.clear();
    }

    /* renamed from: f */
    public final boolean m101074f() {
        return f95902f;
    }

    /* renamed from: g */
    public final boolean m101075g() {
        return f95901e;
    }

    /* renamed from: h */
    public final List m101076h() {
        return f95900d;
    }

    /* renamed from: i */
    public final List m101077i() {
        return f95899c;
    }

    /* renamed from: m */
    public final boolean m101078m(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "<this>");
        if (contactProfile.m40387S0() && !AbstractC25495a.m132081f(contactProfile.f42434r) && !AbstractC25495a.m132084i(contactProfile.f42434r) && !AbstractC25495a.m132078c(contactProfile.f42434r) && !AbstractC25495a.m132079d(contactProfile.f42434r)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void m101079n() {
        if (f95898b) {
            f95901e = AbstractC0924m0.m3483Ub();
            f95902f = AbstractC0924m0.m3454Tb();
            List m101065e = m101065e();
            if (m101065e.size() > 20) {
                m101065e = AbstractC25332a0.m131199Y(m101065e, m101065e.size() - 20);
            }
            List list = f95899c;
            synchronized (list) {
                list.clear();
                list.addAll(m101065e);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            List m101064d = m101064d();
            if (m101064d.size() > 5) {
                m101064d = AbstractC25332a0.m131199Y(m101064d, m101064d.size() - 5);
            }
            List list2 = f95900d;
            synchronized (list2) {
                list2.clear();
                list2.addAll(m101064d);
            }
            f95898b = false;
        }
    }
}
