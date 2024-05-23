package p589vx;

import ag0.C0824j;
import am.AbstractC0939u;
import am.C0918j0;
import android.content.ContentValues;
import android.database.Cursor;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import on0.AbstractC24334o;
import org.json.JSONArray;
import p589vx.AbstractC28671p;
import p624wx.AbstractC29261d;
import p624wx.C29259b;
import p624wx.C29260c;
import p624wx.C29262e;
import p624wx.C29265h;
import p624wx.C29267j;
import pm0.C24860q;
import qm0.AbstractC25332a0;

/* renamed from: vx.k */
/* loaded from: classes.dex */
public final class C28666k {

    /* renamed from: a */
    public static final C28666k f132918a = new C28666k();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vx.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f132919a = new a();

        /* renamed from: b */
        private static final String f132920b = "CREATE TABLE prodctlg_catalog_info\n (current_user_uid INTEGER,\n owner_uid INTEGER,\n catalog_id INTEGER,\n name,\n description,\n url_path,\n cover_url,\n create_time INTEGER,\n total_product INTEGER,\n version INTEGER,\n is_default INTEGER,\n UNIQUE(current_user_uid, catalog_id) ON CONFLICT REPLACE)";

        private a() {
        }

        /* renamed from: a */
        public final String m143465a() {
            return f132920b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vx.k$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f132921a = new b();

        /* renamed from: b */
        private static final String f132922b = "CREATE TABLE prodctlg_catalog_products\n (current_user_uid INTEGER,\n catalog_id INTEGER,\n product_id INTEGER,\n UNIQUE(current_user_uid, catalog_id, product_id) ON CONFLICT REPLACE)";

        private b() {
        }

        /* renamed from: a */
        public final String m143466a() {
            return f132922b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vx.k$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f132923a = new c();

        /* renamed from: b */
        private static final String f132924b = "CREATE TABLE prodctlg_product_info\n (current_user_uid INTEGER,\n owner_uid INTEGER,\n product_id INTEGER,\n name,\n description,\n url_path,\n photo_urls,\n create_time INTEGER,\n price,\n currency_unit,\n UNIQUE(current_user_uid, owner_uid, product_id) ON CONFLICT REPLACE)";

        private c() {
        }

        /* renamed from: a */
        public final String m143467a() {
            return f132924b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vx.k$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f132925a = new d();

        /* renamed from: b */
        private static final String f132926b = "CREATE TABLE prodctlg_user_catalogs_meta\n (current_user_uid INTEGER,\n owner_uid INTEGER,\n user_catalogs_version INTEGER,\n UNIQUE(current_user_uid,owner_uid) ON CONFLICT REPLACE)";

        private d() {
        }

        /* renamed from: a */
        public final String m143468a() {
            return f132926b;
        }
    }

    /* renamed from: vx.k$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C29259b f132927a;

        /* renamed from: b */
        final /* synthetic */ Product f132928b;

        /* renamed from: c */
        final /* synthetic */ String f132929c;

        e(C29259b c29259b, Product product, String str) {
            this.f132927a = c29259b;
            this.f132928b = product;
            this.f132929c = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                try {
                    m42200M6.m2860a();
                    if (AbstractC9183a.m48999g()) {
                        AbstractC23350e.m122772b("addCatalogProduct [START] catalog: " + this.f132927a.m146159n() + ", product: " + this.f132928b.m48486j(), new Object[0]);
                    }
                    C28666k c28666k = C28666k.f132918a;
                    String str = this.f132929c;
                    AbstractC19074t.m100207e(str, "$currentUserUid");
                    long m146158m = this.f132927a.m146158m();
                    Product product = this.f132928b;
                    AbstractC19074t.m100205c(m42200M6);
                    c28666k.m143430B(str, m146158m, product, m42200M6);
                    String str2 = this.f132929c;
                    AbstractC19074t.m100207e(str2, "$currentUserUid");
                    c28666k.m143440y(str2, this.f132927a, this.f132928b, m42200M6);
                    m42200M6.m2875p();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ProductCatalogDAO", e11);
                }
                m42200M6.m2864e();
            } catch (Throwable th2) {
                m42200M6.m2864e();
                throw th2;
            }
        }
    }

    /* renamed from: vx.k$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132930a;

        /* renamed from: b */
        final /* synthetic */ long f132931b;

        /* renamed from: c */
        final /* synthetic */ String f132932c;

        f(String str, long j11, String str2) {
            this.f132930a = str;
            this.f132931b = j11;
            this.f132932c = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            if (AbstractC9183a.m48999g()) {
                String str = this.f132930a;
                long j11 = this.f132931b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("clearCatalogData [START] ownerId: ");
                sb2.append(str);
                sb2.append(", catalogId: ");
                sb2.append(j11);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("version", (Integer) 0);
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + this.f132932c + "\n                                | AND owner_uid = " + this.f132930a + "\n                                | AND catalog_id = " + this.f132931b + "\n                            ", null, 1, null);
                int m2876q = m42200M6.m2876q("prodctlg_catalog_info", contentValues, m127100h, null);
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("clearCatalogData [RESET-VERSION] updateCount: ");
                    sb3.append(m2876q);
                }
                C28666k c28666k = C28666k.f132918a;
                String str2 = this.f132932c;
                AbstractC19074t.m100207e(str2, "$currentUserUid");
                c28666k.m143439m(str2, this.f132931b);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132933a;

