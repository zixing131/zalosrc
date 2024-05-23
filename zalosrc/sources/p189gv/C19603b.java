package p189gv;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: gv.b */
/* loaded from: classes4.dex */
public final class C19603b implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private C19606e f97373p;

    /* renamed from: q */
    private boolean f97374q;

    /* renamed from: r */
    private boolean f97375r;

    /* renamed from: gv.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m102586a(String str) {
            if (str != null && !AbstractC19074t.m100204b(str, "")) {
                return true;
            }
            return false;
        }
    }

    public C19603b() {
    }

    public C19603b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        if (jSONObject.has("popup")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("popup");
            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
            this.f97373p = new C19606e(jSONObject2);
        }
    }

    /* renamed from: a */
    public final C19606e m102580a() {
        return this.f97373p;
    }

    /* renamed from: b */
    public final boolean m102581b() {
        return this.f97374q;
    }

    /* renamed from: c */
    public final boolean m102582c() {
        return this.f97375r;
    }

    /* renamed from: d */
    public final void m102583d(C19606e c19606e) {
        this.f97373p = c19606e;
    }

    /* renamed from: e */
    public final void m102584e(boolean z11) {
        this.f97374q = z11;
    }

    /* renamed from: f */
    public final void m102585f(boolean z11) {
        this.f97375r = z11;
    }
}
