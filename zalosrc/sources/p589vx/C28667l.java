package p589vx;

import ae.C0766k;
import android.text.TextUtils;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.model.ProductPhoto;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.AddCatalogSource;
import com.zing.zalo.productcatalog.utils.AddProductSource;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.productcatalog.utils.DeleteProductSource;
import com.zing.zalo.productcatalog.utils.EditCatalogSource;
import com.zing.zalo.productcatalog.utils.EditProductSource;
import com.zing.zalo.productcatalog.utils.MoveProductSource;
import cy.AbstractC17585d;
import cy.C17582a;
import cy.C17583b;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p589vx.AbstractC28658c;
import p589vx.AbstractC28671p;
import p589vx.C28667l;
import p624wx.AbstractC29261d;
import p624wx.C29259b;
import p624wx.C29260c;
import p624wx.C29262e;
import p624wx.C29265h;
import p624wx.C29267j;
import pm0.C24848g0;
import qm0.AbstractC25376w;

/* renamed from: vx.l */
/* loaded from: classes4.dex */
public final class C28667l {

    /* renamed from: a */
    public static final C28667l f132972a = new C28667l();

    /* renamed from: vx.l$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f132973a;

        a(InterfaceC18505l interfaceC18505l) {
            this.f132973a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132973a;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("addCatalog#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("addCatalog#onDataProcessed json: ");
                    sb2.append(jSONObject);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    C28667l c28667l = C28667l.f132972a;
                    JSONObject jSONObject2 = optJSONObject.getJSONObject("data");
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    C29259b m143475c = c28667l.m143475c(jSONObject2);
                    int optInt = optJSONObject.optInt("versionLsCatalog");
                    boolean z11 = true;
                    if (optJSONObject.optInt("needResync") != 1) {
                        z11 = false;
                    }
                    this.f132973a.mo205i9(new AbstractC28671p.b(new C28656a(m143475c, optInt, z11)));
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogRemote", e11);
            }
            InterfaceC18505l interfaceC18505l = this.f132973a;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f132974a;

        b(InterfaceC18505l interfaceC18505l) {
            this.f132974a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132974a;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("addProduct#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            String optString;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("addProduct#onDataProcessed json: ");
                    sb2.append(jSONObject);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    C28667l c28667l = C28667l.f132972a;
                    JSONObject jSONObject2 = optJSONObject.getJSONObject("data");
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    Product m143483k = c28667l.m143483k(jSONObject2);
                    int optInt = optJSONObject.optInt("versionCatalog");
                    int optInt2 = optJSONObject.optInt("versionLsCatalog");
                    if (optJSONObject.optInt("needResync") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (optJSONObject.isNull("catalogPhoto")) {
                        optString = null;
                    } else {
                        optString = optJSONObject.optString("catalogPhoto");
                    }
                    this.f132974a.mo205i9(new AbstractC28671p.b(new C28657b(m143483k, optInt, optInt2, z11, optString)));
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogRemote", e11);
            }
            InterfaceC18505l interfaceC18505l = this.f132974a;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f132975a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f132976b;

        /* renamed from: c */
        final /* synthetic */ C0766k f132977c;

