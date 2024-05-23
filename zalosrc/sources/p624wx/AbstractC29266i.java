package p624wx;

import com.zing.zalo.productcatalog.model.Product;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p589vx.C28667l;

/* renamed from: wx.i */
/* loaded from: classes4.dex */
public abstract class AbstractC29266i {
    public static final d Companion = new d(null);

    /* renamed from: wx.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29266i {

        /* renamed from: a */
        private final C29259b f135612a;

        /* renamed from: b */
        private final int f135613b;

        /* renamed from: c */
        private final int f135614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29259b c29259b, int i11, int i12) {
            super(null);
            AbstractC19074t.m100208f(c29259b, "newCatalog");
            this.f135612a = c29259b;
            this.f135613b = i11;
            this.f135614c = i12;
        }

        /* renamed from: a */
        public final C29259b m146209a() {
            return this.f135612a;
        }

        /* renamed from: b */
        public final int m146210b() {
            return this.f135613b;
        }

        /* renamed from: c */
        public final int m146211c() {
            return this.f135614c;
        }
    }

    /* renamed from: wx.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29266i {

        /* renamed from: a */
        private final C29259b f135615a;

        /* renamed from: b */
        private final int f135616b;

        /* renamed from: c */
        private final int f135617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29259b c29259b, int i11, int i12) {
            super(null);
            AbstractC19074t.m100208f(c29259b, "editedCatalog");
            this.f135615a = c29259b;
            this.f135616b = i11;
            this.f135617c = i12;
        }

        /* renamed from: a */
        public final C29259b m146212a() {
            return this.f135615a;
        }

        /* renamed from: b */
        public final int m146213b() {
            return this.f135616b;
        }

        /* renamed from: c */
        public final int m146214c() {
            return this.f135617c;
        }
    }

    /* renamed from: wx.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29266i {

        /* renamed from: a */
        private final List f135618a;

        /* renamed from: b */
        private final int f135619b;

        /* renamed from: c */
        private final int f135620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, int i11, int i12) {
            super(null);
            AbstractC19074t.m100208f(list, "deletedCatalogIds");
            this.f135618a = list;
            this.f135619b = i11;
            this.f135620c = i12;
        }

        /* renamed from: a */
        public final List m146215a() {
            return this.f135618a;
        }

        /* renamed from: b */
        public final int m146216b() {
            return this.f135619b;
        }

        /* renamed from: c */
        public final int m146217c() {
            return this.f135620c;
        }
    }

    /* renamed from: wx.i$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC29266i m146218a(JSONObject jSONObject) {
            JSONObject optJSONObject;
            String optString;
            JSONObject optJSONObject2;
            String optString2;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4;
            String optString3;
            JSONObject optJSONObject5;
            JSONObject optJSONObject6;
            JSONObject optJSONObject7;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            String optString4 = jSONObject.optString("action");
            if (optString4 == null) {
                return null;
            }
            try {
                boolean z11 = false;
                switch (optString4.hashCode()) {
                    case -1866128276:
                        if (!optString4.equals("edit_prod") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        int optInt = optJSONObject.optInt("versionCatalog");
                        int optInt2 = optJSONObject.optInt("oldVersionCatalog");
                        int optInt3 = optJSONObject.optInt("versionLsCatalog");
                        int optInt4 = optJSONObject.optInt("oldVersionLsCatalog");
                        if (optJSONObject.isNull("catalogPhoto")) {
                            optString = null;
                        } else {
                            optString = optJSONObject.optString("catalogPhoto");
                        }
                        C28667l c28667l = C28667l.f132972a;
                        JSONObject jSONObject2 = optJSONObject.getJSONObject("item");
                        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                        return new i(c28667l.m143483k(jSONObject2), optInt, optInt3, optInt2, optInt4, optString);
                    case -1235935179:
                        if (!optString4.equals("add_prod") || (optJSONObject2 = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        int optInt5 = optJSONObject2.optInt("versionCatalog");
                        int optInt6 = optJSONObject2.optInt("oldVersionCatalog");
                        int optInt7 = optJSONObject2.optInt("versionLsCatalog");
                        int optInt8 = optJSONObject2.optInt("oldVersionLsCatalog");
                        if (optJSONObject2.isNull("catalogPhoto")) {
                            optString2 = null;
                        } else {
                            optString2 = optJSONObject2.optString("catalogPhoto");
                        }
                        C28667l c28667l2 = C28667l.f132972a;
                        JSONObject jSONObject3 = optJSONObject2.getJSONObject("item");
                        AbstractC19074t.m100207e(jSONObject3, "getJSONObject(...)");
                        return new g(c28667l2.m143483k(jSONObject3), optInt5, optInt7, optInt6, optInt8, optString2);
                    case -1229061074:
                        if (!optString4.equals("invalidate_data")) {
                            return null;
                        }
                        return f.f135622a;
                    case -992129051:
                        if (!optString4.equals("del_catalog") || (optJSONObject3 = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        int optInt9 = optJSONObject3.optInt("versionLsCatalog");
                        int optInt10 = optJSONObject3.optInt("oldVersionLsCatalog");
                        JSONArray optJSONArray = optJSONObject3.optJSONArray("ids");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray != null) {
                            int length = optJSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                arrayList.add(Long.valueOf(optJSONArray.getLong(i11)));
                            }
                        }
                        return new c(arrayList, optInt9, optInt10);
                    case 814065419:
                        if (!optString4.equals("del_prod") || (optJSONObject4 = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        long optLong = optJSONObject4.optLong("catalogId");
                        int optInt11 = optJSONObject4.optInt("versionCatalog");
                        int optInt12 = optJSONObject4.optInt("oldVersionCatalog");
                        int optInt13 = optJSONObject4.optInt("versionLsCatalog");
                        int optInt14 = optJSONObject4.optInt("oldVersionLsCatalog");
                        if (optJSONObject4.isNull("catalogPhoto")) {
                            optString3 = null;
                        } else {
                            optString3 = optJSONObject4.optString("catalogPhoto");
                        }
                        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("ids");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            int length2 = optJSONArray2.length();
                            for (int i12 = 0; i12 < length2; i12++) {
                                arrayList2.add(Long.valueOf(optJSONArray2.getLong(i12)));
                            }
                        }
                        return new h(optLong, arrayList2, optInt11, optInt13, optInt12, optInt14, optString3);
                    case 1068358405:
                        if (!optString4.equals("move_prod") || (optJSONObject5 = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        long optLong2 = optJSONObject5.optLong("fromCatalogId");
                        long optLong3 = optJSONObject5.optLong("toCatalogId");
                        JSONArray optJSONArray3 = optJSONObject5.optJSONArray("productIds");
                        ArrayList arrayList3 = new ArrayList();
                        if (optJSONArray3 != null) {
                            int length3 = optJSONArray3.length();
                            for (int i13 = 0; i13 < length3; i13++) {
                                arrayList3.add(Long.valueOf(optJSONArray3.getLong(i13)));
                            }
                        }
                        return new j(optLong2, optLong3, arrayList3, optJSONObject5.optInt("fromOldCatalogVersion"), optJSONObject5.optInt("fromNewCatalogVersion"), optJSONObject5.optInt("toOldCatalogVersion"), optJSONObject5.optInt("toNewCatalogVersion"), optJSONObject5.optInt("oldCatalogListVersion"), optJSONObject5.optInt("newCatalogListVersion"));
                    case 1094503140:
                        if (!optString4.equals("edit_catalog") || (optJSONObject6 = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        int optInt15 = optJSONObject6.optInt("versionLsCatalog");
                        int optInt16 = optJSONObject6.optInt("oldVersionLsCatalog");
                        C28667l c28667l3 = C28667l.f132972a;
                        JSONObject jSONObject4 = optJSONObject6.getJSONObject("item");
                        AbstractC19074t.m100207e(jSONObject4, "getJSONObject(...)");
                        return new b(c28667l3.m143475c(jSONObject4), optInt15, optInt16);
                    case 1658262586:
                        if (!optString4.equals("enable_feature")) {
                            return null;
                        }
                        if (jSONObject.optInt("enable") > 0) {
                            z11 = true;
                        }
                        return new e(z11);
                    case 1875005051:
                        if (!optString4.equals("add_catalog") || (optJSONObject7 = jSONObject.optJSONObject("data")) == null) {
                            return null;
                        }
                        int optInt17 = optJSONObject7.optInt("versionLsCatalog");
                        int optInt18 = optJSONObject7.optInt("oldVersionLsCatalog");
                        C28667l c28667l4 = C28667l.f132972a;
                        JSONObject jSONObject5 = optJSONObject7.getJSONObject("item");
                        AbstractC19074t.m100207e(jSONObject5, "getJSONObject(...)");
                        return new a(c28667l4.m143475c(jSONObject5), optInt17, optInt18);
                    default:
                        return null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
    }

    /* renamed from: wx.i$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29266i {

        /* renamed from: a */
        private final boolean f135621a;

        public e(boolean z11) {
            super(null);
            this.f135621a = z11;
        }

        /* renamed from: a */
        public final boolean m146219a() {
            return this.f135621a;
        }
    }

    /* renamed from: wx.i$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29266i {

        /* renamed from: a */
        public static final f f135622a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: wx.i$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29266i {

        /* renamed from: a */
        private final Product f135623a;

        /* renamed from: b */
        private final int f135624b;

        /* renamed from: c */
        private final int f135625c;

        /* renamed from: d */
        private final int f135626d;

        /* renamed from: e */
        private final int f135627e;

        /* renamed from: f */
        private final String f135628f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Product product, int i11, int i12, int i13, int i14, String str) {
            super(null);
            AbstractC19074t.m100208f(product, "newProduct");
            this.f135623a = product;
            this.f135624b = i11;
            this.f135625c = i12;
            this.f135626d = i13;
            this.f135627e = i14;
            this.f135628f = str;
        }

        /* renamed from: a */
        public final int m146220a() {
            return this.f135625c;
        }

        /* renamed from: b */
        public final int m146221b() {
            return this.f135624b;
        }

        /* renamed from: c */
        public final Product m146222c() {
            return this.f135623a;
        }

        /* renamed from: d */
        public final int m146223d() {
            return this.f135627e;
        }

        /* renamed from: e */
        public final int m146224e() {
            return this.f135626d;
        }

        /* renamed from: f */
        public final String m146225f() {
            return this.f135628f;
        }
    }

    /* renamed from: wx.i$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29266i {

        /* renamed from: a */
        private final long f135629a;

        /* renamed from: b */
        private final List f135630b;

        /* renamed from: c */
        private final int f135631c;

        /* renamed from: d */
        private final int f135632d;

        /* renamed from: e */
        private final int f135633e;

        /* renamed from: f */
        private final int f135634f;

        /* renamed from: g */
        private final String f135635g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j11, List list, int i11, int i12, int i13, int i14, String str) {
            super(null);
            AbstractC19074t.m100208f(list, "deletedProductIds");
            this.f135629a = j11;
            this.f135630b = list;
            this.f135631c = i11;
            this.f135632d = i12;
            this.f135633e = i13;
            this.f135634f = i14;
            this.f135635g = str;
        }

        /* renamed from: a */
        public final long m146226a() {
            return this.f135629a;
        }

        /* renamed from: b */
        public final List m146227b() {
            return this.f135630b;
        }

        /* renamed from: c */
        public final int m146228c() {
            return this.f135632d;
        }

        /* renamed from: d */
        public final int m146229d() {
            return this.f135631c;
        }

        /* renamed from: e */
        public final int m146230e() {
            return this.f135634f;
        }

        /* renamed from: f */
        public final int m146231f() {
            return this.f135633e;
        }

        /* renamed from: g */
        public final String m146232g() {
            return this.f135635g;
        }
    }

    /* renamed from: wx.i$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC29266i {

        /* renamed from: a */
        private final Product f135636a;

        /* renamed from: b */
        private final int f135637b;

        /* renamed from: c */
        private final int f135638c;

        /* renamed from: d */
        private final int f135639d;

        /* renamed from: e */
        private final int f135640e;

        /* renamed from: f */
        private final String f135641f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Product product, int i11, int i12, int i13, int i14, String str) {
            super(null);
            AbstractC19074t.m100208f(product, "editedProduct");
            this.f135636a = product;
            this.f135637b = i11;
            this.f135638c = i12;
            this.f135639d = i13;
            this.f135640e = i14;
            this.f135641f = str;
        }

        /* renamed from: a */
        public final Product m146233a() {
            return this.f135636a;
        }

        /* renamed from: b */
        public final int m146234b() {
            return this.f135638c;
        }

        /* renamed from: c */
        public final int m146235c() {
            return this.f135637b;
        }

        /* renamed from: d */
        public final int m146236d() {
            return this.f135640e;
        }

        /* renamed from: e */
        public final int m146237e() {
            return this.f135639d;
        }

        /* renamed from: f */
        public final String m146238f() {
            return this.f135641f;
        }
    }

    /* renamed from: wx.i$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC29266i {

        /* renamed from: a */
        private final long f135642a;

        /* renamed from: b */
        private final long f135643b;

        /* renamed from: c */
        private final List f135644c;

        /* renamed from: d */
        private final int f135645d;

        /* renamed from: e */
        private final int f135646e;

        /* renamed from: f */
        private final int f135647f;

        /* renamed from: g */
        private final int f135648g;

        /* renamed from: h */
        private final int f135649h;

        /* renamed from: i */
        private final int f135650i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j11, long j12, List list, int i11, int i12, int i13, int i14, int i15, int i16) {
            super(null);
            AbstractC19074t.m100208f(list, "movedProductIds");
            this.f135642a = j11;
            this.f135643b = j12;
            this.f135644c = list;
            this.f135645d = i11;
            this.f135646e = i12;
            this.f135647f = i13;
            this.f135648g = i14;
            this.f135649h = i15;
            this.f135650i = i16;
        }

        /* renamed from: a */
        public final long m146239a() {
            return this.f135642a;
        }

        /* renamed from: b */
        public final int m146240b() {
            return this.f135646e;
        }

        /* renamed from: c */
        public final int m146241c() {
            return this.f135645d;
        }

        /* renamed from: d */
        public final List m146242d() {
            return this.f135644c;
        }

        /* renamed from: e */
        public final int m146243e() {
            return this.f135650i;
        }

        /* renamed from: f */
        public final int m146244f() {
            return this.f135649h;
        }

        /* renamed from: g */
        public final long m146245g() {
            return this.f135643b;
        }
    }

    private AbstractC29266i() {
    }

    public /* synthetic */ AbstractC29266i(AbstractC19060k abstractC19060k) {
        this();
    }
}
