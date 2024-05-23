package p137eo;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: eo.j */
/* loaded from: classes4.dex */
public final class C18526j {

    /* renamed from: a */
    private final String f93198a;

    /* renamed from: b */
    private final int f93199b;

    /* renamed from: c */
    private final long f93200c;

    public C18526j(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, "viewerId");
        this.f93198a = str;
        this.f93199b = i11;
        this.f93200c = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18526j)) {
            return false;
        }
        C18526j c18526j = (C18526j) obj;
        return AbstractC19074t.m100204b(this.f93198a, c18526j.f93198a) && this.f93199b == c18526j.f93199b && this.f93200c == c18526j.f93200c;
    }

    public int hashCode() {
        return (((this.f93198a.hashCode() * 31) + this.f93199b) * 31) + AbstractC2147g0.m11521a(this.f93200c);
    }

    public String toString() {
        return "RequestDetailAlbumParam(viewerId=" + this.f93198a + ", albumType=" + this.f93199b + ", albumId=" + this.f93200c + ")";
    }
}
