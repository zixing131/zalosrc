package androidx.lifecycle;

import androidx.lifecycle.AbstractC1777k;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: androidx.lifecycle.k */
/* loaded from: classes2.dex */
public abstract class AbstractC1777k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.k$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f7332t;

        /* renamed from: u */
        int f7333u;

        /* renamed from: v */
        private /* synthetic */ Object f7334v;

        /* renamed from: w */
        final /* synthetic */ LiveData f7335w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.lifecycle.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C32631a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f7336t;

            /* renamed from: u */
            final /* synthetic */ LiveData f7337u;

            /* renamed from: v */
            final /* synthetic */ InterfaceC1764d0 f7338v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32631a(LiveData liveData, InterfaceC1764d0 interfaceC1764d0, Continuation continuation) {
                super(2, continuation);
                this.f7337u = liveData;
                this.f7338v = interfaceC1764d0;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32631a(this.f7337u, this.f7338v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f7336t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f7337u.m9220k(this.f7338v);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32631a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.lifecycle.k$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ LiveData f7339q;

            /* renamed from: r */
            final /* synthetic */ InterfaceC1764d0 f7340r;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.lifecycle.k$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C32632a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f7341t;

                /* renamed from: u */
                final /* synthetic */ LiveData f7342u;

                /* renamed from: v */
                final /* synthetic */ InterfaceC1764d0 f7343v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32632a(LiveData liveData, InterfaceC1764d0 interfaceC1764d0, Continuation continuation) {
                    super(2, continuation);
                    this.f7342u = liveData;
                    this.f7343v = interfaceC1764d0;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32632a(this.f7342u, this.f7343v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f7341t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f7342u.mo9222o(this.f7343v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32632a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LiveData liveData, InterfaceC1764d0 interfaceC1764d0) {
                super(0);
                this.f7339q = liveData;
                this.f7340r = interfaceC1764d0;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m9313a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m9313a() {
                BuildersKt__Builders_commonKt.m112540d(GlobalScope.f105887p, Dispatchers.m112681c().mo112861G0(), null, new C32632a(this.f7339q, this.f7340r, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData liveData, Continuation continuation) {
            super(2, continuation);
            this.f7335w = liveData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m9310t(ProducerScope producerScope, Object obj) {
            producerScope.mo112912p(obj);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f7335w, continuation);
            aVar.f7334v = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            InterfaceC1764d0 interfaceC1764d0;
            ProducerScope producerScope;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f7333u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1764d0 = (InterfaceC1764d0) this.f7332t;
                producerScope = (ProducerScope) this.f7334v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                final ProducerScope producerScope2 = (ProducerScope) this.f7334v;
                interfaceC1764d0 = new InterfaceC1764d0() { // from class: androidx.lifecycle.j
                    @Override // androidx.lifecycle.InterfaceC1764d0
                    /* renamed from: qp */
                    public final void mo8524qp(Object obj2) {
                        AbstractC1777k.a.m9310t(ProducerScope.this, obj2);
                    }
                };
                MainCoroutineDispatcher mo112861G0 = Dispatchers.m112681c().mo112861G0();
                C32631a c32631a = new C32631a(this.f7335w, interfaceC1764d0, null);
                this.f7334v = producerScope2;
                this.f7332t = interfaceC1764d0;
                this.f7333u = 1;
                if (BuildersKt.m112534g(mo112861G0, c32631a, this) == m142578e) {
                    return m142578e;
                }
                producerScope = producerScope2;
            }
            b bVar = new b(this.f7335w, interfaceC1764d0);
            this.f7334v = null;
            this.f7332t = null;
            this.f7333u = 2;
            if (ProduceKt.m113184a(producerScope, bVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((a) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final Flow m9308a(LiveData liveData) {
        AbstractC19074t.m100208f(liveData, "<this>");
        return FlowKt.m113294l(FlowKt.m113287e(new a(liveData, null)));
    }
}
