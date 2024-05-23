package p187gk;

import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import on0.AbstractC24342w;

/* renamed from: gk.b */
/* loaded from: classes3.dex */
public final class C19465b {

    /* renamed from: a */
    public static final C19465b f96610a = new C19465b();

    private C19465b() {
    }

    /* renamed from: a */
    public static final InterfaceC19466c m101791a(String str, String str2) {
        List m127132B0;
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "value");
        HashMap hashMap = new HashMap();
        m127132B0 = AbstractC24342w.m127132B0(str2, new String[]{";"}, false, 0, 6, null);
        Iterator it = m127132B0.iterator();
        while (it.hasNext()) {
            hashMap.put((String) it.next(), Boolean.TRUE);
        }
        return f96610a.m101793b(str, hashMap);
    }

    /* renamed from: c */
    public static final InterfaceC19466c m101792c(int i11, String str, String str2) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "value");
        if (i11 == 6) {
            return m101791a(str, str2);
        }
        return new C19471h(str, str2);
    }

    /* renamed from: b */
    public final InterfaceC19466c m101793b(String str, HashMap hashMap) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(hashMap, "value");
        return new C19470g(str, hashMap);
    }
}
