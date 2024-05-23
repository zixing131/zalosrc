package p533u0;

import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p563v0.AbstractC27403j;
import p563v0.C27400g;
import p563v0.C27402i;
import p563v0.InterfaceC27395b;
import p563v0.InterfaceC27396c;
import p563v0.InterfaceC27398e;
import p563v0.InterfaceC27399f;
import p563v0.InterfaceC27405l;
import p593w0.InterfaceC28683a;

/* renamed from: u0.c */
/* loaded from: classes2.dex */
public final class C26917c implements InterfaceC28683a {

    /* renamed from: d */
    static final InterfaceC27398e.a f127358d = InterfaceC27398e.a.m140358a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC27396c.class);

    /* renamed from: e */
    static final InterfaceC27398e.a f127359e = InterfaceC27398e.a.m140358a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC27395b.class);

    /* renamed from: f */
    static final InterfaceC27398e.a f127360f = InterfaceC27398e.a.m140358a("camerax.core.appConfig.useCaseConfigFactoryProvider", InterfaceC27405l.class);

    /* renamed from: g */
    static final InterfaceC27398e.a f127361g = InterfaceC27398e.a.m140358a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: h */
    static final InterfaceC27398e.a f127362h = InterfaceC27398e.a.m140358a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: i */
    static final InterfaceC27398e.a f127363i = InterfaceC27398e.a.m140358a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: j */
    static final InterfaceC27398e.a f127364j = InterfaceC27398e.a.m140358a("camerax.core.appConfig.availableCamerasLimiter", AbstractC26915a.class);

    /* renamed from: c */
    private final C27402i f127365c;

    /* renamed from: u0.c$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final C27400g f127366a;

        public a() {
            this(C27400g.m140361k());
        }

        /* renamed from: b */
        private InterfaceC27399f m138729b() {
            return this.f127366a;
        }

        /* renamed from: a */
        public C26917c m138730a() {
            return new C26917c(C27402i.m140364h(this.f127366a));
        }

        /* renamed from: c */
        public a m138731c(InterfaceC27396c interfaceC27396c) {
            m138729b().mo140360c(C26917c.f127358d, interfaceC27396c);
            return this;
        }

        /* renamed from: d */
        public a m138732d(InterfaceC27395b interfaceC27395b) {
            m138729b().mo140360c(C26917c.f127359e, interfaceC27395b);
            return this;
        }

        /* renamed from: e */
        public a m138733e(Class cls) {
            m138729b().mo140360c(InterfaceC28683a.f133131b, cls);
            if (m138729b().mo140357f(InterfaceC28683a.f133130a, null) == null) {
                m138734f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public a m138734f(String str) {
            m138729b().mo140360c(InterfaceC28683a.f133130a, str);
            return this;
        }

        /* renamed from: g */
        public a m138735g(InterfaceC27405l interfaceC27405l) {
            m138729b().mo140360c(C26917c.f127360f, interfaceC27405l);
            return this;
        }

        private a(C27400g c27400g) {
            this.f127366a = c27400g;
            Class cls = (Class) c27400g.mo140357f(InterfaceC28683a.f133131b, null);
            if (cls != null && !cls.equals(AbstractC26916b.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m138733e(AbstractC26916b.class);
        }
    }

    C26917c(C27402i c27402i) {
        this.f127365c = c27402i;
    }

    @Override // p563v0.InterfaceC27404k
    /* renamed from: a */
    public InterfaceC27398e mo138725a() {
        return this.f127365c;
    }

    @Override // p563v0.InterfaceC27398e
    /* renamed from: b */
    public /* synthetic */ Set mo138726b() {
        return AbstractC27403j.m140368b(this);
    }

    @Override // p563v0.InterfaceC27398e
    /* renamed from: d */
    public /* synthetic */ Set mo138727d(InterfaceC27398e.a aVar) {
        return AbstractC27403j.m140367a(this, aVar);
    }

    @Override // p563v0.InterfaceC27398e
    /* renamed from: e */
    public /* synthetic */ Object mo138728e(InterfaceC27398e.a aVar, InterfaceC27398e.b bVar) {
        return AbstractC27403j.m140369c(this, aVar, bVar);
    }
}
