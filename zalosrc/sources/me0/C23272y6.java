package me0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7961f;
import dj.C17945a0;
import fn0.AbstractC19074t;
import ga0.InterfaceC19305a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import p019aj.C0877k;
import p348mi.AbstractC23306f;
import p612wk.AbstractC29069a;
import pm0.AbstractC24866w;
import pm0.C24860q;

/* renamed from: me0.y6 */
/* loaded from: classes4.dex */
public final class C23272y6 {

    /* renamed from: b */
    private static String f112781b;

    /* renamed from: c */
    private static String f112782c;

    /* renamed from: e */
    private static final Map f112784e;

    /* renamed from: a */
    public static final C23272y6 f112780a = new C23272y6();

    /* renamed from: d */
    private static final C24860q f112783d = AbstractC24866w.m129235a(new ConcurrentHashMap(), new ConcurrentHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.y6$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* renamed from: me0.y6$b */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a */
        public static final b f112785a = new b();

        private b() {
        }
    }

    /* renamed from: me0.y6$c */
    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a */
        public static final c f112786a = new c();

        private c() {
        }
    }

    /* renamed from: me0.y6$d */
    /* loaded from: classes4.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final List f112787a;

        public d(List list) {
            AbstractC19074t.m100208f(list, "data");
            this.f112787a = list;
        }

        /* renamed from: a */
        public final List m120055a() {
            return this.f112787a;
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f112784e = synchronizedMap;
    }

    private C23272y6() {
    }

    /* renamed from: a */
    public static final void m120045a() {
        C24860q c24860q = f112783d;
        ((ConcurrentHashMap) c24860q.m129215c()).clear();
        ((ConcurrentHashMap) c24860q.m129216d()).clear();
        f112781b = null;
        f112782c = null;
        f112784e.clear();
    }

    /* renamed from: b */
    public static final void m120046b() {
        ((ConcurrentHashMap) f112783d.m129216d()).clear();
        f112782c = null;
    }

    /* renamed from: c */
    private static final d m120047c(String str, AbstractC29069a.f fVar, int i11, int i12, InterfaceC19305a interfaceC19305a) {
        List m120051i;
        if (fVar.m145179e() == null) {
            m120051i = f112780a.m120052j(str, fVar.m145178d(), interfaceC19305a);
        } else {
            m120051i = f112780a.m120051i(str, fVar.m145179e(), i11, i12, fVar.m145178d(), interfaceC19305a);
        }
        return new d(m120051i);
    }

    /* renamed from: f */
    private final C17945a0 m120048f(MessageId messageId) {
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
        if (m2635r != null) {
            return C0877k.f3256a.m2660a(m2635r);
        }
        return null;
    }

    /* renamed from: g */
    public static final d m120049g(String str, AbstractC29069a.f fVar, int i11, int i12, InterfaceC19305a interfaceC19305a) {
        ConcurrentHashMap concurrentHashMap;
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(fVar, "filterData");
        a m120050h = f112780a.m120050h(str, fVar, i11);
        if (m120050h instanceof d) {
            return (d) m120050h;
        }
        if (AbstractC19074t.m100204b(m120050h, c.f112786a)) {
            return m120047c(str, fVar, i11, i12, interfaceC19305a);
        }
        if (AbstractC19074t.m100204b(m120050h, b.f112785a)) {
            d m120047c = m120047c(str, fVar, i11, i12, interfaceC19305a);
            if (interfaceC19305a == null || !interfaceC19305a.isCancelled()) {
                f112781b = str;
                f112782c = fVar.m145179e();
                if (fVar.m145179e() == null || (concurrentHashMap = (ConcurrentHashMap) f112783d.m129216d()) == null) {
                    concurrentHashMap = (ConcurrentHashMap) f112783d.m129215c();
                }
                concurrentHashMap.put(Integer.valueOf(fVar.m145178d()), m120047c);
                return m120047c;
            }
            return m120047c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    private final a m120050h(String str, AbstractC29069a.f fVar, int i11) {
        if (i11 != 0) {
            return c.f112786a;
        }
        if (!AbstractC19074t.m100204b(f112781b, str)) {
            m120045a();
            return b.f112785a;
        }
        String str2 = f112782c;
        if (fVar.m145179e() != null && fVar.m145179e() != str2) {
            m120046b();
            return b.f112785a;
        }
        if (fVar.m145179e() != null) {
            a aVar = (d) ((ConcurrentHashMap) f112783d.m129216d()).get(Integer.valueOf(fVar.m145178d()));
            if (aVar == null) {
                aVar = b.f112785a;
            } else {
                AbstractC19074t.m100205c(aVar);
            }
            if (aVar != null) {
                return aVar;
            }
        }
        d dVar = (d) ((ConcurrentHashMap) f112783d.m129215c()).get(Integer.valueOf(fVar.m145178d()));
        if (dVar == null) {
            return b.f112785a;
        }
        return dVar;
    }

    /* renamed from: i */
    private final List m120051i(String str, String str2, int i11, int i12, int i13, InterfaceC19305a interfaceC19305a) {
        return C7961f.Companion.m42658b().m42648O(str, str2, null, i11, i12, i13, interfaceC19305a);
    }

    /* renamed from: j */
    private final List m120052j(String str, int i11, InterfaceC19305a interfaceC19305a) {
        return C7961f.Companion.m42658b().m42649P(str, i11, interfaceC19305a);
    }

    /* renamed from: d */
    public final C17945a0 m120053d(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        Map map = f112784e;
        C17945a0 c17945a0 = (C17945a0) map.get(messageId);
        if (c17945a0 == null) {
            C17945a0 m120048f = m120048f(messageId);
            if (m120048f != null) {
                map.put(messageId, m120048f);
                return m120048f;
            }
            return null;
        }
        return c17945a0;
    }

    /* renamed from: e */
    public final C17945a0 m120054e(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        return (C17945a0) f112784e.get(messageId);
    }
}
