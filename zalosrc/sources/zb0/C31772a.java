package zb0;

import androidx.work.AbstractC2147g0;

/* renamed from: zb0.a */
/* loaded from: classes6.dex */
public final class C31772a {

    /* renamed from: a */
    private final long f145870a;

    /* renamed from: b */
    private final long f145871b;

    /* renamed from: c */
    private final long f145872c;

    /* renamed from: d */
    private final long f145873d;

    /* renamed from: e */
    private final long f145874e;

    public C31772a(long j11, long j12, long j13, long j14, long j15) {
        this.f145870a = j11;
        this.f145871b = j12;
        this.f145872c = j13;
        this.f145873d = j14;
        this.f145874e = j15;
    }

    /* renamed from: a */
    public final long m152764a() {
        return this.f145871b;
    }

    /* renamed from: b */
    public final long m152765b() {
        return this.f145873d;
    }

    /* renamed from: c */
    public final long m152766c() {
        return this.f145872c;
    }

    /* renamed from: d */
    public final long m152767d() {
        return this.f145874e;
    }

    /* renamed from: e */
    public final long m152768e() {
        return this.f145870a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31772a)) {
            return false;
        }
        C31772a c31772a = (C31772a) obj;
        return this.f145870a == c31772a.f145870a && this.f145871b == c31772a.f145871b && this.f145872c == c31772a.f145872c && this.f145873d == c31772a.f145873d && this.f145874e == c31772a.f145874e;
    }

    public int hashCode() {
        return (((((((AbstractC2147g0.m11521a(this.f145870a) * 31) + AbstractC2147g0.m11521a(this.f145871b)) * 31) + AbstractC2147g0.m11521a(this.f145872c)) * 31) + AbstractC2147g0.m11521a(this.f145873d)) * 31) + AbstractC2147g0.m11521a(this.f145874e);
    }

    public String toString() {
        return "ViewData(totalMediaSize=" + this.f145870a + ", availableOnDeviceSize=" + this.f145871b + ", downloadSize=" + this.f145872c + ", cloudMediaSize=" + this.f145873d + ", myCloudSize=" + this.f145874e + ")";
    }
}
