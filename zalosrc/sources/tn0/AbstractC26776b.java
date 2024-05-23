package tn0;

import fn0.AbstractC19074t;
import fn0.C19059j0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import mn0.InterfaceC23364b;
import qn0.AbstractC25389d;
import qn0.InterfaceC25386a;
import qn0.InterfaceC25393h;

/* renamed from: tn0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC26776b implements KSerializer {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final Object m137804b(InterfaceC21885c interfaceC21885c) {
        return InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), 1, AbstractC25389d.m131577a(this, interfaceC21885c, interfaceC21885c.mo114014o(getDescriptor(), 0)), null, 8, null);
    }

    /* renamed from: c */
    public InterfaceC25386a mo131581c(InterfaceC21885c interfaceC21885c, String str) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        return interfaceC21885c.mo114036a().mo145362d(mo131574e(), str);
    }

    /* renamed from: d */
    public InterfaceC25393h mo131582d(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(obj, "value");
        return encoder.mo113983a().mo145363e(mo131574e(), obj);
    }

    @Override // qn0.InterfaceC25386a
    public final Object deserialize(Decoder decoder) {
        Object obj;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
        C19059j0 c19059j0 = new C19059j0();
        if (mo113968b.mo114015q()) {
            obj = m137804b(mo113968b);
        } else {
            obj = null;
            while (true) {
                int mo114037p = mo113968b.mo114037p(getDescriptor());
                if (mo114037p != -1) {
                    if (mo114037p != 0) {
                        if (mo114037p != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) c19059j0.f94941p;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(mo114037p);
                            throw new SerializationException(sb2.toString());
                        }
                        Object obj2 = c19059j0.f94941p;
                        if (obj2 != null) {
                            c19059j0.f94941p = obj2;
                            obj = InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), mo114037p, AbstractC25389d.m131577a(this, mo113968b, (String) obj2), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    } else {
                        c19059j0.f94941p = mo113968b.mo114014o(getDescriptor(), mo114037p);
                    }
                } else if (obj != null) {
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) c19059j0.f94941p)).toString());
                }
            }
        }
        mo113968b.mo114009c(descriptor);
        return obj;
    }

    /* renamed from: e */
    public abstract InterfaceC23364b mo131574e();

    @Override // qn0.InterfaceC25393h
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(obj, "value");
        InterfaceC25393h m131578b = AbstractC25389d.m131578b(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor);
        mo113984b.mo114035z(getDescriptor(), 0, m131578b.getDescriptor().mo113953i());
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC19074t.m100206d(m131578b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        mo113984b.mo114029i(descriptor2, 1, m131578b, obj);
        mo113984b.mo114026c(descriptor);
    }
}
