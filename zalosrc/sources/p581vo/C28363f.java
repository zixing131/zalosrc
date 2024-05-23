package p581vo;

import ag0.C0824j;
import am.AbstractC0939u;
import androidx.work.AbstractC2144f;
import bo.C3000l0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23304d;
import p581vo.AbstractC28358a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tn.C26761p;
import tn.C26767v;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: vo.f */
/* loaded from: classes4.dex */
public final class C28363f extends AbstractC19377a {

    /* renamed from: vo.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3000l0 f132162a;

        /* renamed from: b */
        private final C3000l0 f132163b;

        /* renamed from: c */
        private final Boolean f132164c;

        /* renamed from: d */
        private final boolean f132165d;

        /* renamed from: e */
        private final InterfaceC18505l f132166e;

        public a(C3000l0 c3000l0, C3000l0 c3000l02, Boolean bool, boolean z11, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f132162a = c3000l0;
            this.f132163b = c3000l02;
            this.f132164c = bool;
            this.f132165d = z11;
            this.f132166e = interfaceC18505l;
        }

        /* renamed from: a */
        public final InterfaceC18505l m142826a() {
            return this.f132166e;
        }

        /* renamed from: b */
        public final C3000l0 m142827b() {
            return this.f132163b;
        }

        /* renamed from: c */
        public final C3000l0 m142828c() {
            return this.f132162a;
        }

        /* renamed from: d */
        public final boolean m142829d() {
            return this.f132165d;
        }

        /* renamed from: e */
        public final Boolean m142830e() {
            return this.f132164c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132162a, aVar.f132162a) && AbstractC19074t.m100204b(this.f132163b, aVar.f132163b) && AbstractC19074t.m100204b(this.f132164c, aVar.f132164c) && this.f132165d == aVar.f132165d && AbstractC19074t.m100204b(this.f132166e, aVar.f132166e);
        }

        public int hashCode() {
            C3000l0 c3000l0 = this.f132162a;
            int hashCode = (c3000l0 == null ? 0 : c3000l0.hashCode()) * 31;
            C3000l0 c3000l02 = this.f132163b;
            int hashCode2 = (hashCode + (c3000l02 == null ? 0 : c3000l02.hashCode())) * 31;
            Boolean bool = this.f132164c;
            return ((((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f132165d)) * 31) + this.f132166e.hashCode();
        }

        public String toString() {
            return "Param(oldFeedContent=" + this.f132162a + ", newFeedContent=" + this.f132163b + ", isMutualFeed=" + this.f132164c + ", isEmptyPhotoOrVideo=" + this.f132165d + ", callback=" + this.f132166e + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132167t;

        /* renamed from: u */
        private /* synthetic */ Object f132168u;

        /* renamed from: v */
        final /* synthetic */ a f132169v;

        /* renamed from: vo.f$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C3000l0 f132170a;

            /* renamed from: b */
            final /* synthetic */ String f132171b;

            /* renamed from: c */
            final /* synthetic */ a f132172c;

            a(C3000l0 c3000l0, String str, a aVar) {
                this.f132170a = c3000l0;
                this.f132171b = str;
                this.f132172c = aVar;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e m41971c6 = C7960e.m41971c6();
                String str = AbstractC23304d.f113368c0.f42434r;
                C3000l0 c3000l0 = this.f132170a;
                m41971c6.m42073B7(str, c3000l0.f11895q, this.f132171b, c3000l0.m14339j0(), this.f132170a.m14341k0());
                C26767v.m137782d().m137783a(this.f132170a);
                C26761p.m137741q().m137753F(this.f132170a);
                this.f132172c.m142826a().mo205i9(this.f132170a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f132169v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f132169v, continuation);
            bVar.f132168u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            boolean z11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f132167t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f132168u;
                if (!this.f132169v.m142829d() && this.f132169v.m142827b() != null && this.f132169v.m142828c() != null) {
                    String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.profile_today);
                    AbstractC19074t.m100207e(string, "getString(...)");
                    C3000l0 m142828c = this.f132169v.m142828c();
                    String str = m142828c.f11869R;
                    if (str != null && str.length() != 0 && (string = m142828c.f11869R) == null) {
                        string = "";
                    }
                    C3000l0 m142827b = this.f132169v.m142827b();
                    m142827b.f11869R = string;
                    m142827b.f11870S = m142828c.f11870S;
                    m142827b.f11872U = m142828c.f11872U;
                    m142827b.f11871T = m142828c.f11871T;
                    m142827b.f11873V = m142828c.f11873V;
                    Boolean m142830e = this.f132169v.m142830e();
                    if (m142830e != null) {
                        z11 = m142830e.booleanValue();
                    } else {
                        z11 = false;
                    }
                    m142827b.f11868Q = z11;
                    String jSONObject = AbstractC20826v0.m108827p(m142827b).toString();
                    AbstractC19074t.m100207e(jSONObject, "toString(...)");
                    C0824j.m2153b(new a(m142827b, jSONObject, this.f132169v));
                    return C24848g0.f119245a;
                }
                AbstractC28358a.b bVar = new AbstractC28358a.b(EnumC28360c.f132137p, null);
                this.f132167t = 1;
                if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
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
