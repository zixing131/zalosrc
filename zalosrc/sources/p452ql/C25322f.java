package p452ql;

import am.AbstractC0924m0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zalocloud.migration.AbstractC16865e;
import fn0.AbstractC19074t;
import gw.C19669z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import p452ql.InterfaceC25320d;
import p487rl.C25822c;
import p487rl.EnumC25824e;
import p487rl.EnumC25825f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;

/* renamed from: ql.f */
/* loaded from: classes3.dex */
public final class C25322f implements InterfaceC25320d {

    /* renamed from: a */
    private final C25319c f121453a;

    /* renamed from: b */
    private final C19669z f121454b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.f$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f121455s;

        /* renamed from: t */
        /* synthetic */ Object f121456t;

        /* renamed from: v */
        int f121458v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121456t = obj;
            this.f121458v |= Integer.MIN_VALUE;
            return C25322f.this.mo131120b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f121459s;

        /* renamed from: t */
        /* synthetic */ Object f121460t;

        /* renamed from: v */
        int f121462v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121460t = obj;
            this.f121462v |= Integer.MIN_VALUE;
            return C25322f.this.mo131130l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.f$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f121463s;

        /* renamed from: u */
        int f121465u;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121463s = obj;
            this.f121465u |= Integer.MIN_VALUE;
            return C25322f.this.mo131123e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ql.f$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f121466s;

