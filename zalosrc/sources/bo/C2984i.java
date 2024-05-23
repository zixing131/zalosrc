package bo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: bo.i */
/* loaded from: classes4.dex */
public final class C2984i {

    /* renamed from: a */
    private String f11793a;

    /* renamed from: b */
    private String f11794b;

    /* renamed from: c */
    private final boolean f11795c;

    /* renamed from: d */
    private int f11796d;

    public C2984i(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19074t.m100208f(str2, "hint");
        this.f11793a = str;
        this.f11794b = str2;
        this.f11795c = z11;
        this.f11796d = 50;
    }

    /* renamed from: a */
    public final String m14147a() {
        return this.f11794b;
    }

    /* renamed from: b */
    public final String m14148b() {
        return this.f11793a;
    }

    /* renamed from: c */
    public final int m14149c() {
        return this.f11796d;
    }

    /* renamed from: d */
    public final boolean m14150d() {
        return this.f11795c;
    }

    /* renamed from: e */
    public final void m14151e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11793a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2984i)) {
            return false;
        }
        C2984i c2984i = (C2984i) obj;
        return AbstractC19074t.m100204b(this.f11793a, c2984i.f11793a) && AbstractC19074t.m100204b(this.f11794b, c2984i.f11794b) && this.f11795c == c2984i.f11795c;
    }

    /* renamed from: f */
    public final void m14152f(int i11) {
        this.f11796d = i11;
    }

    public int hashCode() {
        return (((this.f11793a.hashCode() * 31) + this.f11794b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f11795c);
    }

    public String toString() {
        return "AlbumRowInputData(text=" + this.f11793a + ", hint=" + this.f11794b + ", isVisibleLineBottom=" + this.f11795c + ")";
    }

    public /* synthetic */ C2984i(String str, String str2, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? true : z11);
    }
}
