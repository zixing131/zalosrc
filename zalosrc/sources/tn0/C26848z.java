package tn0;

import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: tn0.z */
/* loaded from: classes7.dex */
public final class C26848z extends AbstractC26819p0 {

    /* renamed from: c */
    private final SerialDescriptor f127115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26848z(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, null);
        AbstractC19074t.m100208f(kSerializer, "kSerializer");
        AbstractC19074t.m100208f(kSerializer2, "vSerializer");
        this.f127115c = new C26845y(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // tn0.AbstractC26819p0, kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127115c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap mo137792a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo137793b(HashMap hashMap) {
        AbstractC19074t.m100208f(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo137794c(HashMap hashMap, int i11) {
        AbstractC19074t.m100208f(hashMap, "<this>");
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
    public HashMap mo114055k(Map map) {
        HashMap hashMap;
        AbstractC19074t.m100208f(map, "<this>");
        if (map instanceof HashMap) {
            hashMap = (HashMap) map;
        } else {
            hashMap = null;
        }
        if (hashMap == null) {
            return new HashMap(map);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map mo137798l(HashMap hashMap) {
        AbstractC19074t.m100208f(hashMap, "<this>");
        return hashMap;
    }
}
