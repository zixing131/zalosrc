package p083cq;

import aq.C2288h;
import bg0.C2797c;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p040bq.InterfaceC3115a;
import p083cq.C17562i;
import p185gc.AbstractC19381e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: cq.i */
/* loaded from: classes4.dex */
public final class C17562i extends AbstractC19381e {

    /* renamed from: a */
    private final C2288h f89459a;

    /* renamed from: b */
    private final C2797c f89460b;

    /* renamed from: cq.i$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: cq.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32798a extends a {

            /* renamed from: a */
            private final C20096c f89461a;

            public C32798a(C20096c c20096c) {
                super(null);
                this.f89461a = c20096c;
            }

            /* renamed from: a */
            public final C20096c m93517a() {
                return this.f89461a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32798a) && AbstractC19074t.m100204b(this.f89461a, ((C32798a) obj).f89461a);
            }

            public int hashCode() {
                C20096c c20096c = this.f89461a;
                if (c20096c == null) {
                    return 0;
                }
                return c20096c.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f89461a + ")";
            }
        }

        /* renamed from: cq.i$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a */
            private final List f89462a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(null);
                AbstractC19074t.m100208f(list, "result");
                this.f89462a = list;
            }

            /* renamed from: a */
            public final List m93518a() {
                return this.f89462a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC19074t.m100204b(this.f89462a, ((b) obj).f89462a);
            }

            public int hashCode() {
                return this.f89462a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f89462a + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cq.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f89463t;

        /* renamed from: u */
        private /* synthetic */ Object f89464u;

        /* renamed from: cq.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3115a {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f89466a;

            a(ProducerScope producerScope) {
                this.f89466a = producerScope;
            }

            @Override // p040bq.InterfaceC3115a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List list) {
                AbstractC19074t.m100208f(list, "data");
                this.f89466a.mo112912p(new a.b(list));
            }

            @Override // p040bq.InterfaceC3115a
            /* renamed from: b */
            public void mo15734b(C20096c c20096c) {
                this.f89466a.mo112912p(new a.C32798a(c20096c));
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m93520t(C17562i c17562i, ProducerScope producerScope) {
            c17562i.f89459a.m12128t(new a(producerScope));
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f89464u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f89463t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                final ProducerScope producerScope = (ProducerScope) this.f89464u;
                C2797c c2797c = C17562i.this.f89460b;
                final C17562i c17562i = C17562i.this;
                c2797c.mo13474a(new Runnable() { // from class: cq.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17562i.b.m93520t(C17562i.this, producerScope);
                    }
                });
                this.f89463t = 1;
                if (ProduceKt.m113185b(producerScope, null, this, 1, null) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((b) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C17562i(C2288h c2288h, C2797c c2797c) {
        AbstractC19074t.m100208f(c2288h, "repository");
        AbstractC19074t.m100208f(c2797c, "serialTaskDispatcher");
        this.f89459a = c2288h;
        this.f89460b = c2797c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19381e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Flow mo93498b() {
        return FlowKt.m113287e(new b(null));
    }
}
