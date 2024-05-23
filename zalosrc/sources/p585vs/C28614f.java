package p585vs;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: vs.f */
/* loaded from: classes4.dex */
public final class C28614f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f132674a;

    /* renamed from: b */
    private JSONArray f132675b;

    /* renamed from: c */
    private JSONArray f132676c;

    /* renamed from: d */
    private JSONArray f132677d;

    /* renamed from: vs.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28614f m143099a(JSONObject jSONObject, boolean z11) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            C28614f c28614f = new C28614f(z11, null, null, null, 14, null);
            if (z11) {
                JSONArray optJSONArray = jSONObject.optJSONArray("msg");
                if (optJSONArray != null) {
                    AbstractC19074t.m100205c(optJSONArray);
                    c28614f.m143097f(optJSONArray);
                }
            } else {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("lastMsgs");
                if (optJSONArray2 != null) {
                    AbstractC19074t.m100205c(optJSONArray2);
                    c28614f.m143097f(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("lastSeenMsgs");
                if (optJSONArray3 != null) {
                    AbstractC19074t.m100205c(optJSONArray3);
                    c28614f.m143098g(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("infoJoinGroup");
                if (optJSONArray4 != null) {
                    AbstractC19074t.m100205c(optJSONArray4);
                    c28614f.m143096e(optJSONArray4);
                }
            }
            return c28614f;
        }
    }

    public C28614f(boolean z11, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        AbstractC19074t.m100208f(jSONArray, "jsonArrayMsgLast");
        AbstractC19074t.m100208f(jSONArray2, "jsonArrayMsgLastSeen");
        AbstractC19074t.m100208f(jSONArray3, "jsonArrayJoinGroupInfo");
        this.f132674a = z11;
        this.f132675b = jSONArray;
        this.f132676c = jSONArray2;
        this.f132677d = jSONArray3;
    }

    /* renamed from: a */
    public final JSONArray m143092a() {
        return this.f132677d;
    }

    /* renamed from: b */
    public final JSONArray m143093b() {
        return this.f132675b;
    }

    /* renamed from: c */
    public final JSONArray m143094c() {
        return this.f132676c;
    }

    /* renamed from: d */
    public final boolean m143095d() {
        return this.f132674a;
    }

    /* renamed from: e */
    public final void m143096e(JSONArray jSONArray) {
        AbstractC19074t.m100208f(jSONArray, "<set-?>");
        this.f132677d = jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28614f)) {
            return false;
        }
        C28614f c28614f = (C28614f) obj;
        return this.f132674a == c28614f.f132674a && AbstractC19074t.m100204b(this.f132675b, c28614f.f132675b) && AbstractC19074t.m100204b(this.f132676c, c28614f.f132676c) && AbstractC19074t.m100204b(this.f132677d, c28614f.f132677d);
    }

    /* renamed from: f */
    public final void m143097f(JSONArray jSONArray) {
        AbstractC19074t.m100208f(jSONArray, "<set-?>");
        this.f132675b = jSONArray;
    }

    /* renamed from: g */
    public final void m143098g(JSONArray jSONArray) {
        AbstractC19074t.m100208f(jSONArray, "<set-?>");
        this.f132676c = jSONArray;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f132674a) * 31) + this.f132675b.hashCode()) * 31) + this.f132676c.hashCode()) * 31) + this.f132677d.hashCode();
    }

    public String toString() {
        return "ResponsePullPreviewInfo(isFromSocket=" + this.f132674a + ", jsonArrayMsgLast=" + this.f132675b + ", jsonArrayMsgLastSeen=" + this.f132676c + ", jsonArrayJoinGroupInfo=" + this.f132677d + ")";
    }

    public /* synthetic */ C28614f(boolean z11, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? new JSONArray() : jSONArray, (i11 & 4) != 0 ? new JSONArray() : jSONArray2, (i11 & 8) != 0 ? new JSONArray() : jSONArray3);
    }
}
