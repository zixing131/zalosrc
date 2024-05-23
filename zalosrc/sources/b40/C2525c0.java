package b40;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: b40.c0 */
/* loaded from: classes5.dex */
public final class C2525c0 {

    /* renamed from: a */
    private final String f10268a;

    /* renamed from: b */
    private final String f10269b;

    public C2525c0(String str, String str2) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f10268a = str;
        this.f10269b = str2;
    }

    /* renamed from: a */
    public final String m12645a() {
        return this.f10269b;
    }

    /* renamed from: b */
    public final String m12646b() {
        return this.f10268a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2525c0)) {
            return false;
        }
        C2525c0 c2525c0 = (C2525c0) obj;
        return AbstractC19074t.m100204b(this.f10268a, c2525c0.f10268a) && AbstractC19074t.m100204b(this.f10269b, c2525c0.f10269b);
    }

    public int hashCode() {
        int hashCode = this.f10268a.hashCode() * 31;
        String str = this.f10269b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReceiverThread(threadId=" + this.f10268a + ", receiverId=" + this.f10269b + ")";
    }

    public /* synthetic */ C2525c0(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
