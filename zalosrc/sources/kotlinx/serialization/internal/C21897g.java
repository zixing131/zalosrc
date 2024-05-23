package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19076v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26807l0;

/* renamed from: kotlinx.serialization.internal.g */
/* loaded from: classes7.dex */
public final class C21897g extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21897g f107662c = new C21897g();

    private C21897g() {
        super(AbstractC25935a.m133601B(C19076v.f94952a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] mo114056r() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26807l0 c26807l0, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26807l0, "builder");
        c26807l0.m137873e(interfaceC21885c.mo114010f(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26807l0 mo114055k(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "<this>");
        return new C26807l0(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, long[] jArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(jArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114022E(getDescriptor(), i12, jArr[i12]);
        }
    }
}
