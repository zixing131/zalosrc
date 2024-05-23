package rd0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: rd0.o */
/* loaded from: classes4.dex */
public final class C25749o extends AbstractC25751q {

    /* renamed from: a */
    private final String f122903a;

    /* renamed from: b */
    private final String f122904b;

    /* renamed from: c */
    private final String f122905c;

    /* renamed from: d */
    private final JSONObject f122906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25749o(String str, String str2, String str3, JSONObject jSONObject) {
        super(null);
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "thumb");
        AbstractC19074t.m100208f(str3, "hdUrl");
        AbstractC19074t.m100208f(jSONObject, "photoInfo");
        this.f122903a = str;
        this.f122904b = str2;
        this.f122905c = str3;
        this.f122906d = jSONObject;
    }

    /* renamed from: a */
    public final String m132881a() {
        return this.f122903a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25749o)) {
            return false;
        }
        C25749o c25749o = (C25749o) obj;
        return AbstractC19074t.m100204b(this.f122903a, c25749o.f122903a) && AbstractC19074t.m100204b(this.f122904b, c25749o.f122904b) && AbstractC19074t.m100204b(this.f122905c, c25749o.f122905c) && AbstractC19074t.m100204b(this.f122906d, c25749o.f122906d);
    }

    public int hashCode() {
        return (((((this.f122903a.hashCode() * 31) + this.f122904b.hashCode()) * 31) + this.f122905c.hashCode()) * 31) + this.f122906d.hashCode();
    }

    public String toString() {
        return "UploadProductPhotoResponse(url=" + this.f122903a + ", thumb=" + this.f122904b + ", hdUrl=" + this.f122905c + ", photoInfo=" + this.f122906d + ")";
    }
}
