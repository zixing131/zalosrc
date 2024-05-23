package a10;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: a10.r */
/* loaded from: classes5.dex */
public final class C0053r {

    /* renamed from: a */
    private final int f196a;

    /* renamed from: b */
    private final String f197b;

    /* renamed from: c */
    private final String f198c;

    /* renamed from: d */
    private final long f199d;

    public C0053r(int i11, String str, String str2, long j11) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "videoId");
        this.f196a = i11;
        this.f197b = str;
        this.f198c = str2;
        this.f199d = j11;
    }

    /* renamed from: a */
    public final int m154a() {
        return this.f196a;
    }

    /* renamed from: b */
    public final long m155b() {
        return this.f199d;
    }

    /* renamed from: c */
    public final String m156c() {
        return this.f197b;
    }

    /* renamed from: d */
    public final String m157d() {
        return this.f198c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0053r)) {
            return false;
        }
        C0053r c0053r = (C0053r) obj;
        return this.f196a == c0053r.f196a && AbstractC19074t.m100204b(this.f197b, c0053r.f197b) && AbstractC19074t.m100204b(this.f198c, c0053r.f198c) && this.f199d == c0053r.f199d;
    }

    public int hashCode() {
        return (((((this.f196a * 31) + this.f197b.hashCode()) * 31) + this.f198c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f199d);
    }

    public String toString() {
        return "ViewHistory(id=" + this.f196a + ", userId=" + this.f197b + ", videoId=" + this.f198c + ", timestamp=" + this.f199d + ")";
    }

    public /* synthetic */ C0053r(int i11, String str, String str2, long j11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11, str, str2, j11);
    }
}
