package p659xv;

import fn0.AbstractC19074t;

/* renamed from: xv.k */
/* loaded from: classes4.dex */
public final class C30212k {

    /* renamed from: a */
    private final int f140353a;

    /* renamed from: b */
    private final C30207e f140354b;

    /* renamed from: c */
    private final int f140355c;

    public C30212k(int i11, C30207e c30207e, int i12) {
        AbstractC19074t.m100208f(c30207e, "openGLES");
        this.f140353a = i11;
        this.f140354b = c30207e;
        this.f140355c = i12;
    }

    /* renamed from: a */
    public final int m148995a() {
        return this.f140353a;
    }

    /* renamed from: b */
    public final int m148996b() {
        return this.f140355c;
    }

    /* renamed from: c */
    public final C30207e m148997c() {
        return this.f140354b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30212k)) {
            return false;
        }
        C30212k c30212k = (C30212k) obj;
        return this.f140353a == c30212k.f140353a && AbstractC19074t.m100204b(this.f140354b, c30212k.f140354b) && this.f140355c == c30212k.f140355c;
    }

    public int hashCode() {
        return (((this.f140353a * 31) + this.f140354b.hashCode()) * 31) + this.f140355c;
    }

    public String toString() {
        return "MPRequirement(apiLevel=" + this.f140353a + ", openGLES=" + this.f140354b + ", deviceTier=" + this.f140355c + ")";
    }
}
