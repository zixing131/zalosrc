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

/* renamed from: r10.c */
/* loaded from: classes5.dex */
public final class C25606c extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC18170g f122414a;

    /* renamed from: r10.c$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final LoadMoreInfo f122415a;

        /* renamed from: b */
        private final Integer f122416b;

        public a(LoadMoreInfo loadMoreInfo, Integer num) {
            this.f122415a = loadMoreInfo;
            this.f122416b = num;
        }

        /* renamed from: a */
        public final LoadMoreInfo m132262a() {
            return this.f122415a;
        }

        /* renamed from: b */
        public final Integer m132263b() {
            return this.f122416b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f122415a, aVar.f122415a) && AbstractC19074t.m100204b(this.f122416b, aVar.f122416b);
        }

        public int hashCode() {
            LoadMoreInfo loadMoreInfo = this.f122415a;
            int hashCode = (loadMoreInfo == null ? 0 : loadMoreInfo.hashCode()) * 31;
            Integer num = this.f122416b;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Params(loadMoreInfo=" + this.f122415a + ", value=" + this.f122416b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r10.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122417t;

        /* renamed from: u */
        private /* synthetic */ Object f122418u;

        /* renamed from: w */
        final /* synthetic */ a f122420w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f122420w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f122420w, continuation);
            bVar.f122418u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122417t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f122418u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f122418u;
                InterfaceC18170g interfaceC18170g = C25606c.this.f122414a;
                LoadMoreInfo m132262a = this.f122420w.m132262a();
                Integer m132263b = this.f122420w.m132263b();
                this.f122418u = flowCollector;
                this.f122417t = 1;
                obj = interfaceC18170g.mo96596i(m132262a, m132263b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            this.f122418u = null;
            this.f122417t = 2;
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

    public C25606c(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f122414a = interfaceC18170g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        return FlowKt.m113265A(new b(aVar, null));
    }
}
