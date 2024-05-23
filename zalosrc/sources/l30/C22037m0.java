package l30;

import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mm0.AbstractC23350e;
import o30.C24008a;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.C24848g0;
import qm0.AbstractC25332a0;

/* renamed from: l30.m0 */
/* loaded from: classes5.dex */
public final class C22037m0 {

    /* renamed from: b */
    private static boolean f108554b;

    /* renamed from: d */
    private static boolean f108556d;

    /* renamed from: a */
    public static final C22037m0 f108553a = new C22037m0();

    /* renamed from: c */
    private static final List f108555c = new ArrayList();

    /* renamed from: e */
    private static final Object f108557e = new Object();

    /* renamed from: f */
    private static final Object f108558f = new Object();

    /* renamed from: g */
    private static final Map f108559g = new LinkedHashMap();

    /* renamed from: h */
    private static final Map f108560h = new LinkedHashMap();

    /* renamed from: l30.m0$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108561a;

        /* renamed from: b */
        final /* synthetic */ String f108562b;

        /* renamed from: c */
        final /* synthetic */ long f108563c;

        a(String str, String str2, long j11) {
            this.f108561a = str;
            this.f108562b = str2;
            this.f108563c = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42132G8(this.f108561a, this.f108562b, this.f108563c);
        }
    }

    /* renamed from: l30.m0$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108564a;

        /* renamed from: b */
        final /* synthetic */ String f108565b;

        b(String str, String str2) {
            this.f108564a = str;
            this.f108565b = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42544t9(this.f108564a, this.f108565b);
        }
    }

    /* renamed from: l30.m0$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f108566a;

        c(List list) {
            this.f108566a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42158J(this.f108566a);
        }
    }

    /* renamed from: l30.m0$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f108567a;

        d(List list) {
            this.f108567a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42183L(this.f108567a);
        }
    }

    /* renamed from: l30.m0$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC0939u {
        e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            Map m42451l5 = C7960e.m41971c6().m42451l5();
            synchronized (C22037m0.f108557e) {
                C22037m0.f108559g.clear();
                Map map = C22037m0.f108559g;
                AbstractC19074t.m100205c(m42451l5);
                map.putAll(m42451l5);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            Map m42060A5 = C7960e.m41971c6().m42060A5();
            synchronized (C22037m0.f108558f) {
                C22037m0.f108560h.clear();
                Map map2 = C22037m0.f108560h;
                AbstractC19074t.m100205c(m42060A5);
                map2.putAll(m42060A5);
            }
            ArrayList m42602z5 = C7960e.m41971c6().m42602z5();
            C22037m0 c22037m0 = C22037m0.f108553a;
            AbstractC19074t.m100205c(m42602z5);
            c22037m0.m115040n(m42602z5);
        }
    }

    private C22037m0() {
    }

    /* renamed from: e */
    public final void m115031e(String str, String str2, long j11) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(str2, "reactionId");
        synchronized (f108557e) {
            f108559g.put(str, str2);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        C0824j.m2153b(new a(str, str2, j11));
    }

    /* renamed from: f */
    public final void m115032f(String str, String str2) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(str2, "uidIgnore");
        synchronized (f108558f) {
            try {
                Map map = f108560h;
                if (map.containsKey(str)) {
                    List list = (List) map.get(str);
                    if (list != null) {
                        list.add(str2);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str2);
                    map.put(str, arrayList);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0824j.m2153b(new b(str, str2));
    }

    /* renamed from: g */
    public final String m115033g(String str) {
        Object obj;
        String m125881b;
        AbstractC19074t.m100208f(str, "id");
        Iterator it = f108555c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((C24008a) obj).m125880a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C24008a c24008a = (C24008a) obj;
        if (c24008a == null || (m125881b = c24008a.m125881b()) == null) {
            return "";
        }
        return m125881b;
    }

    /* renamed from: h */
    public final boolean m115034h() {
        return f108554b;
    }

    /* renamed from: i */
    public final String m115035i() {
        Object m131206f0;
        String m125880a;
        m131206f0 = AbstractC25332a0.m131206f0(f108555c);
        C24008a c24008a = (C24008a) m131206f0;
        if (c24008a == null || (m125880a = c24008a.m125880a()) == null) {
            return "";
        }
        return m125880a;
    }

    /* renamed from: j */
    public final List m115036j(String str) {
        List list;
        AbstractC19074t.m100208f(str, "storyId");
        synchronized (f108558f) {
            list = (List) f108560h.get(str);
            if (list == null) {
                list = new ArrayList();
            }
        }
        return list;
    }

    /* renamed from: k */
    public final String m115037k(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "storyId");
        synchronized (f108557e) {
            str2 = (String) f108559g.get(str);
            if (str2 == null) {
                str2 = "";
            }
        }
        return str2;
    }

    /* renamed from: l */
    public final List m115038l() {
        return f108555c;
    }

    /* renamed from: m */
    public final boolean m115039m() {
        return f108556d;
    }

    /* renamed from: n */
    public final void m115040n(List list) {
        AbstractC19074t.m100208f(list, "listUserStory");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31980jc c31980jc = (C31980jc) it.next();
            ArrayList arrayList = c31980jc.f147031x;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = ((C32123ta) it2.next()).f148138h;
                    AbstractC19074t.m100207e(str, "storyId");
                    linkedHashSet.add(str);
                }
            }
            ArrayList arrayList2 = c31980jc.f147032y;
            if (arrayList2 != null) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str2 = ((C32123ta) it3.next()).f148138h;
                    AbstractC19074t.m100207e(str2, "storyId");
                    linkedHashSet.add(str2);
                }
            }
        }
        synchronized (f108557e) {
            try {
                Set<String> keySet = f108559g.keySet();
                ArrayList arrayList3 = new ArrayList();
                for (String str3 : keySet) {
                    if (!linkedHashSet.contains(str3)) {
                        arrayList3.add(str3);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    f108559g.remove((String) it4.next());
                }
                C0824j.m2153b(new c(arrayList3));
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (f108558f) {
            try {
                Set<String> keySet2 = f108560h.keySet();
                ArrayList arrayList4 = new ArrayList();
                for (String str4 : keySet2) {
                    if (!linkedHashSet.contains(str4)) {
                        arrayList4.add(str4);
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    f108560h.remove((String) it5.next());
                }
                C0824j.m2153b(new d(arrayList4));
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: o */
    public final void m115041o(JSONObject jSONObject, boolean z11) {
        boolean z12;
        C24008a m125882a;
        AbstractC19074t.m100208f(jSONObject, "json");
        try {
            if (jSONObject.optInt("enable") == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            f108554b = z12;
            JSONArray optJSONArray = jSONObject.optJSONArray("reactions");
            if (optJSONArray != null) {
                f108555c.clear();
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                    if (optJSONObject != null && (m125882a = C24008a.Companion.m125882a(optJSONObject)) != null) {
                        f108555c.add(m125882a);
                    }
                }
            }
            if (z11) {
                AbstractC0924m0.m3090Go(jSONObject.toString());
            }
            f108556d = true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p */
    public final void m115042p() {
        C0824j.m2153b(new e());
    }
}
