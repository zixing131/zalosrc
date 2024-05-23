package ym0;

/* renamed from: ym0.c */
/* loaded from: classes.dex */
public abstract class AbstractC31022c {
    /* renamed from: a */
    private static final int m150825a(int i11, int i12, int i13) {
        return m150829e(m150829e(i11, i13) - m150829e(i12, i13), i13);
    }

    /* renamed from: b */
    private static final long m150826b(long j11, long j12, long j13) {
        return m150830f(m150830f(j11, j13) - m150830f(j12, j13), j13);
    }

    /* renamed from: c */
    public static final int m150827c(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (i11 < i12) {
                return i12 - m150825a(i12, i11, i13);
            }
            return i12;
        }
        if (i13 < 0) {
            if (i11 > i12) {
                return i12 + m150825a(i11, i12, -i13);
            }
            return i12;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: d */
    public static final long m150828d(long j11, long j12, long j13) {
        if (j13 > 0) {
            if (j11 < j12) {
                return j12 - m150826b(j12, j11, j13);
            }
            return j12;
        }
        if (j13 < 0) {
            if (j11 > j12) {
                return j12 + m150826b(j11, j12, -j13);
            }
            return j12;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: e */
    private static final int m150829e(int i11, int i12) {
        int i13 = i11 % i12;
        if (i13 < 0) {
            return i13 + i12;
        }
        return i13;
    }

    /* renamed from: f */
    private static final long m150830f(long j11, long j12) {
        long j13 = j11 % j12;
        if (j13 < 0) {
            return j13 + j12;
        }
        return j13;
    }
}
