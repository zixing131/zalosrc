package rd0;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import me0.AbstractC23008a2;
import org.json.JSONObject;

/* renamed from: rd0.e */
/* loaded from: classes4.dex */
public final class C25739e extends AbstractC25751q {

    /* renamed from: a */
    private final String f122873a;

    /* renamed from: b */
    private final String f122874b;

    /* renamed from: c */
    private final String f122875c;

    /* renamed from: d */
    private final long f122876d;

    /* renamed from: e */
    private final long f122877e;

    /* renamed from: f */
    private final long f122878f;

    /* renamed from: g */
    private final JSONObject f122879g;

    /* renamed from: h */
    private final String f122880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25739e(String str, String str2, String str3, long j11, long j12, long j13, JSONObject jSONObject, String str4) {
        super(null);
        AbstractC19074t.m100208f(str, "_url");
        AbstractC19074t.m100208f(str2, "_thumb");
        AbstractC19074t.m100208f(str3, "_hdUrl");
        AbstractC19074t.m100208f(jSONObject, "photoInfo");
        AbstractC19074t.m100208f(str4, "convertible");
        this.f122873a = str;
        this.f122874b = str2;
        this.f122875c = str3;
        this.f122876d = j11;
        this.f122877e = j12;
        this.f122878f = j13;
        this.f122879g = jSONObject;
        this.f122880h = str4;
    }

    /* renamed from: a */
    public final String m132854a() {
        return this.f122880h;
    }

    /* renamed from: b */
    public final long m132855b() {
        return this.f122876d;
    }

    /* renamed from: c */
    public final long m132856c() {
        return this.f122877e;
    }

    /* renamed from: d */
    public final String m132857d() {
        return AbstractC23008a2.m117937f(this.f122875c, this.f122880h);
    }

    /* renamed from: e */
    public final JSONObject m132858e() {
        return this.f122879g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25739e)) {
            return false;
        }
        C25739e c25739e = (C25739e) obj;
        return AbstractC19074t.m100204b(this.f122873a, c25739e.f122873a) && AbstractC19074t.m100204b(this.f122874b, c25739e.f122874b) && AbstractC19074t.m100204b(this.f122875c, c25739e.f122875c) && this.f122876d == c25739e.f122876d && this.f122877e == c25739e.f122877e && this.f122878f == c25739e.f122878f && AbstractC19074t.m100204b(this.f122879g, c25739e.f122879g) && AbstractC19074t.m100204b(this.f122880h, c25739e.f122880h);
    }

    /* renamed from: f */
    public final String m132859f() {
        return AbstractC23008a2.m117937f(this.f122874b, this.f122880h);
    }

    /* renamed from: g */
    public final long m132860g() {
        return this.f122878f;
    }

    /* renamed from: h */
    public final String m132861h() {
        return AbstractC23008a2.m117937f(this.f122873a, this.f122880h);
    }

    public int hashCode() {
        return (((((((((((((this.f122873a.hashCode() * 31) + this.f122874b.hashCode()) * 31) + this.f122875c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f122876d)) * 31) + AbstractC2147g0.m11521a(this.f122877e)) * 31) + AbstractC2147g0.m11521a(this.f122878f)) * 31) + this.f122879g.hashCode()) * 31) + this.f122880h.hashCode();
    }

    public String toString() {
        return "UploadChatPhotoResponse(_url=" + this.f122873a + ", _thumb=" + this.f122874b + ", _hdUrl=" + this.f122875c + ", fileSize=" + this.f122876d + ", hdSize=" + this.f122877e + ", thumbSize=" + this.f122878f + ", photoInfo=" + this.f122879g + ", convertible=" + this.f122880h + ")";
    }
}
