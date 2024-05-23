package on0;

/* renamed from: on0.b0 */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC24318b0 {
    /* renamed from: a */
    public static /* synthetic */ long m126978a(long j11, long j12) {
        if (j12 < 0) {
            return (j11 ^ Long.MIN_VALUE) < (j12 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j11 >= 0) {
            return j11 / j12;
        }
        long j13 = ((j11 >>> 1) / j12) << 1;
        return j13 + (((j11 - (j13 * j12)) ^ Long.MIN_VALUE) < (j12 ^ Long.MIN_VALUE) ? 0 : 1);
    }
}
