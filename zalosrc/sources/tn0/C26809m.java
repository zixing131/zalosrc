package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import sn0.AbstractC26338e;

/* renamed from: tn0.m */
/* loaded from: classes7.dex */
public final class C26809m implements KSerializer {

    /* renamed from: a */
    public static final C26809m f127022a = new C26809m();

    /* renamed from: b */
    private static final SerialDescriptor f127023b = new C26793g1("kotlin.Char", AbstractC26338e.c.f125039a);

    private C26809m() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return Character.valueOf(decoder.mo113979z());
    }

    /* renamed from: b */
    public void m137878b(Encoder encoder, char c11) {
        AbstractC19074t.m100208f(encoder, "encoder");
        encoder.mo113996v(c11);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f127023b;
    }

    @Override // qn0.InterfaceC25393h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m137878b(encoder, ((Character) obj).charValue());
    }
}
