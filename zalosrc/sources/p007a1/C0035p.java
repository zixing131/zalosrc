package p007a1;

/* renamed from: a1.p */
/* loaded from: classes2.dex */
public class C0035p {

    /* renamed from: a */
    float f156a;

    /* renamed from: b */
    float f157b;

    /* renamed from: c */
    float f158c;

    /* renamed from: d */
    float f159d;

    /* renamed from: e */
    float f160e;

    /* renamed from: f */
    float f161f;

    /* renamed from: a */
    public void m112a(float f11, float f12, int i11, int i12, float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = (f12 - 0.5f) * 2.0f;
        float f16 = f13 + this.f158c;
        float f17 = f14 + this.f159d;
        float f18 = f16 + (this.f156a * (f11 - 0.5f) * 2.0f);
        float f19 = f17 + (this.f157b * f15);
        float radians = (float) Math.toRadians(this.f161f);
        float radians2 = (float) Math.toRadians(this.f160e);
        double d11 = radians;
        double d12 = i12 * f15;
        float sin = f18 + (((float) ((((-i11) * r7) * Math.sin(d11)) - (Math.cos(d11) * d12))) * radians2);
        float cos = f19 + (radians2 * ((float) (((i11 * r7) * Math.cos(d11)) - (d12 * Math.sin(d11)))));
        fArr[0] = sin;
        fArr[1] = cos;
    }

    /* renamed from: b */
    public void m113b() {
        this.f160e = 0.0f;
        this.f159d = 0.0f;
        this.f158c = 0.0f;
        this.f157b = 0.0f;
        this.f156a = 0.0f;
    }

    /* renamed from: c */
    public void m114c(AbstractC0024e abstractC0024e, float f11) {
        if (abstractC0024e != null) {
            this.f160e = abstractC0024e.m67b(f11);
        }
    }

    /* renamed from: d */
    public void m115d(AbstractC0029j abstractC0029j, float f11) {
        if (abstractC0029j != null) {
            this.f160e = abstractC0029j.m89b(f11);
            this.f161f = abstractC0029j.m88a(f11);
        }
    }

    /* renamed from: e */
    public void m116e(AbstractC0024e abstractC0024e, AbstractC0024e abstractC0024e2, float f11) {
        if (abstractC0024e != null) {
            this.f156a = abstractC0024e.m67b(f11);
        }
        if (abstractC0024e2 != null) {
            this.f157b = abstractC0024e2.m67b(f11);
        }
    }

    /* renamed from: f */
    public void m117f(AbstractC0029j abstractC0029j, AbstractC0029j abstractC0029j2, float f11) {
        if (abstractC0029j != null) {
            this.f156a = abstractC0029j.m89b(f11);
        }
        if (abstractC0029j2 != null) {
            this.f157b = abstractC0029j2.m89b(f11);
        }
    }

    /* renamed from: g */
    public void m118g(AbstractC0024e abstractC0024e, AbstractC0024e abstractC0024e2, float f11) {
        if (abstractC0024e != null) {
            this.f158c = abstractC0024e.m67b(f11);
        }
        if (abstractC0024e2 != null) {
            this.f159d = abstractC0024e2.m67b(f11);
        }
    }

    /* renamed from: h */
    public void m119h(AbstractC0029j abstractC0029j, AbstractC0029j abstractC0029j2, float f11) {
        if (abstractC0029j != null) {
            this.f158c = abstractC0029j.m89b(f11);
        }
        if (abstractC0029j2 != null) {
            this.f159d = abstractC0029j2.m89b(f11);
        }
    }
}
