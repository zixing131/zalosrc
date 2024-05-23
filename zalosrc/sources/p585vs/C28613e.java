package p585vs;

import androidx.work.AbstractC2144f;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: vs.e */
/* loaded from: classes4.dex */
public final class C28613e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f132669a;

    /* renamed from: b */
    private String f132670b;

    /* renamed from: c */
    private String f132671c;

    /* renamed from: d */
    private JSONArray f132672d;

    /* renamed from: e */
    private boolean f132673e;

    /* renamed from: vs.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28613e m143091a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            C28613e c28613e = new C28613e(false, null, null, null, false, 31, null);
            JSONArray optJSONArray = jSONObject.optJSONArray("msg");
            if (optJSONArray != null) {
                AbstractC19074t.m100205c(optJSONArray);
                c28613e.m143089j(optJSONArray);
            }
            String optString = jSONObject.optString("lastClientMsgId", "0");
            AbstractC19074t.m100207e(optString, "optString(...)");
            c28613e.m143086g(optString);
            String optString2 = jSONObject.optString("lastMsgId", "0");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            c28613e.m143087h(optString2);
            boolean z11 = false;
            c28613e.m143088i(jSONObject.optBoolean("hasMore", false));
            if (jSONObject.optInt("isOld", 0) != 0) {
                z11 = true;
            }
            c28613e.m143090k(z11);
            return c28613e;
        }
    }

    public C28613e(boolean z11, String str, String str2, JSONArray jSONArray, boolean z12) {
        AbstractC19074t.m100208f(str, "clientMsgIdForNextRequest");
        AbstractC19074t.m100208f(str2, "globalMsgIdForNextRequest");
        AbstractC19074t.m100208f(jSONArray, "jsonArrayMsg");
        this.f132669a = z11;
        this.f132670b = str;
        this.f132671c = str2;
        this.f132672d = jSONArray;
        this.f132673e = z12;
    }

    /* renamed from: a */
    public final String m143080a() {
        return this.f132670b;
    }

    /* renamed from: b */
    public final String m143081b() {
        return this.f132671c;
    }

    /* renamed from: c */
    public final boolean m143082c() {
        return this.f132669a;
    }

    /* renamed from: d */
    public final JSONArray m143083d() {
        return this.f132672d;
    }

    /* renamed from: e */
    public final MessageId m143084e(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        MessageId.C7932a c7932a = MessageId.Companion;
        MessageId m41066e = c7932a.m41066e(this.f132670b, this.f132671c, str, "");
        if (m41066e == null) {
            return c7932a.m41067h();
        }
        return m41066e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28613e)) {
            return false;
        }
        C28613e c28613e = (C28613e) obj;
        return this.f132669a == c28613e.f132669a && AbstractC19074t.m100204b(this.f132670b, c28613e.f132670b) && AbstractC19074t.m100204b(this.f132671c, c28613e.f132671c) && AbstractC19074t.m100204b(this.f132672d, c28613e.f132672d) && this.f132673e == c28613e.f132673e;
    }

    /* renamed from: f */
    public final boolean m143085f() {
        return this.f132673e;
    }

    /* renamed from: g */
    public final void m143086g(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f132670b = str;
    }

    /* renamed from: h */
    public final void m143087h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f132671c = str;
    }

    public int hashCode() {
        return (((((((AbstractC2144f.m11520a(this.f132669a) * 31) + this.f132670b.hashCode()) * 31) + this.f132671c.hashCode()) * 31) + this.f132672d.hashCode()) * 31) + AbstractC2144f.m11520a(this.f132673e);
    }

    /* renamed from: i */
    public final void m143088i(boolean z11) {
        this.f132669a = z11;
    }

    /* renamed from: j */
    public final void m143089j(JSONArray jSONArray) {
        AbstractC19074t.m100208f(jSONArray, "<set-?>");
        this.f132672d = jSONArray;
    }

    /* renamed from: k */
    public final void m143090k(boolean z11) {
        this.f132673e = z11;
    }

    public String toString() {
        return "ResponseCloudMsgCommonInfo(hasMore=" + this.f132669a + ", clientMsgIdForNextRequest=" + this.f132670b + ", globalMsgIdForNextRequest=" + this.f132671c + ", jsonArrayMsg=" + this.f132672d + ", isOld=" + this.f132673e + ")";
    }

    public /* synthetic */ C28613e(boolean z11, String str, String str2, JSONArray jSONArray, boolean z12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? "0" : str, (i11 & 4) == 0 ? str2 : "0", (i11 & 8) != 0 ? new JSONArray() : jSONArray, (i11 & 16) != 0 ? false : z12);
    }
}
