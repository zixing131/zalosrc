package p397on;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: on.b */
/* loaded from: classes3.dex */
public final class C24314b {

    /* renamed from: a */
    private final List f117402a;

    /* renamed from: b */
    private final int f117403b;

    /* renamed from: c */
    private final boolean f117404c;

    /* renamed from: d */
    private final Integer f117405d;

    /* renamed from: e */
    private final Integer f117406e;

    public C24314b(List list, int i11, boolean z11, Integer num, Integer num2) {
        AbstractC19074t.m100208f(list, "actionButtons");
        this.f117402a = list;
        this.f117403b = i11;
        this.f117404c = z11;
        this.f117405d = num;
        this.f117406e = num2;
    }

    /* renamed from: a */
    public final boolean m126965a(int i11) {
        if (this.f117403b < 2) {
            return true;
        }
        int size = this.f117402a.size();
        int i12 = this.f117403b;
        if (size <= i12 || i11 < i12 - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final List m126966b() {
        return this.f117402a;
    }

    /* renamed from: c */
    public final boolean m126967c() {
        return this.f117404c;
    }

    /* renamed from: d */
    public final Integer m126968d() {
        return this.f117406e;
    }

    /* renamed from: e */
    public final Integer m126969e() {
        return this.f117405d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24314b)) {
            return false;
        }
        C24314b c24314b = (C24314b) obj;
        return AbstractC19074t.m100204b(this.f117402a, c24314b.f117402a) && this.f117403b == c24314b.f117403b && this.f117404c == c24314b.f117404c && AbstractC19074t.m100204b(this.f117405d, c24314b.f117405d) && AbstractC19074t.m100204b(this.f117406e, c24314b.f117406e);
    }

    /* renamed from: f */
    public final boolean m126970f() {
        int i11 = this.f117403b;
        if (i11 < 2 || i11 >= this.f117402a.size()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((this.f117402a.hashCode() * 31) + this.f117403b) * 31) + AbstractC2144f.m11520a(this.f117404c)) * 31;
        Integer num = this.f117405d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f117406e;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ExpandableActionViewConfig(actionButtons=" + this.f117402a + ", expansionThreshold=" + this.f117403b + ", autoCollapsed=" + this.f117404c + ", paddingTop=" + this.f117405d + ", paddingEnd=" + this.f117406e + ")";
    }

    public /* synthetic */ C24314b(List list, int i11, boolean z11, Integer num, Integer num2, int i12, AbstractC19060k abstractC19060k) {
        this(list, (i12 & 2) != 0 ? 6 : i11, (i12 & 4) != 0 ? true : z11, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : num2);
    }
}
