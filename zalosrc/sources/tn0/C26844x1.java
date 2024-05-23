package tn0;

import fn0.AbstractC19074t;
import fn0.C19076v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pm0.C24838b0;
import rn0.AbstractC25935a;

/* renamed from: tn0.x1 */
/* loaded from: classes7.dex */
public final class C26844x1 implements KSerializer {

    /* renamed from: a */
    public static final C26844x1 f127111a = new C26844x1();

    /* renamed from: b */
    private static final SerialDescriptor f127112b = AbstractC26777b0.m137805a("kotlin.ULong", AbstractC25935a.m133601B(C19076v.f94952a));

    private C26844x1() {
    }

    /* renamed from: a */
    public long m137993a(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return C24838b0.m129150c(decoder.mo113974r(getDescriptor()).mo113973n());
    }

    /* renamed from: b */
    public void m137994b(Encoder encoder, long j11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113990m(getDescriptor()).mo113991n(j11);
    }

    @Override // qn0.InterfaceC25386a
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C24838b0.m129149b(m137993a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127112b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137994b(encoder, ((C24838b0) obj).m129154h());
    }
}
