package hn0;

/* renamed from: hn0.a */
/* loaded from: classes7.dex */
final class C20101a {

    /* renamed from: a */
    public static final C20101a f98872a = new C20101a();

    /* renamed from: b */
    public static final double f98873b = Math.log(2.0d);

    /* renamed from: c */
    public static final double f98874c;

    /* renamed from: d */
    public static final double f98875d;

    /* renamed from: e */
    public static final double f98876e;

    /* renamed from: f */
    public static final double f98877f;

    /* renamed from: g */
    public static final double f98878g;

    static {
        double ulp = Math.ulp(1.0d);
        f98874c = ulp;
        double sqrt = Math.sqrt(ulp);
        f98875d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f98876e = sqrt2;
        double d11 = 1;
        f98877f = d11 / sqrt;
        f98878g = d11 / sqrt2;
    }

    private C20101a() {
    }
}
