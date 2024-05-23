package p726zr;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: zr.c */
/* loaded from: classes4.dex */
public final class C32547c {

    /* renamed from: a */
    private final boolean f150400a;

    /* renamed from: b */
    private final int f150401b;

    /* renamed from: c */
    private final C32546b f150402c;

    public C32547c(boolean z11, int i11, C32546b c32546b) {
        AbstractC19074t.m100208f(c32546b, "detailContent");
        this.f150400a = z11;
        this.f150401b = i11;
        this.f150402c = c32546b;
    }

    /* renamed from: a */
    public final C32546b m157610a() {
        return this.f150402c;
    }

    /* renamed from: b */
    public final int m157611b() {
        return this.f150401b;
    }

    /* renamed from: c */
    public final boolean m157612c() {
        return this.f150400a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32547c)) {
            return false;
        }
        C32547c c32547c = (C32547c) obj;
        return this.f150400a == c32547c.f150400a && this.f150401b == c32547c.f150401b && AbstractC19074t.m100204b(this.f150402c, c32547c.f150402c);
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f150400a) * 31) + this.f150401b) * 31) + this.f150402c.hashCode();
    }

    public String toString() {
        return "FeedReactionInfo(isLike=" + this.f150400a + ", totalLike=" + this.f150401b + ", detailContent=" + this.f150402c + ")";
    }
}
