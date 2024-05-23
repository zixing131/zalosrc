package p107dq;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: dq.g */
/* loaded from: classes4.dex */
public final class C18051g {

    /* renamed from: a */
    private final int f91341a;

    /* renamed from: b */
    private final int f91342b;

    /* renamed from: c */
    private final String f91343c;

    /* renamed from: d */
    private final int f91344d;

    /* renamed from: e */
    private final int f91345e;

    /* renamed from: f */
    private final int f91346f;

    /* renamed from: g */
    private final int f91347g;

    /* renamed from: h */
    private boolean f91348h;

    public C18051g(int i11, int i12, String str, int i13, int i14, int i15, int i16, boolean z11) {
        AbstractC19074t.m100208f(str, "layoutName");
        this.f91341a = i11;
        this.f91342b = i12;
        this.f91343c = str;
        this.f91344d = i13;
        this.f91345e = i14;
        this.f91346f = i15;
        this.f91347g = i16;
        this.f91348h = z11;
    }

    /* renamed from: a */
    public final int m95935a() {
        return this.f91347g;
    }

    /* renamed from: b */
    public final int m95936b() {
        return this.f91344d;
    }

    /* renamed from: c */
    public final int m95937c() {
        return this.f91346f;
    }

    /* renamed from: d */
    public final int m95938d() {
        return this.f91345e;
    }

    /* renamed from: e */
    public final int m95939e() {
        return this.f91341a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18051g)) {
            return false;
        }
        C18051g c18051g = (C18051g) obj;
        return this.f91341a == c18051g.f91341a && this.f91342b == c18051g.f91342b && AbstractC19074t.m100204b(this.f91343c, c18051g.f91343c) && this.f91344d == c18051g.f91344d && this.f91345e == c18051g.f91345e && this.f91346f == c18051g.f91346f && this.f91347g == c18051g.f91347g && this.f91348h == c18051g.f91348h;
    }

    /* renamed from: f */
    public final String m95940f() {
        return this.f91343c;
    }

    /* renamed from: g */
    public final boolean m95941g() {
        return this.f91348h;
    }

    /* renamed from: h */
    public final void m95942h(boolean z11) {
        this.f91348h = z11;
    }

    public int hashCode() {
        return (((((((((((((this.f91341a * 31) + this.f91342b) * 31) + this.f91343c.hashCode()) * 31) + this.f91344d) * 31) + this.f91345e) * 31) + this.f91346f) * 31) + this.f91347g) * 31) + AbstractC2144f.m11520a(this.f91348h);
    }

    public String toString() {
        return "LayoutDataItem(layoutId=" + this.f91341a + ", themeId=" + this.f91342b + ", layoutName=" + this.f91343c + ", iconId=" + this.f91344d + ", iconTint=" + this.f91345e + ", iconPadding=" + this.f91346f + ", backgroundId=" + this.f91347g + ", isSelected=" + this.f91348h + ")";
    }
}
