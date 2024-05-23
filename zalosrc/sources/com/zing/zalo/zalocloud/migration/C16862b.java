package com.zing.zalo.zalocloud.migration;

import ah0.C0860a;
import am.AbstractC0924m0;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.net.AbstractC1434a;
import androidx.work.EnumC2254v;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.migration.AbstractC16861a;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zalocloud.migration.AbstractC16866f;
import com.zing.zalo.zalocloud.migration.InterfaceC16863c;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import ho0.AbstractC20110a;
import hu.C20128b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lg0.C22479c;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import p019aj.C0876j;
import p348mi.AbstractC23306f;
import p452ql.InterfaceC25320d;
import p487rl.EnumC25825f;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import ug0.AbstractC27251f;
import ug0.C27252g;
import ug0.EnumC27248c;
import ug0.EnumC27249d;
import ug0.EnumC27250e;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.zalocloud.migration.b */
/* loaded from: classes7.dex */
public final class C16862b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f85737a;

    /* renamed from: b */
    private final InterfaceC25320d f85738b;

    /* renamed from: c */
    private final InterfaceC16863c f85739c;

    /* renamed from: d */
    private final CoroutineDispatcher f85740d;

    /* renamed from: e */
    private final InterfaceC24854k f85741e;

    /* renamed from: f */
    private final InterfaceC24854k f85742f;

    /* renamed from: g */
    private final MutableStateFlow f85743g;

    /* renamed from: h */
    private final StateFlow f85744h;

    /* renamed from: i */
    private Job f85745i;

    /* renamed from: j */
    private Job f85746j;

    /* renamed from: com.zing.zalo.zalocloud.migration.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloCloudMigrationAnalyzer mo12V4() {
            InterfaceC25320d interfaceC25320d = C16862b.this.f85738b;
            C22479c m120637Z = AbstractC23306f.m120637Z();
            AbstractC19074t.m100207e(m120637Z, "provideGetBackupMetadataUseCase(...)");
            C0876j m120584H0 = AbstractC23306f.m120584H0();
            AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            return new ZaloCloudMigrationAnalyzer(interfaceC25320d, m120637Z, m120584H0, m120633X1);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f85748s;

        /* renamed from: t */
        Object f85749t;

        /* renamed from: u */
        /* synthetic */ Object f85750u;

        /* renamed from: w */
        int f85752w;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85750u = obj;
            this.f85752w |= Integer.MIN_VALUE;
            return C16862b.this.m90034q(null, this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$d */
    /* loaded from: classes7.dex */
    public static final class d implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ FlowCollector f85753p;

        /* renamed from: q */
        final /* synthetic */ C16862b f85754q;

        /* renamed from: r */
        final /* synthetic */ C19051f0 f85755r;

        d(FlowCollector flowCollector, C16862b c16862b, C19051f0 c19051f0) {
            this.f85753p = flowCollector;
            this.f85754q = c16862b;
            this.f85755r = c19051f0;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object mo12109b(AbstractC16861a abstractC16861a, Continuation continuation) {
            Object gVar;
            Object m142578e;
            Object m142578e2;
            InterfaceC16863c interfaceC16863c;
            Object m142578e3;
            Object m142578e4;
            if (abstractC16861a instanceof AbstractC16861a.a) {
                Object mo12109b = this.f85753p.mo12109b(new AbstractC16864d.c(this.f85754q.m90043C(), EnumC27249d.f128041p, abstractC16861a.m90002a() / 100.0f), continuation);
                m142578e4 = AbstractC28298d.m142578e();
                if (mo12109b == m142578e4) {
                    return mo12109b;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16861a instanceof AbstractC16861a.c) {
                Object mo12109b2 = this.f85753p.mo12109b(new AbstractC16864d.d(this.f85754q.m90043C(), EnumC27249d.f128041p, abstractC16861a.m90002a() / 100.0f), continuation);
                m142578e3 = AbstractC28298d.m142578e();
                if (mo12109b2 == m142578e3) {
                    return mo12109b2;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16861a instanceof AbstractC16861a.d) {
                if (abstractC16861a.m90002a() == 0 && (interfaceC16863c = this.f85754q.f85739c) != null) {
                    interfaceC16863c.mo90075b();
                }
                AbstractC16861a.d dVar = (AbstractC16861a.d) abstractC16861a;
                Object mo12109b3 = this.f85753p.mo12109b(new AbstractC16864d.f(this.f85754q.m90043C(), EnumC27249d.f128041p, dVar.m90006b(), dVar.m90007c(), abstractC16861a.m90002a() / 100.0f, false, 32, null), continuation);
                m142578e2 = AbstractC28298d.m142578e();
                if (mo12109b3 == m142578e2) {
                    return mo12109b3;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16861a instanceof AbstractC16861a.b) {
                FlowCollector flowCollector = this.f85753p;
                AbstractC16861a.b bVar = (AbstractC16861a.b) abstractC16861a;
                if (bVar.m90003b() < 3) {
                    gVar = new AbstractC16864d.f(this.f85754q.m90043C(), EnumC27249d.f128041p, bVar.m90004c(), bVar.m90005d(), abstractC16861a.m90002a() / 100.0f, true);
                } else {
                    gVar = new AbstractC16864d.g(this.f85754q.m90043C(), EnumC27249d.f128041p, abstractC16861a.m90002a() / 100.0f, false, 8, null);
                }
                Object mo12109b4 = flowCollector.mo12109b(gVar, continuation);
                m142578e = AbstractC28298d.m142578e();
                if (mo12109b4 == m142578e) {
                    return mo12109b4;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16861a instanceof AbstractC16861a.e) {
                InterfaceC16863c interfaceC16863c2 = this.f85754q.f85739c;
                if (interfaceC16863c2 != null) {
                    AbstractC16861a.e eVar = (AbstractC16861a.e) abstractC16861a;
                    interfaceC16863c2.mo90077d(eVar.m90011e(), eVar.m90010d(), eVar.m90009c(), eVar.m90008b());
                }
                this.f85755r.f94928p = true;
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f85756s;

        /* renamed from: u */
        int f85758u;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85756s = obj;
            this.f85758u |= Integer.MIN_VALUE;
            return C16862b.this.m90035r(null, this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85759t;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85759t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                Job job = C16862b.this.f85745i;
                if (job == null) {
                    AbstractC19074t.m100223u("lastStateFetchJob");
                    job = null;
                }
                this.f85759t = 1;
                if (job.mo112736c0(this) == m142578e) {
                    return m142578e;
                }
            }
            C16862b.this.m90016R(3);
            if (!(C16862b.this.f85743g.getValue() instanceof AbstractC16864d.j)) {
                MutableStateFlow mutableStateFlow = C16862b.this.f85743g;
                AbstractC16864d.j jVar = new AbstractC16864d.j(C16862b.this.m90043C());
                this.f85759t = 2;
                if (mutableStateFlow.mo12109b(jVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC29096d {

        /* renamed from: s */
        Object f85761s;

        /* renamed from: t */
        Object f85762t;

        /* renamed from: u */
        /* synthetic */ Object f85763u;

        /* renamed from: w */
        int f85765w;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85763u = obj;
            this.f85765w |= Integer.MIN_VALUE;
            return C16862b.this.m90036t(null, this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        Object f85766s;

        /* renamed from: t */
        Object f85767t;

        /* renamed from: u */
        /* synthetic */ Object f85768u;

        /* renamed from: w */
        int f85770w;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85768u = obj;
            this.f85770w |= Integer.MIN_VALUE;
            return C16862b.this.m90037u(null, this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$i */
    /* loaded from: classes7.dex */
    public static final class i implements FlowCollector {

        /* renamed from: q */
        final /* synthetic */ FlowCollector f85772q;

        /* renamed from: r */
        final /* synthetic */ C19051f0 f85773r;

        /* renamed from: com.zing.zalo.zalocloud.migration.b$i$a */
        /* loaded from: classes7.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f85774a;

            static {
                int[] iArr = new int[EnumC27250e.values().length];
                try {
                    iArr[EnumC27250e.f128048q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC27250e.f128047p.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC27250e.f128049r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f85774a = iArr;
            }
        }

        i(FlowCollector flowCollector, C19051f0 c19051f0) {
            this.f85772q = flowCollector;
            this.f85773r = c19051f0;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object mo12109b(AbstractC16866f abstractC16866f, Continuation continuation) {
            Object gVar;
            Object m142578e;
            Object m142578e2;
            Object m142578e3;
            Object m142578e4;
            Object m142578e5;
            InterfaceC16863c interfaceC16863c;
            Object m142578e6;
            InterfaceC16863c interfaceC16863c2;
            if (abstractC16866f instanceof AbstractC16866f.d) {
                AbstractC16866f.d dVar = (AbstractC16866f.d) abstractC16866f;
                int m90107d = dVar.m90107d();
                if (m90107d != 0) {
                    if (m90107d == 100) {
                        int i11 = a.f85774a[dVar.m90106c().ordinal()];
                        if (i11 == 1) {
                            InterfaceC16863c interfaceC16863c3 = C16862b.this.f85739c;
                            if (interfaceC16863c3 != null) {
                                InterfaceC16863c.a.m90079a(interfaceC16863c3, EnumC25825f.f123208q, null, 2, null);
                            }
                        } else if (i11 == 2) {
                            InterfaceC16863c interfaceC16863c4 = C16862b.this.f85739c;
                            if (interfaceC16863c4 != null) {
                                InterfaceC16863c.a.m90079a(interfaceC16863c4, EnumC25825f.f123209r, null, 2, null);
                            }
                        } else if (i11 == 3 && (interfaceC16863c2 = C16862b.this.f85739c) != null) {
                            InterfaceC16863c.a.m90079a(interfaceC16863c2, EnumC25825f.f123210s, null, 2, null);
                        }
                    }
                } else {
                    int i12 = a.f85774a[dVar.m90106c().ordinal()];
                    if (i12 == 1) {
                        InterfaceC16863c interfaceC16863c5 = C16862b.this.f85739c;
                        if (interfaceC16863c5 != null) {
                            interfaceC16863c5.mo90078e(EnumC25825f.f123208q);
                        }
                    } else if (i12 == 2) {
                        InterfaceC16863c interfaceC16863c6 = C16862b.this.f85739c;
                        if (interfaceC16863c6 != null) {
                            interfaceC16863c6.mo90078e(EnumC25825f.f123209r);
                        }
                    } else if (i12 == 3 && (interfaceC16863c = C16862b.this.f85739c) != null) {
                        interfaceC16863c.mo90078e(EnumC25825f.f123210s);
                    }
                }
                Object mo12109b = this.f85772q.mo12109b(new AbstractC16864d.f(C16862b.this.m90043C(), AbstractC27251f.m139401a(dVar.m90106c()), dVar.m90105b(), dVar.m90108e(), abstractC16866f.m90101a(), false, 32, null), continuation);
                m142578e6 = AbstractC28298d.m142578e();
                if (mo12109b == m142578e6) {
                    return mo12109b;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16866f instanceof AbstractC16866f.a) {
                Object mo12109b2 = this.f85772q.mo12109b(new AbstractC16864d.a(C16862b.this.m90043C(), AbstractC27251f.m139401a(((AbstractC16866f.a) abstractC16866f).m90102b()), abstractC16866f.m90101a()), continuation);
                m142578e5 = AbstractC28298d.m142578e();
                if (mo12109b2 == m142578e5) {
                    return mo12109b2;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16866f instanceof AbstractC16866f.b) {
                Object mo12109b3 = this.f85772q.mo12109b(new AbstractC16864d.c(C16862b.this.m90043C(), AbstractC27251f.m139401a(((AbstractC16866f.b) abstractC16866f).m90103b()), abstractC16866f.m90101a()), continuation);
                m142578e4 = AbstractC28298d.m142578e();
                if (mo12109b3 == m142578e4) {
                    return mo12109b3;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16866f instanceof AbstractC16866f.c) {
                Object mo12109b4 = this.f85772q.mo12109b(new AbstractC16864d.d(C16862b.this.m90043C(), AbstractC27251f.m139401a(((AbstractC16866f.c) abstractC16866f).m90104b()), abstractC16866f.m90101a()), continuation);
                m142578e3 = AbstractC28298d.m142578e();
                if (mo12109b4 == m142578e3) {
                    return mo12109b4;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16866f instanceof AbstractC16866f.f) {
                Object mo12109b5 = this.f85772q.mo12109b(new AbstractC16864d.i(C16862b.this.m90043C(), AbstractC27251f.m139401a(((AbstractC16866f.f) abstractC16866f).m90116b()), abstractC16866f.m90101a()), continuation);
                m142578e2 = AbstractC28298d.m142578e();
                if (mo12109b5 == m142578e2) {
                    return mo12109b5;
                }
                return C24848g0.f119245a;
            }
            if (abstractC16866f instanceof AbstractC16866f.e) {
                AbstractC16866f.e eVar = (AbstractC16866f.e) abstractC16866f;
                if (eVar.m90115h()) {
                    this.f85773r.f94928p = true;
                    AbstractC0924m0.m3150Iq(true);
                    C26676b.m136957g("SMLZCloudMigrationRunner", "Server quota exceeded", null, 4, null);
                    return C24848g0.f119245a;
                }
                if (eVar.m90110c() >= 2 && !eVar.m90114g()) {
                    this.f85773r.f94928p = true;
                    return C24848g0.f119245a;
                }
                FlowCollector flowCollector = this.f85772q;
                if (eVar.m90109b() < 3 && !eVar.m90114g()) {
                    gVar = new AbstractC16864d.f(C16862b.this.m90043C(), AbstractC27251f.m139401a(eVar.m90111d()), eVar.m90112e(), eVar.m90113f(), abstractC16866f.m90101a(), true);
                } else {
                    gVar = new AbstractC16864d.g(C16862b.this.m90043C(), AbstractC27251f.m139401a(eVar.m90111d()), abstractC16866f.m90101a(), false, 8, null);
                }
                Object mo12109b6 = flowCollector.mo12109b(gVar, continuation);
                m142578e = AbstractC28298d.m142578e();
                if (mo12109b6 == m142578e) {
                    return mo12109b6;
                }
                return C24848g0.f119245a;
            }
            if ((abstractC16866f instanceof AbstractC16866f.g) || AbstractC19074t.m100204b(abstractC16866f, AbstractC16866f.h.f85848b)) {
                this.f85773r.f94928p = true;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.b$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85775t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            String m127130z;
            String m127130z2;
            AbstractC28298d.m142578e();
            if (this.f85775t == 0) {
                AbstractC24862s.m129228b(obj);
                m127130z = AbstractC24341v.m127130z("─", 25);
                String m90043C = C16862b.this.m90043C();
                String m90042B = C16862b.this.m90042B();
                String m90046F = C16862b.this.m90046F();
                boolean m90053N = C16862b.this.m90053N();
                boolean m90050K = C16862b.this.m90050K();
                EnumC2254v m90047G = C16862b.this.m90047G();
                m127130z2 = AbstractC24341v.m127130z("─", 50);
                AbstractC20110a.f98889a.m104564x("SMLZCloudMigrationRunner").mo104556o(8, m127130z + "\nid: " + m90043C + "\ncurrentPhase: " + m90042B + "\nlastState: " + m90046F + "\nisNetworkConditionSatisfied: " + m90053N + "\nisBatteryLevelSatisfied: " + m90050K + "\nrequiredNetworkType: " + m90047G + "\n" + m127130z2, new Object[0]);
                C16862b.this.m90039x().m89878y();
                C16862b.this.m90013I().m89968f0();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f85777t;

        /* renamed from: u */
        long f85778u;

        /* renamed from: v */
        int f85779v;

        k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(continuation);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00df A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC16864d abstractC16864d;
            long currentTimeMillis;
            MutableStateFlow mutableStateFlow;
            long m89765a;
            MutableStateFlow mutableStateFlow2;
            AbstractC16864d.j jVar;
            m142578e = AbstractC28298d.m142578e();
            switch (this.f85779v) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    int m90012A = C16862b.this.m90012A();
                    if (m90012A == -1) {
                        MutableStateFlow mutableStateFlow3 = C16862b.this.f85743g;
                        AbstractC16864d.k kVar = new AbstractC16864d.k(C16862b.this.m90043C());
                        this.f85779v = 3;
                        if (mutableStateFlow3.mo12109b(kVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    if (m90012A == 0) {
                        MutableStateFlow mutableStateFlow4 = C16862b.this.f85743g;
                        AbstractC16864d.h hVar = new AbstractC16864d.h(C16862b.this.m90043C());
                        this.f85779v = 1;
                        if (mutableStateFlow4.mo12109b(hVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    if (m90012A != 3) {
                        InterfaceC25320d interfaceC25320d = C16862b.this.f85738b;
                        this.f85779v = 4;
                        obj = interfaceC25320d.mo131123e(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        abstractC16864d = (AbstractC16864d) obj;
                        if (abstractC16864d != null) {
                            return C24848g0.f119245a;
                        }
                        if ((abstractC16864d instanceof AbstractC16864d.e) && ((AbstractC16864d.e) abstractC16864d).m90094l() == EnumC27248c.f128037r) {
                            currentTimeMillis = System.currentTimeMillis();
                            InterfaceC25320d interfaceC25320d2 = C16862b.this.f85738b;
                            this.f85777t = abstractC16864d;
                            this.f85778u = currentTimeMillis;
                            this.f85779v = 5;
                            obj = interfaceC25320d2.mo131125g(this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            long longValue = ((Number) obj).longValue();
                            m89765a = C16862b.this.m90040y().m89801i().m89765a() * 86400000;
                            if (m89765a > 0 && currentTimeMillis - longValue >= m89765a) {
                                mutableStateFlow2 = C16862b.this.f85743g;
                                jVar = new AbstractC16864d.j(C16862b.this.m90043C());
                                this.f85777t = null;
                                this.f85779v = 6;
                                if (mutableStateFlow2.mo12109b(jVar, this) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        mutableStateFlow = C16862b.this.f85743g;
                        this.f85777t = null;
                        this.f85779v = 7;
                        if (mutableStateFlow.mo12109b(abstractC16864d, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    MutableStateFlow mutableStateFlow5 = C16862b.this.f85743g;
                    AbstractC16864d.j jVar2 = new AbstractC16864d.j(C16862b.this.m90043C());
                    this.f85779v = 2;
                    if (mutableStateFlow5.mo12109b(jVar2, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                case 1:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 2:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 3:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 4:
                    AbstractC24862s.m129228b(obj);
                    abstractC16864d = (AbstractC16864d) obj;
                    if (abstractC16864d != null) {
                    }
                    break;
                case 5:
                    currentTimeMillis = this.f85778u;
                    abstractC16864d = (AbstractC16864d) this.f85777t;
                    AbstractC24862s.m129228b(obj);
                    long longValue2 = ((Number) obj).longValue();
                    m89765a = C16862b.this.m90040y().m89801i().m89765a() * 86400000;
                    if (m89765a > 0) {
                        mutableStateFlow2 = C16862b.this.f85743g;
                        jVar = new AbstractC16864d.j(C16862b.this.m90043C());
                        this.f85777t = null;
                        this.f85779v = 6;
                        if (mutableStateFlow2.mo12109b(jVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    mutableStateFlow = C16862b.this.f85743g;
                    this.f85777t = null;
                    this.f85779v = 7;
                    if (mutableStateFlow.mo12109b(abstractC16864d, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 6:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 7:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$l */
    /* loaded from: classes7.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85781t;

        l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85781t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Job job = C16862b.this.f85745i;
                if (job == null) {
                    AbstractC19074t.m100223u("lastStateFetchJob");
                    job = null;
                }
                this.f85781t = 1;
                if (job.mo112736c0(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$m */
    /* loaded from: classes7.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85783t;

        /* renamed from: u */
        /* synthetic */ Object f85784u;

        m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            m mVar = new m(continuation);
            mVar.f85784u = obj;
            return mVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            InterfaceC16863c interfaceC16863c;
            AbstractC28298d.m142578e();
            if (this.f85783t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC16864d abstractC16864d = (AbstractC16864d) this.f85784u;
                if (abstractC16864d instanceof AbstractC16864d.h) {
                    InterfaceC16863c interfaceC16863c2 = C16862b.this.f85739c;
                    if (interfaceC16863c2 != null) {
                        interfaceC16863c2.onStart();
                    }
                } else if ((abstractC16864d instanceof AbstractC16864d.j) && (interfaceC16863c = C16862b.this.f85739c) != null) {
                    interfaceC16863c.mo90074a();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(AbstractC16864d abstractC16864d, Continuation continuation) {
            return ((m) mo238a(abstractC16864d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.b$n */
    /* loaded from: classes7.dex */
    public static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85786t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85786t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26676b.m136952b("SMLZCloudMigrationRunner", "[" + C16862b.this.m90043C() + "] persistCurrentState(): lastState=" + C16862b.this.m90046F());
                InterfaceC25320d interfaceC25320d = C16862b.this.f85738b;
                AbstractC16864d m90044D = C16862b.this.m90044D();
                this.f85786t = 1;
                if (interfaceC25320d.mo131119a(m90044D, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$o */
    /* loaded from: classes7.dex */
    public static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85788t;

        o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85788t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC25320d interfaceC25320d = C16862b.this.f85738b;
                this.f85788t = 1;
                if (interfaceC25320d.mo131120b(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$p */
    /* loaded from: classes7.dex */
    public static final class p extends AbstractC29096d {

        /* renamed from: s */
        Object f85790s;

        /* renamed from: t */
        /* synthetic */ Object f85791t;

        /* renamed from: v */
        int f85793v;

        p(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85791t = obj;
            this.f85793v |= Integer.MIN_VALUE;
            return C16862b.this.m90055S(this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$q */
    /* loaded from: classes7.dex */
    public static final class q implements FlowCollector {

        /* renamed from: q */
        final /* synthetic */ FlowCollector f85795q;

        /* renamed from: com.zing.zalo.zalocloud.migration.b$q$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29096d {

            /* renamed from: s */
            Object f85796s;

            /* renamed from: t */
            Object f85797t;

            /* renamed from: u */
            /* synthetic */ Object f85798u;

            /* renamed from: w */
            int f85800w;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f85798u = obj;
                this.f85800w |= Integer.MIN_VALUE;
                return q.this.mo12109b(null, this);
            }
        }

        q(FlowCollector flowCollector) {
            this.f85795q = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(AbstractC16864d abstractC16864d, Continuation continuation) {
            a aVar;
            Object m142578e;
            int i11;
            q qVar;
            FlowCollector flowCollector;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i12 = aVar.f85800w;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    aVar.f85800w = i12 - Integer.MIN_VALUE;
                    Object obj = aVar.f85798u;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = aVar.f85800w;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC16864d = (AbstractC16864d) aVar.f85797t;
                        qVar = (q) aVar.f85796s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        AbstractC24862s.m129228b(obj);
                        MutableStateFlow mutableStateFlow = C16862b.this.f85743g;
                        aVar.f85796s = this;
                        aVar.f85797t = abstractC16864d;
                        aVar.f85800w = 1;
                        if (mutableStateFlow.mo12109b(abstractC16864d, aVar) == m142578e) {
                            return m142578e;
                        }
                        qVar = this;
                    }
                    flowCollector = qVar.f85795q;
                    aVar.f85796s = null;
                    aVar.f85797t = null;
                    aVar.f85800w = 2;
                    if (flowCollector.mo12109b(abstractC16864d, aVar) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f85798u;
            m142578e = AbstractC28298d.m142578e();
            i11 = aVar.f85800w;
            if (i11 == 0) {
            }
            flowCollector = qVar.f85795q;
            aVar.f85796s = null;
            aVar.f85797t = null;
            aVar.f85800w = 2;
            if (flowCollector.mo12109b(abstractC16864d, aVar) == m142578e) {
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$r */
    /* loaded from: classes7.dex */
    public static final class r extends AbstractC29096d {

        /* renamed from: s */
        Object f85801s;

        /* renamed from: t */
        int f85802t;

        /* renamed from: u */
        /* synthetic */ Object f85803u;

        /* renamed from: w */
        int f85805w;

        r(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85803u = obj;
            this.f85805w |= Integer.MIN_VALUE;
            return C16862b.this.m90017U(0, null, this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.b$s */
    /* loaded from: classes7.dex */
    public static final class s extends AbstractC29096d {

        /* renamed from: s */
        Object f85806s;

        /* renamed from: t */
        Object f85807t;

        /* renamed from: u */
        boolean f85808u;

        /* renamed from: v */
        int f85809v;

        /* renamed from: w */
        /* synthetic */ Object f85810w;

        /* renamed from: y */
        int f85812y;

        s(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85810w = obj;
            this.f85812y |= Integer.MIN_VALUE;
            return C16862b.this.m90018V(false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.b$t */
    /* loaded from: classes7.dex */
    public static final class t extends AbstractC19075u implements InterfaceC18494a {
        t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloCloudMigrationUploader mo12V4() {
            InterfaceC25320d interfaceC25320d = C16862b.this.f85738b;
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            C22479c m120637Z = AbstractC23306f.m120637Z();
            AbstractC19074t.m100207e(m120637Z, "provideGetBackupMetadataUseCase(...)");
            C27252g m120593K0 = AbstractC23306f.m120593K0();
            AbstractC19074t.m100207e(m120593K0, "provideMigrationBackupDownloader(...)");
            return new ZaloCloudMigrationUploader(interfaceC25320d, m120579F1, m120637Z, m120593K0, null, 16, null);
        }
    }

    public C16862b(String str, InterfaceC25320d interfaceC25320d, InterfaceC16863c interfaceC16863c) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(interfaceC25320d, "repository");
        this.f85737a = str;
        this.f85738b = interfaceC25320d;
        this.f85739c = interfaceC16863c;
        this.f85740d = Dispatchers.m112680b();
        m129210a = AbstractC24856m.m129210a(new b());
        this.f85741e = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new t());
        this.f85742f = m129210a2;
        MutableStateFlow m113503a = StateFlowKt.m113503a(new AbstractC16864d.k(str));
        this.f85743g = m113503a;
        this.f85744h = FlowKt.m113284b(m113503a);
        m90014O();
        m90038w();
    }

    /* renamed from: A */
    public final int m90012A() {
        return this.f85738b.mo131136r();
    }

    /* renamed from: I */
    public final ZaloCloudMigrationUploader m90013I() {
        return (ZaloCloudMigrationUploader) this.f85742f.getValue();
    }

    /* renamed from: O */
    private final void m90014O() {
        FlowKt.m113270F(FlowKt.m113272H(this.f85743g, new m(null)), m90041z());
    }

    /* renamed from: Q */
    private final Job m90015Q() {
        Job m112540d;
        Job job = this.f85746j;
        if (job == null || !job.mo112496c()) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(m90041z(), this.f85740d, null, new o(null), 2, null);
            this.f85746j = m112540d;
            return m112540d;
        }
        return job;
    }

    /* renamed from: R */
    public final void m90016R(int i11) {
        this.f85738b.mo131124f(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90017U(int i11, FlowCollector flowCollector, Continuation continuation) {
        r rVar;
        Object m142578e;
        int i12;
        C16862b c16862b;
        boolean z11;
        C16862b c16862b2;
        boolean booleanValue;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i13 = rVar.f85805w;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rVar.f85805w = i13 - Integer.MIN_VALUE;
                Object obj = rVar.f85803u;
                m142578e = AbstractC28298d.m142578e();
                i12 = rVar.f85805w;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    i11 = rVar.f85802t;
                                    c16862b = (C16862b) rVar.f85801s;
                                    AbstractC24862s.m129228b(obj);
                                    booleanValue = ((Boolean) obj).booleanValue();
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                i11 = rVar.f85802t;
                                c16862b = (C16862b) rVar.f85801s;
                                AbstractC24862s.m129228b(obj);
                                booleanValue = ((Boolean) obj).booleanValue();
                            }
                        } else {
                            i11 = rVar.f85802t;
                            c16862b = (C16862b) rVar.f85801s;
                            AbstractC24862s.m129228b(obj);
                            booleanValue = ((Boolean) obj).booleanValue();
                        }
                    } else {
                        i11 = rVar.f85802t;
                        c16862b = (C16862b) rVar.f85801s;
                        AbstractC24862s.m129228b(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    z11 = false;
                                    c16862b2 = this;
                                    Boolean m145339a = AbstractC29094b.m145339a(z11);
                                    boolean booleanValue2 = m145339a.booleanValue();
                                    C26676b.m136957g("SMLZCloudMigrationRunner", "[" + c16862b2.f85737a + "] startAtPhase(): phase=" + i11 + ", result=" + booleanValue2, null, 4, null);
                                    return m145339a;
                                }
                                rVar.f85801s = this;
                                rVar.f85802t = i11;
                                rVar.f85805w = 4;
                                obj = m90035r(flowCollector, rVar);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                c16862b = this;
                                booleanValue = ((Boolean) obj).booleanValue();
                            } else {
                                rVar.f85801s = this;
                                rVar.f85802t = i11;
                                rVar.f85805w = 3;
                                obj = m90037u(flowCollector, rVar);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                c16862b = this;
                                booleanValue = ((Boolean) obj).booleanValue();
                            }
                        } else {
                            rVar.f85801s = this;
                            rVar.f85802t = i11;
                            rVar.f85805w = 2;
                            obj = m90034q(flowCollector, rVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            c16862b = this;
                            booleanValue = ((Boolean) obj).booleanValue();
                        }
                    } else {
                        rVar.f85801s = this;
                        rVar.f85802t = i11;
                        rVar.f85805w = 1;
                        obj = m90036t(flowCollector, rVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c16862b = this;
                        booleanValue = ((Boolean) obj).booleanValue();
                    }
                }
                boolean z12 = booleanValue;
                c16862b2 = c16862b;
                z11 = z12;
                Boolean m145339a2 = AbstractC29094b.m145339a(z11);
                boolean booleanValue22 = m145339a2.booleanValue();
                C26676b.m136957g("SMLZCloudMigrationRunner", "[" + c16862b2.f85737a + "] startAtPhase(): phase=" + i11 + ", result=" + booleanValue22, null, 4, null);
                return m145339a2;
            }
        }
        rVar = new r(continuation);
        Object obj2 = rVar.f85803u;
        m142578e = AbstractC28298d.m142578e();
        i12 = rVar.f85805w;
        if (i12 == 0) {
        }
        boolean z122 = booleanValue;
        c16862b2 = c16862b;
        z11 = z122;
        Boolean m145339a22 = AbstractC29094b.m145339a(z11);
        boolean booleanValue222 = m145339a22.booleanValue();
        C26676b.m136957g("SMLZCloudMigrationRunner", "[" + c16862b2.f85737a + "] startAtPhase(): phase=" + i11 + ", result=" + booleanValue222, null, 4, null);
        return m145339a22;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f8 -> B:19:0x00fb). Please report as a decompilation issue!!! */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90018V(boolean z11, FlowCollector flowCollector, Continuation continuation) {
        s sVar;
        Object m142578e;
        int i11;
        C16862b c16862b;
        int i12;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i13 = sVar.f85812y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                sVar.f85812y = i13 - Integer.MIN_VALUE;
                Object obj = sVar.f85810w;
                m142578e = AbstractC28298d.m142578e();
                i11 = sVar.f85812y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i12 = sVar.f85809v;
                            flowCollector = (FlowCollector) sVar.f85807t;
                            c16862b = (C16862b) sVar.f85806s;
                            AbstractC24862s.m129228b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                c16862b.m90016R(c16862b.m90012A() + 1);
                                i12 = c16862b.m90012A();
                            }
                            C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] startInternal(): lastPhase=" + i12);
                            if (i12 == 3) {
                                sVar.f85806s = null;
                                sVar.f85807t = null;
                                sVar.f85812y = 4;
                                if (c16862b.m90017U(3, flowCollector, sVar) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            return C24848g0.f119245a;
                        }
                        z11 = sVar.f85808u;
                        flowCollector = (FlowCollector) sVar.f85807t;
                        c16862b = (C16862b) sVar.f85806s;
                        AbstractC24862s.m129228b(obj);
                        if (!z11 || c16862b.m90012A() == -1) {
                            c16862b.m90016R(0);
                        }
                        i12 = 0;
                    } else {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (m90040y().m89801i().m89766b() == 0) {
                        C26676b.m136957g("SMLZCloudMigrationRunner", "[" + this.f85737a + "] Migration is disabled by server config, cancel it", null, 4, null);
                        m90016R(3);
                        sVar.f85812y = 1;
                        if (m90017U(3, flowCollector, sVar) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    Job job = this.f85745i;
                    if (job == null) {
                        AbstractC19074t.m100223u("lastStateFetchJob");
                        job = null;
                    }
                    sVar.f85806s = this;
                    sVar.f85807t = flowCollector;
                    sVar.f85808u = z11;
                    sVar.f85812y = 2;
                    if (job.mo112736c0(sVar) == m142578e) {
                        return m142578e;
                    }
                    c16862b = this;
                    if (!z11) {
                    }
                    c16862b.m90016R(0);
                    i12 = 0;
                }
                if (c16862b.m90012A() < 3) {
                    C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] startInternal(): currentPhase=" + c16862b.m90012A());
                    int m90012A = c16862b.m90012A();
                    sVar.f85806s = c16862b;
                    sVar.f85807t = flowCollector;
                    sVar.f85809v = i12;
                    sVar.f85812y = 3;
                    obj = c16862b.m90017U(m90012A, flowCollector, sVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] startInternal(): lastPhase=" + i12);
                if (i12 == 3) {
                }
            }
        }
        sVar = new s(continuation);
        Object obj2 = sVar.f85810w;
        m142578e = AbstractC28298d.m142578e();
        i11 = sVar.f85812y;
        if (i11 == 0) {
        }
        if (c16862b.m90012A() < 3) {
        }
        C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] startInternal(): lastPhase=" + i12);
        if (i12 == 3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90034q(FlowCollector flowCollector, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        C16862b c16862b;
        C19051f0 c19051f0;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f85752w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f85752w = i12 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.f85750u;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar2.f85752w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19051f0 = (C19051f0) cVar2.f85749t;
                        c16862b = (C16862b) cVar2.f85748s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19051f0 c19051f02 = new C19051f0();
                    ZaloCloudMigrationAnalyzer m90039x = m90039x();
                    d dVar = new d(flowCollector, this, c19051f02);
                    cVar2.f85748s = this;
                    cVar2.f85749t = c19051f02;
                    cVar2.f85752w = 1;
                    if (ZaloCloudMigrationAnalyzer.m89875x(m90039x, false, dVar, cVar2, 1, null) == m142578e) {
                        return m142578e;
                    }
                    c16862b = this;
                    c19051f0 = c19051f02;
                }
                C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] doAnalyzeInternal(): result=" + c19051f0.f94928p);
                return AbstractC29094b.m145339a(c19051f0.f94928p);
            }
        }
        cVar = new c(continuation);
        c cVar22 = cVar;
        Object obj2 = cVar22.f85750u;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar22.f85752w;
        if (i11 == 0) {
        }
        C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] doAnalyzeInternal(): result=" + c19051f0.f94928p);
        return AbstractC29094b.m145339a(c19051f0.f94928p);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90035r(FlowCollector flowCollector, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f85758u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f85758u = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f85756s;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f85758u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Object jVar = new AbstractC16864d.j(this.f85737a);
                    eVar.f85758u = 1;
                    if (flowCollector.mo12109b(jVar, eVar) == m142578e) {
                        return m142578e;
                    }
                }
                return AbstractC29094b.m145339a(true);
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f85756s;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f85758u;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90036t(FlowCollector flowCollector, Continuation continuation) {
        g gVar;
        Object m142578e;
        int i11;
        C16862b c16862b;
        AbstractC16864d.h hVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i12 = gVar.f85765w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f85765w = i12 - Integer.MIN_VALUE;
                Object obj = gVar.f85763u;
                m142578e = AbstractC28298d.m142578e();
                i11 = gVar.f85765w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return AbstractC29094b.m145339a(true);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) gVar.f85762t;
                    c16862b = (C16862b) gVar.f85761s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    Job m90015Q = m90015Q();
                    gVar.f85761s = this;
                    gVar.f85762t = flowCollector;
                    gVar.f85765w = 1;
                    if (m90015Q.mo112736c0(gVar) == m142578e) {
                        return m142578e;
                    }
                    c16862b = this;
                }
                hVar = new AbstractC16864d.h(c16862b.f85737a);
                gVar.f85761s = null;
                gVar.f85762t = null;
                gVar.f85765w = 2;
                if (flowCollector.mo12109b(hVar, gVar) == m142578e) {
                    return m142578e;
                }
                return AbstractC29094b.m145339a(true);
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f85763u;
        m142578e = AbstractC28298d.m142578e();
        i11 = gVar.f85765w;
        if (i11 == 0) {
        }
        hVar = new AbstractC16864d.h(c16862b.f85737a);
        gVar.f85761s = null;
        gVar.f85762t = null;
        gVar.f85765w = 2;
        if (flowCollector.mo12109b(hVar, gVar) == m142578e) {
        }
        return AbstractC29094b.m145339a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90037u(FlowCollector flowCollector, Continuation continuation) {
        h hVar;
        Object m142578e;
        int i11;
        C16862b c16862b;
        C19051f0 c19051f0;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f85770w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f85770w = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f85768u;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f85770w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19051f0 = (C19051f0) hVar.f85767t;
                        c16862b = (C16862b) hVar.f85766s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19051f0 c19051f02 = new C19051f0();
                    ZaloCloudMigrationUploader m90013I = m90013I();
                    i iVar = new i(flowCollector, c19051f02);
                    hVar.f85766s = this;
                    hVar.f85767t = c19051f02;
                    hVar.f85770w = 1;
                    if (m90013I.m89967S(iVar, hVar) == m142578e) {
                        return m142578e;
                    }
                    c16862b = this;
                    c19051f0 = c19051f02;
                }
                C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] doUploadInternal(): result=" + c19051f0.f94928p);
                return AbstractC29094b.m145339a(c19051f0.f94928p);
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f85768u;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f85770w;
        if (i11 == 0) {
        }
        C26676b.m136952b("SMLZCloudMigrationRunner", "[" + c16862b.f85737a + "] doUploadInternal(): result=" + c19051f0.f94928p);
        return AbstractC29094b.m145339a(c19051f0.f94928p);
    }

    /* renamed from: w */
    private final void m90038w() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(m90041z(), this.f85740d, null, new k(null), 2, null);
        this.f85745i = m112540d;
    }

    /* renamed from: x */
    public final ZaloCloudMigrationAnalyzer m90039x() {
        return (ZaloCloudMigrationAnalyzer) this.f85741e.getValue();
    }

    /* renamed from: y */
    public final C16805b m90040y() {
        C16805b m120633X1 = AbstractC23306f.m120633X1();
        AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
        return m120633X1;
    }

    /* renamed from: z */
    private final CoroutineScope m90041z() {
        return C17933b.f90533a.m94579d();
    }

    /* renamed from: B */
    public final String m90042B() {
        int m90012A = m90012A();
        if (m90012A != 0) {
            if (m90012A != 1) {
                if (m90012A != 2) {
                    if (m90012A != 3) {
                        return "DEFAULT(" + m90012A() + ")";
                    }
                    return "FINISH";
                }
                return "UPLOAD";
            }
            return "ANALYZE";
        }
        return "START";
    }

    /* renamed from: C */
    public final String m90043C() {
        return this.f85737a;
    }

    /* renamed from: D */
    public final AbstractC16864d m90044D() {
        return (AbstractC16864d) this.f85743g.getValue();
    }

    /* renamed from: E */
    public final AbstractC16864d m90045E() {
        BuildersKt__BuildersKt.m112536b(null, new l(null), 1, null);
        return m90044D();
    }

    /* renamed from: F */
    public final String m90046F() {
        AbstractC16864d m90045E = m90045E();
        if (m90045E instanceof AbstractC16864d.k) {
            return "Uninitialized";
        }
        if (m90045E instanceof AbstractC16864d.e) {
            float mo90080a = m90045E.mo90080a();
            AbstractC16864d.e eVar = (AbstractC16864d.e) m90045E;
            return "Paused(progress=" + mo90080a + ", reason=" + eVar.m90094l() + ", currentStep=" + eVar.m90093k() + ", autoRetry=" + eVar.m90092j() + ")";
        }
        if (m90045E instanceof AbstractC16864d.f) {
            float mo90080a2 = m90045E.mo90080a();
            AbstractC16864d.f fVar = (AbstractC16864d.f) m90045E;
            return "Progressing(progress=" + mo90080a2 + ", currentStep=" + fVar.m90095j() + ", isRetrying=" + fVar.m90096k() + ")";
        }
        if (m90045E instanceof AbstractC16864d.g) {
            return "RuntimeError()";
        }
        if (m90045E instanceof AbstractC16864d.h) {
            return "Start";
        }
        if (m90045E instanceof AbstractC16864d.j) {
            return "Success";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: G */
    public final EnumC2254v m90047G() {
        EnumC27249d enumC27249d;
        AbstractC16864d m90045E = m90045E();
        int m90012A = m90012A();
        if (m90012A != 3 && !(m90045E instanceof AbstractC16864d.j)) {
            if (m90012A <= 1) {
                return EnumC2254v.CONNECTED;
            }
            if (m90045E instanceof AbstractC16864d.f) {
                enumC27249d = ((AbstractC16864d.f) m90045E).m90095j();
            } else if (m90045E instanceof AbstractC16864d.e) {
                enumC27249d = ((AbstractC16864d.e) m90045E).m90093k();
            } else {
                enumC27249d = null;
            }
            if (enumC27249d == EnumC27249d.f128043r) {
                return EnumC2254v.CONNECTED;
            }
            return EnumC2254v.UNMETERED;
        }
        return EnumC2254v.CONNECTED;
    }

    /* renamed from: H */
    public final StateFlow m90048H() {
        return this.f85744h;
    }

    /* renamed from: J */
    public final Object m90049J(Continuation continuation) {
        boolean z11 = false;
        if (!C0860a.Companion.m2473a().m2461l()) {
            return AbstractC29094b.m145339a(false);
        }
        if (!m90052M() || m90051L()) {
            z11 = true;
        }
        return AbstractC29094b.m145339a(z11);
    }

    /* renamed from: K */
    public final boolean m90050K() {
        if (C20128b.m104756c(MainApplication.Companion.m35500c()) > 15) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m90051L() {
        return this.f85738b.mo131127i();
    }

    /* renamed from: M */
    public final boolean m90052M() {
        if (m90012A() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean m90053N() {
        EnumC27249d enumC27249d;
        AbstractC16864d m90045E = m90045E();
        int m90012A = m90012A();
        if (m90012A == 3 || (m90045E instanceof AbstractC16864d.j)) {
            return true;
        }
        Object systemService = MainApplication.Companion.m35500c().getSystemService("connectivity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (m90012A < 2) {
                return true;
            }
            if (m90045E instanceof AbstractC16864d.f) {
                enumC27249d = ((AbstractC16864d.f) m90045E).m90095j();
            } else if (m90045E instanceof AbstractC16864d.e) {
                enumC27249d = ((AbstractC16864d.e) m90045E).m90093k();
            } else {
                enumC27249d = null;
            }
            if (enumC27249d == EnumC27249d.f128043r) {
                return true;
            }
            return !AbstractC1434a.m7332a(r2);
        }
        return false;
    }

    /* renamed from: P */
    public final void m90054P() {
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new n(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90055S(Continuation continuation) {
        p pVar;
        Object obj;
        Object m142578e;
        int i11;
        C16862b c16862b;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i12 = pVar.f85793v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pVar.f85793v = i12 - Integer.MIN_VALUE;
                obj = pVar.f85791t;
                m142578e = AbstractC28298d.m142578e();
                i11 = pVar.f85793v;
                boolean z11 = true;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c16862b = (C16862b) pVar.f85790s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    pVar.f85790s = this;
                    pVar.f85793v = 1;
                    obj = m90049J(pVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c16862b = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return AbstractC29094b.m145339a(false);
                }
                AbstractC16864d m90045E = c16862b.m90045E();
                if (!(m90045E instanceof AbstractC16864d.h) && !(m90045E instanceof AbstractC16864d.f) && (!(m90045E instanceof AbstractC16864d.e) || !((AbstractC16864d.e) m90045E).m90092j())) {
                    z11 = false;
                }
                return AbstractC29094b.m145339a(z11);
            }
        }
        pVar = new p(continuation);
        obj = pVar.f85791t;
        m142578e = AbstractC28298d.m142578e();
        i11 = pVar.f85793v;
        boolean z112 = true;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* renamed from: T */
    public final Object m90056T(boolean z11, FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        C26676b.m136957g("SMLZCloudMigrationRunner", "[" + this.f85737a + "] start(): isFresh=" + z11, null, 4, null);
        Object m90018V = m90018V(z11, new q(flowCollector), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m90018V == m142578e) {
            return m90018V;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: W */
    public final void m90057W() {
        AbstractC16864d m90045E = m90045E();
        if (m90045E instanceof AbstractC16864d.f) {
            AbstractC16864d.f fVar = (AbstractC16864d.f) m90045E;
            this.f85743g.mo113433d(new AbstractC16864d.a(this.f85737a, fVar.m90095j(), AbstractC16864d.Companion.m90091c(fVar.m90095j(), m90045E.mo90080a())));
        } else if ((m90045E instanceof AbstractC16864d.k) || (m90045E instanceof AbstractC16864d.h)) {
            EnumC27249d enumC27249d = EnumC27249d.f128041p;
            this.f85743g.mo113433d(new AbstractC16864d.a(this.f85737a, enumC27249d, AbstractC16864d.Companion.m90091c(enumC27249d, 0.0f)));
        }
    }

    /* renamed from: X */
    public final void m90058X() {
        AbstractC16864d m90045E = m90045E();
        if (m90045E instanceof AbstractC16864d.f) {
            AbstractC16864d.f fVar = (AbstractC16864d.f) m90045E;
            this.f85743g.mo113433d(new AbstractC16864d.d(this.f85737a, fVar.m90095j(), AbstractC16864d.Companion.m90091c(fVar.m90095j(), m90045E.mo90080a())));
        } else if ((m90045E instanceof AbstractC16864d.k) || (m90045E instanceof AbstractC16864d.h)) {
            EnumC27249d enumC27249d = EnumC27249d.f128041p;
            this.f85743g.mo113433d(new AbstractC16864d.d(this.f85737a, enumC27249d, AbstractC16864d.Companion.m90091c(enumC27249d, 0.0f)));
        }
    }

    /* renamed from: p */
    public final void m90059p() {
        C26676b.m136952b("SMLZCloudMigrationRunner", "[" + this.f85737a + "] clearAllCacheData()");
        m90016R(-1);
        AbstractC0924m0.m3150Iq(false);
        this.f85743g.mo113433d(new AbstractC16864d.k(this.f85737a));
        m90015Q();
    }

    /* renamed from: s */
    public final void m90060s() {
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new f(null), 3, null);
    }

    /* renamed from: v */
    public final void m90061v() {
        BuildersKt__BuildersKt.m112536b(null, new j(null), 1, null);
    }

    public /* synthetic */ C16862b(String str, InterfaceC25320d interfaceC25320d, InterfaceC16863c interfaceC16863c, int i11, AbstractC19060k abstractC19060k) {
        this(str, interfaceC25320d, (i11 & 4) != 0 ? null : interfaceC16863c);
    }
}
