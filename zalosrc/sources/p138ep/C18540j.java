package p138ep;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ep.j */
/* loaded from: classes4.dex */
public final class C18540j {

    /* renamed from: a */
    public static final C18540j f93240a = new C18540j();

    /* renamed from: b */
    private static final Map f93241b;

    /* renamed from: ep.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends LinkedHashMap {
        a() {
        }

        /* renamed from: a */
        public /* bridge */ boolean m97950a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m97951b(EnumC18539i enumC18539i) {
            return super.containsValue(enumC18539i);
        }

        /* renamed from: c */
        public /* bridge */ EnumC18539i m97952c(String str) {
            return (EnumC18539i) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m97950a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof EnumC18539i)) {
                return false;
            }
            return m97951b((EnumC18539i) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m97953e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m97953e();
        }

        /* renamed from: f */
        public /* bridge */ Set m97954f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ EnumC18539i m97955g(String str, EnumC18539i enumC18539i) {
            return (EnumC18539i) super.getOrDefault(str, enumC18539i);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return m97952c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return m97955g((String) obj, (EnumC18539i) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m97956h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m97957i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ EnumC18539i m97958k(String str) {
            return (EnumC18539i) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m97954f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m97959l(String str, EnumC18539i enumC18539i) {
            return super.remove(str, enumC18539i);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m97958k((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 300) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m97956h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m97957i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof EnumC18539i)) {
                return m97959l((String) obj, (EnumC18539i) obj2);
            }
            return false;
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new a());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f93241b = synchronizedMap;
    }

    private C18540j() {
    }

    /* renamed from: a */
    public final EnumC18539i m97948a(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        EnumC18539i enumC18539i = (EnumC18539i) f93241b.get(str);
        if (enumC18539i == null) {
            return EnumC18539i.f93233p;
        }
        return enumC18539i;
    }

    /* renamed from: b */
    public final void m97949b(String str, EnumC18539i enumC18539i) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(enumC18539i, "state");
        f93241b.put(str, enumC18539i);
    }
}
