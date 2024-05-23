package is;

import bo.C3000l0;
import h40.AbstractC19849s1;
import me0.AbstractC23222t7;

/* renamed from: is.j */
/* loaded from: classes4.dex */
public final class C20801j {

    /* renamed from: a */
    public static final C20801j f102224a = new C20801j();

    private C20801j() {
    }

    /* renamed from: a */
    public static final int m108533a() {
        return AbstractC23222t7.f112534M;
    }

    /* renamed from: b */
    public static final int m108534b() {
        return m108540h() - (m108533a() * 2);
    }

    /* renamed from: c */
    public static final int m108535c() {
        return m108540h() - (m108533a() * 2);
    }

    /* renamed from: d */
    public static final int m108536d(C3000l0 c3000l0) {
        if (c3000l0 != null) {
            if (c3000l0.f11893p == 2) {
                if (c3000l0.f11899s.size() == 1) {
                    return m108539g();
                }
                return m108534b();
            }
            return m108540h();
        }
        return 0;
    }

    /* renamed from: e */
    public static final int m108537e() {
        return AbstractC23222t7.f112576o;
    }

    /* renamed from: f */
    public static final float m108538f() {
        return (((m108534b() + m108533a()) + m108537e()) * 1.0f) / m108540h();
    }

    /* renamed from: g */
    public static final int m108539g() {
        return m108540h() - (m108537e() * 2);
    }

    /* renamed from: h */
    public static final int m108540h() {
        return AbstractC19849s1.m103552d().x;
    }
}
