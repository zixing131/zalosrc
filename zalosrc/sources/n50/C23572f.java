package n50;

import fn0.AbstractC19074t;

/* renamed from: n50.f */
/* loaded from: classes5.dex */
public final class C23572f extends AbstractC23574h {

    /* renamed from: b */
    private final C23571e f114393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23572f(C23571e c23571e) {
        super(2);
        AbstractC19074t.m100208f(c23571e, "emptyContentData");
        this.f114393b = c23571e;
    }

    /* renamed from: b */
    public final C23571e m123672b() {
        return this.f114393b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23572f) && AbstractC19074t.m100204b(this.f114393b, ((C23572f) obj).f114393b);
    }

    public int hashCode() {
        return this.f114393b.hashCode();
    }

    public String toString() {
        return "RingtoneEmptyRow(emptyContentData=" + this.f114393b + ")";
    }
}
