package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes2.dex */
class C1063m {

    /* renamed from: d */
    private static C1063m f3862d;

    /* renamed from: a */
    public long f3863a;

    /* renamed from: b */
    public long f3864b;

    /* renamed from: c */
    public int f3865c;

    C1063m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1063m m4922b() {
        if (f3862d == null) {
            f3862d = new C1063m();
        }
        return f3862d;
    }

    /* renamed from: a */
    public void m4923a(long j11, double d11, double d12) {
        double d13 = (0.01720197f * (((float) (j11 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d13) * 0.03341960161924362d) + d13 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d12) / 360.0d) + (Math.sin(d13) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d14 = 0.01745329238474369d * d11;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d14) * Math.sin(asin))) / (Math.cos(d14) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f3865c = 1;
            this.f3863a = -1L;
            this.f3864b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f3865c = 0;
                this.f3863a = -1L;
                this.f3864b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f3863a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f3864b = round2;
            if (round2 < j11 && this.f3863a > j11) {
                this.f3865c = 0;
            } else {
                this.f3865c = 1;
            }
        }
    }
}
