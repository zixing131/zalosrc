package q30;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import on0.AbstractC24341v;
import p185gc.AbstractC19384h;
import p716zh.C32123ta;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q30.C25106c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: q30.d */
/* loaded from: classes5.dex */
public final class C25107d extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC24854k f120620a;

    /* renamed from: b */
    private final InterfaceC24854k f120621b;

    /* renamed from: q30.d$a */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: q30.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32945a extends a {

            /* renamed from: a */
            private final C25106c.a f120622a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32945a(C25106c.a aVar) {
                super(null);
                AbstractC19074t.m100208f(aVar, "errorType");
                this.f120622a = aVar;
            }

            /* renamed from: a */
            public final C25106c.a m130207a() {
                return this.f120622a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32945a) && this.f120622a == ((C32945a) obj).f120622a;
            }

            public int hashCode() {
                return this.f120622a.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.f120622a + ")";
            }
        }

        /* renamed from: q30.d$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends a {

            /* renamed from: a */
            public static final b f120623a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: q30.d$a$c */
        /* loaded from: classes5.dex */
        public static final class c extends a {

            /* renamed from: a */
            private final String f120624a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(null);
                AbstractC19074t.m100208f(str, "savedPath");
                this.f120624a = str;
            }

            /* renamed from: a */
            public final String m130208a() {
                return this.f120624a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC19074t.m100204b(this.f120624a, ((c) obj).f120624a);
            }

            public int hashCode() {
                return this.f120624a.hashCode();
            }

            public String toString() {
                return "Success(savedPath=" + this.f120624a + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: q30.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f120625q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25104a mo12V4() {
            return new C25104a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q30.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120626t;

        /* renamed from: u */
        private /* synthetic */ Object f120627u;

        /* renamed from: w */
        final /* synthetic */ C32123ta f120629w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q30.d$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f120630p;

            /* renamed from: q */
            final /* synthetic */ C25107d f120631q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: q30.d$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32946a extends AbstractC29096d {

                /* renamed from: s */
                Object f120632s;

                /* renamed from: t */
                /* synthetic */ Object f120633t;

                /* renamed from: v */
                int f120635v;

                C32946a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f120633t = obj;
                    this.f120635v |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            a(FlowCollector flowCollector, C25107d c25107d) {
                this.f120630p = flowCollector;
                this.f120631q = c25107d;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00de A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(C25106c.c cVar, Continuation continuation) {
                C32946a c32946a;
                Object m142578e;
                boolean m127128x;
                a aVar;
                String str;
                FlowCollector flowCollector;
                a.C32945a c32945a;
                if (continuation instanceof C32946a) {
                    c32946a = (C32946a) continuation;
                    int i11 = c32946a.f120635v;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c32946a.f120635v = i11 - Integer.MIN_VALUE;
                        Object obj = c32946a.f120633t;
                        m142578e = AbstractC28298d.m142578e();
                        switch (c32946a.f120635v) {
                            case 0:
                                AbstractC24862s.m129228b(obj);
                                if (cVar instanceof C25106c.c.b) {
                                    FlowCollector flowCollector2 = this.f120630p;
                                    a.b bVar = a.b.f120623a;
                                    c32946a.f120635v = 1;
                                    if (flowCollector2.mo12109b(bVar, c32946a) == m142578e) {
                                        return m142578e;
                                    }
                                    return C24848g0.f119245a;
                                }
                                if (cVar instanceof C25106c.c.a) {
                                    FlowCollector flowCollector3 = this.f120630p;
                                    a.C32945a c32945a2 = new a.C32945a(((C25106c.c.a) cVar).m130196a());
                                    c32946a.f120635v = 2;
                                    if (flowCollector3.mo12109b(c32945a2, c32946a) == m142578e) {
                                        return m142578e;
                                    }
                                    return C24848g0.f119245a;
                                }
                                if (cVar instanceof C25106c.c.C32944c) {
                                    C25106c.c.C32944c c32944c = (C25106c.c.C32944c) cVar;
                                    m127128x = AbstractC24341v.m127128x(c32944c.m130198a());
                                    if (!m127128x) {
                                        C25104a m130204e = this.f120631q.m130204e();
                                        String m130198a = c32944c.m130198a();
                                        c32946a.f120632s = this;
                                        c32946a.f120635v = 3;
                                        obj = m130204e.m101498a(m130198a, c32946a);
                                        if (obj == m142578e) {
                                            return m142578e;
                                        }
                                        aVar = this;
                                        str = (String) obj;
                                        if (str == null && str.length() != 0) {
                                            FlowCollector flowCollector4 = aVar.f120630p;
                                            a.c cVar2 = new a.c(str);
                                            c32946a.f120632s = null;
                                            c32946a.f120635v = 4;
                                            if (flowCollector4.mo12109b(cVar2, c32946a) == m142578e) {
                                                return m142578e;
                                            }
                                            return C24848g0.f119245a;
                                        }
                                        flowCollector = aVar.f120630p;
                                        c32945a = new a.C32945a(C25106c.a.f120605r);
                                        c32946a.f120632s = null;
                                        c32946a.f120635v = 5;
                                        if (flowCollector.mo12109b(c32945a, c32946a) == m142578e) {
                                            return m142578e;
                                        }
                                        return C24848g0.f119245a;
                                    }
                                    FlowCollector flowCollector5 = this.f120630p;
                                    a.C32945a c32945a3 = new a.C32945a(C25106c.a.f120605r);
                                    c32946a.f120635v = 6;
                                    if (flowCollector5.mo12109b(c32945a3, c32946a) == m142578e) {
                                        return m142578e;
                                    }
                                    return C24848g0.f119245a;
                                }
                                return C24848g0.f119245a;
                            case 1:
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            case 2:
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            case 3:
                                aVar = (a) c32946a.f120632s;
                                AbstractC24862s.m129228b(obj);
                                str = (String) obj;
                                if (str == null) {
                                    break;
                                }
                                flowCollector = aVar.f120630p;
                                c32945a = new a.C32945a(C25106c.a.f120605r);
                                c32946a.f120632s = null;
                                c32946a.f120635v = 5;
                                if (flowCollector.mo12109b(c32945a, c32946a) == m142578e) {
                                }
                                return C24848g0.f119245a;
                            case 4:
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            case 5:
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            case 6:
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                c32946a = new C32946a(continuation);
                Object obj2 = c32946a.f120633t;
                m142578e = AbstractC28298d.m142578e();
                switch (c32946a.f120635v) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C32123ta c32123ta, Continuation continuation) {
            super(2, continuation);
            this.f120629w = c32123ta;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f120629w, continuation);
            cVar.f120627u = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f120626t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f120627u;
                Flow flow = (Flow) C25107d.this.m130205f().m101509a(new C25106c.b(this.f120629w, true));
                if (flow != null) {
                    a aVar = new a(flowCollector, C25107d.this);
                    this.f120626t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: q30.d$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f120636q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25106c mo12V4() {
            return new C25106c();
        }
    }

    public C25107d() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f120636q);
        this.f120620a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f120625q);
        this.f120621b = m129210a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final C25104a m130204e() {
        return (C25104a) this.f120621b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final C25106c m130205f() {
        return (C25106c) this.f120620a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(C32123ta c32123ta) {
        return FlowKt.m113265A(new c(c32123ta, null));
    }
}
