package p048c4;

import om0.InterfaceC24312a;

/* renamed from: c4.a */
/* loaded from: classes.dex */
public final class C3268a implements InterfaceC24312a {

    /* renamed from: c */
    private static final Object f14027c = new Object();

    /* renamed from: a */
    private volatile InterfaceC24312a f14028a;

    /* renamed from: b */
    private volatile Object f14029b = f14027c;

    private C3268a(InterfaceC24312a interfaceC24312a) {
        this.f14028a = interfaceC24312a;
    }

    /* renamed from: a */
    public static InterfaceC24312a m16646a(InterfaceC24312a interfaceC24312a) {
        AbstractC3271d.m16650b(interfaceC24312a);
        if (interfaceC24312a instanceof C3268a) {
            return interfaceC24312a;
        }
        return new C3268a(interfaceC24312a);
    }

    /* renamed from: b */
    public static Object m16647b(Object obj, Object obj2) {
        if (obj != f14027c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // om0.InterfaceC24312a
    public Object get() {
        Object obj = this.f14029b;
        Object obj2 = f14027c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f14029b;
                    if (obj == obj2) {
                        obj = this.f14028a.get();
                        this.f14029b = m16647b(this.f14029b, obj);
                        this.f14028a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
