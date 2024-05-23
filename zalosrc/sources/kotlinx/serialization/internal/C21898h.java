package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19065m0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26808l1;

/* renamed from: kotlinx.serialization.internal.h */
/* loaded from: classes7.dex */
public final class C21898h extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21898h f107663c = new C21898h();

    private C21898h() {
        super(AbstractC25935a.m133602C(C19065m0.f94946a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(short[] sArr) {
        AbstractC19074t.m100208f(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] mo114056r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26808l1 c26808l1, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26808l1, "builder");
        c26808l1.m137875e(interfaceC21885c.mo114005F(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26808l1 mo114055k(short[] sArr) {
        AbstractC19074t.m100208f(sArr, "<this>");
        return new C26808l1(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, short[] sArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(sArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114020C(getDescriptor(), i12, sArr[i12]);
        }
    }
}
