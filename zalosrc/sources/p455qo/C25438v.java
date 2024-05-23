package p455qo;

import com.zing.zalo.control.ContactProfile;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p142ey.C18635e;
import p142ey.C18644n;
import p142ey.InterfaceC18632b;
import p185gc.AbstractC19377a;
import p398oo.C24369l0;
import p425po.C24893o;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.v */
/* loaded from: classes4.dex */
public final class C25438v extends AbstractC19377a {

    /* renamed from: a */
    private final C24369l0 f121772a;

    /* renamed from: b */
    private final InterfaceC18632b f121773b;

    /* renamed from: qo.v$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final int f121774a;

        public a(int i11) {
            this.f121774a = i11;
        }

        /* renamed from: a */
        public final int m131757a() {
            return this.f121774a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f121774a == ((a) obj).f121774a;
        }

        public int hashCode() {
            return this.f121774a;
        }

        public String toString() {
            return "Param(srcType=" + this.f121774a + ")";
        }
    }

    /* renamed from: qo.v$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final List f121775a;

        public b(List list) {
            AbstractC19074t.m100208f(list, "suggestContacts");
            this.f121775a = list;
        }

        /* renamed from: a */
        public final List m131758a() {
            return this.f121775a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f121775a, ((b) obj).f121775a);
        }

        public int hashCode() {
            return this.f121775a.hashCode();
        }

        public String toString() {
            return "Result(suggestContacts=" + this.f121775a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.v$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121776t;

        /* renamed from: u */
        int f121777u;

        /* renamed from: v */
        private /* synthetic */ Object f121778v;

        /* renamed from: x */
        final /* synthetic */ a f121780x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f121780x = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f121780x, continuation);
            cVar.f121778v = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c1 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:16:0x0029, B:21:0x00aa, B:22:0x00bb, B:24:0x00c1, B:27:0x00d1, B:32:0x00d5, B:45:0x009b, B:52:0x0074), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v16 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            C18635e c18635e;
            List m131185M0;
            Iterator it;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121777u;
            try {
            } catch (Exception e11) {
                e = e11;
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
                        C18635e c18635e2 = (C18635e) this.f121776t;
                        FlowCollector flowCollector2 = (FlowCollector) this.f121778v;
                        try {
                            AbstractC24862s.m129228b(obj);
                            c18635e = c18635e2;
                            flowCollector = flowCollector2;
                            m131185M0 = AbstractC25332a0.m131185M0((Iterable) obj);
                            ArrayList arrayList = new ArrayList();
                            it = m131185M0.iterator();
                            while (it.hasNext()) {
                                ContactProfile mo98491j = c18635e.mo98491j(((C24893o) it.next()).m129414a());
                                if (mo98491j != null) {
                                    arrayList.add(mo98491j);
                                }
                            }
                            cVar = new AbstractC25468a.c(new b(arrayList));
                            this.f121778v = flowCollector;
                            this.f121776t = null;
                            this.f121777u = 4;
                            if (flowCollector.mo12109b(cVar, this) == m142578e) {
                                return m142578e;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            r12 = flowCollector2;
                        }
                        return C24848g0.f119245a;
                    }
                    C18635e c18635e3 = (C18635e) this.f121776t;
                    FlowCollector flowCollector3 = (FlowCollector) this.f121778v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        c18635e = c18635e3;
                        flowCollector = flowCollector3;
                        this.f121778v = flowCollector;
                        this.f121776t = c18635e;
                        this.f121777u = 3;
                        obj = FlowKt.m113304v((Flow) obj, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        m131185M0 = AbstractC25332a0.m131185M0((Iterable) obj);
                        ArrayList arrayList2 = new ArrayList();
                        it = m131185M0.iterator();
                        while (it.hasNext()) {
                        }
                        cVar = new AbstractC25468a.c(new b(arrayList2));
                        this.f121778v = flowCollector;
                        this.f121776t = null;
                        this.f121777u = 4;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        }
                    } catch (Exception e13) {
                        e = e13;
                        r12 = flowCollector3;
                    }
                    return C24848g0.f119245a;
                    AbstractC25468a.a aVar = new AbstractC25468a.a(e);
                    this.f121778v = null;
                    this.f121776t = null;
                    this.f121777u = 5;
                    if (r12.mo12109b(aVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f121778v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.f121778v;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f121778v = flowCollector4;
                this.f121777u = 1;
                if (flowCollector4.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector4;
            }
            C18635e mo98465a = C25438v.this.m131755d().mo98465a(null, false);
            C24369l0 m131754c = C25438v.this.m131754c();
            int m131757a = this.f121780x.m131757a();
            this.f121778v = flowCollector;
            this.f121776t = mo98465a;
            this.f121777u = 2;
            Object m127454e = m131754c.m127454e(m131757a, this);
            if (m127454e == m142578e) {
                return m142578e;
            }
            c18635e = mo98465a;
            obj = m127454e;
            this.f121778v = flowCollector;
            this.f121776t = c18635e;
            this.f121777u = 3;
            obj = FlowKt.m113304v((Flow) obj, this);
            if (obj == m142578e) {
            }
            m131185M0 = AbstractC25332a0.m131185M0((Iterable) obj);
            ArrayList arrayList22 = new ArrayList();
            it = m131185M0.iterator();
            while (it.hasNext()) {
            }
            cVar = new AbstractC25468a.c(new b(arrayList22));
            this.f121778v = flowCollector;
            this.f121776t = null;
            this.f121777u = 4;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C25438v(C24369l0 c24369l0, InterfaceC18632b interfaceC18632b, int i11, AbstractC19060k abstractC19060k) {
        this(c24369l0, interfaceC18632b);
        c24369l0 = (i11 & 1) != 0 ? C24369l0.Companion.m127457a() : c24369l0;
        if ((i11 & 2) != 0) {
            interfaceC18632b = C18644n.m98531l();
            AbstractC19074t.m100207e(interfaceC18632b, "getInstance(...)");
        }
    }

    /* renamed from: c */
    public final C24369l0 m131754c() {
        return this.f121772a;
    }

    /* renamed from: d */
    public final InterfaceC18632b m131755d() {
        return this.f121773b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C25438v(C24369l0 c24369l0, InterfaceC18632b interfaceC18632b) {
        AbstractC19074t.m100208f(c24369l0, "repo");
        AbstractC19074t.m100208f(interfaceC18632b, "zaloFriendManager");
        this.f121772a = c24369l0;
        this.f121773b = interfaceC18632b;
    }
}
