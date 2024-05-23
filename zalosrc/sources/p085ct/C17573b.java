package p085ct;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import bt.C3141a;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p458qr.AbstractC25468a;
import p534u1.AbstractC26941a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: ct.b */
/* loaded from: classes4.dex */
public final class C17573b extends AbstractC19963b {

    /* renamed from: t */
    private final CoroutineDispatcher f89520t;

    /* renamed from: u */
    private final C1761c0 f89521u;

    /* renamed from: v */
    private final C1761c0 f89522v;

    /* renamed from: w */
    private final InterfaceC24854k f89523w;

    /* renamed from: ct.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            if (cls.isAssignableFrom(C17573b.class)) {
                return new C17573b(null, 1, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }
    }

    /* renamed from: ct.b$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f89524t;

        /* renamed from: v */
        final /* synthetic */ String f89526v;

        /* renamed from: w */
        final /* synthetic */ int f89527w;

        /* renamed from: x */
        final /* synthetic */ boolean f89528x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ct.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C17573b f89529p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: ct.b$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C32801a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f89530t;

                /* renamed from: u */
                final /* synthetic */ C17573b f89531u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32801a(C17573b c17573b, Continuation continuation) {
                    super(2, continuation);
                    this.f89531u = c17573b;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32801a(this.f89531u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f89530t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f89531u.f89521u.mo9224q(new C19964c(AbstractC29094b.m145339a(true)));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32801a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: ct.b$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C32802b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f89532t;

                /* renamed from: u */
                final /* synthetic */ C17573b f89533u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32802b(C17573b c17573b, Continuation continuation) {
                    super(2, continuation);
                    this.f89533u = c17573b;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32802b(this.f89533u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f89532t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f89533u.f89521u.mo9224q(new C19964c(AbstractC29094b.m145339a(false)));
                        C1761c0 c1761c0 = this.f89533u.f89522v;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        c1761c0.mo9224q(new C19964c(c24848g0));
                        return c24848g0;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32802b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C17573b c17573b) {
                this.f89529p = c17573b;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                Object m142578e;
                Object m142578e2;
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    Object m112534g = BuildersKt.m112534g(this.f89529p.f89520t, new C32801a(this.f89529p, null), continuation);
                    m142578e2 = AbstractC28298d.m142578e();
                    if (m112534g == m142578e2) {
                        return m112534g;
                    }
                    return C24848g0.f119245a;
                }
                if ((abstractC25468a instanceof AbstractC25468a.c) || (abstractC25468a instanceof AbstractC25468a.a)) {
                    Object m112534g2 = BuildersKt.m112534g(this.f89529p.f89520t, new C32802b(this.f89529p, null), continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (m112534g2 == m142578e) {
                        return m112534g2;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i11, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f89526v = str;
            this.f89527w = i11;
            this.f89528x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f89526v, this.f89527w, this.f89528x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f89524t;
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
                C3141a m93585U = C17573b.this.m93585U();
                C3141a.a aVar = new C3141a.a(this.f89526v, this.f89527w, this.f89528x);
                this.f89524t = 1;
                obj = m93585U.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C17573b.this);
                this.f89524t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ct.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f89534q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3141a mo12V4() {
            return new C3141a(null, 1, null);
        }
    }

    public C17573b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final C3141a m93585U() {
        return (C3141a) this.f89523w.getValue();
    }

    /* renamed from: S */
    public final LiveData m93586S() {
        return this.f89521u;
    }

    /* renamed from: T */
    public final LiveData m93587T() {
        return this.f89522v;
    }

    /* renamed from: V */
    public final void m93588V(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "groupID");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new b(str, i11, z11, null), 2, null);
    }

    public /* synthetic */ C17573b(CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Dispatchers.m112681c() : coroutineDispatcher);
    }

    public C17573b(CoroutineDispatcher coroutineDispatcher) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(coroutineDispatcher, "mainDispatcher");
        this.f89520t = coroutineDispatcher;
        this.f89521u = new C1761c0();
        this.f89522v = new C1761c0();
        m129210a = AbstractC24856m.m129210a(c.f89534q);
        this.f89523w = m129210a;
    }
}
