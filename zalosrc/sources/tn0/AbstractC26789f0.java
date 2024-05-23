package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;

/* renamed from: tn0.f0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26789f0 implements KSerializer {

    /* renamed from: a */
    private final KSerializer f126993a;

    /* renamed from: b */
    private final KSerializer f126994b;

    public /* synthetic */ AbstractC26789f0(KSerializer kSerializer, KSerializer kSerializer2, AbstractC19060k abstractC19060k) {
        this(kSerializer, kSerializer2);
    }

    /* renamed from: a */
    protected abstract Object mo137825a(Object obj);

    /* renamed from: b */
    protected final KSerializer m137826b() {
        return this.f126993a;
    }

    /* renamed from: c */
    protected abstract Object mo137827c(Object obj);

    /* renamed from: d */
    protected final KSerializer m137828d() {
        return this.f126994b;
    }

    @Override // qn0.InterfaceC25386a
    public Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object mo137829e;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
        if (!mo113968b.mo114015q()) {
            obj = AbstractC26826r1.f127062a;
            obj2 = AbstractC26826r1.f127062a;
            Object obj5 = obj;
            Object obj6 = obj2;
            while (true) {
                int mo114037p = mo113968b.mo114037p(getDescriptor());
                if (mo114037p == -1) {
                    obj3 = AbstractC26826r1.f127062a;
                    if (obj5 != obj3) {
                        obj4 = AbstractC26826r1.f127062a;
                        if (obj6 != obj4) {
                            mo137829e = mo137829e(obj5, obj6);
                        } else {
                            throw new SerializationException("Element 'value' is missing");
                        }
                    } else {
                        throw new SerializationException("Element 'key' is missing");
                    }
                } else if (mo114037p != 0) {
                    if (mo114037p == 1) {
                        obj6 = InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 1, m137828d(), null, 8, null);
                    } else {
                        throw new SerializationException("Invalid index: " + mo114037p);
                    }
                } else {
                    obj5 = InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 0, m137826b(), null, 8, null);
                }
            }
        } else {
            mo137829e = mo137829e(InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 0, m137826b(), null, 8, null), InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 1, m137828d(), null, 8, null));
        }
        mo113968b.mo114009c(descriptor);
        return mo137829e;
    }

    /* renamed from: e */
    protected abstract Object mo137829e(Object obj, Object obj2);

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        InterfaceC21886d mo113984b = encoder.mo113984b(getDescriptor());
        mo113984b.mo114029i(getDescriptor(), 0, this.f126993a, mo137825a(obj));
        mo113984b.mo114029i(getDescriptor(), 1, this.f126994b, mo137827c(obj));
        mo113984b.mo114026c(getDescriptor());
    }

    private AbstractC26789f0(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f126993a = kSerializer;
        this.f126994b = kSerializer2;
    }
}
