package wg0;

import ah0.C0860a;
import am.AbstractC0924m0;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import androidx.work.InterfaceC2257y;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p586vt.AbstractC28618c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25332a0;
import si.C26263i;
import tg0.C26676b;
import tm0.AbstractC26735a;
import ug0.C27259n;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: wg0.l */
/* loaded from: classes7.dex */
public final class C28989l {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private static final ConcurrentHashMap f134125r = new ConcurrentHashMap();

    /* renamed from: a */
    private final String f134126a;

    /* renamed from: b */
    private final C26263i f134127b;

    /* renamed from: c */
    private final C0860a f134128c;

    /* renamed from: d */
    private final MutableStateFlow f134129d;

    /* renamed from: e */
    private final StateFlow f134130e;

    /* renamed from: f */
    private final AtomicBoolean f134131f;

    /* renamed from: g */
    private final ExecutorCoroutineDispatcher f134132g;

    /* renamed from: h */
    private final CoroutineScope f134133h;

    /* renamed from: i */
    private final Set f134134i;

    /* renamed from: j */
    private final Set f134135j;

    /* renamed from: k */
    private final MutableStateFlow f134136k;

    /* renamed from: l */
    private final StateFlow f134137l;

    /* renamed from: m */
    private final MutableStateFlow f134138m;

    /* renamed from: n */
    private final ConnectivityManager f134139n;

    /* renamed from: o */
    private final s f134140o;

    /* renamed from: p */
    private volatile int f134141p;

    /* renamed from: q */
    private final q f134142q;

