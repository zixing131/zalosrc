package p716zh;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p056cj.C3533a;

/* renamed from: zh.a4 */
/* loaded from: classes3.dex */
public final class C31837a4 {

    /* renamed from: a */
    private final JSONObject f146113a;

    /* renamed from: b */
    private final String f146114b;

    /* renamed from: c */
    private final C3533a f146115c;

    /* renamed from: d */
    private final MessageId f146116d;

    public C31837a4(JSONObject jSONObject, String str, C3533a c3533a, MessageId messageId) {
        AbstractC19074t.m100208f(jSONObject, "data");
        AbstractC19074t.m100208f(str, "rawType");
        AbstractC19074t.m100208f(c3533a, "ackInfo");
        AbstractC19074t.m100208f(messageId, "msgId");
        this.f146113a = jSONObject;
        this.f146114b = str;
        this.f146115c = c3533a;
        this.f146116d = messageId;
    }

    /* renamed from: a */
    public final C3533a m152961a() {
        return this.f146115c;
    }

    /* renamed from: b */
    public final JSONObject m152962b() {
        return this.f146113a;
    }

    /* renamed from: c */
    public final MessageId m152963c() {
        return this.f146116d;
    }

    /* renamed from: d */
    public final String m152964d() {
        return this.f146114b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31837a4)) {
            return false;
        }
        C31837a4 c31837a4 = (C31837a4) obj;
        return AbstractC19074t.m100204b(this.f146113a, c31837a4.f146113a) && AbstractC19074t.m100204b(this.f146114b, c31837a4.f146114b) && AbstractC19074t.m100204b(this.f146115c, c31837a4.f146115c) && AbstractC19074t.m100204b(this.f146116d, c31837a4.f146116d);
    }

    public int hashCode() {
        return (((((this.f146113a.hashCode() * 31) + this.f146114b.hashCode()) * 31) + this.f146115c.hashCode()) * 31) + this.f146116d.hashCode();
    }

    public String toString() {
        return "E2EEDecryptLaterMsgData(data=" + this.f146113a + ", rawType=" + this.f146114b + ", ackInfo=" + this.f146115c + ", msgId=" + this.f146116d + ")";
    }
}
