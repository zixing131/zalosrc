package p428pu;

/* renamed from: pu.a */
/* loaded from: classes4.dex */
public abstract class AbstractC24909a {
    /* renamed from: a */
    public static int m129556a(double d11) {
        return (int) Math.floor(d11);
    }

    /* renamed from: b */
    public static double m129557b(int i11) {
        return m129558c(i11);
    }

    /* renamed from: c */
    public static double m129558c(int i11) {
        double d11;
        double d12 = i11;
        double d13 = d12 / 1236.85d;
        double d14 = d13 * d13;
        double d15 = d14 * d13;
        double sin = ((((29.53058868d * d12) + 2415020.75933d) + (1.178E-4d * d14)) - (1.55E-7d * d15)) + (Math.sin((((132.87d * d13) + 166.56d) - (0.009173d * d14)) * 0.017453292519943295d) * 3.3E-4d);
        double d16 = (((29.10535608d * d12) + 359.2242d) - (3.33E-5d * d14)) - (3.47E-6d * d15);
        double d17 = (385.81691806d * d12) + 306.0253d + (0.0107306d * d14) + (1.236E-5d * d15);
        double d18 = (((d12 * 390.67050646d) + 21.2964d) - (0.0016528d * d14)) - (2.39E-6d * d15);
        double sin2 = ((((((((0.1734d - (3.93E-4d * d13)) * Math.sin(d16 * 0.017453292519943295d)) + (Math.sin(0.03490658503988659d * d16) * 0.0021d)) - (Math.sin(d17 * 0.017453292519943295d) * 0.4068d)) + (Math.sin(0.03490658503988659d * d17) * 0.0161d)) - (Math.sin(0.05235987755982989d * d17) * 4.0E-4d)) + (Math.sin(0.03490658503988659d * d18) * 0.0104d)) - (Math.sin((d16 + d17) * 0.017453292519943295d) * 0.0051d)) - (Math.sin((d16 - d17) * 0.017453292519943295d) * 0.0074d);
        double d19 = d18 * 2.0d;
        double sin3 = (((sin2 + (Math.sin((d19 + d16) * 0.017453292519943295d) * 4.0E-4d)) - (Math.sin((d19 - d16) * 0.017453292519943295d) * 4.0E-4d)) - (Math.sin((d19 + d17) * 0.017453292519943295d) * 6.0E-4d)) + (Math.sin((d19 - d17) * 0.017453292519943295d) * 0.001d) + (Math.sin(((d17 * 2.0d) + d16) * 0.017453292519943295d) * 5.0E-4d);
        if (d13 < -11.0d) {
            d11 = ((((8.39E-4d * d13) + 0.001d) + (d14 * 2.261E-4d)) - (8.45E-6d * d15)) - ((d13 * 8.1E-8d) * d15);
        } else {
            d11 = ((d13 * 2.65E-4d) - 2.78E-4d) + (d14 * 2.62E-4d);
        }
        return (sin + sin3) - d11;
    }

    /* renamed from: d */
    public static double m129559d(double d11) {
        return m129560e(d11);
    }

    /* renamed from: e */
    public static double m129560e(double d11) {
        double d12 = (d11 - 2451545.0d) / 36525.0d;
        double d13 = d12 * d12;
        double d14 = (((35999.0503d * d12) + 357.5291d) - (1.559E-4d * d13)) - ((4.8E-7d * d12) * d13);
        return ((((36000.76983d * d12) + 280.46645d) + (3.032E-4d * d13)) + (((((1.9146d - (0.004817d * d12)) - (d13 * 1.4E-5d)) * Math.sin(0.017453292519943295d * d14)) + ((0.019993d - (d12 * 1.01E-4d)) * Math.sin(0.03490658503988659d * d14))) + (Math.sin(0.05235987755982989d * d14) * 2.9E-4d))) - (m129556a(r4 / 360.0d) * 360);
    }

    /* renamed from: f */
    public static int m129561f(int[] iArr, int[] iArr2) {
        int i11 = iArr[2];
        int i12 = iArr2[2];
        if (i11 != i12) {
            return i11 - i12;
        }
        int i13 = iArr[1];
        int i14 = iArr2[1];
        if (i13 != i14) {
            return i13 - i14;
        }
        return iArr[0] - iArr2[0];
    }