        c(long j11, InterfaceC18505l interfaceC18505l, C0766k c0766k) {
            this.f132975a = j11;
            this.f132976b = interfaceC18505l;
            this.f132977c = c0766k;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132976b;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deleteCatalog#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    long j11 = this.f132975a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("deleteCatalog#onDataProcessed catalogId: ");
                    sb2.append(j11);
                    sb2.append(", json: ");
                    sb2.append(jSONObject);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("versionLsCatalog");
                    boolean z11 = true;
                    if (optJSONObject.optInt("needResync") != 1) {
                        z11 = false;
                    }
                    this.f132976b.mo205i9(new AbstractC28671p.b(new C28660e(this.f132975a, optInt, z11)));
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f132977c.f2541a, e11);
            }
            InterfaceC18505l interfaceC18505l = this.f132976b;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f132978a;

        /* renamed from: b */
        final /* synthetic */ List f132979b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f132980c;

        /* renamed from: d */
        final /* synthetic */ C0766k f132981d;

        d(long j11, List list, InterfaceC18505l interfaceC18505l, C0766k c0766k) {
            this.f132978a = j11;
            this.f132979b = list;
            this.f132980c = interfaceC18505l;
            this.f132981d = c0766k;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132980c;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deleteProducts#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String optString;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    long j11 = this.f132978a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("deleteProducts#onDataProcessed catalogId: ");
                    sb2.append(j11);
                    sb2.append(", json: ");
                    sb2.append(jSONObject);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    ArrayList arrayList = new ArrayList(this.f132979b.size());
                    JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            arrayList.add(Long.valueOf(optJSONArray.getLong(i11)));
                        }
                    }
                    int optInt = optJSONObject.optInt("versionCatalog");
                    int optInt2 = optJSONObject.optInt("versionLsCatalog");
                    boolean z11 = true;
                    if (optJSONObject.optInt("needResync") != 1) {
                        z11 = false;
                    }
                    if (optJSONObject.isNull("catalogPhoto")) {
                        optString = null;
                    } else {
                        optString = optJSONObject.optString("catalogPhoto");
                    }
                    this.f132980c.mo205i9(new AbstractC28671p.b(new C28661f(arrayList, optInt, optInt2, z11, optString)));
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f132981d.f2541a, e11);
            }
            InterfaceC18505l interfaceC18505l = this.f132980c;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f132982a;

        e(InterfaceC18505l interfaceC18505l) {
            this.f132982a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132982a;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("editCatalog#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("editCatalog#onDataProcessed json: ");
                    sb2.append(jSONObject);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    C28667l c28667l = C28667l.f132972a;
                    JSONObject jSONObject2 = optJSONObject.getJSONObject("data");
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    C29259b m143475c = c28667l.m143475c(jSONObject2);
                    int optInt = optJSONObject.optInt("versionLsCatalog");
                    boolean z11 = true;
                    if (optJSONObject.optInt("needResync") != 1) {
                        z11 = false;
                    }
                    this.f132982a.mo205i9(new AbstractC28671p.b(new C28662g(m143475c, optInt, z11)));
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogRemote", e11);
            }
            InterfaceC18505l interfaceC18505l = this.f132982a;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f132983a;

        f(InterfaceC18505l interfaceC18505l) {
            this.f132983a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132983a;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("editProduct#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            String optString;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("editProduct#onDataProcessed json: ");
                    sb2.append(jSONObject);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    C28667l c28667l = C28667l.f132972a;
                    JSONObject jSONObject2 = optJSONObject.getJSONObject("data");
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    Product m143483k = c28667l.m143483k(jSONObject2);
                    int optInt = optJSONObject.optInt("versionCatalog");
                    int optInt2 = optJSONObject.optInt("versionLsCatalog");
                    if (optJSONObject.optInt("needResync") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (optJSONObject.isNull("catalogPhoto")) {
                        optString = null;
                    } else {
                        optString = optJSONObject.optString("catalogPhoto");
                    }
                    this.f132983a.mo205i9(new AbstractC28671p.b(new C28663h(m143483k, optInt, optInt2, z11, optString)));
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogRemote", e11);
            }
            InterfaceC18505l interfaceC18505l = this.f132983a;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f132984a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f132985b;

        /* renamed from: c */
        final /* synthetic */ C29260c f132986c;

        /* renamed from: d */
        final /* synthetic */ long f132987d;

        g(int i11, InterfaceC18505l interfaceC18505l, C29260c c29260c, long j11) {
            this.f132984a = i11;
            this.f132985b = interfaceC18505l;
            this.f132986c = c29260c;
            this.f132987d = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132985b;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28658c.b(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getCatalogs#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            boolean z11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getCatalogs#onDataProcessed json: ");
                    sb2.append(jSONObject);
                }
                optJSONObject = jSONObject.optJSONObject("data");
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogRemote", e11);
            }
            if (optJSONObject != null) {
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject.optJSONArray("items");
                int i11 = 0;
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        C28667l c28667l = C28667l.f132972a;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                        arrayList.add(c28667l.m143475c(jSONObject2));
                    }
                }
                boolean optBoolean = optJSONObject.optBoolean("hasMore", true);
                if (arrayList.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = optBoolean;
                }
                long optLong = optJSONObject.optLong("lastId", 0L);
                int optInt = optJSONObject.optInt("version");
                if (optInt == this.f132984a && optLong == 0) {
                    this.f132985b.mo205i9(AbstractC28658c.a.f132881a);
                    return;
                }
                AbstractC29261d.b bVar = AbstractC29261d.b.f135579a;
                C29260c c29260c = this.f132986c;
                if (c29260c != null) {
                    i11 = c29260c.m146178g();
                }
                C29260c c29260c2 = new C29260c(bVar, arrayList, i11 + arrayList.size(), optLong, z11, optInt, this.f132987d);
                if (AbstractC9183a.m48999g()) {
                    String m146176e = c29260c2.m146176e();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getCatalogs#onDataProcessed catalogPage: ");
                    sb3.append(m146176e);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String m146159n = ((C29259b) it.next()).m146159n();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getCatalogs#onDataProcessed catalog: ");
                        sb4.append(m146159n);
                    }
                }
                this.f132985b.mo205i9(new AbstractC28658c.c(c29260c2));
                return;
            }
            if (AbstractC19074t.m100204b(jSONObject.optString("data"), "")) {
                this.f132985b.mo205i9(AbstractC28658c.a.f132881a);
                return;
            }
            InterfaceC18505l interfaceC18505l = this.f132985b;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28658c.b(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C29259b f132988a;

        /* renamed from: b */
        final /* synthetic */ int f132989b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f132990c;

        /* renamed from: d */
        final /* synthetic */ C29265h f132991d;

        /* renamed from: e */
        final /* synthetic */ long f132992e;

        h(C29259b c29259b, int i11, InterfaceC18505l interfaceC18505l, C29265h c29265h, long j11) {
            this.f132988a = c29259b;
            this.f132989b = i11;
            this.f132990c = interfaceC18505l;
            this.f132991d = c29265h;
            this.f132992e = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final int m143485d(Product product, Product product2) {
            AbstractC19074t.m100208f(product, "p1");
            AbstractC19074t.m100208f(product2, "p2");
            long m48481e = product.m48481e() - product2.m48481e();
            if (m48481e < 0) {
                return 1;
            }
            if (m48481e > 0) {
                return -1;
            }
            return 0;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132990c;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28658c.b(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getProducts#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            boolean z11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    long m146158m = this.f132988a.m146158m();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getProducts#onDataProcessed catalogId: ");
                    sb2.append(m146158m);
                    sb2.append(", json: ");
                    sb2.append(jSONObject);
                }
                optJSONObject = jSONObject.optJSONObject("data");
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogRemote", e11);
            }
            if (optJSONObject != null) {
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject.optJSONArray("items");
                int i11 = 0;
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        C28667l c28667l = C28667l.f132972a;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                        arrayList.add(c28667l.m143483k(jSONObject2));
                    }
                }
                AbstractC25376w.m131534w(arrayList, new Comparator() { // from class: vx.m
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        int m143485d;
                        m143485d = C28667l.h.m143485d((Product) obj2, (Product) obj3);
                        return m143485d;
                    }
                });
                boolean optBoolean = optJSONObject.optBoolean("hasMore", true);
                if (arrayList.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = optBoolean;
                }
                long optLong = optJSONObject.optLong("lastId", 0L);
                int optInt = optJSONObject.optInt("version");
                if (optInt == this.f132989b && optLong == 0) {
                    this.f132990c.mo205i9(AbstractC28658c.a.f132881a);
                    return;
                }
                AbstractC29261d.b bVar = AbstractC29261d.b.f135579a;
                C29265h c29265h = this.f132991d;
                if (c29265h != null) {
                    i11 = c29265h.m146205f();
                }
                C29265h c29265h2 = new C29265h(bVar, arrayList, i11 + arrayList.size(), optLong, z11, optInt, this.f132992e);
                if (AbstractC9183a.m48999g()) {
                    String m146203d = c29265h2.m146203d();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getProducts#onDataProcessed productPage: ");
                    sb3.append(m146203d);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String m48486j = ((Product) it.next()).m48486j();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getProducts#onDataProcessed product: ");
                        sb4.append(m48486j);
                    }
                }
                this.f132990c.mo205i9(new AbstractC28658c.c(c29265h2));
                return;
            }
            if (AbstractC19074t.m100204b(jSONObject.optString("data"), "")) {
                this.f132990c.mo205i9(AbstractC28658c.a.f132881a);
                return;
            }
            InterfaceC18505l interfaceC18505l = this.f132990c;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28658c.b(m104491c, m104492d));
        }
    }

    /* renamed from: vx.l$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f132993a;

        /* renamed from: b */
        final /* synthetic */ List f132994b;

        /* renamed from: c */
        final /* synthetic */ long f132995c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18505l f132996d;

        /* renamed from: e */
        final /* synthetic */ C0766k f132997e;

        i(long j11, List list, long j12, InterfaceC18505l interfaceC18505l, C0766k c0766k) {
            this.f132993a = j11;
            this.f132994b = list;
            this.f132995c = j12;
            this.f132996d = interfaceC18505l;
            this.f132997e = c0766k;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC18505l interfaceC18505l = this.f132996d;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
            if (AbstractC9183a.m48999g()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveProducts#onErrorData errorMessage: ");
                sb2.append(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (AbstractC9183a.m48999g()) {
                    long j11 = this.f132993a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("moveProducts#onDataProcessed toCatalogId: ");
                    sb2.append(j11);
                    sb2.append(", json: ");
                    sb2.append(jSONObject);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    ArrayList arrayList = new ArrayList(this.f132994b.size());
                    JSONArray optJSONArray = optJSONObject.optJSONArray("ids");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            arrayList.add(Long.valueOf(optJSONArray.getLong(i11)));
                        }
                    }
                    this.f132996d.mo205i9(new AbstractC28671p.b(new C28664i(arrayList, this.f132995c, this.f132993a, optJSONObject.optInt("fromOldCatalogVersion"), optJSONObject.optInt("fromNewCatalogVersion"), optJSONObject.optInt("toOldCatalogVersion"), optJSONObject.optInt("toNewCatalogVersion"), optJSONObject.optInt("oldCatalogListVersion"), optJSONObject.optInt("newCatalogListVersion"))));
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f132997e.f2541a, e11);
            }
            InterfaceC18505l interfaceC18505l = this.f132996d;
            int m104491c = AbstractC28665j.m143429e().m104491c();
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28671p.a(m104491c, m104492d));
        }
    }

    private C28667l() {
    }

    /* renamed from: l */
    private final JSONObject m143471l(C29259b c29259b) {
        JSONObject jSONObject = new JSONObject();
        synchronized (c29259b) {
            jSONObject.put("catalog_name", c29259b.m146160o());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        return jSONObject;
    }

    /* renamed from: m */
    private final JSONObject m143472m(Product product) {
        String str;
        JSONObject jSONObject = new JSONObject();
        synchronized (product) {
            try {
                jSONObject.put("product_name", product.m48488l());
                jSONObject.put("description", product.m48483g());
                if (product.m48491o().length() > 0) {
                    jSONObject.put("price", product.m48491o());
                }
                if (product.m48482f().length() > 0) {
                    str = product.m48482f();
                } else if (product.m48491o().length() > 0 && TextUtils.isDigitsOnly(product.m48491o())) {
                    str = "VNĐ";
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    jSONObject.put("currency_unit", str);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it = product.m48490n().iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                for (ProductPhoto productPhoto : product.m48487k()) {
                    if (productPhoto.m48510i().length() > 0) {
                        jSONArray.put(productPhoto.m48510i());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("product_photos", jSONArray);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void m143473a(int i11, C29259b c29259b, AddCatalogSource addCatalogSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(addCatalogSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            JSONObject m143471l = m143471l(c29259b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("addCatalog START catalogListVersion: ");
            sb2.append(i11);
            sb2.append(", catalog: ");
            sb2.append(m143471l);
            sb2.append(", source: ");
            sb2.append(addCatalogSource);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(interfaceC18505l));
        c0766k.m1835b(i11, m143471l(c29259b).toString(), AbstractC17585d.m93637a(addCatalogSource));
    }

    /* renamed from: b */
    public final void m143474b(long j11, int i11, int i12, Product product, AddProductSource addProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(product, "product");
        AbstractC19074t.m100208f(addProductSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            JSONObject m143472m = m143472m(product);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("addProduct START catalogId: ");
            sb2.append(j11);
            sb2.append(", catalogVersion: ");
            sb2.append(i11);
            sb2.append(", catalogListVersion: ");
            sb2.append(i12);
            sb2.append(",  product: ");
            sb2.append(m143472m);
            sb2.append(", source: ");
            sb2.append(addProductSource);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(interfaceC18505l));
        c0766k.m1843f(j11, i11, i12, m143472m(product).toString(), AbstractC17585d.m93638b(addProductSource));
    }

    /* renamed from: c */
    public final C29259b m143475c(JSONObject jSONObject) {
        String optString;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        C29259b c29259b = new C29259b(jSONObject.optLong("ownerId"), jSONObject.optLong("id"));
        String optString2 = jSONObject.optString("name");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        c29259b.m146142D(optString2);
        c29259b.m146170y(jSONObject.optLong("created_time"));
        String optString3 = jSONObject.optString("path");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        c29259b.m146144F(optString3);
        c29259b.m146145G(jSONObject.optInt("version"));
        if (jSONObject.isNull("catalogPhoto")) {
            optString = "";
        } else {
            optString = jSONObject.optString("catalogPhoto");
            AbstractC19074t.m100205c(optString);
        }
        c29259b.m146169x(optString);
        c29259b.m146143E(jSONObject.optInt("totalProduct"));
        c29259b.m146171z(jSONObject.optBoolean("isDefault"));
        return c29259b;
    }

    /* renamed from: d */
    public final void m143476d(long j11, int i11, DeleteCatalogSource deleteCatalogSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(deleteCatalogSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteCatalog START catalogId: ");
            sb2.append(j11);
            sb2.append(", catalogListVersion: ");
            sb2.append(i11);
            sb2.append(", source: ");
            sb2.append(deleteCatalogSource);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(j11, interfaceC18505l, c0766k));
        c0766k.m1865r(i11, j11, AbstractC17585d.m93639c(deleteCatalogSource));
    }

    /* renamed from: e */
    public final void m143477e(long j11, int i11, int i12, List list, DeleteProductSource deleteProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "productIds");
        AbstractC19074t.m100208f(deleteProductSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteProducts START catalogId: ");
            sb2.append(j11);
            sb2.append(", catalogVersion: ");
            sb2.append(i11);
            sb2.append(", catalogListVersion: ");
            sb2.append(i12);
            sb2.append(", productIds: ");
            sb2.append(list);
            sb2.append(", source: ");
            sb2.append(deleteProductSource);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(j11, list, interfaceC18505l, c0766k));
        c0766k.m1867s(j11, i11, i12, list, AbstractC17585d.m93640d(deleteProductSource));
    }

    /* renamed from: f */
    public final void m143478f(int i11, C29259b c29259b, EditCatalogSource editCatalogSource, C17582a c17582a, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(editCatalogSource, "source");
        AbstractC19074t.m100208f(c17582a, "changedData");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            long m146158m = c29259b.m146158m();
            JSONObject m143471l = m143471l(c29259b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("editCatalog START catalogId: ");
            sb2.append(m146158m);
            sb2.append(", catalogListVersion: ");
            sb2.append(i11);
            sb2.append(",  catalog: ");
            sb2.append(m143471l);
            sb2.append(", source: ");
            sb2.append(editCatalogSource);
            sb2.append(", changedData: ");
            sb2.append(c17582a);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(interfaceC18505l));
        c0766k.m1877x(i11, c29259b.m146158m(), m143471l(c29259b).toString(), AbstractC17585d.m93641e(editCatalogSource, c17582a));
    }

    /* renamed from: g */
    public final void m143479g(long j11, int i11, int i12, Product product, EditProductSource editProductSource, C17583b c17583b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(product, "product");
        AbstractC19074t.m100208f(editProductSource, "source");
        AbstractC19074t.m100208f(c17583b, "changedData");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            JSONObject m143472m = m143472m(product);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("editProduct START catalogId: ");
            sb2.append(j11);
            sb2.append(", catalogVersion: ");
            sb2.append(i11);
            sb2.append(", catalogListVersion: ");
            sb2.append(i12);
            sb2.append(",  product: ");
            sb2.append(m143472m);
            sb2.append(", source: ");
            sb2.append(editProductSource);
            sb2.append(", changedData: ");
            sb2.append(c17583b);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(interfaceC18505l));
        c0766k.m1878y(j11, i11, i12, product.m48485i(), m143472m(product).toString(), AbstractC17585d.m93642f(editProductSource, c17583b));
    }

    /* renamed from: h */
    public final void m143480h(C29267j c29267j, InterfaceC18505l interfaceC18505l) {
        long j11;
        AbstractC19074t.m100208f(c29267j, "userCatalogs");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (!C23055e5.m118273h(false, 1, null)) {
            int m104491c = AbstractC28665j.m143427c().m104491c();
            String m104492d = AbstractC28665j.m143427c().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28658c.b(m104491c, m104492d));
            return;
        }
        C29260c m146255j = c29267j.m146255j();
        if (m146255j != null) {
            j11 = m146255j.m146177f();
        } else {
            j11 = 0;
        }
        int m146253h = c29267j.m146253h();
        int m146181a = C29262e.f135580a.m146181a();
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getCatalogs START catalogListVersion: ");
            sb2.append(m146253h);
            sb2.append(", lastCatalogId: ");
            sb2.append(j11);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new g(m146253h, interfaceC18505l, m146255j, j11));
        c0766k.m1823Q(m146253h, j11, m146181a);
    }

    /* renamed from: i */
    public final void m143481i(C29259b c29259b, InterfaceC18505l interfaceC18505l) {
        long j11;
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (!C23055e5.m118273h(false, 1, null)) {
            int m104491c = AbstractC28665j.m143427c().m104491c();
            String m104492d = AbstractC28665j.m143427c().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l.mo205i9(new AbstractC28658c.b(m104491c, m104492d));
            return;
        }
        C29265h m146155j = c29259b.m146155j();
        if (m146155j != null) {
            j11 = m146155j.m146204e();
        } else {
            j11 = 0;
        }
        long j12 = j11;
        int m146167v = c29259b.m146167v();
        int m146182b = C29262e.f135580a.m146182b();
        if (AbstractC9183a.m48999g()) {
            String m146159n = c29259b.m146159n();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getProducts START catalog: ");
            sb2.append(m146159n);
            sb2.append(", lastProductId: ");
            sb2.append(j12);
            sb2.append(", catalogVersion: ");
            sb2.append(m146167v);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h(c29259b, m146167v, interfaceC18505l, m146155j, j12));
        c0766k.m1824R(c29259b.m146158m(), m146167v, j12, m146182b);
    }

    /* renamed from: j */
    public final void m143482j(long j11, long j12, List list, MoveProductSource moveProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "productIds");
        AbstractC19074t.m100208f(moveProductSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveProducts START fromCatalogId: ");
            sb2.append(j11);
            sb2.append(", toCatalogId: ");
            sb2.append(j12);
            sb2.append(", productIds: ");
            sb2.append(list);
            sb2.append(", source: ");
            sb2.append(moveProductSource);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new i(j12, list, j11, interfaceC18505l, c0766k));
        c0766k.m1844f0(j11, j12, list, AbstractC17585d.m93643g(moveProductSource));
    }

    /* renamed from: k */
    public final Product m143483k(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        Product product = new Product(jSONObject.optLong("product_id"), null, null, 0L, null, null, null, null, 0L, null, null, 2046, null);
        String optString = jSONObject.optString("product_name");
        AbstractC19074t.m100207e(optString, "optString(...)");
        product.m48498y(optString);
        String optString2 = jSONObject.optString("description");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        product.m48497x(optString2);
        product.m48495u(jSONObject.optLong("create_time"));
        String optString3 = jSONObject.optString("price");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        product.m48475B(optString3);
        String optString4 = jSONObject.optString("currency_unit");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        product.m48496w(optString4);
        product.m48494t(jSONObject.optLong("catalog_id"));
        product.m48499z(String.valueOf(jSONObject.optLong("owner_id")));
        String optString5 = jSONObject.optString("path");
        AbstractC19074t.m100207e(optString5, "optString(...)");
        product.m48476C(optString5);
        JSONArray optJSONArray = jSONObject.optJSONArray("product_photos");
        if (optJSONArray != null) {
            AbstractC19074t.m100205c(optJSONArray);
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                product.m48490n().add(optJSONArray.getString(i11));
            }
        }
        return product;
    }
}
