package p115dy;

import ag0.C0815e1;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.productcatalog.model.CatalogAddEditModel;
import com.zing.zalo.productcatalog.utils.AddCatalogSource;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.productcatalog.utils.EditCatalogSource;
import com.zing.zalocore.CoreUtility;
import cy.C17582a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.HashSet;
import java.util.List;
import on0.AbstractC24342w;
import p115dy.C18076a;
import p361nb.C23648e;
import p534u1.AbstractC26941a;
import p589vx.AbstractC28671p;
import p589vx.C28669n;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p624wx.C29264g;
import p624wx.C29267j;
import pm0.C24848g0;
import pm0.C24860q;

/* renamed from: dy.a */
/* loaded from: classes4.dex */
public final class C18076a extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final HashSet f91509A;

    /* renamed from: s */
    private CatalogAddEditModel f91510s;

    /* renamed from: t */
    private C29259b f91511t;

    /* renamed from: u */
    private final C1761c0 f91512u;

    /* renamed from: v */
    private final LiveData f91513v;

    /* renamed from: w */
    private final C28669n f91514w;

    /* renamed from: x */
    private InterfaceC18505l f91515x;

    /* renamed from: y */
    private Parcelable f91516y;

    /* renamed from: z */
    private boolean f91517z;

    /* renamed from: dy.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.a$b */
    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: dy.a$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a */
            public static final a f91518a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: dy.a$b$b */
        /* loaded from: classes4.dex */
        public static final class C32808b extends b {

            /* renamed from: a */
            public static final C32808b f91519a = new C32808b();

            private C32808b() {
                super(null);
            }
        }

        /* renamed from: dy.a$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: a */
            public static final c f91520a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: dy.a$b$d */
        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a */
            public static final d f91521a = new d();

            private d() {
                super(null);
            }
        }

        /* renamed from: dy.a$b$e */
        /* loaded from: classes4.dex */
        public static final class e extends b {

            /* renamed from: a */
            public static final e f91522a = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: dy.a$b$f */
        /* loaded from: classes4.dex */
        public static final class f extends b {

            /* renamed from: a */
            public static final f f91523a = new f();

            private f() {
                super(null);
            }
        }

        /* renamed from: dy.a$b$g */
        /* loaded from: classes4.dex */
        public static final class g extends b {

            /* renamed from: a */
            private final String f91524a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str) {
                super(null);
                AbstractC19074t.m100208f(str, "message");
                this.f91524a = str;
            }

            /* renamed from: a */
            public final String m96155a() {
                return this.f91524a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && AbstractC19074t.m100204b(this.f91524a, ((g) obj).f91524a);
            }

            public int hashCode() {
                return this.f91524a.hashCode();
            }

            public String toString() {
                return "ShowMessage(message=" + this.f91524a + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C18076a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* renamed from: c */
        public static final void m96157c(C18076a c18076a, AbstractC28671p abstractC28671p) {
            InterfaceC18505l interfaceC18505l;
            AbstractC19074t.m100208f(c18076a, "this$0");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            InterfaceC18505l interfaceC18505l2 = c18076a.f91515x;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.d.f91521a);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                InterfaceC18505l interfaceC18505l3 = c18076a.f91515x;
                if (interfaceC18505l3 != null) {
                    interfaceC18505l3.mo205i9(b.C32808b.f91519a);
                    return;
                }
                return;
            }
            if ((abstractC28671p instanceof AbstractC28671p.a) && (interfaceC18505l = c18076a.f91515x) != null) {
                interfaceC18505l.mo205i9(new b.g(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: b */
        public final void m96158b(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18076a.this.f91517z = false;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.b

                /* renamed from: q */
                public final /* synthetic */ AbstractC28671p f91532q;

                public /* synthetic */ RunnableC18079b(AbstractC28671p abstractC28671p2) {
                    r2 = abstractC28671p2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18076a.d.m96157c(C18076a.this, r2);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96158b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: dy.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: c */
        public static final void m96160c(C18076a c18076a, AbstractC28671p abstractC28671p) {
            InterfaceC18505l interfaceC18505l;
            AbstractC19074t.m100208f(c18076a, "this$0");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            InterfaceC18505l interfaceC18505l2 = c18076a.f91515x;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.d.f91521a);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                InterfaceC18505l interfaceC18505l3 = c18076a.f91515x;
                if (interfaceC18505l3 != null) {
                    interfaceC18505l3.mo205i9(b.c.f91520a);
                    return;
                }
                return;
            }
            if ((abstractC28671p instanceof AbstractC28671p.a) && (interfaceC18505l = c18076a.f91515x) != null) {
                interfaceC18505l.mo205i9(new b.g(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: b */
        public final void m96161b(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18076a.this.f91517z = false;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.c

                /* renamed from: q */
                public final /* synthetic */ AbstractC28671p f91537q;

                public /* synthetic */ RunnableC18082c(AbstractC28671p abstractC28671p2) {
                    r2 = abstractC28671p2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18076a.e.m96160c(C18076a.this, r2);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96161b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: dy.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {
        f() {
            super(1);
        }

        /* renamed from: c */
        public static final void m96163c(C18076a c18076a, AbstractC28671p abstractC28671p) {
            InterfaceC18505l interfaceC18505l;
            AbstractC19074t.m100208f(c18076a, "this$0");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            InterfaceC18505l interfaceC18505l2 = c18076a.f91515x;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.d.f91521a);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                InterfaceC18505l interfaceC18505l3 = c18076a.f91515x;
                if (interfaceC18505l3 != null) {
                    interfaceC18505l3.mo205i9(b.a.f91518a);
                    return;
                }
                return;
            }
            if ((abstractC28671p instanceof AbstractC28671p.a) && (interfaceC18505l = c18076a.f91515x) != null) {
                interfaceC18505l.mo205i9(new b.g(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: b */
        public final void m96164b(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18076a.this.f91517z = false;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.d

                /* renamed from: q */
                public final /* synthetic */ AbstractC28671p f91543q;

                public /* synthetic */ RunnableC18085d(AbstractC28671p abstractC28671p2) {
                    r2 = abstractC28671p2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18076a.f.m96163c(C18076a.this, r2);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96164b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    public C18076a() {
        C1761c0 c1761c0 = new C1761c0();
        this.f91512u = c1761c0;
        this.f91513v = c1761c0;
        this.f91514w = C28669n.Companion.m143559a();
        this.f91509A = new HashSet();
    }

    /* renamed from: W */
    private final C17582a m96135W(CatalogAddEditModel catalogAddEditModel, C29259b c29259b) {
        C17582a c17582a = new C17582a(0, 0, 3, null);
        if (catalogAddEditModel == null) {
            c17582a.m93624c(1);
        } else {
            c17582a.m93624c(!AbstractC19074t.m100204b(catalogAddEditModel.m48471b(), c29259b.m146160o()) ? 1 : 0);
        }
        return c17582a;
    }

    /* renamed from: g0 */
    private final void m96136g0(String str) {
        if (!this.f91509A.contains(str)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(49, "", 0, "catalog_create_dup", new String[0]), false);
    }

    /* renamed from: O */
    public final boolean m96137O(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        C28669n c28669n = this.f91514w;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return c28669n.m143535I(str, c29259b.m146158m());
    }

    /* renamed from: P */
    public final boolean m96138P() {
        C29259b c29259b = this.f91511t;
        if (c29259b == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b = null;
        }
        if (c29259b.m146160o().length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final C24860q m96139Q() {
        String string;
        C28669n c28669n = this.f91514w;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C29267j m143551e0 = c28669n.m143551e0(str);
        int m146198b = C29264g.f135604a.m146198b();
        if (m143551e0.m146254i().size() >= m146198b) {
            if (m146198b == 1) {
                string = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.product_catalog_toast_max_catalog_exceeded_single, Integer.valueOf(m146198b));
            } else {
                string = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.product_catalog_toast_max_catalog_exceeded_multiple, Integer.valueOf(m146198b));
            }
            AbstractC19074t.m100205c(string);
            return new C24860q(Boolean.FALSE, string);
        }
        return new C24860q(Boolean.TRUE, "");
    }

    /* renamed from: R */
    public final void m96140R() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C29259b c29259b = new C29259b(Long.parseLong(str), -1000L);
        this.f91511t = c29259b;
        this.f91512u.mo9224q(c29259b);
        this.f91509A.clear();
    }

    /* renamed from: S */
    public final void m96141S(C29259b c29259b, DeleteCatalogSource deleteCatalogSource) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(deleteCatalogSource, "source");
        if (c29259b.m146158m() == -1000 || this.f91517z) {
            return;
        }
        this.f91517z = true;
        InterfaceC18505l interfaceC18505l = this.f91515x;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(b.f.f91523a);
        }
        String str = CoreUtility.f89233i;
        C28669n c28669n = this.f91514w;
        AbstractC19074t.m100205c(str);
        this.f91514w.m143537K(str, c29259b.m146158m(), c28669n.m143551e0(str).m146253h(), deleteCatalogSource, new d());
    }

    /* renamed from: T */
    public final C29259b m96142T() {
        C29259b c29259b = this.f91511t;
        if (c29259b != null) {
            if (c29259b == null) {
                AbstractC19074t.m100223u("catalog");
            } else {
                return c29259b;
            }
        }
        return null;
    }

    /* renamed from: U */
    public final CatalogAddEditModel m96143U() {
        C29259b c29259b = this.f91511t;
        C29259b c29259b2 = null;
        if (c29259b == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b = null;
        }
        long m146161p = c29259b.m146161p();
        C29259b c29259b3 = this.f91511t;
        if (c29259b3 == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b3 = null;
        }
        long m146158m = c29259b3.m146158m();
        C29259b c29259b4 = this.f91511t;
        if (c29259b4 == null) {
            AbstractC19074t.m100223u("catalog");
        } else {
            c29259b2 = c29259b4;
        }
        return new CatalogAddEditModel(m146161p, m146158m, c29259b2.m146160o());
    }

    /* renamed from: V */
    public final LiveData m96144V() {
        return this.f91513v;
    }

    /* renamed from: X */
    public final String m96145X() {
        C29259b c29259b = this.f91511t;
        if (c29259b == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b = null;
        }
        return c29259b.m146160o();
    }

    /* renamed from: Y */
    public final void m96146Y(AbstractC29263f abstractC29263f) {
        C29259b m96142T;
        InterfaceC18505l interfaceC18505l;
        InterfaceC18505l interfaceC18505l2;
        InterfaceC18505l interfaceC18505l3;
        AbstractC19074t.m100208f(abstractC29263f, "localEvent");
        if (abstractC29263f instanceof AbstractC29263f.g) {
            if (!((AbstractC29263f.g) abstractC29263f).m146189c() && (interfaceC18505l3 = this.f91515x) != null) {
                interfaceC18505l3.mo205i9(b.e.f91522a);
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.b) {
            CatalogAddEditModel catalogAddEditModel = this.f91510s;
            if (catalogAddEditModel != null) {
                AbstractC29263f.b bVar = (AbstractC29263f.b) abstractC29263f;
                if (bVar.m146186c().m146158m() == catalogAddEditModel.m48470a()) {
                    m96154i0(bVar.m146186c());
                    if (abstractC29263f.m146183a() && (interfaceC18505l2 = this.f91515x) != null) {
                        String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_toast_catalog_edited_sync);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        interfaceC18505l2.mo205i9(new b.g(string));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if ((abstractC29263f instanceof AbstractC29263f.e) && (m96142T = m96142T()) != null && ((AbstractC29263f.e) abstractC29263f).m146188c().contains(Long.valueOf(m96142T.m146158m()))) {
            InterfaceC18505l interfaceC18505l4 = this.f91515x;
            if (interfaceC18505l4 != null) {
                interfaceC18505l4.mo205i9(b.e.f91522a);
            }
            if (abstractC29263f.m146183a() && (interfaceC18505l = this.f91515x) != null) {
                String string2 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_toast_catalog_deleted_sync);
                AbstractC19074t.m100207e(string2, "getString(...)");
                interfaceC18505l.mo205i9(new b.g(string2));
            }
        }
    }

    /* renamed from: Z */
    public final boolean m96147Z() {
        CatalogAddEditModel catalogAddEditModel = this.f91510s;
        C29259b c29259b = null;
        if (catalogAddEditModel != null) {
            String m48471b = catalogAddEditModel.m48471b();
            C29259b c29259b2 = this.f91511t;
            if (c29259b2 == null) {
                AbstractC19074t.m100223u("catalog");
            } else {
                c29259b = c29259b2;
            }
            if (!AbstractC19074t.m100204b(m48471b, c29259b.m146160o())) {
                return true;
            }
            return false;
        }
        C29259b c29259b3 = this.f91511t;
        if (c29259b3 == null) {
            AbstractC19074t.m100223u("catalog");
        } else {
            c29259b = c29259b3;
        }
        if (c29259b.m146160o().length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final void m96148a0(CatalogAddEditModel catalogAddEditModel, CatalogAddEditModel catalogAddEditModel2, Parcelable parcelable) {
        C29259b c29259b;
        this.f91510s = catalogAddEditModel;
        if (catalogAddEditModel2 != null) {
            c29259b = new C29259b(catalogAddEditModel2.m48472c(), catalogAddEditModel2.m48470a());
            c29259b.m146142D(catalogAddEditModel2.m48471b());
        } else if (catalogAddEditModel != null) {
            C29259b c29259b2 = new C29259b(catalogAddEditModel.m48472c(), catalogAddEditModel.m48470a());
            c29259b2.m146142D(catalogAddEditModel.m48471b());
            c29259b = c29259b2;
        } else {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            c29259b = new C29259b(Long.parseLong(str), -1000L);
        }
        this.f91511t = c29259b;
        C29259b c29259b3 = null;
        if (AbstractC19444a.m101693a()) {
            C1761c0 c1761c0 = this.f91512u;
            C29259b c29259b4 = this.f91511t;
            if (c29259b4 == null) {
                AbstractC19074t.m100223u("catalog");
            } else {
                c29259b3 = c29259b4;
            }
            c1761c0.mo9224q(c29259b3);
        } else {
            C1761c0 c1761c02 = this.f91512u;
            C29259b c29259b5 = this.f91511t;
            if (c29259b5 == null) {
                AbstractC19074t.m100223u("catalog");
            } else {
                c29259b3 = c29259b5;
            }
            c1761c02.mo9221n(c29259b3);
        }
        this.f91516y = parcelable;
    }

    /* renamed from: b0 */
    public final boolean m96149b0() {
        List m143544T = this.f91514w.m143544T();
        C29259b c29259b = this.f91511t;
        if (c29259b == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b = null;
        }
        return m143544T.contains(c29259b.m146160o());
    }

    /* renamed from: c0 */
    public final void m96150c0() {
        AddCatalogSource addCatalogSource;
        C29259b c29259b;
        EditCatalogSource editCatalogSource;
        if (this.f91517z) {
            return;
        }
        this.f91517z = true;
        InterfaceC18505l interfaceC18505l = this.f91515x;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(b.f.f91523a);
        }
        C28669n c28669n = this.f91514w;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        int m146253h = c28669n.m143551e0(str).m146253h();
        C29259b c29259b2 = this.f91511t;
        C29259b c29259b3 = null;
        if (c29259b2 == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b2 = null;
        }
        if (c29259b2.m146158m() != -1000) {
            C28669n c28669n2 = this.f91514w;
            C29259b c29259b4 = this.f91511t;
            if (c29259b4 == null) {
                AbstractC19074t.m100223u("catalog");
                c29259b = null;
            } else {
                c29259b = c29259b4;
            }
            Parcelable parcelable = this.f91516y;
            if (parcelable instanceof EditCatalogSource) {
                editCatalogSource = (EditCatalogSource) parcelable;
            } else {
                editCatalogSource = null;
            }
            if (editCatalogSource == null) {
                editCatalogSource = EditCatalogSource.Unknown.f48765q;
            }
            EditCatalogSource editCatalogSource2 = editCatalogSource;
            CatalogAddEditModel catalogAddEditModel = this.f91510s;
            C29259b c29259b5 = this.f91511t;
            if (c29259b5 == null) {
                AbstractC19074t.m100223u("catalog");
                c29259b5 = null;
            }
            c28669n2.m143539M(m146253h, c29259b, editCatalogSource2, m96135W(catalogAddEditModel, c29259b5), new e());
        } else {
            C28669n c28669n3 = this.f91514w;
            C29259b c29259b6 = this.f91511t;
            if (c29259b6 == null) {
                AbstractC19074t.m100223u("catalog");
                c29259b6 = null;
            }
            Parcelable parcelable2 = this.f91516y;
            if (parcelable2 instanceof AddCatalogSource) {
                addCatalogSource = (AddCatalogSource) parcelable2;
            } else {
                addCatalogSource = null;
            }
            if (addCatalogSource == null) {
                addCatalogSource = AddCatalogSource.Unknown.f48745q;
            }
            c28669n3.m143553o(m146253h, c29259b6, addCatalogSource, new f());
        }
        C29259b c29259b7 = this.f91511t;
        if (c29259b7 == null) {
            AbstractC19074t.m100223u("catalog");
        } else {
            c29259b3 = c29259b7;
        }
        m96136g0(c29259b3.m146160o());
    }

    /* renamed from: e0 */
    public final void m96151e0(String str) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "name");
        C29259b c29259b = this.f91511t;
        if (c29259b == null) {
            AbstractC19074t.m100223u("catalog");
            c29259b = null;
        }
        m127168X0 = AbstractC24342w.m127168X0(str);
        c29259b.m146142D(m127168X0.toString());
    }

    /* renamed from: f0 */
    public final void m96152f0(InterfaceC18505l interfaceC18505l) {
        this.f91515x = interfaceC18505l;
    }

    /* renamed from: h0 */
    public final void m96153h0(String str) {
        AbstractC19074t.m100208f(str, "catalogName");
        if (str.length() == 0 || this.f91509A.contains(str)) {
            return;
        }
        this.f91509A.add(str);
        C0815e1.m2075D().m2100V(new C23648e(49, "", 1, "catalog_warning_dup", new String[0]), false);
    }

    /* renamed from: i0 */
    public final void m96154i0(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "editedCatalog");
        this.f91510s = new CatalogAddEditModel(c29259b.m146161p(), c29259b.m146158m(), c29259b.m146160o());
        C29259b c29259b2 = new C29259b(c29259b.m146161p(), c29259b.m146158m());
        c29259b2.m146150e(c29259b);
        this.f91511t = c29259b2;
        this.f91512u.mo9221n(c29259b2);
    }
}
