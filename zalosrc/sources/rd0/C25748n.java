package rd0;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.n */
/* loaded from: classes4.dex */
public final class C25748n extends AbstractC25751q {

    /* renamed from: a */
    private final String f122896a;

    /* renamed from: b */
    private final String f122897b;

    /* renamed from: c */
    private final String f122898c;

    /* renamed from: d */
    private final String f122899d;

    /* renamed from: e */
    private final String f122900e;

    /* renamed from: f */
    private final int f122901f;

    /* renamed from: g */
    private final JSONObject f122902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25748n(String str, String str2, String str3, String str4, String str5, int i11, JSONObject jSONObject) {
        super(null);
        AbstractC19074t.m100208f(str, "photoUrl");
        AbstractC19074t.m100208f(str2, "thumb");
        AbstractC19074t.m100208f(str3, "photoId");
        AbstractC19074t.m100208f(str4, "fileId");
        AbstractC19074t.m100208f(str5, "partId");
        this.f122896a = str;
        this.f122897b = str2;
        this.f122898c = str3;
        this.f122899d = str4;
        this.f122900e = str5;
        this.f122901f = i11;
        this.f122902g = jSONObject;
    }

    /* renamed from: a */
    public final String m132874a() {
        return this.f122899d;
    }

    /* renamed from: b */
    public final String m132875b() {
        return this.f122900e;
    }

    /* renamed from: c */
    public final String m132876c() {
        return this.f122898c;
    }

    /* renamed from: d */
    public final JSONObject m132877d() {
        return this.f122902g;
    }

    /* renamed from: e */
    public final String m132878e() {
        return this.f122896a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25748n)) {
            return false;
        }
        C25748n c25748n = (C25748n) obj;
        return AbstractC19074t.m100204b(this.f122896a, c25748n.f122896a) && AbstractC19074t.m100204b(this.f122897b, c25748n.f122897b) && AbstractC19074t.m100204b(this.f122898c, c25748n.f122898c) && AbstractC19074t.m100204b(this.f122899d, c25748n.f122899d) && AbstractC19074t.m100204b(this.f122900e, c25748n.f122900e) && this.f122901f == c25748n.f122901f && AbstractC19074t.m100204b(this.f122902g, c25748n.f122902g);
    }

    /* renamed from: f */
    public final int m132879f() {
        return this.f122901f;
    }

    /* renamed from: g */
    public final String m132880g() {
        return this.f122897b;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f122896a.hashCode() * 31) + this.f122897b.hashCode()) * 31) + this.f122898c.hashCode()) * 31) + this.f122899d.hashCode()) * 31) + this.f122900e.hashCode()) * 31) + this.f122901f) * 31;
        JSONObject jSONObject = this.f122902g;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "UploadPhotoCommentResponse(photoUrl=" + this.f122896a + ", thumb=" + this.f122897b + ", photoId=" + this.f122898c + ", fileId=" + this.f122899d + ", partId=" + this.f122900e + ", state=" + this.f122901f + ", photoInfo=" + this.f122902g + ")";
    }
}
