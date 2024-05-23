package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19046d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26791g;

/* renamed from: kotlinx.serialization.internal.a */
/* loaded from: classes7.dex */
public final class C21891a extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21891a f107656c = new C21891a();

    private C21891a() {
        super(AbstractC25935a.m133631v(C19046d.f94917a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(boolean[] zArr) {
        AbstractC19074t.m100208f(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] mo114056r() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26791g c26791g, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26791g, "builder");
        c26791g.m137835e(interfaceC21885c.mo114004D(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26791g mo114055k(boolean[] zArr) {
        AbstractC19074t.m100208f(zArr, "<this>");
        return new C26791g(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, boolean[] zArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(zArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114034y(getDescriptor(), i12, zArr[i12]);
        }
    }
}
