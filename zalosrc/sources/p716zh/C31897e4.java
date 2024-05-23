package p716zh;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p461qu.AbstractC25495a;
import p645xh.C29628e;
import p716zh.C31912f4;
import pm0.C24848g0;
import qm0.AbstractC25370t;

/* renamed from: zh.e4 */
/* loaded from: classes3.dex */
public final class C31897e4 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f146532a;

    /* renamed from: b */
    private int f146533b;

    /* renamed from: c */
    private final LinkedList f146534c;

    /* renamed from: d */
    private int f146535d;

    /* renamed from: e */
    private int f146536e;

    /* renamed from: f */
    private boolean f146537f;

    /* renamed from: g */
    private int f146538g;

    /* renamed from: zh.e4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C31897e4() {
        this.f146532a = 1;
        this.f146534c = new LinkedList();
    }

    /* renamed from: a */
    private final void m153257a(C31912f4 c31912f4) {
        LinkedList linkedList = this.f146534c;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (AbstractC19074t.m100204b(((C31912f4) it.next()).m153368a(), c31912f4.m153368a())) {
                    AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("Msg E2EE race-condition add exists send state"));
                    return;
                }
            }
        }
        this.f146534c.add(c31912f4);
    }

    /* renamed from: c */
    private final int m153258c(int i11) {
        return i11 == 24 ? 1 : 0;
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m153259w(C31897e4 c31897e4, C31852b4 c31852b4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c31852b4 = null;
        }
        return c31897e4.m153281v(c31852b4);
    }

    /* renamed from: A */
    public final JSONObject m153260A() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", this.f146532a);
        jSONObject.put("compat_version", this.f146533b);
        jSONObject.put("retry", this.f146536e);
        jSONObject.put("no_retry", this.f146537f ? 1 : 0);
        jSONObject.put("e2ee_error", this.f146535d);
        if (!this.f146534c.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f146534c.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C31912f4) it.next()).m153373f());
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("send_states", jSONArray);
        }
        return jSONObject;
    }

    /* renamed from: B */
    public final void m153261B() {
        for (C31912f4 c31912f4 : this.f146534c) {
            if (c31912f4.m153370c() == 1) {
                c31912f4.m153372e(2);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m153262b(String str) {
        try {
            AbstractC19074t.m100208f(str, "ownerId");
            boolean m132079d = AbstractC25495a.m132079d(str);
            C31986k3 c31986k3 = C31986k3.f147083a;
            C31927g4 m154138p1 = c31986k3.m154138p1(str);
            if (m154138p1 != null) {
                m154138p1.m153403o(false);
            }
            if (m132079d) {
                m153257a(new C31912f4(C31852b4.Companion.m153133g(), 1, 0, 4, null));
            } else {
                for (C31927g4 c31927g4 : c31986k3.m154137o1(str, Integer.parseInt(str))) {
                    c31927g4.m153403o(false);
                    m153257a(new C31912f4(C31852b4.Companion.m153130d(c31927g4.m153390b(), false), 1, 0, 4, null));
                }
                if (!this.f146534c.isEmpty()) {
                    Iterator it = C31852b4.Companion.m153132f().iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (C31986k3.f147083a.m154083A1(intValue)) {
                            m153257a(new C31912f4(C31852b4.Companion.m153130d(intValue, true), 1, 0, 4, null));
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public final int m153263d() {
        return this.f146533b;
    }

    /* renamed from: e */
    public final int m153264e() {
        return this.f146535d;
    }

    /* renamed from: f */
    public final int m153265f() {
        return this.f146538g;
    }

    /* renamed from: g */
    public final C31912f4 m153266g(C31852b4 c31852b4) {
        Object obj;
        AbstractC19074t.m100208f(c31852b4, "client");
        Iterator it = this.f146534c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((C31912f4) obj).m153368a(), c31852b4)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C31912f4) obj;
    }

    /* renamed from: h */
    public final C31852b4 m153267h() {
        Object obj;
        Iterator it = this.f146534c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C31912f4) obj).m153370c() == 1) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C31912f4 c31912f4 = (C31912f4) obj;
        if (c31912f4 == null) {
            return null;
        }
        return c31912f4.m153368a();
    }

    /* renamed from: i */
    public final List m153268i() {
        int m131511r;
        LinkedList linkedList = this.f146534c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C31912f4) obj).m153370c() == 1) {
                arrayList.add(obj);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C31912f4) it.next()).m153368a());
        }
        return arrayList2;
    }

    /* renamed from: j */
    public final JSONObject m153269j(String str, C31852b4 c31852b4, int i11) {
        Integer num;
        AbstractC19074t.m100208f(str, "receiverId");
        AbstractC19074t.m100208f(c31852b4, "client");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("compat_version", m153258c(i11));
        if (m153271l(c31852b4)) {
            C31912f4 m153266g = m153266g(c31852b4);
            if (m153266g != null) {
                num = Integer.valueOf(m153266g.m153369b());
            } else {
                num = null;
            }
            jSONObject.put("retry", num);
        }
        if (!AbstractC25495a.m132079d(str)) {
            jSONObject.put("iid", C29628e.m147249E0().m93425s(Integer.parseInt(str), c31852b4.m153123e()));
        }
        return jSONObject;
    }

    /* renamed from: k */
    public final boolean m153270k() {
        LinkedList linkedList = this.f146534c;
        if ((linkedList instanceof Collection) && linkedList.isEmpty()) {
            return false;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((C31912f4) it.next()).m153370c() != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m153271l(C31852b4 c31852b4) {
        AbstractC19074t.m100208f(c31852b4, "client");
        C31912f4 m153266g = m153266g(c31852b4);
        if (m153266g != null && m153266g.m153369b() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m153272m() {
        return !m153268i().isEmpty();
    }

    /* renamed from: n */
    public final boolean m153273n() {
        LinkedList<C31912f4> linkedList = this.f146534c;
        if ((linkedList instanceof Collection) && linkedList.isEmpty()) {
            return false;
        }
        for (C31912f4 c31912f4 : linkedList) {
            if (!c31912f4.m153368a().m153124f() && (c31912f4.m153370c() == 3 || c31912f4.m153370c() == 5)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m153274o() {
        if (!this.f146534c.isEmpty()) {
            LinkedList<C31912f4> linkedList = this.f146534c;
            if ((linkedList instanceof Collection) && linkedList.isEmpty()) {
                return true;
            }
            for (C31912f4 c31912f4 : linkedList) {
                if (c31912f4.m153370c() == 0 || c31912f4.m153368a().m153124f() || c31912f4.m153370c() == 4) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m153275p() {
        LinkedList<C31912f4> linkedList = this.f146534c;
        if ((linkedList instanceof Collection) && linkedList.isEmpty()) {
            return true;
        }
        for (C31912f4 c31912f4 : linkedList) {
            if (c31912f4.m153370c() != 0 && !c31912f4.m153368a().m153124f() && c31912f4.m153370c() != 2 && c31912f4.m153370c() != 4) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m153276q() {
        return this.f146534c.isEmpty();
    }

    /* renamed from: r */
    public final boolean m153277r() {
        return this.f146537f;
    }

    /* renamed from: s */
    public final boolean m153278s() {
        return this.f146536e > 0;
    }

    /* renamed from: t */
    public final boolean m153279t() {
        List m153268i = m153268i();
        if ((m153268i instanceof Collection) && m153268i.isEmpty()) {
            return false;
        }
        Iterator it = m153268i.iterator();
        while (it.hasNext()) {
            if (m153271l((C31852b4) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m153280u() {
        return m153259w(this, null, 1, null);
    }

    /* renamed from: v */
    public final boolean m153281v(C31852b4 c31852b4) {
        if (c31852b4 != null) {
            C31912f4 m153266g = m153266g(c31852b4);
            if (m153266g == null || m153266g.m153370c() != 1) {
                return false;
            }
        } else {
            LinkedList linkedList = this.f146534c;
            if ((linkedList instanceof Collection) && linkedList.isEmpty()) {
                return false;
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((C31912f4) it.next()).m153370c() == 1) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final void m153282x(int i11) {
        this.f146535d = i11;
    }

    /* renamed from: y */
    public final void m153283y(C31852b4 c31852b4) {
        AbstractC19074t.m100208f(c31852b4, "client");
        C31912f4 m153266g = m153266g(c31852b4);
        if (m153266g != null) {
            m153266g.m153371d(1);
            m153266g.m153372e(1);
        }
    }

    /* renamed from: z */
    public final boolean m153284z(C31852b4 c31852b4, int i11) {
        AbstractC19074t.m100208f(c31852b4, "client");
        C31912f4 m153266g = m153266g(c31852b4);
        if (m153266g != null && m153266g.m153370c() != i11) {
            m153266g.m153372e(i11);
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31897e4(JSONObject jSONObject, boolean z11) {
        this();
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f146532a = jSONObject.optInt("version");
        this.f146533b = jSONObject.optInt("compat_version");
        this.f146536e = jSONObject.optInt("retry");
        this.f146537f = jSONObject.optInt("no_retry") == 1;
        this.f146538g = jSONObject.optInt("iid");
        if (z11) {
            this.f146535d = jSONObject.optInt("e2ee_error");
            JSONArray optJSONArray = jSONObject.optJSONArray("send_states");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                C31912f4.a aVar = C31912f4.Companion;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                m153257a(aVar.m153374a(jSONObject2));
            }
        }
    }
}
