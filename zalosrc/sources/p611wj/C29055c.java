package p611wj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p485rj.C25810b;

/* renamed from: wj.c */
/* loaded from: classes3.dex */
public final class C29055c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C25810b f134604a;

    /* renamed from: b */
    private C25810b f134605b;

    /* renamed from: c */
    private C25810b f134606c;

    /* renamed from: d */
    private C25810b f134607d;

    /* renamed from: e */
    private String f134608e;

    /* renamed from: wj.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29055c(C25810b c25810b, C25810b c25810b2, C25810b c25810b3) {
        this.f134608e = "";
        this.f134604a = c25810b;
        this.f134606c = c25810b2;
        this.f134605b = c25810b3;
    }

    /* renamed from: a */
    public final String m145107a() {
        return this.f134608e;
    }

    /* renamed from: b */
    public final C25810b m145108b() {
        return this.f134607d;
    }

    /* renamed from: c */
    public final C25810b m145109c() {
        return this.f134606c;
    }

    /* renamed from: d */
    public final C25810b m145110d() {
        return this.f134605b;
    }

    /* renamed from: e */
    public final C25810b m145111e() {
        return this.f134604a;
    }

    /* renamed from: f */
    public final JSONObject m145112f() {
        JSONObject jSONObject = new JSONObject();
        C25810b c25810b = this.f134604a;
        if (c25810b != null) {
            jSONObject.put("thumbGif", c25810b.m133087b());
        }
        C25810b c25810b2 = this.f134605b;
        if (c25810b2 != null) {
            jSONObject.put("smallGif", c25810b2.m133087b());
        }
        C25810b c25810b3 = this.f134606c;
        if (c25810b3 != null) {
            jSONObject.put("mediumGif", c25810b3.m133087b());
        }
        C25810b c25810b4 = this.f134607d;
        if (c25810b4 != null) {
            jSONObject.put("largeGif", c25810b4.m133087b());
        }
        jSONObject.put("id", this.f134608e);
        return jSONObject;
    }

    public C29055c(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f134608e = "";
        try {
            if (jSONObject.has("thumbGif")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("thumbGif");
                AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                this.f134604a = new C25810b(jSONObject2);
            }
            if (jSONObject.has("smallGif")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("smallGif");
                AbstractC19074t.m100207e(jSONObject3, "getJSONObject(...)");
                this.f134605b = new C25810b(jSONObject3);
            }
            if (jSONObject.has("mediumGif")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("mediumGif");
                AbstractC19074t.m100207e(jSONObject4, "getJSONObject(...)");
                this.f134606c = new C25810b(jSONObject4);
            }
            if (jSONObject.has("largeGif")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("largeGif");
                AbstractC19074t.m100207e(jSONObject5, "getJSONObject(...)");
                this.f134607d = new C25810b(jSONObject5);
            }
            if (jSONObject.has("id")) {
                String string = jSONObject.getString("id");
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f134608e = string;
            }
            if (jSONObject.has("gifId")) {
                String string2 = jSONObject.getString("gifId");
                AbstractC19074t.m100207e(string2, "getString(...)");
                this.f134608e = string2;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
