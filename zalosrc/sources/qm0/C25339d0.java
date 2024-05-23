package qm0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: qm0.d0 */
/* loaded from: classes7.dex */
public final class C25339d0 implements Map, Serializable, InterfaceC19517a {

    /* renamed from: p */
    public static final C25339d0 f121531p = new C25339d0();
    private static final long serialVersionUID = 8246714829545688274L;

    private C25339d0() {
    }

    private final Object readResolve() {
        return f121531p;
    }

    /* renamed from: a */
    public boolean m131249a(Void r22) {
        AbstractC19074t.m100208f(r22, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set m131251c() {
        return C25341e0.f121532p;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m131249a((Void) obj);
    }

    /* renamed from: d */
    public Set m131252d() {
        return C25341e0.f121532p;
    }

    /* renamed from: e */
    public int m131253e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m131251c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Collection m131254f() {
        return C25337c0.f121530p;
    }

    @Override // java.util.Map
    /* renamed from: g */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m131252d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m131253e();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m131254f();
    }
}
