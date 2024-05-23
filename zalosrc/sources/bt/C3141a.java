package bt;

import androidx.work.AbstractC2144f;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p458qr.AbstractC25468a;
import p727zs.C32551a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: bt.a */
/* loaded from: classes4.dex */
public final class C3141a extends AbstractC19377a {

    /* renamed from: a */
    private final C32551a f13248a;

    /* renamed from: bt.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f13249a;

        /* renamed from: b */
        private final int f13250b;

        /* renamed from: c */
        private final boolean f13251c;

        public a(String str, int i11, boolean z11) {
            AbstractC19074t.m100208f(str, "groupId");
            this.f13249a = str;
            this.f13250b = i11;
            this.f13251c = z11;
        }

        /* renamed from: a */
        public final String m15811a() {
            return this.f13249a;
        }

        /* renamed from: b */
        public final int m15812b() {
            return this.f13250b;
        }

        /* renamed from: c */
        public final boolean m15813c() {
            return this.f13251c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f13249a, aVar.f13249a) && this.f13250b == aVar.f13250b && this.f13251c == aVar.f13251c;
        }

        public int hashCode() {
            return (((this.f13249a.hashCode() * 31) + this.f13250b) * 31) + AbstractC2144f.m11520a(this.f13251c);
        }

        public String toString() {
            return "Param(groupId=" + this.f13249a + ", settingId=" + this.f13250b + ", isChecked=" + this.f13251c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bt.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f13252t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f13252t == 0) {
                AbstractC24862s.m129228b(obj);
                new AbstractC25468a.a(new IllegalArgumentException("Invalid Setting Id"));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bt.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f13253t;

        /* renamed from: u */
        private /* synthetic */ Object f13254u;

        /* renamed from: w */
        final /* synthetic */ a f13256w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f13256w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f13256w, continuation);
            cVar.f13254u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f13253t;
            try {
            } catch (Exception e11) {
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f13254u = null;
                this.f13253t = 4;
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
                    flowCollector = (FlowCollector) this.f13254u;
                    AbstractC24862s.m129228b(obj);
                    cVar = new AbstractC25468a.c(obj);
                    this.f13254u = flowCollector;
                    this.f13253t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f13254u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f13254u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f13254u = flowCollector2;
                this.f13253t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            Flow m157626a = C3141a.this.f13248a.m157626a(this.f13256w.m15811a(), this.f13256w.m15812b(), this.f13256w.m15813c());
            this.f13254u = flowCollector;
            this.f13253t = 2;
            obj = FlowKt.m113304v(m157626a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            cVar = new AbstractC25468a.c(obj);
            this.f13254u = flowCollector;
            this.f13253t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C3141a(C32551a c32551a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? (C32551a) C32551a.Companion.m122672a() : c32551a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        if (aVar.m15812b() < 0) {
            return FlowKt.m113265A(new b(null));
        }
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C3141a(C32551a c32551a) {
        AbstractC19074t.m100208f(c32551a, "repo");
        this.f13248a = c32551a;
    }
}
