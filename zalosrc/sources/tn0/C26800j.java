package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.j */
/* loaded from: classes7.dex */
public final class C26800j implements KSerializer {

    /* renamed from: a */
    public static final C26800j f127008a = new C26800j();

    /* renamed from: b */
    private static final SerialDescriptor f127009b = new C26793g1("kotlin.Byte", AbstractC26338e.b.f125038a);

    private C26800j() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Byte.valueOf(decoder.mo113967H());
    }

    /* renamed from: b */
    public void m137863b(Encoder encoder, byte b11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113986g(b11);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127009b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137863b(encoder, ((Number) obj).byteValue());
    }
}
