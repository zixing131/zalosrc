package q20;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: q20.x */
/* loaded from: classes5.dex */
public final class C25101x {

    /* renamed from: a */
    private final String f120573a;

    /* renamed from: b */
    private final String f120574b;

    /* renamed from: c */
    private final long f120575c;

    /* renamed from: d */
    private final int f120576d;

    /* renamed from: e */
    private final boolean f120577e;

    /* renamed from: f */
    private final int f120578f;

    /* renamed from: g */
    private final boolean f120579g;

    /* renamed from: h */
    private final boolean f120580h;

    public C25101x(String str, String str2, long j11, int i11, boolean z11, int i12, boolean z12, boolean z13) {
        AbstractC19074t.m100208f(str, "id");
        this.f120573a = str;
        this.f120574b = str2;
        this.f120575c = j11;
        this.f120576d = i11;
        this.f120577e = z11;
        this.f120578f = i12;
        this.f120579g = z12;
        this.f120580h = z13;
    }

    /* renamed from: a */
    public final int m130169a() {
        return this.f120576d;
    }

    /* renamed from: b */
    public final boolean m130170b() {
        return this.f120580h;
    }

    /* renamed from: c */
    public final boolean m130171c() {
        return this.f120579g;
    }

    /* renamed from: d */
    public final String m130172d() {
        return this.f120573a;
    }

    /* renamed from: e */
    public final String m130173e() {
        return this.f120574b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25101x)) {
            return false;
        }
        C25101x c25101x = (C25101x) obj;
        return AbstractC19074t.m100204b(this.f120573a, c25101x.f120573a) && AbstractC19074t.m100204b(this.f120574b, c25101x.f120574b) && this.f120575c == c25101x.f120575c && this.f120576d == c25101x.f120576d && this.f120577e == c25101x.f120577e && this.f120578f == c25101x.f120578f && this.f120579g == c25101x.f120579g && this.f120580h == c25101x.f120580h;
    }

    /* renamed from: f */
    public final boolean m130174f() {
        return this.f120577e;
    }

    /* renamed from: g */
    public final int m130175g() {
        return this.f120578f;
    }

    /* renamed from: h */
    public final long m130176h() {
        return this.f120575c;
    }

    public int hashCode() {
        int hashCode = this.f120573a.hashCode() * 31;
        String str = this.f120574b;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f120575c)) * 31) + this.f120576d) * 31) + AbstractC2144f.m11520a(this.f120577e)) * 31) + this.f120578f) * 31) + AbstractC2144f.m11520a(this.f120579g)) * 31) + AbstractC2144f.m11520a(this.f120580h);
    }

    public String toString() {
        return "ViewData(id=" + this.f120573a + ", identifier=" + this.f120574b + ", watchTime=" + this.f120575c + ", commentCount=" + this.f120576d + ", liked=" + this.f120577e + ", shareCount=" + this.f120578f + ", followed=" + this.f120579g + ", dislike=" + this.f120580h + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25101x(String str, String str2, int i11, Integer num, Boolean bool, Integer num2, Boolean bool2, Boolean bool3) {
        this(str, str2, i11, num != null ? num.intValue() : 0, bool != null ? bool.booleanValue() : false, num2 != null ? num2.intValue() : 0, bool2 != null ? bool2.booleanValue() : false, bool3 != null ? bool3.booleanValue() : false);
        AbstractC19074t.m100208f(str, "id");
    }
}
