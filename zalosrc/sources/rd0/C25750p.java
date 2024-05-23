package rd0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.p */
/* loaded from: classes4.dex */
public final class C25750p extends AbstractC25751q {

    /* renamed from: a */
    private final String f122907a;

    /* renamed from: b */
    private final String f122908b;

    /* renamed from: c */
    private final String f122909c;

    /* renamed from: d */
    private final JSONObject f122910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25750p(String str, String str2, String str3, JSONObject jSONObject) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "thumb");
        AbstractC19074t.m100208f(str3, "hdUrl");
        AbstractC19074t.m100208f(jSONObject, "photoInfo");
        this.f122907a = str;
        this.f122908b = str2;
        this.f122909c = str3;
        this.f122910d = jSONObject;
    }

    /* renamed from: a */
    public final String m132882a() {
        return this.f122909c;
    }

    /* renamed from: b */
    public final JSONObject m132883b() {
        return this.f122910d;
    }

    /* renamed from: c */
    public final String m132884c() {
        return this.f122908b;
    }

    /* renamed from: d */
    public final String m132885d() {
        return this.f122907a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25750p)) {
            return false;
        }
        C25750p c25750p = (C25750p) obj;
        return AbstractC19074t.m100204b(this.f122907a, c25750p.f122907a) && AbstractC19074t.m100204b(this.f122908b, c25750p.f122908b) && AbstractC19074t.m100204b(this.f122909c, c25750p.f122909c) && AbstractC19074t.m100204b(this.f122910d, c25750p.f122910d);
    }

    public int hashCode() {
        return (((((this.f122907a.hashCode() * 31) + this.f122908b.hashCode()) * 31) + this.f122909c.hashCode()) * 31) + this.f122910d.hashCode();
    }

    public String toString() {
        return "UploadQuickMessagePhotoResponse(url=" + this.f122907a + ", thumb=" + this.f122908b + ", hdUrl=" + this.f122909c + ", photoInfo=" + this.f122910d + ")";
    }
}
