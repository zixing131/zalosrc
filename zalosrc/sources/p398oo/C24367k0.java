package p398oo;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import androidx.work.AbstractC2144f;
import com.zing.zalo.p062db.C7960e;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;
import nh0.C23793c;
import p398oo.AbstractC24349b0;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: oo.k0 */
/* loaded from: classes4.dex */
public final class C24367k0 implements InterfaceC24372n {

    /* renamed from: a */
    private final a f117658a = new a(null, false, 3, null);

    /* renamed from: b */
    private AtomicInteger f117659b = new AtomicInteger(AbstractC0924m0.m2985D6());

    /* renamed from: oo.k0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private List f117660a;

        /* renamed from: b */
        private boolean f117661b;

        public a(List list, boolean z11) {
            AbstractC19074t.m100208f(list, "listUsers");
            this.f117660a = list;
            this.f117661b = z11;
        }

        /* renamed from: a */
        public final List m127444a() {
            return this.f117660a;
        }

        /* renamed from: b */
        public final boolean m127445b() {
            return this.f117661b;
        }

        /* renamed from: c */
        public final void m127446c(boolean z11) {
            this.f117661b = z11;
        }

        /* renamed from: d */
        public final void m127447d(List list) {
            AbstractC19074t.m100208f(list, "<set-?>");
            this.f117660a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f117660a, aVar.f117660a) && this.f117661b == aVar.f117661b;
        }

        public int hashCode() {
            return (this.f117660a.hashCode() * 31) + AbstractC2144f.m11520a(this.f117661b);
        }

        public String toString() {
            return "CacheListUser(listUsers=" + this.f117660a + ", isInitialize=" + this.f117661b + ")";
        }

        public /* synthetic */ a(List list, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? false : z11);
        }
    }

    /* renamed from: oo.k0$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117662t;

        /* renamed from: u */
        private /* synthetic */ Object f117663u;

        /* renamed from: oo.k0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C24367k0 f117665a;

            /* renamed from: b */
            final /* synthetic */ ProducerScope f117666b;

            a(C24367k0 c24367k0, ProducerScope producerScope) {
                this.f117665a = c24367k0;
                this.f117666b = producerScope;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                try {
                    if (!this.f117665a.m127438h()) {
                        a aVar = this.f117665a.f117658a;
                        C24367k0 c24367k0 = this.f117665a;
                        ProducerScope producerScope = this.f117666b;
                        synchronized (aVar) {
                            try {
                                if (!c24367k0.f117658a.m127445b()) {
                                    a aVar2 = c24367k0.f117658a;
                                    List m42531s6 = C7960e.m41971c6().m42531s6();
                                    AbstractC19074t.m100207e(m42531s6, "getListUsersSuggestTimelineTabOther(...)");
                                    aVar2.m127447d(m42531s6);
                                    c24367k0.f117658a.m127446c(true);
                                }
                                producerScope.mo112912p(new AbstractC24349b0.b(c24367k0.f117658a.m127444a()));
                            } finally {
                            }
                        }
                        return;
                    }
                    this.f117666b.mo112912p(AbstractC24349b0.a.f117475a);
                    C7960e.m41971c6().m42584xb();
                } catch (Exception unused) {
                    CoroutineScopeKt.m112638b(this.f117666b, new CancellationException("Access Local Database Error"));
                }
            }
        }

        /* renamed from: oo.k0$b$b */
        /* loaded from: classes4.dex */
        public static final class C32916b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32916b f117667q = new C32916b();

            C32916b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m127449a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m127449a() {
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f117663u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117662t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f117663u;
                C0824j.m2153b(new a(C24367k0.this, producerScope));
                C32916b c32916b = C32916b.f117667q;
                this.f117662t = 1;
                if (ProduceKt.m113184a(producerScope, c32916b, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((b) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.k0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ List f117669b;

        /* renamed from: c */
        final /* synthetic */ int f117670c;

        c(List list, int i11) {
            this.f117669b = list;
            this.f117670c = i11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                a aVar = C24367k0.this.f117658a;
                C24367k0 c24367k0 = C24367k0.this;
                List list = this.f117669b;
                synchronized (aVar) {
                    c24367k0.f117658a.m127447d(list);
                    c24367k0.f117658a.m127446c(true);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                C7960e.m41971c6().m42584xb();
                C7960e.m41971c6().m42212N8(this.f117669b);
                C24361h0 c24361h0 = C24361h0.f117593a;
                c24361h0.m127388k(C23793c.Companion.m124321a().mo124314i());
                c24361h0.m127387j(this.f117670c);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: h */
    public final boolean m127438h() {
        if (C23793c.Companion.m124321a().mo124314i() - C24361h0.f117593a.m127385d() > r2.m127384c() * 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final void m127439i(C24367k0 c24367k0) {
        AbstractC19074t.m100208f(c24367k0, "this$0");
        AbstractC0924m0.m4151qp(c24367k0.f117659b.get());
    }

    @Override // p398oo.InterfaceC24372n
    /* renamed from: a */
    public int mo127440a() {
        return this.f117659b.get();
    }

    @Override // p398oo.InterfaceC24372n
    /* renamed from: b */
    public void mo127441b(int i11) {
        AtomicInteger atomicInteger = this.f117659b;
        if (i11 < 0) {
            i11 = 0;
        }
        atomicInteger.set(i11);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: oo.j0
            public /* synthetic */ RunnableC24365j0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24367k0.m127439i(C24367k0.this);
            }
        });
    }

    @Override // p398oo.InterfaceC24372n
    /* renamed from: c */
    public Object mo127442c(List list, int i11, Continuation continuation) {
        C0824j.m2153b(new c(list, i11));
        return C24848g0.f119245a;
    }

    @Override // p398oo.InterfaceC24372n
    /* renamed from: d */
    public Object mo127443d(Continuation continuation) {
        return FlowKt.m113287e(new b(null));
    }
}
