package p138ep;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ep.g */
/* loaded from: classes4.dex */
public final class C18537g {

    /* renamed from: a */
    public static final C18537g f93231a = new C18537g();

    /* renamed from: b */
    private static final Map f93232b;

    /* renamed from: ep.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends LinkedHashMap {
        a() {
        }

        /* renamed from: a */
        public /* bridge */ boolean m97934a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m97935b(EnumC18536f enumC18536f) {
            return super.containsValue(enumC18536f);
        }

        /* renamed from: c */
        public /* bridge */ EnumC18536f m97936c(String str) {
            return (EnumC18536f) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m97934a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof EnumC18536f)) {
                return false;
            }
            return m97935b((EnumC18536f) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m97937e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m97937e();
        }

        /* renamed from: f */
        public /* bridge */ Set m97938f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ EnumC18536f m97939g(String str, EnumC18536f enumC18536f) {
            return (EnumC18536f) super.getOrDefault(str, enumC18536f);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return m97936c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return m97939g((String) obj, (EnumC18536f) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m97940h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m97941i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ EnumC18536f m97942k(String str) {
            return (EnumC18536f) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m97938f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m97943l(String str, EnumC18536f enumC18536f) {
            return super.remove(str, enumC18536f);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m97942k((String) obj);
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
            return m97940h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m97941i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof EnumC18536f)) {
                return m97943l((String) obj, (EnumC18536f) obj2);
            }
            return false;
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new a());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f93232b = synchronizedMap;
    }

    private C18537g() {
    }

    /* renamed from: a */
    public final EnumC18536f m97932a(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        EnumC18536f enumC18536f = (EnumC18536f) f93232b.get(str);
        if (enumC18536f == null) {
            return EnumC18536f.f93224p;
        }
        return enumC18536f;
    }

    /* renamed from: b */
    public final void m97933b(String str, EnumC18536f enumC18536f) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(enumC18536f, "state");
        f93232b.put(str, enumC18536f);
    }
}
