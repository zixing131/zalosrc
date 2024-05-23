package k50;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p426pp.C24902e;

/* renamed from: k50.c */
/* loaded from: classes5.dex */
public final class C21475c {

    /* renamed from: a */
    private String f104499a;

    /* renamed from: b */
    private String f104500b;

    /* renamed from: c */
    private String f104501c;

    /* renamed from: d */
    private String f104502d;

    /* renamed from: e */
    private String f104503e;

    /* renamed from: f */
    private String f104504f;

    /* renamed from: g */
    private String f104505g;

    /* renamed from: h */
    private long f104506h;

    /* renamed from: i */
    private long f104507i;

    public C21475c(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11, long j12) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str3, "artist");
        AbstractC19074t.m100208f(str4, "thumb");
        AbstractC19074t.m100208f(str5, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str6, "redirectUrl");
        AbstractC19074t.m100208f(str7, "lyricURL");
        this.f104499a = str;
        this.f104500b = str2;
        this.f104501c = str3;
        this.f104502d = str4;
        this.f104503e = str5;
        this.f104504f = str6;
        this.f104505g = str7;
        this.f104506h = j11;
        this.f104507i = j12;
    }

    /* renamed from: a */
    public final String m111084a() {
        return this.f104501c;
    }

    /* renamed from: b */
    public final String m111085b() {
        return this.f104499a;
    }

    /* renamed from: c */
    public final String m111086c() {
        return this.f104500b;
    }

    /* renamed from: d */
    public final String m111087d() {
        return this.f104504f;
    }

    /* renamed from: e */
    public final String m111088e() {
        return this.f104502d;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C24902e) && AbstractC19074t.m100204b(((C24902e) obj).m129490f(), this.f104499a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "RingtoneContent(id=" + this.f104499a + ", name=" + this.f104500b + ", artist=" + this.f104501c + ", thumb=" + this.f104502d + ", url=" + this.f104503e + ", redirectUrl=" + this.f104504f + ", lyricURL=" + this.f104505g + ", chorusStart=" + this.f104506h + ", chorusEnd=" + this.f104507i + ")";
    }

    public /* synthetic */ C21475c(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11, long j12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) == 0 ? str7 : "", (i11 & 128) != 0 ? 0L : j11, (i11 & 256) == 0 ? j12 : 0L);
    }

    public C21475c(JSONObject jSONObject) {
        this(null, null, null, null, null, null, null, 0L, 0L, 511, null);
        String optString;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("id");
                AbstractC19074t.m100207e(optString, "optString(...)");
            } catch (Exception e11) {
                e = e11;
            }
            try {
                this.f104499a = optString;
                String optString2 = jSONObject.optString("name");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f104500b = optString2;
                String optString3 = jSONObject.optString("artist");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                this.f104501c = optString3;
                String optString4 = jSONObject.optString("thumb");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                this.f104502d = optString4;
                String optString5 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(optString5, "optString(...)");
                this.f104503e = optString5;
                String optString6 = jSONObject.optString("redirectUrl");
                AbstractC19074t.m100207e(optString6, "optString(...)");
                this.f104504f = optString6;
                String optString7 = jSONObject.optString("lyric");
                AbstractC19074t.m100207e(optString7, "optString(...)");
                this.f104505g = optString7;
                this.f104506h = jSONObject.optLong("chorusStart");
                this.f104507i = jSONObject.optLong("chorusEnd");
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
            }
        }
    }
}
