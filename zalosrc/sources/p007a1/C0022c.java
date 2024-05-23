package p007a1;

import java.util.Arrays;

/* renamed from: a1.c */
/* loaded from: classes2.dex */
public class C0022c {

    /* renamed from: b */
    static C0022c f59b = new C0022c();

    /* renamed from: c */
    public static String[] f60c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    String f61a = "identity";

    /* renamed from: a1.c$a */
    /* loaded from: classes2.dex */
    static class a extends C0022c {

        /* renamed from: h */
        private static double f62h = 0.01d;

        /* renamed from: i */
        private static double f63i = 1.0E-4d;

        /* renamed from: d */
        double f64d;

        /* renamed from: e */
        double f65e;

        /* renamed from: f */
        double f66f;

        /* renamed from: g */
        double f67g;

        a(String str) {
            this.f61a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f64d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i11 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i11);
            this.f65e = Double.parseDouble(str.substring(i11, indexOf3).trim());
            int i12 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i12);
            this.f66f = Double.parseDouble(str.substring(i12, indexOf4).trim());
            int i13 = indexOf4 + 1;
            this.f67g = Double.parseDouble(str.substring(i13, str.indexOf(41, i13)).trim());
        }

        /* renamed from: d */
        private double m62d(double d11) {
            double d12 = 1.0d - d11;
            double d13 = 3.0d * d12;
            return (this.f64d * d12 * d13 * d11) + (this.f66f * d13 * d11 * d11) + (d11 * d11 * d11);
        }

        /* renamed from: e */
        private double m63e(double d11) {
            double d12 = 1.0d - d11;
            double d13 = 3.0d * d12;
            return (this.f65e * d12 * d13 * d11) + (this.f67g * d13 * d11 * d11) + (d11 * d11 * d11);
        }

        @Override // p007a1.C0022c
        /* renamed from: a */
        public double mo60a(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double d12 = 0.5d;
            double d13 = 0.5d;
            while (d12 > f62h) {
                d12 *= 0.5d;
                if (m62d(d13) < d11) {
                    d13 += d12;
                } else {
                    d13 -= d12;
                }
            }
            double d14 = d13 - d12;
            double m62d = m62d(d14);
            double d15 = d13 + d12;
            double m62d2 = m62d(d15);
            double m63e = m63e(d14);
            return (((m63e(d15) - m63e) * (d11 - m62d)) / (m62d2 - m62d)) + m63e;
        }

        @Override // p007a1.C0022c
        /* renamed from: b */
        public double mo61b(double d11) {
            double d12 = 0.5d;
            double d13 = 0.5d;
            while (d12 > f63i) {
                d12 *= 0.5d;
                if (m62d(d13) < d11) {
                    d13 += d12;
                } else {
                    d13 -= d12;
                }
            }
            double d14 = d13 - d12;
            double m62d = m62d(d14);
            double d15 = d13 + d12;
            return (m63e(d15) - m63e(d14)) / (m62d(d15) - m62d);
        }
    }

    /* renamed from: c */
    public static C0022c m59c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new C0031l(str);
        }
        if (str.startsWith("Schlick")) {
            return new C0028i(str);
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c11 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new a("cubic(1, 1, 0, 0)");
            case 4:
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f60c));
                return f59b;
        }
    }

    /* renamed from: a */
    public double mo60a(double d11) {
        return d11;
    }

    /* renamed from: b */
    public double mo61b(double d11) {
        return 1.0d;
    }

    public String toString() {
        return this.f61a;
    }
}
