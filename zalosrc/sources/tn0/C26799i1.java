package tn0;

import fn0.AbstractC19044c;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mn0.InterfaceC23364b;
import qm0.AbstractC25356m;

/* renamed from: tn0.i1 */
/* loaded from: classes7.dex */
public final class C26799i1 extends AbstractC26812n {

    /* renamed from: b */
    private final InterfaceC23364b f127006b;

    /* renamed from: c */
    private final SerialDescriptor f127007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26799i1(InterfaceC23364b interfaceC23364b, KSerializer kSerializer) {
        super(kSerializer, null);
        AbstractC19074t.m100208f(interfaceC23364b, "kClass");
        AbstractC19074t.m100208f(kSerializer, "eSerializer");
        this.f127006b = interfaceC23364b;
        this.f127007c = new C26782d(kSerializer.getDescriptor());
    }

    @Override // tn0.AbstractC26812n, kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127007c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList mo137792a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo137793b(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo137794c(ArrayList arrayList, int i11) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        arrayList.ensureCapacity(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator mo137795d(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        return AbstractC19044c.m100149a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int mo114053e(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        return objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo137818n(ArrayList arrayList, int i11, Object obj) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        arrayList.add(i11, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList mo114055k(Object[] objArr) {
        List m131320c;
        AbstractC19074t.m100208f(objArr, "<this>");
        m131320c = AbstractC25356m.m131320c(objArr);
        return new ArrayList(m131320c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] mo137798l(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        return AbstractC26846y0.m138004j(arrayList, this.f127006b);
    }
}
