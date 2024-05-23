package tn0;

import fn0.AbstractC19074t;
import fn0.C19073s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pm0.C24869z;
import rn0.AbstractC25935a;

/* renamed from: tn0.v1 */
/* loaded from: classes7.dex */
public final class C26838v1 implements KSerializer {

    /* renamed from: a */
    public static final C26838v1 f127096a = new C26838v1();

    /* renamed from: b */
    private static final SerialDescriptor f127097b = AbstractC26777b0.m137805a("kotlin.UInt", AbstractC25935a.m133600A(C19073s.f94950a));

    private C26838v1() {
    }

    /* renamed from: a */
    public int m137979a(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return C24869z.m129260c(decoder.mo113974r(getDescriptor()).mo113970h());
    }

    /* renamed from: b */
    public void m137980b(Encoder encoder, int i11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113990m(getDescriptor()).mo113981B(i11);
    }

    @Override // qn0.InterfaceC25386a
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C24869z.m129259b(m137979a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127097b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137980b(encoder, ((C24869z) obj).m129264h());
    }
}
