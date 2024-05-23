package un0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import sn0.AbstractC26338e;
import sn0.AbstractC26340g;
import vn0.AbstractC28309b0;

/* renamed from: un0.v */
/* loaded from: classes7.dex */
public final class C27344v implements KSerializer {

    /* renamed from: a */
    public static final C27344v f128631a = new C27344v();

    /* renamed from: b */
    private static final SerialDescriptor f128632b = AbstractC26340g.m135543e("kotlinx.serialization.json.JsonPrimitive", AbstractC26338e.i.f125045a, new SerialDescriptor[0], null, 8, null);

    private C27344v() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a */
    public JsonPrimitive deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        JsonElement mo139898g = AbstractC27333k.m139932d(decoder).mo139898g();
        if (mo139898g instanceof JsonPrimitive) {
            return (JsonPrimitive) mo139898g;
        }
        throw AbstractC28309b0.m142641f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC19061k0.m100169b(mo139898g.getClass()), mo139898g.toString());
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b */
    public void serialize(Encoder encoder, JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(jsonPrimitive, "value");
        AbstractC27333k.m139936h(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.mo113987j(C27341s.f128623a, JsonNull.INSTANCE);
        } else {
            encoder.mo113987j(C27338p.f128621a, (C27337o) jsonPrimitive);
        }
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f128632b;
    }
}
