package p619wr;

import fn0.AbstractC19074t;

/* renamed from: wr.d */
/* loaded from: classes4.dex */
public final class C29197d implements InterfaceC29195b {

    /* renamed from: a */
    private final String f135266a;

    public C29197d(String str) {
        AbstractC19074t.m100208f(str, "headerText");
        this.f135266a = str;
    }

    /* renamed from: a */
    public final String m145762a() {
        return this.f135266a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29197d) && AbstractC19074t.m100204b(this.f135266a, ((C29197d) obj).f135266a);
    }

    public int hashCode() {
        return this.f135266a.hashCode();
    }

    public String toString() {
        return "FeedReactionHeaderData(headerText=" + this.f135266a + ")";
    }
}
