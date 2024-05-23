package p589vx;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.AddCatalogSource;
import com.zing.zalo.productcatalog.utils.AddProductSource;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.productcatalog.utils.DeleteProductSource;
import com.zing.zalo.productcatalog.utils.EditCatalogSource;
import com.zing.zalo.productcatalog.utils.EditProductSource;
import com.zing.zalo.productcatalog.utils.MoveProductSource;
import com.zing.zalocore.CoreUtility;
import cy.C17582a;
import cy.C17583b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p363nh.C23744a;
import p589vx.AbstractC28658c;
import p589vx.AbstractC28659d;
import p589vx.AbstractC28670o;
import p589vx.AbstractC28671p;
import p609wh.AbstractC29039u0;
import p624wx.AbstractC29261d;
import p624wx.AbstractC29263f;
import p624wx.AbstractC29266i;
import p624wx.C29258a;
import p624wx.C29259b;
import p624wx.C29260c;
import p624wx.C29262e;
import p624wx.C29265h;
import p624wx.C29267j;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: vx.n */
/* loaded from: classes4.dex */
public final class C28669n {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final C28669n f132998h = new C28669n(C28666k.f132918a, C28667l.f132972a);

    /* renamed from: a */
    private final C28666k f132999a;

    /* renamed from: b */
    private final C28667l f133000b;

    /* renamed from: c */
    private final Map f133001c;

    /* renamed from: d */
    private final Map f133002d;

    /* renamed from: e */
    private final Map f133003e;

    /* renamed from: f */
    private final Map f133004f;

    /* renamed from: g */
    private C29258a f133005g;

