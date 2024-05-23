package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24838b0;
import pm0.C24840c0;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26841w1;

/* renamed from: kotlinx.serialization.internal.k */
/* loaded from: classes7.dex */
public final class C21901k extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21901k f107666c = new C21901k();

    private C21901k() {
        super(AbstractC25935a.m133606G(C24838b0.f119230q));
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo114053e(Object obj) {
        return m114108v(((C24840c0) obj).m129171z());
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo114055k(Object obj) {
        return m114111y(((C24840c0) obj).m129171z());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo114056r() {
        return C24840c0.m129156d(m114109w());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo114057u(InterfaceC21886d interfaceC21886d, Object obj, int i11) {
        m114112z(interfaceC21886d, ((C24840c0) obj).m129171z(), i11);
    }

    /* renamed from: v */
    protected int m114108v(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "$this$collectionSize");
        return C24840c0.m129163r(jArr);
    }

    /* renamed from: w */
    protected long[] m114109w() {
        return C24840c0.m129157e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26841w1 c26841w1, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26841w1, "builder");
        c26841w1.m137986e(C24838b0.m129150c(interfaceC21885c.mo114016s(getDescriptor(), i11).mo113973n()));
    }

    /* renamed from: y */
    protected C26841w1 m114111y(long[] jArr) {
        AbstractC19074t.m100208f(jArr, "$this$toBuilder");
        return new C26841w1(jArr, null);
    }

    /* renamed from: z */
    protected void m114112z(InterfaceC21886d interfaceC21886d, long[] jArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(jArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114027e(getDescriptor(), i12).mo113991n(C24840c0.m129162n(jArr, i12));
        }
    }
}
