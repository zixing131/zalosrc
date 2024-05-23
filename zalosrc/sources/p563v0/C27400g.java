package p563v0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import p563v0.InterfaceC27398e;

/* renamed from: v0.g */
/* loaded from: classes2.dex */
public final class C27400g extends C27402i implements InterfaceC27399f {

    /* renamed from: f */
    private static final InterfaceC27398e.b f129046f = InterfaceC27398e.b.OPTIONAL;

    private C27400g(TreeMap treeMap) {
        super(treeMap);
    }

    /* renamed from: k */
    public static C27400g m140361k() {
        return new C27400g(new TreeMap(C27402i.f129047d));
    }

    @Override // p563v0.InterfaceC27399f
    /* renamed from: c */
    public void mo140360c(InterfaceC27398e.a aVar, Object obj) {
        m140362l(aVar, f129046f, obj);
    }

    /* renamed from: l */
    public void m140362l(InterfaceC27398e.a aVar, InterfaceC27398e.b bVar, Object obj) {
        Map map = (Map) this.f129049c.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f129049c.put(aVar, arrayMap);
            arrayMap.put(bVar, obj);
            return;
        }
        InterfaceC27398e.b bVar2 = (InterfaceC27398e.b) Collections.min(map.keySet());
        if (!map.get(bVar2).equals(obj) && AbstractC27397d.m140356a(bVar2, bVar)) {
            throw new IllegalArgumentException("Option values conflicts: " + aVar.mo140353c() + ", existing value (" + bVar2 + ")=" + map.get(bVar2) + ", conflicting (" + bVar + ")=" + obj);
        }
        map.put(bVar, obj);
    }
}
