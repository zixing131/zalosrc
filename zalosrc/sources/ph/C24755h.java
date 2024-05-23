package ph;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;

/* renamed from: ph.h */
/* loaded from: classes3.dex */
public final class C24755h {

    /* renamed from: a */
    private final Object f118864a;

    /* renamed from: b */
    private C24755h f118865b;

    /* renamed from: c */
    private final HashMap f118866c = new HashMap();

    public C24755h(Object obj) {
        this.f118864a = obj;
    }

    /* renamed from: a */
    public final C24755h m128625a(String str, Object obj) {
        AbstractC19074t.m100208f(str, "childKey");
        C24755h c24755h = new C24755h(obj);
        c24755h.f118865b = this;
        this.f118866c.put(str, c24755h);
        AbstractC20110a.f98889a.mo104548a("SearchTreeNode buildTreeSearchResult->addChildNode " + c24755h, new Object[0]);
        return c24755h;
    }

    /* renamed from: b */
    public final C24755h m128626b(String str, C24755h c24755h) {
        AbstractC19074t.m100208f(str, "childKey");
        AbstractC19074t.m100208f(c24755h, "childNode");
        c24755h.f118865b = this;
        this.f118866c.put(str, c24755h);
        return c24755h;
    }

    /* renamed from: c */
    public final C24755h m128627c(String str) {
        AbstractC19074t.m100208f(str, "childKey");
        return (C24755h) this.f118866c.get(str);
    }

    /* renamed from: d */
    public final C24755h m128628d() {
        return this.f118865b;
    }

    /* renamed from: e */
    public final Object m128629e() {
        return this.f118864a;
    }

    public String toString() {
        Object obj;
        HashMap hashMap;
        C24755h c24755h = this.f118865b;
        Integer num = null;
        if (c24755h != null) {
            obj = c24755h.f118864a;
        } else {
            obj = null;
        }
        if (c24755h != null && (hashMap = c24755h.f118866c) != null) {
            num = Integer.valueOf(hashMap.size());
        }
        return "SearchTreeNode[\n\tparent.value=" + obj + " \n\tparent.childrenSize=" + num + " \n\tvalue=" + this.f118864a + " \n\tchildren.size=" + this.f118866c.size() + "\n]";
    }
}