        g(String str) {
            this.f132933a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            String m127100h2;
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + this.f132933a + "\n                            ", null, 1, null);
                int m2863d = m42200M6.m2863d("prodctlg_user_catalogs_meta", m127100h, null);
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("clearDataOfUser [Delete user catalog metadata] delete count:");
                    sb2.append(m2863d);
                }
                C28666k c28666k = C28666k.f132918a;
                String str = this.f132933a;
                c28666k.m143438l(str, str);
                m127100h2 = AbstractC24334o.m127100h("current_user_uid = " + this.f132933a + "\n                            ", null, 1, null);
                int m2863d2 = m42200M6.m2863d("prodctlg_catalog_products", m127100h2, null);
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("clearDataOfUser [Delete products] delete count:");
                    sb3.append(m2863d2);
                }
                c28666k.m143455p();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f132934a;

        /* renamed from: b */
        final /* synthetic */ String f132935b;

        /* renamed from: vx.k$h$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f132936q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence m143469a(long j11) {
                return String.valueOf(j11);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m143469a(((Number) obj).longValue());
            }
        }

        h(List list, String str) {
            this.f132934a = list;
            this.f132935b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m131214n0;
            String m127100h;
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                m131214n0 = AbstractC25332a0.m131214n0(this.f132934a, null, null, null, 0, null, a.f132936q, 31, null);
                String str = this.f132935b;
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + str + "\n                                | AND catalog_id IN " + ("('" + m131214n0 + "')") + "\n                            ", null, 1, null);
                int m2863d = m42200M6.m2863d("prodctlg_catalog_info", m127100h, null);
                if (AbstractC9183a.m48999g()) {
                    List list = this.f132934a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("deleteCatalogs [RESULT] deleted count:");
                    sb2.append(m2863d);
                    sb2.append(", deletedCatalogIds: ");
                    sb2.append(list);
                }
                List list2 = this.f132934a;
                String str2 = this.f132935b;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    C28666k c28666k = C28666k.f132918a;
                    AbstractC19074t.m100205c(str2);
                    c28666k.m143439m(str2, longValue);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f132937a;

        /* renamed from: b */
        final /* synthetic */ String f132938b;

        /* renamed from: c */
        final /* synthetic */ long f132939c;

        /* renamed from: vx.k$i$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f132940q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence m143470a(long j11) {
                return String.valueOf(j11);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m143470a(((Number) obj).longValue());
            }
        }

        i(List list, String str, long j11) {
            this.f132937a = list;
            this.f132938b = str;
            this.f132939c = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m131214n0;
            String m127100h;
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                m131214n0 = AbstractC25332a0.m131214n0(this.f132937a, null, null, null, 0, null, a.f132940q, 31, null);
                String str = this.f132938b;
                long j11 = this.f132939c;
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + str + "\n                        | AND catalog_id = " + j11 + "\n                        | AND product_id IN " + ("('" + m131214n0 + "')") + "\n                    ", null, 1, null);
                int m2863d = m42200M6.m2863d("prodctlg_catalog_products", m127100h, null);
                if (AbstractC9183a.m48999g()) {
                    AbstractC23350e.m122772b("deleteProductsInCatalog [RESULT] catalogId:" + this.f132939c + ", deleted count:" + m2863d, new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132941a;

        /* renamed from: b */
        final /* synthetic */ long f132942b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f132943c;

        j(String str, long j11, InterfaceC18505l interfaceC18505l) {
            this.f132941a = str;
            this.f132942b = j11;
            this.f132943c = interfaceC18505l;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C28666k c28666k = C28666k.f132918a;
            String str = this.f132941a;
            AbstractC19074t.m100207e(str, "$currentUserUid");
            C29259b m143457r = c28666k.m143457r(str, this.f132942b);
            if (m143457r != null) {
                this.f132943c.mo205i9(new AbstractC28671p.b(m143457r));
                return;
            }
            InterfaceC18505l interfaceC18505l = this.f132943c;
            int m104491c = AbstractC28665j.m143428d().m104491c();
            String m104492d = AbstractC28665j.m143428d().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    /* renamed from: vx.k$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C29265h f132944a;

        /* renamed from: b */
        final /* synthetic */ C29259b f132945b;

        /* renamed from: c */
        final /* synthetic */ String f132946c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18505l f132947d;

        k(C29265h c29265h, C29259b c29259b, String str, InterfaceC18505l interfaceC18505l) {
            this.f132944a = c29265h;
            this.f132945b = c29259b;
            this.f132946c = str;
            this.f132947d = interfaceC18505l;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            String m127100h;
            int i12;
            Object m131207g0;
            long j11;
            boolean z11;
            long j12;
            String str;
            Cursor cursor = null;
            try {
                try {
                    C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                    C29265h c29265h = this.f132944a;
                    if (c29265h != null) {
                        i11 = c29265h.m146205f();
                    } else {
                        i11 = 0;
                    }
                    int m146182b = C29262e.f135580a.m146182b();
                    if (AbstractC9183a.m48999g()) {
                        String m146159n = this.f132945b.m146159n();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getProducts [START] catalogId: ");
                        sb2.append(m146159n);
                        sb2.append(", offset: ");
                        sb2.append(i11);
                        sb2.append(", limit: ");
                        sb2.append(m146182b);
                    }
                    m127100h = AbstractC24334o.m127100h("SELECT *\n                        | FROM prodctlg_catalog_products INNER JOIN prodctlg_product_info\n                        | ON prodctlg_catalog_products.product_id = prodctlg_product_info.product_id\n                        | WHERE prodctlg_catalog_products.current_user_uid = " + this.f132946c + "\n                        | AND prodctlg_catalog_products.catalog_id = " + this.f132945b.m146158m() + "\n                        | ORDER BY prodctlg_product_info.create_time DESC\n                        | LIMIT " + i11 + ", " + m146182b + "\n                    ", null, 1, null);
                    cursor = m42200M6.m2873n(m127100h, null);
                    ArrayList arrayList = new ArrayList();
                    if (cursor != null && cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex("product_id");
                        int columnIndex2 = cursor.getColumnIndex("name");
                        int columnIndex3 = cursor.getColumnIndex("description");
                        int columnIndex4 = cursor.getColumnIndex("owner_uid");
                        int columnIndex5 = cursor.getColumnIndex("create_time");
                        int columnIndex6 = cursor.getColumnIndex("url_path");
                        int columnIndex7 = cursor.getColumnIndex("photo_urls");
                        int columnIndex8 = cursor.getColumnIndex("price");
                        int columnIndex9 = cursor.getColumnIndex("currency_unit");
                        while (true) {
                            Product product = new Product(cursor.getLong(columnIndex), null, null, 0L, null, null, null, null, 0L, null, null, 2046, null);
                            i12 = m146182b;
                            product.m48494t(this.f132945b.m146158m());
                            String string = cursor.getString(columnIndex2);
                            if (string == null) {
                                string = "";
                            } else {
                                AbstractC19074t.m100205c(string);
                            }
                            product.m48498y(string);
                            String string2 = cursor.getString(columnIndex3);
                            if (string2 == null) {
                                string2 = "";
                            } else {
                                AbstractC19074t.m100205c(string2);
                            }
                            product.m48497x(string2);
                            product.m48495u(cursor.getLong(columnIndex5));
                            String string3 = cursor.getString(columnIndex6);
                            if (string3 == null) {
                                string3 = "";
                            } else {
                                AbstractC19074t.m100205c(string3);
                            }
                            product.m48476C(string3);
                            String string4 = cursor.getString(columnIndex8);
                            if (string4 == null) {
                                string4 = "";
                            } else {
                                AbstractC19074t.m100205c(string4);
                            }
                            product.m48475B(string4);
                            String string5 = cursor.getString(columnIndex9);
                            if (string5 == null) {
                                string5 = "";
                            } else {
                                AbstractC19074t.m100205c(string5);
                            }
                            product.m48496w(string5);
                            String string6 = cursor.getString(columnIndex4);
                            if (string6 == null) {
                                string6 = "";
                            } else {
                                AbstractC19074t.m100205c(string6);
                            }
                            product.m48499z(string6);
                            String string7 = cursor.getString(columnIndex7);
                            if (string7 == null) {
                                str = "";
                            } else {
                                AbstractC19074t.m100205c(string7);
                                str = string7;
                            }
                            int i13 = columnIndex;
                            product.m48490n().addAll(C28666k.f132918a.m143431E(str));
                            arrayList.add(product);
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            m146182b = i12;
                            columnIndex = i13;
                        }
                    } else {
                        i12 = m146182b;
                    }
                    int size = i11 + arrayList.size();
                    m131207g0 = AbstractC25332a0.m131207g0(arrayList, 0);
                    Product product2 = (Product) m131207g0;
                    if (product2 != null) {
                        j11 = product2.m48485i();
                    } else {
                        j11 = 0;
                    }
                    if (arrayList.size() >= i12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC29261d.a aVar = AbstractC29261d.a.f135578a;
                    int m146167v = this.f132945b.m146167v();
                    C29265h c29265h2 = this.f132944a;
                    if (c29265h2 != null) {
                        j12 = c29265h2.m146204e();
                    } else {
                        j12 = 0;
                    }
                    this.f132947d.mo205i9(new AbstractC28671p.b(new C29265h(aVar, arrayList, size, j11, z11, m146167v, j12)));
                    if (AbstractC9183a.m48999g()) {
                        int size2 = arrayList.size();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("getProducts [RESULT] products size: ");
                        sb3.append(size2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String m48486j = ((Product) it.next()).m48486j();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("getProducts [RESULT] product: ");
                            sb4.append(m48486j);
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ProductCatalogDAO", e11);
                    if (cursor != null) {
                        cursor.close();
                    }
                    InterfaceC18505l interfaceC18505l = this.f132947d;
                    int m104491c = AbstractC28665j.m143428d().m104491c();
                    String m104492d = AbstractC28665j.m143428d().m104492d();
                    AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                    interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }

    /* renamed from: vx.k$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132948a;

        /* renamed from: b */
        final /* synthetic */ String f132949b;

        /* renamed from: c */
        final /* synthetic */ int f132950c;

        /* renamed from: d */
        final /* synthetic */ int f132951d;

        /* renamed from: e */
        final /* synthetic */ C29267j f132952e;

        /* renamed from: f */
        final /* synthetic */ C29260c f132953f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC18505l f132954g;

        l(String str, String str2, int i11, int i12, C29267j c29267j, C29260c c29260c, InterfaceC18505l interfaceC18505l) {
            this.f132948a = str;
            this.f132949b = str2;
            this.f132950c = i11;
            this.f132951d = i12;
            this.f132952e = c29267j;
            this.f132953f = c29260c;
            this.f132954g = interfaceC18505l;
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x01b6, code lost:            if (r2 != null) goto L58;     */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01b8, code lost:            r2.close();     */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01c4, code lost:            r0 = r23.f132954g;        r3 = p589vx.AbstractC28665j.m143428d().m104491c();        r4 = p589vx.AbstractC28665j.m143428d().m104492d();        fn0.AbstractC19074t.m100207e(r4, "getError_message(...)");        r0.mo205i9(new p589vx.AbstractC28671p.a(r3, r4));     */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01e3, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01c1, code lost:            if (r2 == null) goto L62;     */
        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo928a() {
            String m127100h;
            ArrayList arrayList;
            boolean z11;
            Object m131217q0;
            long j11;
            boolean z12;
            long j12;
            Cursor cursor = null;
            try {
                try {
                    C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                    m127100h = AbstractC24334o.m127100h("SELECT *\n                        | FROM prodctlg_catalog_info\n                        | WHERE current_user_uid = " + this.f132948a + "\n                        | AND owner_uid = " + this.f132949b + "\n                        | ORDER BY create_time DESC\n                        | LIMIT " + this.f132950c + ", " + this.f132951d + "\n                    ", null, 1, null);
                    cursor = m42200M6.m2873n(m127100h, null);
                    if (cursor != null && cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex("catalog_id");
                        int columnIndex2 = cursor.getColumnIndex("owner_uid");
                        int columnIndex3 = cursor.getColumnIndex("name");
                        int columnIndex4 = cursor.getColumnIndex("description");
                        int columnIndex5 = cursor.getColumnIndex("create_time");
                        int columnIndex6 = cursor.getColumnIndex("url_path");
                        int columnIndex7 = cursor.getColumnIndex("cover_url");
                        int columnIndex8 = cursor.getColumnIndex("total_product");
                        int columnIndex9 = cursor.getColumnIndex("version");
                        int columnIndex10 = cursor.getColumnIndex("is_default");
                        ArrayList arrayList2 = new ArrayList();
                        while (true) {
                            int i11 = columnIndex3;
                            arrayList = arrayList2;
                            C29259b c29259b = new C29259b(cursor.getLong(columnIndex2), cursor.getLong(columnIndex));
                            String string = cursor.getString(i11);
                            String str = "";
                            if (string == null) {
                                string = "";
                            } else {
                                AbstractC19074t.m100205c(string);
                            }
                            c29259b.m146142D(string);
                            String string2 = cursor.getString(columnIndex4);
                            if (string2 == null) {
                                string2 = "";
                            } else {
                                AbstractC19074t.m100205c(string2);
                            }
                            c29259b.m146139A(string2);
                            int i12 = columnIndex2;
                            c29259b.m146170y(cursor.getLong(columnIndex5));
                            String string3 = cursor.getString(columnIndex6);
                            if (string3 == null) {
                                string3 = "";
                            } else {
                                AbstractC19074t.m100205c(string3);
                            }
                            c29259b.m146144F(string3);
                            String string4 = cursor.getString(columnIndex7);
                            if (string4 != null) {
                                AbstractC19074t.m100205c(string4);
                                str = string4;
                            }
                            c29259b.m146169x(str);
                            c29259b.m146143E(cursor.getInt(columnIndex8));
                            c29259b.m146145G(cursor.getInt(columnIndex9));
                            if (cursor.getInt(columnIndex10) == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c29259b.m146171z(z11);
                            c29259b.m146140B(true);
                            arrayList.add(c29259b);
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            arrayList2 = arrayList;
                            columnIndex2 = i12;
                            columnIndex3 = i11;
                        }
                        if (AbstractC9183a.m48999g()) {
                            String str2 = this.f132949b;
                            int size = arrayList.size();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("getUserCatalogs [RESULT] ownerId: ");
                            sb2.append(str2);
                            sb2.append(", catalogs size: ");
                            sb2.append(size);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                String m146159n = ((C29259b) it.next()).m146159n();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("getUserCatalogs [RESULT] catalog: ");
                                sb3.append(m146159n);
                            }
                        }
                        AbstractC29261d.a aVar = AbstractC29261d.a.f135578a;
                        int size2 = this.f132950c + arrayList.size();
                        m131217q0 = AbstractC25332a0.m131217q0(arrayList);
                        C29259b c29259b2 = (C29259b) m131217q0;
                        if (c29259b2 != null) {
                            j11 = c29259b2.m146158m();
                        } else {
                            j11 = 0;
                        }
                        if (arrayList.size() >= this.f132951d) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int m146253h = this.f132952e.m146253h();
                        C29260c c29260c = this.f132953f;
                        if (c29260c != null) {
                            j12 = c29260c.m146177f();
                        } else {
                            j12 = 0;
                        }
                        this.f132954g.mo205i9(new AbstractC28671p.b(new C29260c(aVar, arrayList, size2, j11, z12, m146253h, j12)));
                        cursor.close();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ProductCatalogDAO", e11);
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }

    /* renamed from: vx.k$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C29259b f132955a;

        /* renamed from: b */
        final /* synthetic */ String f132956b;

        m(C29259b c29259b, String str) {
            this.f132955a = c29259b;
            this.f132956b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            if (AbstractC9183a.m48999g()) {
                String m146159n = this.f132955a.m146159n();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("insertCatalog [START] catalog:");
                sb2.append(m146159n);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                ContentValues contentValues = new ContentValues();
                C29259b c29259b = this.f132955a;
                contentValues.put("name", c29259b.m146160o());
                contentValues.put("description", c29259b.m146156k());
                contentValues.put("create_time", Long.valueOf(c29259b.m146154i()));
                contentValues.put("url_path", c29259b.m146166u());
                contentValues.put("cover_url", c29259b.m146153h());
                contentValues.put("total_product", Integer.valueOf(c29259b.m146165t()));
                contentValues.put("version", Integer.valueOf(c29259b.m146167v()));
                contentValues.put("is_default", Integer.valueOf(c29259b.m146168w() ? 1 : 0));
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + this.f132956b + "\n                                | AND owner_uid = " + this.f132955a.m146161p() + "\n                                | AND catalog_id = " + this.f132955a.m146158m() + "\n                            ", null, 1, null);
                int m2876q = m42200M6.m2876q("prodctlg_catalog_info", contentValues, m127100h, null);
                if (m2876q <= 0) {
                    String str = this.f132956b;
                    C29259b c29259b2 = this.f132955a;
                    contentValues.put("current_user_uid", str);
                    contentValues.put("catalog_id", Long.valueOf(c29259b2.m146158m()));
                    contentValues.put("owner_uid", Long.valueOf(c29259b2.m146161p()));
                    long m2868i = m42200M6.m2868i("prodctlg_catalog_info", null, contentValues);
                    if (AbstractC9183a.m48999g()) {
                        String m146159n2 = this.f132955a.m146159n();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("insertCatalog [INSERT] rowId:");
                        sb3.append(m2868i);
                        sb3.append(", catalog: ");
                        sb3.append(m146159n2);
                    }
                } else if (AbstractC9183a.m48999g()) {
                    String m146159n3 = this.f132955a.m146159n();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("insertCatalog [UPDATE] update:");
                    sb4.append(m2876q);
                    sb4.append(", catalog: ");
                    sb4.append(m146159n3);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C29259b f132957a;

        /* renamed from: b */
        final /* synthetic */ String f132958b;

        n(C29259b c29259b, String str) {
            this.f132957a = c29259b;
            this.f132958b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                try {
                    m42200M6.m2860a();
                    List<Product> m146163r = this.f132957a.m146163r();
                    if (AbstractC9183a.m48999g()) {
                        AbstractC23350e.m122772b("insertCatalogProducts [START] catalog: " + this.f132957a.m146159n() + ", productSize: " + m146163r.size(), new Object[0]);
                    }
                    C28666k c28666k = C28666k.f132918a;
                    String str = this.f132958b;
                    AbstractC19074t.m100207e(str, "$currentUserUid");
                    c28666k.m143439m(str, this.f132957a.m146158m());
                    String str2 = this.f132958b;
                    C29259b c29259b = this.f132957a;
                    for (Product product : m146163r) {
                        C28666k c28666k2 = C28666k.f132918a;
                        AbstractC19074t.m100205c(str2);
                        long m146158m = c29259b.m146158m();
                        AbstractC19074t.m100205c(m42200M6);
                        c28666k2.m143430B(str2, m146158m, product, m42200M6);
                        c28666k2.m143440y(str2, c29259b, product, m42200M6);
                    }
                    m42200M6.m2875p();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ProductCatalogDAO", e11);
                }
                m42200M6.m2864e();
            } catch (Throwable th2) {
                m42200M6.m2864e();
                throw th2;
            }
        }
    }

    /* renamed from: vx.k$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132959a;

        /* renamed from: b */
        final /* synthetic */ long f132960b;

        /* renamed from: c */
        final /* synthetic */ Product f132961c;

        o(String str, long j11, Product product) {
            this.f132959a = str;
            this.f132960b = j11;
            this.f132961c = product;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                C28666k c28666k = C28666k.f132918a;
                String str = this.f132959a;
                AbstractC19074t.m100207e(str, "$currentUserUid");
                long j11 = this.f132960b;
                Product product = this.f132961c;
                AbstractC19074t.m100205c(m42200M6);
                c28666k.m143430B(str, j11, product, m42200M6);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132962a;

        /* renamed from: b */
        final /* synthetic */ int f132963b;

        /* renamed from: c */
        final /* synthetic */ String f132964c;

        p(String str, int i11, String str2) {
            this.f132962a = str;
            this.f132963b = i11;
            this.f132964c = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            if (AbstractC9183a.m48999g()) {
                String str = this.f132962a;
                int i11 = this.f132963b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("insertUserCatalogMeta [START] ownerId=");
                sb2.append(str);
                sb2.append(", version=");
                sb2.append(i11);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("user_catalogs_version", Integer.valueOf(this.f132963b));
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + this.f132964c + "\n                                | AND owner_uid = " + this.f132962a + "\n                            ", null, 1, null);
                int m2876q = m42200M6.m2876q("prodctlg_user_catalogs_meta", contentValues, m127100h, null);
                if (m2876q <= 0) {
                    String str2 = this.f132964c;
                    String str3 = this.f132962a;
                    contentValues.put("current_user_uid", str2);
                    contentValues.put("owner_uid", str3);
                    long m2868i = m42200M6.m2868i("prodctlg_user_catalogs_meta", null, contentValues);
                    if (AbstractC9183a.m48999g()) {
                        String str4 = this.f132962a;
                        int i12 = this.f132963b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("insertUserCatalogMeta [INSERT] ownerId=");
                        sb3.append(str4);
                        sb3.append(", version=");
                        sb3.append(i12);
                        sb3.append(", rowId:");
                        sb3.append(m2868i);
                    }
                } else if (AbstractC9183a.m48999g()) {
                    String str5 = this.f132962a;
                    int i13 = this.f132963b;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("insertUserCatalogMeta [UPDATE] ownerId=");
                    sb4.append(str5);
                    sb4.append(", version=");
                    sb4.append(i13);
                    sb4.append(", update:");
                    sb4.append(m2876q);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132965a;

        /* renamed from: b */
        final /* synthetic */ List f132966b;

        /* renamed from: c */
        final /* synthetic */ String f132967c;

        q(String str, List list, String str2) {
            this.f132965a = str;
            this.f132966b = list;
            this.f132967c = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            if (AbstractC9183a.m48999g()) {
                String str = this.f132965a;
                int size = this.f132966b.size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("insertUserCatalogs [START] ownerId=");
                sb2.append(str);
                sb2.append(", catalog size:");
                sb2.append(size);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                try {
                    m42200M6.m2860a();
                    C28666k c28666k = C28666k.f132918a;
                    String str2 = this.f132967c;
                    AbstractC19074t.m100207e(str2, "$currentUserUid");
                    c28666k.m143438l(str2, this.f132965a);
                    List<C29259b> list = this.f132966b;
                    String str3 = this.f132967c;
                    for (C29259b c29259b : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("name", c29259b.m146160o());
                        contentValues.put("description", c29259b.m146156k());
                        contentValues.put("create_time", Long.valueOf(c29259b.m146154i()));
                        contentValues.put("url_path", c29259b.m146166u());
                        contentValues.put("cover_url", c29259b.m146153h());
                        contentValues.put("total_product", Integer.valueOf(c29259b.m146165t()));
                        contentValues.put("version", Integer.valueOf(c29259b.m146167v()));
                        contentValues.put("is_default", Integer.valueOf(c29259b.m146168w() ? 1 : 0));
                        m127100h = AbstractC24334o.m127100h("current_user_uid = " + str3 + "\n                                | AND owner_uid = " + c29259b.m146161p() + "\n                                | AND catalog_id = " + c29259b.m146158m() + "\n                            ", null, 1, null);
                        int m2876q = m42200M6.m2876q("prodctlg_catalog_info", contentValues, m127100h, null);
                        if (m2876q <= 0) {
                            contentValues.put("current_user_uid", str3);
                            contentValues.put("catalog_id", Long.valueOf(c29259b.m146158m()));
                            contentValues.put("owner_uid", Long.valueOf(c29259b.m146161p()));
                            long m2868i = m42200M6.m2868i("prodctlg_catalog_info", null, contentValues);
                            if (AbstractC9183a.m48999g()) {
                                String m146159n = c29259b.m146159n();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("insertUserCatalogs [INSERT] rowId:");
                                sb3.append(m2868i);
                                sb3.append(", catalog: ");
                                sb3.append(m146159n);
                            }
                        } else if (AbstractC9183a.m48999g()) {
                            String m146159n2 = c29259b.m146159n();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("insertUserCatalogs [UPDATE] update:");
                            sb4.append(m2876q);
                            sb4.append(", catalog: ");
                            sb4.append(m146159n2);
                        }
                    }
                    m42200M6.m2875p();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ProductCatalogDAO", e11);
                }
                m42200M6.m2864e();
            } catch (Throwable th2) {
                m42200M6.m2864e();
                throw th2;
            }
        }
    }

    /* renamed from: vx.k$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132968a;

        r(String str) {
            this.f132968a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            AbstractC9183a.m48999g();
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("version", (Integer) 0);
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + this.f132968a + "\n                            ", null, 1, null);
                int m2876q = m42200M6.m2876q("prodctlg_catalog_info", contentValues, m127100h, null);
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resetAllCatalogsVersion [RESULT] update:");
                    sb2.append(m2876q);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132969a;

        s(String str) {
            this.f132969a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("user_catalogs_version", (Integer) 0);
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + this.f132969a + "\n                            ", null, 1, null);
                int m2876q = m42200M6.m2876q("prodctlg_user_catalogs_meta", contentValues, m127100h, null);
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resetAllUserCatalogsVersion [RESULT] update:");
                    sb2.append(m2876q);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    /* renamed from: vx.k$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C29259b f132970a;

        /* renamed from: b */
        final /* synthetic */ String f132971b;

        t(C29259b c29259b, String str) {
            this.f132970a = c29259b;
            this.f132971b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m127100h;
            if (AbstractC9183a.m48999g()) {
                String m146159n = this.f132970a.m146159n();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updateCatalogData [START] catalog: ");
                sb2.append(m146159n);
            }
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            try {
                ContentValues contentValues = new ContentValues();
                C29259b c29259b = this.f132970a;
                contentValues.put("name", c29259b.m146160o());
                contentValues.put("description", c29259b.m146156k());
                contentValues.put("create_time", Long.valueOf(c29259b.m146154i()));
                contentValues.put("url_path", c29259b.m146166u());
                contentValues.put("cover_url", c29259b.m146153h());
                contentValues.put("total_product", Integer.valueOf(c29259b.m146165t()));
                contentValues.put("version", Integer.valueOf(c29259b.m146167v()));
                contentValues.put("is_default", Integer.valueOf(c29259b.m146168w() ? 1 : 0));
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + this.f132971b + "\n                                | AND owner_uid = " + this.f132970a.m146161p() + "\n                                | AND catalog_id = " + this.f132970a.m146158m() + "\n                            ", null, 1, null);
                int m2876q = m42200M6.m2876q("prodctlg_catalog_info", contentValues, m127100h, null);
                if (AbstractC9183a.m48999g()) {
                    String m146159n2 = this.f132970a.m146159n();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("updateCatalogData [END] updateCount: ");
                    sb3.append(m2876q);
                    sb3.append(", catalog: ");
                    sb3.append(m146159n2);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        }
    }

    private C28666k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m143430B(String str, long j11, Product product, C0918j0 c0918j0) {
        String m127100h;
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", product.m48488l());
        contentValues.put("description", product.m48483g());
        contentValues.put("owner_uid", product.m48489m());
        contentValues.put("create_time", Long.valueOf(product.m48481e()));
        contentValues.put("url_path", product.m48492p());
        contentValues.put("photo_urls", f132918a.m143432F(product.m48490n()));
        contentValues.put("price", product.m48491o());
        contentValues.put("currency_unit", product.m48482f());
        m127100h = AbstractC24334o.m127100h("current_user_uid = " + str + "\n                                | AND owner_uid = " + product.m48489m() + "\n                                | AND product_id = " + product.m48485i() + "\n                            ", null, 1, null);
        int m2876q = c0918j0.m2876q("prodctlg_product_info", contentValues, m127100h, null);
        if (m2876q <= 0) {
            contentValues.put("current_user_uid", str);
            contentValues.put("product_id", Long.valueOf(product.m48485i()));
            contentValues.put("owner_uid", product.m48489m());
            long m2868i = c0918j0.m2868i("prodctlg_product_info", null, contentValues);
            if (AbstractC9183a.m48999g()) {
                String m48486j = product.m48486j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("insertProductInfo [INSERT] rowId:");
                sb2.append(m2868i);
                sb2.append(", product=");
                sb2.append(m48486j);
                return;
            }
            return;
        }
        if (AbstractC9183a.m48999g()) {
            String m48486j2 = product.m48486j();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("insertProductInfo [UPDATE] update:");
            sb3.append(m2876q);
            sb3.append(", product=");
            sb3.append(m48486j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final List m143431E(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String string = jSONArray.getString(i11);
                AbstractC19074t.m100207e(string, "getString(...)");
                arrayList.add(string);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ProductCatalogDAO", e11);
        }
        return arrayList;
    }

    /* renamed from: F */
    private final String m143432F(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m143438l(String str, String str2) {
        String m127100h;
        C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
        m127100h = AbstractC24334o.m127100h("current_user_uid = " + str + "\n                    | AND owner_uid = " + str2 + "\n                ", null, 1, null);
        int m2863d = m42200M6.m2863d("prodctlg_catalog_info", m127100h, null);
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteAllCatalogsOfUser [RESULT] ownerId:");
            sb2.append(str2);
            sb2.append(", deleted count:");
            sb2.append(m2863d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m143439m(String str, long j11) {
        String m127100h;
        C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
        m127100h = AbstractC24334o.m127100h("current_user_uid = " + str + "\n                    | AND catalog_id = " + j11 + "\n                ", null, 1, null);
        int m2863d = m42200M6.m2863d("prodctlg_catalog_products", m127100h, null);
        if (AbstractC9183a.m48999g()) {
            AbstractC23350e.m122772b("deleteAllProductsOfCatalog [RESULT] catalogId:" + j11 + ", deleted count:" + m2863d, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m143440y(String str, C29259b c29259b, Product product, C0918j0 c0918j0) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_user_uid", str);
        contentValues.put("catalog_id", Long.valueOf(c29259b.m146158m()));
        contentValues.put("product_id", Long.valueOf(product.m48485i()));
        long m2868i = c0918j0.m2868i("prodctlg_catalog_products", null, contentValues);
        if (AbstractC9183a.m48999g()) {
            long m146158m = c29259b.m146158m();
            long m48485i = product.m48485i();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("insertCatalogProductRelation [INSERT] catalogId=");
            sb2.append(m146158m);
            sb2.append(", productId=");
            sb2.append(m48485i);
            sb2.append(", rowId:");
            sb2.append(m2868i);
        }
    }

    /* renamed from: A */
    public final void m143441A(long j11, Product product) {
        AbstractC19074t.m100208f(product, "product");
        C0824j.m2153b(new o(CoreUtility.f89233i, j11, product));
    }

    /* renamed from: C */
    public final void m143442C(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        C0824j.m2153b(new p(str, i11, CoreUtility.f89233i));
    }

    /* renamed from: D */
    public final void m143443D(String str, List list) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "catalogs");
        C0824j.m2153b(new q(str, list, CoreUtility.f89233i));
    }

    /* renamed from: G */
    public final void m143444G() {
        C0824j.m2153b(new r(CoreUtility.f89233i));
    }

    /* renamed from: H */
    public final void m143445H() {
        C0824j.m2153b(new s(CoreUtility.f89233i));
    }

    /* renamed from: I */
    public final void m143446I(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        C0824j.m2153b(new t(c29259b, CoreUtility.f89233i));
    }

    /* renamed from: f */
    public final void m143447f(C29259b c29259b, Product product) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(product, "product");
        C0824j.m2153b(new e(c29259b, product, CoreUtility.f89233i));
    }

    /* renamed from: g */
    public final void m143448g(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        C0824j.m2153b(new f(str, j11, CoreUtility.f89233i));
    }

    /* renamed from: h */
    public final void m143449h(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C0824j.m2153b(new g(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:            if (com.zing.zalo.productcatalog.utils.AbstractC9183a.m48999g() == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:            r1 = new java.lang.StringBuilder();        r1.append("countCatalogProduct catalogId: ");        r1.append(r7);        r1.append(", count: ");        r1.append(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:            if (r1 == null) goto L18;     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m143450i(long j11) {
        String m127100h;
        int i11 = 0;
        Cursor cursor = null;
        try {
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                m127100h = AbstractC24334o.m127100h("SELECT COUNT(*)\n                        | FROM prodctlg_catalog_products\n                        | WHERE current_user_uid = " + CoreUtility.f89233i + "\n                        | AND catalog_id = " + j11 + "\n                    ", null, 1, null);
                cursor = m42200M6.m2873n(m127100h, null);
                if (cursor != null && cursor.moveToFirst()) {
                    i11 = cursor.getInt(0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:            if (com.zing.zalo.productcatalog.utils.AbstractC9183a.m48999g() == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:            r1 = new java.lang.StringBuilder();        r1.append("countCatalogs ownerId: ");        r1.append(r7);        r1.append(", count: ");        r1.append(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:            if (r1 == null) goto L18;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m143451j(String str) {
        String m127100h;
        AbstractC19074t.m100208f(str, "ownerId");
        int i11 = 0;
        Cursor cursor = null;
        try {
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                m127100h = AbstractC24334o.m127100h("SELECT COUNT(*)\n                        | FROM prodctlg_catalog_info\n                        | WHERE current_user_uid = " + CoreUtility.f89233i + "\n                        | AND owner_uid = " + str + "\n                    ", null, 1, null);
                cursor = m42200M6.m2873n(m127100h, null);
                if (cursor != null && cursor.moveToFirst()) {
                    i11 = cursor.getInt(0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: k */
    public final void m143452k() {
        try {
            C7960e m41971c6 = C7960e.m41971c6();
            C0918j0 m42200M6 = m41971c6.m42200M6();
            try {
                try {
                    m42200M6.m2860a();
                    if (!m41971c6.m42075B9("prodctlg_user_catalogs_meta")) {
                        m42200M6.m2865f(d.f132925a.m143468a());
                    }
                    if (!m41971c6.m42075B9("prodctlg_catalog_info")) {
                        m42200M6.m2865f(a.f132919a.m143465a());
                    }
                    if (!m41971c6.m42075B9("prodctlg_product_info")) {
                        m42200M6.m2865f(c.f132923a.m143467a());
                    }
                    if (!m41971c6.m42075B9("prodctlg_catalog_products")) {
                        m42200M6.m2865f(b.f132921a.m143466a());
                    }
                    m42200M6.m2875p();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ProductCatalogDAO", e11);
                }
                m42200M6.m2864e();
            } catch (Throwable th2) {
                m42200M6.m2864e();
                throw th2;
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ProductCatalogDAO", e12);
        }
    }

    /* renamed from: n */
    public final void m143453n(List list) {
        AbstractC19074t.m100208f(list, "deletedCatalogIds");
        C0824j.m2153b(new h(list, CoreUtility.f89233i));
    }

    /* renamed from: o */
    public final void m143454o(long j11, List list) {
        AbstractC19074t.m100208f(list, "deletedProductIds");
        C0824j.m2153b(new i(list, CoreUtility.f89233i, j11));
    }

    /* renamed from: p */
    public final void m143455p() {
        String m127100h;
        try {
            AbstractC9183a.m48999g();
            m127100h = AbstractC24334o.m127100h("DELETE FROM prodctlg_product_info\n                        | WHERE product_id NOT IN (SELECT DISTINCT product_id\n FROM prodctlg_catalog_products)\n                    ", null, 1, null);
            C7960e.m41971c6().m42200M6().m2865f(m127100h);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ProductCatalogDAO", e11);
        }
    }

    /* renamed from: q */
    public final void m143456q(long j11, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getCatalog [START] catalogId: ");
            sb2.append(j11);
        }
        C0824j.m2153b(new j(CoreUtility.f89233i, j11, interfaceC18505l));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:            if (r5 == null) goto L47;     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x010a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:267), block:B:47:0x010a */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C29259b m143457r(String str, long j11) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        String m127100h;
        boolean z11;
        AbstractC19074t.m100208f(str, "currentUserUid");
        try {
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + str + "\n                        | AND catalog_id = " + j11 + "\n                    ", null, 1, null);
                cursor2 = m42200M6.m2871l("prodctlg_catalog_info", null, m127100h, null, null, null, "create_time DESC");
                if (cursor2 != null) {
                    try {
                        if (cursor2.moveToFirst()) {
                            int columnIndex = cursor2.getColumnIndex("catalog_id");
                            int columnIndex2 = cursor2.getColumnIndex("owner_uid");
                            int columnIndex3 = cursor2.getColumnIndex("name");
                            int columnIndex4 = cursor2.getColumnIndex("description");
                            int columnIndex5 = cursor2.getColumnIndex("create_time");
                            int columnIndex6 = cursor2.getColumnIndex("url_path");
                            int columnIndex7 = cursor2.getColumnIndex("cover_url");
                            int columnIndex8 = cursor2.getColumnIndex("total_product");
                            int columnIndex9 = cursor2.getColumnIndex("version");
                            int columnIndex10 = cursor2.getColumnIndex("is_default");
                            C29259b c29259b = new C29259b(cursor2.getLong(columnIndex2), cursor2.getLong(columnIndex));
                            String string = cursor2.getString(columnIndex3);
                            String str2 = "";
                            if (string == null) {
                                string = "";
                            } else {
                                AbstractC19074t.m100205c(string);
                            }
                            c29259b.m146142D(string);
                            String string2 = cursor2.getString(columnIndex4);
                            if (string2 == null) {
                                string2 = "";
                            } else {
                                AbstractC19074t.m100205c(string2);
                            }
                            c29259b.m146139A(string2);
                            c29259b.m146170y(cursor2.getLong(columnIndex5));
                            String string3 = cursor2.getString(columnIndex6);
                            if (string3 == null) {
                                string3 = "";
                            } else {
                                AbstractC19074t.m100205c(string3);
                            }
                            c29259b.m146144F(string3);
                            String string4 = cursor2.getString(columnIndex7);
                            if (string4 != null) {
                                AbstractC19074t.m100205c(string4);
                                str2 = string4;
                            }
                            c29259b.m146169x(str2);
                            c29259b.m146143E(cursor2.getInt(columnIndex8));
                            c29259b.m146145G(cursor2.getInt(columnIndex9));
                            if (cursor2.getInt(columnIndex10) == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c29259b.m146171z(z11);
                            c29259b.m146140B(true);
                            if (AbstractC9183a.m48999g()) {
                                String m146159n = c29259b.m146159n();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("getCatalog [RESULT: FOUND] catalog: ");
                                sb2.append(m146159n);
                            }
                            cursor2.close();
                            return c29259b;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC23350e.m122776f("ProductCatalogDAO", e);
                    }
                }
                cursor2.close();
            } catch (Exception e12) {
                e = e12;
                cursor2 = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
            cursor2.close();
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getCatalog [RESULT: NOT FOUND] catalog id: ");
                sb3.append(j11);
                return null;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = cursor3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:            if (r2 == null) goto L17;     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m143458s(long j11) {
        String m127100h;
        Cursor cursor = null;
        int i11 = -1;
        try {
            try {
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + CoreUtility.f89233i + "\n                        | AND catalog_id = " + j11 + "\n                    ", null, 1, null);
                cursor = C7960e.m41971c6().m42200M6().m2871l("prodctlg_catalog_info", new String[]{"version"}, m127100h, null, null, null, null);
                if (cursor != null && cursor.moveToFirst()) {
                    i11 = cursor.getInt(cursor.getColumnIndex("version"));
                }
                cursor.close();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
            cursor.close();
            return i11;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0089, code lost:            if (r3 >= 0) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:            r4 = r2.getLong(r0);        r6 = r2.getString(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:            if (r6 != null) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:            r6 = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:            if (r6.length() <= 0) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:            r1.add(new pm0.C24860q(java.lang.Long.valueOf(r4), r6));     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:            if (r2.moveToNext() != false) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:            if (r2 != null) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:            r2.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:            if (r2 == null) goto L37;     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m143459t(long j11) {
        String m127100h;
        ArrayList<C24860q> arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getProductNames [START] catalogId: ");
                    sb2.append(j11);
                }
                m127100h = AbstractC24334o.m127100h("SELECT prodctlg_product_info.product_id as productId, prodctlg_product_info.name as productName\n                        | FROM prodctlg_catalog_products INNER JOIN prodctlg_product_info\n                        | ON prodctlg_catalog_products.product_id = prodctlg_product_info.product_id\n                        | WHERE prodctlg_catalog_products.current_user_uid = " + CoreUtility.f89233i + "\n                        | AND prodctlg_catalog_products.catalog_id = " + j11 + "\n                    ", null, 1, null);
                cursor = m42200M6.m2873n(m127100h, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int columnIndex = cursor.getColumnIndex("productId");
                    int columnIndex2 = cursor.getColumnIndex("productName");
                    if (columnIndex >= 0) {
                    }
                }
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getProductNames [RESULT] catalogId: ");
                    sb3.append(j11);
                    for (C24860q c24860q : arrayList) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getProductNames [RESULT] product name: ");
                        sb4.append(c24860q);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: u */
    public final void m143460u(C29259b c29259b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        C0824j.m2153b(new k(c29259b.m146155j(), c29259b, CoreUtility.f89233i, interfaceC18505l));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:            if (com.zing.zalo.productcatalog.utils.AbstractC9183a.m48999g() == false) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:            r0 = new java.lang.StringBuilder();        r0.append("getUserCatalogMeta [NOT FOUND] ownerId: ");        r0.append(r12);        r0.append(", catalogListVersion: 0");     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:            if (r1 == null) goto L22;     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m143461v(String str) {
        String m127100h;
        AbstractC19074t.m100208f(str, "ownerId");
        String str2 = CoreUtility.f89233i;
        Cursor cursor = null;
        try {
            try {
                C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
                m127100h = AbstractC24334o.m127100h("current_user_uid = " + str2 + "\n                            | AND owner_uid = " + str + "\n                        ", null, 1, null);
                cursor = m42200M6.m2871l("prodctlg_user_catalogs_meta", null, m127100h, null, null, null, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int i11 = cursor.getInt(cursor.getColumnIndex("user_catalogs_version"));
                    if (AbstractC9183a.m48999g()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getUserCatalogMeta [FOUND] ownerId: ");
                        sb2.append(str);
                        sb2.append(", catalogListVersion: ");
                        sb2.append(i11);
                    }
                    cursor.close();
                    return i11;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogDAO", e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: w */
    public final void m143462w(C29267j c29267j, InterfaceC18505l interfaceC18505l) {
        int i11;
        AbstractC19074t.m100208f(c29267j, "userCatalogs");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        String str = CoreUtility.f89233i;
        String m146258m = c29267j.m146258m();
        C29260c m146255j = c29267j.m146255j();
        if (m146255j != null) {
            i11 = m146255j.m146178g();
        } else {
            i11 = 0;
        }
        int m146181a = C29262e.f135580a.m146181a();
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getUserCatalogs [START] ownerId: ");
            sb2.append(m146258m);
            sb2.append(", offset: ");
            sb2.append(i11);
        }
        C0824j.m2153b(new l(str, m146258m, i11, m146181a, c29267j, m146255j, interfaceC18505l));
    }

    /* renamed from: x */
    public final void m143463x(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        C0824j.m2153b(new m(c29259b, CoreUtility.f89233i));
    }

    /* renamed from: z */
    public final void m143464z(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        C0824j.m2153b(new n(c29259b, CoreUtility.f89233i));
    }
}
