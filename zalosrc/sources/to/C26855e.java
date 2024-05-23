package to;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1797u;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p185gc.AbstractC19383g;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import to.C26854d;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: to.e */
/* loaded from: classes4.dex */
public final class C26855e extends AbstractC19383g {

    /* renamed from: to.e$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo80705a();

        /* renamed from: b */
        void mo80706b();

        /* renamed from: c */
        void mo80707c();
    }

    /* renamed from: to.e$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final ContactProfile f127152a;

        /* renamed from: b */
        private final TrackingSource f127153b;

        /* renamed from: c */
        private final AbstractC1785o f127154c;

        /* renamed from: d */
        private final a f127155d;

        public b(ContactProfile contactProfile, TrackingSource trackingSource, AbstractC1785o abstractC1785o, a aVar) {
            AbstractC19074t.m100208f(contactProfile, "cp");
            AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f127152a = contactProfile;
            this.f127153b = trackingSource;
            this.f127154c = abstractC1785o;
            this.f127155d = aVar;
        }

        /* renamed from: a */
        public final a m138048a() {
            return this.f127155d;
        }

        /* renamed from: b */
        public final ContactProfile m138049b() {
            return this.f127152a;
        }

        /* renamed from: c */
        public final AbstractC1785o m138050c() {
            return this.f127154c;
        }

        /* renamed from: d */
        public final TrackingSource m138051d() {
            return this.f127153b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f127152a, bVar.f127152a) && AbstractC19074t.m100204b(this.f127153b, bVar.f127153b) && AbstractC19074t.m100204b(this.f127154c, bVar.f127154c) && AbstractC19074t.m100204b(this.f127155d, bVar.f127155d);
        }

        public int hashCode() {
            int hashCode = this.f127152a.hashCode() * 31;
            TrackingSource trackingSource = this.f127153b;
            return ((((hashCode + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + this.f127154c.hashCode()) * 31) + this.f127155d.hashCode();
        }

        public String toString() {
            return "Param(cp=" + this.f127152a + ", trackingSource=" + this.f127153b + ", lifecycle=" + this.f127154c + ", callback=" + this.f127155d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: to.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127156t;

        /* renamed from: u */
        final /* synthetic */ b f127157u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: to.e$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ b f127158p;

            a(b bVar) {
                this.f127158p = bVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f127158p.m138048a().mo80705a();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f127158p.m138048a().mo80706b();
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f127158p.m138048a().mo80707c();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f127157u = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f127157u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f127156t;
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
                C26854d c26854d = new C26854d(null, 1, null);
                C26854d.a aVar = new C26854d.a(this.f127157u.m138049b(), this.f127157u.m138051d());
                this.f127156t = 1;
                obj = c26854d.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f127157u);
                this.f127156t = 2;
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
        BuildersKt__Builders_commonKt.m112540d(AbstractC1797u.m9373a(bVar.m138050c()), null, null, new c(bVar, null), 3, null);
    }
}
