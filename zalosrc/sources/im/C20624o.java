package im;

/* renamed from: im.o */
/* loaded from: classes3.dex */
public final class C20624o extends AbstractC20613d {

    /* renamed from: a */
    private final int f101446a;

    /* renamed from: b */
    private final int f101447b;

    /* renamed from: c */
    private final float f101448c;

    public C20624o(int i11, int i12, float f11) {
        super(null);
        this.f101446a = i11;
        this.f101447b = i12;
        this.f101448c = f11;
    }

    /* renamed from: a */
    public final int m107380a() {
        return this.f101446a;
    }

    /* renamed from: b */
    public final int m107381b() {
        return this.f101447b;
    }

    /* renamed from: c */
    public final float m107382c() {
        return this.f101448c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20624o)) {
            return false;
        }
        C20624o c20624o = (C20624o) obj;
        return this.f101446a == c20624o.f101446a && this.f101447b == c20624o.f101447b && Float.compare(this.f101448c, c20624o.f101448c) == 0;
    }

    public int hashCode() {
        return (((this.f101446a * 31) + this.f101447b) * 31) + Float.floatToIntBits(this.f101448c);
    }

    public String toString() {
        return "VideoLoopingContent(loop=" + this.f101446a + ", reverse=" + this.f101447b + ", speed=" + this.f101448c + ")";
    }
}
