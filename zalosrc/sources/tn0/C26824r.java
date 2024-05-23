package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pn0.C24873a;
import sn0.AbstractC26338e;

/* renamed from: tn0.r */
/* loaded from: classes7.dex */
public final class C26824r implements KSerializer {

    /* renamed from: a */
    public static final C26824r f127060a = new C26824r();

    /* renamed from: b */
    private static final SerialDescriptor f127061b = new C26793g1("kotlin.time.Duration", AbstractC26338e.i.f125045a);

    private C26824r() {
    }

    /* renamed from: a */
    public long m137948a(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return C24873a.f119357q.m129344c(decoder.mo113965A());
    }

    /* renamed from: b */
    public void m137949b(Encoder encoder, long j11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113982F(C24873a.m129318J(j11));
    }

    @Override // qn0.InterfaceC25386a
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return C24873a.m129326g(m137948a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127061b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137949b(encoder, ((C24873a) obj).m129340N());
    }
}
