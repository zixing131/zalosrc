package p452ql;

import am.AbstractC0924m0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zalocloud.migration.AbstractC16865e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import p452ql.InterfaceC25320d;
import p487rl.C25822c;
import p487rl.C25823d;
import p487rl.EnumC25824e;
import p487rl.EnumC25825f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25379x0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;

/* renamed from: ql.g */
/* loaded from: classes3.dex */
public final class C25323g implements InterfaceC25320d {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final Set f121469c;

    /* renamed from: a */
    private final C25319c f121470a;

    /* renamed from: b */
    private final C19669z f121471b;

    /* renamed from: ql.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f121472s;

        /* renamed from: t */
        /* synthetic */ Object f121473t;

        /* renamed from: v */
        int f121475v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121473t = obj;
            this.f121475v |= Integer.MIN_VALUE;
            return C25323g.this.mo131120b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.g$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f121476s;

        /* renamed from: u */
        int f121478u;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121476s = obj;
            this.f121478u |= Integer.MIN_VALUE;
            return C25323g.this.mo131122d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.g$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f121479s;

        /* renamed from: t */
        /* synthetic */ Object f121480t;

        /* renamed from: v */
        int f121482v;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121480t = obj;
            this.f121482v |= Integer.MIN_VALUE;
            return C25323g.this.mo131130l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.g$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f121483s;

        /* renamed from: u */
        int f121485u;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121483s = obj;
            this.f121485u |= Integer.MIN_VALUE;
            return C25323g.this.mo131123e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.g$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f121486s;

