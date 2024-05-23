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
import p461qu.AbstractC25495a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.t */
/* loaded from: classes4.dex */
public final class C25435t extends AbstractC19377a {

    /* renamed from: a */
    private final C24369l0 f121747a;

    /* renamed from: b */
    private final InterfaceC18632b f121748b;

    /* renamed from: qo.t$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final int f121749a;

        public a(int i11) {
            this.f121749a = i11;
        }

        /* renamed from: a */
        public final int m131732a() {
            return this.f121749a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f121749a == ((a) obj).f121749a;
        }

        public int hashCode() {
            return this.f121749a;
        }

        public String toString() {
            return "Param(srcType=" + this.f121749a + ")";
        }
    }

    /* renamed from: qo.t$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final List f121750a;

        /* renamed from: b */
        private final List f121751b;

        public b(List list, List list2) {
            AbstractC19074t.m100208f(list, "tabOtherContact");
            AbstractC19074t.m100208f(list2, "tabMainContact");
            this.f121750a = list;
            this.f121751b = list2;
        }

        /* renamed from: a */
        public final List m131733a() {
            return this.f121751b;
        }

        /* renamed from: b */
        public final List m131734b() {
            return this.f121750a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f121750a, bVar.f121750a) && AbstractC19074t.m100204b(this.f121751b, bVar.f121751b);
        }

        public int hashCode() {
            return (this.f121750a.hashCode() * 31) + this.f121751b.hashCode();
        }

        public String toString() {
            return "Result(tabOtherContact=" + this.f121750a + ", tabMainContact=" + this.f121751b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.t$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121752t;

        /* renamed from: u */
        int f121753u;

        /* renamed from: v */
        private /* synthetic */ Object f121754v;

        /* renamed from: x */
        final /* synthetic */ a f121756x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f121756x = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f121756x, continuation);
            cVar.f121754v = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:19:0x0039, B:20:0x00aa, B:21:0x00bb, B:23:0x00c1, B:26:0x00d1, B:31:0x00d5, B:32:0x00de, B:34:0x00e4, B:37:0x00f4, B:42:0x00f8, B:43:0x0101, B:45:0x0107, B:50:0x0116, B:55:0x011a, B:56:0x0123, B:58:0x0129, B:61:0x0139, B:66:0x013d), top: B:18:0x0039 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e4 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:19:0x0039, B:20:0x00aa, B:21:0x00bb, B:23:0x00c1, B:26:0x00d1, B:31:0x00d5, B:32:0x00de, B:34:0x00e4, B:37:0x00f4, B:42:0x00f8, B:43:0x0101, B:45:0x0107, B:50:0x0116, B:55:0x011a, B:56:0x0123, B:58:0x0129, B:61:0x0139, B:66:0x013d), top: B:18:0x0039 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0107 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:19:0x0039, B:20:0x00aa, B:21:0x00bb, B:23:0x00c1, B:26:0x00d1, B:31:0x00d5, B:32:0x00de, B:34:0x00e4, B:37:0x00f4, B:42:0x00f8, B:43:0x0101, B:45:0x0107, B:50:0x0116, B:55:0x011a, B:56:0x0123, B:58:0x0129, B:61:0x0139, B:66:0x013d), top: B:18:0x0039 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0129 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:19:0x0039, B:20:0x00aa, B:21:0x00bb, B:23:0x00c1, B:26:0x00d1, B:31:0x00d5, B:32:0x00de, B:34:0x00e4, B:37:0x00f4, B:42:0x00f8, B:43:0x0101, B:45:0x0107, B:50:0x0116, B:55:0x011a, B:56:0x0123, B:58:0x0129, B:61:0x0139, B:66:0x013d), top: B:18:0x0039 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0153 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0165 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00a8  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC25468a.a aVar;
            FlowCollector flowCollector;
            C18635e c18635e;
            FlowCollector flowCollector2;
            C18635e<ContactProfile> c18635e2;
            List m131185M0;
            Iterator it;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121753u;
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
                        c18635e2 = (C18635e) this.f121752t;
                        flowCollector2 = (FlowCollector) this.f121754v;
                        try {
                            AbstractC24862s.m129228b(obj);
                            m131185M0 = AbstractC25332a0.m131185M0((Iterable) obj);
                            ArrayList arrayList = new ArrayList();
                            it = m131185M0.iterator();
                            while (it.hasNext()) {
                                ContactProfile mo98491j = c18635e2.mo98491j(((C24893o) it.next()).m129414a());
                                if (mo98491j != null) {
                                    arrayList.add(mo98491j);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (!AbstractC25495a.m132086k(((ContactProfile) obj2).f42434r)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (ContactProfile contactProfile : c18635e2) {
                                if (arrayList2.contains(contactProfile)) {
                                    contactProfile = null;
                                }
                                if (contactProfile != null) {
                                    arrayList3.add(contactProfile);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (!AbstractC25495a.m132086k(((ContactProfile) obj3).f42434r)) {
                                    arrayList4.add(obj3);
                                }
                            }
                            cVar = new AbstractC25468a.c(new b(arrayList2, arrayList4));
                            this.f121754v = flowCollector2;
                            this.f121752t = null;
                            this.f121753u = 4;
                            if (flowCollector2.mo12109b(cVar, this) == m142578e) {
                                return m142578e;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            r12 = flowCollector2;
                            aVar = new AbstractC25468a.a(e);
                            this.f121754v = null;
                            this.f121752t = null;
                            this.f121753u = 5;
                            if (r12.mo12109b(aVar, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        return C24848g0.f119245a;
                    }
                    C18635e c18635e3 = (C18635e) this.f121752t;
                    FlowCollector flowCollector3 = (FlowCollector) this.f121754v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        c18635e = c18635e3;
                        flowCollector = flowCollector3;
                        this.f121754v = flowCollector;
                        this.f121752t = c18635e;
                        this.f121753u = 3;
                        obj = FlowKt.m113304v((Flow) obj, this);
                    } catch (Exception e13) {
                        e = e13;
                        r12 = flowCollector3;
                        aVar = new AbstractC25468a.a(e);
                        this.f121754v = null;
                        this.f121752t = null;
                        this.f121753u = 5;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    if (obj != m142578e) {
                        return m142578e;
                    }
                    flowCollector2 = flowCollector;
                    c18635e2 = c18635e;
                    m131185M0 = AbstractC25332a0.m131185M0((Iterable) obj);
                    ArrayList arrayList5 = new ArrayList();
                    it = m131185M0.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    while (r5.hasNext()) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    ArrayList arrayList42 = new ArrayList();
                    while (r5.hasNext()) {
                    }
                    cVar = new AbstractC25468a.c(new b(arrayList22, arrayList42));
                    this.f121754v = flowCollector2;
                    this.f121752t = null;
                    this.f121753u = 4;
                    if (flowCollector2.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f121754v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.f121754v;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f121754v = flowCollector4;
                this.f121753u = 1;
                if (flowCollector4.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector4;
            }
            C18635e mo98465a = C25435t.this.m131730d().mo98465a(null, false);
            C24369l0 m131729c = C25435t.this.m131729c();
            int m131732a = this.f121756x.m131732a();
            this.f121754v = flowCollector;
            this.f121752t = mo98465a;
            this.f121753u = 2;
            Object m127455f = m131729c.m127455f(m131732a, this);
            if (m127455f == m142578e) {
                return m142578e;
            }
            c18635e = mo98465a;
            obj = m127455f;
            this.f121754v = flowCollector;
            this.f121752t = c18635e;
            this.f121753u = 3;
            obj = FlowKt.m113304v((Flow) obj, this);
            if (obj != m142578e) {
            }
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
    public /* synthetic */ C25435t(C24369l0 c24369l0, InterfaceC18632b interfaceC18632b, int i11, AbstractC19060k abstractC19060k) {
        this(c24369l0, interfaceC18632b);
        c24369l0 = (i11 & 1) != 0 ? C24369l0.Companion.m127457a() : c24369l0;
        if ((i11 & 2) != 0) {
            interfaceC18632b = C18644n.m98531l();
            AbstractC19074t.m100207e(interfaceC18632b, "getInstance(...)");
        }
    }

    /* renamed from: c */
    public final C24369l0 m131729c() {
        return this.f121747a;
    }

    /* renamed from: d */
    public final InterfaceC18632b m131730d() {
        return this.f121748b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C25435t(C24369l0 c24369l0, InterfaceC18632b interfaceC18632b) {
        AbstractC19074t.m100208f(c24369l0, "repo");
        AbstractC19074t.m100208f(interfaceC18632b, "zaloFriendManager");
        this.f121747a = c24369l0;
        this.f121748b = interfaceC18632b;
    }
}
