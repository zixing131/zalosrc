package fn0;

import mn0.InterfaceC23364b;
import mn0.InterfaceC23365c;
import mn0.InterfaceC23366d;
import mn0.InterfaceC23367e;
import mn0.InterfaceC23368f;
import mn0.InterfaceC23369g;

/* renamed from: fn0.l0 */
/* loaded from: classes.dex */
public class C19063l0 {
    /* renamed from: a */
    public InterfaceC23366d m100176a(AbstractC19070p abstractC19070p) {
        return abstractC19070p;
    }

    /* renamed from: b */
    public InterfaceC23364b m100177b(Class cls) {
        return new C19056i(cls);
    }

    /* renamed from: c */
    public InterfaceC23365c m100178c(Class cls, String str) {
        return new C19080z(cls, str);
    }

    /* renamed from: d */
    public InterfaceC23367e m100179d(AbstractC19077w abstractC19077w) {
        return abstractC19077w;
    }

    /* renamed from: e */
    public InterfaceC23368f m100180e(AbstractC19041a0 abstractC19041a0) {
        return abstractC19041a0;
    }

    /* renamed from: f */
    public InterfaceC23369g m100181f(AbstractC19045c0 abstractC19045c0) {
        return abstractC19045c0;
    }

    /* renamed from: g */
    public String m100182g(InterfaceC19068o interfaceC19068o) {
        String obj = interfaceC19068o.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: h */
    public String m100183h(AbstractC19075u abstractC19075u) {
        return m100182g(abstractC19075u);
    }
}
