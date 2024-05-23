package p581vo;

import ag0.C0824j;
import am.AbstractC0939u;
import bo.C3000l0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20826v0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23304d;
import p458qr.AbstractC25468a;
import p509sp.C26359h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tn.C26761p;
import tn.C26767v;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vo.e */
/* loaded from: classes4.dex */
public final class C28362e extends AbstractC19377a {

    /* renamed from: vo.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3000l0 f132147a;

        /* renamed from: b */
        private final Boolean f132148b;

        /* renamed from: c */
        private final InterfaceC18505l f132149c;

        public a(C3000l0 c3000l0, Boolean bool, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f132147a = c3000l0;
            this.f132148b = bool;
            this.f132149c = interfaceC18505l;
        }

        /* renamed from: a */
        public final InterfaceC18505l m142819a() {
            return this.f132149c;
        }

        /* renamed from: b */
        public final C3000l0 m142820b() {
            return this.f132147a;
        }

        /* renamed from: c */
        public final Boolean m142821c() {
            return this.f132148b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132147a, aVar.f132147a) && AbstractC19074t.m100204b(this.f132148b, aVar.f132148b) && AbstractC19074t.m100204b(this.f132149c, aVar.f132149c);
        }

        public int hashCode() {
            C3000l0 c3000l0 = this.f132147a;
            int hashCode = (c3000l0 == null ? 0 : c3000l0.hashCode()) * 31;
            Boolean bool = this.f132148b;
            return ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + this.f132149c.hashCode();
        }

        public String toString() {
            return "Param(newFeedContent=" + this.f132147a + ", isMutualFeed=" + this.f132148b + ", callback=" + this.f132149c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132150t;

        /* renamed from: u */
        private /* synthetic */ Object f132151u;

        /* renamed from: v */
        final /* synthetic */ a f132152v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.e$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ int f132153q;

            /* renamed from: r */
            final /* synthetic */ String f132154r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, String str) {
                super(0);
                this.f132153q = i11;
                this.f132154r = str;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "begin saveAsyncFeed: type=" + this.f132153q + " id=" + this.f132154r;
            }
        }

        /* renamed from: vo.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33015b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C3000l0 f132155a;

            /* renamed from: b */
            final /* synthetic */ String f132156b;

            /* renamed from: c */
            final /* synthetic */ a f132157c;

            /* renamed from: d */
            final /* synthetic */ int f132158d;

            /* renamed from: e */
            final /* synthetic */ String f132159e;

            /* renamed from: vo.e$b$b$a */
            /* loaded from: classes4.dex */
            static final class a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ int f132160q;

                /* renamed from: r */
                final /* synthetic */ String f132161r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(int i11, String str) {
                    super(0);
                    this.f132160q = i11;
                    this.f132161r = str;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "end saveAsyncFeed: finish insert db: type=" + this.f132160q + " id=" + this.f132161r;
                }
            }

            C33015b(C3000l0 c3000l0, String str, a aVar, int i11, String str2) {
                this.f132155a = c3000l0;
                this.f132156b = str;
                this.f132157c = aVar;
                this.f132158d = i11;
                this.f132159e = str2;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e m41971c6 = C7960e.m41971c6();
                String str = AbstractC23304d.f113368c0.f42434r;
                C3000l0 c3000l0 = this.f132155a;
                m41971c6.m42073B7(str, c3000l0.f11895q, this.f132156b, c3000l0.m14339j0(), this.f132155a.m14341k0());
                C26767v.m137782d().m137783a(this.f132155a);
                C26761p.m137741q().m137753F(this.f132155a);
                C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", new a(this.f132158d, this.f132159e));
                this.f132157c.m142819a().mo205i9(this.f132155a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f132152v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f132152v, continuation);
            bVar.f132151u = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Exception exc;
            int i11;
            String str;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f132150t;
            try {
            } catch (Exception e11) {
                AbstractC25468a.a aVar = new AbstractC25468a.a(null);
                this.f132151u = e11;
                this.f132150t = 3;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
                exc = e11;
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 == 3) {
                            exc = (Exception) this.f132151u;
                            AbstractC24862s.m129228b(obj);
                            exc.printStackTrace();
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
                return C24848g0.f119245a;
            }
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f132151u;
            C3000l0 m142820b = this.f132152v.m142820b();
            if (m142820b != null && m142820b.m14322a0() != null) {
                if (m142820b.m14322a0() != null) {
                    i11 = m142820b.m14322a0().f12058q;
                } else {
                    i11 = -1;
                }
                if (m142820b.m14322a0() != null) {
                    str = m142820b.m14322a0().f12057p;
                } else {
                    str = "-1";
                }
                String str2 = str;
                C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", new a(i11, str2));
                m142820b.f11869R = MainApplication.Companion.m35500c().getString(AbstractC8020f0.profile_today);
                m142820b.f11868Q = AbstractC19074t.m100204b(this.f132152v.m142821c(), AbstractC29094b.m145339a(true));
                String jSONObject = AbstractC20826v0.m108827p(m142820b).toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                C0824j.m2153b(new C33015b(m142820b, jSONObject, this.f132152v, i11, str2));
                AbstractC25468a.c cVar = new AbstractC25468a.c(this.f132152v.m142820b());
                this.f132151u = flowCollector;
                this.f132150t = 2;
                if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            AbstractC25468a.a aVar2 = new AbstractC25468a.a(null);
            this.f132151u = flowCollector;
            this.f132150t = 1;
            if (flowCollector.mo12109b(aVar2, this) == m142578e) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }
}
