package nm0;

import om0.InterfaceC24312a;

/* renamed from: nm0.a */
/* loaded from: classes7.dex */
public final class C23884a implements InterfaceC24312a {

    /* renamed from: c */
    private static final Object f115461c = new Object();

    /* renamed from: a */
    private volatile InterfaceC24312a f115462a;

    /* renamed from: b */
    private volatile Object f115463b = f115461c;

    private C23884a(InterfaceC24312a interfaceC24312a) {
        this.f115462a = interfaceC24312a;
    }

    /* renamed from: a */
    public static InterfaceC24312a m124954a(InterfaceC24312a interfaceC24312a) {
        AbstractC23885b.m124957b(interfaceC24312a);
        if (interfaceC24312a instanceof C23884a) {
            return interfaceC24312a;
        }
        return new C23884a(interfaceC24312a);
    }

    /* renamed from: b */
    public static Object m124955b(Object obj, Object obj2) {
        if (obj != f115461c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // om0.InterfaceC24312a
    public Object get() {
        Object obj = this.f115463b;
        Object obj2 = f115461c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f115463b;
                    if (obj == obj2) {
                        obj = this.f115462a.get();
                        this.f115463b = m124955b(this.f115463b, obj);
                        this.f115462a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
