package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class yx3 {

    /* renamed from: a */
    private final long f31254a;

    /* renamed from: b */
    private final long f31255b;

    /* renamed from: c */
    private long f31256c = -9223372036854775807L;

    /* renamed from: d */
    private long f31257d = -9223372036854775807L;

    /* renamed from: f */
    private long f31259f = -9223372036854775807L;

    /* renamed from: g */
    private long f31260g = -9223372036854775807L;

    /* renamed from: j */
    private float f31263j = 0.97f;

    /* renamed from: i */
    private float f31262i = 1.03f;

    /* renamed from: k */
    private float f31264k = 1.0f;

    /* renamed from: l */
    private long f31265l = -9223372036854775807L;

    /* renamed from: e */
    private long f31258e = -9223372036854775807L;

    /* renamed from: h */
    private long f31261h = -9223372036854775807L;

    /* renamed from: m */
    private long f31266m = -9223372036854775807L;

    /* renamed from: n */
    private long f31267n = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ yx3(float f11, float f12, long j11, float f13, long j12, long j13, float f14, zw3 zw3Var) {
        this.f31254a = j12;
        this.f31255b = j13;
    }

    /* renamed from: f */
    private static long m28380f(long j11, long j12, float f11) {
        return (((float) j11) * 0.999f) + (((float) j12) * 9.999871E-4f);
    }

    /* renamed from: g */
    private final void m28381g() {
        long j11 = this.f31256c;
        if (j11 != -9223372036854775807L) {
            long j12 = this.f31257d;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            long j13 = this.f31259f;
            if (j13 != -9223372036854775807L && j11 < j13) {
                j11 = j13;
            }
            long j14 = this.f31260g;
            if (j14 != -9223372036854775807L && j11 > j14) {
                j11 = j14;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        if (this.f31258e == j11) {
            return;
        }
        this.f31258e = j11;
        this.f31261h = j11;
        this.f31266m = -9223372036854775807L;
        this.f31267n = -9223372036854775807L;
        this.f31265l = -9223372036854775807L;
    }

    /* renamed from: a */
    public final float m28382a(long j11, long j12) {
        if (this.f31256c == -9223372036854775807L) {
            return 1.0f;
        }
        long j13 = j11 - j12;
        long j14 = this.f31266m;
        if (j14 == -9223372036854775807L) {
            this.f31266m = j13;
            this.f31267n = 0L;
        } else {
            long max = Math.max(j13, m28380f(j14, j13, 0.999f));
            this.f31266m = max;
            this.f31267n = m28380f(this.f31267n, Math.abs(j13 - max), 0.999f);
        }
        if (this.f31265l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f31265l < 1000) {
            return this.f31264k;
        }
        this.f31265l = SystemClock.elapsedRealtime();
        long j15 = this.f31266m + (this.f31267n * 3);
        if (this.f31261h > j15) {
            float m22344f0 = (float) g92.m22344f0(1000L);
            long[] jArr = {j15, this.f31258e, this.f31261h - (((this.f31264k - 1.0f) * m22344f0) + ((this.f31262i - 1.0f) * m22344f0))};
            for (int i11 = 1; i11 < 3; i11++) {
                long j16 = jArr[i11];
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            this.f31261h = j15;
        } else {
            j15 = g92.m22336b0(j11 - (Math.max(0.0f, this.f31264k - 1.0f) / 1.0E-7f), this.f31261h, j15);
            this.f31261h = j15;
            long j17 = this.f31260g;
            if (j17 != -9223372036854775807L && j15 > j17) {
                this.f31261h = j17;
                j15 = j17;
            }
        }
        long j18 = j11 - j15;
        if (Math.abs(j18) < this.f31254a) {
            this.f31264k = 1.0f;
            return 1.0f;
        }
        float m22307A = g92.m22307A((((float) j18) * 1.0E-7f) + 1.0f, this.f31263j, this.f31262i);
        this.f31264k = m22307A;
        return m22307A;
    }

    /* renamed from: b */
    public final long m28383b() {
        return this.f31261h;
    }

    /* renamed from: c */
    public final void m28384c() {
        long j11 = this.f31261h;
        if (j11 == -9223372036854775807L) {
            return;
        }
        long j12 = j11 + this.f31255b;
        this.f31261h = j12;
        long j13 = this.f31260g;
        if (j13 != -9223372036854775807L && j12 > j13) {
            this.f31261h = j13;
        }
        this.f31265l = -9223372036854775807L;
    }

    /* renamed from: d */
    public final void m28385d(C4688kk c4688kk) {
        long j11 = c4688kk.f23347a;
        this.f31256c = g92.m22344f0(-9223372036854775807L);
        this.f31259f = g92.m22344f0(-9223372036854775807L);
        this.f31260g = g92.m22344f0(-9223372036854775807L);
        this.f31263j = 0.97f;
        this.f31262i = 1.03f;
        m28381g();
    }

    /* renamed from: e */
    public final void m28386e(long j11) {
        this.f31257d = j11;
        m28381g();
    }
}
