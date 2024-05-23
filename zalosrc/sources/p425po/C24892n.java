package p425po;

import bi0.AbstractC2807a;
import fn0.AbstractC19060k;
import me0.C23212s8;

/* renamed from: po.n */
/* loaded from: classes4.dex */
public final class C24892n extends AbstractC24887i {

    /* renamed from: b */
    private final int f119428b;

    /* renamed from: c */
    private final int f119429c;

    public C24892n(int i11, int i12) {
        super(4);
        this.f119428b = i11;
        this.f119429c = i12;
    }

    /* renamed from: b */
    public final int m129412b() {
        return this.f119429c;
    }

    /* renamed from: c */
    public final int m129413c() {
        return this.f119428b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24892n)) {
            return false;
        }
        C24892n c24892n = (C24892n) obj;
        return this.f119428b == c24892n.f119428b && this.f119429c == c24892n.f119429c;
    }

    public int hashCode() {
        return (this.f119428b * 31) + this.f119429c;
    }

    public String toString() {
        return "MoveTabSpaceDividerRow(height=" + this.f119428b + ", color=" + this.f119429c + ")";
    }

    public /* synthetic */ C24892n(int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(i11, (i13 & 2) != 0 ? C23212s8.m119606n(AbstractC2807a.page_background_01) : i12);
    }
}
