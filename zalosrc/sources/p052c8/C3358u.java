package p052c8;

import p015a9.InterfaceC0662b;

/* renamed from: c8.u */
/* loaded from: classes.dex */
public class C3358u implements InterfaceC0662b {

    /* renamed from: c */
    private static final Object f14220c = new Object();

    /* renamed from: a */
    private volatile Object f14221a = f14220c;

    /* renamed from: b */
    private volatile InterfaceC0662b f14222b;

    public C3358u(InterfaceC0662b interfaceC0662b) {
        this.f14222b = interfaceC0662b;
    }

    @Override // p015a9.InterfaceC0662b
    public Object get() {
        Object obj = this.f14221a;
        Object obj2 = f14220c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f14221a;
                    if (obj == obj2) {
                        obj = this.f14222b.get();
                        this.f14221a = obj;
                        this.f14222b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
