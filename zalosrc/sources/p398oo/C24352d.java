package p398oo;

import am.AbstractC0924m0;
import bo.C2951b1;
import bo.C3000l0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import cu.AbstractC17574a;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import ln0.AbstractC22543l;
import p348mi.AbstractC23309i;
import p509sp.C26359h;
import pm0.AbstractC24845f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import sr.C26368b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: oo.d */
/* loaded from: classes4.dex */
public final class C24352d implements InterfaceC24366k {

    /* renamed from: a */
    private final int f117528a;

    /* renamed from: b */
    private final CoroutineScope f117529b;

    /* renamed from: oo.d$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117530t;

        /* renamed from: u */
        final /* synthetic */ List f117531u;

        /* renamed from: v */
        final /* synthetic */ C24352d f117532v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, C24352d c24352d, Continuation continuation) {
            super(2, continuation);
            this.f117531u = list;
            this.f117532v = c24352d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f117531u, this.f117532v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f117530t == 0) {
                AbstractC24862s.m129228b(obj);
                C7960e.m41971c6().m42601z4(CoreUtility.f89233i, AbstractC17574a.m93601h(this.f117531u, true));
                C7960e.m41971c6().m42070B4(CoreUtility.f89233i, this.f117532v.m127298r());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.d$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117533t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f117533t == 0) {
                AbstractC24862s.m129228b(obj);
                C7960e.m41971c6().m42558v3(CoreUtility.f89233i);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.d$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117534t;

        /* renamed from: u */
        final /* synthetic */ List f117535u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, Continuation continuation) {
            super(2, continuation);
            this.f117535u = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f117535u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f117534t == 0) {
                AbstractC24862s.m129228b(obj);
                C7960e.m41971c6().m42601z4(CoreUtility.f89233i, AbstractC17574a.m93601h(this.f117535u, true));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.d$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117536t;

        /* renamed from: u */
        final /* synthetic */ List f117537u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, Continuation continuation) {
            super(2, continuation);
            this.f117537u = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f117537u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f117536t == 0) {
                AbstractC24862s.m129228b(obj);
                C7960e.m41971c6().m42080C4(CoreUtility.f89233i, AbstractC17574a.m93601h(this.f117537u, true));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.d$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117538t;

        /* renamed from: u */
        final /* synthetic */ List f117539u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, Continuation continuation) {
            super(2, continuation);
            this.f117539u = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f117539u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int m131511r;
            int m131400e;
            int m116580c;
            AbstractC28298d.m142578e();
            if (this.f117538t == 0) {
                AbstractC24862s.m129228b(obj);
                C7960e m41971c6 = C7960e.m41971c6();
                List<C3000l0> list = this.f117539u;
                m131511r = AbstractC25370t.m131511r(list, 10);
                m131400e = AbstractC25361o0.m131400e(m131511r);
                m116580c = AbstractC22543l.m116580c(m131400e, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
                for (C3000l0 c3000l0 : list) {
                    String str = c3000l0.f11895q;
                    AbstractC19074t.m100207e(str, "feedContentId");
                    String jSONObject = AbstractC20826v0.m108827p(c3000l0).toString();
                    AbstractC19074t.m100207e(jSONObject, "toString(...)");
                    C24860q c24860q = new C24860q(str, jSONObject);
                    linkedHashMap.put(c24860q.m129215c(), c24860q.m129216d());
                }
                m41971c6.m42114F(linkedHashMap);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.d$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117540t;

        /* renamed from: u */
        final /* synthetic */ List f117541u;

        /* renamed from: v */
        final /* synthetic */ C24352d f117542v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, C24352d c24352d, Continuation continuation) {
            super(2, continuation);
            this.f117541u = list;
            this.f117542v = c24352d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f117541u, this.f117542v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int m131511r;
            int m131400e;
            int m116580c;
            AbstractC28298d.m142578e();
            if (this.f117540t == 0) {
                AbstractC24862s.m129228b(obj);
                C7960e m41971c6 = C7960e.m41971c6();
                String str = CoreUtility.f89233i;
                List<C24377r> list = this.f117541u;
                C24352d c24352d = this.f117542v;
                m131511r = AbstractC25370t.m131511r(list, 10);
                m131400e = AbstractC25361o0.m131400e(m131511r);
                m116580c = AbstractC22543l.m116580c(m131400e, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
                for (C24377r c24377r : list) {
                    linkedHashMap.put(c24377r.m127495a(), new C2951b1(c24377r.m127495a(), c24352d.m127298r(), AbstractC24356f.m127365a(c24377r.m127496b())));
                }
                m41971c6.m42466m9(str, linkedHashMap);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.d$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117543t;

        /* renamed from: u */
        final /* synthetic */ List f117544u;

        /* renamed from: v */
        final /* synthetic */ C24352d f117545v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List list, C24352d c24352d, Continuation continuation) {
            super(2, continuation);
            this.f117544u = list;
            this.f117545v = c24352d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f117544u, this.f117545v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            List m131185M0;
            int m131511r;
            AbstractC28298d.m142578e();
            if (this.f117543t == 0) {
                AbstractC24862s.m129228b(obj);
                m131185M0 = AbstractC25332a0.m131185M0(C7960e.m41971c6().m42150I5(CoreUtility.f89233i, AbstractC17574a.m93601h(this.f117544u, true)).values());
                C24352d c24352d = this.f117545v;
                int size = m131185M0.size();
                List list = m131185M0;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3000l0) it.next()).f11895q + " + \n");
                }
                c24352d.m127281s("Feed Loaded Size: " + size + " \nList: " + arrayList);
                return m131185M0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: oo.d$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117546t;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int m131511r;
            int m131511r2;
            AbstractC28298d.m142578e();
            if (this.f117546t == 0) {
                AbstractC24862s.m129228b(obj);
                Collection values = C7960e.m41971c6().m42358c7(CoreUtility.f89233i).values();
                AbstractC19074t.m100207e(values, "<get-values>(...)");
                C24352d c24352d = C24352d.this;
                ArrayList<C2951b1> arrayList = new ArrayList();
                for (Object obj2 : values) {
                    if (((C2951b1) obj2).m13975b() == c24352d.m127298r()) {
                        arrayList.add(obj2);
                    }
                }
                m131511r = AbstractC25370t.m131511r(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                for (C2951b1 c2951b1 : arrayList) {
                    String m13974a = c2951b1.m13974a();
                    AbstractC19074t.m100207e(m13974a, "getFeedId(...)");
                    arrayList2.add(new C24377r(m13974a, C24377r.Companion.m127499c(c2951b1.m13976c())));
                }
                C24352d c24352d2 = C24352d.this;
                int size = arrayList2.size();
                m131511r2 = AbstractC25370t.m131511r(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(m131511r2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C24377r) it.next()).m127495a() + "\n");
                }
                c24352d2.m127281s("Order Loaded Size: " + size + " \nList: " + arrayList3);
                return arrayList2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.d$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f117549r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.f117549r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m129183b;
            C24352d c24352d = C24352d.this;
            String str = this.f117549r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[DATABASE] Tab " + c24352d.m127298r());
            AbstractC19074t.m100207e(sb2, "append(...)");
            sb2.append('\n');
            AbstractC19074t.m100207e(sb2, "append(...)");
            sb2.append(str);
            AbstractC19074t.m100207e(sb2, "append(...)");
            sb2.append('\n');
            AbstractC19074t.m100207e(sb2, "append(...)");
            m129183b = AbstractC24845f.m129183b(new Exception());
            sb2.append(m129183b);
            AbstractC19074t.m100207e(sb2, "append(...)");
            sb2.append('\n');
            AbstractC19074t.m100207e(sb2, "append(...)");
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            return sb3;
        }
    }

    /* renamed from: oo.d$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117550t;

        /* renamed from: u */
        final /* synthetic */ List f117551u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List list, Continuation continuation) {
            super(2, continuation);
            this.f117551u = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f117551u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f117550t == 0) {
                AbstractC24862s.m129228b(obj);
                C7960e.m41971c6().m42193Ld(this.f117551u);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C24352d(int i11, CoroutineScope coroutineScope) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        this.f117528a = i11;
        this.f117529b = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m127281s(String str) {
        C26359h.f125209a.mo135685a("FEED_TIMELINE", "DATABASE_SOURCE", new i(str));
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: a */
    public Object mo127282a(Continuation continuation) {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() > 0) {
            BuildersKt__Builders_commonKt.m112540d(this.f117529b, null, null, new b(null), 3, null);
        }
        return C24848g0.f119245a;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: b */
    public Object mo127283b(List list, Continuation continuation) {
        List m131502j;
        Object m142578e;
        if (!(!list.isEmpty())) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        Object m112534g = BuildersKt.m112534g(this.f117529b.mo9207O(), new g(list, this, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return (List) m112534g;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: c */
    public Object mo127284c(List list, Continuation continuation) {
        m127281s("Clear All Order Feed");
        if (!list.isEmpty()) {
            BuildersKt__Builders_commonKt.m112540d(this.f117529b, null, null, new a(list, this, null), 3, null);
        }
        return C24848g0.f119245a;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: d */
    public boolean mo127285d() {
        long m2894A2;
        try {
            int m127298r = m127298r();
            if (m127298r != 0) {
                if (m127298r != 1) {
                    m2894A2 = 0;
                } else {
                    m2894A2 = AbstractC0924m0.m2923B2();
                }
            } else {
                m2894A2 = AbstractC0924m0.m2894A2();
            }
            if (!AbstractC23309i.m121367R1()) {
                return false;
            }
            if (System.currentTimeMillis() - m2894A2 <= 43200000) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: e */
    public void mo127286e(long j11) {
        if (m127298r() == 0) {
            AbstractC0924m0.m4091op(j11);
        } else {
            AbstractC0924m0.m4121pp(j11);
        }
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: f */
    public void mo127287f(List list) {
        AbstractC19074t.m100208f(list, "feedIds");
        if (!list.isEmpty()) {
            m127281s("Delete Order Feed " + list);
            BuildersKt__Builders_commonKt.m112540d(this.f117529b, null, null, new d(list, null), 3, null);
        }
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: g */
    public void mo127288g(List list) {
        int m131511r;
        AbstractC19074t.m100208f(list, "feeds");
        if (!list.isEmpty()) {
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3000l0) it.next()).f11895q);
            }
            m127281s("Update Feed " + arrayList);
            BuildersKt__Builders_commonKt.m112540d(this.f117529b, null, null, new j(list, null), 3, null);
        }
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: h */
    public List mo127289h(List list) {
        List m131185M0;
        int m131511r;
        AbstractC19074t.m100208f(list, "feedIds");
        m131185M0 = AbstractC25332a0.m131185M0(C7960e.m41971c6().m42150I5(CoreUtility.f89233i, AbstractC17574a.m93601h(list, true)).values());
        int size = m131185M0.size();
        List list2 = m131185M0;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3000l0) it.next()).f11895q + " + \n");
        }
        m127281s("Feed Loaded Size: " + size + " \nList: " + arrayList);
        return m131185M0;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: i */
    public Object mo127290i(List list, Continuation continuation) {
        int m131511r;
        Object m142578e;
        if (!list.isEmpty()) {
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C24377r) it.next()).m127495a());
            }
            m127281s("Insert Order Feed " + arrayList);
            Object m112534g = BuildersKt.m112534g(this.f117529b.mo9207O(), new f(list, this, null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112534g == m142578e) {
                return m112534g;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: j */
    public void mo127291j(String str) {
        AbstractC19074t.m100208f(str, "value");
        if (m127298r() == 0) {
            AbstractC0924m0.m3171Ji(str);
        } else {
            AbstractC0924m0.m3200Ki(str);
        }
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: k */
    public Object mo127292k(Continuation continuation) {
        long currentTimeMillis = System.currentTimeMillis();
        int m127298r = m127298r();
        if (m127298r != 0) {
            if (m127298r == 1) {
                AbstractC0924m0.m4409zj(currentTimeMillis);
            }
        } else {
            AbstractC0924m0.m4380yj(currentTimeMillis);
        }
        return C24848g0.f119245a;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: l */
    public void mo127293l(List list) {
        AbstractC19074t.m100208f(list, "feedIds");
        if (!list.isEmpty()) {
            m127281s("Delete Feed " + list);
            BuildersKt__Builders_commonKt.m112540d(this.f117529b, null, null, new c(list, null), 3, null);
        }
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: m */
    public String mo127294m() {
        String m3212L1;
        String str;
        if (m127298r() == 0) {
            m3212L1 = AbstractC0924m0.m3183K1();
            str = "getLastFeedIdRemoteTabMain(...)";
        } else {
            m3212L1 = AbstractC0924m0.m3212L1();
            str = "getLastFeedIdRemoteTabOther(...)";
        }
        AbstractC19074t.m100207e(m3212L1, str);
        return m3212L1;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: n */
    public long mo127295n() {
        if (m127298r() == 0) {
            return AbstractC0924m0.m2927B6();
        }
        return AbstractC0924m0.m2956C6();
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: o */
    public Object mo127296o(List list, Continuation continuation) {
        int m131511r;
        Object m142578e;
        if (!list.isEmpty()) {
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3000l0) it.next()).f11895q);
            }
            m127281s("Insert Feed " + arrayList);
            Object m112534g = BuildersKt.m112534g(this.f117529b.mo9207O(), new e(list, null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112534g == m142578e) {
                return m112534g;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    @Override // p398oo.InterfaceC24366k
    /* renamed from: p */
    public Object mo127297p(Continuation continuation) {
        return BuildersKt.m112534g(this.f117529b.mo9207O(), new h(null), continuation);
    }

    /* renamed from: r */
    public int m127298r() {
        return this.f117528a;
    }

    public /* synthetic */ C24352d(int i11, CoroutineScope coroutineScope, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? C26368b.f125264a.m135774a().m135771c() : coroutineScope);
    }
}
