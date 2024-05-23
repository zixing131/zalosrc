package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pm0.C24848g0;

/* renamed from: tn0.a2 */
/* loaded from: classes7.dex */
public final class C26775a2 implements KSerializer {

    /* renamed from: b */
    public static final C26775a2 f126983b = new C26775a2();

    /* renamed from: a */
    private final /* synthetic */ C26840w0 f126984a = new C26840w0("kotlin.Unit", C24848g0.f119245a);

    private C26775a2() {
    }

    /* renamed from: a */
    public void m137801a(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        this.f126984a.deserialize(decoder);
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, C24848g0 c24848g0) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(c24848g0, "value");
        this.f126984a.serialize(encoder, c24848g0);
    }

    @Override // qn0.InterfaceC25386a
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        m137801a(decoder);
        return C24848g0.f119245a;
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f126984a.getDescriptor();
    }
}
