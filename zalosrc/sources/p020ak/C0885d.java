package p020ak;

import fn0.AbstractC19074t;

/* renamed from: ak.d */
/* loaded from: classes3.dex */
public final class C0885d {

    /* renamed from: a */
    private final String f3345a;

    public C0885d(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f3345a = str;
    }

    /* renamed from: a */
    public final String m2734a() {
        return this.f3345a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0885d) && AbstractC19074t.m100204b(this.f3345a, ((C0885d) obj).f3345a);
    }

    public int hashCode() {
        return this.f3345a.hashCode();
    }

    public String toString() {
        return "PhotoSuggestWrapperInfo(threadId=" + this.f3345a + ")";
    }
}
