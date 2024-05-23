package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24836a0;
import pm0.C24869z;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26835u1;

/* renamed from: kotlinx.serialization.internal.j */
/* loaded from: classes7.dex */
public final class C21900j extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21900j f107665c = new C21900j();

    private C21900j() {
        super(AbstractC25935a.m133605F(C24869z.f119283q));
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo114053e(Object obj) {
        return m114103v(((C24836a0) obj).m129145z());
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo114055k(Object obj) {
        return m114106y(((C24836a0) obj).m129145z());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo114056r() {
        return C24836a0.m129130d(m114104w());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo114057u(InterfaceC21886d interfaceC21886d, Object obj, int i11) {
        m114107z(interfaceC21886d, ((C24836a0) obj).m129145z(), i11);
    }

    /* renamed from: v */
    protected int m114103v(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "$this$collectionSize");
        return C24836a0.m129137r(iArr);
    }

    /* renamed from: w */
    protected int[] m114104w() {
        return C24836a0.m129131e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26835u1 c26835u1, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26835u1, "builder");
        c26835u1.m137975e(C24869z.m129260c(interfaceC21885c.mo114016s(getDescriptor(), i11).mo113970h()));
    }

    /* renamed from: y */
    protected C26835u1 m114106y(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "$this$toBuilder");
        return new C26835u1(iArr, null);
    }

    /* renamed from: z */
    protected void m114107z(InterfaceC21886d interfaceC21886d, int[] iArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(iArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114027e(getDescriptor(), i12).mo113981B(C24836a0.m129136n(iArr, i12));
        }
    }
}
