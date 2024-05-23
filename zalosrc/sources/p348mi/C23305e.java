package p348mi;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;

/* renamed from: mi.e */
/* loaded from: classes3.dex */
public final class C23305e {

    /* renamed from: a */
    private final String f113465a;

    /* renamed from: b */
    private final String f113466b;

    /* renamed from: c */
    private MessageId f113467c;

    /* renamed from: d */
    private MessageId f113468d;

    public C23305e(String str, String str2, MessageId messageId, MessageId messageId2) {
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(str2, "memberId");
        this.f113465a = str;
        this.f113466b = str2;
        this.f113467c = messageId;
        this.f113468d = messageId2;
    }

    /* renamed from: a */
    public final String m120556a() {
        return this.f113465a;
    }

    /* renamed from: b */
    public final MessageId m120557b() {
        return this.f113467c;
    }

    /* renamed from: c */
    public final MessageId m120558c() {
        return this.f113468d;
    }

    /* renamed from: d */
    public final String m120559d() {
        return this.f113466b;
    }

    /* renamed from: e */
    public final void m120560e(MessageId messageId) {
        this.f113467c = messageId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23305e)) {
            return false;
        }
        C23305e c23305e = (C23305e) obj;
        return AbstractC19074t.m100204b(this.f113465a, c23305e.f113465a) && AbstractC19074t.m100204b(this.f113466b, c23305e.f113466b) && AbstractC19074t.m100204b(this.f113467c, c23305e.f113467c) && AbstractC19074t.m100204b(this.f113468d, c23305e.f113468d);
    }

    /* renamed from: f */
    public final void m120561f(MessageId messageId) {
        this.f113468d = messageId;
    }

    public int hashCode() {
        int hashCode = ((this.f113465a.hashCode() * 31) + this.f113466b.hashCode()) * 31;
        MessageId messageId = this.f113467c;
        int hashCode2 = (hashCode + (messageId == null ? 0 : messageId.hashCode())) * 31;
        MessageId messageId2 = this.f113468d;
        return hashCode2 + (messageId2 != null ? messageId2.hashCode() : 0);
    }

    public String toString() {
        return "GroupMemberDeliveredSeenInfo(groupId=" + this.f113465a + ", memberId=" + this.f113466b + ", lastDeliveredMessageId=" + this.f113467c + ", lastSeenMessageId=" + this.f113468d + ")";
    }
}
