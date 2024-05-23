package gw;

import fn0.AbstractC19074t;

/* renamed from: gw.u0 */
/* loaded from: classes4.dex */
public final class C19660u0 {

    /* renamed from: a */
    private final String f97537a;

    /* renamed from: b */
    private final String f97538b;

    public C19660u0(String str, String str2) {
        AbstractC19074t.m100208f(str, "senderName");
        AbstractC19074t.m100208f(str2, "replyMsg");
        this.f97537a = str;
        this.f97538b = str2;
    }

    /* renamed from: a */
    public final String m103091a() {
        return this.f97538b;
    }

    /* renamed from: b */
    public final String m103092b() {
        return this.f97537a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19660u0)) {
            return false;
        }
        C19660u0 c19660u0 = (C19660u0) obj;
        return AbstractC19074t.m100204b(this.f97537a, c19660u0.f97537a) && AbstractC19074t.m100204b(this.f97538b, c19660u0.f97538b);
    }

    public int hashCode() {
        return (this.f97537a.hashCode() * 31) + this.f97538b.hashCode();
    }

    public String toString() {
        return "ReplyChatContentComponent(senderName=" + this.f97537a + ", replyMsg=" + this.f97538b + ")";
    }
}
