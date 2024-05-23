package p716zh;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.C31973j5;
import qm0.AbstractC25370t;

/* renamed from: zh.q5 */
/* loaded from: classes3.dex */
public final class C32076q5 {

    /* renamed from: a */
    private final String f147691a;

    /* renamed from: b */
    private final String f147692b;

    /* renamed from: c */
    private String f147693c;

    /* renamed from: d */
    private final List f147694d;

    /* renamed from: e */
    private final List f147695e;

    /* renamed from: f */
    private final Set f147696f;

    public C32076q5(String str) {
        AbstractC19074t.m100208f(str, "groupId");
        this.f147691a = str;
        this.f147692b = "group_" + str;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f147694d = synchronizedList;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        this.f147695e = synchronizedList2;
        Set synchronizedSet = Collections.synchronizedSet(new TreeSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        this.f147696f = synchronizedSet;
    }

    /* renamed from: a */
    public final void m154712a(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        if (!this.f147694d.contains(str)) {
            this.f147694d.add(0, str);
        }
        if (str2 != null) {
            this.f147694d.remove(str2);
        }
    }

    /* renamed from: b */
    public final void m154713b(String str) {
        if (str == null) {
            return;
        }
        if (!this.f147695e.contains(str)) {
            this.f147695e.add(0, str);
        }
        if (!this.f147696f.contains(str)) {
            this.f147696f.add(str);
        }
    }

    /* renamed from: c */
    public final void m154714c(String str) {
        if (str == null) {
            return;
        }
        this.f147693c = str;
        this.f147694d.remove(str);
    }

    /* renamed from: d */
    public final void m154715d(C31973j5 c31973j5, List list, List list2) {
        int m131511r;
        int m131511r2;
        AbstractC19074t.m100208f(c31973j5, "group");
        AbstractC19074t.m100208f(list, "membersData");
        AbstractC19074t.m100208f(list2, "adminsData");
        this.f147693c = c31973j5.m153758f();
        this.f147694d.clear();
        List list3 = list2;
        this.f147694d.addAll(list3);
        this.f147695e.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list3);
        this.f147695e.addAll(linkedHashSet);
        this.f147696f.clear();
        this.f147696f.addAll(this.f147695e);
        Set set = this.f147696f;
        List m153754d = c31973j5.m153754d();
        m131511r = AbstractC25370t.m131511r(m153754d, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m153754d.iterator();
        while (it.hasNext()) {
            arrayList.add(((C31973j5.b) it.next()).m153802d());
        }
        set.addAll(arrayList);
        Set set2 = this.f147696f;
        List m153760g = c31973j5.m153760g();
        m131511r2 = AbstractC25370t.m131511r(m153760g, 10);
        ArrayList arrayList2 = new ArrayList(m131511r2);
        Iterator it2 = m153760g.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C31973j5.b) it2.next()).m153802d());
        }
        set2.addAll(arrayList2);
    }

    /* renamed from: e */
    public final List m154716e() {
        return new ArrayList(this.f147694d);
    }

    /* renamed from: f */
    public final int m154717f() {
        return this.f147695e.size();
    }

    /* renamed from: g */
    public final List m154718g() {
        return new ArrayList(this.f147695e);
    }

    /* renamed from: h */
    public final String m154719h() {
        return this.f147691a;
    }

    /* renamed from: i */
    public final String m154720i() {
        return this.f147693c;
    }

    /* renamed from: j */
    public final String m154721j() {
        return this.f147692b;
    }

    /* renamed from: k */
    public final boolean m154722k(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f147695e.contains(str);
    }

    /* renamed from: l */
    public final boolean m154723l(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f147694d.contains(str);
    }

    /* renamed from: m */
    public final boolean m154724m() {
        return this.f147696f.contains(CoreUtility.f89233i);
    }

    /* renamed from: n */
    public final boolean m154725n(String str) {
        if (str == null) {
            return false;
        }
        return this.f147696f.contains(str);
    }

    /* renamed from: o */
    public final void m154726o(C31973j5 c31973j5, JSONObject jSONObject) {
        int m131511r;
        int m131511r2;
        AbstractC19074t.m100208f(c31973j5, "group");
        AbstractC19074t.m100208f(jSONObject, "item");
        this.f147693c = c31973j5.m153758f();
        this.f147694d.clear();
        JSONArray optJSONArray = jSONObject.optJSONArray("adminIds");
        int i11 = 0;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                List list = this.f147694d;
                String string = optJSONArray.getString(i12);
                AbstractC19074t.m100207e(string, "getString(...)");
                list.add(string);
            }
        }
        this.f147695e.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("memberIds");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i13 = 0; i13 < length2; i13++) {
                List list2 = this.f147695e;
                String string2 = optJSONArray2.getString(i13);
                AbstractC19074t.m100207e(string2, "getString(...)");
                list2.add(string2);
            }
        }
        this.f147696f.clear();
        this.f147696f.addAll(this.f147695e);
        Set set = this.f147696f;
        List m153754d = c31973j5.m153754d();
        m131511r = AbstractC25370t.m131511r(m153754d, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m153754d.iterator();
        while (it.hasNext()) {
            arrayList.add(((C31973j5.b) it.next()).m153802d());
        }
        set.addAll(arrayList);
        Set set2 = this.f147696f;
        List m153760g = c31973j5.m153760g();
        m131511r2 = AbstractC25370t.m131511r(m153760g, 10);
        ArrayList arrayList2 = new ArrayList(m131511r2);
        Iterator it2 = m153760g.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C31973j5.b) it2.next()).m153802d());
        }
        set2.addAll(arrayList2);
        if (c31973j5.m153782r0() == 1) {
            i11 = 2;
        } else if (m154724m()) {
            i11 = 1;
        }
        c31973j5.m153706A0(i11);
    }

    /* renamed from: p */
    public final void m154727p(String str) {
        if (str == null) {
            return;
        }
        this.f147694d.remove(str);
    }

    /* renamed from: q */
    public final void m154728q(String str) {
        if (str == null) {
            return;
        }
        this.f147694d.remove(str);
        this.f147695e.remove(str);
        this.f147696f.remove(str);
    }
}
