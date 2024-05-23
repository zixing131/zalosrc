package lb0;

import ac.C0708i;
import ac.C0732w;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p227i3.C20215s;
import ph.C24753f;

/* renamed from: lb0.y */
/* loaded from: classes6.dex */
public final class C22423y {

    /* renamed from: a */
    public static final C22423y f109724a = new C22423y();

    private C22423y() {
    }

    /* renamed from: a */
    private final JSONObject m115850a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("r_type", str);
        return jSONObject;
    }

    /* renamed from: b */
    public static final C0732w.c m115851b(String str, int i11) {
        AbstractC19074t.m100208f(str, "reactionIcon");
        C0732w.c cVar = new C0732w.c();
        JSONObject m115850a = f109724a.m115850a(str);
        int m102878B = AbstractC19646n0.m102878B(i11, false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(String.valueOf(m102878B), 1);
        m115850a.put("stats", jSONObject);
        cVar.m1193c().add(m115850a);
        return cVar;
    }

    /* renamed from: c */
    public static final C0732w.c m115852c(String str, C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(str, "reactionIcon");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.addAll(AbstractC19646n0.m102891F0(c17945a0.mo95039W2(), c17945a0.m95029V3(), true));
        } else {
            arrayList.add(c17945a0);
        }
        return m115853d(str, arrayList);
    }

    /* renamed from: d */
    public static final C0732w.c m115853d(String str, List list) {
        AbstractC19074t.m100208f(str, "reactionIcon");
        AbstractC19074t.m100208f(list, "listChatContent");
        C0732w.c cVar = new C0732w.c();
        JSONObject m115850a = f109724a.m115850a(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer valueOf = Integer.valueOf(AbstractC19646n0.m102878B(((C17945a0) obj).m95041W4(), false));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put(String.valueOf(((Number) entry.getKey()).intValue()), ((List) entry.getValue()).size());
        }
        m115850a.put("stats", jSONObject);
        cVar.m1193c().add(m115850a);
        return cVar;
    }

    /* renamed from: e */
    public static /* synthetic */ C0732w.c m115854e(String str, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return m115852c(str, c17945a0, z11);
    }

    /* renamed from: h */
    public static final C0708i m115855h(List list) {
        AbstractC19074t.m100208f(list, "listReactionType");
        C0708i c0708i = new C0708i();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C24753f) it.next()).m128595h());
        }
        c0708i.m1074e("list_fav", jSONArray);
        return c0708i;
    }

    /* renamed from: i */
    public static final C0708i m115856i(String str) {
        AbstractC19074t.m100208f(str, "reactionIcon");
        C0708i c0708i = new C0708i();
        c0708i.m1075f("r_type", str);
        return c0708i;
    }

    /* renamed from: j */
    public static final void m115857j(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "text");
    }

    /* renamed from: f */
    public final C0732w.c m115858f(List list, List list2, List list3) {
        AbstractC19074t.m100208f(list, "haveResultSearch");
        AbstractC19074t.m100208f(list2, "noResultSearch");
        AbstractC19074t.m100208f(list3, "selectResultSearch");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            jSONArray2.put((String) it2.next());
        }
        JSONArray jSONArray3 = new JSONArray();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            jSONArray3.put((String) it3.next());
        }
        C0732w.c cVar = new C0732w.c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hr", jSONArray);
        jSONObject.put("nr", jSONArray2);
        jSONObject.put(C20215s.f99966b, jSONArray3);
        cVar.m1193c().add(jSONObject);
        return cVar;
    }

    /* renamed from: g */
    public final C0708i m115859g(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        C0708i c0708i = new C0708i();
        c0708i.m1075f("src", str);
        return c0708i;
    }
}
