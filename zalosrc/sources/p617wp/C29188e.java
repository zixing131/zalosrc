package p617wp;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p458qr.AbstractC25468a;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p582vp.C28567c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: wp.e */
/* loaded from: classes4.dex */
public final class C29188e extends AbstractC19377a {

    /* renamed from: a */
    private final C28567c f135223a;

    /* renamed from: b */
    private final InterfaceC26357f f135224b;

    /* renamed from: wp.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f135225a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "userId");
            this.f135225a = str;
        }

        /* renamed from: a */
        public final String m145722a() {
            return this.f135225a;
        }
    }

    /* renamed from: wp.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ a f135226q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f135226q = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start executing use case: " + this.f135226q;
        }
    }

    /* renamed from: wp.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f135227t;

        /* renamed from: u */
        private /* synthetic */ Object f135228u;

        /* renamed from: w */
        final /* synthetic */ a f135230w;

        /* renamed from: wp.e$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f135231q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Emitting state loading";
            }
        }

        /* renamed from: wp.e$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ boolean f135232q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11) {
                super(0);
                this.f135232q = z11;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed success. Emitting result: " + this.f135232q;
            }
        }

        /* renamed from: wp.e$c$c */
        /* loaded from: classes4.dex */
        public static final class C33045c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Exception f135233q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33045c(Exception exc) {
                super(0);
                this.f135233q = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed fail. Emitting error: " + this.f135233q;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f135230w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f135230w, continuation);
            cVar.f135228u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00cf A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            List m131187O0;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f135227t;
            try {
            } catch (Exception e11) {
                C29188e.this.f135224b.mo135685a("SETTING_INLINE", "USE_CASE_UNFOLLOW_NEW_FEED_NOTIFICATION", new C33045c(e11));
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f135228u = null;
                this.f135227t = 4;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            if (r12 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f135228u;
                    AbstractC24862s.m129228b(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    C29188e.this.f135224b.mo135685a("SETTING_INLINE", "USE_CASE_UNFOLLOW_NEW_FEED_NOTIFICATION", new b(booleanValue));
                    cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue));
                    this.f135228u = flowCollector;
                    this.f135227t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f135228u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f135228u;
                C29188e.this.f135224b.mo135685a("SETTING_INLINE", "USE_CASE_UNFOLLOW_NEW_FEED_NOTIFICATION", a.f135231q);
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f135228u = flowCollector2;
                this.f135227t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            String m145722a = this.f135230w.m145722a();
            int m142982e = C29188e.this.f135223a.m142982e();
            m131187O0 = AbstractC25332a0.m131187O0(C29188e.this.f135223a.m142981d());
            if (m142982e != 1) {
                if (m142982e == 2 && !m131187O0.contains(m145722a)) {
                    m131187O0.add(m145722a);
                }
            } else {
                m131187O0.clear();
                m131187O0.add(m145722a);
                m142982e = 2;
            }
            C28567c c28567c = C29188e.this.f135223a;
            this.f135228u = flowCollector;
            this.f135227t = 2;
            obj = c28567c.m142985h(m142982e, m131187O0, this);
            if (obj == m142578e) {
                return m142578e;
            }
            boolean booleanValue2 = ((Boolean) obj).booleanValue();
            C29188e.this.f135224b.mo135685a("SETTING_INLINE", "USE_CASE_UNFOLLOW_NEW_FEED_NOTIFICATION", new b(booleanValue2));
            cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue2));
            this.f135228u = flowCollector;
            this.f135227t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C29188e(C28567c c28567c, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C28567c.a.m142987c(C28567c.Companion, null, null, null, 7, null) : c28567c, (i11 & 2) != 0 ? C26359h.f125209a : interfaceC26357f);
    }

    @Override // p185gc.AbstractC19377a
    /* renamed from: e */
    public Object mo451b(a aVar, Continuation continuation) {
        this.f135224b.mo135685a("SETTING_INLINE", "USE_CASE_UNFOLLOW_NEW_FEED_NOTIFICATION", new b(aVar));
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C29188e(C28567c c28567c, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c28567c, "repository");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f135223a = c28567c;
        this.f135224b = interfaceC26357f;
    }
}
