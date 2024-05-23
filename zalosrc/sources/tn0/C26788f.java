package tn0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: tn0.f */
/* loaded from: classes7.dex */
public final class C26788f extends AbstractC26815o {

    /* renamed from: b */
    private final SerialDescriptor f126992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26788f(KSerializer kSerializer) {
        super(kSerializer);
        AbstractC19074t.m100208f(kSerializer, "element");
        this.f126992b = new C26785e(kSerializer.getDescriptor());
    }

    @Override // tn0.AbstractC26812n, kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f126992b;
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: q */
    public ArrayList mo137792a() {
        return new ArrayList();
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: r */
    public int mo137793b(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: s */
    public void mo137794c(ArrayList arrayList, int i11) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        arrayList.ensureCapacity(i11);
    }

    @Override // tn0.AbstractC26812n
    /* renamed from: t */
    public void mo137818n(ArrayList arrayList, int i11, Object obj) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        arrayList.add(i11, obj);
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: u */
    public ArrayList mo114055k(List list) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList(list);
        }
        return arrayList;
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: v */
    public List mo137798l(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        return arrayList;
    }
}
