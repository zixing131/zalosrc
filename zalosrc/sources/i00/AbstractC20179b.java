package i00;

/* renamed from: i00.b */
/* loaded from: classes4.dex */
public abstract class AbstractC20179b {
    /* renamed from: a */
    public static double m105262a(double d11, double d12) {
        if (Math.abs(d11) > Math.abs(d12)) {
            double d13 = d12 / d11;
            return Math.abs(d11) * Math.sqrt((d13 * d13) + 1.0d);
        }
        if (d12 == 0.0d) {
            return 0.0d;
        }
        double d14 = d11 / d12;
        return Math.sqrt((d14 * d14) + 1.0d) * Math.abs(d12);
    }
}
