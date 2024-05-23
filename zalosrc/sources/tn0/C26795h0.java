package tn0;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: tn0.h0 */
/* loaded from: classes7.dex */
public final class C26795h0 extends AbstractC26819p0 {

    /* renamed from: c */
    private final SerialDescriptor f127002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26795h0(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, null);
        AbstractC19074t.m100208f(kSerializer, "kSerializer");
        AbstractC19074t.m100208f(kSerializer2, "vSerializer");
        this.f127002c = new C26792g0(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // tn0.AbstractC26819p0, kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127002c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo137792a() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo137793b(LinkedHashMap linkedHashMap) {
        AbstractC19074t.m100208f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo137794c(LinkedHashMap linkedHashMap, int i11) {
        AbstractC19074t.m100208f(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator mo137795d(Map map) {
        AbstractC19074t.m100208f(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int mo114053e(Map map) {
        AbstractC19074t.m100208f(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo114055k(Map map) {
        LinkedHashMap linkedHashMap;
        AbstractC19074t.m100208f(map, "<this>");
        if (map instanceof LinkedHashMap) {
            linkedHashMap = (LinkedHashMap) map;
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new LinkedHashMap(map);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map mo137798l(LinkedHashMap linkedHashMap) {
        AbstractC19074t.m100208f(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
