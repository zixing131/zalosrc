package p084cs;

import fn0.AbstractC19074t;

/* renamed from: cs.e */
/* loaded from: classes4.dex */
public final class C17571e {

    /* renamed from: a */
    private final C17568b f89504a;

    /* renamed from: b */
    private final String f89505b;

    public C17571e(C17568b c17568b, String str) {
        AbstractC19074t.m100208f(c17568b, "overflowRule");
        AbstractC19074t.m100208f(str, "fallbackText");
        this.f89504a = c17568b;
        this.f89505b = str;
    }

    /* renamed from: a */
    public final String m93568a() {
        return this.f89505b;
    }

    /* renamed from: b */
    public final C17568b m93569b() {
        return this.f89504a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17571e)) {
            return false;
        }
        C17571e c17571e = (C17571e) obj;
        return AbstractC19074t.m100204b(this.f89504a, c17571e.f89504a) && AbstractC19074t.m100204b(this.f89505b, c17571e.f89505b);
    }

    public int hashCode() {
        return (this.f89504a.hashCode() * 31) + this.f89505b.hashCode();
    }

    public String toString() {
        return "SingleFeedReactionOverflowRule(overflowRule=" + this.f89504a + ", fallbackText=" + this.f89505b + ")";
    }
}
