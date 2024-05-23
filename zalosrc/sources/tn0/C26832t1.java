package tn0;

import fn0.AbstractC19074t;
import fn0.C19048e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pm0.C24867x;
import rn0.AbstractC25935a;

/* renamed from: tn0.t1 */
/* loaded from: classes7.dex */
public final class C26832t1 implements KSerializer {

    /* renamed from: a */
    public static final C26832t1 f127081a = new C26832t1();

    /* renamed from: b */
    private static final SerialDescriptor f127082b = AbstractC26777b0.m137805a("kotlin.UByte", AbstractC25935a.m133632w(C19048e.f94918a));

    private C26832t1() {
    }

    /* renamed from: a */
    public byte m137965a(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return C24867x.m129237c(decoder.mo113974r(getDescriptor()).mo113967H());
    }

    /* renamed from: b */
    public void m137966b(Encoder encoder, byte b11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113990m(getDescriptor()).mo113986g(b11);
    }

    @Override // qn0.InterfaceC25386a
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C24867x.m129236b(m137965a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127082b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137966b(encoder, ((C24867x) obj).m129241h());
    }
}
