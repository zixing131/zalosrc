package to;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1797u;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p185gc.AbstractC19383g;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import to.C26852b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: to.c */
/* loaded from: classes4.dex */
public final class C26853c extends AbstractC19383g {

    /* renamed from: to.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo78817a();

        /* renamed from: b */
        void mo78818b();

        /* renamed from: c */
        void mo78819c();
    }

    /* renamed from: to.c$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final List f127137a;

        /* renamed from: b */
        private final TrackingSource f127138b;

        /* renamed from: c */
        private final AbstractC1785o f127139c;

        /* renamed from: d */
        private final a f127140d;

        public b(List list, TrackingSource trackingSource, AbstractC1785o abstractC1785o, a aVar) {
            AbstractC19074t.m100208f(list, "uids");
            AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f127137a = list;
            this.f127138b = trackingSource;
            this.f127139c = abstractC1785o;
            this.f127140d = aVar;
        }

        /* renamed from: a */
        public final a m138035a() {
            return this.f127140d;
        }

        /* renamed from: b */
        public final AbstractC1785o m138036b() {
            return this.f127139c;
        }

        /* renamed from: c */
        public final TrackingSource m138037c() {
            return this.f127138b;
        }

        /* renamed from: d */
        public final List m138038d() {
            return this.f127137a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f127137a, bVar.f127137a) && AbstractC19074t.m100204b(this.f127138b, bVar.f127138b) && AbstractC19074t.m100204b(this.f127139c, bVar.f127139c) && AbstractC19074t.m100204b(this.f127140d, bVar.f127140d);
        }

        public int hashCode() {
            int hashCode = this.f127137a.hashCode() * 31;
            TrackingSource trackingSource = this.f127138b;
            return ((((hashCode + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + this.f127139c.hashCode()) * 31) + this.f127140d.hashCode();
        }

        public String toString() {
            return "Param(uids=" + this.f127137a + ", trackingSource=" + this.f127138b + ", lifecycle=" + this.f127139c + ", callback=" + this.f127140d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: to.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127141t;

        /* renamed from: u */
        final /* synthetic */ b f127142u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: to.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ b f127143p;

            a(b bVar) {
                this.f127143p = bVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f127143p.m138035a().mo78817a();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f127143p.m138035a().mo78818b();
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f127143p.m138035a().mo78819c();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f127142u = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f127142u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f127141t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C26852b c26852b = new C26852b(null, 1, null);
                C26852b.a aVar = new C26852b.a(this.f127142u.m138038d(), this.f127142u.m138037c());
                this.f127141t = 1;
                obj = c26852b.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f127142u);
                this.f127141t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1797u.m9373a(bVar.m138036b()), null, null, new c(bVar, null), 3, null);
    }
}
