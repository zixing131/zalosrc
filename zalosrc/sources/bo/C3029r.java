package bo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import p426pp.C24901d;

/* renamed from: bo.r */
/* loaded from: classes4.dex */
public final class C3029r {

    /* renamed from: a */
    private C24901d f12198a;

    /* renamed from: b */
    private String f12199b;

    /* renamed from: c */
    private String f12200c;

    /* renamed from: d */
    private boolean f12201d;

    /* renamed from: bo.r$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3058y {

        /* renamed from: a */
        private final C3029r f12202a;

        public a(C3029r c3029r) {
            AbstractC19074t.m100208f(c3029r, "categoryData");
            this.f12202a = c3029r;
        }

        /* renamed from: a */
        public final C3029r m14583a() {
            return this.f12202a;
        }
    }

    public C3029r(C24901d c24901d, String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(c24901d, "songCategory");
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "icon");
        this.f12198a = c24901d;
        this.f12199b = str;
        this.f12200c = str2;
        this.f12201d = z11;
    }

    /* renamed from: a */
    public final String m14579a() {
        return this.f12200c;
    }

    /* renamed from: b */
    public final C24901d m14580b() {
        return this.f12198a;
    }

    /* renamed from: c */
    public final String m14581c() {
        return this.f12199b;
    }

    /* renamed from: d */
    public final boolean m14582d() {
        return this.f12201d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3029r)) {
            return false;
        }
        C3029r c3029r = (C3029r) obj;
        return AbstractC19074t.m100204b(this.f12198a, c3029r.f12198a) && AbstractC19074t.m100204b(this.f12199b, c3029r.f12199b) && AbstractC19074t.m100204b(this.f12200c, c3029r.f12200c) && this.f12201d == c3029r.f12201d;
    }

    public int hashCode() {
        return (((((this.f12198a.hashCode() * 31) + this.f12199b.hashCode()) * 31) + this.f12200c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f12201d);
    }

    public String toString() {
        return "CategoryData(songCategory=" + this.f12198a + ", title=" + this.f12199b + ", icon=" + this.f12200c + ", isSelected=" + this.f12201d + ")";
    }
}
