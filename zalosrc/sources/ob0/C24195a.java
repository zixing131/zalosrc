package ob0;

/* renamed from: ob0.a */
/* loaded from: classes6.dex */
public class C24195a {

    /* renamed from: a */
    private final double f116782a;

    /* renamed from: b */
    private final double f116783b;

    public C24195a(float f11, float f12) {
        double d11 = f12;
        this.f116783b = Math.pow(6.283185307179586d / d11, 2.0d);
        this.f116782a = (f11 * 12.566370614359172d) / d11;
    }

    /* renamed from: a */
    public double m126136a(double d11, float f11, double d12, double d13) {
        return (d11 * (1.0d - (this.f116782a * f11))) + ((float) (this.f116783b * (d12 - d13) * r0));
    }
}