        /* renamed from: u */
        int f121468u;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121466s = obj;
            this.f121468u |= Integer.MIN_VALUE;
            return C25322f.this.mo131125g(this);
        }
    }

    public C25322f(C25319c c25319c, C19669z c19669z) {
        AbstractC19074t.m100208f(c25319c, "dataSource");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        this.f121453a = c25319c;
        this.f121454b = c19669z;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: a */
    public Object mo131119a(AbstractC16864d abstractC16864d, Continuation continuation) {
        Object m142578e;
        Object m131101p = this.f121453a.m131101p(AbstractC16865e.m90098a(abstractC16864d), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131101p == m142578e) {
            return m131101p;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // p452ql.InterfaceC25320d
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo131120b(Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        C25322f c25322f;
        C25319c c25319c;
        C25319c c25319c2;
        C25322f c25322f2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f121458v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f121458v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f121456t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f121458v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                c25322f2 = (C25322f) aVar.f121455s;
                                AbstractC24862s.m129228b(obj);
                                c25322f2.m131144t(false);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c25322f = (C25322f) aVar.f121455s;
                        AbstractC24862s.m129228b(obj);
                        c25319c2 = c25322f.f121453a;
                        aVar.f121455s = c25322f;
                        aVar.f121458v = 3;
                        if (c25319c2.m131095h("cloud_media_migration", aVar) == m142578e) {
                            return m142578e;
                        }
                        c25322f2 = c25322f;
                        c25322f2.m131144t(false);
                        return C24848g0.f119245a;
                    }
                    c25322f = (C25322f) aVar.f121455s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    aVar.f121455s = this;
                    aVar.f121458v = 1;
                    if (InterfaceC25320d.a.m131139b(this, null, aVar, 1, null) == m142578e) {
                        return m142578e;
                    }
                    c25322f = this;
                }
                c25319c = c25322f.f121453a;
                aVar.f121455s = c25322f;
                aVar.f121458v = 2;
                if (C25319c.m131088g(c25319c, null, aVar, 1, null) == m142578e) {
                    return m142578e;
                }
                c25319c2 = c25322f.f121453a;
                aVar.f121455s = c25322f;
                aVar.f121458v = 3;
                if (c25319c2.m131095h("cloud_media_migration", aVar) == m142578e) {
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f121456t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f121458v;
        if (i11 == 0) {
        }
        c25319c = c25322f.f121453a;
        aVar.f121455s = c25322f;
        aVar.f121458v = 2;
        if (C25319c.m131088g(c25319c, null, aVar, 1, null) == m142578e) {
        }
        c25319c2 = c25322f.f121453a;
        aVar.f121455s = c25322f;
        aVar.f121458v = 3;
        if (c25319c2.m131095h("cloud_media_migration", aVar) == m142578e) {
        }
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: c */
    public Object mo131121c(List list, List list2, Continuation continuation) {
        return C25319c.m131087c(this.f121453a, null, list, list2, continuation, 1, null);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: d */
    public Object mo131122d(Continuation continuation) {
        return this.f121453a.m131098m(continuation);
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
        c cVar;
        Object m142578e;
        int i11;
        C25822c c25822c;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f121465u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f121465u = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f121463s;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f121465u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25319c c25319c = this.f121453a;
                    cVar.f121465u = 1;
                    obj = c25319c.m131099n("cloud_media_migration", cVar);
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
        cVar = new c(continuation);
        Object obj2 = cVar.f121463s;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f121465u;
        if (i11 == 0) {
        }
        c25822c = (C25822c) obj2;
        if (c25822c == null) {
        }
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: f */
    public void mo131124f(int i11) {
        AbstractC0924m0.m3063Fq(i11);
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
        d dVar;
        Object m142578e;
        int i11;
        C25822c c25822c;
        long j11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f121468u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f121468u = i12 - Integer.MIN_VALUE;
                Object obj = dVar.f121466s;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f121468u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25319c c25319c = this.f121453a;
                    dVar.f121468u = 1;
                    obj = c25319c.m131099n("cloud_media_migration", dVar);
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
        dVar = new d(continuation);
        Object obj2 = dVar.f121466s;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f121468u;
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
        Object m131104s = this.f121453a.m131104s(str, enumC25825f, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131104s == m142578e) {
            return m131104s;
        }
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: i */
    public boolean mo131127i() {
        return AbstractC0924m0.m3426Sc();
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: j */
    public Object mo131128j(int i11, Continuation continuation) {
        return this.f121453a.m131092d("cloud_media_migration", i11, continuation);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: k */
    public Object mo131129k(List list, Continuation continuation) {
        Object m142578e;
        Object m131100o = this.f121453a.m131100o(list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131100o == m142578e) {
            return m131100o;
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
        b bVar;
        Object m142578e;
        int i11;
        C25322f c25322f;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f121462v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f121462v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f121460t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f121462v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25322f = (C25322f) bVar.f121459s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    bVar.f121459s = this;
                    bVar.f121462v = 1;
                    obj = mo131122d(bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c25322f = this;
                }
                Set set = (Set) obj;
                c25322f.f121454b.m103229t0();
                List m103199P = c25322f.f121454b.m103199P();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m103199P) {
                    ContactProfile contactProfile = (ContactProfile) obj2;
                    if (!set.contains(contactProfile.f42434r) && !AbstractC19074t.m100204b(contactProfile.f42434r, "204278670")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        bVar = new b(continuation);
        Object obj3 = bVar.f121460t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f121462v;
        if (i11 == 0) {
        }
        Set set2 = (Set) obj3;
        c25322f.f121454b.m103229t0();
        List m103199P2 = c25322f.f121454b.m103199P();
        ArrayList arrayList2 = new ArrayList();
        while (r0.hasNext()) {
        }
        return arrayList2;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: m */
    public Object mo131131m(List list, List list2, int i11, int i12, Continuation continuation) {
        return C25319c.m131089k(this.f121453a, null, list, list2, i11, i12, continuation, 1, null);
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: n */
    public Object mo131132n(String str, Continuation continuation) {
        Object m142578e;
        Object m131102q = this.f121453a.m131102q(str, continuation);
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
        Object m131093e = this.f121453a.m131093e(null, list, continuation);
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
        Object m131103r = this.f121453a.m131103r(str, enumC25824e, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m131103r == m142578e) {
            return m131103r;
        }
        return C24848g0.f119245a;
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: r */
    public int mo131136r() {
        return AbstractC0924m0.m3073G7();
    }

    @Override // p452ql.InterfaceC25320d
    /* renamed from: s */
    public Object mo131137s(List list, List list2, Continuation continuation) {
        return C25319c.m131090l(this.f121453a, null, list, list2, continuation, 1, null);
    }

    /* renamed from: t */
    public void m131144t(boolean z11) {
        AbstractC0924m0.m3121Hq(z11);
    }
}
