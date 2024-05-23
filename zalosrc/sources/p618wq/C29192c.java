package p618wq;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: wq.c */
/* loaded from: classes4.dex */
public final class C29192c {

    /* renamed from: a */
    private final List f135256a;

    /* renamed from: b */
    private final List f135257b;

    /* renamed from: c */
    private final int f135258c;

    /* renamed from: d */
    private final int f135259d;

    public C29192c(List list, List list2, int i11, int i12) {
        AbstractC19074t.m100208f(list, "feedIds");
        AbstractC19074t.m100208f(list2, "ownerFlags");
        this.f135256a = list;
        this.f135257b = list2;
        this.f135258c = i11;
        this.f135259d = i12;
    }

    /* renamed from: a */
    public final List m145750a() {
        return this.f135256a;
    }

    /* renamed from: b */
    public final int m145751b() {
        return this.f135259d;
    }

    /* renamed from: c */
    public final List m145752c() {
        return this.f135257b;
    }

    /* renamed from: d */
    public final int m145753d() {
        return this.f135258c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29192c)) {
            return false;
        }
        C29192c c29192c = (C29192c) obj;
        return AbstractC19074t.m100204b(this.f135256a, c29192c.f135256a) && AbstractC19074t.m100204b(this.f135257b, c29192c.f135257b) && this.f135258c == c29192c.f135258c && this.f135259d == c29192c.f135259d;
    }

    public int hashCode() {
        return (((((this.f135256a.hashCode() * 31) + this.f135257b.hashCode()) * 31) + this.f135258c) * 31) + this.f135259d;
    }

    public String toString() {
        return "RealTimeLikeCommentRequest(feedIds=" + this.f135256a + ", ownerFlags=" + this.f135257b + ", page=" + this.f135258c + ", numRetry=" + this.f135259d + ")";
    }

    public /* synthetic */ C29192c(List list, List list2, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(list, list2, (i13 & 4) != 0 ? 1 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
