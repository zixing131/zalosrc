package l50;

import am.AbstractC0924m0;
import bp0.AbstractC3082b0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import java.util.ArrayList;
import k50.C21478f;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import on0.AbstractC24341v;
import p185gc.AbstractC19379c;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.i */
/* loaded from: classes5.dex */
public final class C22087i extends AbstractC19379c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C20304a f108705a;

    /* renamed from: l50.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: l50.i$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108706t;

        /* renamed from: u */
        private /* synthetic */ Object f108707u;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f108707u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0011, B:14:0x0025, B:15:0x0057, B:16:0x007f, B:18:0x0085, B:22:0x0096, B:24:0x00ca, B:26:0x009a, B:29:0x00a2, B:31:0x00b6, B:34:0x00c7, B:40:0x00d0, B:44:0x0046), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e2 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            int m131511r;
            AbstractC24900c.c cVar;
            boolean m127128x;
            boolean z11;
            boolean z12;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f108706t;
            try {
            } catch (Exception e11) {
                AbstractC3082b0.m15424f("GetSystemRingtones", "get error with " + e11);
                e11.printStackTrace();
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.f108707u;
                    AbstractC24862s.m129228b(obj);
                    ArrayList<C21478f> arrayList = (ArrayList) obj;
                    arrayList.add(0, C22087i.this.f108705a.m105997v());
                    String m3713c7 = AbstractC0924m0.m3713c7();
                    int m3565X6 = AbstractC0924m0.m3565X6();
                    m131511r = AbstractC25370t.m131511r(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    for (C21478f c21478f : arrayList) {
                        if (c21478f.m103568a() == 1) {
                            if (m3565X6 == 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            c21478f.m111098f(z12);
                        } else if (c21478f.m103568a() == 2 && m3565X6 == 2) {
                            String uri = c21478f.m103570c().toString();
                            AbstractC19074t.m100207e(uri, "toString(...)");
                            m127128x = AbstractC24341v.m127128x(uri);
                            if ((!m127128x) && AbstractC19074t.m100204b(m3713c7, c21478f.m103570c().toString())) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21478f.m111098f(z11);
                        }
                        arrayList2.add(C24848g0.f119245a);
                    }
                    cVar = new AbstractC24900c.c((ArrayList) obj);
                    this.f108707u = null;
                    this.f108706t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f108707u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f108707u;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f108707u = flowCollector2;
                this.f108706t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            C20304a c20304a = C22087i.this.f108705a;
            this.f108707u = flowCollector;
            this.f108706t = 2;
            obj = c20304a.m105998w(this);
            if (obj == m142578e) {
                return m142578e;
            }
            ArrayList<C21478f> arrayList3 = (ArrayList) obj;
            arrayList3.add(0, C22087i.this.f108705a.m105997v());
            String m3713c72 = AbstractC0924m0.m3713c7();
            int m3565X62 = AbstractC0924m0.m3565X6();
            m131511r = AbstractC25370t.m131511r(arrayList3, 10);
            ArrayList arrayList22 = new ArrayList(m131511r);
            while (r6.hasNext()) {
            }
            cVar = new AbstractC24900c.c((ArrayList) obj);
            this.f108707u = null;
            this.f108706t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C22087i(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return FlowKt.m113265A(new b(null));
    }

    public C22087i(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108705a = c20304a;
    }
}
