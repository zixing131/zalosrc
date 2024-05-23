package lk0;

import fn0.AbstractC19074t;

/* renamed from: lk0.a */
/* loaded from: classes7.dex */
public final class C22503a {

    /* renamed from: a */
    private String f110122a;

    /* renamed from: b */
    private int f110123b;

    /* renamed from: c */
    private int f110124c;

    /* renamed from: d */
    private final boolean f110125d;

    public C22503a(String str, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(str, "src");
        this.f110122a = str;
        this.f110123b = i11;
        this.f110124c = i12;
        this.f110125d = z11;
    }

    /* renamed from: a */
    public final String m116348a() {
        return this.f110122a;
    }

    /* renamed from: b */
    public final void m116349b(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f110122a = str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C22503a)) {
            C22503a c22503a = (C22503a) obj;
            if (AbstractC19074t.m100204b(c22503a.f110122a, this.f110122a) && c22503a.f110125d == this.f110125d && c22503a.f110123b == this.f110123b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f110122a.hashCode() * 31) + this.f110123b) * 31) + this.f110124c) * 31;
        boolean z11 = this.f110125d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        return "MediaMetadata(src=" + this.f110122a + ", currentTimeMills=" + this.f110123b + ", duration=" + this.f110124c + ", stream=" + this.f110125d + ')';
    }
}
