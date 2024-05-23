package um0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.io.Serializable;
import um0.InterfaceC27315f;

/* renamed from: um0.g */
/* loaded from: classes.dex */
public final class C27316g implements InterfaceC27315f, Serializable {

    /* renamed from: p */
    public static final C27316g f128559p = new C27316g();
    private static final long serialVersionUID = 0;

    private C27316g() {
    }

    private final Object readResolve() {
        return f128559p;
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        AbstractC19074t.m100208f(cVar, "key");
        return null;
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d0 */
    public InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f) {
        AbstractC19074t.m100208f(interfaceC27315f, "context");
        return interfaceC27315f;
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: h */
    public Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "operation");
        return obj;
    }

    public int hashCode() {
        return 0;
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        AbstractC19074t.m100208f(cVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
