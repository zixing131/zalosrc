package p735do;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gn0.InterfaceC19521e;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: do.a */
/* loaded from: classes4.dex */
public abstract class AbstractC18033a implements Map, InterfaceC19521e {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private final int f91302p;

    /* renamed from: q */
    private final Map f91303q;

    /* renamed from: do.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: do.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32806a extends LinkedHashMap {

            /* renamed from: p */
            final /* synthetic */ int f91304p;

            C32806a(int i11) {
                this.f91304p = i11;
            }

            /* renamed from: a */
            public /* bridge */ Set m95877a() {
                return super.entrySet();
            }

            /* renamed from: b */
            public /* bridge */ Set m95878b() {
                return super.keySet();
            }

            /* renamed from: c */
            public /* bridge */ int m95879c() {
                return super.size();
            }

            /* renamed from: e */
            public /* bridge */ Collection m95880e() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set entrySet() {
                return m95877a();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set keySet() {
                return m95878b();
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry entry) {
                if (this.f91304p != -1 && size() > this.f91304p) {
                    return true;
                }
                return false;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return m95879c();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection values() {
                return m95880e();
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Map m95876b(int i11) {
            Map synchronizedMap = Collections.synchronizedMap(new C32806a(i11));
            AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
            return synchronizedMap;
        }
    }

    public AbstractC18033a(int i11, Map map) {
        AbstractC19074t.m100208f(map, ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE);
        this.f91302p = i11;
        this.f91303q = map;
    }

    /* renamed from: a */
    public Set m95871a() {
        return this.f91303q.entrySet();
    }

    /* renamed from: b */
    public Set m95872b() {
        return this.f91303q.keySet();
    }

    /* renamed from: c */
    public int m95873c() {
        return this.f91303q.size();
    }

    @Override // java.util.Map
    public void clear() {
        this.f91303q.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f91303q.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f91303q.containsValue(obj);
    }

    /* renamed from: d */
    public Collection m95874d() {
        return this.f91303q.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m95871a();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f91303q.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f91303q.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m95872b();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f91303q.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        AbstractC19074t.m100208f(map, "from");
        this.f91303q.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f91303q.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m95873c();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m95874d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AbstractC18033a(int i11, Map map, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? Companion.m95876b(i11) : map);
        i11 = (i12 & 1) != 0 ? -1 : i11;
    }
}
