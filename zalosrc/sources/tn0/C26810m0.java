package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.m0 */
/* loaded from: classes7.dex */
public final class C26810m0 implements KSerializer {

    /* renamed from: a */
    public static final C26810m0 f127024a = new C26810m0();

    /* renamed from: b */
    private static final SerialDescriptor f127025b = new C26793g1("kotlin.Long", AbstractC26338e.g.f125043a);

    private C26810m0() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a */
    public Long deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Long.valueOf(decoder.mo113973n());
    }

    /* renamed from: b */
    public void m137880b(Encoder encoder, long j11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113991n(j11);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127025b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137880b(encoder, ((Number) obj).longValue());
    }
}
