package p056cj;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ph.C24752e;
import ph.C24753f;

/* renamed from: cj.n */
/* loaded from: classes3.dex */
public final class C3546n {

    /* renamed from: a */
    private final JSONObject f14962a;

    /* renamed from: b */
    private final String f14963b;

    /* renamed from: c */
    private final int f14964c;

    /* renamed from: d */
    private final boolean f14965d;

    /* renamed from: e */
    private final String f14966e;

    /* renamed from: f */
    private final String f14967f;

    /* renamed from: g */
    private final long f14968g;

    /* renamed from: h */
    private final long f14969h;

    /* renamed from: i */
    private final long f14970i;

    /* renamed from: j */
    private final String f14971j;

    /* renamed from: k */
    private final boolean f14972k;

    /* renamed from: l */
    private final boolean f14973l;

    /* renamed from: m */
    private final C24752e f14974m;

    /* renamed from: n */
    private final long f14975n;

    /* renamed from: o */
    private final boolean f14976o;

    public C3546n(JSONObject jSONObject, String str, int i11) {
        boolean z11;
        String str2;
        boolean z12;
        AbstractC19074t.m100208f(jSONObject, "data");
        AbstractC19074t.m100208f(str, "rawType");
        this.f14962a = jSONObject;
        this.f14963b = str;
        this.f14964c = i11;
        if (i11 != 1 && i11 != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f14965d = z11;
        String optString = jSONObject.optString("fromU", "");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f14966e = optString;
        String optString2 = jSONObject.optString("fromD", "");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f14967f = optString2;
        this.f14968g = jSONObject.optLong("cliMsgId", 0L);
        this.f14969h = jSONObject.optLong("id", 0L);
        this.f14970i = jSONObject.getLong("ts");
        if (i11 == 1) {
            str2 = "group_" + jSONObject.getString("to");
        } else if (AbstractC19074t.m100204b(optString, CoreUtility.f89233i)) {
            str2 = jSONObject.getString("to");
            AbstractC19074t.m100205c(str2);
        } else {
            str2 = optString;
        }
        this.f14971j = str2;
        int optInt = jSONObject.optInt("notify", 1);
        if (optInt != -1 && optInt != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f14972k = z12;
        this.f14973l = AbstractC19074t.m100204b(CoreUtility.f89233i, optString);
        this.f14974m = m18023k();
        this.f14975n = jSONObject.optLong("lastMsgId", 0L);
        this.f14976o = jSONObject.optInt("hasMore", 0) == 1;
    }

    /* renamed from: k */
    private final C24752e m18023k() {
        String optString;
        JSONObject optJSONObject = this.f14962a.optJSONObject("attach");
        if (optJSONObject != null && (optString = optJSONObject.optString("params")) != null) {
            AbstractC19074t.m100205c(optString);
            JSONObject jSONObject = new JSONObject(optString);
            int optInt = jSONObject.optInt("rType", 0);
            int optInt2 = jSONObject.optInt("source", 0);
            String optString2 = jSONObject.optString("rIcon", "");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("rMsg");
            if (optJSONArray != null) {
                AbstractC19074t.m100205c(optJSONArray);
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = optJSONArray.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj;
                    MessageId m41062g = MessageId.C7932a.m41062g(MessageId.Companion, jSONObject2.optString("cMsgID", ""), jSONObject2.optString("gMsgID", ""), this.f14971j, null, 8, null);
                    if (m41062g != null) {
                        arrayList.add(m41062g);
                    }
                }
            }
            AbstractC19074t.m100205c(optString2);
            return new C24752e(new C24753f(optInt, optString2, Integer.parseInt(this.f14966e), 1, this.f14970i), arrayList, optInt2);
        }
        return null;
    }

    /* renamed from: a */
    public final long m18024a() {
        return this.f14968g;
    }

    /* renamed from: b */
    public final long m18025b() {
        return this.f14969h;
    }

    /* renamed from: c */
    public final boolean m18026c() {
        return this.f14972k;
    }

    /* renamed from: d */
    public final String m18027d() {
        return this.f14971j;
    }

    /* renamed from: e */
    public final C24752e m18028e() {
        return this.f14974m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3546n)) {
            return false;
        }
        C3546n c3546n = (C3546n) obj;
        return AbstractC19074t.m100204b(this.f14962a, c3546n.f14962a) && AbstractC19074t.m100204b(this.f14963b, c3546n.f14963b) && this.f14964c == c3546n.f14964c;
    }

    /* renamed from: f */
    public final String m18029f() {
        return this.f14967f;
    }

    /* renamed from: g */
    public final String m18030g() {
        return this.f14966e;
    }

    /* renamed from: h */
    public final long m18031h() {
        return this.f14970i;
    }

    public int hashCode() {
        return (((this.f14962a.hashCode() * 31) + this.f14963b.hashCode()) * 31) + this.f14964c;
    }

    /* renamed from: i */
    public final boolean m18032i() {
        return this.f14965d;
    }

    /* renamed from: j */
    public final boolean m18033j() {
        return this.f14973l;
    }

    public String toString() {
        return "ReactionPacket(data=" + this.f14962a + ", rawType=" + this.f14963b + ", chatType=" + this.f14964c + ")";
    }
}
