package p624wx;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.productcatalog.model.Product;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ln0.AbstractC22543l;
import p624wx.AbstractC29261d;
import pm0.C24848g0;

/* renamed from: wx.b */
/* loaded from: classes4.dex */
public final class C29259b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f135556a;

    /* renamed from: b */
    private final long f135557b;

    /* renamed from: e */
    private boolean f135560e;

    /* renamed from: f */
    private long f135561f;

    /* renamed from: g */
    private int f135562g;

    /* renamed from: j */
    private int f135565j;

    /* renamed from: k */
    private final List f135566k;

    /* renamed from: l */
    private final Set f135567l;

    /* renamed from: m */
    private C29265h f135568m;

    /* renamed from: n */
    private boolean f135569n;

    /* renamed from: o */
    private boolean f135570o;

    /* renamed from: c */
    private String f135558c = "";

    /* renamed from: d */
    private String f135559d = "";

    /* renamed from: h */
    private String f135563h = "";

    /* renamed from: i */
    private String f135564i = "";

    /* renamed from: wx.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29259b(long j11, long j12) {
        this.f135556a = j11;
        this.f135557b = j12;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f135566k = synchronizedList;
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        this.f135567l = synchronizedSet;
        this.f135569n = true;
    }

    /* renamed from: A */
    public final void m146139A(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f135559d = str;
    }

    /* renamed from: B */
    public final void m146140B(boolean z11) {
        this.f135570o = z11;
    }

    /* renamed from: C */
    public final void m146141C(boolean z11) {
        this.f135569n = z11;
    }

    /* renamed from: D */
    public final void m146142D(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f135558c = str;
    }

    /* renamed from: E */
    public final void m146143E(int i11) {
        this.f135565j = i11;
    }

    /* renamed from: F */
    public final void m146144F(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f135563h = str;
    }

    /* renamed from: G */
    public final void m146145G(int i11) {
        this.f135562g = i11;
    }

    /* renamed from: a */
    public final void m146146a(Product product) {
        AbstractC19074t.m100208f(product, "product");
        synchronized (this) {
            try {
                if (!this.f135567l.contains(Long.valueOf(product.m48485i()))) {
                    this.f135566k.add(product);
                    this.f135567l.add(Long.valueOf(product.m48485i()));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m146147b(Product product) {
        AbstractC19074t.m100208f(product, "product");
        synchronized (this) {
            try {
                if (!this.f135567l.contains(Long.valueOf(product.m48485i()))) {
                    this.f135566k.add(0, product);
                    this.f135567l.add(Long.valueOf(product.m48485i()));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final C29265h m146148c(C29265h c29265h) {
        AbstractC19074t.m100208f(c29265h, "productPage");
        synchronized (this) {
            try {
                C29265h c29265h2 = this.f135568m;
                if (c29265h2 == null) {
                    this.f135568m = c29265h;
                    this.f135566k.clear();
                    this.f135567l.clear();
                    Iterator it = c29265h.m146207h().iterator();
                    while (it.hasNext()) {
                        m146146a((Product) it.next());
                    }
                } else {
                    AbstractC19074t.m100205c(c29265h2);
                    if (c29265h2.m146204e() == c29265h.m146206g()) {
                        this.f135568m = c29265h;
                        Iterator it2 = c29265h.m146207h().iterator();
                        while (it2.hasNext()) {
                            m146146a((Product) it2.next());
                        }
                    } else if (AbstractC19074t.m100204b(c29265h2.m146201b(), AbstractC29261d.a.f135578a) && AbstractC19074t.m100204b(c29265h.m146201b(), AbstractC29261d.b.f135579a) && c29265h.m146206g() == 0) {
                        this.f135568m = c29265h;
                        this.f135566k.clear();
                        this.f135567l.clear();
                        Iterator it3 = c29265h.m146207h().iterator();
                        while (it3.hasNext()) {
                            m146146a((Product) it3.next());
                        }
                    }
                    c29265h = this.f135568m;
                    AbstractC19074t.m100205c(c29265h);
                }
                C29265h c29265h3 = this.f135568m;
                if (c29265h3 != null) {
                    this.f135562g = c29265h3.m146200a();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29265h;
    }

    /* renamed from: d */
    public final void m146149d(boolean z11) {
        synchronized (this) {
            try {
                this.f135566k.clear();
                this.f135567l.clear();
                this.f135568m = null;
                this.f135569n = true;
                if (z11) {
                    this.f135562g = 0;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m146150e(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "other");
        if (this == c29259b) {
            return;
        }
        this.f135558c = c29259b.f135558c;
        this.f135559d = c29259b.f135559d;
        this.f135561f = c29259b.f135561f;
        this.f135562g = c29259b.f135562g;
        this.f135564i = c29259b.f135564i;
        this.f135563h = c29259b.f135563h;
        this.f135565j = c29259b.f135565j;
        this.f135560e = c29259b.f135560e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29259b)) {
            return false;
        }
        C29259b c29259b = (C29259b) obj;
        return this.f135556a == c29259b.f135556a && this.f135557b == c29259b.f135557b;
    }

    /* renamed from: f */
    public final void m146151f(List list) {
        int m116580c;
        AbstractC19074t.m100208f(list, "deletedProductIds");
        synchronized (this) {
            try {
                Iterator it = this.f135566k.iterator();
                while (it.hasNext()) {
                    if (list.contains(Long.valueOf(((Product) it.next()).m48485i()))) {
                        it.remove();
                        C29265h c29265h = this.f135568m;
                        if (c29265h != null) {
                            m116580c = AbstractC22543l.m116580c(c29265h.m146205f() - 1, 0);
                            c29265h.m146208i(m116580c);
                        }
                    }
                }
                this.f135567l.removeAll(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final String m146152g() {
        return this.f135556a + " - " + this.f135557b;
    }

    /* renamed from: h */
    public final String m146153h() {
        return this.f135564i;
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f135556a) * 31) + AbstractC2147g0.m11521a(this.f135557b);
    }

    /* renamed from: i */
    public final long m146154i() {
        return this.f135561f;
    }

    /* renamed from: j */
    public final C29265h m146155j() {
        return this.f135568m;
    }

    /* renamed from: k */
    public final String m146156k() {
        return this.f135559d;
    }

    /* renamed from: l */
    public final boolean m146157l() {
        return this.f135569n;
    }

    /* renamed from: m */
    public final long m146158m() {
        return this.f135557b;
    }

    /* renamed from: n */
    public final String m146159n() {
        return "[id:" + this.f135557b + ", version:" + this.f135562g + ", name:" + this.f135558c + "]";
    }

    /* renamed from: o */
    public final String m146160o() {
        return this.f135558c;
    }

    /* renamed from: p */
    public final long m146161p() {
        return this.f135556a;
    }

    /* renamed from: q */
    public final Product m146162q(long j11) {
        synchronized (this) {
            for (Product product : this.f135566k) {
                if (product.m48485i() == j11) {
                    return product;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return null;
        }
    }

    /* renamed from: r */
    public final List m146163r() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f135566k);
        }
        return arrayList;
    }

    /* renamed from: s */
    public final List m146164s() {
        return this.f135566k;
    }

    /* renamed from: t */
    public final int m146165t() {
        return this.f135565j;
    }

    public String toString() {
        return "Catalog(ownerId=" + this.f135556a + ", id=" + this.f135557b + ")";
    }

    /* renamed from: u */
    public final String m146166u() {
        return this.f135563h;
    }

    /* renamed from: v */
    public final int m146167v() {
        return this.f135562g;
    }

    /* renamed from: w */
    public final boolean m146168w() {
        return this.f135560e;
    }

    /* renamed from: x */
    public final void m146169x(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f135564i = str;
    }

    /* renamed from: y */
    public final void m146170y(long j11) {
        this.f135561f = j11;
    }

    /* renamed from: z */
    public final void m146171z(boolean z11) {
        this.f135560e = z11;
    }
}
