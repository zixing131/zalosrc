package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class a72 {

    /* renamed from: a */
    private long f16955a;

    /* renamed from: b */
    private long f16956b;

    /* renamed from: c */
    private long f16957c;

    /* renamed from: d */
    private final ThreadLocal f16958d = new ThreadLocal();

    public a72(long j11) {
        m20018f(0L);
    }

    /* renamed from: a */
    public final synchronized long m20013a(long j11) {
        try {
            if (this.f16956b == -9223372036854775807L) {
                long j12 = this.f16955a;
                if (j12 == 9223372036854775806L) {
                    Long l11 = (Long) this.f16958d.get();
                    l11.getClass();
                    j12 = l11.longValue();
                }
                this.f16956b = j12 - j11;
                notifyAll();
            }
            this.f16957c = j11;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 + this.f16956b;
    }

    /* renamed from: b */
    public final synchronized long m20014b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f16957c;
            if (j12 != -9223372036854775807L) {
                long j13 = (j12 * 90000) / 1000000;
                long j14 = (4294967296L + j13) / 8589934592L;
                long j15 = (((-1) + j14) * 8589934592L) + j11;
                j11 += j14 * 8589934592L;
                if (Math.abs(j15 - j13) < Math.abs(j11 - j13)) {
                    j11 = j15;
                }
            }
            return m20013a((j11 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final synchronized long m20015c() {
        long j11 = this.f16955a;
        if (j11 == Long.MAX_VALUE || j11 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j11;
    }

    /* renamed from: d */
    public final synchronized long m20016d() {
        long j11;
        try {
            j11 = this.f16957c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 != -9223372036854775807L ? j11 + this.f16956b : m20015c();
    }

    /* renamed from: e */
    public final synchronized long m20017e() {
        return this.f16956b;
    }

    /* renamed from: f */
    public final synchronized void m20018f(long j11) {
        this.f16955a = j11;
        this.f16956b = j11 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f16957c = -9223372036854775807L;
    }
}
