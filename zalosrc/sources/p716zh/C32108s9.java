package p716zh;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.AbstractC28207v1;
import vg.C28211v5;

/* renamed from: zh.s9 */
/* loaded from: classes3.dex */
public final class C32108s9 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final JSONObject f148014a;

    /* renamed from: b */
    private final int f148015b;

    /* renamed from: c */
    private final InterfaceC24854k f148016c;

    /* renamed from: d */
    private final InterfaceC24854k f148017d;

    /* renamed from: e */
    private final InterfaceC24854k f148018e;

    /* renamed from: f */
    private final InterfaceC24854k f148019f;

    /* renamed from: g */
    private final InterfaceC24854k f148020g;

    /* renamed from: h */
    private final InterfaceC24854k f148021h;

    /* renamed from: i */
    private final InterfaceC24854k f148022i;

    /* renamed from: j */
    private final InterfaceC24854k f148023j;

    /* renamed from: k */
    private String f148024k;

    /* renamed from: l */
    private final boolean f148025l;

    /* renamed from: zh.s9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zh.s9$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject mo12V4() {
            JSONArray optJSONArray = C32108s9.this.m154996l().optJSONArray("btn");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return null;
            }
            return optJSONArray.getJSONObject(0);
        }
    }

    /* renamed from: zh.s9$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str;
            JSONObject m154985f = C32108s9.this.m154985f();
            if (m154985f != null) {
                str = m154985f.optString("action", "");
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    /* renamed from: zh.s9$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str;
            JSONObject m154985f = C32108s9.this.m154985f();
            if (m154985f != null) {
                str = m154985f.optString("data", "");
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    /* renamed from: zh.s9$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28211v5 mo12V4() {
            JSONObject jSONObject;
            JSONObject m154985f = C32108s9.this.m154985f();
            if (m154985f != null) {
                jSONObject = m154985f.optJSONObject("title");
            } else {
                jSONObject = null;
            }
            return new C28211v5(jSONObject);
        }
    }

    /* renamed from: zh.s9$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28211v5 mo12V4() {
            return new C28211v5(C32108s9.this.m154996l().optJSONObject("err_msg"));
        }
    }

    /* renamed from: zh.s9$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28211v5 mo12V4() {
            return new C28211v5(C32108s9.this.m154996l().optJSONObject("err_title"));
        }
    }

    /* renamed from: zh.s9$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject mo12V4() {
            return C32108s9.this.m154996l().optJSONObject("reason_data");
        }
    }

    /* renamed from: zh.s9$i */
    /* loaded from: classes3.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {
        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            int i11;
            JSONObject m154986o = C32108s9.this.m154986o();
            if (m154986o != null) {
                i11 = m154986o.optInt("version");
            } else {
                i11 = 0;
            }
            return Integer.valueOf(i11);
        }
    }

    public C32108s9(JSONObject jSONObject) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f148014a = jSONObject;
        boolean z11 = false;
        int optInt = jSONObject.optInt("reason", 0);
        this.f148015b = optInt;
        m129210a = AbstractC24856m.m129210a(new h());
        this.f148016c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new i());
        this.f148017d = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new g());
        this.f148018e = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new f());
        this.f148019f = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new b());
        this.f148020g = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new e());
        this.f148021h = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new c());
        this.f148022i = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new d());
        this.f148023j = m129210a8;
        this.f148024k = "";
        if (optInt == 0 || (optInt == 1 ? 739 >= m154987p() : optInt == 2)) {
            z11 = true;
        }
        this.f148025l = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final JSONObject m154985f() {
        return (JSONObject) this.f148020g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final JSONObject m154986o() {
        return (JSONObject) this.f148016c.getValue();
    }

    /* renamed from: p */
    private final int m154987p() {
        return ((Number) this.f148017d.getValue()).intValue();
    }

    /* renamed from: c */
    public final boolean m154988c() {
        if (m154993i().length() > 0 && AbstractC28207v1.m141992i1(m154991g())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m154989d() {
        if (m154994j().length() > 0 || m154995k().length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m154990e() {
        return this.f148025l;
    }

    /* renamed from: g */
    public final String m154991g() {
        return (String) this.f148022i.getValue();
    }

    /* renamed from: h */
    public final String m154992h() {
        return (String) this.f148023j.getValue();
    }

    /* renamed from: i */
    public final C28211v5 m154993i() {
        return (C28211v5) this.f148021h.getValue();
    }

    /* renamed from: j */
    public final C28211v5 m154994j() {
        return (C28211v5) this.f148019f.getValue();
    }

    /* renamed from: k */
    public final C28211v5 m154995k() {
        return (C28211v5) this.f148018e.getValue();
    }

    /* renamed from: l */
    public final JSONObject m154996l() {
        return this.f148014a;
    }

    /* renamed from: m */
    public final String m154997m() {
        return this.f148024k;
    }

    /* renamed from: n */
    public final int m154998n() {
        return this.f148015b;
    }

    /* renamed from: q */
    public final void m154999q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f148024k = str;
    }
}
