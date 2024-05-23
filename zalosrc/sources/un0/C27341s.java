package un0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import sn0.AbstractC26340g;
import sn0.AbstractC26341h;

/* renamed from: un0.s */
/* loaded from: classes7.dex */
public final class C27341s implements KSerializer {

    /* renamed from: a */
    public static final C27341s f128623a = new C27341s();

    /* renamed from: b */
    private static final SerialDescriptor f128624b = AbstractC26340g.m135543e("kotlinx.serialization.json.JsonNull", AbstractC26341h.b.f125055a, new SerialDescriptor[0], null, 8, null);

    private C27341s() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        AbstractC27333k.m139935g(decoder);
        if (!decoder.mo113966E()) {
            decoder.mo113971j();
            return JsonNull.INSTANCE;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonNull jsonNull) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(jsonNull, "value");
        AbstractC27333k.m139936h(encoder);
        encoder.mo113992p();
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f128624b;
    }
}
