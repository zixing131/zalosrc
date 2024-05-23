package r10;

import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import e10.InterfaceC18170g;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19384h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: r10.d */
/* loaded from: classes5.dex */
public final class C25607d extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC18170g f122421a;

    /* renamed from: r10.d$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final LoadMoreInfo f122422a;

        public a(LoadMoreInfo loadMoreInfo) {
            this.f122422a = loadMoreInfo;
        }

        /* renamed from: a */
        public final LoadMoreInfo m132267a() {
            return this.f122422a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f122422a, ((a) obj).f122422a);
        }

        public int hashCode() {
            LoadMoreInfo loadMoreInfo = this.f122422a;
            if (loadMoreInfo == null) {
                return 0;
            }
            return loadMoreInfo.hashCode();
        }

        public String toString() {
            return "Params(loadMoreInfo=" + this.f122422a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r10.d$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122423t;

        /* renamed from: u */
        private /* synthetic */ Object f122424u;

        /* renamed from: w */
        final /* synthetic */ a f122426w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f122426w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f122426w, continuation);
            bVar.f122424u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122423t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f122424u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f122424u;
                InterfaceC18170g interfaceC18170g = C25607d.this.f122421a;
                LoadMoreInfo m132267a = this.f122426w.m132267a();
                this.f122424u = flowCollector;
                this.f122423t = 1;
                obj = interfaceC18170g.mo96578Y(m132267a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            this.f122424u = null;
            this.f122423t = 2;
            if (flowCollector.mo12109b(obj, this) == m142578e) {
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

    public C25607d(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f122421a = interfaceC18170g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        return FlowKt.m113265A(new b(aVar, null));
    }
}
