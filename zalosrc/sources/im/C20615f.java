package im;

import fn0.AbstractC19074t;

/* renamed from: im.f */
/* loaded from: classes3.dex */
public final class C20615f extends AbstractC20613d {

    /* renamed from: a */
    private final String f101388a;

    /* renamed from: b */
    private final int f101389b;

    /* renamed from: c */
    private final int f101390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20615f(String str, int i11, int i12) {
        super(null);
        AbstractC19074t.m100208f(str, "colorPos");
        this.f101388a = str;
        this.f101389b = i11;
        this.f101390c = i12;
    }

    /* renamed from: a */
    public final String m107308a() {
        return this.f101388a;
    }

    /* renamed from: b */
    public final int m107309b() {
        return this.f101389b;
    }

    /* renamed from: c */
    public final int m107310c() {
        return this.f101390c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20615f)) {
            return false;
        }
        C20615f c20615f = (C20615f) obj;
        return AbstractC19074t.m100204b(this.f101388a, c20615f.f101388a) && this.f101389b == c20615f.f101389b && this.f101390c == c20615f.f101390c;
    }

    public int hashCode() {
        return (((this.f101388a.hashCode() * 31) + this.f101389b) * 31) + this.f101390c;
    }

    public String toString() {
        return "DoodleContent(colorPos=" + this.f101388a + ", size=" + this.f101389b + ", type=" + this.f101390c + ")";
    }
}
