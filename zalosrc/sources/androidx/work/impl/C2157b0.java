package androidx.work.impl;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p535u2.AbstractC26979z;
import p535u2.C26967n;
import p535u2.C26976w;
import qm0.AbstractC25332a0;

/* renamed from: androidx.work.impl.b0 */
/* loaded from: classes.dex */
public final class C2157b0 {

    /* renamed from: a */
    private final Object f9157a = new Object();

    /* renamed from: b */
    private final Map f9158b = new LinkedHashMap();

    /* renamed from: a */
    public final boolean m11584a(C26967n c26967n) {
        boolean containsKey;
        AbstractC19074t.m100208f(c26967n, "id");
        synchronized (this.f9157a) {
            containsKey = this.f9158b.containsKey(c26967n);
        }
        return containsKey;
    }

    /* renamed from: b */
    public final C2155a0 m11585b(C26967n c26967n) {
        C2155a0 c2155a0;
        AbstractC19074t.m100208f(c26967n, "id");
        synchronized (this.f9157a) {
            c2155a0 = (C2155a0) this.f9158b.remove(c26967n);
        }
        return c2155a0;
    }

    /* renamed from: c */
    public final List m11586c(String str) {
        List m131185M0;
        AbstractC19074t.m100208f(str, "workSpecId");
        synchronized (this.f9157a) {
            try {
                Map map = this.f9158b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (AbstractC19074t.m100204b(((C26967n) entry.getKey()).m138955b(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.f9158b.remove((C26967n) it.next());
                }
                m131185M0 = AbstractC25332a0.m131185M0(linkedHashMap.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m131185M0;
    }

    /* renamed from: d */
    public final C2155a0 m11587d(C26967n c26967n) {
        C2155a0 c2155a0;
        AbstractC19074t.m100208f(c26967n, "id");
        synchronized (this.f9157a) {
            try {
                Map map = this.f9158b;
                Object obj = map.get(c26967n);
                if (obj == null) {
                    obj = new C2155a0(c26967n);
                    map.put(c26967n, obj);
                }
                c2155a0 = (C2155a0) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2155a0;
    }

    /* renamed from: e */
    public final C2155a0 m11588e(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "spec");
        return m11587d(AbstractC26979z.m139035a(c26976w));
    }
}
