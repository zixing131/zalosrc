package tw;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: tw.c */
/* loaded from: classes4.dex */
public abstract class AbstractC26901c extends TreeMap {
    /* renamed from: a */
    public /* bridge */ boolean m138643a(Comparable comparable) {
        return super.containsKey(comparable);
    }

    /* renamed from: b */
    public final Comparable m138644b() {
        Comparable comparable;
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            comparable = (Comparable) firstEntry.getKey();
        } else {
            comparable = null;
        }
        if (comparable == null) {
            return mo136085h();
        }
        return comparable;
    }

    /* renamed from: c */
    public final Comparable m138645c(Comparable comparable) {
        Comparable comparable2;
        AbstractC19074t.m100208f(comparable, "key");
        Map.Entry floorEntry = floorEntry(comparable);
        if (floorEntry != null) {
            comparable2 = (Comparable) floorEntry.getKey();
        } else {
            comparable2 = null;
        }
        if (comparable2 == null) {
            return mo136085h();
        }
        return comparable2;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof Comparable)) {
            return false;
        }
        return m138643a((Comparable) obj);
    }

    /* renamed from: e */
    public final Object m138646e(Comparable comparable) {
        AbstractC19074t.m100208f(comparable, "key");
        Map.Entry floorEntry = floorEntry(comparable);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ Set entrySet() {
        return m138648g();
    }

    /* renamed from: f */
    public /* bridge */ Object m138647f(Comparable comparable) {
        return super.get(comparable);
    }

    /* renamed from: g */
    public /* bridge */ Set m138648g() {
        return super.entrySet();
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        return m138647f((Comparable) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Comparable)) {
            return obj2;
        }
        return m138650k((Comparable) obj, obj2);
    }

    /* renamed from: h */
    public abstract Comparable mo136085h();

    /* renamed from: i */
    public /* bridge */ Set m138649i() {
        return super.keySet();
    }

    /* renamed from: k */
    public /* bridge */ Object m138650k(Comparable comparable, Object obj) {
        return super.getOrDefault(comparable, obj);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ Set keySet() {
        return m138649i();
    }

    /* renamed from: l */
    public /* bridge */ int m138651l() {
        return super.size();
    }

    /* renamed from: n */
    public /* bridge */ Collection m138652n() {
        return super.values();
    }

    /* renamed from: o */
    public final Comparable m138653o(Comparable comparable) {
        Comparable comparable2;
        AbstractC19074t.m100208f(comparable, "key");
        Map.Entry higherEntry = higherEntry(comparable);
        if (higherEntry != null) {
            comparable2 = (Comparable) higherEntry.getKey();
        } else {
            comparable2 = null;
        }
        if (comparable2 == null) {
            return mo136085h();
        }
        return comparable2;
    }

    /* renamed from: p */
    public final Object m138654p(Comparable comparable) {
        AbstractC19074t.m100208f(comparable, "key");
        Map.Entry higherEntry = higherEntry(comparable);
        if (higherEntry != null) {
            return higherEntry.getValue();
        }
        return null;
    }

    /* renamed from: q */
    public final Comparable m138655q() {
        Comparable comparable;
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            comparable = (Comparable) lastEntry.getKey();
        } else {
            comparable = null;
        }
        if (comparable == null) {
            return mo136085h();
        }
        return comparable;
    }

    /* renamed from: r */
    public final Object m138656r() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getValue();
        }
        return null;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof Comparable) {
            return m138657u((Comparable) obj);
        }
        return null;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m138651l();
    }

    /* renamed from: u */
    public /* bridge */ Object m138657u(Comparable comparable) {
        return super.remove(comparable);
    }

    /* renamed from: v */
    public /* bridge */ boolean m138658v(Comparable comparable, Object obj) {
        return super.remove(comparable, obj);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* bridge */ Collection values() {
        return m138652n();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj == null || (obj instanceof Comparable)) {
            return m138658v((Comparable) obj, obj2);
        }
        return false;
    }
}
