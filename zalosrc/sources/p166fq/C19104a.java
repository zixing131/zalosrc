package p166fq;

import androidx.work.AbstractC2147g0;

/* renamed from: fq.a */
/* loaded from: classes4.dex */
public final class C19104a {

    /* renamed from: a */
    private final long f95096a;

    /* renamed from: b */
    private final long f95097b;

    /* renamed from: c */
    private final long f95098c;

    public C19104a(long j11, long j12, long j13) {
        this.f95096a = j11;
        this.f95097b = j12;
        this.f95098c = j13;
    }

    /* renamed from: a */
    public final long m100339a() {
        return this.f95096a;
    }

    /* renamed from: b */
    public final long m100340b() {
        return this.f95097b;
    }

    /* renamed from: c */
    public final long m100341c() {
        return this.f95098c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19104a)) {
            return false;
        }
        C19104a c19104a = (C19104a) obj;
        return this.f95096a == c19104a.f95096a && this.f95097b == c19104a.f95097b && this.f95098c == c19104a.f95098c;
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f95096a) * 31) + AbstractC2147g0.m11521a(this.f95097b)) * 31) + AbstractC2147g0.m11521a(this.f95098c);
    }

    public String toString() {
        return "AnimationDuration(flyInAnimTime=" + this.f95096a + ", restOnScreenTime=" + this.f95097b + ", flyOutAnimTime=" + this.f95098c + ")";
    }
}
