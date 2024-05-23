package p052c8;

/* renamed from: c8.r */
/* loaded from: classes.dex */
public final class C3355r {

    /* renamed from: a */
    private final C3338b0 f14213a;

    /* renamed from: b */
    private final int f14214b;

    /* renamed from: c */
    private final int f14215c;

    private C3355r(Class cls, int i11, int i12) {
        this(C3338b0.m16816b(cls), i11, i12);
    }

    /* renamed from: a */
    public static C3355r m16904a(Class cls) {
        return new C3355r(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m16905b(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i11);
            }
            return "provider";
        }
        return "direct";
    }

    /* renamed from: h */
    public static C3355r m16906h(Class cls) {
        return new C3355r(cls, 0, 0);
    }

    /* renamed from: i */
    public static C3355r m16907i(Class cls) {
        return new C3355r(cls, 0, 1);
    }

    /* renamed from: j */
    public static C3355r m16908j(C3338b0 c3338b0) {
        return new C3355r(c3338b0, 1, 0);
    }

    /* renamed from: k */
    public static C3355r m16909k(Class cls) {
        return new C3355r(cls, 1, 0);
    }

    /* renamed from: l */
    public static C3355r m16910l(Class cls) {
        return new C3355r(cls, 1, 1);
    }

    /* renamed from: m */
    public static C3355r m16911m(Class cls) {
        return new C3355r(cls, 2, 0);
    }

    /* renamed from: c */
    public C3338b0 m16912c() {
        return this.f14213a;
    }

    /* renamed from: d */
    public boolean m16913d() {
        return this.f14215c == 2;
    }

    /* renamed from: e */
    public boolean m16914e() {
        return this.f14215c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3355r)) {
            return false;
        }
        C3355r c3355r = (C3355r) obj;
        if (!this.f14213a.equals(c3355r.f14213a) || this.f14214b != c3355r.f14214b || this.f14215c != c3355r.f14215c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m16915f() {
        return this.f14214b == 1;
    }

    /* renamed from: g */
    public boolean m16916g() {
        return this.f14214b == 2;
    }

    public int hashCode() {
        return ((((this.f14213a.hashCode() ^ 1000003) * 1000003) ^ this.f14214b) * 1000003) ^ this.f14215c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f14213a);
        sb2.append(", type=");
        int i11 = this.f14214b;
        if (i11 == 1) {
            str = "required";
        } else if (i11 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(m16905b(this.f14215c));
        sb2.append("}");
        return sb2.toString();
    }

    private C3355r(C3338b0 c3338b0, int i11, int i12) {
        this.f14213a = (C3338b0) AbstractC3336a0.m16813c(c3338b0, "Null dependency anInterface.");
        this.f14214b = i11;
        this.f14215c = i12;
    }
}
