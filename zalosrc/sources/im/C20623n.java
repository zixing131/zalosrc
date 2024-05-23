package im;

/* renamed from: im.n */
/* loaded from: classes3.dex */
public final class C20623n extends AbstractC20613d {

    /* renamed from: a */
    private final int f101442a;

    /* renamed from: b */
    private final int f101443b;

    /* renamed from: c */
    private final int f101444c;

    /* renamed from: d */
    private final int f101445d;

    public C20623n(int i11, int i12, int i13, int i14) {
        super(null);
        this.f101442a = i11;
        this.f101443b = i12;
        this.f101444c = i13;
        this.f101445d = i14;
    }

    /* renamed from: a */
    public final int m107376a() {
        return this.f101442a;
    }

    /* renamed from: b */
    public final int m107377b() {
        return this.f101445d;
    }

    /* renamed from: c */
    public final int m107378c() {
        return this.f101443b;
    }

    /* renamed from: d */
    public final int m107379d() {
        return this.f101444c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20623n)) {
            return false;
        }
        C20623n c20623n = (C20623n) obj;
        return this.f101442a == c20623n.f101442a && this.f101443b == c20623n.f101443b && this.f101444c == c20623n.f101444c && this.f101445d == c20623n.f101445d;
    }

    public int hashCode() {
        return (((((this.f101442a * 31) + this.f101443b) * 31) + this.f101444c) * 31) + this.f101445d;
    }

    public String toString() {
        return "TextContent(alignMode=" + this.f101442a + ", color=" + this.f101443b + ", fontId=" + this.f101444c + ", captionMode=" + this.f101445d + ")";
    }
}
