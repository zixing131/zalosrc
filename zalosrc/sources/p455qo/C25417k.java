package p455qo;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import me0.C23055e5;
import p185gc.AbstractC19377a;
import p398oo.C24373n0;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.k */
/* loaded from: classes4.dex */
public final class C25417k extends AbstractC19377a {

    /* renamed from: qo.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final boolean f121675a;

        public a(boolean z11) {
            this.f121675a = z11;
        }

        /* renamed from: a */
        public final boolean m131668a() {
            return this.f121675a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f121675a == ((a) obj).f121675a;
        }

        public int hashCode() {
            return AbstractC2144f.m11520a(this.f121675a);
        }

        public String toString() {
            return "Param(isEnableZVideoSection=" + this.f121675a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121676t;

        /* renamed from: u */
        private /* synthetic */ Object f121677u;

        /* renamed from: v */
        final /* synthetic */ a f121678v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f121678v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f121678v, continuation);
            bVar.f121677u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
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
            int i11 = this.f121676t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3 && i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f121677u;
                    AbstractC24862s.m129228b(obj);
                    cVar = new AbstractC25468a.c(C24848g0.f119245a);
                    this.f121677u = null;
                    this.f121676t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f121677u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f121677u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f121677u = flowCollector2;
                this.f121676t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            if (C23055e5.m118272g(false)) {
                C24373n0 c24373n0 = C24373n0.f117718a;
                boolean m131668a = this.f121678v.m131668a();
                this.f121677u = flowCollector;
                this.f121676t = 2;
                if (c24373n0.m127487c(m131668a, this) == m142578e) {
                    return m142578e;
                }
                cVar = new AbstractC25468a.c(C24848g0.f119245a);
                this.f121677u = null;
                this.f121676t = 3;
                if (flowCollector.mo12109b(cVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            AbstractC25468a.a aVar = new AbstractC25468a.a(ExceptionNoNetwork.f46313p);
            this.f121677u = null;
            this.f121676t = 4;
            if (flowCollector.mo12109b(aVar, this) == m142578e) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.k$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f121679t;

        /* renamed from: u */
        private /* synthetic */ Object f121680u;

        /* renamed from: v */
        /* synthetic */ Object f121681v;

        c(Continuation continuation) {
            super(3, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121679t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f121680u;
                AbstractC20110a.f98889a.mo104552e((Throwable) this.f121681v);
                AbstractC25468a.a aVar = new AbstractC25468a.a(new Exception());
                this.f121680u = null;
                this.f121679t = 1;
                if (flowCollector.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f121680u = flowCollector;
            cVar.f121681v = th2;
            return cVar.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113288f(FlowKt.m113265A(new b(aVar, null)), new c(null));
    }
}
