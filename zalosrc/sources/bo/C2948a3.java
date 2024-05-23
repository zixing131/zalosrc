package bo;

import com.zing.zalo.AbstractC16781w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: bo.a3 */
/* loaded from: classes4.dex */
public final class C2948a3 {

    /* renamed from: a */
    private String f11633a;

    /* renamed from: b */
    private int f11634b;

    /* renamed from: c */
    private int f11635c;

    public C2948a3(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "text");
        this.f11633a = str;
        this.f11634b = i11;
        this.f11635c = i12;
    }

    /* renamed from: a */
    public final int m13955a() {
        return this.f11635c;
    }

    /* renamed from: b */
    public final String m13956b() {
        return this.f11633a;
    }

    /* renamed from: c */
    public final int m13957c() {
        return this.f11634b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2948a3)) {
            return false;
        }
        C2948a3 c2948a3 = (C2948a3) obj;
        return AbstractC19074t.m100204b(this.f11633a, c2948a3.f11633a) && this.f11634b == c2948a3.f11634b && this.f11635c == c2948a3.f11635c;
    }

    public int hashCode() {
        return (((this.f11633a.hashCode() * 31) + this.f11634b) * 31) + this.f11635c;
    }

    public String toString() {
        return "ProfileYearDividerData(text=" + this.f11633a + ", textColor=" + this.f11634b + ", bgColor=" + this.f11635c + ")";
    }

    public /* synthetic */ C2948a3(String str, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(str, (i13 & 2) != 0 ? C23212s8.m119606n(AbstractC21196a.TextColor1) : i11, (i13 & 4) != 0 ? C23212s8.m119606n(AbstractC16781w.SecondaryBackgroundColor) : i12);
    }
}
