package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.d0 */
/* loaded from: classes7.dex */
public final class C26783d0 implements KSerializer {

    /* renamed from: a */
    public static final C26783d0 f126989a = new C26783d0();

    /* renamed from: b */
    private static final SerialDescriptor f126990b = new C26793g1("kotlin.Int", AbstractC26338e.f.f125042a);

    private C26783d0() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a */
    public Integer deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Integer.valueOf(decoder.mo113970h());
    }

    /* renamed from: b */
    public void m137815b(Encoder encoder, int i11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113981B(i11);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f126990b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137815b(encoder, ((Number) obj).intValue());
    }
}
