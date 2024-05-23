package androidx.core.util;

import java.io.PrintWriter;

/* renamed from: androidx.core.util.k */
/* loaded from: classes2.dex */
public abstract class AbstractC1489k {

    /* renamed from: a */
    private static final Object f6379a = new Object();

    /* renamed from: b */
    private static char[] f6380b = new char[24];

    /* renamed from: a */
    private static int m7497a(int i11, int i12, boolean z11, int i13) {
        if (i11 > 99 || (z11 && i13 >= 3)) {
            return i12 + 3;
        }
        if (i11 > 9 || (z11 && i13 >= 2)) {
            return i12 + 2;
        }
        if (z11 || i11 > 0) {
            return i12 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m7498b(long j11, long j12, PrintWriter printWriter) {
        if (j11 == 0) {
            printWriter.print("--");
        } else {
            m7500d(j11 - j12, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m7499c(long j11, PrintWriter printWriter) {
        m7500d(j11, printWriter, 0);
    }

    /* renamed from: d */
    public static void m7500d(long j11, PrintWriter printWriter, int i11) {
        synchronized (f6379a) {
            printWriter.print(new String(f6380b, 0, m7501e(j11, i11)));
        }
    }

    /* renamed from: e */
    private static int m7501e(long j11, int i11) {
        char c11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        int i19;
        int i21;
        boolean z15;
        boolean z16;
        boolean z17;
        int i22;
        long j12 = j11;
        if (f6380b.length < i11) {
            f6380b = new char[i11];
        }
        char[] cArr = f6380b;
        if (j12 == 0) {
            int i23 = i11 - 1;
            while (i23 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j12 > 0) {
            c11 = '+';
        } else {
            j12 = -j12;
            c11 = '-';
        }
        int i24 = (int) (j12 % 1000);
        int floor = (int) Math.floor(j12 / 1000);
        if (floor > 86400) {
            i12 = floor / 86400;
            floor -= 86400 * i12;
        } else {
            i12 = 0;
        }
        if (floor > 3600) {
            i13 = floor / 3600;
            floor -= i13 * 3600;
        } else {
            i13 = 0;
        }
        if (floor > 60) {
            int i25 = floor / 60;
            i14 = floor - (i25 * 60);
            i15 = i25;
        } else {
            i14 = floor;
            i15 = 0;
        }
        if (i11 != 0) {
            int m7497a = m7497a(i12, 1, false, 0);
            if (m7497a > 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            int m7497a2 = m7497a + m7497a(i13, 1, z15, 2);
            if (m7497a2 > 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            int m7497a3 = m7497a2 + m7497a(i15, 1, z16, 2);
            if (m7497a3 > 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            int m7497a4 = m7497a3 + m7497a(i14, 1, z17, 2);
            if (m7497a4 > 0) {
                i22 = 3;
            } else {
                i22 = 0;
            }
            i16 = 0;
            for (int m7497a5 = m7497a4 + m7497a(i24, 2, true, i22) + 1; m7497a5 < i11; m7497a5++) {
                cArr[i16] = ' ';
                i16++;
            }
        } else {
            i16 = 0;
        }
        cArr[i16] = c11;
        int i26 = i16 + 1;
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m7502f = m7502f(cArr, i12, 'd', i26, false, 0);
        if (m7502f != i26) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            i17 = 2;
        } else {
            i17 = 0;
        }
        int m7502f2 = m7502f(cArr, i13, 'h', m7502f, z12, i17);
        if (m7502f2 != i26) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11) {
            i18 = 2;
        } else {
            i18 = 0;
        }
        int m7502f3 = m7502f(cArr, i15, 'm', m7502f2, z13, i18);
        if (m7502f3 != i26) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z11) {
            i19 = 2;
        } else {
            i19 = 0;
        }
        int m7502f4 = m7502f(cArr, i14, 's', m7502f3, z14, i19);
        if (z11 && m7502f4 != i26) {
            i21 = 3;
        } else {
            i21 = 0;
        }
        int m7502f5 = m7502f(cArr, i24, 'm', m7502f4, true, i21);
        cArr[m7502f5] = 's';
        return m7502f5 + 1;
    }

    /* renamed from: f */
    private static int m7502f(char[] cArr, int i11, char c11, int i12, boolean z11, int i13) {
        int i14;
        if (z11 || i11 > 0) {
            if ((z11 && i13 >= 3) || i11 > 99) {
                int i15 = i11 / 100;
                cArr[i12] = (char) (i15 + 48);
                i14 = i12 + 1;
                i11 -= i15 * 100;
            } else {
                i14 = i12;
            }
            if ((z11 && i13 >= 2) || i11 > 9 || i12 != i14) {
                int i16 = i11 / 10;
                cArr[i14] = (char) (i16 + 48);
                i14++;
                i11 -= i16 * 10;
            }
            cArr[i14] = (char) (i11 + 48);
            cArr[i14 + 1] = c11;
            return i14 + 2;
        }
        return i12;
    }
}
