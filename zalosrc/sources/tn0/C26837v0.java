package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: tn0.v0 */
/* loaded from: classes7.dex */
public final class C26837v0 implements KSerializer {

    /* renamed from: a */
    private final KSerializer f127094a;

    /* renamed from: b */
    private final SerialDescriptor f127095b;

    public C26837v0(KSerializer kSerializer) {
        AbstractC19074t.m100208f(kSerializer, "serializer");
        this.f127094a = kSerializer;
        this.f127095b = new C26802j1(kSerializer.getDescriptor());
    }

    @Override // qn0.InterfaceC25386a
    public Object deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        if (decoder.mo113966E()) {
            return decoder.mo113972k(this.f127094a);
        }
        return decoder.mo113971j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26837v0.class == obj.getClass() && AbstractC19074t.m100204b(this.f127094a, ((C26837v0) obj).f127094a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127095b;
    }

    public int hashCode() {
        return this.f127094a.hashCode();
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        if (obj != null) {
            encoder.mo113997w();
            encoder.mo113987j(this.f127094a, obj);
        } else {
            encoder.mo113992p();
        }
    }
}
