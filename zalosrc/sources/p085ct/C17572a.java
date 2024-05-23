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

/* renamed from: ct.a */
/* loaded from: classes4.dex */
public final class C17572a extends AbstractC19963b {

    /* renamed from: t */
    private final CoroutineDispatcher f89506t;

    /* renamed from: u */
    private final C1761c0 f89507u;

    /* renamed from: v */
    private final InterfaceC24854k f89508v;

    /* renamed from: ct.a$a */
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
            if (cls.isAssignableFrom(C17572a.class)) {
                return new C17572a(null, 1, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }
    }

    /* renamed from: ct.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f89509t;

        /* renamed from: v */
        final /* synthetic */ String f89511v;

        /* renamed from: w */
        final /* synthetic */ int f89512w;

        /* renamed from: x */
        final /* synthetic */ boolean f89513x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ct.a$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C17572a f89514p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: ct.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C32799a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f89515t;

                /* renamed from: u */
                final /* synthetic */ C17572a f89516u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32799a(C17572a c17572a, Continuation continuation) {
                    super(2, continuation);
                    this.f89516u = c17572a;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32799a(this.f89516u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f89515t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f89516u.f89507u.mo9224q(new C19964c(AbstractC29094b.m145339a(true)));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32799a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: ct.a$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C32800b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f89517t;

                /* renamed from: u */
                final /* synthetic */ C17572a f89518u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32800b(C17572a c17572a, Continuation continuation) {
                    super(2, continuation);
                    this.f89518u = c17572a;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32800b(this.f89518u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f89517t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f89518u.f89507u.mo9224q(new C19964c(AbstractC29094b.m145339a(false)));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32800b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C17572a c17572a) {
                this.f89514p = c17572a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                Object m142578e;
                Object m142578e2;
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    Object m112534g = BuildersKt.m112534g(this.f89514p.f89506t, new C32799a(this.f89514p, null), continuation);
                    m142578e2 = AbstractC28298d.m142578e();
                    if (m112534g == m142578e2) {
                        return m112534g;
                    }
                    return C24848g0.f119245a;
                }
                if ((abstractC25468a instanceof AbstractC25468a.c) || (abstractC25468a instanceof AbstractC25468a.a)) {
                    Object m112534g2 = BuildersKt.m112534g(this.f89514p.f89506t, new C32800b(this.f89514p, null), continuation);
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
            this.f89511v = str;
            this.f89512w = i11;
            this.f89513x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f89511v, this.f89512w, this.f89513x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f89509t;
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
                C3141a m93573S = C17572a.this.m93573S();
                C3141a.a aVar = new C3141a.a(this.f89511v, this.f89512w, this.f89513x);
                this.f89509t = 1;
                obj = m93573S.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C17572a.this);
                this.f89509t = 2;
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

    /* renamed from: ct.a$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f89519q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3141a mo12V4() {
            return new C3141a(null, 1, null);
        }
    }

    public C17572a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final C3141a m93573S() {
        return (C3141a) this.f89508v.getValue();
    }

    /* renamed from: R */
    public final LiveData m93574R() {
        return this.f89507u;
    }

    /* renamed from: T */
    public final void m93575T(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "groupID");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new b(str, i11, z11, null), 2, null);
    }

    public /* synthetic */ C17572a(CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Dispatchers.m112681c() : coroutineDispatcher);
    }

    public C17572a(CoroutineDispatcher coroutineDispatcher) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(coroutineDispatcher, "mainDispatcher");
        this.f89506t = coroutineDispatcher;
        this.f89507u = new C1761c0();
        m129210a = AbstractC24856m.m129210a(c.f89519q);
        this.f89508v = m129210a;
    }
}
