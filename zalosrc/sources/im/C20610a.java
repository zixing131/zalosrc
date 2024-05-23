package im;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: im.a */
/* loaded from: classes3.dex */
public final class C20610a extends AbstractC20613d {

    /* renamed from: a */
    private final String f101356a;

    /* renamed from: b */
    private final String f101357b;

    /* renamed from: c */
    private final boolean f101358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20610a(String str, String str2, boolean z11) {
        super(null);
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "cateId");
        this.f101356a = str;
        this.f101357b = str2;
        this.f101358c = z11;
    }

    /* renamed from: a */
    public final String m107252a() {
        return this.f101357b;
    }

    /* renamed from: b */
    public final String m107253b() {
        return this.f101356a;
    }

    /* renamed from: c */
    public final boolean m107254c() {
        return this.f101358c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20610a)) {
            return false;
        }
        C20610a c20610a = (C20610a) obj;
        return AbstractC19074t.m100204b(this.f101356a, c20610a.f101356a) && AbstractC19074t.m100204b(this.f101357b, c20610a.f101357b) && this.f101358c == c20610a.f101358c;
    }

    public int hashCode() {
        return (((this.f101356a.hashCode() * 31) + this.f101357b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f101358c);
    }

    public String toString() {
        return "AnimFilterContent(id=" + this.f101356a + ", cateId=" + this.f101357b + ", promoted=" + this.f101358c + ")";
    }
}
