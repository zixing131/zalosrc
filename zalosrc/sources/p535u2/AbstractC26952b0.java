package p535u2;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.Set;

/* renamed from: u2.b0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC26952b0 {
    /* renamed from: a */
    public static void m138909a(InterfaceC26954c0 interfaceC26954c0, String str, Set set) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            interfaceC26954c0.mo138914b(new C26950a0((String) it.next(), str));
        }
    }
}
