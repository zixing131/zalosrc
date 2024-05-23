package tn0;

import fn0.AbstractC19074t;
import fn0.C19065m0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pm0.C24844e0;
import rn0.AbstractC25935a;

/* renamed from: tn0.z1 */
/* loaded from: classes7.dex */
public final class C26850z1 implements KSerializer {

    /* renamed from: a */
    public static final C26850z1 f127117a = new C26850z1();

    /* renamed from: b */
    private static final SerialDescriptor f127118b = AbstractC26777b0.m137805a("kotlin.UShort", AbstractC25935a.m133602C(C19065m0.f94946a));

    private C26850z1() {
    }

    /* renamed from: a */
    public short m138018a(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return C24844e0.m129177c(decoder.mo113974r(getDescriptor()).mo113975t());
    }

    /* renamed from: b */
    public void m138019b(Encoder encoder, short s7) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113990m(getDescriptor()).mo113993r(s7);
    }

    @Override // qn0.InterfaceC25386a
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C24844e0.m129176b(m138018a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127118b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m138019b(encoder, ((C24844e0) obj).m129181h());
    }
}
