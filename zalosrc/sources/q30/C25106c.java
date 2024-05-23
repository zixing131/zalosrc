package q30;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import me0.AbstractC23238v2;
import me0.C23055e5;
import p185gc.AbstractC19384h;
import p645xh.C29628e;
import p716zh.C32123ta;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q30.C25105b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: q30.c */
/* loaded from: classes5.dex */
public final class C25106c extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC24854k f120602a;

    /* renamed from: q30.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends Enum {

        /* renamed from: p */
        public static final a f120603p = new a("ERR_NO_SD_CARD", 0);

        /* renamed from: q */
        public static final a f120604q = new a("ERR_SD_CARD_FULL", 1);

        /* renamed from: r */
        public static final a f120605r = new a("ERR_SAVE", 2);

        /* renamed from: s */
        public static final a f120606s = new a("ERR_NO_NETWORK", 3);

        /* renamed from: t */
        private static final /* synthetic */ a[] f120607t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f120608u;

        static {
            a[] m130193b = m130193b();
            f120607t = m130193b;
            f120608u = AbstractC30166b.m148796a(m130193b);
        }

        private a(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m130193b() {
            return new a[]{f120603p, f120604q, f120605r, f120606s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f120607t.clone();
        }
    }

    /* renamed from: q30.c$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final C32123ta f120609a;

        /* renamed from: b */
        private final boolean f120610b;

        public b(C32123ta c32123ta, boolean z11) {
            this.f120609a = c32123ta;
            this.f120610b = z11;
        }

        /* renamed from: a */
        public final C32123ta m130194a() {
            return this.f120609a;
        }

        /* renamed from: b */
        public final boolean m130195b() {
            return this.f120610b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f120609a, bVar.f120609a) && this.f120610b == bVar.f120610b;
        }

        public int hashCode() {
            C32123ta c32123ta = this.f120609a;
            return ((c32123ta == null ? 0 : c32123ta.hashCode()) * 31) + AbstractC2144f.m11520a(this.f120610b);
        }

        public String toString() {
            return "Param(storyItem=" + this.f120609a + ", isSaveToGallery=" + this.f120610b + ")";
        }
    }

    /* renamed from: q30.c$c */
    /* loaded from: classes5.dex */
    public static abstract class c {

        /* renamed from: q30.c$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends c {

            /* renamed from: a */
            private final a f120611a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a aVar) {
                super(null);
                AbstractC19074t.m100208f(aVar, "errorType");
                this.f120611a = aVar;
            }

            /* renamed from: a */
            public final a m130196a() {
                return this.f120611a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f120611a == ((a) obj).f120611a;
            }

            public int hashCode() {
                return this.f120611a.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.f120611a + ")";
            }
        }

        /* renamed from: q30.c$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends c {

            /* renamed from: a */
            private final long f120612a;

            public b(long j11) {
                super(null);
                this.f120612a = j11;
            }

            /* renamed from: a */
            public final long m130197a() {
                return this.f120612a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f120612a == ((b) obj).f120612a;
            }

            public int hashCode() {
                return AbstractC2147g0.m11521a(this.f120612a);
            }

            public String toString() {
                return "Loading(progress=" + this.f120612a + ")";
            }
        }

        /* renamed from: q30.c$c$c */
        /* loaded from: classes5.dex */
        public static final class C32944c extends c {

            /* renamed from: a */
            private final String f120613a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32944c(String str) {
                super(null);
                AbstractC19074t.m100208f(str, "savedPath");
                this.f120613a = str;
            }

            /* renamed from: a */
            public final String m130198a() {
                return this.f120613a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32944c) && AbstractC19074t.m100204b(this.f120613a, ((C32944c) obj).f120613a);
            }

            public int hashCode() {
                return this.f120613a.hashCode();
            }

            public String toString() {
                return "Success(savedPath=" + this.f120613a + ")";
            }
        }

        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q30.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f120614q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25105b mo12V4() {
            return new C25105b();
        }
    }

    /* renamed from: q30.c$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120615t;

        /* renamed from: u */
        private /* synthetic */ Object f120616u;

        /* renamed from: w */
        final /* synthetic */ b f120618w;

        /* renamed from: q30.c$e$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f120619p;

            a(FlowCollector flowCollector) {
                this.f120619p = flowCollector;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C25105b.d dVar, Continuation continuation) {
                Object m142578e;
                Object m142578e2;
                Object m142578e3;
                if (dVar instanceof C25105b.b) {
                    Object mo12109b = this.f120619p.mo12109b(new c.b(((C25105b.b) dVar).m130186a()), continuation);
                    m142578e3 = AbstractC28298d.m142578e();
                    if (mo12109b == m142578e3) {
                        return mo12109b;
                    }
                    return C24848g0.f119245a;
                }
                if (dVar instanceof C25105b.a) {
                    C25105b.a aVar = (C25105b.a) dVar;
                    String m130184a = aVar.m130184a();
                    if (m130184a != null && m130184a.length() != 0) {
                        Object mo12109b2 = this.f120619p.mo12109b(new c.C32944c(aVar.m130184a()), continuation);
                        m142578e2 = AbstractC28298d.m142578e();
                        if (mo12109b2 == m142578e2) {
                            return mo12109b2;
                        }
                        return C24848g0.f119245a;
                    }
                    if (aVar.m130185b() == -1 || aVar.m130185b() == 1) {
                        Object mo12109b3 = this.f120619p.mo12109b(new c.a(a.f120605r), continuation);
                        m142578e = AbstractC28298d.m142578e();
                        if (mo12109b3 == m142578e) {
                            return mo12109b3;
                        }
                        return C24848g0.f119245a;
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f120618w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(this.f120618w, continuation);
            eVar.f120616u = obj;
            return eVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00b0  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            Flow flow;
            m142578e = AbstractC28298d.m142578e();
            switch (this.f120615t) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.f120616u;
                    if (!AbstractC23238v2.m119727l()) {
                        c.a aVar = new c.a(a.f120603p);
                        this.f120615t = 1;
                        if (flowCollector2.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                    } else if (!AbstractC23238v2.m119726k()) {
                        c.a aVar2 = new c.a(a.f120604q);
                        this.f120615t = 2;
                        if (flowCollector2.mo12109b(aVar2, this) == m142578e) {
                            return m142578e;
                        }
                    } else if (C23055e5.m118273h(false, 1, null) && C29628e.m147249E0().m93432x()) {
                        c.b bVar = new c.b(0L);
                        this.f120616u = flowCollector2;
                        this.f120615t = 4;
                        if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                            return m142578e;
                        }
                        flowCollector = flowCollector2;
                        this.f120616u = flowCollector;
                        this.f120615t = 5;
                        if (DelayKt.m112666b(500L, this) == m142578e) {
                            return m142578e;
                        }
                        flow = (Flow) C25106c.this.m130191d().m101509a(new C25105b.c(this.f120618w.m130194a(), this.f120618w.m130195b()));
                        if (flow != null) {
                            a aVar3 = new a(flowCollector);
                            this.f120616u = null;
                            this.f120615t = 6;
                            if (flow.mo97893a(aVar3, this) == m142578e) {
                                return m142578e;
                            }
                        }
                    } else {
                        c.a aVar4 = new c.a(a.f120606s);
                        this.f120615t = 3;
                        if (flowCollector2.mo12109b(aVar4, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                case 1:
                case 2:
                case 3:
                case 6:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 4:
                    flowCollector = (FlowCollector) this.f120616u;
                    AbstractC24862s.m129228b(obj);
                    this.f120616u = flowCollector;
                    this.f120615t = 5;
                    if (DelayKt.m112666b(500L, this) == m142578e) {
                    }
                    flow = (Flow) C25106c.this.m130191d().m101509a(new C25105b.c(this.f120618w.m130194a(), this.f120618w.m130195b()));
                    if (flow != null) {
                    }
                    return C24848g0.f119245a;
                case 5:
                    flowCollector = (FlowCollector) this.f120616u;
                    AbstractC24862s.m129228b(obj);
                    flow = (Flow) C25106c.this.m130191d().m101509a(new C25105b.c(this.f120618w.m130194a(), this.f120618w.m130195b()));
                    if (flow != null) {
                    }
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((e) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25106c() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(d.f120614q);
        this.f120602a = m129210a;
    }

    /* renamed from: d */
    public final C25105b m130191d() {
        return (C25105b) this.f120602a.getValue();
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: e */
    public Flow mo13388b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        return FlowKt.m113265A(new e(bVar, null));
    }
}
