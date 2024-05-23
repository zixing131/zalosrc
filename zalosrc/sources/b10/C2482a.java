package b10;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: b10.a */
/* loaded from: classes5.dex */
public final class C2482a {

    /* renamed from: a */
    private final String f10127a;

    /* renamed from: b */
    private final String f10128b;

    /* renamed from: c */
    private final String f10129c;

    /* renamed from: d */
    private final String f10130d;

    /* renamed from: e */
    private final String f10131e;

    /* renamed from: f */
    private final List f10132f;

    /* renamed from: g */
    private boolean f10133g;

    public C2482a(String str, String str2, String str3, String str4, String str5, List list, boolean z11) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "ownerName");
        AbstractC19074t.m100208f(str3, "ownerAvatar");
        this.f10127a = str;
        this.f10128b = str2;
        this.f10129c = str3;
        this.f10130d = str4;
        this.f10131e = str5;
        this.f10132f = list;
        this.f10133g = z11;
    }

    /* renamed from: a */
    public final List m12535a() {
        return this.f10132f;
    }

    /* renamed from: b */
    public final String m12536b() {
        return this.f10131e;
    }

    /* renamed from: c */
    public final String m12537c() {
        return this.f10129c;
    }

    /* renamed from: d */
    public final String m12538d() {
        return this.f10127a;
    }

    /* renamed from: e */
    public final String m12539e() {
        return this.f10128b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2482a)) {
            return false;
        }
        C2482a c2482a = (C2482a) obj;
        return AbstractC19074t.m100204b(this.f10127a, c2482a.f10127a) && AbstractC19074t.m100204b(this.f10128b, c2482a.f10128b) && AbstractC19074t.m100204b(this.f10129c, c2482a.f10129c) && AbstractC19074t.m100204b(this.f10130d, c2482a.f10130d) && AbstractC19074t.m100204b(this.f10131e, c2482a.f10131e) && AbstractC19074t.m100204b(this.f10132f, c2482a.f10132f) && this.f10133g == c2482a.f10133g;
    }

    /* renamed from: f */
    public final String m12540f() {
        return this.f10130d;
    }

    /* renamed from: g */
    public final boolean m12541g() {
        return this.f10133g;
    }

    /* renamed from: h */
    public final void m12542h(boolean z11) {
        this.f10133g = z11;
    }

    public int hashCode() {
        int hashCode = ((((this.f10127a.hashCode() * 31) + this.f10128b.hashCode()) * 31) + this.f10129c.hashCode()) * 31;
        String str = this.f10130d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10131e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f10132f;
        return ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f10133g);
    }

    public String toString() {
        return "DescComment(ownerId=" + this.f10127a + ", ownerName=" + this.f10128b + ", ownerAvatar=" + this.f10129c + ", verifiedIcon=" + this.f10130d + ", description=" + this.f10131e + ", ctaItem=" + this.f10132f + ", isExpand=" + this.f10133g + ")";
    }
}
