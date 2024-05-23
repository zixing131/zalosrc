package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.m1 */
/* loaded from: classes7.dex */
public final class C26811m1 implements KSerializer {

    /* renamed from: a */
    public static final C26811m1 f127026a = new C26811m1();

    /* renamed from: b */
    private static final SerialDescriptor f127027b = new C26793g1("kotlin.Short", AbstractC26338e.h.f125044a);

    private C26811m1() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Short.valueOf(decoder.mo113975t());
    }

    /* renamed from: b */
    public void m137882b(Encoder encoder, short s7) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113993r(s7);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127027b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137882b(encoder, ((Number) obj).shortValue());
    }
}
