package vn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sn0.AbstractC26335b;
import sn0.AbstractC26337d;
import sn0.AbstractC26338e;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;
import un0.AbstractC27323a;
import wn0.AbstractC29112b;

/* renamed from: vn0.a1 */
/* loaded from: classes7.dex */
public abstract class AbstractC28307a1 {
    /* renamed from: a */
    public static final SerialDescriptor m142632a(SerialDescriptor serialDescriptor, AbstractC29112b abstractC29112b) {
        SerialDescriptor m142632a;
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(abstractC29112b, "module");
        if (AbstractC19074t.m100204b(serialDescriptor.mo113948d(), AbstractC26341h.a.f125054a)) {
            SerialDescriptor m135533b = AbstractC26335b.m135533b(abstractC29112b, serialDescriptor);
            if (m135533b != null && (m142632a = m142632a(m135533b, abstractC29112b)) != null) {
                return m142632a;
            }
            return serialDescriptor;
        }
        if (serialDescriptor.mo113955k()) {
            return m142632a(serialDescriptor.mo113952h(0), abstractC29112b);
        }
        return serialDescriptor;
    }

    /* renamed from: b */
    public static final EnumC28357z0 m142633b(AbstractC27323a abstractC27323a, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(abstractC27323a, "<this>");
        AbstractC19074t.m100208f(serialDescriptor, "desc");
        AbstractC26341h mo113948d = serialDescriptor.mo113948d();
        if (mo113948d instanceof AbstractC26337d) {
            return EnumC28357z0.POLY_OBJ;
        }
        if (AbstractC19074t.m100204b(mo113948d, AbstractC26342i.b.f125057a)) {
            return EnumC28357z0.LIST;
        }
        if (AbstractC19074t.m100204b(mo113948d, AbstractC26342i.c.f125058a)) {
            SerialDescriptor m142632a = m142632a(serialDescriptor.mo113952h(0), abstractC27323a.mo131586a());
            AbstractC26341h mo113948d2 = m142632a.mo113948d();
            if (!(mo113948d2 instanceof AbstractC26338e) && !AbstractC19074t.m100204b(mo113948d2, AbstractC26341h.b.f125055a)) {
                if (abstractC27323a.m139869f().m139885b()) {
                    return EnumC28357z0.LIST;
                }
                throw AbstractC28309b0.m142639d(m142632a);
            }
            return EnumC28357z0.MAP;
        }
        return EnumC28357z0.OBJ;
    }
}
