package p455qo;

import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import on0.AbstractC24341v;
import p185gc.AbstractC19377a;
import p398oo.C24347a0;
import p398oo.C24348b;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p455qo.C25412h0;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: qo.d */
/* loaded from: classes4.dex */
public final class C25403d extends AbstractC19377a {

    /* renamed from: a */
    private final C24348b f121625a;

    /* renamed from: b */
    private final InterfaceC24374o f121626b;

    /* renamed from: qo.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121627a;

        /* renamed from: b */
        private final boolean f121628b;

        public a(String str) {
            boolean m127128x;
            AbstractC19074t.m100208f(str, "feedContentId");
            this.f121627a = str;
            m127128x = AbstractC24341v.m127128x(str);
            this.f121628b = m127128x;
        }

        /* renamed from: a */
        public final String m131628a() {
            return this.f121627a;
        }

        /* renamed from: b */
        public final boolean m131629b() {
            return this.f121628b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121627a, ((a) obj).f121627a);
        }

        public int hashCode() {
            return this.f121627a.hashCode();
        }

        public String toString() {
            return "Param(feedContentId=" + this.f121627a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121629t;

        /* renamed from: u */
        int f121630u;

        /* renamed from: v */
        int f121631v;

        /* renamed from: w */
        private /* synthetic */ Object f121632w;

        /* renamed from: x */
        final /* synthetic */ a f121633x;

        /* renamed from: y */
        final /* synthetic */ C25403d f121634y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C25403d c25403d, Continuation continuation) {
            super(2, continuation);
            this.f121633x = aVar;
            this.f121634y = c25403d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f121633x, this.f121634y, continuation);
            bVar.f121632w = obj;
            return bVar;
        }

        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0045: MOVE (r4 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:70), block:B:117:0x0045 */
        /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x018f A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            FlowCollector flowCollector4;
            int i11;
            List m131502j;
            Object m127231f;
            C3000l0 c3000l0;
            int i12;
            List m14333g0;
            List list;
            AbstractC25468a.c cVar;
            List m131502j2;
            List m14333g02;
            boolean z11;
            m142578e = AbstractC28298d.m142578e();
            int i13 = this.f121631v;
            boolean z12 = false;
            try {
            } catch (Exception e11) {
                e = e11;
                flowCollector2 = flowCollector;
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            flowCollector2 = (FlowCollector) this.f121632w;
                            try {
                                AbstractC24862s.m129228b(obj);
                            } catch (Exception e12) {
                                e = e12;
                                AbstractC25468a.a aVar = new AbstractC25468a.a(e);
                                this.f121632w = null;
                                this.f121629t = null;
                                this.f121631v = 4;
                                if (flowCollector2.mo12109b(aVar, this) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    i12 = this.f121630u;
                    C3000l0 c3000l02 = (C3000l0) this.f121629t;
                    flowCollector4 = (FlowCollector) this.f121632w;
                    AbstractC24862s.m129228b(obj);
                    c3000l0 = c3000l02;
                    m127231f = obj;
                    C24347a0 c24347a0 = (C24347a0) m127231f;
                    if (c3000l0 != null || (m14333g02 = c3000l0.m14333g0()) == null) {
                        m131502j2 = AbstractC25368s.m131502j();
                    } else {
                        m131502j2 = new ArrayList();
                        for (Object obj2 : m14333g02) {
                            String str = (String) obj2;
                            List m127221a = c24347a0.m127221a();
                            if (!(m127221a instanceof Collection) || !m127221a.isEmpty()) {
                                Iterator it = m127221a.iterator();
                                while (it.hasNext()) {
                                    if (AbstractC19074t.m100204b(str, (String) it.next())) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                            z11 = false;
                            if (!z11) {
                                m131502j2.add(obj2);
                            }
                        }
                    }
                    C25412h0 c25412h0 = new C25412h0(null, 1, null);
                    if (i12 != 0) {
                        z12 = true;
                    }
                    c25412h0.m101508a(new C25412h0.a(m131502j2, z12));
                    z12 = c24347a0.m127221a().isEmpty();
                    cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(z12));
                    this.f121632w = flowCollector4;
                    this.f121629t = null;
                    this.f121631v = 3;
                    if (flowCollector4.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector3 = (FlowCollector) this.f121632w;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector3 = (FlowCollector) this.f121632w;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f121632w = flowCollector3;
                this.f121631v = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            flowCollector4 = flowCollector3;
            if (!this.f121633x.m131629b()) {
                C3000l0 mo127471c = this.f121634y.f121626b.mo127471c(this.f121633x.m131628a());
                if (mo127471c != null && (list = mo127471c.f11899s) != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            C3047v0 c3047v0 = ((C3020p0) it2.next()).f12022B;
                            if (c3047v0 != null && AbstractC19074t.m100204b(CoreUtility.f89233i, c3047v0.f12280b)) {
                                i11 = 1;
                                break;
                            }
                        }
                    }
                }
                i11 = 0;
                if (mo127471c == null || (m14333g0 = mo127471c.m14333g0()) == null) {
                    m131502j = AbstractC25368s.m131502j();
                } else {
                    m131502j = new ArrayList();
                    for (Object obj3 : m14333g0) {
                        String str2 = (String) obj3;
                        AbstractC19074t.m100205c(str2);
                        if (str2.length() > 0) {
                            m131502j.add(obj3);
                        }
                    }
                }
                if (!m131502j.isEmpty()) {
                    C24348b m131626d = this.f121634y.m131626d();
                    this.f121632w = flowCollector4;
                    this.f121629t = mo127471c;
                    this.f121630u = i11;
                    this.f121631v = 2;
                    m127231f = m131626d.m127231f(m131502j, this);
                    if (m127231f == m142578e) {
                        return m142578e;
                    }
                    int i14 = i11;
                    c3000l0 = mo127471c;
                    i12 = i14;
                    C24347a0 c24347a02 = (C24347a0) m127231f;
                    if (c3000l0 != null) {
                    }
                    m131502j2 = AbstractC25368s.m131502j();
                    C25412h0 c25412h02 = new C25412h0(null, 1, null);
                    if (i12 != 0) {
                    }
                    c25412h02.m101508a(new C25412h0.a(m131502j2, z12));
                    z12 = c24347a02.m127221a().isEmpty();
                }
                cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(z12));
                this.f121632w = flowCollector4;
                this.f121629t = null;
                this.f121631v = 3;
                if (flowCollector4.mo12109b(cVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            throw new Exception();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25403d(C24348b c24348b, InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C24348b() : c24348b, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }

    /* renamed from: d */
    public final C24348b m131626d() {
        return this.f121625a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C25403d(C24348b c24348b, InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(c24348b, "feedApi");
        AbstractC19074t.m100208f(interfaceC24374o, "timelineRepo");
        this.f121625a = c24348b;
        this.f121626b = interfaceC24374o;
    }
}