    /* renamed from: g */
    public static int[] m129562g(int i11, int i12, int i13, int i14, double d11) {
        int m129565j;
        int m129565j2;
        if (i12 < 11) {
            m129565j = m129565j(i13 - 1, d11);
            m129565j2 = m129565j(i13, d11);
        } else {
            m129565j = m129565j(i13, d11);
            m129565j2 = m129565j(i13 + 1, d11);
        }
        int m129556a = m129556a(((m129565j - 2415021.076998695d) / 29.530588853d) + 0.5d);
        int i15 = i12 - 11;
        if (i15 < 0) {
            i15 = i12 + 1;
        }
        if (m129565j2 - m129565j > 365) {
            int m129564i = m129564i(m129565j, d11);
            int i16 = m129564i - 2;
            if (i16 < 0) {
                i16 = m129564i + 10;
            }
            if (i14 != 0 && i12 != i16) {
                return new int[]{0, 0, 0};
            }
            if (i14 != 0 || i15 >= m129564i) {
                i15++;
            }
        }
        return m129569n((m129566k(m129556a + i15, d11) + i11) - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:            if (r0 == r8) goto L17;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] m129563h(int i11, int i12, int i13, double d11) {
        int m129565j;
        int m129568m = m129568m(i11, i12, i13);
        int m129556a = m129556a((m129568m - 2415021.076998695d) / 29.530588853d);
        int m129566k = m129566k(m129556a + 1, d11);
        if (m129566k > m129568m) {
            m129566k = m129566k(m129556a, d11);
        }
        int m129565j2 = m129565j(i13, d11);
        if (m129565j2 >= m129566k) {
            m129565j = m129565j2;
            m129565j2 = m129565j(i13 - 1, d11);
        } else {
            i13++;
            m129565j = m129565j(i13, d11);
        }
        int i14 = 1;
        int i15 = (m129568m - m129566k) + 1;
        int m129556a2 = m129556a((m129566k - m129565j2) / 29.0f);
        int i16 = m129556a2 + 11;
        if (m129565j - m129565j2 > 365 && m129556a2 >= (r8 = m129564i(m129565j2, d11))) {
            i16 = m129556a2 + 10;
        }
        i14 = 0;
        if (i16 > 12) {
            i16 -= 12;
        }
        if (i16 >= 11 && m129556a2 < 4) {
            i13--;
        }
        return new int[]{i15, i16, i13, i14};
    }

    /* renamed from: i */
    public static int m129564i(int i11, double d11) {
        int m129556a = m129556a(((i11 - 2415021.076998695d) / 29.530588853d) + 0.5d);
        int m129556a2 = m129556a(m129567l(m129566k(m129556a + 1, d11), d11) / 30.0d);
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            int m129556a3 = m129556a(m129567l(m129566k(m129556a + i13, d11), d11) / 30.0d);
            if (m129556a3 == m129556a2 || i13 >= 14) {
                break;
            }
            i12 = i13;
            m129556a2 = m129556a3;
        }
        return i12;
    }

    /* renamed from: j */
    public static int m129565j(int i11, double d11) {
        int m129556a = m129556a((m129568m(31, 12, i11) - 2415021.076998695d) / 29.530588853d);
        int m129566k = m129566k(m129556a, d11);
        if (m129556a(m129567l(m129566k, d11) / 30.0d) >= 9) {
            return m129566k(m129556a - 1, d11);
        }
        return m129566k;
    }

    /* renamed from: k */
    public static int m129566k(int i11, double d11) {
        return m129556a(m129557b(i11) + 0.5d + (d11 / 24.0d));
    }

    /* renamed from: l */
    public static double m129567l(int i11, double d11) {
        return m129559d((i11 - 0.5d) - (d11 / 24.0d));
    }

    /* renamed from: m */
    public static int m129568m(int i11, int i12, int i13) {
        int i14 = (i13 + 4800) - ((14 - i12) / 12);
        int i15 = i11 + (((((i12 + (r0 * 12)) - 3) * 153) + 2) / 5) + (i14 * 365) + (i14 / 4);
        int i16 = ((i15 - (i14 / 100)) + (i14 / 400)) - 32045;
        if (i16 < 2299161) {
            return i15 - 32083;
        }
        return i16;
    }

    /* renamed from: n */
    public static int[] m129569n(int i11) {
        int i12;
        int i13;
        if (i11 > 2299160) {
            int i14 = i11 + 32044;
            i13 = ((i14 * 4) + 3) / 146097;
            i12 = i14 - ((146097 * i13) / 4);
        } else {
            i12 = i11 + 32082;
            i13 = 0;
        }
        int i15 = i12 - (((((i12 * 4) + 3) / 1461) * 1461) / 4);
        int i16 = ((i15 * 5) + 2) / 153;
        int i17 = (i15 - (((i16 * 153) + 2) / 5)) + 1;
        int i18 = i16 + 3;
        int i19 = i16 / 10;
        return new int[]{i17, i18 - (i19 * 12), (((i13 * 100) + r1) - 4800) + i19};
    }
}
