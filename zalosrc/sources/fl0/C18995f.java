package fl0;

import fn0.AbstractC19074t;
import ik0.AbstractC20596s;

/* renamed from: fl0.f */
/* loaded from: classes7.dex */
public final class C18995f {

    /* renamed from: a */
    private final int f94817a;

    /* renamed from: b */
    private final String f94818b;

    /* renamed from: c */
    private final String f94819c;

    /* renamed from: d */
    private final String f94820d;

    /* renamed from: e */
    private final String f94821e;

    /* renamed from: f */
    private final String f94822f;

    /* renamed from: g */
    private final String f94823g;

    /* renamed from: h */
    private final AbstractC20596s.b f94824h;

    public C18995f(int i11, String str, String str2, String str3, String str4, String str5, String str6, AbstractC20596s.b bVar) {
        AbstractC19074t.m100208f(str, "zinstantDataId");
        AbstractC19074t.m100208f(str5, "resourceChecksum");
        this.f94817a = i11;
        this.f94818b = str;
        this.f94819c = str2;
        this.f94820d = str3;
        this.f94821e = str4;
        this.f94822f = str5;
        this.f94823g = str6;
        this.f94824h = bVar;
    }

    /* renamed from: a */
    public final String m99731a() {
        return this.f94823g;
    }

    /* renamed from: b */
    public final String m99732b() {
        return this.f94820d;
    }

    /* renamed from: c */
    public final AbstractC20596s.b m99733c() {
        return this.f94824h;
    }

    /* renamed from: d */
    public final int m99734d() {
        return this.f94817a;
    }

    /* renamed from: e */
    public final String m99735e() {
        return this.f94819c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18995f)) {
            return false;
        }
        C18995f c18995f = (C18995f) obj;
        return this.f94817a == c18995f.f94817a && AbstractC19074t.m100204b(this.f94818b, c18995f.f94818b) && AbstractC19074t.m100204b(this.f94819c, c18995f.f94819c) && AbstractC19074t.m100204b(this.f94820d, c18995f.f94820d) && AbstractC19074t.m100204b(this.f94821e, c18995f.f94821e) && AbstractC19074t.m100204b(this.f94822f, c18995f.f94822f) && AbstractC19074t.m100204b(this.f94823g, c18995f.f94823g) && AbstractC19074t.m100204b(this.f94824h, c18995f.f94824h);
    }

    /* renamed from: f */
    public final String m99736f() {
        return this.f94822f;
    }

    /* renamed from: g */
    public final String m99737g() {
        return this.f94821e;
    }

    /* renamed from: h */
    public final String m99738h() {
        return this.f94818b;
    }

    public int hashCode() {
        int hashCode = ((this.f94817a * 31) + this.f94818b.hashCode()) * 31;
        String str = this.f94819c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94820d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94821e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f94822f.hashCode()) * 31;
        String str4 = this.f94823g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC20596s.b bVar = this.f94824h;
        return hashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "RequestInfo(feature=" + this.f94817a + ", zinstantDataId=" + this.f94818b + ", identifyKey=" + this.f94819c + ", customPath=" + this.f94820d + ", resourceUrl=" + this.f94821e + ", resourceChecksum=" + this.f94822f + ", bundleData=" + this.f94823g + ", extraData=" + this.f94824h + ')';
    }
}
