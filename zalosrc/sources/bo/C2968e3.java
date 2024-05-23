package bo;

/* renamed from: bo.e3 */
/* loaded from: classes4.dex */
public final class C2968e3 {

    /* renamed from: a */
    private int f11732a;

    /* renamed from: b */
    private final int f11733b;

    public C2968e3(int i11, int i12) {
        this.f11732a = i11;
        this.f11733b = i12;
    }

    /* renamed from: a */
    public final int m14043a() {
        return this.f11733b;
    }

    /* renamed from: b */
    public final int m14044b() {
        return this.f11732a;
    }

    /* renamed from: c */
    public final void m14045c(int i11) {
        this.f11732a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2968e3)) {
            return false;
        }
        C2968e3 c2968e3 = (C2968e3) obj;
        return this.f11732a == c2968e3.f11732a && this.f11733b == c2968e3.f11733b;
    }

    public int hashCode() {
        return (this.f11732a * 31) + this.f11733b;
    }

    public String toString() {
        return "SpacingDividerData(height=" + this.f11732a + ", colorAttrsRes=" + this.f11733b + ")";
    }
}
