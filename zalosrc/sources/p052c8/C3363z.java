package p052c8;

import p015a9.InterfaceC0661a;
import p015a9.InterfaceC0662b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c8.z */
/* loaded from: classes.dex */
public class C3363z implements InterfaceC0662b, InterfaceC0661a {

    /* renamed from: c */
    private static final InterfaceC0661a.a f14227c = new InterfaceC0661a.a() { // from class: c8.w
        @Override // p015a9.InterfaceC0661a.a
        /* renamed from: a */
        public final void mo944a(InterfaceC0662b interfaceC0662b) {
            C3363z.m16932f(interfaceC0662b);
        }
    };

    /* renamed from: d */
    private static final InterfaceC0662b f14228d = new InterfaceC0662b() { // from class: c8.x
        @Override // p015a9.InterfaceC0662b
        public final Object get() {
            Object m16933g;
            m16933g = C3363z.m16933g();
            return m16933g;
        }
    };

    /* renamed from: a */
    private InterfaceC0661a.a f14229a;

    /* renamed from: b */
    private volatile InterfaceC0662b f14230b;

    private C3363z(InterfaceC0661a.a aVar, InterfaceC0662b interfaceC0662b) {
        this.f14229a = aVar;
        this.f14230b = interfaceC0662b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C3363z m16931e() {
        return new C3363z(f14227c, f14228d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m16932f(InterfaceC0662b interfaceC0662b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m16933g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m16934h(InterfaceC0661a.a aVar, InterfaceC0661a.a aVar2, InterfaceC0662b interfaceC0662b) {
        aVar.mo944a(interfaceC0662b);
        aVar2.mo944a(interfaceC0662b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C3363z m16935i(InterfaceC0662b interfaceC0662b) {
        return new C3363z(null, interfaceC0662b);
    }

    @Override // p015a9.InterfaceC0661a
    /* renamed from: a */
    public void mo943a(final InterfaceC0661a.a aVar) {
        InterfaceC0662b interfaceC0662b;
        InterfaceC0662b interfaceC0662b2;
        InterfaceC0662b interfaceC0662b3 = this.f14230b;
        InterfaceC0662b interfaceC0662b4 = f14228d;
        if (interfaceC0662b3 != interfaceC0662b4) {
            aVar.mo944a(interfaceC0662b3);
            return;
        }
        synchronized (this) {
            interfaceC0662b = this.f14230b;
            if (interfaceC0662b != interfaceC0662b4) {
                interfaceC0662b2 = interfaceC0662b;
            } else {
                final InterfaceC0661a.a aVar2 = this.f14229a;
                this.f14229a = new InterfaceC0661a.a() { // from class: c8.y
                    @Override // p015a9.InterfaceC0661a.a
                    /* renamed from: a */
                    public final void mo944a(InterfaceC0662b interfaceC0662b5) {
                        C3363z.m16934h(InterfaceC0661a.a.this, aVar, interfaceC0662b5);
                    }
                };
                interfaceC0662b2 = null;
            }
        }
        if (interfaceC0662b2 != null) {
            aVar.mo944a(interfaceC0662b);
        }
    }

    @Override // p015a9.InterfaceC0662b
    public Object get() {
        return this.f14230b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m16936j(InterfaceC0662b interfaceC0662b) {
        InterfaceC0661a.a aVar;
        if (this.f14230b == f14228d) {
            synchronized (this) {
                aVar = this.f14229a;
                this.f14229a = null;
                this.f14230b = interfaceC0662b;
            }
            aVar.mo944a(interfaceC0662b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
