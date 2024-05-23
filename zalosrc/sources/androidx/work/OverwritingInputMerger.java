package androidx.work;

import androidx.work.C2148h;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC2246n {
    @Override // androidx.work.AbstractC2246n
    /* renamed from: a */
    public C2148h mo11439a(List list) {
        AbstractC19074t.m100208f(list, "inputs");
        C2148h.a aVar = new C2148h.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map m11531i = ((C2148h) it.next()).m11531i();
            AbstractC19074t.m100207e(m11531i, "input.keyValueMap");
            linkedHashMap.putAll(m11531i);
        }
        aVar.m11537d(linkedHashMap);
        C2148h m11534a = aVar.m11534a();
        AbstractC19074t.m100207e(m11534a, "output.build()");
        return m11534a;
    }
}
