package un0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import on0.AbstractC24322d0;
import pm0.C24838b0;
import rn0.AbstractC25935a;
import sn0.AbstractC26338e;
import sn0.AbstractC26340g;
import vn0.AbstractC28309b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: un0.p */
/* loaded from: classes7.dex */
public final class C27338p implements KSerializer {

    /* renamed from: a */
    public static final C27338p f128621a = new C27338p();

    /* renamed from: b */
    private static final SerialDescriptor f128622b = AbstractC26340g.m135539a("kotlinx.serialization.json.JsonLiteral", AbstractC26338e.i.f125045a);

    private C27338p() {
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C27337o deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        JsonElement mo139898g = AbstractC27333k.m139932d(decoder).mo139898g();
        if (mo139898g instanceof C27337o) {
            return (C27337o) mo139898g;
        }
        throw AbstractC28309b0.m142641f(-1, "Unexpected JSON element, expected JsonLiteral, had " + AbstractC19061k0.m100169b(mo139898g.getClass()), mo139898g.toString());
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, C27337o c27337o) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(c27337o, "value");
        AbstractC27333k.m139936h(encoder);
        if (c27337o.m139943g()) {
            encoder.mo113982F(c27337o.mo114124d());
            return;
        }
        if (c27337o.m139942e() != null) {
            encoder.mo113990m(c27337o.m139942e()).mo113982F(c27337o.mo114124d());
            return;
        }
        Long m139920q = AbstractC27331i.m139920q(c27337o);
        if (m139920q != null) {
            encoder.mo113991n(m139920q.longValue());
            return;
        }
        C24838b0 m126990i = AbstractC24322d0.m126990i(c27337o.mo114124d());
        if (m126990i != null) {
            encoder.mo113990m(AbstractC25935a.m133606G(C24838b0.f119230q).getDescriptor()).mo113991n(m126990i.m129154h());
            return;
        }
        Double m139912i = AbstractC27331i.m139912i(c27337o);
        if (m139912i != null) {
            encoder.mo113985f(m139912i.doubleValue());
            return;
        }
        Boolean m139909f = AbstractC27331i.m139909f(c27337o);
        if (m139909f != null) {
            encoder.mo113994s(m139909f.booleanValue());
        } else {
            encoder.mo113982F(c27337o.mo114124d());
        }
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return f128622b;
    }
}
