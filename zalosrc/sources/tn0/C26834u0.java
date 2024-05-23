package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: tn0.u0 */
/* loaded from: classes7.dex */
public final class C26834u0 implements KSerializer {

    /* renamed from: a */
    public static final C26834u0 f127088a = new C26834u0();

    /* renamed from: b */
    private static final SerialDescriptor f127089b = C26831t0.f127078a;

    private C26834u0() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Void r32) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(r32, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127089b;
    }
}
