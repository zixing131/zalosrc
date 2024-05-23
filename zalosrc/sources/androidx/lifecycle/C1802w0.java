package androidx.lifecycle;

import android.app.Application;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.reflect.InvocationTargetException;
import p534u1.AbstractC26941a;
import p534u1.C26944d;

/* renamed from: androidx.lifecycle.w0 */
/* loaded from: classes.dex */
public class C1802w0 {

    /* renamed from: a */
    private final C1808z0 f7409a;

    /* renamed from: b */
    private final b f7410b;

    /* renamed from: c */
    private final AbstractC26941a f7411c;

    /* renamed from: androidx.lifecycle.w0$a */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: e */
        private static a f7413e;

        /* renamed from: c */
        private final Application f7415c;

        /* renamed from: d */
        public static final C32635a f7412d = new C32635a(null);

        /* renamed from: f */
        public static final AbstractC26941a.b f7414f = C32635a.C32636a.f7416a;

        /* renamed from: androidx.lifecycle.w0$a$a */
        /* loaded from: classes.dex */
        public static final class C32635a {

            /* renamed from: androidx.lifecycle.w0$a$a$a */
            /* loaded from: classes.dex */
            private static final class C32636a implements AbstractC26941a.b {

                /* renamed from: a */
                public static final C32636a f7416a = new C32636a();

                private C32636a() {
                }
            }

            private C32635a() {
            }

            public /* synthetic */ C32635a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m9383a(InterfaceC1756a1 interfaceC1756a1) {
                AbstractC19074t.m100208f(interfaceC1756a1, "owner");
                if (interfaceC1756a1 instanceof InterfaceC1783n) {
                    return ((InterfaceC1783n) interfaceC1756a1).mo4646Xs();
                }
                return c.Companion.m9387a();
            }

            /* renamed from: b */
            public final a m9384b(Application application) {
                AbstractC19074t.m100208f(application, "application");
                if (a.f7413e == null) {
                    a.f7413e = new a(application);
                }
                a aVar = a.f7413e;
                AbstractC19074t.m100205c(aVar);
                return aVar;
            }
        }

        private a(Application application, int i11) {
            this.f7415c = application;
        }

        /* renamed from: g */
        private final AbstractC1796t0 m9382g(Class cls, Application application) {
            if (AbstractC1757b.class.isAssignableFrom(cls)) {
                try {
                    AbstractC1796t0 abstractC1796t0 = (AbstractC1796t0) cls.getConstructor(Application.class).newInstance(application);
                    AbstractC19074t.m100207e(abstractC1796t0, "{\n                try {\n…          }\n            }");
                    return abstractC1796t0;
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (NoSuchMethodException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                } catch (InvocationTargetException e14) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e14);
                }
            }
            return super.mo1196b(cls);
        }

        @Override // androidx.lifecycle.C1802w0.c, androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(abstractC26941a, "extras");
            if (this.f7415c != null) {
                return mo1196b(cls);
            }
            Application application = (Application) abstractC26941a.mo138786a(f7414f);
            if (application != null) {
                return m9382g(cls, application);
            }
            if (!AbstractC1757b.class.isAssignableFrom(cls)) {
                return super.mo1196b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @Override // androidx.lifecycle.C1802w0.c, androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            Application application = this.f7415c;
            if (application != null) {
                return m9382g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC19074t.m100208f(application, "application");
        }
    }

    /* renamed from: androidx.lifecycle.w0$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a);

        /* renamed from: b */
        AbstractC1796t0 mo1196b(Class cls);
    }

    /* renamed from: androidx.lifecycle.w0$c */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a */
        private static c f7417a;
        public static final a Companion = new a(null);

        /* renamed from: b */
        public static final AbstractC26941a.b f7418b = a.C32637a.f7419a;

        /* renamed from: androidx.lifecycle.w0$c$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.w0$c$a$a */
            /* loaded from: classes.dex */
            private static final class C32637a implements AbstractC26941a.b {

                /* renamed from: a */
                public static final C32637a f7419a = new C32637a();

                private C32637a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final c m9387a() {
                if (c.f7417a == null) {
                    c.f7417a = new c();
                }
                c cVar = c.f7417a;
                AbstractC19074t.m100205c(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                AbstractC19074t.m100207e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (AbstractC1796t0) newInstance;
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (NoSuchMethodException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    /* renamed from: androidx.lifecycle.w0$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: c */
        public abstract void mo9254c(AbstractC1796t0 abstractC1796t0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1802w0(C1808z0 c1808z0, b bVar) {
        this(c1808z0, bVar, null, 4, null);
        AbstractC19074t.m100208f(c1808z0, "store");
        AbstractC19074t.m100208f(bVar, "factory");
    }

    /* renamed from: a */
    public AbstractC1796t0 m9378a(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m9379b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public AbstractC1796t0 m9379b(String str, Class cls) {
        AbstractC1796t0 mo1196b;
        d dVar;
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC1796t0 m9415b = this.f7409a.m9415b(str);
        if (cls.isInstance(m9415b)) {
            Object obj = this.f7410b;
            if (obj instanceof d) {
                dVar = (d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                AbstractC19074t.m100205c(m9415b);
                dVar.mo9254c(m9415b);
            }
            AbstractC19074t.m100206d(m9415b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return m9415b;
        }
        C26944d c26944d = new C26944d(this.f7411c);
        c26944d.m138790c(c.f7418b, str);
        try {
            mo1196b = this.f7410b.mo1195a(cls, c26944d);
        } catch (AbstractMethodError unused) {
            mo1196b = this.f7410b.mo1196b(cls);
        }
        this.f7409a.m9417d(str, mo1196b);
        return mo1196b;
    }

    public C1802w0(C1808z0 c1808z0, b bVar, AbstractC26941a abstractC26941a) {
        AbstractC19074t.m100208f(c1808z0, "store");
        AbstractC19074t.m100208f(bVar, "factory");
        AbstractC19074t.m100208f(abstractC26941a, "defaultCreationExtras");
        this.f7409a = c1808z0;
        this.f7410b = bVar;
        this.f7411c = abstractC26941a;
    }

    public /* synthetic */ C1802w0(C1808z0 c1808z0, b bVar, AbstractC26941a abstractC26941a, int i11, AbstractC19060k abstractC19060k) {
        this(c1808z0, bVar, (i11 & 4) != 0 ? AbstractC26941a.a.f127383b : abstractC26941a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1802w0(InterfaceC1756a1 interfaceC1756a1) {
        this(interfaceC1756a1.mo4644Oc(), a.f7412d.m9383a(interfaceC1756a1), AbstractC1806y0.m9406a(interfaceC1756a1));
        AbstractC19074t.m100208f(interfaceC1756a1, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1802w0(InterfaceC1756a1 interfaceC1756a1, b bVar) {
        this(interfaceC1756a1.mo4644Oc(), bVar, AbstractC1806y0.m9406a(interfaceC1756a1));
        AbstractC19074t.m100208f(interfaceC1756a1, "owner");
        AbstractC19074t.m100208f(bVar, "factory");
    }
}
