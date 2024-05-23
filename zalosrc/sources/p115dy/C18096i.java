package p115dy;

import ag0.AbstractC0837p0;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.pojo.ShareLinkInfo;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.productcatalog.utils.SendProductSource;
import com.zing.zalocore.CoreUtility;
import cy.C17584c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mm0.AbstractC23350e;
import p115dy.AbstractC18084c1;
import p115dy.AbstractC18088e;
import p115dy.AbstractC18114r;
import p115dy.AbstractC18120u;
import p115dy.C18096i;
import p534u1.AbstractC26941a;
import p589vx.AbstractC28659d;
import p589vx.AbstractC28671p;
import p589vx.C28669n;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p624wx.C29267j;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import sx.C26405g;

/* renamed from: dy.i */
/* loaded from: classes4.dex */
public final class C18096i extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private boolean f91610A;

    /* renamed from: B */
    private final AtomicBoolean f91611B;

    /* renamed from: s */
    private final C28669n f91612s = C28669n.Companion.m143559a();

    /* renamed from: t */
    private AbstractC18120u f91613t = AbstractC18120u.a.f91733a;

    /* renamed from: u */
    private final C1761c0 f91614u;

    /* renamed from: v */
    private final C1761c0 f91615v;

    /* renamed from: w */
    private final LiveData f91616w;

    /* renamed from: x */
    private final LiveData f91617x;

    /* renamed from: y */
    private final InterfaceC24854k f91618y;

    /* renamed from: z */
    private boolean f91619z;

    /* renamed from: dy.i$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.i$b */
    /* loaded from: classes4.dex */
    public static final class b implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C18096i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f91621r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f91621r = interfaceC18505l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m96289d(InterfaceC18505l interfaceC18505l, C18096i c18096i) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(c18096i, "this$0");
            interfaceC18505l.mo205i9(AbstractC18114r.c.f91719a);
            c18096i.m96268q0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m96290e(InterfaceC18505l interfaceC18505l, AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            interfaceC18505l.mo205i9(new AbstractC18114r.a(((AbstractC28671p.a) abstractC28671p).m143579a()));
        }

        /* renamed from: c */
        public final void m96291c(final AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18096i.this.f91611B.compareAndSet(true, false);
            if (abstractC28671p instanceof AbstractC28671p.b) {
                final InterfaceC18505l interfaceC18505l = this.f91621r;
                final C18096i c18096i = C18096i.this;
                AbstractC19444a.m101695c(new Runnable() { // from class: dy.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18096i.c.m96289d(InterfaceC18505l.this, c18096i);
                    }
                });
            } else if (abstractC28671p instanceof AbstractC28671p.a) {
                final InterfaceC18505l interfaceC18505l2 = this.f91621r;
                AbstractC19444a.m101695c(new Runnable() { // from class: dy.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18096i.c.m96290e(InterfaceC18505l.this, abstractC28671p);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96291c((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.i$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ ArrayList f91622q;

        /* renamed from: r */
        final /* synthetic */ SendProductSource f91623r;

        /* renamed from: s */
        final /* synthetic */ AtomicInteger f91624s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f91625t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ArrayList arrayList, SendProductSource sendProductSource, AtomicInteger atomicInteger, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f91622q = arrayList;
            this.f91623r = sendProductSource;
            this.f91624s = atomicInteger;
            this.f91625t = interfaceC18505l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96293c(InterfaceC18505l interfaceC18505l, ArrayList arrayList) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(arrayList, "$shareLinkInfoList");
            interfaceC18505l.mo205i9(new AbstractC18084c1.b(arrayList));
        }

        /* renamed from: b */
        public final void m96294b(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            try {
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    AbstractC28659d abstractC28659d = (AbstractC28659d) ((AbstractC28671p.b) abstractC28671p).m143582a();
                    if (abstractC28659d instanceof AbstractC28659d.a) {
                        String jSONObject = ((AbstractC28659d.a) abstractC28659d).m143404b().toString();
                        AbstractC19074t.m100207e(jSONObject, "toString(...)");
                        ShareLinkInfo shareLinkInfo = new ShareLinkInfo(1, jSONObject);
                        this.f91622q.add(shareLinkInfo);
                        C26405g m48436c = shareLinkInfo.m48436c();
                        if (m48436c != null) {
                            String str = m48436c.f125484g;
                            AbstractC19074t.m100207e(str, "mediaTitle");
                            if (str.length() > 0) {
                                m48436c.f125478a = "";
                            }
                            AbstractC9183a.m49006n(abstractC28659d.m143403a(), new C17584c(this.f91623r, m48436c.f125497t, m48436c.f125471A));
                        }
                    } else {
                        this.f91622q.add(new ShareLinkInfo(1, abstractC28659d.m143403a()));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CatalogListViewModel", e11);
            }
            if (this.f91624s.decrementAndGet() == 0) {
                final InterfaceC18505l interfaceC18505l = this.f91625t;
                final ArrayList arrayList = this.f91622q;
                AbstractC19444a.m101697e(new Runnable() { // from class: dy.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18096i.d.m96293c(InterfaceC18505l.this, arrayList);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96294b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.i$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m96295a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                if (AbstractC9183a.m48999g()) {
                    String m146257l = C18096i.this.m96281h0().m146257l();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadCatalogs [RESULT:SUCCESS] userCatalogs: ");
                    sb2.append(m146257l);
                }
                C18096i.this.m96269r0(AbstractC18120u.c.f91735a);
            } else {
                if (AbstractC9183a.m48999g()) {
                    String m146257l2 = C18096i.this.m96281h0().m146257l();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("loadCatalogs [RESULT:OTHER] userCatalogs: ");
                    sb3.append(m146257l2);
                    sb3.append(", result: ");
                    sb3.append(abstractC28671p);
                }
                if (abstractC28671p instanceof AbstractC28671p.a) {
                    AbstractC28671p.a aVar = (AbstractC28671p.a) abstractC28671p;
                    if (aVar.m143581c()) {
                        C18096i.this.m96269r0(AbstractC18120u.e.f91737a);
                    } else if (aVar.m143580b()) {
                        C18096i.this.m96269r0(AbstractC18120u.c.f91735a);
                    } else {
                        C18096i.this.m96269r0(AbstractC18120u.b.f91734a);
                    }
                }
            }
            C18096i.this.m96268q0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96295a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: dy.i$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29267j mo12V4() {
            C28669n c28669n = C18096i.this.f91612s;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            return c28669n.m143551e0(str);
        }
    }

    public C18096i() {
        InterfaceC24854k m129210a;
        C1761c0 c1761c0 = new C1761c0();
        this.f91614u = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f91615v = c1761c02;
        this.f91616w = c1761c0;
        this.f91617x = c1761c02;
        m129210a = AbstractC24856m.m129210a(new f());
        this.f91618y = m129210a;
        this.f91611B = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m96263W(C18096i c18096i) {
        AbstractC19074t.m100208f(c18096i, "this$0");
        synchronized (c18096i) {
            c18096i.m96269r0(AbstractC18120u.a.f91733a);
            c18096i.m96285n0(true);
            c18096i.m96268q0();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m96264Y(C18096i c18096i) {
        AbstractC19074t.m100208f(c18096i, "this$0");
        c18096i.m96268q0();
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m96265k0(C18096i c18096i, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c18096i.m96283j0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m96266l0(C18096i c18096i) {
        AbstractC19074t.m100208f(c18096i, "this$0");
        synchronized (c18096i) {
            c18096i.m96269r0(AbstractC18120u.a.f91733a);
            c18096i.m96281h0().m146249d(false);
            c18096i.m96285n0(false);
            c18096i.m96268q0();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m96267o0(C18096i c18096i, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c18096i.m96285n0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m96268q0() {
        boolean z11;
        String string;
        EnumC18118t enumC18118t;
        AbstractC9183a.m48999g();
        ArrayList arrayList = new ArrayList();
        List m146252g = m96281h0().m146252g();
        if (AbstractC9183a.m48999g()) {
            AbstractC18120u abstractC18120u = this.f91613t;
            int size = m146252g.size();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateCatalogListItems, loadCatalogListState: ");
            sb2.append(abstractC18120u);
            sb2.append(", catalog count: ");
            sb2.append(size);
        }
        List list = m146252g;
        if ((!list.isEmpty()) && this.f91619z) {
            AbstractC18088e.a aVar = new AbstractC18088e.a(!this.f91610A);
            EnumC18118t enumC18118t2 = EnumC18118t.f91729r;
            aVar.m96246c(enumC18118t2);
            arrayList.add(aVar);
            AbstractC18088e.b bVar = new AbstractC18088e.b(!this.f91610A);
            bVar.m96246c(enumC18118t2);
            arrayList.add(bVar);
        }
        if (!this.f91619z && (!list.isEmpty())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 0;
        for (Object obj : m146252g) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            AbstractC18088e.c cVar = new AbstractC18088e.c((C29259b) obj);
            cVar.m96255j(cVar.m96249d().m146160o());
            if (cVar.m96249d().m146165t() == 1) {
                string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_catalog_num_product_single, Integer.valueOf(cVar.m96249d().m146165t()));
                AbstractC19074t.m100205c(string);
            } else {
                string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_catalog_num_product_multitple, Integer.valueOf(cVar.m96249d().m146165t()));
                AbstractC19074t.m100205c(string);
            }
            cVar.m96253h(string);
            cVar.m96254i(cVar.m96249d().m146153h());
            if (i11 < m146252g.size() - 1) {
                enumC18118t = EnumC18118t.f91729r;
            } else if (z11) {
                enumC18118t = EnumC18118t.f91728q;
            } else {
                enumC18118t = EnumC18118t.f91727p;
            }
            cVar.m96246c(enumC18118t);
            arrayList.add(cVar);
            i11 = i12;
        }
        if (z11) {
            arrayList.add(AbstractC18088e.k.f91596b);
        }
        AbstractC18120u abstractC18120u2 = this.f91613t;
        if (abstractC18120u2 instanceof AbstractC18120u.d) {
            if (m146252g.isEmpty()) {
                arrayList.add(AbstractC18088e.i.f91594b);
            } else {
                arrayList.add(AbstractC18088e.j.f91595b);
            }
        } else if (AbstractC19074t.m100204b(abstractC18120u2, AbstractC18120u.b.f91734a)) {
            if (m146252g.isEmpty()) {
                arrayList.add(AbstractC18088e.g.f91592b);
            } else {
                arrayList.add(AbstractC18088e.f.f91591b);
            }
        } else if (AbstractC19074t.m100204b(abstractC18120u2, AbstractC18120u.e.f91737a)) {
            if (m146252g.isEmpty()) {
                arrayList.add(AbstractC18088e.h.f91593b);
            }
        } else if (AbstractC19074t.m100204b(abstractC18120u2, AbstractC18120u.c.f91735a) && m146252g.isEmpty()) {
            arrayList.add(AbstractC18088e.e.f91590b);
        }
        if (AbstractC9183a.m48999g()) {
            int size2 = arrayList.size();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("updateCatalogListItems: [END], item size: ");
            sb3.append(size2);
        }
        this.f91615v.mo9221n(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final void m96269r0(AbstractC18120u abstractC18120u) {
        this.f91613t = abstractC18120u;
        this.f91614u.mo9221n(abstractC18120u);
    }

    /* renamed from: T */
    public final void m96270T() {
    }

    /* renamed from: U */
    public final void m96271U(C29259b c29259b, DeleteCatalogSource deleteCatalogSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(deleteCatalogSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (!this.f91611B.compareAndSet(false, true)) {
            return;
        }
        interfaceC18505l.mo205i9(AbstractC18114r.b.f91718a);
        String valueOf = String.valueOf(c29259b.m146161p());
        this.f91612s.m143537K(valueOf, c29259b.m146158m(), this.f91612s.m143551e0(valueOf).m146253h(), deleteCatalogSource, new c(interfaceC18505l));
    }

    /* renamed from: V */
    public final void m96272V() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.g
            @Override // java.lang.Runnable
            public final void run() {
                C18096i.m96263W(C18096i.this);
            }
        });
    }

    /* renamed from: X */
    public final void m96273X() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.h
            @Override // java.lang.Runnable
            public final void run() {
                C18096i.m96264Y(C18096i.this);
            }
        });
    }

    /* renamed from: Z */
    public final void m96274Z(C29259b c29259b, SendProductSource sendProductSource, InterfaceC18505l interfaceC18505l) {
        List m131496e;
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(sendProductSource, "sendProductSource");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        m131496e = AbstractC25366r.m131496e(c29259b);
        AtomicInteger atomicInteger = new AtomicInteger(m131496e.size());
        ArrayList arrayList = new ArrayList();
        Iterator it = m131496e.iterator();
        while (it.hasNext()) {
            this.f91612s.m143556q0((C29259b) it.next(), new d(arrayList, sendProductSource, atomicInteger, interfaceC18505l));
        }
    }

    /* renamed from: a0 */
    public final boolean m96275a0(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        C28669n c28669n = this.f91612s;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return c28669n.m143535I(str, c29259b.m146158m());
    }

    /* renamed from: b0 */
    public final LiveData m96276b0() {
        return this.f91617x;
    }

    /* renamed from: c0 */
    public final LiveData m96277c0() {
        return this.f91616w;
    }

    /* renamed from: e0 */
    public final int m96278e0() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: f0 */
    public final int m96279f0() {
        return 0;
    }

    /* renamed from: g0 */
    public final int m96280g0() {
        return 0;
    }

    /* renamed from: h0 */
    public final C29267j m96281h0() {
        return (C29267j) this.f91618y.getValue();
    }

    /* renamed from: i0 */
    public final void m96282i0(AbstractC29263f abstractC29263f) {
        AbstractC19074t.m100208f(abstractC29263f, "localEvent");
        if (AbstractC19074t.m100204b(abstractC29263f, AbstractC29263f.f.f135592b) || AbstractC19074t.m100204b(abstractC29263f, AbstractC29263f.c.f135588b)) {
            m96272V();
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.a) {
            if (m96281h0().m146253h() != ((AbstractC29263f.a) abstractC29263f).m146185c()) {
                m96272V();
                return;
            } else {
                m96273X();
                return;
            }
        }
        if ((abstractC29263f instanceof AbstractC29263f.h) || (abstractC29263f instanceof AbstractC29263f.j) || (abstractC29263f instanceof AbstractC29263f.i) || (abstractC29263f instanceof AbstractC29263f.k) || (abstractC29263f instanceof AbstractC29263f.b) || (abstractC29263f instanceof AbstractC29263f.e)) {
            m96273X();
        }
    }

    /* renamed from: j0 */
    public final void m96283j0(boolean z11) {
        this.f91619z = z11;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.f
            @Override // java.lang.Runnable
            public final void run() {
                C18096i.m96266l0(C18096i.this);
            }
        });
    }

    /* renamed from: m0 */
    public final boolean m96284m0() {
        return this.f91610A;
    }

    /* renamed from: n0 */
    public final void m96285n0(boolean z11) {
        if (this.f91613t instanceof AbstractC18120u.d) {
            return;
        }
        if (AbstractC9183a.m48999g()) {
            boolean z12 = !m96281h0().m146254i().isEmpty();
            boolean m146256k = m96281h0().m146256k();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadCatalogs [START] catalog forceRefreshFromServer: ");
            sb2.append(z11);
            sb2.append(", hasCatalogs: ");
            sb2.append(z12);
            sb2.append(", hasMoreCatalogs: ");
            sb2.append(m146256k);
        }
        if (!z11 && !m96281h0().m146256k() && (!m96281h0().m146254i().isEmpty())) {
            return;
        }
        m96269r0(new AbstractC18120u.d(z11));
        this.f91612s.m143546V(m96281h0(), z11, new e());
    }

    /* renamed from: p0 */
    public final void m96286p0(boolean z11) {
        this.f91610A = z11;
    }
}
