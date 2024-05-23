package p115dy;

import ag0.AbstractC0837p0;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import p115dy.AbstractC18104m;
import p115dy.AbstractC18120u;
import p534u1.AbstractC26941a;
import p589vx.AbstractC28671p;
import p589vx.C28669n;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p624wx.C29267j;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;

/* renamed from: dy.q */
/* loaded from: classes4.dex */
public final class C18112q extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C28669n f91662s = C28669n.Companion.m143559a();

    /* renamed from: t */
    private AbstractC18120u f91663t = AbstractC18120u.a.f91733a;

    /* renamed from: u */
    private final C1761c0 f91664u;

    /* renamed from: v */
    private final C1761c0 f91665v;

    /* renamed from: w */
    private final LiveData f91666w;

    /* renamed from: x */
    private final LiveData f91667x;

    /* renamed from: y */
    private final InterfaceC24854k f91668y;

    /* renamed from: z */
    private long f91669z;

    /* renamed from: dy.q$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.q$b */
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
            return new C18112q();
        }
    }

    /* renamed from: dy.q$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m96328a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                if (AbstractC9183a.m48999g()) {
                    String m146257l = C18112q.this.m96324X().m146257l();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadCatalogs [RESULT:SUCCESS] userCatalogs: ");
                    sb2.append(m146257l);
                }
                C18112q.this.m96320f0(AbstractC18120u.c.f91735a);
            } else {
                if (AbstractC9183a.m48999g()) {
                    String m146257l2 = C18112q.this.m96324X().m146257l();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("loadCatalogs [RESULT:OTHER] userCatalogs: ");
                    sb3.append(m146257l2);
                    sb3.append(", result: ");
                    sb3.append(abstractC28671p);
                }
                if (abstractC28671p instanceof AbstractC28671p.a) {
                    AbstractC28671p.a aVar = (AbstractC28671p.a) abstractC28671p;
                    if (aVar.m143581c()) {
                        C18112q.this.m96320f0(AbstractC18120u.e.f91737a);
                    } else if (aVar.m143580b()) {
                        C18112q.this.m96320f0(AbstractC18120u.c.f91735a);
                    } else {
                        C18112q.this.m96320f0(AbstractC18120u.b.f91734a);
                    }
                }
            }
            C18112q.this.m96319e0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96328a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.q$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29267j mo12V4() {
            C28669n c28669n = C18112q.this.f91662s;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            return c28669n.m143551e0(str);
        }
    }

    public C18112q() {
        InterfaceC24854k m129210a;
        C1761c0 c1761c0 = new C1761c0();
        this.f91664u = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f91665v = c1761c02;
        this.f91666w = c1761c0;
        this.f91667x = c1761c02;
        m129210a = AbstractC24856m.m129210a(new d());
        this.f91668y = m129210a;
        this.f91669z = -1000L;
    }

    /* renamed from: T */
    public static final void m96315T(C18112q c18112q) {
        AbstractC19074t.m100208f(c18112q, "this$0");
        synchronized (c18112q) {
            c18112q.m96320f0(AbstractC18120u.a.f91733a);
            c18112q.m96327b0(true);
            c18112q.m96319e0();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: V */
    public static final void m96316V(C18112q c18112q) {
        AbstractC19074t.m100208f(c18112q, "this$0");
        c18112q.m96319e0();
    }

    /* renamed from: a0 */
    public static final void m96317a0(C18112q c18112q, long j11) {
        AbstractC19074t.m100208f(c18112q, "this$0");
        synchronized (c18112q) {
            c18112q.f91669z = j11;
            c18112q.m96320f0(AbstractC18120u.a.f91733a);
            c18112q.m96327b0(false);
            c18112q.m96319e0();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m96318c0(C18112q c18112q, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c18112q.m96327b0(z11);
    }

    /* renamed from: e0 */
    public final void m96319e0() {
        String string;
        boolean z11;
        AbstractC9183a.m48999g();
        ArrayList arrayList = new ArrayList();
        List m146252g = m96324X().m146252g();
        if (AbstractC9183a.m48999g()) {
            AbstractC18120u abstractC18120u = this.f91663t;
            int size = m146252g.size();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateCatalogPickerItems, loadCatalogListState: ");
            sb2.append(abstractC18120u);
            sb2.append(", catalog count: ");
            sb2.append(size);
        }
        int i11 = 0;
        for (Object obj : m146252g) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            C29259b c29259b = (C29259b) obj;
            AbstractC18104m.a aVar = new AbstractC18104m.a(c29259b);
            aVar.m96308l(aVar.m96302f().m146160o());
            boolean z12 = true;
            if (aVar.m96302f().m146165t() == 1) {
                string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_catalog_num_product_single, Integer.valueOf(aVar.m96302f().m146165t()));
                AbstractC19074t.m100205c(string);
            } else {
                string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_catalog_num_product_multitple, Integer.valueOf(aVar.m96302f().m146165t()));
                AbstractC19074t.m100205c(string);
            }
            aVar.m96306j(string);
            aVar.m96307k(aVar.m96302f().m146153h());
            if (c29259b.m146158m() == this.f91669z) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.m96300d(z11);
            if (i11 >= m146252g.size() - 1) {
                z12 = false;
            }
            aVar.m96301e(z12);
            arrayList.add(aVar);
            i11 = i12;
        }
        AbstractC18120u abstractC18120u2 = this.f91663t;
        if (abstractC18120u2 instanceof AbstractC18120u.d) {
            if (m146252g.isEmpty()) {
                arrayList.add(AbstractC18104m.g.f91651c);
            } else {
                arrayList.add(AbstractC18104m.h.f91652c);
            }
        } else if (AbstractC19074t.m100204b(abstractC18120u2, AbstractC18120u.b.f91734a)) {
            if (m146252g.isEmpty()) {
                arrayList.add(AbstractC18104m.e.f91649c);
            } else {
                arrayList.add(AbstractC18104m.d.f91648c);
            }
        } else if (AbstractC19074t.m100204b(abstractC18120u2, AbstractC18120u.e.f91737a)) {
            if (m146252g.isEmpty()) {
                arrayList.add(AbstractC18104m.f.f91650c);
            }
        } else if (AbstractC19074t.m100204b(abstractC18120u2, AbstractC18120u.c.f91735a) && m146252g.isEmpty()) {
            arrayList.add(AbstractC18104m.c.f91647c);
        }
        if (AbstractC9183a.m48999g()) {
            int size2 = arrayList.size();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("updateCatalogPickerItems: [END], item size: ");
            sb3.append(size2);
        }
        this.f91665v.mo9221n(arrayList);
    }

    /* renamed from: f0 */
    public final void m96320f0(AbstractC18120u abstractC18120u) {
        this.f91663t = abstractC18120u;
        this.f91664u.mo9221n(abstractC18120u);
    }

    /* renamed from: S */
    public final void m96321S() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.n
            @Override // java.lang.Runnable
            public final void run() {
                C18112q.m96315T(C18112q.this);
            }
        });
    }

    /* renamed from: U */
    public final void m96322U() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.p
            @Override // java.lang.Runnable
            public final void run() {
                C18112q.m96316V(C18112q.this);
            }
        });
    }

    /* renamed from: W */
    public final LiveData m96323W() {
        return this.f91667x;
    }

    /* renamed from: X */
    public final C29267j m96324X() {
        return (C29267j) this.f91668y.getValue();
    }

    /* renamed from: Y */
    public final void m96325Y(AbstractC29263f abstractC29263f) {
        AbstractC19074t.m100208f(abstractC29263f, "localEvent");
        if (AbstractC19074t.m100204b(abstractC29263f, AbstractC29263f.f.f135592b) || AbstractC19074t.m100204b(abstractC29263f, AbstractC29263f.c.f135588b)) {
            m96321S();
        } else if ((abstractC29263f instanceof AbstractC29263f.k) || (abstractC29263f instanceof AbstractC29263f.a) || (abstractC29263f instanceof AbstractC29263f.b) || (abstractC29263f instanceof AbstractC29263f.e)) {
            m96322U();
        }
    }

    /* renamed from: Z */
    public final void m96326Z(final long j11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.o
            @Override // java.lang.Runnable
            public final void run() {
                C18112q.m96317a0(C18112q.this, j11);
            }
        });
    }

    /* renamed from: b0 */
    public final void m96327b0(boolean z11) {
        if (this.f91663t instanceof AbstractC18120u.d) {
            return;
        }
        if (AbstractC9183a.m48999g()) {
            boolean z12 = !m96324X().m146254i().isEmpty();
            boolean m146256k = m96324X().m146256k();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadCatalogs [START] catalog forceRefreshFromServer: ");
            sb2.append(z11);
            sb2.append(", hasCatalogs: ");
            sb2.append(z12);
            sb2.append(", hasMoreCatalogs: ");
            sb2.append(m146256k);
        }
        if (!z11 && !m96324X().m146256k() && (!m96324X().m146254i().isEmpty())) {
            return;
        }
        m96320f0(new AbstractC18120u.d(z11));
        this.f91662s.m143546V(m96324X(), z11, new c());
    }
}
