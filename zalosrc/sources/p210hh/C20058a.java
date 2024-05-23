package p210hh;

import am.AbstractC0924m0;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p162fh.C18932a;

/* renamed from: hh.a */
/* loaded from: classes3.dex */
public final class C20058a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f98627a;

    /* renamed from: b */
    private boolean f98628b;

    /* renamed from: c */
    private boolean f98629c;

    /* renamed from: hh.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20058a m104191a(C20058a c20058a) {
            AbstractC19074t.m100208f(c20058a, "chatFilterSetting");
            C20058a c20058a2 = new C20058a(false, false, false, 7, null);
            c20058a2.m104185e(c20058a.m104181a());
            c20058a2.m104186f(c20058a.m104182b());
            c20058a2.m104187g(c20058a.m104183c());
            return c20058a2;
        }

        /* renamed from: b */
        public final C20058a m104192b(String str) {
            AbstractC19074t.m100208f(str, "jsonString");
            C20058a c20058a = new C20058a(false, false, false, 7, null);
            if (str.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    c20058a.m104185e(jSONObject.optBoolean("enable_chat_label", false));
                    c20058a.m104186f(jSONObject.optBoolean("enable_chat_tag", false));
                    c20058a.m104187g(jSONObject.optBoolean("enable_show_tag", false));
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            return c20058a;
        }

        /* renamed from: c */
        public final JSONObject m104193c(C20058a c20058a) {
            AbstractC19074t.m100208f(c20058a, "chatFilterSetting");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enable_chat_label", c20058a.m104181a());
            jSONObject.put("enable_chat_tag", c20058a.m104182b());
            jSONObject.put("enable_show_tag", c20058a.m104183c());
            return jSONObject;
        }
    }

    public C20058a(boolean z11, boolean z12, boolean z13) {
        this.f98627a = z11;
        this.f98628b = z12;
        this.f98629c = z13;
    }

    /* renamed from: a */
    public final boolean m104181a() {
        return this.f98627a;
    }

    /* renamed from: b */
    public final boolean m104182b() {
        return this.f98628b;
    }

    /* renamed from: c */
    public final boolean m104183c() {
        return this.f98629c;
    }

    /* renamed from: d */
    public final boolean m104184d(C20058a c20058a) {
        AbstractC19074t.m100208f(c20058a, "chatFilterSetting");
        if (this.f98627a == c20058a.f98627a && this.f98628b == c20058a.f98628b && this.f98629c == c20058a.f98629c) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m104185e(boolean z11) {
        this.f98627a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20058a)) {
            return false;
        }
        C20058a c20058a = (C20058a) obj;
        return this.f98627a == c20058a.f98627a && this.f98628b == c20058a.f98628b && this.f98629c == c20058a.f98629c;
    }

    /* renamed from: f */
    public final void m104186f(boolean z11) {
        this.f98628b = z11;
    }

    /* renamed from: g */
    public final void m104187g(boolean z11) {
        this.f98629c = z11;
    }

    /* renamed from: h */
    public final void m104188h(boolean z11) {
        AbstractC0924m0.m3147In(z11);
        this.f98627a = z11;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f98627a) * 31) + AbstractC2144f.m11520a(this.f98628b)) * 31) + AbstractC2144f.m11520a(this.f98629c);
    }

    /* renamed from: i */
    public final void m104189i(int i11) {
        AbstractC0924m0.m3176Jn(i11);
        boolean z11 = true;
        if (i11 != 1 && (i11 == 0 || !C18932a.f94442a.m99180d().m104202i())) {
            z11 = false;
        }
        this.f98628b = z11;
    }

    /* renamed from: j */
    public final void m104190j(int i11) {
        AbstractC0924m0.m3321On(i11);
        boolean z11 = true;
        if (i11 != 1 && (i11 == 0 || !C18932a.f94442a.m99180d().m104195b())) {
            z11 = false;
        }
        this.f98629c = z11;
    }

    public String toString() {
        return "ChatFilterSetting(enableChatLabel=" + this.f98627a + ", enableChatTag=" + this.f98628b + ", enableShowTagOnTabMsg=" + this.f98629c + ")";
    }

    public /* synthetic */ C20058a(boolean z11, boolean z12, boolean z13, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13);
    }
}
