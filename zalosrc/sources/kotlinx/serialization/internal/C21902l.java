package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24844e0;
import pm0.C24846f0;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26847y1;

/* renamed from: kotlinx.serialization.internal.l */
/* loaded from: classes7.dex */
public final class C21902l extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21902l f107667c = new C21902l();

    private C21902l() {
        super(AbstractC25935a.m133607H(C24844e0.f119240q));
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo114053e(Object obj) {
        return m114113v(((C24846f0) obj).m129199z());
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo114055k(Object obj) {
        return m114116y(((C24846f0) obj).m129199z());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo114056r() {
        return C24846f0.m129184d(m114114w());
    }

    @Override // tn0.AbstractC26790f1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo114057u(InterfaceC21886d interfaceC21886d, Object obj, int i11) {
        m114117z(interfaceC21886d, ((C24846f0) obj).m129199z(), i11);
    }

    /* renamed from: v */
    protected int m114113v(short[] sArr) {
        AbstractC19074t.m100208f(sArr, "$this$collectionSize");
        return C24846f0.m129191r(sArr);
    }

    /* renamed from: w */
    protected short[] m114114w() {
        return C24846f0.m129185e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26847y1 c26847y1, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26847y1, "builder");
        c26847y1.m138005e(C24844e0.m129177c(interfaceC21885c.mo114016s(getDescriptor(), i11).mo113975t()));
    }

    /* renamed from: y */
    protected C26847y1 m114116y(short[] sArr) {
        AbstractC19074t.m100208f(sArr, "$this$toBuilder");
        return new C26847y1(sArr, null);
    }

    /* renamed from: z */
    protected void m114117z(InterfaceC21886d interfaceC21886d, short[] sArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(sArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114027e(getDescriptor(), i12).mo113993r(C24846f0.m129190n(sArr, i12));
        }
    }
}
