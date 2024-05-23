package bo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: bo.m */
/* loaded from: classes4.dex */
public final class C3004m {

    /* renamed from: a */
    private int f11963a;

    /* renamed from: b */
    private String f11964b;

    /* renamed from: c */
    private String f11965c;

    /* renamed from: d */
    private final boolean f11966d;

    /* renamed from: e */
    private boolean f11967e;

    /* renamed from: f */
    private int f11968f;

    /* renamed from: g */
    private boolean f11969g;

    /* renamed from: h */
    private String f11970h;

    public C3004m(int i11, String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        this.f11963a = i11;
        this.f11964b = str;
        this.f11965c = str2;
        this.f11966d = z11;
        this.f11970h = "";
    }

    /* renamed from: a */
    public final String m14400a() {
        return this.f11965c;
    }

    /* renamed from: b */
    public final boolean m14401b() {
        return this.f11967e;
    }

    /* renamed from: c */
    public final boolean m14402c() {
        return this.f11969g;
    }

    /* renamed from: d */
    public final int m14403d() {
        return this.f11968f;
    }

    /* renamed from: e */
    public final String m14404e() {
        return this.f11970h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3004m)) {
            return false;
        }
        C3004m c3004m = (C3004m) obj;
        return this.f11963a == c3004m.f11963a && AbstractC19074t.m100204b(this.f11964b, c3004m.f11964b) && AbstractC19074t.m100204b(this.f11965c, c3004m.f11965c) && this.f11966d == c3004m.f11966d;
    }

    /* renamed from: f */
    public final String m14405f() {
        return this.f11964b;
    }

    /* renamed from: g */
    public final int m14406g() {
        return this.f11963a;
    }

    /* renamed from: h */
    public final boolean m14407h() {
        return this.f11966d;
    }

    public int hashCode() {
        return (((((this.f11963a * 31) + this.f11964b.hashCode()) * 31) + this.f11965c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f11966d);
    }

    /* renamed from: i */
    public final void m14408i(int i11) {
        this.f11968f = i11;
        this.f11967e = true;
    }

    /* renamed from: j */
    public final void m14409j(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f11970h = str;
        this.f11969g = true;
    }

    public String toString() {
        return "AlbumRowSelectInfo(type=" + this.f11963a + ", title=" + this.f11964b + ", desc=" + this.f11965c + ", isVisibleLineBottom=" + this.f11966d + ")";
    }
}
