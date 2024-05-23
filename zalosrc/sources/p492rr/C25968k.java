package p492rr;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: rr.k */
/* loaded from: classes4.dex */
public final class C25968k {

    /* renamed from: a */
    private boolean f123895a;

    /* renamed from: b */
    private String f123896b;

    /* renamed from: c */
    private String f123897c;

    /* renamed from: d */
    private boolean f123898d;

    /* renamed from: e */
    private int f123899e;

    public C25968k(boolean z11, String str, String str2, boolean z12, int i11) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "description");
        this.f123895a = z11;
        this.f123896b = str;
        this.f123897c = str2;
        this.f123898d = z12;
        this.f123899e = i11;
    }

    /* renamed from: b */
    public static /* synthetic */ C25968k m133741b(C25968k c25968k, boolean z11, String str, String str2, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = c25968k.f123895a;
        }
        if ((i12 & 2) != 0) {
            str = c25968k.f123896b;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = c25968k.f123897c;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            z12 = c25968k.f123898d;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            i11 = c25968k.f123899e;
        }
        return c25968k.m133742a(z11, str3, str4, z13, i11);
    }

    /* renamed from: a */
    public final C25968k m133742a(boolean z11, String str, String str2, boolean z12, int i11) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "description");
        return new C25968k(z11, str, str2, z12, i11);
    }

    /* renamed from: c */
    public final String m133743c() {
        return this.f123897c;
    }

    /* renamed from: d */
    public final boolean m133744d() {
        return this.f123898d;
    }

    /* renamed from: e */
    public final String m133745e() {
        return this.f123896b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25968k)) {
            return false;
        }
        C25968k c25968k = (C25968k) obj;
        return this.f123895a == c25968k.f123895a && AbstractC19074t.m100204b(this.f123896b, c25968k.f123896b) && AbstractC19074t.m100204b(this.f123897c, c25968k.f123897c) && this.f123898d == c25968k.f123898d && this.f123899e == c25968k.f123899e;
    }

    /* renamed from: f */
    public final int m133746f() {
        return this.f123899e;
    }

    /* renamed from: g */
    public final boolean m133747g() {
        return this.f123895a;
    }

    /* renamed from: h */
    public final void m133748h(boolean z11) {
        this.f123895a = z11;
    }

    public int hashCode() {
        return (((((((AbstractC2144f.m11520a(this.f123895a) * 31) + this.f123896b.hashCode()) * 31) + this.f123897c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f123898d)) * 31) + this.f123899e;
    }

    /* renamed from: i */
    public final void m133749i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f123897c = str;
    }

    public String toString() {
        return "FeedVisibleTimeLimitOptionsData(isChecked=" + this.f123895a + ", title=" + this.f123896b + ", description=" + this.f123897c + ", hasMoreIcon=" + this.f123898d + ", type=" + this.f123899e + ")";
    }

    public /* synthetic */ C25968k(boolean z11, String str, String str2, boolean z12, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? "" : str, (i12 & 4) == 0 ? str2 : "", (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? 0 : i11);
    }
}
