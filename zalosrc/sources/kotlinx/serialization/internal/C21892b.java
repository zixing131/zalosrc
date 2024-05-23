package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19048e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26797i;

/* renamed from: kotlinx.serialization.internal.b */
/* loaded from: classes7.dex */
public final class C21892b extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21892b f107657c = new C21892b();

    private C21892b() {
        super(AbstractC25935a.m133632w(C19048e.f94918a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] mo114056r() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26797i c26797i, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26797i, "builder");
        c26797i.m137852e(interfaceC21885c.mo114003C(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26797i mo114055k(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "<this>");
        return new C26797i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, byte[] bArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(bArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114031q(getDescriptor(), i12, bArr[i12]);
        }
    }
}
