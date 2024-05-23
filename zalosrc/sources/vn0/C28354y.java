package vn0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: vn0.y */
/* loaded from: classes7.dex */
public final class C28354y {

    /* renamed from: a */
    private final Map f132115a = AbstractC28352x.m142795a(16);

    /* renamed from: vn0.y$a */
    /* loaded from: classes7.dex */
    public static final class a {
    }

    /* renamed from: a */
    public final Object m142798a(SerialDescriptor serialDescriptor, a aVar) {
        Object obj;
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(aVar, "key");
        Map map = (Map) this.f132115a.get(serialDescriptor);
        if (map != null) {
            obj = map.get(aVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* renamed from: b */
    public final Object m142799b(SerialDescriptor serialDescriptor, a aVar, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(aVar, "key");
        AbstractC19074t.m100208f(interfaceC18494a, "defaultValue");
        Object m142798a = m142798a(serialDescriptor, aVar);
        if (m142798a != null) {
            return m142798a;
        }
        Object mo12V4 = interfaceC18494a.mo12V4();
        m142800c(serialDescriptor, aVar, mo12V4);
        return mo12V4;
    }

    /* renamed from: c */
    public final void m142800c(SerialDescriptor serialDescriptor, a aVar, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(aVar, "key");
        AbstractC19074t.m100208f(obj, "value");
        Map map = this.f132115a;
        Object obj2 = map.get(serialDescriptor);
        if (obj2 == null) {
            obj2 = AbstractC28352x.m142795a(2);
            map.put(serialDescriptor, obj2);
        }
        ((Map) obj2).put(aVar, obj);
    }
}
