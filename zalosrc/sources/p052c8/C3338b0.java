package p052c8;

/* renamed from: c8.b0 */
/* loaded from: classes.dex */
public final class C3338b0 {

    /* renamed from: a */
    private final Class f14159a;

    /* renamed from: b */
    private final Class f14160b;

    /* renamed from: c8.b0$a */
    /* loaded from: classes.dex */
    private @interface a {
    }

    public C3338b0(Class cls, Class cls2) {
        this.f14159a = cls;
        this.f14160b = cls2;
    }

    /* renamed from: a */
    public static C3338b0 m16815a(Class cls, Class cls2) {
        return new C3338b0(cls, cls2);
    }

    /* renamed from: b */
    public static C3338b0 m16816b(Class cls) {
        return new C3338b0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3338b0.class != obj.getClass()) {
            return false;
        }
        C3338b0 c3338b0 = (C3338b0) obj;
        if (!this.f14160b.equals(c3338b0.f14160b)) {
            return false;
        }
        return this.f14159a.equals(c3338b0.f14159a);
    }

    public int hashCode() {
        return (this.f14160b.hashCode() * 31) + this.f14159a.hashCode();
    }

    public String toString() {
        if (this.f14159a == a.class) {
            return this.f14160b.getName();
        }
        return "@" + this.f14159a.getName() + " " + this.f14160b.getName();
    }
}
