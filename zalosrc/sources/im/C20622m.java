package im;

/* renamed from: im.m */
/* loaded from: classes3.dex */
public final class C20622m extends AbstractC20613d {

    /* renamed from: a */
    private final int f101440a;

    /* renamed from: b */
    private final int f101441b;

    public C20622m(int i11, int i12) {
        super(null);
        this.f101440a = i11;
        this.f101441b = i12;
    }

    /* renamed from: a */
    public final int m107374a() {
        return this.f101441b;
    }

    /* renamed from: b */
    public final int m107375b() {
        return this.f101440a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20622m)) {
            return false;
        }
        C20622m c20622m = (C20622m) obj;
        return this.f101440a == c20622m.f101440a && this.f101441b == c20622m.f101441b;
    }

    public int hashCode() {
        return (this.f101440a * 31) + this.f101441b;
    }

    public String toString() {
        return "StickerContent(id=" + this.f101440a + ", cateId=" + this.f101441b + ")";
    }
}