    /* renamed from: wg0.l$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28989l m144769a() {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            return m144770b(str);
        }

        /* renamed from: b */
        public final C28989l m144770b(String str) {
            AbstractC19074t.m100208f(str, "userUid");
            ConcurrentHashMap concurrentHashMap = C28989l.f134125r;
            Object obj = concurrentHashMap.get(str);
            if (obj == null) {
                C26263i m135055u = C26263i.m135055u();
                AbstractC19074t.m100207e(m135055u, "getInstance(...)");
                C0860a m120691m2 = AbstractC23306f.m120691m2();
                AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
                obj = new C28989l(str, m135055u, m120691m2);
                Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
                if (putIfAbsent != null) {
                    obj = putIfAbsent;
                }
            }
            C28989l c28989l = (C28989l) obj;
            AbstractC19074t.m100205c(c28989l);
            c28989l.m144748t();
            AbstractC19074t.m100207e(obj, "also(...)");
            return c28989l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.l$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f134143q = new b();

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(Integer num) {
            return String.valueOf(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.l$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f134144q = new c();

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(Integer num) {
            return String.valueOf(num);
        }
    }

    /* renamed from: wg0.l$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f134145q = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m144773a(int i11) {
            return String.valueOf(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m144773a(((Number) obj).intValue());
        }
    }

    /* renamed from: wg0.l$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18509p {
        e() {
            super(2);
        }

        /* renamed from: a */
        public final void m144774a(boolean z11, AbstractC28618c abstractC28618c) {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "onOnboardingRestoreJobFailed(): isJobInterrupted=" + z11 + ", jobErrorData=" + abstractC28618c + ", currentUserUid=" + CoreUtility.f89233i, null, 4, null);
            if (abstractC28618c != null && abstractC28618c.mo97004e()) {
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        C28989l.this.f134139n.registerDefaultNetworkCallback(C28989l.this.f134140o);
                    }
                } catch (Exception e11) {
                    C26676b.m136954d("SMLZCloudOnboardingJobManager", e11);
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m144774a(((Boolean) obj).booleanValue(), (AbstractC28618c) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wg0.l$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {
        f() {
            super(2);
        }

        /* renamed from: a */
        public final void m144775a(boolean z11, AbstractC28618c abstractC28618c) {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "onOnboardingBackupJobFailed(): isJobInterrupted=" + z11 + ", jobErrorData=" + abstractC28618c + ", currentUserUid=" + CoreUtility.f89233i, null, 4, null);
            AbstractC0924m0.m3440Sq(z11);
            if (z11) {
                C28989l.this.f134135j.remove(19);
                C28989l.this.m144753C(6);
            }
            if (abstractC28618c != null && abstractC28618c.mo97004e()) {
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        C28989l.this.f134139n.registerDefaultNetworkCallback(C28989l.this.f134140o);
                    }
                } catch (Exception e11) {
                    C26676b.m136954d("SMLZCloudOnboardingJobManager", e11);
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m144775a(((Boolean) obj).booleanValue(), (AbstractC28618c) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wg0.l$g */
    /* loaded from: classes7.dex */
    public /* synthetic */ class g extends C19071q implements InterfaceC18509p {
        g(Object obj) {
            super(2, obj, C28989l.class, "onEachOnboardingCompositeState", "onEachOnboardingCompositeState(Lcom/zing/zalo/zalocloud/onboarding/ZaloCloudOnboardingCompositeState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: h */
        public final Object mo240pC(AbstractC28981d abstractC28981d, Continuation continuation) {
            return ((C28989l) this.f94922q).m144725A(abstractC28981d, continuation);
        }
    }

    /* renamed from: wg0.l$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m144777a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m144777a() {
            C28989l.this.m144761l(1);
        }
    }

    /* renamed from: wg0.l$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {
        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m144778a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m144778a() {
            C28989l.m144744k(C28989l.this, 3, false, false, 6, null);
        }
    }

    /* renamed from: wg0.l$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {
        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m144779a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m144779a() {
            C28989l.m144744k(C28989l.this, 7, false, false, 6, null);
        }
    }

    /* renamed from: wg0.l$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {
        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m144780a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m144780a() {
            AbstractC0924m0.m3440Sq(false);
            C28989l.m144744k(C28989l.this, 8, false, false, 6, null);
        }
    }

    /* renamed from: wg0.l$l */
    /* loaded from: classes7.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {
        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m144781a(boolean z11) {
            if (!z11) {
                C28989l.m144744k(C28989l.this, 16, false, false, 6, null);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144781a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wg0.l$m */
    /* loaded from: classes7.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18494a {
        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m144782a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m144782a() {
            C28989l.m144744k(C28989l.this, 32, false, false, 6, null);
        }
    }

    /* renamed from: wg0.l$n */
    /* loaded from: classes7.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18494a {
        n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m144783a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m144783a() {
            C28989l.m144744k(C28989l.this, 64, false, false, 6, null);
        }
    }

    /* renamed from: wg0.l$o */
    /* loaded from: classes7.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final o f134155q = new o();

        o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m144784a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m144784a() {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "onOnboardingRestoreDataCorrupted()", null, 4, null);
            C26676b.f126324a.m136979R();
        }
    }

    /* renamed from: wg0.l$p */
    /* loaded from: classes7.dex */
    public static final class p extends AbstractC29096d {

        /* renamed from: s */
        Object f134156s;

        /* renamed from: t */
        Object f134157t;

        /* renamed from: u */
        /* synthetic */ Object f134158u;

        /* renamed from: w */
        int f134160w;

        p(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f134158u = obj;
            this.f134160w |= Integer.MIN_VALUE;
            return C28989l.this.m144725A(null, this);
        }
    }

    /* renamed from: wg0.l$q */
    /* loaded from: classes7.dex */
    public static final class q implements InterfaceC28979b {
        q() {
        }

        @Override // wg0.InterfaceC28979b
        /* renamed from: a */
        public boolean mo144692a(InterfaceC28990m interfaceC28990m) {
            AbstractC19074t.m100208f(interfaceC28990m, "state");
            if (C28989l.this.f134141p != -1) {
                if (interfaceC28990m.mo90085f() != C28989l.this.f134141p) {
                    return false;
                }
                return true;
            }
            List m126597c = C24252c.f117152a.m126597c();
            int mo90085f = interfaceC28990m.mo90085f();
            if (mo90085f != 0 && mo90085f != 1) {
                if (mo90085f != 2) {
                    if (mo90085f != 3) {
                        return false;
                    }
                    return m126597c.contains(EnumC24251b.f117146q);
                }
                return m126597c.contains(EnumC24251b.f117147r);
            }
            return m126597c.contains(EnumC24251b.f117148s);
        }

        @Override // wg0.InterfaceC28979b
        /* renamed from: b */
        public int mo144693b() {
            return C28989l.this.f134141p;
        }
    }

    /* renamed from: wg0.l$r */
    /* loaded from: classes7.dex */
    public static final class r extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f134162q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(int i11) {
            super(1);
            this.f134162q = i11;
        }

        /* renamed from: a */
        public final Boolean m144785a(int i11) {
            boolean z11;
            int i12 = this.f134162q;
            if (i12 != -1 && i12 != i11) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m144785a(((Number) obj).intValue());
        }
    }

    /* renamed from: wg0.l$s */
    /* loaded from: classes7.dex */
    public static final class s extends ConnectivityManager.NetworkCallback {
        s() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC19074t.m100208f(network, "network");
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "onNetworkAvailable()", null, 4, null);
            C28989l.m144728I(C28989l.this, false, 1, null);
            try {
                C28989l.this.f134139n.unregisterNetworkCallback(this);
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudOnboardingJobManager", e11);
            }
        }
    }

    /* renamed from: wg0.l$t */
    /* loaded from: classes7.dex */
    public static final class t extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ int f134165r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i11) {
            super(1);
            this.f134165r = i11;
        }

        /* renamed from: a */
        public final void m144786a(InterfaceC2257y interfaceC2257y) {
            AbstractC19074t.m100208f(interfaceC2257y, "it");
            C28989l.this.f134134i.add(Integer.valueOf(this.f134165r));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144786a((InterfaceC2257y) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wg0.l$u */
    /* loaded from: classes7.dex */
    public static final class u extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f134166t;

        /* renamed from: u */
        int f134167u;

        /* renamed from: w */
        final /* synthetic */ int f134169w;

        /* renamed from: wg0.l$u$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CancellableContinuation f134170q;

            /* renamed from: r */
            final /* synthetic */ C28989l f134171r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CancellableContinuation cancellableContinuation, C28989l c28989l) {
                super(0);
                this.f134170q = cancellableContinuation;
                this.f134171r = c28989l;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m144788a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m144788a() {
                while (this.f134170q.mo112546c() && this.f134171r.f134127b.m135072N()) {
                    Thread.sleep(1000L);
                }
                CancellableContinuation cancellableContinuation = this.f134170q;
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i11, Continuation continuation) {
            super(2, continuation);
            this.f134169w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new u(this.f134169w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f134167u;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C28989l c28989l = C28989l.this;
                this.f134166t = c28989l;
                this.f134167u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                AbstractC26735a.m137531b(false, false, null, null, 0, new a(cancellableContinuationImpl, c28989l), 31, null);
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
            }
            if (C28989l.this.f134127b.m135085r0(this.f134169w)) {
                C26676b.m136957g("SMLZCloudOnboardingJobManager", "startSync(): Start onboarding sync job with entryPoint=" + this.f134169w, null, 4, null);
            } else {
                C26676b.m136957g("SMLZCloudOnboardingJobManager", "startSync(): Sync job could not start with entryPoint=" + this.f134169w, null, 4, null);
                C28989l.this.f134135j.remove(AbstractC29094b.m145341c(this.f134169w));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C28989l(String str, C26263i c26263i, C0860a c0860a) {
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC19074t.m100208f(c26263i, "backupRestoreChatDB");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        this.f134126a = str;
        this.f134127b = c26263i;
        this.f134128c = c0860a;
        MutableStateFlow m113503a = StateFlowKt.m113503a(AbstractC28981d.f.f134110d);
        this.f134129d = m113503a;
        this.f134130e = FlowKt.m113284b(m113503a);
        this.f134131f = new AtomicBoolean(false);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC19074t.m100207e(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        ExecutorCoroutineDispatcher m112728b = ExecutorsKt.m112728b(newSingleThreadExecutor);
        this.f134132g = m112728b;
        this.f134133h = CoroutineScopeKt.m112637a(m112728b);
        this.f134134i = Collections.synchronizedSet(new HashSet());
        this.f134135j = Collections.synchronizedSet(new HashSet());
        MutableStateFlow m113503a2 = StateFlowKt.m113503a(Integer.valueOf(AbstractC28991n.m144829o()));
        this.f134136k = m113503a2;
        this.f134137l = FlowKt.m113284b(m113503a2);
        this.f134138m = StateFlowKt.m113503a(Integer.valueOf(AbstractC28991n.m144827m()));
        Object systemService = MainApplication.Companion.m35500c().getSystemService("connectivity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f134139n = (ConnectivityManager) systemService;
        this.f134140o = new s();
        this.f134141p = -1;
        this.f134142q = new q();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m144725A(AbstractC28981d abstractC28981d, Continuation continuation) {
        p pVar;
        Object m142578e;
        int i11;
        C28989l c28989l;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i12 = pVar.f134160w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pVar.f134160w = i12 - Integer.MIN_VALUE;
                Object obj = pVar.f134158u;
                m142578e = AbstractC28298d.m142578e();
                i11 = pVar.f134160w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        abstractC28981d = (AbstractC28981d) pVar.f134157t;
                        c28989l = (C28989l) pVar.f134156s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m144747s(abstractC28981d);
                    MutableStateFlow mutableStateFlow = this.f134129d;
                    pVar.f134156s = this;
                    pVar.f134157t = abstractC28981d;
                    pVar.f134160w = 1;
                    if (mutableStateFlow.mo12109b(abstractC28981d, pVar) == m142578e) {
                        return m142578e;
                    }
                    c28989l = this;
                }
                if ((abstractC28981d instanceof AbstractC28981d.e) && abstractC28981d.m144696c() == c28989l.f134141p) {
                    c28989l.f134141p = -1;
                }
                return C24848g0.f119245a;
            }
        }
        pVar = new p(continuation);
        Object obj2 = pVar.f134158u;
        m142578e = AbstractC28298d.m142578e();
        i11 = pVar.f134160w;
        if (i11 == 0) {
        }
        if (abstractC28981d instanceof AbstractC28981d.e) {
            c28989l.f134141p = -1;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: F */
    private final void m144726F(int i11, boolean z11, boolean z12) {
        int i12;
        boolean z13;
        if (!this.f134128c.m2466q()) {
            return;
        }
        if (!AbstractC28991n.m144794F()) {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "schedule:() Not ready to start yet", null, 4, null);
            return;
        }
        C26676b.m136957g("SMLZCloudOnboardingJobManager", "schedule(): jobId=" + i11 + ", isJobRestartEnabled=" + z11, null, 4, null);
        if (!z12) {
            i12 = i11;
        } else {
            i12 = -1;
        }
        this.f134141p = i12;
        AbstractC0924m0.m3353Pq(this.f134141p);
        r rVar = new r(i11);
        C24252c c24252c = C24252c.f117152a;
        if (c24252c.m126600f(EnumC24251b.f117148s) && !AbstractC28991n.m144840z()) {
            z13 = true;
            if (((Boolean) rVar.mo205i9(1)).booleanValue()) {
                if (!AbstractC28991n.m144795G()) {
                    if (z11 || !m144750x(18)) {
                        C26676b.m136957g("SMLZCloudOnboardingJobManager", "Starting restore job", null, 4, null);
                        m144733Q();
                        if (c24252c.m126600f(EnumC24251b.f117147r) && !AbstractC28991n.m144792D() && ((Boolean) rVar.mo205i9(2)).booleanValue() && (z11 || (!m144749v(2) && !AbstractC28991n.m144793E()))) {
                            C26676b.m136957g("SMLZCloudOnboardingJobManager", "Starting my cloud migration job", null, 4, null);
                            m144732P(2);
                        }
                        if (c24252c.m126600f(EnumC24251b.f117146q) || AbstractC28991n.m144790B() || !((Boolean) rVar.mo205i9(3)).booleanValue() || z13) {
                            return;
                        }
                        if (z11 || (!m144749v(3) && !AbstractC28991n.m144791C())) {
                            C26676b.m136957g("SMLZCloudOnboardingJobManager", "Starting cloud media migration job", null, 4, null);
                            m144732P(3);
                            return;
                        }
                        return;
                    }
                } else if (z11 || !m144750x(19)) {
                    C26676b.m136957g("SMLZCloudOnboardingJobManager", "Starting backup job", null, 4, null);
                    m144731O();
                }
            }
        }
        z13 = false;
        if (c24252c.m126600f(EnumC24251b.f117147r)) {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "Starting my cloud migration job", null, 4, null);
            m144732P(2);
        }
        if (c24252c.m126600f(EnumC24251b.f117146q)) {
        }
    }

    /* renamed from: H */
    static /* synthetic */ void m144727H(C28989l c28989l, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        c28989l.m144726F(i11, z11, z12);
    }

    /* renamed from: I */
    public static /* synthetic */ void m144728I(C28989l c28989l, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c28989l.m144756G(z11);
    }

    /* renamed from: K */
    public static /* synthetic */ void m144729K(C28989l c28989l, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        c28989l.m144757J(i11, z11, z12);
    }

    /* renamed from: M */
    public static /* synthetic */ void m144730M(C28989l c28989l, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        c28989l.m144758L(i11, z11, z12);
    }

    /* renamed from: O */
    private final void m144731O() {
        m144734R(19);
    }

    /* renamed from: P */
    private final void m144732P(int i11) {
        String str;
        if (i11 != 2) {
            if (i11 != 3) {
                str = null;
                C26676b.m136957g("SMLZCloudOnboardingJobManager", "startMigrationJob(): Unsupported jobId=" + i11, null, 4, null);
            } else {
                str = "cloud_media_migration";
            }
        } else {
            str = "my_cloud_migration";
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        C27259n.m139502q(C27259n.f128166a, str2, null, 0L, new t(i11), 6, null);
    }

    /* renamed from: Q */
    private final void m144733Q() {
        m144734R(18);
    }

    /* renamed from: R */
    private final void m144734R(int i11) {
        if (this.f134127b.m135068G(i11)) {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "startSync(): Cancel onboarding sync job due to exist a running task", null, 4, null);
        } else {
            this.f134135j.add(Integer.valueOf(i11));
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), Dispatchers.m112680b(), null, new u(i11, null), 2, null);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m144744k(C28989l c28989l, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        return c28989l.m144760j(i11, z11, z12);
    }

    /* renamed from: n */
    public static /* synthetic */ void m144745n(C28989l c28989l, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c28989l.m144762m(z11);
    }

    /* renamed from: p */
    public static final C28989l m144746p() {
        return Companion.m144769a();
    }

    /* renamed from: s */
    private final void m144747s(AbstractC28981d abstractC28981d) {
        String m131214n0;
        HashSet hashSet = new HashSet();
        for (Integer num : this.f134134i) {
            AbstractC19074t.m100205c(num);
            InterfaceC28990m m144694a = abstractC28981d.m144694a(num.intValue());
            if (m144694a == null || !m144694a.mo90086g()) {
                hashSet.add(num);
            }
        }
        if (!hashSet.isEmpty()) {
            m131214n0 = AbstractC25332a0.m131214n0(hashSet, null, null, null, 0, null, d.f134145q, 31, null);
            C26676b.m136952b("SMLZCloudOnboardingJobManager", "Started jobIds=" + m131214n0);
            this.f134134i.removeAll(hashSet);
        }
    }

    /* renamed from: t */
    public final void m144748t() {
        boolean m127128x;
        m127128x = AbstractC24341v.m127128x(this.f134126a);
        if (m127128x) {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "initialize(): userUid is empty", null, 4, null);
            return;
        }
        if (!this.f134131f.compareAndSet(false, true)) {
            return;
        }
        m144751z(this, 0, 1, null);
        C26676b.m136957g("SMLZCloudOnboardingJobManager", "initialize(): userUid=" + this.f134126a, null, 4, null);
        CoroutineScope m94579d = C17933b.f90533a.m94579d();
        FlowKt.m113270F(FlowKt.m113272H(AbstractC28991n.m144808T(this.f134126a, this.f134142q), new g(this)), m94579d);
        AbstractC28991n.m144807S(m94579d, new h());
        AbstractC28991n.m144798J(m94579d, new i());
        AbstractC28991n.m144799K(m94579d, new j());
        AbstractC28991n.m144801M(m94579d, this.f134126a, new k());
        AbstractC28991n.m144802N(m94579d, this.f134126a, new l());
        AbstractC28991n.m144803O(m94579d, this.f134126a, new m());
        AbstractC28991n.m144804P(m94579d, this.f134126a, new n());
        AbstractC28991n.m144805Q(m94579d, o.f134155q);
        AbstractC28991n.m144806R(m94579d, new e());
        AbstractC28991n.m144797I(m94579d, new f());
    }

    /* renamed from: v */
    private final boolean m144749v(int i11) {
        boolean contains = this.f134134i.contains(Integer.valueOf(i11));
        if (contains) {
            C26676b.m136957g("SMLZCloudOnboardingJobManager", "startMigrationJob(): There's an existed starting migration job with jobId=" + i11, null, 4, null);
        }
        return contains;
    }

    /* renamed from: x */
    private final boolean m144750x(int i11) {
        return this.f134135j.contains(Integer.valueOf(i11));
    }

    /* renamed from: z */
    public static /* synthetic */ void m144751z(C28989l c28989l, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = AbstractC28991n.m144829o();
        }
        c28989l.m144768y(i11);
    }

    /* renamed from: B */
    public final void m144752B() {
        this.f134135j.clear();
        this.f134134i.clear();
        C27259n.f128166a.m139504b();
        m144758L(AbstractC28991n.m144822h(), true, false);
    }

    /* renamed from: C */
    public final void m144753C(int i11) {
        m144730M(this, ((Number) this.f134138m.getValue()).intValue() & (~i11), false, false, 6, null);
    }

    /* renamed from: D */
    public final void m144754D() {
        m144727H(this, this.f134141p, false, false, 4, null);
    }

    /* renamed from: E */
    public final void m144755E() {
        if (!this.f134128c.m2466q() || !AbstractC0924m0.m3571Xc()) {
            return;
        }
        int m3189K7 = AbstractC0924m0.m3189K7();
        C26676b.m136957g("SMLZCloudOnboardingJobManager", "Reschedule interrupted jobs with lastSessionJobId=" + m3189K7, null, 4, null);
        if (m3189K7 != -1) {
            m144729K(this, 1, false, false, 2, null);
        } else {
            m144726F(1, false, true);
        }
        AbstractC0924m0.m3440Sq(false);
    }

    /* renamed from: G */
    public final void m144756G(boolean z11) {
        if (z11) {
            m144744k(this, 1, false, false, 6, null);
        }
        m144727H(this, -1, true, false, 4, null);
    }

    /* renamed from: J */
    public final void m144757J(int i11, boolean z11, boolean z12) {
        if (z11) {
            m144744k(this, 1, false, false, 6, null);
        }
        m144727H(this, i11, z12, false, 4, null);
    }

    /* renamed from: L */
    public final void m144758L(int i11, boolean z11, boolean z12) {
        Object value;
        Integer valueOf;
        int intValue = ((Number) this.f134138m.getValue()).intValue();
        if (intValue == i11 && !z11) {
            return;
        }
        C26676b.m136957g("SMLZCloudOnboardingJobManager", "Migration flags updated: " + i11 + ", isForce=" + z11 + ", requestSync=" + z12, null, 4, null);
        MutableStateFlow mutableStateFlow = this.f134138m;
        do {
            value = mutableStateFlow.getValue();
            ((Number) value).intValue();
            valueOf = Integer.valueOf(i11);
        } while (!mutableStateFlow.mo113436i(value, valueOf));
        AbstractC28991n.m144812X(valueOf.intValue());
        AbstractC28991n.m144800L(this.f134126a, intValue, i11);
        if (z12) {
            C28994q.f134274a.m144865a(z11);
        }
    }

    /* renamed from: N */
    public final void m144759N(boolean z11) {
        int i11;
        C26676b.m136957g("SMLZCloudOnboardingJobManager", "startAsFresh(): isRestoreJobSkipped=" + z11, null, 4, null);
        this.f134141p = -1;
        this.f134135j.clear();
        this.f134134i.clear();
        if (z11) {
            i11 = 65537;
        } else {
            i11 = 65536;
        }
        m144730M(this, i11, true, false, 4, null);
        m144754D();
    }

    /* renamed from: j */
    public final boolean m144760j(int i11, boolean z11, boolean z12) {
        if (!AbstractC28991n.m144796H(i11)) {
            m144758L(i11 | ((Number) this.f134138m.getValue()).intValue(), z11, z12);
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void m144761l(int i11) {
        if (m144744k(this, i11, false, false, 6, null)) {
            m144754D();
        }
    }

    /* renamed from: m */
    public final void m144762m(boolean z11) {
        this.f134135j.clear();
        this.f134134i.clear();
        C27259n.f128166a.m139504b();
        if (!z11) {
            m144758L(0, true, false);
            AbstractC0924m0.m3440Sq(false);
            AbstractC0924m0.m3179Jq(false);
        } else {
            AbstractC28991n.m144830p().m145993b();
            this.f134131f.set(false);
        }
    }

    /* renamed from: o */
    public final void m144763o() {
        String m127130z;
        String m131214n0;
        String m131214n02;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 20);
        int m144829o = AbstractC28991n.m144829o();
        int m144827m = AbstractC28991n.m144827m();
        Set set = this.f134135j;
        AbstractC19074t.m100207e(set, "startedSyncJobs");
        m131214n0 = AbstractC25332a0.m131214n0(set, null, null, null, 0, null, b.f134143q, 31, null);
        Set set2 = this.f134134i;
        AbstractC19074t.m100207e(set2, "startingMigrationJobIds");
        m131214n02 = AbstractC25332a0.m131214n0(set2, null, null, null, 0, null, c.f134144q, 31, null);
        AbstractC28981d m144764q = m144764q();
        int i11 = this.f134141p;
        boolean m3571Xc = AbstractC0924m0.m3571Xc();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudOnboardingJobManager").mo104556o(8, m127130z + "\noldStatus: " + m144829o + "\nonboardingFlags: " + m144827m + "\nstartedSyncJobs: " + m131214n0 + "\nstartingMigrationJobRunnerIds: " + m131214n02 + "\nlastJobState: " + m144764q + "\ncurrentSessionJobId: " + i11 + "\nisSyncJobInterrupted: " + m3571Xc + "\n" + m127130z2, new Object[0]);
        C27259n.f128166a.m139506d();
    }

    /* renamed from: q */
    public final AbstractC28981d m144764q() {
        return (AbstractC28981d) this.f134130e.getValue();
    }

    /* renamed from: r */
    public final StateFlow m144765r() {
        return this.f134130e;
    }

    /* renamed from: u */
    public final boolean m144766u() {
        if (!(m144764q() instanceof AbstractC28981d.f) && !(m144764q() instanceof AbstractC28981d.e)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m144767w() {
        return m144764q() instanceof AbstractC28981d.b;
    }

    /* renamed from: y */
    public final void m144768y(int i11) {
        int i12;
        if (i11 == 0) {
            return;
        }
        if (AbstractC28992o.m144863e(i11)) {
            i12 = 65536;
        } else {
            i12 = 0;
        }
        if (AbstractC28992o.m144862d(i11)) {
            i12 |= 1;
        }
        if (AbstractC28992o.m144859a(i11)) {
            i12 |= 6;
        }
        if (AbstractC28992o.m144861c(i11)) {
            i12 |= 40;
        }
        if (AbstractC28992o.m144860b(i11)) {
            i12 |= 80;
        }
        m144758L(i12, true, false);
        AbstractC28991n.m144813Y(0);
        C26676b.m136957g("SMLZCloudOnboardingJobManager", "Migrated old migration status done: oldStatus=" + i11 + ", flags=" + i12, null, 4, null);
    }
}
