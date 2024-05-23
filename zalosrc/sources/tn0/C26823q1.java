package tn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24848g0;
import pm0.C24865v;
import sn0.AbstractC26340g;
import sn0.C26334a;

/* renamed from: tn0.q1 */
/* loaded from: classes7.dex */
public final class C26823q1 implements KSerializer {

    /* renamed from: a */
    private final KSerializer f127055a;

    /* renamed from: b */
    private final KSerializer f127056b;

    /* renamed from: c */
    private final KSerializer f127057c;

    /* renamed from: d */
    private final SerialDescriptor f127058d;

    /* renamed from: tn0.q1$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m137947a(C26334a c26334a) {
            AbstractC19074t.m100208f(c26334a, "$this$buildClassSerialDescriptor");
            C26334a.m135524b(c26334a, "first", C26823q1.this.f127055a.getDescriptor(), null, false, 12, null);
            C26334a.m135524b(c26334a, "second", C26823q1.this.f127056b.getDescriptor(), null, false, 12, null);
            C26334a.m135524b(c26334a, "third", C26823q1.this.f127057c.getDescriptor(), null, false, 12, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m137947a((C26334a) obj);
            return C24848g0.f119245a;
        }
    }

    public C26823q1(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        AbstractC19074t.m100208f(kSerializer, "aSerializer");
        AbstractC19074t.m100208f(kSerializer2, "bSerializer");
        AbstractC19074t.m100208f(kSerializer3, "cSerializer");
        this.f127055a = kSerializer;
        this.f127056b = kSerializer2;
        this.f127057c = kSerializer3;
        this.f127058d = AbstractC26340g.m135540b("kotlin.Triple", new SerialDescriptor[0], new a());
    }

    /* renamed from: d */
    private final C24865v m137943d(InterfaceC21885c interfaceC21885c) {
        Object m114040c = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), 0, this.f127055a, null, 8, null);
        Object m114040c2 = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), 1, this.f127056b, null, 8, null);
        Object m114040c3 = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), 2, this.f127057c, null, 8, null);
        interfaceC21885c.mo114009c(getDescriptor());
        return new C24865v(m114040c, m114040c2, m114040c3);
    }

    /* renamed from: e */
    private final C24865v m137944e(InterfaceC21885c interfaceC21885c) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = AbstractC26826r1.f127062a;
        obj2 = AbstractC26826r1.f127062a;
        obj3 = AbstractC26826r1.f127062a;
        while (true) {
            int mo114037p = interfaceC21885c.mo114037p(getDescriptor());
            if (mo114037p != -1) {
                if (mo114037p != 0) {
                    if (mo114037p != 1) {
                        if (mo114037p == 2) {
                            obj3 = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), 2, this.f127057c, null, 8, null);
                        } else {
                            throw new SerializationException("Unexpected index " + mo114037p);
                        }
                    } else {
                        obj2 = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), 1, this.f127056b, null, 8, null);
                    }
                } else {
                    obj = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), 0, this.f127055a, null, 8, null);
                }
            } else {
                interfaceC21885c.mo114009c(getDescriptor());
                obj4 = AbstractC26826r1.f127062a;
                if (obj != obj4) {
                    obj5 = AbstractC26826r1.f127062a;
                    if (obj2 != obj5) {
                        obj6 = AbstractC26826r1.f127062a;
                        if (obj3 != obj6) {
                            return new C24865v(obj, obj2, obj3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
        }
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C24865v deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        InterfaceC21885c mo113968b = decoder.mo113968b(getDescriptor());
        if (mo113968b.mo114015q()) {
            return m137943d(mo113968b);
        }
        return m137944e(mo113968b);
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, C24865v c24865v) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(c24865v, "value");
        InterfaceC21886d mo113984b = encoder.mo113984b(getDescriptor());
        mo113984b.mo114029i(getDescriptor(), 0, this.f127055a, c24865v.m129232d());
        mo113984b.mo114029i(getDescriptor(), 1, this.f127056b, c24865v.m129233e());
        mo113984b.mo114029i(getDescriptor(), 2, this.f127057c, c24865v.m129234f());
        mo113984b.mo114026c(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127058d;
    }
}
