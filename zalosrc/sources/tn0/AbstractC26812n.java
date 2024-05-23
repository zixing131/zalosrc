package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;

/* renamed from: tn0.n */
/* loaded from: classes7.dex */
public abstract class AbstractC26812n extends AbstractC26772a {

    /* renamed from: a */
    private final KSerializer f127028a;

    public /* synthetic */ AbstractC26812n(KSerializer kSerializer, AbstractC19060k abstractC19060k) {
        this(kSerializer);
    }

    @Override // tn0.AbstractC26772a
    /* renamed from: g */
    protected final void mo137797g(InterfaceC21885c interfaceC21885c, Object obj, int i11, int i12) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        if (i12 >= 0) {
            for (int i13 = 0; i13 < i12; i13++) {
                mo114054h(interfaceC21885c, i11 + i13, obj, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public abstract SerialDescriptor getDescriptor();

    @Override // tn0.AbstractC26772a
    /* renamed from: h */
    protected void mo114054h(InterfaceC21885c interfaceC21885c, int i11, Object obj, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        mo137818n(obj, i11, InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), i11, this.f127028a, null, 8, null));
    }

    /* renamed from: n */
    protected abstract void mo137818n(Object obj, int i11, Object obj2);

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        int mo114053e = mo114053e(obj);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21886d mo113988k = encoder.mo113988k(descriptor, mo114053e);
        Iterator mo137795d = mo137795d(obj);
        for (int i11 = 0; i11 < mo114053e; i11++) {
            mo113988k.mo114029i(getDescriptor(), i11, this.f127028a, mo137795d.next());
        }
        mo113988k.mo114026c(descriptor);
    }

    private AbstractC26812n(KSerializer kSerializer) {
        super(null);
        this.f127028a = kSerializer;
    }
}
