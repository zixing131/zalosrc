package dh0;

import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import mm0.AbstractC23350e;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;

/* renamed from: dh0.b */
/* loaded from: classes7.dex */
public final class C17933b {

    /* renamed from: a */
    public static final C17933b f90533a = new C17933b();

    /* renamed from: b */
    private static final C29234i f90534b;

    /* renamed from: c */
    private static final InterfaceC24854k f90535c;

    /* renamed from: d */
    private static final InterfaceC29232g f90536d;

    /* renamed from: e */
    private static final InterfaceC24854k f90537e;

    /* renamed from: dh0.b$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f90538q = new a();

        /* renamed from: dh0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32805a implements CoroutineScope {
            C32805a() {
            }

            @Override // kotlinx.coroutines.CoroutineScope
            /* renamed from: O */
            public InterfaceC27315f mo9207O() {
                return C17933b.f90533a.m94577f();
            }
        }

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C32805a mo12V4() {
            return new C32805a();
        }
    }

    /* renamed from: dh0.b$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f90539q = new b();

        /* renamed from: dh0.b$b$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC27310a implements CoroutineExceptionHandler {
            public a(CoroutineExceptionHandler.Key key) {
                super(key);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            /* renamed from: G */
            public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
                AbstractC23350e.m122776f("SMLZCloudWorker", th2);
            }
        }

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineExceptionHandler mo12V4() {
            return new a(CoroutineExceptionHandler.f105837l);
        }
    }

    /* renamed from: dh0.b$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f90540q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC27315f mo12V4() {
            return SupervisorKt.m112864b(null, 1, null).mo112823d0(C17932a.f90528a.m94573b()).mo112823d0(C17933b.f90533a.m94576e());
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        C29234i m145994a = AbstractC29235j.m145994a();
        f90534b = m145994a;
        m129210a = AbstractC24856m.m129210a(b.f90539q);
        f90535c = m129210a;
        f90536d = AbstractC29233h.m145991b(m145994a, c.f90540q);
        m129210a2 = AbstractC24856m.m129210a(a.f90538q);
        f90537e = m129210a2;
    }

    private C17933b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final CoroutineExceptionHandler m94576e() {
        return (CoroutineExceptionHandler) f90535c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final InterfaceC27315f m94577f() {
        return (InterfaceC27315f) f90536d.getValue();
    }

    /* renamed from: c */
    public final void m94578c() {
        C26676b.m136955e("SMLZCloudWorker", "cancelAll()", C26676b.b.f126331p);
        CoroutineScopeKt.m112639c(m94579d(), null, 1, null);
        f90534b.m145993b();
    }

    /* renamed from: d */
    public final CoroutineScope m94579d() {
        return (CoroutineScope) f90537e.getValue();
    }
}
