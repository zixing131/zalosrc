package n50;

import fn0.AbstractC19074t;
import k50.C21474b;

/* renamed from: n50.c */
/* loaded from: classes5.dex */
public final class C23569c extends AbstractC23574h {

    /* renamed from: b */
    private final C21474b f114366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23569c(C21474b c21474b) {
        super(3);
        AbstractC19074t.m100208f(c21474b, "categoryData");
        this.f114366b = c21474b;
    }

    /* renamed from: b */
    public final C21474b m123633b() {
        return this.f114366b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23569c) && AbstractC19074t.m100204b(this.f114366b, ((C23569c) obj).f114366b);
    }

    public int hashCode() {
        return this.f114366b.hashCode();
    }

    public String toString() {
        return "RingtoneCategoryRow(categoryData=" + this.f114366b + ")";
    }
}
