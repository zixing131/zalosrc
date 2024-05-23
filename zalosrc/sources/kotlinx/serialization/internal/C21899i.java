package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24867x;
import pm0.C24868y;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26829s1;

/* renamed from: kotlinx.serialization.internal.i */
/* loaded from: classes7.dex */
public final class C21899i extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21899i f107664c = new C21899i();

    private C21899i() {
        super(AbstractC25935a.m133604E(C24867x.f119278q));
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo114053e(Object obj) {
        return m114098v(((C24868y) obj).m129257z());
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo114055k(Object obj) {
        return m114101y(((C24868y) obj).m129257z());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo114056r() {
        return C24868y.m129242d(m114099w());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo114057u(InterfaceC21886d interfaceC21886d, Object obj, int i11) {
        m114102z(interfaceC21886d, ((C24868y) obj).m129257z(), i11);
    }

    /* renamed from: v */
    protected int m114098v(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "$this$collectionSize");
        return C24868y.m129249r(bArr);
    }

    /* renamed from: w */
    protected byte[] m114099w() {
        return C24868y.m129243e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26829s1 c26829s1, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26829s1, "builder");
        c26829s1.m137960e(C24867x.m129237c(interfaceC21885c.mo114016s(getDescriptor(), i11).mo113967H()));
    }

    /* renamed from: y */
    protected C26829s1 m114101y(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "$this$toBuilder");
        return new C26829s1(bArr, null);
    }

    /* renamed from: z */
    protected void m114102z(InterfaceC21886d interfaceC21886d, byte[] bArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(bArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114027e(getDescriptor(), i12).mo113986g(C24868y.m129248n(bArr, i12));
        }
    }
}
