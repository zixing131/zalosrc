package tn0;

import fn0.AbstractC19074t;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;

/* renamed from: tn0.f1 */
/* loaded from: classes7.dex */
public abstract class AbstractC26790f1 extends AbstractC26812n {

    /* renamed from: b */
    private final SerialDescriptor f126995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC26790f1(KSerializer kSerializer) {
        super(kSerializer, null);
        AbstractC19074t.m100208f(kSerializer, "primitiveSerializer");
        this.f126995b = new C26787e1(kSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: d */
    public final Iterator mo137795d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // tn0.AbstractC26772a, qn0.InterfaceC25386a
    public final Object deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return m137796f(decoder, null);
    }

    @Override // tn0.AbstractC26812n, kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public final SerialDescriptor getDescriptor() {
        return this.f126995b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final AbstractC26784d1 mo137792a() {
        return (AbstractC26784d1) mo114055k(mo114056r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int mo137793b(AbstractC26784d1 abstractC26784d1) {
        AbstractC19074t.m100208f(abstractC26784d1, "<this>");
        return abstractC26784d1.mo137811d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void mo137794c(AbstractC26784d1 abstractC26784d1, int i11) {
        AbstractC19074t.m100208f(abstractC26784d1, "<this>");
        abstractC26784d1.mo137810b(i11);
    }

    /* renamed from: r */
    protected abstract Object mo114056r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void mo137818n(AbstractC26784d1 abstractC26784d1, int i11, Object obj) {
        AbstractC19074t.m100208f(abstractC26784d1, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // tn0.AbstractC26812n, qn0.InterfaceC25393h
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        int mo114053e = mo114053e(obj);
        SerialDescriptor serialDescriptor = this.f126995b;
        InterfaceC21886d mo113988k = encoder.mo113988k(serialDescriptor, mo114053e);
        mo114057u(mo113988k, obj, mo114053e);
        mo113988k.mo114026c(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object mo137798l(AbstractC26784d1 abstractC26784d1) {
        AbstractC19074t.m100208f(abstractC26784d1, "<this>");
        return abstractC26784d1.mo137809a();
    }

    /* renamed from: u */
    protected abstract void mo114057u(InterfaceC21886d interfaceC21886d, Object obj, int i11);
}
