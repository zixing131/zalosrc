package ci;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: ci.m */
/* loaded from: classes3.dex */
public final class C3514m {

    /* renamed from: a */
    private int f14740a;

    /* renamed from: b */
    private final List f14741b;

    public C3514m(int i11, List list) {
        AbstractC19074t.m100208f(list, "previewItems");
        this.f14740a = i11;
        this.f14741b = list;
    }

    /* renamed from: a */
    public final List m17755a() {
        return this.f14741b;
    }

    /* renamed from: b */
    public final int m17756b() {
        return this.f14740a;
    }

    /* renamed from: c */
    public final void m17757c(int i11) {
        this.f14740a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3514m)) {
            return false;
        }
        C3514m c3514m = (C3514m) obj;
        return this.f14740a == c3514m.f14740a && AbstractC19074t.m100204b(this.f14741b, c3514m.f14741b);
    }

    public int hashCode() {
        return (this.f14740a * 31) + this.f14741b.hashCode();
    }

    public String toString() {
        return "MSPreviewData(totalCount=" + this.f14740a + ", previewItems=" + this.f14741b + ")";
    }
}
