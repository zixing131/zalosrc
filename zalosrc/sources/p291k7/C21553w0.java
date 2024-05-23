package p291k7;

/* renamed from: k7.w0 */
/* loaded from: classes3.dex */
public final class C21553w0 implements InterfaceC21559z0, InterfaceC21550v0 {

    /* renamed from: c */
    private static final Object f104584c = new Object();

    /* renamed from: a */
    private volatile InterfaceC21559z0 f104585a;

    /* renamed from: b */
    private volatile Object f104586b = f104584c;

    private C21553w0(InterfaceC21559z0 interfaceC21559z0) {
        this.f104585a = interfaceC21559z0;
    }

    /* renamed from: a */
    public static InterfaceC21550v0 m111209a(InterfaceC21559z0 interfaceC21559z0) {
        if (interfaceC21559z0 instanceof InterfaceC21550v0) {
            return (InterfaceC21550v0) interfaceC21559z0;
        }
        return new C21553w0(interfaceC21559z0);
    }

    /* renamed from: b */
    public static InterfaceC21559z0 m111210b(InterfaceC21559z0 interfaceC21559z0) {
        interfaceC21559z0.getClass();
        if (interfaceC21559z0 instanceof C21553w0) {
            return interfaceC21559z0;
        }
        return new C21553w0(interfaceC21559z0);
    }

    @Override // p291k7.InterfaceC21559z0
    public final Object zza() {
        Object obj = this.f104586b;
        Object obj2 = f104584c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f104586b;
                    if (obj == obj2) {
                        obj = this.f104585a.zza();
                        Object obj3 = this.f104586b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f104586b = obj;
                        this.f104585a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
