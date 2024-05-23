package p110dt;

/* renamed from: dt.b */
/* loaded from: classes4.dex */
public final class C18067b {

    /* renamed from: a */
    private float f91470a;

    /* renamed from: b */
    private float f91471b;

    /* renamed from: c */
    private final float f91472c;

    /* renamed from: d */
    private final float f91473d;

    /* renamed from: e */
    private final float f91474e;

    public C18067b(float f11, float f12, float f13, float f14, float f15) {
        this.f91470a = f11;
        this.f91471b = f12;
        this.f91472c = f13;
        this.f91473d = f14;
        this.f91474e = f15;
    }

    /* renamed from: a */
    public final float m96066a() {
        return this.f91473d;
    }

    /* renamed from: b */
    public final float m96067b() {
        return this.f91474e;
    }

    /* renamed from: c */
    public final float m96068c() {
        return this.f91470a;
    }

    /* renamed from: d */
    public final float m96069d() {
        return this.f91471b;
    }

    /* renamed from: e */
    public final float m96070e() {
        return this.f91472c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18067b)) {
            return false;
        }
        C18067b c18067b = (C18067b) obj;
        return Float.compare(this.f91470a, c18067b.f91470a) == 0 && Float.compare(this.f91471b, c18067b.f91471b) == 0 && Float.compare(this.f91472c, c18067b.f91472c) == 0 && Float.compare(this.f91473d, c18067b.f91473d) == 0 && Float.compare(this.f91474e, c18067b.f91474e) == 0;
    }

    /* renamed from: f */
    public final void m96071f(float f11) {
        this.f91470a = f11;
    }

    /* renamed from: g */
    public final void m96072g(float f11) {
        this.f91471b = f11;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.f91470a) * 31) + Float.floatToIntBits(this.f91471b)) * 31) + Float.floatToIntBits(this.f91472c)) * 31) + Float.floatToIntBits(this.f91473d)) * 31) + Float.floatToIntBits(this.f91474e);
    }

    public String toString() {
        return "LineBoundary(left=" + this.f91470a + ", right=" + this.f91471b + ", top=" + this.f91472c + ", bottom=" + this.f91473d + ", delta=" + this.f91474e + ")";
    }
}
