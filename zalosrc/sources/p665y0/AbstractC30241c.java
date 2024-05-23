package p665y0;

/* renamed from: y0.c */
/* loaded from: classes.dex */
abstract class AbstractC30241c {

    /* renamed from: a */
    static final int[] f140457a = new int[0];

    /* renamed from: b */
    static final long[] f140458b = new long[0];

    /* renamed from: c */
    static final Object[] f140459c = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m149118a(int[] iArr, int i11, int i12) {
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = iArr[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else if (i16 > i12) {
                i13 = i15 - 1;
            } else {
                return i15;
            }
        }
        return ~i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m149119b(long[] jArr, int i11, long j11) {
        int i12 = i11 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long j12 = jArr[i14];
            if (j12 < j11) {
                i13 = i14 + 1;
            } else if (j12 > j11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }

    /* renamed from: c */
    public static boolean m149120c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m149121d(int i11) {
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                return i13;
            }
        }
        return i11;
    }

    /* renamed from: e */
    public static int m149122e(int i11) {
        return m149121d(i11 * 4) / 4;
    }

    /* renamed from: f */
    public static int m149123f(int i11) {
        return m149121d(i11 * 8) / 8;
    }
}
