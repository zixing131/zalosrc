package l50;

import am.AbstractC0924m0;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: l50.n */
/* loaded from: classes5.dex */
public final class C22092n extends AbstractC19377a {

    /* renamed from: a */
    private final C20304a f108752a;

    /* renamed from: l50.n$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final int f108753a;

        /* renamed from: b */
        private final String f108754b;

        public a(int i11, String str) {
            AbstractC19074t.m100208f(str, "uri");
            this.f108753a = i11;
            this.f108754b = str;
        }

        /* renamed from: a */
        public final int m115283a() {
            return this.f108753a;
        }

        /* renamed from: b */
        public final String m115284b() {
            return this.f108754b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f108753a == aVar.f108753a && AbstractC19074t.m100204b(this.f108754b, aVar.f108754b);
        }

        public int hashCode() {
            return (this.f108753a * 31) + this.f108754b.hashCode();
        }

        public String toString() {
            return "Param(type=" + this.f108753a + ", uri=" + this.f108754b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l50.n$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108755t;

        /* renamed from: u */
        private /* synthetic */ Object f108756u;

        /* renamed from: v */
        final /* synthetic */ a f108757v;

        /* renamed from: w */
        final /* synthetic */ C22092n f108758w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C22092n c22092n, Continuation continuation) {
            super(2, continuation);
            this.f108757v = aVar;
            this.f108758w = c22092n;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f108757v, this.f108758w, continuation);
            bVar.f108756u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00c5 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:16:0x0029, B:18:0x0035, B:19:0x00bd, B:21:0x00c5, B:25:0x003e, B:26:0x008f, B:29:0x0046, B:30:0x005f, B:32:0x007b, B:35:0x0092, B:37:0x00aa, B:39:0x00b2, B:44:0x0052), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            String str;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f108755t;
            try {
            } catch (Exception e11) {
                AbstractC24900c.a aVar = new AbstractC24900c.a(e11);
                this.f108756u = null;
                this.f108755t = 5;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            if (r12 != 4) {
                                if (r12 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                AbstractC24862s.m129228b(obj);
                            }
                            return C24848g0.f119245a;
                        }
                        flowCollector = (FlowCollector) this.f108756u;
                        AbstractC24862s.m129228b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            AbstractC0924m0.m3323Op(this.f108757v.m115283a());
                            AbstractC24900c.c cVar = new AbstractC24900c.c(AbstractC29094b.m145339a(true));
                            this.f108756u = flowCollector;
                            this.f108755t = 4;
                            if (flowCollector.mo12109b(cVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f108756u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f108756u;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f108756u = flowCollector;
                this.f108755t = 1;
                if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            AbstractC0924m0.m3526Vp(this.f108757v.m115284b());
            if (C20304a.m105972q(this.f108758w.f108752a, false, 1, null) != this.f108757v.m115283a()) {
                C20304a c20304a = this.f108758w.f108752a;
                int m115283a = this.f108757v.m115283a();
                RingtoneData m105995r = this.f108758w.f108752a.m105995r();
                if (m105995r == null || (str = m105995r.m58732d()) == null) {
                    str = "";
                }
                this.f108756u = flowCollector;
                this.f108755t = 3;
                obj = c20304a.mo105991k(m115283a, str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                if (((Boolean) obj).booleanValue()) {
                }
                return C24848g0.f119245a;
            }
            AbstractC24900c.c cVar2 = new AbstractC24900c.c(AbstractC29094b.m145339a(true));
            this.f108756u = flowCollector;
            this.f108755t = 2;
            if (flowCollector.mo12109b(cVar2, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C22092n(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C22092n(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108752a = c20304a;
    }
}
