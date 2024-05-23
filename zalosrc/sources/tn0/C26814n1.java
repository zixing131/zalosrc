package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.n1 */
/* loaded from: classes7.dex */
public final class C26814n1 implements KSerializer {

    /* renamed from: a */
    public static final C26814n1 f127034a = new C26814n1();

    /* renamed from: b */
    private static final SerialDescriptor f127035b = new C26793g1("kotlin.String", AbstractC26338e.i.f125045a);

    private C26814n1() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a */
    public String deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return decoder.mo113965A();
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b */
    public void serialize(Encoder encoder, String str) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(str, "value");
        encoder.mo113982F(str);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127035b;
    }
}
