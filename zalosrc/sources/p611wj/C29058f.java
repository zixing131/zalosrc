package p611wj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p394oj.C24280f;
import p485rj.C25810b;

/* renamed from: wj.f */
/* loaded from: classes3.dex */
public final class C29058f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C25810b f134625a;

    /* renamed from: b */
    private C25810b f134626b;

    /* renamed from: c */
    private C25810b f134627c;

    /* renamed from: d */
    private C25810b f134628d;

    /* renamed from: e */
    private C25810b f134629e;

    /* renamed from: f */
    private String f134630f;

    /* renamed from: wj.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29058f(String str, C25810b c25810b, C25810b c25810b2, C25810b c25810b3, C24280f c24280f) {
        AbstractC19074t.m100208f(str, "id");
        this.f134630f = str;
        this.f134625a = c25810b;
        this.f134626b = c25810b2;
        this.f134627c = c25810b3;
        this.f134629e = c24280f != null ? new C25810b(c24280f.f117261a, c24280f.f117262b, c24280f.f117263c) : null;
        this.f134628d = c24280f != null ? new C25810b(c24280f.f117264d, c24280f.f117262b, c24280f.f117263c) : null;
    }

    /* renamed from: a */
    public final String m145129a() {
        return this.f134630f;
    }

    /* renamed from: b */
    public final C25810b m145130b() {
        return this.f134627c;
    }

    /* renamed from: c */
    public final C25810b m145131c() {
        return this.f134629e;
    }

    /* renamed from: d */
    public final C25810b m145132d() {
        return this.f134625a;
    }

    /* renamed from: e */
    public final String m145133e() {
        String str;
        String str2;
        C25810b c25810b = this.f134628d;
        String str3 = "";
        if (c25810b == null || (str = c25810b.f123105a) == null) {
            str = "";
        }
        C25810b c25810b2 = this.f134625a;
        if (c25810b2 != null && (str2 = c25810b2.f123105a) != null) {
            str3 = str2;
        }
        if (str.length() == 0) {
            return str3;
        }
        return str;
    }

    /* renamed from: f */
    public final C24280f m145134f() {
        String str;
        C25810b c25810b = this.f134629e;
        if (c25810b != null) {
            String str2 = c25810b.f123105a;
            int i11 = c25810b.f123106b;
            int i12 = c25810b.f123107c;
            C25810b c25810b2 = this.f134628d;
            if (c25810b2 == null || (str = c25810b2.f123105a) == null) {
                str = "";
            }
            return new C24280f(str2, i11, i12, str);
        }
        return null;
    }

    /* renamed from: g */
    public final JSONObject m145135g() {
        JSONObject jSONObject = new JSONObject();
        C25810b c25810b = this.f134626b;
        if (c25810b != null) {
            jSONObject.put("small", c25810b.m133087b());
        }
        C25810b c25810b2 = this.f134627c;
        if (c25810b2 != null) {
            jSONObject.put("normal", c25810b2.m133087b());
        }
        C25810b c25810b3 = this.f134625a;
        if (c25810b3 != null) {
            jSONObject.put("thumb", c25810b3.m133087b());
        }
        C25810b c25810b4 = this.f134628d;
        if (c25810b4 != null) {
            jSONObject.put("thumbWebp", c25810b4.m133087b());
        }
        C25810b c25810b5 = this.f134629e;
        if (c25810b5 != null) {
            jSONObject.put("normalWebp", c25810b5.m133087b());
        }
        jSONObject.put("id", this.f134630f);
        return jSONObject;
    }

    public C29058f(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f134630f = "";
        try {
            if (jSONObject.has("small")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("small");
                AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                this.f134626b = new C25810b(jSONObject2);
            }
            if (jSONObject.has("normal")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("normal");
                AbstractC19074t.m100207e(jSONObject3, "getJSONObject(...)");
                this.f134627c = new C25810b(jSONObject3);
            }
            if (jSONObject.has("thumb")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("thumb");
                AbstractC19074t.m100207e(jSONObject4, "getJSONObject(...)");
                this.f134625a = new C25810b(jSONObject4);
            }
            if (jSONObject.has("id")) {
                String string = jSONObject.getString("id");
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f134630f = string;
            }
            if (jSONObject.has("thumbWebp")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("thumbWebp");
                AbstractC19074t.m100207e(jSONObject5, "getJSONObject(...)");
                this.f134628d = new C25810b(jSONObject5);
            }
            if (jSONObject.has("normalWebp")) {
                JSONObject jSONObject6 = jSONObject.getJSONObject("normalWebp");
                AbstractC19074t.m100207e(jSONObject6, "getJSONObject(...)");
                this.f134629e = new C25810b(jSONObject6);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
