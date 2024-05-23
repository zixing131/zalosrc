package p563v0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p563v0.InterfaceC27398e;

/* renamed from: v0.i */
/* loaded from: classes2.dex */
public class C27402i implements InterfaceC27398e {

    /* renamed from: d */
    protected static final Comparator f129047d;

    /* renamed from: e */
    private static final C27402i f129048e;

    /* renamed from: c */
    protected final TreeMap f129049c;

    static {
        Comparator comparator = new Comparator() { // from class: v0.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m140365i;
                m140365i = C27402i.m140365i((InterfaceC27398e.a) obj, (InterfaceC27398e.a) obj2);
                return m140365i;
            }
        };
        f129047d = comparator;
        f129048e = new C27402i(new TreeMap(comparator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27402i(TreeMap treeMap) {
        this.f129049c = treeMap;
    }

    /* renamed from: h */
    public static C27402i m140364h(InterfaceC27398e interfaceC27398e) {
        if (C27402i.class.equals(interfaceC27398e.getClass())) {
            return (C27402i) interfaceC27398e;
        }
        TreeMap treeMap = new TreeMap(f129047d);
        for (InterfaceC27398e.a aVar : interfaceC27398e.mo138726b()) {
            Set<InterfaceC27398e.b> mo138727d = interfaceC27398e.mo138727d(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC27398e.b bVar : mo138727d) {
                arrayMap.put(bVar, interfaceC27398e.mo138728e(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C27402i(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ int m140365i(InterfaceC27398e.a aVar, InterfaceC27398e.a aVar2) {
        return aVar.mo140353c().compareTo(aVar2.mo140353c());
    }

    @Override // p563v0.InterfaceC27398e
    /* renamed from: b */
    public Set mo138726b() {
        return Collections.unmodifiableSet(this.f129049c.keySet());
    }

    @Override // p563v0.InterfaceC27398e
    /* renamed from: d */
    public Set mo138727d(InterfaceC27398e.a aVar) {
        Map map = (Map) this.f129049c.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // p563v0.InterfaceC27398e
    /* renamed from: e */
    public Object mo138728e(InterfaceC27398e.a aVar, InterfaceC27398e.b bVar) {
        Map map = (Map) this.f129049c.get(aVar);
        if (map != null) {
            if (map.containsKey(bVar)) {
                return map.get(bVar);
            }
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + bVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p563v0.InterfaceC27398e
    /* renamed from: f */
    public Object mo140357f(InterfaceC27398e.a aVar, Object obj) {
        try {
            return m140366j(aVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    /* renamed from: j */
    public Object m140366j(InterfaceC27398e.a aVar) {
        Map map = (Map) this.f129049c.get(aVar);
        if (map != null) {
            return map.get((InterfaceC27398e.b) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
