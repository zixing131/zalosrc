package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.q */
/* loaded from: classes7.dex */
public final class C26821q implements KSerializer {

    /* renamed from: a */
    public static final C26821q f127053a = new C26821q();

    /* renamed from: b */
    private static final SerialDescriptor f127054b = new C26793g1("kotlin.Double", AbstractC26338e.d.f125040a);

    private C26821q() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Double.valueOf(decoder.mo113977w());
    }

    /* renamed from: b */
    public void m137935b(Encoder encoder, double d11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113985f(d11);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127054b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137935b(encoder, ((Number) obj).doubleValue());
    }
}