        /* renamed from: u */
        int f121488u;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121486s = obj;
            this.f121488u |= Integer.MIN_VALUE;
            return C25323g.this.mo131125g(this);
        }
    }

    static {
        Set m131555i;
        m131555i = AbstractC25379x0.m131555i(EnumC25825f.f123208q, EnumC25825f.f123209r);
        f121469c = m131555i;
    }

    public C25323g(C25319c c25319c, C19669z c19669z) {
        AbstractC19074t.m100208f(c25319c, "dataSource");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        this.f121470a = c25319c;
        this.f121471b = c19669z;
    }

    /* renamed from: t */
    private final boolean m131145t(EnumC25825f enumC25825f) {
        return f121469c.contains(enumC25825f);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: a */
    public Object mo131119a(AbstractC16864d abstractC16864d, Continuation continuation) {
        Object m142578e;
        Object m131101p = this.f121470a.m131101p(AbstractC16865e.m90098a(abstractC16864d), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131101p == m142578e) {
            return m131101p;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // p452ql.InterfaceC25320d
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo131120b(Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C25323g c25323g;
        C25319c c25319c;
        C25319c c25319c2;
        C25323g c25323g2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f121475v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f121475v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f121473t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f121475v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                c25323g2 = (C25323g) bVar.f121472s;
                                AbstractC24862s.m129228b(obj);
                                c25323g2.m131146u(false);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c25323g = (C25323g) bVar.f121472s;
                        AbstractC24862s.m129228b(obj);
                        c25319c2 = c25323g.f121470a;
                        bVar.f121472s = c25323g;
                        bVar.f121475v = 3;
                        if (c25319c2.m131095h("my_cloud_migration", bVar) == m142578e) {
                            return m142578e;
                        }
                        c25323g2 = c25323g;
                        c25323g2.m131146u(false);
                        return C24848g0.f119245a;
                    }
                    c25323g = (C25323g) bVar.f121472s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    bVar.f121472s = this;
                    bVar.f121475v = 1;
                    if (InterfaceC25320d.a.m131139b(this, null, bVar, 1, null) == m142578e) {
                        return m142578e;
                    }
                    c25323g = this;
                }
                c25319c = c25323g.f121470a;
                bVar.f121472s = c25323g;
                bVar.f121475v = 2;
                if (c25319c.m131094f("204278670", bVar) == m142578e) {
                    return m142578e;
                }
                c25319c2 = c25323g.f121470a;
                bVar.f121472s = c25323g;
                bVar.f121475v = 3;
                if (c25319c2.m131095h("my_cloud_migration", bVar) == m142578e) {
                }
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f121473t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f121475v;
        if (i11 == 0) {
        }
        c25319c = c25323g.f121470a;
        bVar.f121472s = c25323g;
        bVar.f121475v = 2;
        if (c25319c.m131094f("204278670", bVar) == m142578e) {
        }
        c25319c2 = c25323g.f121470a;
        bVar.f121472s = c25323g;
        bVar.f121475v = 3;
        if (c25319c2.m131095h("my_cloud_migration", bVar) == m142578e) {
        }
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: c */
    public Object mo131121c(List list, List list2, Continuation continuation) {
        return this.f121470a.m131091b("204278670", list, list2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p452ql.InterfaceC25320d
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo131122d(Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        Set m131189Q0;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f121478u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f121478u = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f121476s;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f121478u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25319c c25319c = this.f121470a;
                    cVar.f121478u = 1;
                    obj = c25319c.m131098m(cVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (AbstractC19074t.m100204b((String) obj2, "204278670")) {
                        arrayList.add(obj2);
                    }
                }
                m131189Q0 = AbstractC25332a0.m131189Q0(arrayList);
                return m131189Q0;
            }
        }
        cVar = new c(continuation);
        Object obj3 = cVar.f121476s;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f121478u;
        if (i11 == 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r5.hasNext()) {
        }
        m131189Q0 = AbstractC25332a0.m131189Q0(arrayList2);
        return m131189Q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p452ql.InterfaceC25320d
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo131123e(Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        C25822c c25822c;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f121485u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f121485u = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f121483s;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f121485u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25319c c25319c = this.f121470a;
                    eVar.f121485u = 1;
                    obj = c25319c.m131099n("my_cloud_migration", eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                c25822c = (C25822c) obj;
                if (c25822c == null) {
                    return AbstractC16865e.m90099b(c25822c);
                }
                return null;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f121483s;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f121485u;
        if (i11 == 0) {
        }
        c25822c = (C25822c) obj2;
        if (c25822c == null) {
        }
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: f */
    public void mo131124f(int i11) {
        AbstractC0924m0.m3237Lq(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p452ql.InterfaceC25320d
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo131125g(Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        C25822c c25822c;
        long j11;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f121488u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f121488u = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f121486s;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f121488u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25319c c25319c = this.f121470a;
                    fVar.f121488u = 1;
                    obj = c25319c.m131099n("my_cloud_migration", fVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                c25822c = (C25822c) obj;
                if (c25822c == null) {
                    j11 = c25822c.m133173e();
                } else {
                    j11 = 0;
                }
                return AbstractC29094b.m145342d(j11);
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f121486s;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f121488u;
        if (i11 == 0) {
        }
        c25822c = (C25822c) obj2;
        if (c25822c == null) {
        }
        return AbstractC29094b.m145342d(j11);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: h */
    public Object mo131126h(String str, EnumC25825f enumC25825f, Continuation continuation) {
        Object m142578e;
        Object m131104s = this.f121470a.m131104s(str, enumC25825f, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131104s == m142578e) {
            return m131104s;
        }
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: i */
    public boolean mo131127i() {
        return false;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: j */
    public Object mo131128j(int i11, Continuation continuation) {
        return this.f121470a.m131092d("my_cloud_migration", i11, continuation);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: k */
    public Object mo131129k(List list, Continuation continuation) {
        Object m142578e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m131145t(((C25823d) obj).m133191q())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Object m131100o = this.f121470a.m131100o(arrayList, continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m131100o == m142578e) {
                return m131100o;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p452ql.InterfaceC25320d
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo131130l(Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        C25323g c25323g;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f121482v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f121482v = i12 - Integer.MIN_VALUE;
                Object obj = dVar.f121480t;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f121482v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25323g = (C25323g) dVar.f121479s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    dVar.f121479s = this;
                    dVar.f121482v = 1;
                    obj = mo131122d(dVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c25323g = this;
                }
                Set set = (Set) obj;
                c25323g.f121471b.m103229t0();
                List m103199P = c25323g.f121471b.m103199P();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m103199P) {
                    ContactProfile contactProfile = (ContactProfile) obj2;
                    if (!set.contains(contactProfile.f42434r) && AbstractC19074t.m100204b(contactProfile.f42434r, "204278670")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        dVar = new d(continuation);
        Object obj3 = dVar.f121480t;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f121482v;
        if (i11 == 0) {
        }
        Set set2 = (Set) obj3;
        c25323g.f121471b.m103229t0();
        List m103199P2 = c25323g.f121471b.m103199P();
        ArrayList arrayList2 = new ArrayList();
        while (r0.hasNext()) {
        }
        return arrayList2;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: m */
    public Object mo131131m(List list, List list2, int i11, int i12, Continuation continuation) {
        return this.f121470a.m131096i("204278670", list, list2, i11, i12, continuation);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: n */
    public Object mo131132n(String str, Continuation continuation) {
        Object m142578e;
        Object m131102q = this.f121470a.m131102q(str, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131102q == m142578e) {
            return m131102q;
        }
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: o */
    public boolean mo131133o() {
        return true;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: p */
    public Object mo131134p(List list, Continuation continuation) {
        Object m142578e;
        Object m131093e = this.f121470a.m131093e("204278670", list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131093e == m142578e) {
            return m131093e;
        }
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: q */
    public Object mo131135q(String str, EnumC25824e enumC25824e, Continuation continuation) {
        Object m142578e;
        Object m131103r = this.f121470a.m131103r(str, enumC25824e, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131103r == m142578e) {
            return m131103r;
        }
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: r */
    public int mo131136r() {
        return AbstractC0924m0.m3131I7();
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: s */
    public Object mo131137s(List list, List list2, Continuation continuation) {
        return this.f121470a.m131097j("204278670", list, list2, continuation);
    }

    /* renamed from: u */
    public void m131146u(boolean z11) {
    }
}
