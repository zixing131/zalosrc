package sn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mn0.InterfaceC23364b;
import tn0.C26802j1;
import wn0.AbstractC29112b;

/* renamed from: sn0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC26335b {
    /* renamed from: a */
    public static final InterfaceC23364b m135532a(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof C26336c) {
            return ((C26336c) serialDescriptor).f125033b;
        }
        if (serialDescriptor instanceof C26802j1) {
            return m135532a(((C26802j1) serialDescriptor).m137870m());
        }
        return null;
    }

    /* renamed from: b */
    public static final SerialDescriptor m135533b(AbstractC29112b abstractC29112b, SerialDescriptor serialDescriptor) {
        KSerializer m145364c;
        AbstractC19074t.m100208f(abstractC29112b, "<this>");
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        InterfaceC23364b m135532a = m135532a(serialDescriptor);
        if (m135532a == null || (m145364c = AbstractC29112b.m145364c(abstractC29112b, m135532a, null, 2, null)) == null) {
            return null;
        }
        return m145364c.getDescriptor();
    }

    /* renamed from: c */
    public static final SerialDescriptor m135534c(SerialDescriptor serialDescriptor, InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(interfaceC23364b, "context");
        return new C26336c(serialDescriptor, interfaceC23364b);
    }
}
