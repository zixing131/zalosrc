package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.w */
/* loaded from: classes7.dex */
public final class C26839w implements KSerializer {

    /* renamed from: a */
    public static final C26839w f127098a = new C26839w();

    /* renamed from: b */
    private static final SerialDescriptor f127099b = new C26793g1("kotlin.Float", AbstractC26338e.e.f125041a);

    private C26839w() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Float.valueOf(decoder.mo113976u());
    }

    /* renamed from: b */
    public void m137982b(Encoder encoder, float f11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113995u(f11);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127099b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137982b(encoder, ((Number) obj).floatValue());
    }
}
