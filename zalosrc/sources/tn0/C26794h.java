package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.h */
/* loaded from: classes7.dex */
public final class C26794h implements KSerializer {

    /* renamed from: a */
    public static final C26794h f127000a = new C26794h();

    /* renamed from: b */
    private static final SerialDescriptor f127001b = new C26793g1("kotlin.Boolean", AbstractC26338e.a.f125037a);

    private C26794h() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a */
    public Boolean deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Boolean.valueOf(decoder.mo113978y());
    }

    /* renamed from: b */
    public void m137840b(Encoder encoder, boolean z11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113994s(z11);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127001b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137840b(encoder, ((Boolean) obj).booleanValue());
    }
}
