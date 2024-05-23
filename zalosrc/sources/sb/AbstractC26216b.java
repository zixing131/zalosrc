package sb;

/* renamed from: sb.b */
/* loaded from: classes.dex */
public abstract class AbstractC26216b {
    /* renamed from: a */
    public static long m134773a(long j11, long j12) {
        if (j12 < j11) {
            return 0L;
        }
        return j12 - j11;
    }

    /* renamed from: b */
    public static long m134774b(long j11, long j12) {
        return m134776d(m134773a(j11, j12));
    }

    /* renamed from: c */
    public static long m134775c(int i11, long j11) {
        long j12 = 0;
        int i12 = 0;
        while (i12 < i11) {
            i12++;
            long j13 = j11;
            j11 = j12 + j11;
            j12 = j13;
        }
        return j11;
    }

    /* renamed from: d */
    public static long m134776d(long j11) {
        return j11 / 1000000;
    }
}
