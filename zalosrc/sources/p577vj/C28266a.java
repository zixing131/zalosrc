package p577vj;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vj.a */
/* loaded from: classes3.dex */
public final class C28266a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f131813a;

    /* renamed from: b */
    private final String f131814b;

    /* renamed from: c */
    private final MessageId f131815c;

    /* renamed from: d */
    private final long f131816d;

    /* renamed from: e */
    private final long f131817e;

    /* renamed from: f */
    private final String f131818f;

    /* renamed from: g */
    private final int f131819g;

    /* renamed from: vj.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28266a m142390a(String str, String str2) {
            AbstractC19074t.m100208f(str2, "ownerId");
            if (str != null && str.length() != 0 && !AbstractC19074t.m100204b(str, "{}")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("reactionInfo");
                    AbstractC19074t.m100205c(optString);
                    if (optString.length() > 0) {
                        jSONObject = new JSONObject(optString);
                    }
                    JSONObject jSONObject2 = jSONObject;
                    MessageId m41062g = MessageId.C7932a.m41062g(MessageId.Companion, jSONObject2.optString("clientMsgId"), jSONObject2.optString("globalMsgId"), str2, null, 8, null);
                    if (m41062g == null) {
                        return null;
                    }
                    String optString2 = jSONObject2.optString("senderUid");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    String optString3 = jSONObject2.optString("senderName");
                    AbstractC19074t.m100207e(optString3, "optString(...)");
                    long optLong = jSONObject2.optLong("timestamp");
                    long optLong2 = jSONObject2.optLong("reactionMsgId");
                    String optString4 = jSONObject2.optString("reaction");
                    AbstractC19074t.m100207e(optString4, "optString(...)");
                    return new C28266a(optString2, optString3, m41062g, optLong, optLong2, optString4, jSONObject2.optInt("reactionType"));
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public C28266a(String str, String str2, MessageId messageId, long j11, long j12, String str3, int i11) {
        AbstractC19074t.m100208f(str, "senderUid");
        AbstractC19074t.m100208f(str2, "senderName");
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str3, "reaction");
        this.f131813a = str;
        this.f131814b = str2;
        this.f131815c = messageId;
        this.f131816d = j11;
        this.f131817e = j12;
        this.f131818f = str3;
        this.f131819g = i11;
        m142381i();
    }

    /* renamed from: i */
    private final void m142381i() {
        if (this.f131813a.length() != 0 && this.f131815c.m41059z()) {
            return;
        }
        throw new IllegalArgumentException("Data is invalid: " + this);
    }

    /* renamed from: a */
    public final long m142382a() {
        return this.f131816d;
    }

    /* renamed from: b */
    public final MessageId m142383b() {
        return this.f131815c;
    }

    /* renamed from: c */
    public final String m142384c() {
        return this.f131818f;
    }

    /* renamed from: d */
    public final long m142385d() {
        return this.f131817e;
    }

    /* renamed from: e */
    public final int m142386e() {
        return this.f131819g;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC19074t.m100204b(C28266a.class, cls)) {
            return false;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.data.entity.chat.reaction.LastUnreadReactionInfo");
        C28266a c28266a = (C28266a) obj;
        if (AbstractC19074t.m100204b(this.f131813a, c28266a.f131813a) && AbstractC19074t.m100204b(this.f131814b, c28266a.f131814b) && AbstractC19074t.m100204b(this.f131815c, c28266a.f131815c) && this.f131816d == c28266a.f131816d && this.f131817e == c28266a.f131817e && AbstractC19074t.m100204b(this.f131818f, c28266a.f131818f) && this.f131819g == c28266a.f131819g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m142387f() {
        return this.f131814b;
    }

    /* renamed from: g */
    public final String m142388g() {
        return this.f131813a;
    }

    /* renamed from: h */
    public final String m142389h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("senderUid", this.f131813a);
            jSONObject.put("senderName", this.f131814b);
            jSONObject.put("clientMsgId", this.f131815c.m41044h());
            jSONObject.put("globalMsgId", this.f131815c.m41046j());
            jSONObject.put("timestamp", this.f131816d);
            jSONObject.put("reactionMsgId", this.f131817e);
            jSONObject.put("reaction", this.f131818f);
            jSONObject.put("reactionType", this.f131819g);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100205c(jSONObject2);
            return jSONObject2;
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    public int hashCode() {
        return (((((((((((this.f131813a.hashCode() * 31) + this.f131814b.hashCode()) * 31) + this.f131815c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f131816d)) * 31) + AbstractC2147g0.m11521a(this.f131817e)) * 31) + this.f131818f.hashCode()) * 31) + this.f131819g;
    }

    public String toString() {
        return "ReactionInfo(senderUid='" + this.f131813a + "', senderName='" + this.f131814b + "', messageId=" + this.f131815c + ", indexTimestamp=" + this.f131816d + ", reactionMsgId=" + this.f131817e + ", reaction='" + this.f131818f + "', reactionType=" + this.f131819g + ")";
    }
}
