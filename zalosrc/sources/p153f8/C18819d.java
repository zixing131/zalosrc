package p153f8;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p015a9.InterfaceC0661a;
import p015a9.InterfaceC0662b;
import p292k8.AbstractC21569b0;
import p292k8.AbstractC21573d0;

/* renamed from: f8.d */
/* loaded from: classes.dex */
public final class C18819d implements InterfaceC18816a {

    /* renamed from: c */
    private static final InterfaceC18822g f94098c = new b();

    /* renamed from: a */
    private final InterfaceC0661a f94099a;

    /* renamed from: b */
    private final AtomicReference f94100b = new AtomicReference(null);

    /* renamed from: f8.d$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC18822g {
        private b() {
        }

        @Override // p153f8.InterfaceC18822g
        /* renamed from: a */
        public File mo33580a() {
            return null;
        }

        @Override // p153f8.InterfaceC18822g
        /* renamed from: b */
        public AbstractC21569b0.a mo33581b() {
            return null;
        }

        @Override // p153f8.InterfaceC18822g
        /* renamed from: c */
        public File mo33582c() {
            return null;
        }

        @Override // p153f8.InterfaceC18822g
        /* renamed from: d */
        public File mo33583d() {
            return null;
        }

        @Override // p153f8.InterfaceC18822g
        /* renamed from: e */
        public File mo33584e() {
            return null;
        }

        @Override // p153f8.InterfaceC18822g
        /* renamed from: f */
        public File mo33585f() {
            return null;
        }

        @Override // p153f8.InterfaceC18822g
        /* renamed from: g */
        public File mo33586g() {
            return null;
        }
    }

    public C18819d(InterfaceC0661a interfaceC0661a) {
        this.f94099a = interfaceC0661a;
        interfaceC0661a.mo943a(new InterfaceC0661a.a() { // from class: f8.b
            @Override // p015a9.InterfaceC0661a.a
            /* renamed from: a */
            public final void mo944a(InterfaceC0662b interfaceC0662b) {
                C18819d.this.m98783g(interfaceC0662b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m98783g(InterfaceC0662b interfaceC0662b) {
        C18821f.m98795f().m98796b("Crashlytics native component now available.");
        this.f94100b.set((InterfaceC18816a) interfaceC0662b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m98784h(String str, String str2, long j11, AbstractC21573d0 abstractC21573d0, InterfaceC0662b interfaceC0662b) {
        ((InterfaceC18816a) interfaceC0662b.get()).mo33563c(str, str2, j11, abstractC21573d0);
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: a */
    public InterfaceC18822g mo33561a(String str) {
        InterfaceC18816a interfaceC18816a = (InterfaceC18816a) this.f94100b.get();
        if (interfaceC18816a == null) {
            return f94098c;
        }
        return interfaceC18816a.mo33561a(str);
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: b */
    public boolean mo33562b() {
        InterfaceC18816a interfaceC18816a = (InterfaceC18816a) this.f94100b.get();
        if (interfaceC18816a != null && interfaceC18816a.mo33562b()) {
            return true;
        }
        return false;
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: c */
    public void mo33563c(final String str, final String str2, final long j11, final AbstractC21573d0 abstractC21573d0) {
        C18821f.m98795f().m98802i("Deferring native open session: " + str);
        this.f94099a.mo943a(new InterfaceC0661a.a() { // from class: f8.c
            @Override // p015a9.InterfaceC0661a.a
            /* renamed from: a */
            public final void mo944a(InterfaceC0662b interfaceC0662b) {
                C18819d.m98784h(str, str2, j11, abstractC21573d0, interfaceC0662b);
            }
        });
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: d */
    public boolean mo33564d(String str) {
        InterfaceC18816a interfaceC18816a = (InterfaceC18816a) this.f94100b.get();
        if (interfaceC18816a != null && interfaceC18816a.mo33564d(str)) {
            return true;
        }
        return false;
    }
}
