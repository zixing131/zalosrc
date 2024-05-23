package j50;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: j50.f */
/* loaded from: classes5.dex */
public final class C20926f {

    /* renamed from: a */
    private final List f102785a;

    /* renamed from: b */
    private final int f102786b;

    /* renamed from: c */
    private final boolean f102787c;

    public C20926f(List list, int i11, boolean z11) {
        AbstractC19074t.m100208f(list, "songs");
        this.f102785a = list;
        this.f102786b = i11;
        this.f102787c = z11;
    }

    /* renamed from: a */
    public final boolean m109451a() {
        return this.f102787c;
    }

    /* renamed from: b */
    public final int m109452b() {
        return this.f102786b;
    }

    /* renamed from: c */
    public final List m109453c() {
        return this.f102785a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20926f)) {
            return false;
        }
        C20926f c20926f = (C20926f) obj;
        return AbstractC19074t.m100204b(this.f102785a, c20926f.f102785a) && this.f102786b == c20926f.f102786b && this.f102787c == c20926f.f102787c;
    }

    public int hashCode() {
        return (((this.f102785a.hashCode() * 31) + this.f102786b) * 31) + AbstractC2144f.m11520a(this.f102787c);
    }

    public String toString() {
        return "ResultCategoryPage(songs=" + this.f102785a + ", page=" + this.f102786b + ", hasMore=" + this.f102787c + ")";
    }
}
