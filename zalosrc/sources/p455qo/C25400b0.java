package p455qo;

import com.zing.zalo.control.InviteContactProfile;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import me0.AbstractC23262x6;
import p142ey.C18644n;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23304d;
import p398oo.C24369l0;
import p425po.C24893o;
import p458qr.AbstractC25468a;
import p461qu.AbstractC25495a;
import p716zh.C32093r8;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.b0 */
/* loaded from: classes4.dex */
public final class C25400b0 extends AbstractC19377a {

    /* renamed from: a */
    private final C24369l0 f121602a;

    /* renamed from: b */
    private Map f121603b;

    /* renamed from: qo.b0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121604a;

        /* renamed from: b */
        private final int f121605b;

        public a(String str, int i11) {
            AbstractC19074t.m100208f(str, "textSearch");
            this.f121604a = str;
            this.f121605b = i11;
        }

        /* renamed from: a */
        public final int m131612a() {
            return this.f121605b;
        }

        /* renamed from: b */
        public final String m131613b() {
            return this.f121604a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121604a, aVar.f121604a) && this.f121605b == aVar.f121605b;
        }

        public int hashCode() {
            return (this.f121604a.hashCode() * 31) + this.f121605b;
        }

        public String toString() {
            return "Param(textSearch=" + this.f121604a + ", srcType=" + this.f121605b + ")";
        }
    }

    /* renamed from: qo.b0$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final List f121606a;

        /* renamed from: b */
        private final List f121607b;

        public b(List list, List list2) {
            AbstractC19074t.m100208f(list, "contactsTabOther");
            AbstractC19074t.m100208f(list2, "contactsTabMain");
            this.f121606a = list;
            this.f121607b = list2;
        }

        /* renamed from: a */
        public final List m131614a() {
            return this.f121607b;
        }

        /* renamed from: b */
        public final List m131615b() {
            return this.f121606a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f121606a, bVar.f121606a) && AbstractC19074t.m100204b(this.f121607b, bVar.f121607b);
        }

        public int hashCode() {
            return (this.f121606a.hashCode() * 31) + this.f121607b.hashCode();
        }

        public String toString() {
            return "Result(contactsTabOther=" + this.f121606a + ", contactsTabMain=" + this.f121607b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.b0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121608t;

        /* renamed from: u */
        int f121609u;

        /* renamed from: v */
        private /* synthetic */ Object f121610v;

        /* renamed from: w */
        final /* synthetic */ a f121611w;

        /* renamed from: x */
        final /* synthetic */ C25400b0 f121612x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, C25400b0 c25400b0, Continuation continuation) {
            super(2, continuation);
            this.f121611w = aVar;
            this.f121612x = c25400b0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f121611w, this.f121612x, continuation);
            cVar.f121610v = obj;
            return cVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:2)|(1:(1:(1:(3:(1:(1:9)(2:13|14))(2:15|16)|10|11)(19:17|18|19|20|(6:23|(2:24|(2:26|(2:28|29)(1:37))(2:38|39))|30|(3:32|33|34)(1:36)|35|21)|40|41|(4:44|(3:46|47|48)(1:50)|49|42)|51|52|(5:55|(1:57)|(3:59|60|61)(1:63)|62|53)|64|65|(4:68|(3:70|71|72)(1:74)|73|66)|75|76|(1:78)|10|11))(22:79|80|81|82|83|(1:85)|20|(1:21)|40|41|(1:42)|51|52|(1:53)|64|65|(1:66)|75|76|(0)|10|11))(1:92))(2:144|(1:146))|93|94|95|96|(5:111|112|(4:115|(7:121|122|(5:124|125|126|127|129)|132|133|134|135)(3:117|118|119)|120|113)|136|137)(3:98|99|100)|101|102|103|(1:105)(19:106|83|(0)|20|(1:21)|40|41|(1:42)|51|52|(1:53)|64|65|(1:66)|75|76|(0)|10|11)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0269, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x026a, code lost:            r5 = r9;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x01b4 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:16:0x002b, B:20:0x019d, B:21:0x01ae, B:23:0x01b4, B:24:0x01be, B:26:0x01c4, B:30:0x01d9, B:33:0x01dd, B:41:0x01e1, B:42:0x01ea, B:44:0x01f0, B:47:0x0201, B:52:0x0205, B:53:0x020e, B:55:0x0214, B:60:0x0223, B:65:0x0227, B:66:0x0230, B:68:0x0236, B:71:0x0247, B:76:0x024b, B:83:0x018d), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01f0 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:16:0x002b, B:20:0x019d, B:21:0x01ae, B:23:0x01b4, B:24:0x01be, B:26:0x01c4, B:30:0x01d9, B:33:0x01dd, B:41:0x01e1, B:42:0x01ea, B:44:0x01f0, B:47:0x0201, B:52:0x0205, B:53:0x020e, B:55:0x0214, B:60:0x0223, B:65:0x0227, B:66:0x0230, B:68:0x0236, B:71:0x0247, B:76:0x024b, B:83:0x018d), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0214 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:16:0x002b, B:20:0x019d, B:21:0x01ae, B:23:0x01b4, B:24:0x01be, B:26:0x01c4, B:30:0x01d9, B:33:0x01dd, B:41:0x01e1, B:42:0x01ea, B:44:0x01f0, B:47:0x0201, B:52:0x0205, B:53:0x020e, B:55:0x0214, B:60:0x0223, B:65:0x0227, B:66:0x0230, B:68:0x0236, B:71:0x0247, B:76:0x024b, B:83:0x018d), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0236 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:16:0x002b, B:20:0x019d, B:21:0x01ae, B:23:0x01b4, B:24:0x01be, B:26:0x01c4, B:30:0x01d9, B:33:0x01dd, B:41:0x01e1, B:42:0x01ea, B:44:0x01f0, B:47:0x0201, B:52:0x0205, B:53:0x020e, B:55:0x0214, B:60:0x0223, B:65:0x0227, B:66:0x0230, B:68:0x0236, B:71:0x0247, B:76:0x024b, B:83:0x018d), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0263 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0280 A[RETURN] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v8 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC25468a.a aVar;
            FlowCollector flowCollector;
            ArrayList<InviteContactProfile> arrayList;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            ArrayList arrayList2;
            Object m127455f;
            FlowCollector flowCollector4;
            Object m113304v;
            List<C24893o> m131185M0;
            AbstractC25468a.c cVar;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121609u;
            ?? r42 = 4;
            ?? r52 = 3;
            try {
                try {
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                AbstractC24862s.m129228b(obj);
                            }
                            return C24848g0.f119245a;
                        }
                        arrayList = (ArrayList) this.f121608t;
                        FlowCollector flowCollector5 = (FlowCollector) this.f121610v;
                        AbstractC24862s.m129228b(obj);
                        m113304v = obj;
                        flowCollector4 = flowCollector5;
                        m131185M0 = AbstractC25332a0.m131185M0((Iterable) m113304v);
                        ArrayList arrayList3 = new ArrayList();
                        for (C24893o c24893o : m131185M0) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (AbstractC19074t.m100204b(((InviteContactProfile) obj2).f42434r, c24893o.m129414a())) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            InviteContactProfile inviteContactProfile = (InviteContactProfile) obj2;
                            if (inviteContactProfile != null) {
                                arrayList3.add(inviteContactProfile);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : arrayList3) {
                            if (!AbstractC25495a.m132086k(((InviteContactProfile) obj3).f42434r)) {
                                arrayList4.add(obj3);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (InviteContactProfile inviteContactProfile2 : arrayList) {
                            if (arrayList4.contains(inviteContactProfile2)) {
                                inviteContactProfile2 = null;
                            }
                            if (inviteContactProfile2 != null) {
                                arrayList5.add(inviteContactProfile2);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj4 : arrayList5) {
                            if (!AbstractC25495a.m132086k(((InviteContactProfile) obj4).f42434r)) {
                                arrayList6.add(obj4);
                            }
                        }
                        cVar = new AbstractC25468a.c(new b(arrayList4, arrayList6));
                        this.f121610v = flowCollector4;
                        this.f121608t = null;
                        this.f121609u = 4;
                        if (flowCollector4.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    arrayList = (ArrayList) this.f121608t;
                    FlowCollector flowCollector6 = (FlowCollector) this.f121610v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        m127455f = obj;
                        flowCollector4 = flowCollector6;
                        this.f121610v = flowCollector4;
                        this.f121608t = arrayList;
                        this.f121609u = 3;
                        m113304v = FlowKt.m113304v((Flow) m127455f, this);
                        if (m113304v == m142578e) {
                            return m142578e;
                        }
                        m131185M0 = AbstractC25332a0.m131185M0((Iterable) m113304v);
                        ArrayList arrayList32 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        ArrayList arrayList42 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        ArrayList arrayList52 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        ArrayList arrayList62 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        cVar = new AbstractC25468a.c(new b(arrayList42, arrayList62));
                        this.f121610v = flowCollector4;
                        this.f121608t = null;
                        this.f121609u = 4;
                        if (flowCollector4.mo12109b(cVar, this) == m142578e) {
                        }
                    } catch (Exception e13) {
                        e = e13;
                        r42 = flowCollector6;
                        aVar = new AbstractC25468a.a(e);
                        this.f121610v = null;
                        this.f121608t = null;
                        this.f121609u = 5;
                        if (r42.mo12109b(aVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f121610v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f121610v;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f121610v = flowCollector;
                this.f121609u = 1;
                if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            FlowCollector flowCollector7 = flowCollector;
            arrayList = new ArrayList();
            String m120002o = AbstractC23262x6.m120002o(this.f121611w.m131613b());
            AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
            String[] m119967B = AbstractC23262x6.m119967B(m120002o);
            AbstractC19074t.m100207e(m119967B, "preprocessKeyStr(...)");
            ArrayList arrayList7 = new ArrayList();
            if (!this.f121612x.m131609c().containsKey(m120002o)) {
                try {
                    for (Map.Entry entry : AbstractC23304d.f113429r.entrySet()) {
                        String str = (String) entry.getKey();
                        ArrayList arrayList8 = (ArrayList) entry.getValue();
                        String[] m119970E = AbstractC23262x6.m119970E(str);
                        AbstractC19074t.m100207e(m119970E, "preprocessSearchStr(...)");
                        float m120001n = AbstractC23262x6.m120001n(m119967B, m119970E);
                        if (m120001n > 0.0f) {
                            int size = arrayList8.size();
                            int i12 = 0;
                            while (i12 < size) {
                                C32093r8 c32093r8 = new C32093r8();
                                c32093r8.f147887d = ((C32093r8) arrayList8.get(i12)).f147887d;
                                c32093r8.f147884a = ((C32093r8) arrayList8.get(i12)).f147884a;
                                c32093r8.f147886c = ((C32093r8) arrayList8.get(i12)).f147886c;
                                c32093r8.f147890g = m120001n;
                                flowCollector2 = flowCollector7;
                                try {
                                    c32093r8.f147885b = ((C32093r8) arrayList8.get(i12)).f147885b;
                                    c32093r8.f147893j = ((C32093r8) arrayList8.get(i12)).f147893j;
                                    arrayList7.add(c32093r8);
                                    i12++;
                                    flowCollector7 = flowCollector2;
                                } catch (Exception e14) {
                                    e = e14;
                                    r42 = flowCollector2;
                                    aVar = new AbstractC25468a.a(e);
                                    this.f121610v = null;
                                    this.f121608t = null;
                                    this.f121609u = 5;
                                    if (r42.mo12109b(aVar, this) == m142578e) {
                                        return m142578e;
                                    }
                                    return C24848g0.f119245a;
                                }
                            }
                            FlowCollector flowCollector8 = flowCollector7;
                            this.f121612x.m131609c().put(m120002o, arrayList7);
                            flowCollector7 = flowCollector8;
                        }
                    }
                    flowCollector3 = flowCollector7;
                    arrayList2 = arrayList7;
                } catch (Exception e15) {
                    e = e15;
                    flowCollector2 = flowCollector7;
                }
            } else {
                flowCollector3 = flowCollector7;
                try {
                    Object obj5 = this.f121612x.m131609c().get(m120002o);
                    AbstractC19074t.m100205c(obj5);
                    arrayList2 = (ArrayList) obj5;
                } catch (Exception e16) {
                    e = e16;
                    r52 = flowCollector3;
                    r42 = r52;
                    aVar = new AbstractC25468a.a(e);
                    this.f121610v = null;
                    this.f121608t = null;
                    this.f121609u = 5;
                    if (r42.mo12109b(aVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            }
            AbstractC23262x6.m120004q(m120002o, C18644n.m98531l().mo98465a(null, false), arrayList, false, C19669z.f97573U, arrayList2);
            C24369l0 m131610d = this.f121612x.m131610d();
            int m131612a = this.f121611w.m131612a();
            FlowCollector flowCollector9 = flowCollector3;
            this.f121610v = flowCollector9;
            this.f121608t = arrayList;
            this.f121609u = 2;
            m127455f = m131610d.m127455f(m131612a, this);
            if (m127455f == m142578e) {
                return m142578e;
            }
            flowCollector4 = flowCollector9;
            this.f121610v = flowCollector4;
            this.f121608t = arrayList;
            this.f121609u = 3;
            m113304v = FlowKt.m113304v((Flow) m127455f, this);
            if (m113304v == m142578e) {
            }
            m131185M0 = AbstractC25332a0.m131185M0((Iterable) m113304v);
            ArrayList arrayList322 = new ArrayList();
            while (r3.hasNext()) {
            }
            ArrayList arrayList422 = new ArrayList();
            while (r5.hasNext()) {
            }
            ArrayList arrayList522 = new ArrayList();
            while (r0.hasNext()) {
            }
            ArrayList arrayList622 = new ArrayList();
            while (r5.hasNext()) {
            }
            cVar = new AbstractC25468a.c(new b(arrayList422, arrayList622));
            this.f121610v = flowCollector4;
            this.f121608t = null;
            this.f121609u = 4;
            if (flowCollector4.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25400b0(C24369l0 c24369l0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24369l0.Companion.m127457a() : c24369l0);
    }

    /* renamed from: c */
    public final Map m131609c() {
        return this.f121603b;
    }

    /* renamed from: d */
    public final C24369l0 m131610d() {
        return this.f121602a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new c(aVar, this, null));
    }

    public C25400b0(C24369l0 c24369l0) {
        AbstractC19074t.m100208f(c24369l0, "repo");
        this.f121602a = c24369l0;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f121603b = synchronizedMap;
    }
}
