package p210hh;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import s00.AbstractC26080o;

/* renamed from: hh.b */
/* loaded from: classes3.dex */
public final class C20059b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f98630a;

    /* renamed from: b */
    private int f98631b;

    /* renamed from: c */
    private boolean f98632c;

    /* renamed from: d */
    private int f98633d = 15;

    /* renamed from: e */
    private int f98634e = AbstractC26080o.a.f124275b;

    /* renamed from: f */
    private int f98635f = 86400;

    /* renamed from: g */
    private ArrayList f98636g = new ArrayList();

    /* renamed from: h */
    private ArrayList f98637h = new ArrayList();

    /* renamed from: i */
    private boolean f98638i;

    /* renamed from: hh.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20059b m104210a(JSONObject jSONObject) {
            boolean z11;
            JSONObject jSONObject2;
            String str;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            C20059b c20059b = new C20059b();
            boolean z12 = true;
            if (jSONObject.optInt("enable_chat_tag", 0) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int optInt = jSONObject.optInt("force_setting_option", 0);
            if (jSONObject.optInt("default_setting_show_tag", 0) <= 0) {
                z12 = false;
            }
            int i11 = 15;
            int optInt2 = jSONObject.optInt("max_tag", 15);
            if (optInt2 > 0) {
                i11 = optInt2;
            }
            int i12 = AbstractC26080o.a.f124275b;
            int optInt3 = jSONObject.optInt("max_conversation_ids", AbstractC26080o.a.f124275b);
            if (optInt3 > 0) {
                i12 = optInt3;
            }
            int i13 = 86400;
            int optInt4 = jSONObject.optInt("refresh_tag_interval", 86400);
            if (optInt4 > 0) {
                i13 = optInt4;
            }
            c20059b.m104204k(z11);
            c20059b.m104206m(optInt);
            c20059b.m104203j(z12);
            c20059b.m104208o(i11);
            c20059b.m104207n(i12);
            c20059b.m104209p(i13);
            JSONArray optJSONArray = jSONObject.optJSONArray("tag_colors");
            if (optJSONArray != null) {
                AbstractC19074t.m100205c(optJSONArray);
                int length = optJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    Object obj = optJSONArray.get(i14);
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c20059b.m104201h().add(str);
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("default_tag_info");
            if (optJSONArray2 != null) {
                AbstractC19074t.m100205c(optJSONArray2);
                int length2 = optJSONArray2.length();
                for (int i15 = 0; i15 < length2; i15++) {
                    Object obj2 = optJSONArray2.get(i15);
                    if (obj2 instanceof JSONObject) {
                        jSONObject2 = (JSONObject) obj2;
                    } else {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        jSONObject2.put("id", i15);
                        jSONObject2.put("createTime", System.currentTimeMillis());
                        c20059b.m104196c().add(C20060c.Companion.m104220a(jSONObject2));
                    }
                }
            }
            return c20059b;
        }
    }

    /* renamed from: a */
    public final void m104194a(C20059b c20059b) {
        AbstractC19074t.m100208f(c20059b, "chatTagConfig");
        this.f98630a = c20059b.f98630a;
        this.f98633d = c20059b.f98633d;
        this.f98631b = c20059b.f98631b;
        this.f98632c = c20059b.f98632c;
        this.f98634e = c20059b.f98634e;
        this.f98635f = c20059b.f98635f;
        ArrayList arrayList = this.f98636g;
        arrayList.clear();
        arrayList.addAll(c20059b.f98636g);
        ArrayList arrayList2 = this.f98637h;
        arrayList2.clear();
        arrayList2.addAll(c20059b.f98637h);
    }

    /* renamed from: b */
    public final boolean m104195b() {
        return this.f98632c;
    }

    /* renamed from: c */
    public final ArrayList m104196c() {
        return this.f98637h;
    }

    /* renamed from: d */
    public final boolean m104197d() {
        return this.f98630a;
    }

    /* renamed from: e */
    public final boolean m104198e() {
        return this.f98638i;
    }

    /* renamed from: f */
    public final int m104199f() {
        return this.f98631b;
    }

    /* renamed from: g */
    public final int m104200g() {
        return this.f98635f;
    }

    /* renamed from: h */
    public final ArrayList m104201h() {
        return this.f98636g;
    }

    /* renamed from: i */
    public final boolean m104202i() {
        int i11 = this.f98631b;
        return i11 == 1 || i11 == 2;
    }

    /* renamed from: j */
    public final void m104203j(boolean z11) {
        this.f98632c = z11;
    }

    /* renamed from: k */
    public final void m104204k(boolean z11) {
        this.f98630a = z11;
    }

    /* renamed from: l */
    public final void m104205l(boolean z11) {
        this.f98638i = z11;
    }

    /* renamed from: m */
    public final void m104206m(int i11) {
        this.f98631b = i11;
    }

    /* renamed from: n */
    public final void m104207n(int i11) {
        this.f98634e = i11;
    }

    /* renamed from: o */
    public final void m104208o(int i11) {
        this.f98633d = i11;
    }

    /* renamed from: p */
    public final void m104209p(int i11) {
        this.f98635f = i11;
    }
}
