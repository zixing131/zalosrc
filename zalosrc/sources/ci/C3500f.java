package ci;

import au.EnumC2382z;
import ci.C3508j;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.control.mediastore.MSFilterData;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qm0.AbstractC25370t;

/* renamed from: ci.f */
/* loaded from: classes3.dex */
public final class C3500f {

    /* renamed from: a */
    private final String f14669a;

    /* renamed from: b */
    public final Map f14670b;

    /* renamed from: c */
    private final Map f14671c;

    public C3500f(String str) {
        AbstractC19074t.m100208f(str, "mConversationId");
        this.f14669a = str;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f14670b = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new EnumMap(C3508j.b.class));
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        this.f14671c = synchronizedMap2;
    }

    /* renamed from: g */
    private final boolean m17652g(long j11) {
        try {
            if (this.f14670b.remove(Long.valueOf(j11)) == null) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final void m17653a(C3508j c3508j) {
        AbstractC19074t.m100208f(c3508j, "collectionItem");
        this.f14670b.put(Long.valueOf(c3508j.m17711w0()), c3508j);
    }

    /* renamed from: b */
    public final boolean m17654b() {
        int m131511r;
        boolean z11;
        synchronized (this.f14670b) {
            try {
                HashSet hashSet = new HashSet();
                Collection values = this.f14670b.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : values) {
                    C3508j c3508j = (C3508j) obj;
                    if (c3508j.m17697J0() && c3508j.m17711w0() > 0) {
                        arrayList.add(obj);
                    }
                }
                m131511r = AbstractC25370t.m131511r(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((C3508j) it.next()).m17711w0()));
                }
                hashSet.addAll(arrayList2);
                z11 = true;
                boolean z12 = false;
                if (!hashSet.isEmpty()) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        long longValue = ((Number) it2.next()).longValue();
                        this.f14670b.remove(Long.valueOf(longValue));
                        m17652g(longValue);
                    }
                    for (C3510k c3510k : this.f14671c.values()) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            z12 |= c3510k.m17746c1(((Number) it3.next()).longValue());
                        }
                    }
                    if (z12) {
                        Iterator it4 = this.f14671c.entrySet().iterator();
                        while (it4.hasNext()) {
                            if (((C3510k) ((Map.Entry) it4.next()).getValue()).m17692E0() == 0) {
                                it4.remove();
                            }
                        }
                    }
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: c */
    public final C3510k m17655c(C3508j.b bVar) {
        AbstractC19074t.m100208f(bVar, "collectionSubtype");
        C3510k c3510k = (C3510k) this.f14671c.get(bVar);
        if (c3510k == null) {
            C3510k c3510k2 = new C3510k(new CreateMediaStoreParam(this.f14669a, null, null, 6, null));
            c3510k2.m17701N0(bVar);
            this.f14671c.put(bVar, c3510k2);
            return c3510k2;
        }
        return c3510k;
    }

    /* renamed from: d */
    public final C3508j m17656d(CreateMediaStoreParam createMediaStoreParam) {
        CreateMediaStoreParam createMediaStoreParam2;
        Object obj;
        String str;
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        Iterator it = this.f14670b.values().iterator();
        while (true) {
            createMediaStoreParam2 = null;
            if (it.hasNext()) {
                obj = it.next();
                String valueOf = String.valueOf(((C3508j) obj).m17711w0());
                MSFilterData m40909b = createMediaStoreParam.m40909b();
                if (m40909b == null || (str = m40909b.m40918b()) == null) {
                    str = "";
                }
                if (AbstractC19074t.m100204b(valueOf, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3508j c3508j = (C3508j) obj;
        if (c3508j != null) {
            createMediaStoreParam2 = c3508j.m17609N();
        }
        if (createMediaStoreParam2 != null) {
            createMediaStoreParam2.m40911d(createMediaStoreParam.m40909b());
        }
        return c3508j;
    }

    /* renamed from: e */
    public final List m17657e() {
        return new ArrayList(this.f14670b.values());
    }

    /* renamed from: f */
    public final List m17658f(List list, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            try {
                Iterator it = this.f14670b.entrySet().iterator();
                while (it.hasNext()) {
                    C3508j c3508j = (C3508j) ((Map.Entry) it.next()).getValue();
                    if (c3508j.m17699L0(list, enumC2382z, true)) {
                        arrayList.add(c3508j);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }
}
