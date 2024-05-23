package p399op;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: op.u */
/* loaded from: classes4.dex */
public final class C24409u {

    /* renamed from: a */
    private final List f117881a;

    /* renamed from: b */
    private final int f117882b;

    /* renamed from: c */
    private final boolean f117883c;

    public C24409u(List list, int i11, boolean z11) {
        AbstractC19074t.m100208f(list, "songs");
        this.f117881a = list;
        this.f117882b = i11;
        this.f117883c = z11;
    }

    /* renamed from: a */
    public final boolean m127664a() {
        return this.f117883c;
    }

    /* renamed from: b */
    public final int m127665b() {
        return this.f117882b;
    }

    /* renamed from: c */
    public final List m127666c() {
        return this.f117881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24409u)) {
            return false;
        }
        C24409u c24409u = (C24409u) obj;
        return AbstractC19074t.m100204b(this.f117881a, c24409u.f117881a) && this.f117882b == c24409u.f117882b && this.f117883c == c24409u.f117883c;
    }

    public int hashCode() {
        return (((this.f117881a.hashCode() * 31) + this.f117882b) * 31) + AbstractC2144f.m11520a(this.f117883c);
    }

    public String toString() {
        return "ResultCategoryPage(songs=" + this.f117881a + ", page=" + this.f117882b + ", hasMore=" + this.f117883c + ")";
    }
}
