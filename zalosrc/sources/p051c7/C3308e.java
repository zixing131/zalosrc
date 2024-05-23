package p051c7;

/* renamed from: c7.e */
/* loaded from: classes.dex */
public final class C3308e implements InterfaceC3312g {

    /* renamed from: c */
    private static final Object f14112c = new Object();

    /* renamed from: a */
    private volatile InterfaceC3312g f14113a;

    /* renamed from: b */
    private volatile Object f14114b = f14112c;

    private C3308e(InterfaceC3312g interfaceC3312g) {
        this.f14113a = interfaceC3312g;
    }

    /* renamed from: a */
    public static InterfaceC3312g m16754a(InterfaceC3312g interfaceC3312g) {
        interfaceC3312g.getClass();
        if (interfaceC3312g instanceof C3308e) {
            return interfaceC3312g;
        }
        return new C3308e(interfaceC3312g);
    }

    @Override // p051c7.InterfaceC3312g
    public final Object zza() {
        Object obj = this.f14114b;
        Object obj2 = f14112c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f14114b;
                    if (obj == obj2) {
                        obj = this.f14113a.zza();
                        Object obj3 = this.f14114b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f14114b = obj;
                        this.f14113a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
