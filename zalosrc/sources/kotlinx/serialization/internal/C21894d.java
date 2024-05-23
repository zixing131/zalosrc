package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19062l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26818p;

/* renamed from: kotlinx.serialization.internal.d */
/* loaded from: classes7.dex */
public final class C21894d extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21894d f107659c = new C21894d();

    private C21894d() {
        super(AbstractC25935a.m133634y(C19062l.f94944a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(double[] dArr) {
        AbstractC19074t.m100208f(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] mo114056r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26818p c26818p, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26818p, "builder");
        c26818p.m137909e(interfaceC21885c.mo114006G(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26818p mo114055k(double[] dArr) {
        AbstractC19074t.m100208f(dArr, "<this>");
        return new C26818p(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, double[] dArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(dArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114021D(getDescriptor(), i12, dArr[i12]);
        }
    }
}
