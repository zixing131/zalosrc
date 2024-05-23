package com.google.android.material.bottomappbar;

import p706z6.C31687f;
import p706z6.C31696o;

/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes3.dex */
public class C6252a extends C31687f implements Cloneable {

    /* renamed from: p */
    private float f34941p;

    /* renamed from: q */
    private float f34942q;

    /* renamed from: r */
    private float f34943r;

    /* renamed from: s */
    private float f34944s;

    /* renamed from: t */
    private float f34945t;

    /* renamed from: u */
    private float f34946u = -1.0f;

    public C6252a(float f11, float f12, float f13) {
        this.f34942q = f11;
        this.f34941p = f12;
        m31813j(f13);
        this.f34945t = 0.0f;
    }

    @Override // p706z6.C31687f
    /* renamed from: b */
    public void mo31806b(float f11, float f12, float f13, C31696o c31696o) {
        boolean z11;
        float f14;
        float f15;
        float f16 = this.f34943r;
        if (f16 == 0.0f) {
            c31696o.m152564m(f11, 0.0f);
            return;
        }
        float f17 = ((this.f34942q * 2.0f) + f16) / 2.0f;
        float f18 = f13 * this.f34941p;
        float f19 = f12 + this.f34945t;
        float f21 = (this.f34944s * f13) + ((1.0f - f13) * f17);
        if (f21 / f17 >= 1.0f) {
            c31696o.m152564m(f11, 0.0f);
            return;
        }
        float f22 = this.f34946u;
        float f23 = f22 * f13;
        if (f22 != -1.0f && Math.abs((f22 * 2.0f) - f16) >= 0.1f) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            f15 = 1.75f;
            f14 = 0.0f;
        } else {
            f14 = f21;
            f15 = 0.0f;
        }
        float f24 = f17 + f18;
        float f25 = f14 + f18;
        float sqrt = (float) Math.sqrt((f24 * f24) - (f25 * f25));
        float f26 = f19 - sqrt;
        float f27 = f19 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f25));
        float f28 = (90.0f - degrees) + f15;
        c31696o.m152564m(f26, 0.0f);
        float f29 = f18 * 2.0f;
        c31696o.m152556a(f26 - f18, 0.0f, f26 + f18, f29, 270.0f, degrees);
        if (z11) {
            c31696o.m152556a(f19 - f17, (-f17) - f14, f19 + f17, f17 - f14, 180.0f - f28, (f28 * 2.0f) - 180.0f);
        } else {
            float f31 = this.f34942q;
            float f32 = f23 * 2.0f;
            float f33 = f19 - f17;
            c31696o.m152556a(f33, -(f23 + f31), f33 + f31 + f32, f31 + f23, 180.0f - f28, ((f28 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f19 + f17;
            float f35 = this.f34942q;
            c31696o.m152564m(f34 - ((f35 / 2.0f) + f23), f35 + f23);
            float f36 = this.f34942q;
            c31696o.m152556a(f34 - (f32 + f36), -(f23 + f36), f34, f36 + f23, 90.0f, f28 - 90.0f);
        }
        c31696o.m152556a(f27 - f18, 0.0f, f27 + f18, f29, 270.0f - degrees, degrees);
        c31696o.m152564m(f11, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m31807c() {
        return this.f34944s;
    }

    /* renamed from: e */
    public float m31808e() {
        return this.f34946u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m31809f() {
        return this.f34942q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m31810g() {
        return this.f34941p;
    }

    /* renamed from: h */
    public float m31811h() {
        return this.f34943r;
    }

    /* renamed from: i */
    public float m31812i() {
        return this.f34945t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m31813j(float f11) {
        if (f11 >= 0.0f) {
            this.f34944s = f11;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: k */
    public void m31814k(float f11) {
        this.f34946u = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m31815l(float f11) {
        this.f34942q = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m31816m(float f11) {
        this.f34941p = f11;
    }

    /* renamed from: n */
    public void m31817n(float f11) {
        this.f34943r = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m31818o(float f11) {
        this.f34945t = f11;
    }
}
