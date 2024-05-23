package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19052g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26806l;

/* renamed from: kotlinx.serialization.internal.c */
/* loaded from: classes7.dex */
public final class C21893c extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21893c f107658c = new C21893c();

    private C21893c() {
        super(AbstractC25935a.m133633x(C19052g.f94929a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(char[] cArr) {
        AbstractC19074t.m100208f(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] mo114056r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26806l c26806l, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26806l, "builder");
        c26806l.m137871e(interfaceC21885c.mo114002B(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26806l mo114055k(char[] cArr) {
        AbstractC19074t.m100208f(cArr, "<this>");
        return new C26806l(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, char[] cArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(cArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114030o(getDescriptor(), i12, cArr[i12]);
        }
    }
}
