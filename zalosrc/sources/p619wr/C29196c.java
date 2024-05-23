package p619wr;

import fn0.AbstractC19074t;

/* renamed from: wr.c */
/* loaded from: classes4.dex */
public final class C29196c implements InterfaceC29195b {

    /* renamed from: a */
    private final String f135265a;

    public C29196c(String str) {
        AbstractC19074t.m100208f(str, "errorText");
        this.f135265a = str;
    }

    /* renamed from: a */
    public final String m145761a() {
        return this.f135265a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29196c) && AbstractC19074t.m100204b(this.f135265a, ((C29196c) obj).f135265a);
    }

    public int hashCode() {
        return this.f135265a.hashCode();
    }

    public String toString() {
        return "FeedReactionErrorData(errorText=" + this.f135265a + ")";
    }
}
