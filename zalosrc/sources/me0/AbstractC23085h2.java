package me0;

/* renamed from: me0.h2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23085h2 {

    /* renamed from: a */
    private static StringBuilder f112143a = new StringBuilder(20);

    /* renamed from: a */
    public static final synchronized String m118417a(double d11) {
        String sb2;
        synchronized (AbstractC23085h2.class) {
            double abs = Math.abs(d11);
            int i11 = (int) abs;
            double d12 = (abs * 60.0d) - (i11 * 60.0d);
            int i12 = (int) d12;
            f112143a.setLength(0);
            f112143a.append(i11);
            f112143a.append("/1,");
            f112143a.append(i12);
            f112143a.append("/1,");
            f112143a.append((int) (((d12 * 60.0d) - (i12 * 60.0d)) * 1000.0d));
            f112143a.append("/1000");
            sb2 = f112143a.toString();
        }
        return sb2;
    }

    /* renamed from: b */
    public static String m118418b(double d11) {
        return d11 < 0.0d ? "S" : "N";
    }

    /* renamed from: c */
    public static String m118419c(double d11) {
        return d11 < 0.0d ? "W" : "E";
    }
}