    /* renamed from: vx.n$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC0939u {
        a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                long abs = Math.abs(System.currentTimeMillis() - AbstractC0924m0.m4130q4());
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Check clean data: intervalCleanData: ");
                    sb2.append(abs);
                    sb2.append(", INTERVAL_CLEAN_DATA: 604800000");
                }
                if (abs > 604800000) {
                    C28669n.this.m143547Y().m143455p();
                    AbstractC0924m0.m3522Vl(System.currentTimeMillis());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogRepo", e11);
            }
        }
    }

    /* renamed from: vx.n$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28669n m143559a() {
            return C28669n.f132998h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29259b f133007q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133008r;

        /* renamed from: s */
        final /* synthetic */ String f133009s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f133010t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C29259b c29259b, C28669n c28669n, String str, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133007q = c29259b;
            this.f133008r = c28669n;
            this.f133009s = str;
            this.f133010t = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143560a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (AbstractC9183a.m48999g()) {
                long m146158m = this.f133007q.m146158m();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("addCatalog [RESULT] catalogId: ");
                sb2.append(m146158m);
                sb2.append(", result: ");
                sb2.append(abstractC28671p);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C28656a c28656a = (C28656a) ((AbstractC28671p.b) abstractC28671p).m143582a();
                C29259b m143392a = c28656a.m143392a();
                C29267j c29267j = (C29267j) this.f133008r.f133001c.get(this.f133009s);
                if (c29267j != null) {
                    c29267j.m146247b(m143392a);
                    this.f133008r.m143547Y().m143443D(c29267j.m146258m(), c29267j.m146252g());
                }
                if (c28656a.m143394c()) {
                    AbstractC9183a.m48999g();
                    this.f133008r.m143495P();
                } else if (c29267j != null) {
                    C28669n c28669n = this.f133008r;
                    c29267j.m146259n(c28656a.m143393b());
                    c28669n.m143547Y().m143442C(c29267j.m146258m(), c29267j.m146253h());
                }
                this.f133010t.mo205i9(new AbstractC28671p.b(m143392a));
                C28669n.m143524r(this.f133008r, m143392a, c28656a.m143393b(), false, 4, null);
                return;
            }
            if (abstractC28671p instanceof AbstractC28671p.a) {
                this.f133010t.mo205i9(abstractC28671p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143560a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f133011q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133012r;

        /* renamed from: s */
        final /* synthetic */ String f133013s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f133014t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j11, C28669n c28669n, String str, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133011q = j11;
            this.f133012r = c28669n;
            this.f133013s = str;
            this.f133014t = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143561a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (AbstractC9183a.m48999g()) {
                long j11 = this.f133011q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("addProduct [RESULT] catalogId: ");
                sb2.append(j11);
                sb2.append(", result: ");
                sb2.append(abstractC28671p);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C28657b c28657b = (C28657b) ((AbstractC28671p.b) abstractC28671p).m143582a();
                Product m143399e = c28657b.m143399e();
                C28669n c28669n = this.f133012r;
                String str = this.f133013s;
                AbstractC19074t.m100207e(str, "$currentUserUid");
                C29259b m143545U = c28669n.m143545U(str, this.f133011q);
                C29267j c29267j = (C29267j) this.f133012r.f133001c.get(this.f133013s);
                if (m143545U != null) {
                    if (m143545U.m146162q(m143399e.m48485i()) == null) {
                        m143545U.m146143E(m143545U.m146165t() + 1);
                    }
                    m143545U.m146147b(m143399e);
                    this.f133012r.m143547Y().m143447f(m143545U, m143399e);
                } else {
                    this.f133012r.m143547Y().m143441A(this.f133011q, m143399e);
                }
                if (c28657b.m143397c()) {
                    if (AbstractC9183a.m48999g()) {
                        long j12 = this.f133011q;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("addProduct [RESULT] catalogId: ");
                        sb3.append(j12);
                        sb3.append(", Version is obsolete. RE-SYNC DATA!!!");
                    }
                    C28669n c28669n2 = this.f133012r;
                    String str2 = this.f133013s;
                    AbstractC19074t.m100207e(str2, "$currentUserUid");
                    c28669n2.m143494O(str2, this.f133011q);
                    this.f133012r.m143528u();
                } else {
                    if (m143545U != null) {
                        C28669n c28669n3 = this.f133012r;
                        m143545U.m146145G(c28657b.m143396b());
                        if (c28657b.m143398d() != null) {
                            m143545U.m146169x(c28657b.m143398d());
                        }
                        c28669n3.m143547Y().m143446I(m143545U);
                    }
                    if (c29267j != null) {
                        C28669n c28669n4 = this.f133012r;
                        c29267j.m146259n(c28657b.m143395a());
                        c28669n4.m143547Y().m143442C(c29267j.m146258m(), c29267j.m146253h());
                    }
                }
                this.f133014t.mo205i9(new AbstractC28671p.b(m143399e));
                C28669n.m143487B(this.f133012r, m143399e, c28657b.m143396b(), false, 4, null);
                return;
            }
            if (abstractC28671p instanceof AbstractC28671p.a) {
                this.f133014t.mo205i9(abstractC28671p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143561a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f133015q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133016r;

        /* renamed from: s */
        final /* synthetic */ String f133017s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f133018t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11, C28669n c28669n, String str, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133015q = j11;
            this.f133016r = c28669n;
            this.f133017s = str;
            this.f133018t = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143562a(AbstractC28671p abstractC28671p) {
            List m131496e;
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (AbstractC9183a.m48999g()) {
                long j11 = this.f133015q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deleteCatalog [RESULT] catalogId: ");
                sb2.append(j11);
                sb2.append(", result: ");
                sb2.append(abstractC28671p);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C28660e c28660e = (C28660e) ((AbstractC28671p.b) abstractC28671p).m143582a();
                long m143406b = c28660e.m143406b();
                C29267j c29267j = (C29267j) this.f133016r.f133001c.get(this.f133017s);
                m131496e = AbstractC25366r.m131496e(Long.valueOf(m143406b));
                if (c29267j != null) {
                    c29267j.m146250e(m131496e);
                }
                this.f133016r.m143547Y().m143453n(m131496e);
                this.f133018t.mo205i9(abstractC28671p);
                if (c28660e.m143407c()) {
                    if (AbstractC9183a.m48999g()) {
                        long j12 = this.f133015q;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("deleteCatalog [RESULT] catalogId: ");
                        sb3.append(j12);
                        sb3.append(", Version is obsolete. RE-SYNC DATA!!!");
                    }
                    this.f133016r.m143495P();
                } else if (c29267j != null) {
                    C28669n c28669n = this.f133016r;
                    c29267j.m146259n(c28660e.m143405a());
                    c28669n.m143547Y().m143442C(c29267j.m146258m(), c29267j.m146253h());
                }
                C28669n.m143532x(this.f133016r, m131496e, c28660e.m143405a(), false, 4, null);
                if (c29267j != null && c29267j.m146254i().isEmpty()) {
                    AbstractC9183a.m48999g();
                    this.f133016r.m143528u();
                    return;
                }
                return;
            }
            this.f133018t.mo205i9(abstractC28671p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143562a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f133019q;

        /* renamed from: r */
        final /* synthetic */ List f133020r;

        /* renamed from: s */
        final /* synthetic */ C28669n f133021s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f133022t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j11, List list, C28669n c28669n, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133019q = j11;
            this.f133020r = list;
            this.f133021s = c28669n;
            this.f133022t = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143563a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (AbstractC9183a.m48999g()) {
                long j11 = this.f133019q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deleteProducts [RESULT] catalogId: ");
                sb2.append(j11);
                sb2.append(", result: ");
                sb2.append(abstractC28671p);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C28661f c28661f = (C28661f) ((AbstractC28671p.b) abstractC28671p).m143582a();
                List m143410c = c28661f.m143410c();
                String m48489m = ((Product) this.f133020r.get(0)).m48489m();
                C29259b m143545U = this.f133021s.m143545U(m48489m, this.f133019q);
                C29267j c29267j = (C29267j) this.f133021s.f133001c.get(m48489m);
                if (m143545U != null) {
                    m143545U.m146151f(m143410c);
                }
                this.f133021s.m143547Y().m143454o(this.f133019q, m143410c);
                this.f133022t.mo205i9(abstractC28671p);
                if (c28661f.m143411d()) {
                    if (AbstractC9183a.m48999g()) {
                        long j12 = this.f133019q;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("deleteProducts [RESULT] catalogId: ");
                        sb3.append(j12);
                        sb3.append(", Version is obsolete. RE-SYNC DATA!!!");
                    }
                    this.f133021s.m143494O(m48489m, this.f133019q);
                    this.f133021s.m143528u();
                } else {
                    if (m143545U != null) {
                        C28669n c28669n = this.f133021s;
                        m143545U.m146145G(c28661f.m143409b());
                        m143545U.m146143E(m143545U.m146165t() - m143410c.size());
                        if (c28661f.m143412e() != null) {
                            m143545U.m146169x(c28661f.m143412e());
                        }
                        c28669n.m143547Y().m143446I(m143545U);
                    }
                    if (c29267j != null) {
                        C28669n c28669n2 = this.f133021s;
                        c29267j.m146259n(c28661f.m143408a());
                        c28669n2.m143547Y().m143442C(c29267j.m146258m(), c29267j.m146253h());
                    }
                }
                C28669n.m143491F(this.f133021s, this.f133019q, c28661f.m143409b(), m143410c, false, 8, null);
                if (m143545U != null && m143545U.m146165t() <= 0) {
                    AbstractC9183a.m48999g();
                    this.f133021s.m143530v(this.f133019q);
                    return;
                }
                return;
            }
            this.f133022t.mo205i9(abstractC28671p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143563a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29259b f133023q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133024r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18505l f133025s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C29259b c29259b, C28669n c28669n, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133023q = c29259b;
            this.f133024r = c28669n;
            this.f133025s = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143564a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (AbstractC9183a.m48999g()) {
                long m146158m = this.f133023q.m146158m();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("editCatalog [RESULT] catalogId: ");
                sb2.append(m146158m);
                sb2.append(", result: ");
                sb2.append(abstractC28671p);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C28662g c28662g = (C28662g) ((AbstractC28671p.b) abstractC28671p).m143582a();
                C29259b m143413a = c28662g.m143413a();
                this.f133023q.m146150e(m143413a);
                C29259b m143545U = this.f133024r.m143545U(String.valueOf(this.f133023q.m146161p()), this.f133023q.m146158m());
                if (m143545U != null) {
                    m143545U.m146150e(m143413a);
                }
                this.f133024r.m143547Y().m143463x(this.f133023q);
                this.f133024r.f133004f.remove(AbstractC9183a.m48998f(m143413a));
                if (c28662g.m143415c()) {
                    if (AbstractC9183a.m48999g()) {
                        long m146158m2 = this.f133023q.m146158m();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("editCatalog [RESULT] catalogId: ");
                        sb3.append(m146158m2);
                        sb3.append(", Version is obsolete. RE-SYNC DATA!!!");
                    }
                    this.f133024r.m143495P();
                } else {
                    C29267j c29267j = (C29267j) this.f133024r.f133001c.get(String.valueOf(this.f133023q.m146161p()));
                    if (c29267j != null) {
                        C28669n c28669n = this.f133024r;
                        c29267j.m146259n(c28662g.m143414b());
                        c28669n.m143547Y().m143442C(c29267j.m146258m(), c29267j.m146253h());
                    }
                }
                this.f133025s.mo205i9(new AbstractC28671p.b(m143413a));
                C28669n.m143526t(this.f133024r, m143413a, c28662g.m143414b(), false, 4, null);
                return;
            }
            if (abstractC28671p instanceof AbstractC28671p.a) {
                this.f133025s.mo205i9(abstractC28671p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143564a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f133026q;

        /* renamed from: r */
        final /* synthetic */ Product f133027r;

        /* renamed from: s */
        final /* synthetic */ C28669n f133028s;

        /* renamed from: t */
        final /* synthetic */ String f133029t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f133030u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j11, Product product, C28669n c28669n, String str, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133026q = j11;
            this.f133027r = product;
            this.f133028s = c28669n;
            this.f133029t = str;
            this.f133030u = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143565a(AbstractC28671p abstractC28671p) {
            Product m146162q;
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (AbstractC9183a.m48999g()) {
                long j11 = this.f133026q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("editProduct [RESULT] catalogId: ");
                sb2.append(j11);
                sb2.append(", result: ");
                sb2.append(abstractC28671p);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C28663h c28663h = (C28663h) ((AbstractC28671p.b) abstractC28671p).m143582a();
                Product m143420e = c28663h.m143420e();
                this.f133027r.m48478b(m143420e);
                C29259b m143545U = this.f133028s.m143545U(this.f133027r.m48489m(), this.f133026q);
                C29267j c29267j = (C29267j) this.f133028s.f133001c.get(this.f133029t);
                if (m143545U != null && (m146162q = m143545U.m146162q(this.f133027r.m48485i())) != null) {
                    m146162q.m48478b(this.f133027r);
                }
                this.f133028s.m143547Y().m143441A(this.f133026q, this.f133027r);
                this.f133028s.f133003e.remove(AbstractC9183a.m49001i(m143420e));
                if (c28663h.m143418c()) {
                    if (AbstractC9183a.m48999g()) {
                        long j12 = this.f133026q;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("editProduct [RESULT] catalogId: ");
                        sb3.append(j12);
                        sb3.append(", Version is obsolete. RE-SYNC DATA!!!");
                    }
                    C28669n c28669n = this.f133028s;
                    String str = this.f133029t;
                    AbstractC19074t.m100207e(str, "$currentUserUid");
                    c28669n.m143494O(str, this.f133026q);
                    this.f133028s.m143528u();
                } else {
                    if (m143545U != null) {
                        C28669n c28669n2 = this.f133028s;
                        m143545U.m146145G(c28663h.m143417b());
                        if (c28663h.m143419d() != null) {
                            m143545U.m146169x(c28663h.m143419d());
                        }
                        c28669n2.m143547Y().m143446I(m143545U);
                    }
                    if (c29267j != null) {
                        C28669n c28669n3 = this.f133028s;
                        c29267j.m146259n(c28663h.m143416a());
                        c28669n3.m143547Y().m143442C(c29267j.m146258m(), c29267j.m146253h());
                    }
                }
                this.f133030u.mo205i9(new AbstractC28671p.b(m143420e));
                C28669n.m143489D(this.f133028s, m143420e, c28663h.m143417b(), false, 4, null);
                return;
            }
            if (abstractC28671p instanceof AbstractC28671p.a) {
                this.f133030u.mo205i9(abstractC28671p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143565a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f133031q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133031q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143566a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "resultFromDB");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                this.f133031q.mo205i9(abstractC28671p);
            } else {
                this.f133031q.mo205i9(abstractC28671p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143566a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f133032q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133033r;

        /* renamed from: s */
        final /* synthetic */ C29267j f133034s;

        /* renamed from: vx.n$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f133035q;

            /* renamed from: r */
            final /* synthetic */ AbstractC28671p f133036r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, AbstractC28671p abstractC28671p) {
                super(1);
                this.f133035q = interfaceC18505l;
                this.f133036r = abstractC28671p;
            }

            /* renamed from: a */
            public final void m143568a(AbstractC28671p abstractC28671p) {
                AbstractC19074t.m100208f(abstractC28671p, "resultFromLocal");
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    this.f133035q.mo205i9(abstractC28671p);
                } else {
                    this.f133035q.mo205i9(this.f133036r);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m143568a((AbstractC28671p) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC18505l interfaceC18505l, C28669n c28669n, C29267j c29267j) {
            super(1);
            this.f133032q = interfaceC18505l;
            this.f133033r = c28669n;
            this.f133034s = c29267j;
        }

        /* renamed from: a */
        public final void m143567a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "resultFromRemote");
            if (!(abstractC28671p instanceof AbstractC28671p.b)) {
                this.f133033r.m143496W(this.f133034s, new a(this.f133032q, abstractC28671p));
            } else {
                this.f133032q.mo205i9(abstractC28671p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143567a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: vx.n$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29267j f133037q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133038r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18505l f133039s;

        /* renamed from: t */
        final /* synthetic */ long f133040t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C29267j c29267j, C28669n c28669n, InterfaceC18505l interfaceC18505l, long j11) {
            super(1);
            this.f133037q = c29267j;
            this.f133038r = c28669n;
            this.f133039s = interfaceC18505l;
            this.f133040t = j11;
        }

        /* renamed from: a */
        public final void m143569a(AbstractC28671p abstractC28671p) {
            long j11;
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                if (AbstractC9183a.m48999g()) {
                    String m146257l = this.f133037q.m146257l();
                    String m146176e = ((C29260c) ((AbstractC28671p.b) abstractC28671p).m143582a()).m146176e();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getCatalogsFromLocalDataSource [RESULT:SUCCESS] userCatalogs: ");
                    sb2.append(m146257l);
                    sb2.append(", page: ");
                    sb2.append(m146176e);
                }
                C29267j c29267j = this.f133037q;
                long j12 = this.f133040t;
                InterfaceC18505l interfaceC18505l = this.f133039s;
                synchronized (c29267j) {
                    try {
                        C29260c m146255j = c29267j.m146255j();
                        if (m146255j != null) {
                            j11 = m146255j.m146177f();
                        } else {
                            j11 = 0;
                        }
                        if (j12 != j11) {
                            if (AbstractC9183a.m48999g()) {
                                AbstractC23350e.m122774d("ProductCatalogRepo", "getCatalogsFromLocalDataSource [RESULT:SUCCESS] userCatalogs: " + c29267j.m146257l() + "\nLastID has changed, discard data.\nlastItemIdBeforeRequest: " + j12 + ", lastItemIdAfterRequest: " + j11);
                            }
                            if (c29267j.m146255j() != null) {
                                C29260c m146255j2 = c29267j.m146255j();
                                AbstractC19074t.m100205c(m146255j2);
                                interfaceC18505l.mo205i9(new AbstractC28671p.b(m146255j2));
                            } else {
                                int m104491c = AbstractC28665j.m143428d().m104491c();
                                String m104492d = AbstractC28665j.m143428d().m104492d();
                                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                                interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
                            }
                            return;
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC28671p.b bVar = (AbstractC28671p.b) abstractC28671p;
                        this.f133038r.m143527t0(((C29260c) bVar.m143582a()).m146173b());
                        this.f133039s.mo205i9(new AbstractC28671p.b(this.f133037q.m146248c((C29260c) bVar.m143582a(), this.f133038r.f133002d)));
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (AbstractC9183a.m48999g()) {
                String m146257l2 = this.f133037q.m146257l();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getCatalogsFromLocalDataSource [RESULT:OTHER] userCatalogs: ");
                sb3.append(m146257l2);
                sb3.append(", result: ");
                sb3.append(abstractC28671p);
            }
            this.f133039s.mo205i9(abstractC28671p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143569a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: vx.n$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29267j f133041q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133042r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18505l f133043s;

        /* renamed from: t */
        final /* synthetic */ long f133044t;

        /* renamed from: u */
        final /* synthetic */ AbstractC29261d f133045u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C29267j c29267j, C28669n c28669n, InterfaceC18505l interfaceC18505l, long j11, AbstractC29261d abstractC29261d) {
            super(1);
            this.f133041q = c29267j;
            this.f133042r = c28669n;
            this.f133043s = interfaceC18505l;
            this.f133044t = j11;
            this.f133045u = abstractC29261d;
        }

        /* renamed from: a */
        public final void m143570a(AbstractC28658c abstractC28658c) {
            AbstractC29261d abstractC29261d;
            long j11;
            AbstractC19074t.m100208f(abstractC28658c, "result");
            if (AbstractC9183a.m48999g()) {
                String m146257l = this.f133041q.m146257l();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getCatalogsFromRemoteDataSource [RESULT] userCatalogs: ");
                sb2.append(m146257l);
                sb2.append(", result: ");
                sb2.append(abstractC28658c);
            }
            if (abstractC28658c instanceof AbstractC28658c.c) {
                if (AbstractC9183a.m48999g()) {
                    String m146257l2 = this.f133041q.m146257l();
                    String m146176e = ((C29260c) ((AbstractC28658c.c) abstractC28658c).m143402a()).m146176e();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getCatalogsFromRemoteDataSource [RESULT:SUCCESS] userCatalogs: ");
                    sb3.append(m146257l2);
                    sb3.append(" page: ");
                    sb3.append(m146176e);
                }
                C29267j c29267j = this.f133041q;
                AbstractC29261d abstractC29261d2 = this.f133045u;
                long j12 = this.f133044t;
                InterfaceC18505l interfaceC18505l = this.f133043s;
                synchronized (c29267j) {
                    try {
                        C29260c m146255j = c29267j.m146255j();
                        if (m146255j != null) {
                            abstractC29261d = m146255j.m146174c();
                        } else {
                            abstractC29261d = null;
                        }
                        C29260c m146255j2 = c29267j.m146255j();
                        if (m146255j2 != null) {
                            j11 = m146255j2.m146177f();
                        } else {
                            j11 = 0;
                        }
                        if (AbstractC9183a.m48999g()) {
                            String m146257l3 = c29267j.m146257l();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("getCatalogsFromRemoteDataSource [RESULT:SUCCESS] userCatalogs: ");
                            sb4.append(m146257l3);
                            sb4.append("\ndataSourceBeforeRequest: ");
                            sb4.append(abstractC29261d2);
                            sb4.append(", lastItemIdBeforeRequest: ");
                            sb4.append(j12);
                            sb4.append("\ndataSourceAfterRequest: ");
                            sb4.append(abstractC29261d);
                            sb4.append(", lastItemIdAfterRequest: ");
                            sb4.append(j11);
                        }
                        if (AbstractC19074t.m100204b(abstractC29261d, AbstractC29261d.b.f135579a) && j12 != j11) {
                            if (AbstractC9183a.m48999g()) {
                                AbstractC23350e.m122774d("ProductCatalogRepo", "getCatalogsFromRemoteDataSource [RESULT:SUCCESS] userCatalogs: " + c29267j.m146257l() + "\nLastID has changed, DISCARD DATA!!!");
                            }
                            if (c29267j.m146255j() != null) {
                                C29260c m146255j3 = c29267j.m146255j();
                                AbstractC19074t.m100205c(m146255j3);
                                interfaceC18505l.mo205i9(new AbstractC28671p.b(m146255j3));
                            } else {
                                int m104491c = AbstractC28665j.m143428d().m104491c();
                                String m104492d = AbstractC28665j.m143428d().m104492d();
                                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                                interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
                            }
                            return;
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC28658c.c cVar = (AbstractC28658c.c) abstractC28658c;
                        List m146173b = ((C29260c) cVar.m143402a()).m146173b();
                        C28669n c28669n = this.f133042r;
                        Iterator it = m146173b.iterator();
                        while (it.hasNext()) {
                            c28669n.m143529u0((C29259b) it.next());
                        }
                        this.f133042r.m143527t0(((C29260c) cVar.m143402a()).m146173b());
                        this.f133043s.mo205i9(new AbstractC28671p.b(this.f133041q.m146248c((C29260c) cVar.m143402a(), this.f133042r.f133002d)));
                        this.f133042r.m143547Y().m143443D(this.f133041q.m146258m(), this.f133041q.m146252g());
                        if (((C29260c) cVar.m143402a()).m146172a() > 0) {
                            this.f133041q.m146259n(((C29260c) cVar.m143402a()).m146172a());
                            this.f133042r.m143547Y().m143442C(this.f133041q.m146258m(), this.f133041q.m146253h());
                        }
                        this.f133041q.m146260o(((C29260c) cVar.m143402a()).m146175d());
                        if (this.f133044t == 0) {
                            AbstractC0924m0.m3551Wl(System.currentTimeMillis());
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (abstractC28658c instanceof AbstractC28658c.a) {
                if (AbstractC9183a.m48999g()) {
                    String m146257l4 = this.f133041q.m146257l();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("getCatalogsFromRemoteDataSource [RESULT:DATA UNCHANGED] userCatalogs: ");
                    sb5.append(m146257l4);
                }
                C29267j c29267j2 = this.f133041q;
                InterfaceC18505l interfaceC18505l2 = this.f133043s;
                synchronized (c29267j2) {
                    try {
                        if (c29267j2.m146254i().isEmpty()) {
                            int m104491c2 = AbstractC28665j.m143425a().m104491c();
                            String m104492d2 = AbstractC28665j.m143425a().m104492d();
                            AbstractC19074t.m100207e(m104492d2, "getError_message(...)");
                            interfaceC18505l2.mo205i9(new AbstractC28671p.a(m104491c2, m104492d2));
                        } else if (c29267j2.m146255j() != null) {
                            C29260c m146255j4 = c29267j2.m146255j();
                            AbstractC19074t.m100205c(m146255j4);
                            interfaceC18505l2.mo205i9(new AbstractC28671p.b(m146255j4));
                        } else {
                            int m104491c3 = AbstractC28665j.m143429e().m104491c();
                            String m104492d3 = AbstractC28665j.m143429e().m104492d();
                            AbstractC19074t.m100207e(m104492d3, "getError_message(...)");
                            interfaceC18505l2.mo205i9(new AbstractC28671p.a(m104491c3, m104492d3));
                        }
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            }
            if (abstractC28658c instanceof AbstractC28658c.b) {
                if (AbstractC9183a.m48999g()) {
                    String m146257l5 = this.f133041q.m146257l();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("getCatalogsFromRemoteDataSource [RESULT:ERROR] userCatalogs: ");
                    sb6.append(m146257l5);
                }
                AbstractC28658c.b bVar = (AbstractC28658c.b) abstractC28658c;
                this.f133043s.mo205i9(new AbstractC28671p.a(bVar.m143400a(), bVar.m143401b()));
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143570a((AbstractC28658c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f133046q;

        /* renamed from: r */
        final /* synthetic */ C28669n f133047r;

        /* renamed from: s */
        final /* synthetic */ C29259b f133048s;

        /* renamed from: vx.n$m$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f133049q;

            /* renamed from: r */
            final /* synthetic */ AbstractC28671p f133050r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, AbstractC28671p abstractC28671p) {
                super(1);
                this.f133049q = interfaceC18505l;
                this.f133050r = abstractC28671p;
            }

            /* renamed from: a */
            public final void m143572a(AbstractC28671p abstractC28671p) {
                AbstractC19074t.m100208f(abstractC28671p, "resultFromLocal");
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    this.f133049q.mo205i9(abstractC28671p);
                } else {
                    this.f133049q.mo205i9(this.f133050r);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m143572a((AbstractC28671p) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(InterfaceC18505l interfaceC18505l, C28669n c28669n, C29259b c29259b) {
            super(1);
            this.f133046q = interfaceC18505l;
            this.f133047r = c28669n;
            this.f133048s = c29259b;
        }

        /* renamed from: a */
        public final void m143571a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "resultFromRemote");
            if (!(abstractC28671p instanceof AbstractC28671p.b)) {
                this.f133047r.m143500b0(this.f133048s, new a(this.f133046q, abstractC28671p));
            } else {
                this.f133046q.mo205i9(abstractC28671p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143571a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: vx.n$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29259b f133051q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f133052r;

        /* renamed from: s */
        final /* synthetic */ C28669n f133053s;

        /* renamed from: t */
        final /* synthetic */ long f133054t;

        /* renamed from: vx.n$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f133055q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l) {
                super(1);
                this.f133055q = interfaceC18505l;
            }

            /* renamed from: a */
            public final void m143574a(AbstractC28671p abstractC28671p) {
                AbstractC19074t.m100208f(abstractC28671p, "resultFromRemoteLoadMore");
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    this.f133055q.mo205i9(abstractC28671p);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m143574a((AbstractC28671p) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C29259b c29259b, InterfaceC18505l interfaceC18505l, C28669n c28669n, long j11) {
            super(1);
            this.f133051q = c29259b;
            this.f133052r = interfaceC18505l;
            this.f133053s = c28669n;
            this.f133054t = j11;
        }

        /* renamed from: a */
        public final void m143573a(AbstractC28671p abstractC28671p) {
            long j11;
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                if (AbstractC9183a.m48999g()) {
                    String m146159n = this.f133051q.m146159n();
                    String m146203d = ((C29265h) ((AbstractC28671p.b) abstractC28671p).m143582a()).m146203d();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getProductsFromLocalDataSource [RESULT:SUCCESS] catalog: ");
                    sb2.append(m146159n);
                    sb2.append(" page: ");
                    sb2.append(m146203d);
                }
                C29259b c29259b = this.f133051q;
                long j12 = this.f133054t;
                InterfaceC18505l interfaceC18505l = this.f133052r;
                synchronized (c29259b) {
                    try {
                        C29265h m146155j = c29259b.m146155j();
                        if (m146155j != null) {
                            j11 = m146155j.m146204e();
                        } else {
                            j11 = 0;
                        }
                        if (j12 != j11) {
                            if (AbstractC9183a.m48999g()) {
                                AbstractC23350e.m122774d("ProductCatalogRepo", "getProductsFromLocalDataSource [RESULT:SUCCESS] catalog: " + c29259b.m146159n() + "\nLastID has changed, discard data.\nlastItemIdBeforeRequest: " + j12 + ", lastItemIdAfterRequest: " + j11);
                            }
                            if (c29259b.m146155j() != null) {
                                C29265h m146155j2 = c29259b.m146155j();
                                AbstractC19074t.m100205c(m146155j2);
                                interfaceC18505l.mo205i9(new AbstractC28671p.b(m146155j2));
                            } else {
                                int m104491c = AbstractC28665j.m143428d().m104491c();
                                String m104492d = AbstractC28665j.m143428d().m104492d();
                                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                                interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
                            }
                            return;
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC28671p.b bVar = (AbstractC28671p.b) abstractC28671p;
                        this.f133052r.mo205i9(new AbstractC28671p.b(this.f133051q.m146148c((C29265h) bVar.m143582a())));
                        C29265h c29265h = (C29265h) bVar.m143582a();
                        int size = this.f133051q.m146164s().size();
                        if (this.f133051q.m146165t() > size && !c29265h.m146202c() && size < C29262e.f135580a.m146182b()) {
                            this.f133053s.m143502c0(this.f133051q, new a(this.f133052r));
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (AbstractC9183a.m48999g()) {
                String m146159n2 = this.f133051q.m146159n();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getProductsFromLocalDataSource [RESULT:OTHER] catalog: ");
                sb3.append(m146159n2);
                sb3.append(", result: ");
                sb3.append(abstractC28671p);
            }
            this.f133052r.mo205i9(abstractC28671p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143573a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: vx.n$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29259b f133056q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f133057r;

        /* renamed from: s */
        final /* synthetic */ C28669n f133058s;

        /* renamed from: t */
        final /* synthetic */ AbstractC29261d f133059t;

        /* renamed from: u */
        final /* synthetic */ long f133060u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C29259b c29259b, InterfaceC18505l interfaceC18505l, C28669n c28669n, AbstractC29261d abstractC29261d, long j11) {
            super(1);
            this.f133056q = c29259b;
            this.f133057r = interfaceC18505l;
            this.f133058s = c28669n;
            this.f133059t = abstractC29261d;
            this.f133060u = j11;
        }

        /* renamed from: a */
        public final void m143575a(AbstractC28658c abstractC28658c) {
            AbstractC29261d abstractC29261d;
            long j11;
            AbstractC19074t.m100208f(abstractC28658c, "result");
            if (AbstractC9183a.m48999g()) {
                String m146159n = this.f133056q.m146159n();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getProductsFromRemoteDataSource [RESULT] catalog: ");
                sb2.append(m146159n);
                sb2.append(", result: ");
                sb2.append(abstractC28658c);
            }
            if (abstractC28658c instanceof AbstractC28658c.c) {
                if (AbstractC9183a.m48999g()) {
                    String m146159n2 = this.f133056q.m146159n();
                    String m146203d = ((C29265h) ((AbstractC28658c.c) abstractC28658c).m143402a()).m146203d();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getProductsFromRemoteDataSource [RESULT:SUCCESS] catalog: ");
                    sb3.append(m146159n2);
                    sb3.append(" page: ");
                    sb3.append(m146203d);
                }
                C29259b c29259b = this.f133056q;
                AbstractC29261d abstractC29261d2 = this.f133059t;
                long j12 = this.f133060u;
                InterfaceC18505l interfaceC18505l = this.f133057r;
                synchronized (c29259b) {
                    try {
                        C29265h m146155j = c29259b.m146155j();
                        if (m146155j != null) {
                            abstractC29261d = m146155j.m146201b();
                        } else {
                            abstractC29261d = null;
                        }
                        C29265h m146155j2 = c29259b.m146155j();
                        if (m146155j2 != null) {
                            j11 = m146155j2.m146204e();
                        } else {
                            j11 = 0;
                        }
                        if (AbstractC9183a.m48999g()) {
                            String m146159n3 = c29259b.m146159n();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("getProductsFromRemoteDataSource [RESULT:SUCCESS] catalog: ");
                            sb4.append(m146159n3);
                            sb4.append("\ndataSourceBeforeRequest: ");
                            sb4.append(abstractC29261d2);
                            sb4.append(", lastItemIdBeforeRequest: ");
                            sb4.append(j12);
                            sb4.append("\ndataSourceAfterRequest: ");
                            sb4.append(abstractC29261d);
                            sb4.append(", lastItemIdAfterRequest: ");
                            sb4.append(j11);
                        }
                        if (AbstractC19074t.m100204b(abstractC29261d, AbstractC29261d.b.f135579a) && j12 != j11) {
                            if (AbstractC9183a.m48999g()) {
                                AbstractC23350e.m122774d("ProductCatalogRepo", "getProductsFromRemoteDataSource [RESULT:SUCCESS] catalog: " + c29259b.m146159n() + "\nLastID has changed, DISCARD DATA!!!");
                            }
                            if (c29259b.m146155j() != null) {
                                C29265h m146155j3 = c29259b.m146155j();
                                AbstractC19074t.m100205c(m146155j3);
                                interfaceC18505l.mo205i9(new AbstractC28671p.b(m146155j3));
                            } else {
                                int m104491c = AbstractC28665j.m143428d().m104491c();
                                String m104492d = AbstractC28665j.m143428d().m104492d();
                                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                                interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
                            }
                            return;
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC28658c.c cVar = (AbstractC28658c.c) abstractC28658c;
                        this.f133057r.mo205i9(new AbstractC28671p.b(this.f133056q.m146148c((C29265h) cVar.m143402a())));
                        this.f133058s.m143547Y().m143464z(this.f133056q);
                        if (((C29265h) cVar.m143402a()).m146200a() > 0) {
                            this.f133056q.m146145G(((C29265h) cVar.m143402a()).m146200a());
                            this.f133058s.m143547Y().m143446I(this.f133056q);
                        }
                        this.f133056q.m146141C(((C29265h) cVar.m143402a()).m146202c());
                        return;
                    } finally {
                    }
                }
            }
            if (abstractC28658c instanceof AbstractC28658c.a) {
                if (AbstractC9183a.m48999g()) {
                    String m146159n4 = this.f133056q.m146159n();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("getProductsFromRemoteDataSource [RESULT:DATA UNCHANGED] catalog: ");
                    sb5.append(m146159n4);
                }
                C29259b c29259b2 = this.f133056q;
                InterfaceC18505l interfaceC18505l2 = this.f133057r;
                synchronized (c29259b2) {
                    try {
                        if (c29259b2.m146164s().isEmpty()) {
                            int m104491c2 = AbstractC28665j.m143425a().m104491c();
                            String m104492d2 = AbstractC28665j.m143425a().m104492d();
                            AbstractC19074t.m100207e(m104492d2, "getError_message(...)");
                            interfaceC18505l2.mo205i9(new AbstractC28671p.a(m104491c2, m104492d2));
                        } else if (c29259b2.m146155j() != null) {
                            C29265h m146155j4 = c29259b2.m146155j();
                            AbstractC19074t.m100205c(m146155j4);
                            interfaceC18505l2.mo205i9(new AbstractC28671p.b(m146155j4));
                        } else {
                            int m104491c3 = AbstractC28665j.m143429e().m104491c();
                            String m104492d3 = AbstractC28665j.m143429e().m104492d();
                            AbstractC19074t.m100207e(m104492d3, "getError_message(...)");
                            interfaceC18505l2.mo205i9(new AbstractC28671p.a(m104491c3, m104492d3));
                        }
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            if (abstractC28658c instanceof AbstractC28658c.b) {
                if (AbstractC9183a.m48999g()) {
                    String m146159n5 = this.f133056q.m146159n();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("getProductsFromRemoteDataSource [RESULT:ERROR] catalog: ");
                    sb6.append(m146159n5);
                }
                AbstractC28658c.b bVar = (AbstractC28658c.b) abstractC28658c;
                this.f133057r.mo205i9(new AbstractC28671p.a(bVar.m143400a(), bVar.m143401b()));
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143575a((AbstractC28658c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vx.n$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f133061q;

        /* renamed from: r */
        final /* synthetic */ long f133062r;

        /* renamed from: s */
        final /* synthetic */ C28669n f133063s;

        /* renamed from: t */
        final /* synthetic */ String f133064t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f133065u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(long j11, long j12, C28669n c28669n, String str, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f133061q = j11;
            this.f133062r = j12;
            this.f133063s = c28669n;
            this.f133064t = str;
            this.f133065u = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m143576a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (AbstractC9183a.m48999g()) {
                long j11 = this.f133061q;
                long j12 = this.f133062r;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveProducts [RESULT] fromCatalogId: ");
                sb2.append(j11);
                sb2.append(", toCatalogId: ");
                sb2.append(j12);
                sb2.append(", result: ");
                sb2.append(abstractC28671p);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C28664i c28664i = (C28664i) ((AbstractC28671p.b) abstractC28671p).m143582a();
                List m143422b = c28664i.m143422b();
                C28669n c28669n = this.f133063s;
                String str = this.f133064t;
                AbstractC19074t.m100207e(str, "$ownerId");
                C29259b m143545U = c28669n.m143545U(str, this.f133061q);
                C28669n c28669n2 = this.f133063s;
                String str2 = this.f133064t;
                AbstractC19074t.m100207e(str2, "$ownerId");
                C29259b m143545U2 = c28669n2.m143545U(str2, this.f133062r);
                if (m143545U != null) {
                    m143545U.m146151f(m143422b);
                    m143545U.m146143E(m143545U.m146165t() - m143422b.size());
                    this.f133063s.m143547Y().m143446I(m143545U);
                }
                if (m143545U2 != null) {
                    m143545U2.m146143E(m143545U2.m146165t() + m143422b.size());
                    this.f133063s.m143547Y().m143446I(m143545U2);
                }
                this.f133063s.m143547Y().m143454o(this.f133061q, m143422b);
                this.f133065u.mo205i9(abstractC28671p);
                C28669n.m143493H(this.f133063s, this.f133061q, this.f133062r, m143422b, false, 8, null);
                if (m143545U != null && m143545U.m146167v() == c28664i.m143421a()) {
                    if (m143545U != null && m143545U.m146165t() <= 0) {
                        AbstractC9183a.m48999g();
                        C28669n c28669n3 = this.f133063s;
                        String str3 = this.f133064t;
                        AbstractC19074t.m100207e(str3, "$ownerId");
                        c28669n3.m143494O(str3, this.f133061q);
                    }
                } else {
                    if (AbstractC9183a.m48999g()) {
                        long j13 = this.f133061q;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("moveProducts [RESULT] fromCatalogId: ");
                        sb3.append(j13);
                        sb3.append(", Version is obsolete. RE-SYNC DATA!!!");
                    }
                    C28669n c28669n4 = this.f133063s;
                    String str4 = this.f133064t;
                    AbstractC19074t.m100207e(str4, "$ownerId");
                    c28669n4.m143494O(str4, this.f133061q);
                }
                C28669n c28669n5 = this.f133063s;
                String str5 = this.f133064t;
                AbstractC19074t.m100207e(str5, "$ownerId");
                c28669n5.m143494O(str5, this.f133062r);
                C29267j c29267j = (C29267j) this.f133063s.f133001c.get(this.f133064t);
                if (c29267j != null) {
                    if (c29267j.m146253h() != c28664i.m143424d()) {
                        this.f133063s.m143528u();
                        return;
                    } else {
                        c29267j.m146259n(c28664i.m143423c());
                        this.f133063s.m143547Y().m143442C(c29267j.m146258m(), c29267j.m146253h());
                        return;
                    }
                }
                return;
            }
            this.f133065u.mo205i9(abstractC28671p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m143576a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: vx.n$q */
    /* loaded from: classes4.dex */
    public static final class q implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C0766k f133066a;

        /* renamed from: b */
        final /* synthetic */ C29259b f133067b;

        /* renamed from: c */
        final /* synthetic */ String f133068c;

        /* renamed from: d */
        final /* synthetic */ C28669n f133069d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18505l f133070e;

        q(C0766k c0766k, C29259b c29259b, String str, C28669n c28669n, InterfaceC18505l interfaceC18505l) {
            this.f133066a = c0766k;
            this.f133067b = c29259b;
            this.f133068c = str;
            this.f133069d = c28669n;
            this.f133070e = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC28659d.b bVar = new AbstractC28659d.b(this.f133067b, this.f133068c);
            this.f133069d.f133004f.put(this.f133068c, bVar);
            this.f133070e.mo205i9(new AbstractC28671p.b(bVar));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (AbstractC9183a.m48999g()) {
                    String str = this.f133066a.f2541a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("parseCatalogLink [RESULT: FROM SERVER] linkDataJSON: ");
                    sb2.append(jSONObject);
                }
                C29259b c29259b = this.f133067b;
                String str2 = this.f133068c;
                AbstractC19074t.m100205c(jSONObject);
                AbstractC28659d.a aVar = new AbstractC28659d.a(c29259b, str2, jSONObject);
                this.f133069d.f133004f.put(this.f133068c, aVar);
                this.f133070e.mo205i9(new AbstractC28671p.b(aVar));
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f133066a.f2541a, e11);
                AbstractC28659d.b bVar = new AbstractC28659d.b(this.f133067b, this.f133068c);
                this.f133069d.f133004f.put(this.f133068c, bVar);
                this.f133070e.mo205i9(new AbstractC28671p.b(bVar));
            }
        }
    }

    /* renamed from: vx.n$r */
    /* loaded from: classes4.dex */
    public static final class r implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C0766k f133071a;

        /* renamed from: b */
        final /* synthetic */ Product f133072b;

        /* renamed from: c */
        final /* synthetic */ String f133073c;

        /* renamed from: d */
        final /* synthetic */ C28669n f133074d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18505l f133075e;

        r(C0766k c0766k, Product product, String str, C28669n c28669n, InterfaceC18505l interfaceC18505l) {
            this.f133071a = c0766k;
            this.f133072b = product;
            this.f133073c = str;
            this.f133074d = c28669n;
            this.f133075e = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC28670o.b bVar = new AbstractC28670o.b(this.f133072b, this.f133073c);
            this.f133074d.f133003e.put(this.f133073c, bVar);
            this.f133075e.mo205i9(new AbstractC28671p.b(bVar));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (AbstractC9183a.m48999g()) {
                    String str = this.f133071a.f2541a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("parseProductLink [RESULT: FROM SERVER] linkDataJSON: ");
                    sb2.append(jSONObject);
                }
                Product product = this.f133072b;
                String str2 = this.f133073c;
                AbstractC19074t.m100205c(jSONObject);
                AbstractC28670o.a aVar = new AbstractC28670o.a(product, str2, jSONObject);
                this.f133074d.f133003e.put(this.f133073c, aVar);
                this.f133075e.mo205i9(new AbstractC28671p.b(aVar));
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f133071a.f2541a, e11);
                AbstractC28670o.b bVar = new AbstractC28670o.b(this.f133072b, this.f133073c);
                this.f133074d.f133003e.put(this.f133073c, bVar);
                this.f133075e.mo205i9(new AbstractC28671p.b(bVar));
            }
        }
    }

    /* renamed from: vx.n$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ C29259b f133077b;

        s(C29259b c29259b) {
            this.f133077b = c29259b;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int m143458s = C28669n.this.m143547Y().m143458s(this.f133077b.m146158m());
            if (AbstractC9183a.m48999g()) {
                String m146159n = this.f133077b.m146159n();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("verifyCachedCatalogVersion [START] catalog: ");
                sb2.append(m146159n);
                sb2.append(", catalogVersion: ");
                sb2.append(m143458s);
            }
            if (m143458s >= 0 && m143458s < this.f133077b.m146167v() && AbstractC9183a.m48999g()) {
                String m146159n2 = this.f133077b.m146159n();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("verifyCachedCatalogVersion catalog: ");
                sb3.append(m146159n2);
                sb3.append(", Cached catalog version is obsolete. Clear data!");
                C28669n.this.m143547Y().m143448g(String.valueOf(this.f133077b.m146161p()), this.f133077b.m146158m());
            }
        }
    }

    public C28669n(C28666k c28666k, C28667l c28667l) {
        AbstractC19074t.m100208f(c28666k, "dao");
        AbstractC19074t.m100208f(c28667l, "remoteDataSource");
        this.f132999a = c28666k;
        this.f133000b = c28667l;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f133001c = synchronizedMap;
        this.f133002d = new ConcurrentHashMap();
        Map synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        this.f133003e = synchronizedMap2;
        Map synchronizedMap3 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap3, "synchronizedMap(...)");
        this.f133004f = synchronizedMap3;
        C0824j.m2153b(new a());
    }

    /* renamed from: A */
    private final void m143486A(Product product, int i11, boolean z11) {
        AbstractC29263f.h hVar = new AbstractC29263f.h(product, i11);
        hVar.m146184b(z11);
        C23744a.Companion.m124119a().m124116d(5300, hVar);
    }

    /* renamed from: B */
    static /* synthetic */ void m143487B(C28669n c28669n, Product product, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        c28669n.m143486A(product, i11, z11);
    }

    /* renamed from: C */
    private final void m143488C(Product product, int i11, boolean z11) {
        AbstractC29263f.j jVar = new AbstractC29263f.j(product, i11);
        jVar.m146184b(z11);
        C23744a.Companion.m124119a().m124116d(5300, jVar);
    }

    /* renamed from: D */
    static /* synthetic */ void m143489D(C28669n c28669n, Product product, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        c28669n.m143488C(product, i11, z11);
    }

    /* renamed from: E */
    private final void m143490E(long j11, int i11, List list, boolean z11) {
        AbstractC29263f.i iVar = new AbstractC29263f.i(j11, i11, list);
        iVar.m146184b(z11);
        C23744a.Companion.m124119a().m124116d(5300, iVar);
    }

    /* renamed from: F */
    static /* synthetic */ void m143491F(C28669n c28669n, long j11, int i11, List list, boolean z11, int i12, Object obj) {
        boolean z12;
        if ((i12 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        c28669n.m143490E(j11, i11, list, z12);
    }

    /* renamed from: G */
    private final void m143492G(long j11, long j12, List list, boolean z11) {
        AbstractC29263f.k kVar = new AbstractC29263f.k(j11, j12, list);
        kVar.m146184b(z11);
        C23744a.Companion.m124119a().m124116d(5300, kVar);
    }

    /* renamed from: H */
    static /* synthetic */ void m143493H(C28669n c28669n, long j11, long j12, List list, boolean z11, int i11, Object obj) {
        boolean z12;
        if ((i11 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        c28669n.m143492G(j11, j12, list, z12);
    }

    /* renamed from: O */
    public final void m143494O(String str, long j11) {
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("forceReSyncCatalogData [START] ownerId: ");
            sb2.append(str);
            sb2.append(", catalogId: ");
            sb2.append(j11);
        }
        C29259b m143545U = m143545U(str, j11);
        if (m143545U != null) {
            m143545U.m146149d(true);
        }
        this.f132999a.m143448g(str, j11);
        m143530v(j11);
    }

    /* renamed from: P */
    public final void m143495P() {
        C29267j c29267j = (C29267j) this.f133001c.get(CoreUtility.f89233i);
        if (c29267j != null) {
            c29267j.m146249d(true);
        }
        m143528u();
    }

    /* renamed from: W */
    public final void m143496W(C29267j c29267j, InterfaceC18505l interfaceC18505l) {
        long j11;
        C29260c m146255j = c29267j.m146255j();
        if (m146255j != null) {
            j11 = m146255j.m146177f();
        } else {
            j11 = 0;
        }
        long j12 = j11;
        if (AbstractC9183a.m48999g()) {
            String m146257l = c29267j.m146257l();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getCatalogsFromLocalDataSource [START] userCatalogs: ");
            sb2.append(m146257l);
            sb2.append(", lastItemIdBeforeRequest: ");
            sb2.append(j12);
        }
        this.f132999a.m143462w(c29267j, new k(c29267j, this, interfaceC18505l, j12));
    }

    /* renamed from: X */
    private final void m143497X(C29267j c29267j, InterfaceC18505l interfaceC18505l) {
        AbstractC29261d abstractC29261d;
        long j11;
        if (AbstractC9183a.m48999g()) {
            String m146257l = c29267j.m146257l();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getCatalogsFromRemoteDataSource [START] userCatalogs: ");
            sb2.append(m146257l);
        }
        C29260c m146255j = c29267j.m146255j();
        if (m146255j != null) {
            abstractC29261d = m146255j.m146174c();
        } else {
            abstractC29261d = null;
        }
        AbstractC29261d abstractC29261d2 = abstractC29261d;
        C29260c m146255j2 = c29267j.m146255j();
        if (m146255j2 != null) {
            j11 = m146255j2.m146177f();
        } else {
            j11 = 0;
        }
        this.f133000b.m143480h(c29267j, new l(c29267j, this, interfaceC18505l, j11, abstractC29261d2));
    }

    /* renamed from: b0 */
    public final void m143500b0(C29259b c29259b, InterfaceC18505l interfaceC18505l) {
        long j11;
        C29265h m146155j = c29259b.m146155j();
        if (m146155j != null) {
            j11 = m146155j.m146204e();
        } else {
            j11 = 0;
        }
        long j12 = j11;
        if (AbstractC9183a.m48999g()) {
            String m146159n = c29259b.m146159n();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getProductsFromLocalDataSource [START] catalog: ");
            sb2.append(m146159n);
            sb2.append(", lastItemIdBeforeRequest: ");
            sb2.append(j12);
        }
        this.f132999a.m143460u(c29259b, new n(c29259b, interfaceC18505l, this, j12));
    }

    /* renamed from: c0 */
    public final void m143502c0(C29259b c29259b, InterfaceC18505l interfaceC18505l) {
        AbstractC29261d abstractC29261d;
        long j11;
        if (AbstractC9183a.m48999g()) {
            String m146159n = c29259b.m146159n();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getProductsFromRemoteDataSource [START] catalog: ");
            sb2.append(m146159n);
        }
        C29265h m146155j = c29259b.m146155j();
        if (m146155j != null) {
            abstractC29261d = m146155j.m146201b();
        } else {
            abstractC29261d = null;
        }
        AbstractC29261d abstractC29261d2 = abstractC29261d;
        C29265h m146155j2 = c29259b.m146155j();
        if (m146155j2 != null) {
            j11 = m146155j2.m146204e();
        } else {
            j11 = 0;
        }
        this.f133000b.m143481i(c29259b, new o(c29259b, interfaceC18505l, this, abstractC29261d2, j11));
    }

    /* renamed from: g0 */
    private final void m143507g0(AbstractC29266i.a aVar) {
        C29259b m146209a = aVar.m146209a();
        int m146210b = aVar.m146210b();
        int m146211c = aVar.m146211c();
        String m146159n = m146209a.m146159n();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEventCatalogAdded newCatalog: ");
        sb2.append(m146159n);
        sb2.append("\n newCatalogListVersion: ");
        sb2.append(m146210b);
        sb2.append("\n oldCatalogListVersion: ");
        sb2.append(m146211c);
        C29267j m143551e0 = m143551e0(String.valueOf(m146209a.m146161p()));
        if (m143551e0.m146253h() >= m146210b) {
            int m146253h = m143551e0.m146253h();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("handleRemoteEventCatalogAdded Local catalog list version is newer. Local version: ");
            sb3.append(m146253h);
            return;
        }
        m143551e0.m146247b(m146209a);
        this.f132999a.m143463x(m146209a);
        if (m143551e0.m146253h() == m146211c) {
            m143551e0.m146259n(m146210b);
            this.f132999a.m143442C(m143551e0.m146258m(), m146210b);
        }
        m143523q(m146209a, m146210b, true);
    }

    /* renamed from: h0 */
    private final void m143509h0(AbstractC29266i.b bVar) {
        boolean z11;
        C29259b m146212a = bVar.m146212a();
        int m146213b = bVar.m146213b();
        int m146214c = bVar.m146214c();
        String m146159n = m146212a.m146159n();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEventCatalogEdited editedCatalog: ");
        sb2.append(m146159n);
        sb2.append("\n newCatalogListVersion: ");
        sb2.append(m146213b);
        sb2.append("\n oldCatalogListVersion: ");
        sb2.append(m146214c);
        C29267j m143551e0 = m143551e0(String.valueOf(m146212a.m146161p()));
        if (m143551e0.m146253h() >= m146213b) {
            int m146253h = m143551e0.m146253h();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("handleRemoteEventCatalogEdited Local catalog list version is newer. Local version: ");
            sb3.append(m146253h);
            return;
        }
        C29259b m146251f = m143551e0.m146251f(m146212a.m146158m());
        if (m146251f != null) {
            if (m146251f.m146165t() != m146212a.m146165t()) {
                z11 = true;
            } else {
                z11 = false;
            }
            m146251f.m146150e(m146212a);
            if (z11) {
                m146251f.m146149d(true);
            }
        }
        this.f132999a.m143446I(m146212a);
        this.f133004f.remove(AbstractC9183a.m48998f(m146212a));
        if (m143551e0.m146253h() == m146214c) {
            m143551e0.m146259n(m146213b);
            this.f132999a.m143442C(m143551e0.m146258m(), m146213b);
        }
        m143525s(m146212a, m146213b, true);
    }

    /* renamed from: i0 */
    private final void m143511i0(AbstractC29266i.c cVar) {
        List m146215a = cVar.m146215a();
        int m146216b = cVar.m146216b();
        int m146217c = cVar.m146217c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEventCatalogsDeleted deletedCatalogIds: ");
        sb2.append(m146215a);
        sb2.append("\n newCatalogListVersion: ");
        sb2.append(m146216b);
        sb2.append("\n oldCatalogListVersion: ");
        sb2.append(m146217c);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C29267j m143551e0 = m143551e0(str);
        if (m143551e0.m146253h() >= m146216b) {
            int m146253h = m143551e0.m146253h();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("handleRemoteEventCatalogsDeleted Local catalog list version is newer. Local version: ");
            sb3.append(m146253h);
            return;
        }
        m143551e0.m146250e(m146215a);
        this.f132999a.m143453n(m146215a);
        if (m143551e0.m146253h() == m146217c) {
            m143551e0.m146259n(m146216b);
            this.f132999a.m143442C(m143551e0.m146258m(), m146216b);
        }
        m143531w(m146215a, m146216b, true);
    }

    /* renamed from: j0 */
    private final void m143513j0(boolean z11) {
        C29258a m143541Q = m143541Q();
        if (m143541Q.m146135j() != z11) {
            boolean m146135j = m143541Q.m146135j();
            m143541Q.m146137l(true);
            JSONObject m146127b = m143541Q.m146127b();
            if (m146127b != null) {
                m146127b.put("enable", z11 ? 1 : 0);
                AbstractC0924m0.m3493Ul(m146127b.toString());
            }
            if (m146135j && !m143541Q.m146135j()) {
                C28666k c28666k = this.f132999a;
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                c28666k.m143449h(str);
            }
            m143534z(m143541Q.m146135j());
        }
    }

    /* renamed from: k0 */
    private final void m143515k0() {
        synchronized (this.f133001c) {
            try {
                for (C29267j c29267j : this.f133001c.values()) {
                    Iterator it = c29267j.m146254i().iterator();
                    while (it.hasNext()) {
                        ((C29259b) it.next()).m146149d(true);
                    }
                    c29267j.m146249d(true);
                }
                this.f133001c.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f132999a.m143445H();
        this.f132999a.m143444G();
        m143533y();
    }

    /* renamed from: l0 */
    private final void m143517l0(AbstractC29266i.g gVar) {
        Product m146222c = gVar.m146222c();
        int m146221b = gVar.m146221b();
        int m146220a = gVar.m146220a();
        int m146224e = gVar.m146224e();
        int m146223d = gVar.m146223d();
        String m146225f = gVar.m146225f();
        String m48486j = m146222c.m48486j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEventProductAdded newProduct: ");
        sb2.append(m48486j);
        sb2.append("\n newCatalogVersion: ");
        sb2.append(m146221b);
        sb2.append("\n newCatalogListVersion: ");
        sb2.append(m146220a);
        sb2.append("\n oldCatalogVersion: ");
        sb2.append(m146224e);
        sb2.append("\n oldCatalogListVersion: ");
        sb2.append(m146223d);
        sb2.append("\n updatedCatalogPhoto: ");
        sb2.append(m146225f);
        C29259b m143545U = m143545U(m146222c.m48489m(), m146222c.m48480d());
        if (m143545U == null) {
            return;
        }
        if (m143545U.m146167v() >= m146221b) {
            int m146167v = m143545U.m146167v();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("handleRemoteEventProductAdded Local catalog version is newer. Local version: ");
            sb3.append(m146167v);
            return;
        }
        if (m143545U.m146162q(m146222c.m48485i()) == null) {
            m143545U.m146143E(m143545U.m146165t() + 1);
        }
        if (m143545U.m146155j() != null) {
            m143545U.m146147b(m146222c);
        }
        this.f132999a.m143447f(m143545U, m146222c);
        this.f132999a.m143441A(m146222c.m48480d(), m146222c);
        if (m146225f != null) {
            m143545U.m146169x(m146225f);
            this.f132999a.m143446I(m143545U);
        }
        m143486A(m146222c, m146221b, true);
    }

    /* renamed from: m0 */
    private final void m143519m0(AbstractC29266i.i iVar) {
        Product m146233a = iVar.m146233a();
        int m146235c = iVar.m146235c();
        int m146234b = iVar.m146234b();
        int m146237e = iVar.m146237e();
        int m146236d = iVar.m146236d();
        String m146238f = iVar.m146238f();
        String m48486j = m146233a.m48486j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEventProductEdited editedProduct: ");
        sb2.append(m48486j);
        sb2.append("\n newCatalogVersion: ");
        sb2.append(m146235c);
        sb2.append("\n newCatalogListVersion: ");
        sb2.append(m146234b);
        sb2.append("\n oldCatalogVersion: ");
        sb2.append(m146237e);
        sb2.append("\n oldCatalogListVersion: ");
        sb2.append(m146236d);
        sb2.append("\n updatedCatalogPhoto: ");
        sb2.append(m146238f);
        C29259b m143545U = m143545U(m146233a.m48489m(), m146233a.m48480d());
        if (m143545U == null) {
            return;
        }
        if (m143545U.m146167v() >= m146235c) {
            int m146167v = m143545U.m146167v();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("handleRemoteEventProductEdited Local catalog version is newer. Local version: ");
            sb3.append(m146167v);
            return;
        }
        Product m146162q = m143545U.m146162q(m146233a.m48485i());
        if (m146162q != null) {
            m146162q.m48478b(m146233a);
        }
        this.f132999a.m143441A(m146233a.m48480d(), m146233a);
        this.f133003e.remove(AbstractC9183a.m49001i(m146233a));
        if (m146238f != null) {
            m143545U.m146169x(m146238f);
            this.f132999a.m143446I(m143545U);
        }
        m143488C(m146233a, m146235c, true);
    }

    /* renamed from: n0 */
    private final void m143521n0(AbstractC29266i.h hVar) {
        long m146226a = hVar.m146226a();
        List m146227b = hVar.m146227b();
        int m146229d = hVar.m146229d();
        int m146228c = hVar.m146228c();
        int m146231f = hVar.m146231f();
        int m146230e = hVar.m146230e();
        String m146232g = hVar.m146232g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEventProductsDeleted catalogId: ");
        sb2.append(m146226a);
        sb2.append(", deletedProductIds: ");
        sb2.append(m146227b);
        sb2.append("\n newCatalogVersion: ");
        sb2.append(m146229d);
        sb2.append("\n newCatalogListVersion: ");
        sb2.append(m146228c);
        sb2.append("\n oldCatalogVersion: ");
        sb2.append(m146231f);
        sb2.append("\n oldCatalogListVersion: ");
        sb2.append(m146230e);
        sb2.append("\n updatedCatalogPhoto: ");
        sb2.append(m146232g);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C29259b m143545U = m143545U(str, m146226a);
        if (m143545U == null) {
            return;
        }
        if (m143545U.m146167v() >= m146229d) {
            int m146167v = m143545U.m146167v();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("handleRemoteEventProductsDeleted Local catalog version is newer. Local version: ");
            sb3.append(m146167v);
            return;
        }
        m143545U.m146151f(m146227b);
        m143545U.m146143E(m143545U.m146165t() - m146227b.size());
        this.f132999a.m143454o(m143545U.m146158m(), m146227b);
        if (m146232g != null) {
            m143545U.m146169x(m146232g);
            this.f132999a.m143446I(m143545U);
        }
        m143490E(m146226a, m146229d, m146227b, true);
        if (m143545U.m146165t() <= 0) {
            m143530v(m146226a);
        }
    }

    /* renamed from: o0 */
    private final void m143522o0(AbstractC29266i.j jVar) {
        long m146239a = jVar.m146239a();
        long m146245g = jVar.m146245g();
        List m146242d = jVar.m146242d();
        int m146241c = jVar.m146241c();
        int m146240b = jVar.m146240b();
        int m146244f = jVar.m146244f();
        int m146243e = jVar.m146243e();
        String str = CoreUtility.f89233i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEventProductsMoved fromCatalogId: ");
        sb2.append(m146239a);
        sb2.append(", toCatalogId: ");
        sb2.append(m146245g);
        sb2.append("\nmovedProductIds: ");
        sb2.append(m146242d);
        sb2.append("\nfromCatalogOldVersion: ");
        sb2.append(m146241c);
        sb2.append("\nfromCatalogNewVersion: ");
        sb2.append(m146240b);
        sb2.append("\noldCatalogListVersion: ");
        sb2.append(m146244f);
        sb2.append("\nnewCatalogListVersion: ");
        sb2.append(m146243e);
        AbstractC19074t.m100205c(str);
        C29259b m143545U = m143545U(str, m146239a);
        C29259b m143545U2 = m143545U(str, m146245g);
        if (m143545U != null) {
            m143545U.m146151f(m146242d);
            m143545U.m146143E(m143545U.m146165t() - m146242d.size());
            this.f132999a.m143446I(m143545U);
        }
        if (m143545U2 != null) {
            m143545U2.m146143E(m143545U2.m146165t() + m146242d.size());
            this.f132999a.m143446I(m143545U2);
        }
        this.f132999a.m143454o(m146239a, m146242d);
        C29259b m143545U3 = m143545U(str, m146245g);
        if (m143545U3 != null) {
            m143545U3.m146149d(true);
        }
        m143492G(m146239a, m146245g, m146242d, true);
        if (m143545U != null && m143545U.m146167v() == m146241c) {
            if (m143545U != null && m143545U.m146165t() <= 0) {
                AbstractC9183a.m48999g();
                m143494O(str, m146239a);
            }
        } else {
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("handleRemoteEventProductsMoved fromCatalogId: ");
                sb3.append(m146239a);
                sb3.append(", Version is obsolete. RE-SYNC DATA!!!");
            }
            m143494O(str, m146239a);
        }
        m143494O(str, m146245g);
        C29267j c29267j = (C29267j) this.f133001c.get(str);
        if (c29267j != null) {
            if (c29267j.m146253h() == m146244f) {
                c29267j.m146259n(m146243e);
                this.f132999a.m143442C(c29267j.m146258m(), c29267j.m146253h());
            } else {
                m143528u();
            }
        }
    }

    /* renamed from: q */
    private final void m143523q(C29259b c29259b, int i11, boolean z11) {
        AbstractC29263f.a aVar = new AbstractC29263f.a(c29259b, i11);
        aVar.m146184b(z11);
        C23744a.Companion.m124119a().m124116d(5300, aVar);
    }

    /* renamed from: r */
    static /* synthetic */ void m143524r(C28669n c28669n, C29259b c29259b, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        c28669n.m143523q(c29259b, i11, z11);
    }

    /* renamed from: s */
    private final void m143525s(C29259b c29259b, int i11, boolean z11) {
        AbstractC29263f.b bVar = new AbstractC29263f.b(c29259b, i11);
        bVar.m146184b(z11);
        C23744a.Companion.m124119a().m124116d(5300, bVar);
    }

    /* renamed from: t */
    static /* synthetic */ void m143526t(C28669n c28669n, C29259b c29259b, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        c28669n.m143525s(c29259b, i11, z11);
    }

    /* renamed from: t0 */
    public final void m143527t0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29259b c29259b = (C29259b) it.next();
            String m146152g = c29259b.m146152g();
            C29259b c29259b2 = (C29259b) this.f133002d.get(m146152g);
            if (c29259b2 != null) {
                if (c29259b2.m146167v() < c29259b.m146167v()) {
                    c29259b2.m146149d(true);
                    this.f133002d.put(m146152g, c29259b);
                }
            } else {
                this.f133002d.put(m146152g, c29259b);
            }
        }
    }

    /* renamed from: u */
    public final void m143528u() {
        C23744a.Companion.m124119a().m124116d(5300, AbstractC29263f.c.f135588b);
    }

    /* renamed from: u0 */
    public final void m143529u0(C29259b c29259b) {
        C0824j.m2153b(new s(c29259b));
    }

    /* renamed from: v */
    public final void m143530v(long j11) {
        C23744a.Companion.m124119a().m124116d(5300, new AbstractC29263f.d(j11));
    }

    /* renamed from: w */
    private final void m143531w(List list, int i11, boolean z11) {
        AbstractC29263f.e eVar = new AbstractC29263f.e(list, i11);
        eVar.m146184b(z11);
        C23744a.Companion.m124119a().m124116d(5300, eVar);
    }

    /* renamed from: x */
    static /* synthetic */ void m143532x(C28669n c28669n, List list, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        c28669n.m143531w(list, i11, z11);
    }

    /* renamed from: y */
    private final void m143533y() {
        C23744a.Companion.m124119a().m124116d(5300, AbstractC29263f.f.f135592b);
    }

    /* renamed from: z */
    private final void m143534z(boolean z11) {
        C23744a.Companion.m124119a().m124116d(5300, new AbstractC29263f.g(z11));
    }

    /* renamed from: I */
    public final boolean m143535I(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (m143551e0(str).m146254i().size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void m143536J() {
        this.f133001c.clear();
        this.f133003e.clear();
        this.f133004f.clear();
        this.f133005g = null;
    }

    /* renamed from: K */
    public final void m143537K(String str, long j11, int i11, DeleteCatalogSource deleteCatalogSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(deleteCatalogSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (!m143535I(str, j11)) {
            int m104491c = AbstractC28665j.m143426b().m104491c();
            String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_toast_keep_at_least_one_catalog);
            AbstractC19074t.m100207e(string, "getString(...)");
            AbstractC28671p.a aVar = new AbstractC28671p.a(m104491c, string);
            interfaceC18505l.mo205i9(aVar);
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deleteCatalog [RESULT] catalogId: ");
                sb2.append(j11);
                sb2.append(", result: ");
                sb2.append(aVar);
                return;
            }
            return;
        }
        this.f133000b.m143476d(j11, i11, deleteCatalogSource, new e(j11, this, str, interfaceC18505l));
    }

    /* renamed from: L */
    public final void m143538L(long j11, int i11, int i12, List list, DeleteProductSource deleteProductSource, InterfaceC18505l interfaceC18505l) {
        List m131185M0;
        AbstractC19074t.m100208f(list, "productsToDelete");
        AbstractC19074t.m100208f(deleteProductSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            linkedHashMap.put(Long.valueOf(product.m48485i()), product);
        }
        Set keySet = linkedHashMap.keySet();
        AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
        m131185M0 = AbstractC25332a0.m131185M0(keySet);
        this.f133000b.m143477e(j11, i11, i12, m131185M0, deleteProductSource, new f(j11, list, this, interfaceC18505l));
    }

    /* renamed from: M */
    public final void m143539M(int i11, C29259b c29259b, EditCatalogSource editCatalogSource, C17582a c17582a, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(editCatalogSource, "source");
        AbstractC19074t.m100208f(c17582a, "changedData");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        this.f133000b.m143478f(i11, c29259b, editCatalogSource, c17582a, new g(c29259b, this, interfaceC18505l));
    }

    /* renamed from: N */
    public final void m143540N(long j11, int i11, int i12, Product product, EditProductSource editProductSource, C17583b c17583b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(product, "product");
        AbstractC19074t.m100208f(editProductSource, "source");
        AbstractC19074t.m100208f(c17583b, "changedData");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        this.f133000b.m143479g(j11, i11, i12, product, editProductSource, c17583b, new h(j11, product, this, CoreUtility.f89233i, interfaceC18505l));
    }

    /* renamed from: Q */
    public final C29258a m143541Q() {
        if (this.f133005g == null) {
            this.f133005g = m143550d0();
        }
        C29258a c29258a = this.f133005g;
        if (c29258a == null) {
            return new C29258a();
        }
        return c29258a;
    }

    /* renamed from: R */
    public final void m143542R(long j11, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C29259b m143545U = m143545U(str, j11);
        if (m143545U != null) {
            interfaceC18505l.mo205i9(new AbstractC28671p.b(m143545U));
        } else {
            this.f132999a.m143456q(j11, new i(interfaceC18505l));
        }
    }

    /* renamed from: S */
    public final C29259b m143543S(long j11) {
        C28666k c28666k = this.f132999a;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return c28666k.m143457r(str, j11);
    }

    /* renamed from: T */
    public final List m143544T() {
        int m131511r;
        List m131502j;
        C29267j c29267j = (C29267j) this.f133001c.get(CoreUtility.f89233i);
        if (c29267j == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        List m146252g = c29267j.m146252g();
        m131511r = AbstractC25370t.m131511r(m146252g, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m146252g.iterator();
        while (it.hasNext()) {
            arrayList.add(((C29259b) it.next()).m146160o());
        }
        return arrayList;
    }

    /* renamed from: U */
    public final C29259b m143545U(String str, long j11) {
        C29259b c29259b;
        AbstractC19074t.m100208f(str, "ownerId");
        C29267j c29267j = (C29267j) this.f133001c.get(str);
        if (c29267j != null) {
            c29259b = c29267j.m146251f(j11);
        } else {
            c29259b = null;
        }
        if (c29259b == null) {
            return m143543S(j11);
        }
        return c29259b;
    }

    /* renamed from: V */
    public final void m143546V(C29267j c29267j, boolean z11, InterfaceC18505l interfaceC18505l) {
        String str;
        AbstractC19074t.m100208f(c29267j, "userCatalogs");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        synchronized (c29267j) {
            try {
                if (AbstractC9183a.m48999g()) {
                    String m146257l = c29267j.m146257l();
                    C29260c m146255j = c29267j.m146255j();
                    if (m146255j != null) {
                        str = m146255j.m146176e();
                    } else {
                        str = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getCatalogs userCatalogs: ");
                    sb2.append(m146257l);
                    sb2.append(", forceGetFromRemote: ");
                    sb2.append(z11);
                    sb2.append(", currentPage: ");
                    sb2.append(str);
                }
                HashMap hashMap = new HashMap();
                for (C29259b c29259b : c29267j.m146252g()) {
                    hashMap.put(Long.valueOf(c29259b.m146158m()), c29259b);
                }
                if (z11) {
                    AbstractC9183a.m48999g();
                    c29267j.m146249d(true);
                    m143497X(c29267j, interfaceC18505l);
                    return;
                }
                C29260c m146255j2 = c29267j.m146255j();
                if (m146255j2 == null) {
                    c29267j.m146260o(true);
                    if (this.f132999a.m143451j(c29267j.m146258m()) <= 0) {
                        c29267j.m146259n(0);
                    }
                    m143497X(c29267j, new j(interfaceC18505l, this, c29267j));
                } else if (m146255j2.m146174c() instanceof AbstractC29261d.a) {
                    if (m146255j2.m146175d()) {
                        m143496W(c29267j, interfaceC18505l);
                    } else {
                        m143497X(c29267j, interfaceC18505l);
                    }
                } else if ((m146255j2.m146174c() instanceof AbstractC29261d.b) && (m146255j2.m146175d() || c29267j.m146254i().isEmpty())) {
                    m143497X(c29267j, interfaceC18505l);
                } else {
                    int m104491c = AbstractC28665j.m143428d().m104491c();
                    String m104492d = AbstractC28665j.m143428d().m104492d();
                    AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                    interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Y */
    public final C28666k m143547Y() {
        return this.f132999a;
    }

    /* renamed from: Z */
    public final List m143548Z(long j11) {
        return this.f132999a.m143459t(j11);
    }

    /* renamed from: a0 */
    public final void m143549a0(C29259b c29259b, boolean z11, InterfaceC18505l interfaceC18505l) {
        String str;
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        synchronized (c29259b) {
            try {
                if (AbstractC9183a.m48999g()) {
                    String m146159n = c29259b.m146159n();
                    C29265h m146155j = c29259b.m146155j();
                    if (m146155j != null) {
                        str = m146155j.m146203d();
                    } else {
                        str = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getProducts catalog: ");
                    sb2.append(m146159n);
                    sb2.append(", forceGetFromRemote: ");
                    sb2.append(z11);
                    sb2.append(", currentPage: ");
                    sb2.append(str);
                }
                if (z11) {
                    AbstractC9183a.m48999g();
                    c29259b.m146149d(true);
                    m143502c0(c29259b, interfaceC18505l);
                    return;
                }
                C29265h m146155j2 = c29259b.m146155j();
                if (m146155j2 == null) {
                    c29259b.m146141C(true);
                    if (this.f132999a.m143450i(c29259b.m146158m()) <= 0) {
                        c29259b.m146145G(0);
                    }
                    m143502c0(c29259b, new m(interfaceC18505l, this, c29259b));
                } else if (m146155j2.m146201b() instanceof AbstractC29261d.a) {
                    if (m146155j2.m146202c()) {
                        m143500b0(c29259b, interfaceC18505l);
                    } else {
                        m143502c0(c29259b, interfaceC18505l);
                    }
                } else if ((m146155j2.m146201b() instanceof AbstractC29261d.b) && (m146155j2.m146202c() || c29259b.m146164s().isEmpty())) {
                    m143502c0(c29259b, interfaceC18505l);
                } else {
                    int m104491c = AbstractC28665j.m143428d().m104491c();
                    String m104492d = AbstractC28665j.m143428d().m104492d();
                    AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                    interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d0 */
    public final C29258a m143550d0() {
        C29258a c29258a = new C29258a();
        try {
            String m4100p4 = AbstractC0924m0.m4100p4();
            if (m4100p4 != null && m4100p4.length() > 0) {
                c29258a.m146136k(new JSONObject(m4100p4));
            }
            String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.PRODUCT_CATALOG_DOMAIN);
            if (m145033a.length() == 0) {
                m145033a = "https://catalog.zalo.me";
            }
            c29258a.m146138m(m145033a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ProductCatalogRepo", e11);
        }
        return c29258a;
    }

    /* renamed from: e0 */
    public final C29267j m143551e0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        synchronized (this.f133001c) {
            C29267j c29267j = (C29267j) this.f133001c.get(str);
            if (c29267j != null) {
                return c29267j;
            }
            C29267j c29267j2 = new C29267j(str);
            c29267j2.m146259n(this.f132999a.m143461v(str));
            synchronized (this.f133001c) {
                this.f133001c.put(str, c29267j2);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            return c29267j2;
        }
    }

    /* renamed from: f0 */
    public final void m143552f0(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "eventJson");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleRemoteEvent eventJson: ");
        sb2.append(jSONObject);
        AbstractC29266i m146218a = AbstractC29266i.Companion.m146218a(jSONObject);
        if (m146218a == null) {
            return;
        }
        if (m146218a instanceof AbstractC29266i.e) {
            m143513j0(((AbstractC29266i.e) m146218a).m146219a());
            return;
        }
        if (AbstractC19074t.m100204b(m146218a, AbstractC29266i.f.f135622a)) {
            m143515k0();
            return;
        }
        if (m146218a instanceof AbstractC29266i.g) {
            m143517l0((AbstractC29266i.g) m146218a);
            return;
        }
        if (m146218a instanceof AbstractC29266i.i) {
            m143519m0((AbstractC29266i.i) m146218a);
            return;
        }
        if (m146218a instanceof AbstractC29266i.h) {
            m143521n0((AbstractC29266i.h) m146218a);
            return;
        }
        if (m146218a instanceof AbstractC29266i.j) {
            m143522o0((AbstractC29266i.j) m146218a);
            return;
        }
        if (m146218a instanceof AbstractC29266i.a) {
            m143507g0((AbstractC29266i.a) m146218a);
        } else if (m146218a instanceof AbstractC29266i.b) {
            m143509h0((AbstractC29266i.b) m146218a);
        } else if (m146218a instanceof AbstractC29266i.c) {
            m143511i0((AbstractC29266i.c) m146218a);
        }
    }

    /* renamed from: o */
    public final void m143553o(int i11, C29259b c29259b, AddCatalogSource addCatalogSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(addCatalogSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        this.f133000b.m143473a(i11, c29259b, addCatalogSource, new c(c29259b, this, CoreUtility.f89233i, interfaceC18505l));
    }

    /* renamed from: p */
    public final void m143554p(long j11, int i11, int i12, Product product, AddProductSource addProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(product, "product");
        AbstractC19074t.m100208f(addProductSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        this.f133000b.m143474b(j11, i11, i12, product, addProductSource, new d(j11, this, CoreUtility.f89233i, interfaceC18505l));
    }

    /* renamed from: p0 */
    public final void m143555p0(long j11, long j12, List list, MoveProductSource moveProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "productsToMove");
        AbstractC19074t.m100208f(moveProductSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        this.f133000b.m143482j(j11, j12, list, moveProductSource, new p(j11, j12, this, CoreUtility.f89233i, interfaceC18505l));
    }

    /* renamed from: q0 */
    public final void m143556q0(C29259b c29259b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        String m48998f = AbstractC9183a.m48998f(c29259b);
        AbstractC28659d abstractC28659d = (AbstractC28659d) this.f133004f.get(m48998f);
        if (abstractC28659d != null) {
            interfaceC18505l.mo205i9(new AbstractC28671p.b(abstractC28659d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("parseCatalogLink [RESULT: FROM CACHE] cachedResult: ");
                sb2.append(abstractC28659d);
                return;
            }
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new q(c0766k, c29259b, m48998f, this, interfaceC18505l));
        c0766k.mo1511P9(m48998f);
    }

    /* renamed from: r0 */
    public final void m143557r0(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "configJS");
        C29258a c29258a = this.f133005g;
        if (c29258a != null) {
            c29258a.m146136k(jSONObject);
        }
    }

    /* renamed from: s0 */
    public final void m143558s0(Product product, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(product, "product");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        String m49001i = AbstractC9183a.m49001i(product);
        AbstractC28670o abstractC28670o = (AbstractC28670o) this.f133003e.get(m49001i);
        if (abstractC28670o != null) {
            interfaceC18505l.mo205i9(new AbstractC28671p.b(abstractC28670o));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("parseProductLink [RESULT: FROM CACHE] cachedResult: ");
                sb2.append(abstractC28670o);
                return;
            }
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new r(c0766k, product, m49001i, this, interfaceC18505l));
        c0766k.mo1511P9(m49001i);
    }
}
