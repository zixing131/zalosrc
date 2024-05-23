package p399op;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19521e;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: op.a */
/* loaded from: classes4.dex */
public abstract class AbstractC24389a implements Map, InterfaceC19521e {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private final int f117761p;

    /* renamed from: q */
    private final Map f117762q;

    /* renamed from: op.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: op.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32917a extends LinkedHashMap {

            /* renamed from: p */
            final /* synthetic */ int f117763p;

            C32917a(int i11) {
                this.f117763p = i11;
            }

            /* renamed from: a */
            public /* bridge */ boolean m127561a(String str) {
                return super.containsKey(str);
            }

            /* renamed from: b */
            public /* bridge */ Object m127562b(String str) {
                return super.get(str);
            }

            /* renamed from: c */
            public /* bridge */ Set m127563c() {
                return super.entrySet();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return m127561a((String) obj);
            }

            /* renamed from: e */
            public /* bridge */ Set m127564e() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set entrySet() {
                return m127563c();
            }

            /* renamed from: f */
            public /* bridge */ Object m127565f(String str, Object obj) {
                return super.getOrDefault(str, obj);
            }

            /* renamed from: g */
            public /* bridge */ int m127566g() {
                return super.size();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return m127562b((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return m127565f((String) obj, obj2);
            }

            /* renamed from: h */
            public /* bridge */ Collection m127567h() {
                return super.values();
            }

            /* renamed from: i */
            public /* bridge */ Object m127568i(String str) {
                return super.remove(str);
            }

            /* renamed from: k */
            public /* bridge */ boolean m127569k(String str, Object obj) {
                return super.remove(str, obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set keySet() {
                return m127564e();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Object remove(Object obj) {
                if (obj instanceof String) {
                    return m127568i((String) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry entry) {
                if (this.f117763p != -1 && size() > this.f117763p) {
                    return true;
                }
                return false;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return m127566g();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection values() {
                return m127567h();
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (obj instanceof String) {
                    return m127569k((String) obj, obj2);
                }
                return false;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Map m127560b(int i11) {
            Map synchronizedMap = Collections.synchronizedMap(new C32917a(i11));
            AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
            return synchronizedMap;
        }
    }

    public AbstractC24389a(int i11, Map map) {
        AbstractC19074t.m100208f(map, ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE);
        this.f117761p = i11;
        this.f117762q = map;
    }

    /* renamed from: a */
    public boolean m127551a(String str) {
        AbstractC19074t.m100208f(str, "key");
        return this.f117762q.containsKey(str);
    }

    /* renamed from: b */
    public Object m127552b(String str) {
        AbstractC19074t.m100208f(str, "key");
        return this.f117762q.get(str);
    }

    @Override // java.util.Map
    public void clear() {
        this.f117762q.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return m127551a((String) obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f117762q.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m127553h();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m127552b((String) obj);
    }

    /* renamed from: h */
    public Set m127553h() {
        return this.f117762q.entrySet();
    }

    /* renamed from: i */
    public Set m127554i() {
        return this.f117762q.keySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f117762q.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m127554i();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        AbstractC19074t.m100208f(map, "from");
        this.f117762q.putAll(map);
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m127558y((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m127555v();
    }

    /* renamed from: v */
    public int m127555v() {
        return this.f117762q.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m127556w();
    }

    /* renamed from: w */
    public Collection m127556w() {
        return this.f117762q.values();
    }

    @Override // java.util.Map
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        AbstractC19074t.m100208f(str, "key");
        return this.f117762q.put(str, obj);
    }

    /* renamed from: y */
    public Object m127558y(String str) {
        AbstractC19074t.m100208f(str, "key");
        return this.f117762q.remove(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AbstractC24389a(int i11, Map map, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? Companion.m127560b(i11) : map);
        i11 = (i12 & 1) != 0 ? -1 : i11;
    }
}
