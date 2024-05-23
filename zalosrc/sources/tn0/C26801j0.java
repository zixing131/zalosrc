package tn0;

import fn0.AbstractC19074t;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: tn0.j0 */
/* loaded from: classes7.dex */
public final class C26801j0 extends AbstractC26815o {

    /* renamed from: b */
    private final SerialDescriptor f127010b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26801j0(KSerializer kSerializer) {
        super(kSerializer);
        AbstractC19074t.m100208f(kSerializer, "eSerializer");
        this.f127010b = new C26798i0(kSerializer.getDescriptor());
    }

    @Override // tn0.AbstractC26812n, kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127010b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo137792a() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int mo137793b(LinkedHashSet linkedHashSet) {
        AbstractC19074t.m100208f(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo137794c(LinkedHashSet linkedHashSet, int i11) {
        AbstractC19074t.m100208f(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo137818n(LinkedHashSet linkedHashSet, int i11, Object obj) {
        AbstractC19074t.m100208f(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet mo114055k(Set set) {
        LinkedHashSet linkedHashSet;
        AbstractC19074t.m100208f(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet(set);
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set mo137798l(LinkedHashSet linkedHashSet) {
        AbstractC19074t.m100208f(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
