package p423pi;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: pi.c */
/* loaded from: classes3.dex */
public final class C24761c {

    /* renamed from: a */
    private final String f118925a;

    /* renamed from: b */
    private final String f118926b;

    /* renamed from: c */
    private final int f118927c;

    /* renamed from: d */
    private final int f118928d;

    /* renamed from: e */
    private final Integer f118929e;

    /* renamed from: f */
    private final Integer f118930f;

    /* renamed from: g */
    private final Integer f118931g;

    /* renamed from: h */
    private final Integer f118932h;

    public C24761c(String str, String str2, int i11, int i12, Integer num, Integer num2, Integer num3, Integer num4) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "msgDbLogType");
        this.f118925a = str;
        this.f118926b = str2;
        this.f118927c = i11;
        this.f118928d = i12;
        this.f118929e = num;
        this.f118930f = num2;
        this.f118931g = num3;
        this.f118932h = num4;
    }

    /* renamed from: a */
    public final Integer m128702a() {
        return this.f118930f;
    }

    /* renamed from: b */
    public final String m128703b() {
        return this.f118926b;
    }

    /* renamed from: c */
    public final int m128704c() {
        return this.f118927c;
    }

    /* renamed from: d */
    public final Integer m128705d() {
        return this.f118929e;
    }

    /* renamed from: e */
    public final Integer m128706e() {
        return this.f118931g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24761c)) {
            return false;
        }
        C24761c c24761c = (C24761c) obj;
        return AbstractC19074t.m100204b(this.f118925a, c24761c.f118925a) && AbstractC19074t.m100204b(this.f118926b, c24761c.f118926b) && this.f118927c == c24761c.f118927c && this.f118928d == c24761c.f118928d && AbstractC19074t.m100204b(this.f118929e, c24761c.f118929e) && AbstractC19074t.m100204b(this.f118930f, c24761c.f118930f) && AbstractC19074t.m100204b(this.f118931g, c24761c.f118931g) && AbstractC19074t.m100204b(this.f118932h, c24761c.f118932h);
    }

    /* renamed from: f */
    public final Integer m128707f() {
        return this.f118932h;
    }

    /* renamed from: g */
    public final int m128708g() {
        return this.f118928d;
    }

    /* renamed from: h */
    public final boolean m128709h() {
        return (this.f118929e == null && this.f118930f == null && this.f118931g == null && this.f118932h == null) ? false : true;
    }

    public int hashCode() {
        int hashCode = ((((((this.f118925a.hashCode() * 31) + this.f118926b.hashCode()) * 31) + this.f118927c) * 31) + this.f118928d) * 31;
        Integer num = this.f118929e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f118930f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f118931g;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f118932h;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "MsgDetailDownloadMediaLogEntity(threadId=" + this.f118925a + ", msgDbLogType=" + this.f118926b + ", msgHash=" + this.f118927c + ", isSyncMsg=" + this.f118928d + ", queuedType=" + this.f118929e + ", dlResultType=" + this.f118930f + ", isReceivedInCurrentDate=" + this.f118931g + ", isRollCleaned=" + this.f118932h + ")";
    }

    public /* synthetic */ C24761c(String str, String str2, int i11, int i12, Integer num, Integer num2, Integer num3, Integer num4, int i13, AbstractC19060k abstractC19060k) {
        this(str, str2, i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : num2, (i13 & 64) != 0 ? null : num3, (i13 & 128) != 0 ? null : num4);
    }
}
