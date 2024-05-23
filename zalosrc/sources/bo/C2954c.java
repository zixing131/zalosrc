package bo;

import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: bo.c */
/* loaded from: classes4.dex */
public final class C2954c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f11656a;

    /* renamed from: b */
    private AbstractC2959d f11657b;

    /* renamed from: c */
    private ItemAlbumMobile.C7883c f11658c;

    /* renamed from: bo.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C2954c(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        try {
            this.f11656a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            JSONObject optJSONObject = jSONObject.optJSONObject("content");
            if (optJSONObject != null) {
                int i11 = this.f11656a;
                if (i11 == 0) {
                    this.f11657b = new C2964e(optJSONObject);
                } else if (i11 == 1) {
                    this.f11657b = new C2969f(optJSONObject);
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("layout");
            if (optJSONObject2 != null) {
                this.f11658c = new ItemAlbumMobile.C7883c(optJSONObject2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public final AbstractC2959d m13986a() {
        return this.f11657b;
    }

    /* renamed from: b */
    public final ItemAlbumMobile.C7883c m13987b() {
        return this.f11658c;
    }

    /* renamed from: c */
    public final int m13988c() {
        return this.f11656a;
    }

    /* renamed from: d */
    public final boolean m13989d() {
        ItemAlbumMobile.C7883c c7883c = this.f11658c;
        if (c7883c != null) {
            return c7883c.m40544e();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m13990e() {
        return this.f11656a == 0;
    }

    /* renamed from: f */
    public final boolean m13991f() {
        return this.f11656a == 1;
    }

    /* renamed from: g */
    public final void m13992g(AbstractC2959d abstractC2959d) {
        this.f11657b = abstractC2959d;
    }

    /* renamed from: h */
    public final void m13993h(ItemAlbumMobile.C7883c c7883c) {
        this.f11658c = c7883c;
    }

    /* renamed from: i */
    public final void m13994i(int i11) {
        this.f11656a = i11;
    }

    /* renamed from: j */
    public final JSONObject m13995j() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f11656a);
        AbstractC2959d abstractC2959d = this.f11657b;
        JSONObject jSONObject3 = null;
        if (abstractC2959d != null) {
            jSONObject = abstractC2959d.mo14018i();
        } else {
            jSONObject = null;
        }
        jSONObject2.put("content", jSONObject);
        ItemAlbumMobile.C7883c c7883c = this.f11658c;
        if (c7883c != null) {
            jSONObject3 = c7883c.m40545f();
        }
        jSONObject2.put("layout", jSONObject3);
        return jSONObject2;
    }

    public C2954c() {
        this(new JSONObject());
    }
}
