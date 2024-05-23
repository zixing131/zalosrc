package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import p034b8.InterfaceC2649a;
import p034b8.InterfaceC2650b;
import p034b8.InterfaceC2651c;
import p034b8.InterfaceC2652d;
import p052c8.C3338b0;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p521t9.AbstractC26607h;
import qm0.AbstractC25368s;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$a */
    /* loaded from: classes.dex */
    public static final class C6592a implements InterfaceC3345h {

        /* renamed from: a */
        public static final C6592a f36558a = new C6592a();

        @Override // p052c8.InterfaceC3345h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo13078a(InterfaceC3342e interfaceC3342e) {
            Object mo16853g = interfaceC3342e.mo16853g(C3338b0.m16815a(InterfaceC2649a.class, Executor.class));
            AbstractC19074t.m100207e(mo16853g, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.m112727a((Executor) mo16853g);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$b */
    /* loaded from: classes.dex */
    public static final class C6593b implements InterfaceC3345h {

        /* renamed from: a */
        public static final C6593b f36559a = new C6593b();

        @Override // p052c8.InterfaceC3345h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo13078a(InterfaceC3342e interfaceC3342e) {
            Object mo16853g = interfaceC3342e.mo16853g(C3338b0.m16815a(InterfaceC2651c.class, Executor.class));
            AbstractC19074t.m100207e(mo16853g, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.m112727a((Executor) mo16853g);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$c */
    /* loaded from: classes.dex */
    public static final class C6594c implements InterfaceC3345h {

        /* renamed from: a */
        public static final C6594c f36560a = new C6594c();

        @Override // p052c8.InterfaceC3345h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo13078a(InterfaceC3342e interfaceC3342e) {
            Object mo16853g = interfaceC3342e.mo16853g(C3338b0.m16815a(InterfaceC2650b.class, Executor.class));
            AbstractC19074t.m100207e(mo16853g, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.m112727a((Executor) mo16853g);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$d */
    /* loaded from: classes.dex */
    public static final class C6595d implements InterfaceC3345h {

        /* renamed from: a */
        public static final C6595d f36561a = new C6595d();

        @Override // p052c8.InterfaceC3345h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo13078a(InterfaceC3342e interfaceC3342e) {
            Object mo16853g = interfaceC3342e.mo16853g(C3338b0.m16815a(InterfaceC2652d.class, Executor.class));
            AbstractC19074t.m100207e(mo16853g, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.m112727a((Executor) mo16853g);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3339c> getComponents() {
        List<C3339c> m131505m;
        C3339c m16843d = C3339c.m16819c(C3338b0.m16815a(InterfaceC2649a.class, CoroutineDispatcher.class)).m16841b(C3355r.m16908j(C3338b0.m16815a(InterfaceC2649a.class, Executor.class))).m16845f(C6592a.f36558a).m16843d();
        AbstractC19074t.m100207e(m16843d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C3339c m16843d2 = C3339c.m16819c(C3338b0.m16815a(InterfaceC2651c.class, CoroutineDispatcher.class)).m16841b(C3355r.m16908j(C3338b0.m16815a(InterfaceC2651c.class, Executor.class))).m16845f(C6593b.f36559a).m16843d();
        AbstractC19074t.m100207e(m16843d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C3339c m16843d3 = C3339c.m16819c(C3338b0.m16815a(InterfaceC2650b.class, CoroutineDispatcher.class)).m16841b(C3355r.m16908j(C3338b0.m16815a(InterfaceC2650b.class, Executor.class))).m16845f(C6594c.f36560a).m16843d();
        AbstractC19074t.m100207e(m16843d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C3339c m16843d4 = C3339c.m16819c(C3338b0.m16815a(InterfaceC2652d.class, CoroutineDispatcher.class)).m16841b(C3355r.m16908j(C3338b0.m16815a(InterfaceC2652d.class, Executor.class))).m16845f(C6595d.f36561a).m16843d();
        AbstractC19074t.m100207e(m16843d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        m131505m = AbstractC25368s.m131505m(AbstractC26607h.m136567b("fire-core-ktx", "20.3.2"), m16843d, m16843d2, m16843d3, m16843d4);
        return m131505m;
    }
}
