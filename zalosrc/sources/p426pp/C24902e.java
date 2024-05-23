package p426pp;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: pp.e */
/* loaded from: classes4.dex */
public final class C24902e {

    /* renamed from: a */
    private String f119481a;

    /* renamed from: b */
    private String f119482b;

    /* renamed from: c */
    private String f119483c;

    /* renamed from: d */
    private String f119484d;

    /* renamed from: e */
    private String f119485e;

    /* renamed from: f */
    private String f119486f;

    /* renamed from: g */
    private String f119487g;

    /* renamed from: h */
    private long f119488h;

    /* renamed from: i */
    private long f119489i;

    /* renamed from: j */
    private String f119490j;

    public C24902e() {
        this(null, null, null, null, null, null, null, 0L, 0L, null, 1023, null);
    }

    /* renamed from: a */
    public final boolean m129485a() {
        if (this.f119487g.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m129486b() {
        if (this.f119486f.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String m129487c() {
        return this.f119483c;
    }

    /* renamed from: d */
    public final long m129488d() {
        return this.f119489i;
    }

    /* renamed from: e */
    public final long m129489e() {
        return this.f119488h;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C24902e) && AbstractC19074t.m100204b(((C24902e) obj).f119481a, this.f119481a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m129490f() {
        return this.f119481a;
    }

    /* renamed from: g */
    public final String m129491g() {
        return this.f119487g;
    }

    /* renamed from: h */
    public final String m129492h() {
        return this.f119482b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final String m129493i() {
        return this.f119486f;
    }

    /* renamed from: j */
    public final String m129494j() {
        return this.f119484d;
    }

    /* renamed from: k */
    public final String m129495k() {
        return this.f119490j;
    }

    /* renamed from: l */
    public final String m129496l() {
        return this.f119485e;
    }

    /* renamed from: m */
    public final void m129497m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f119481a = str;
    }

    public String toString() {
        return "SongContent(id=" + this.f119481a + ", name=" + this.f119482b + ", artist=" + this.f119483c + ", thumb=" + this.f119484d + ", url=" + this.f119485e + ", redirectUrl=" + this.f119486f + ", lyricURL=" + this.f119487g + ", chorusStart=" + this.f119488h + ", chorusEnd=" + this.f119489i + ", thumbRec=" + this.f119490j + ")";
    }

    public C24902e(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11, long j12, String str8) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str3, "artist");
        AbstractC19074t.m100208f(str4, "thumb");
        AbstractC19074t.m100208f(str5, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str6, "redirectUrl");
        AbstractC19074t.m100208f(str7, "lyricURL");
        AbstractC19074t.m100208f(str8, "thumbRec");
        this.f119481a = str;
        this.f119482b = str2;
        this.f119483c = str3;
        this.f119484d = str4;
        this.f119485e = str5;
        this.f119486f = str6;
        this.f119487g = str7;
        this.f119488h = j11;
        this.f119489i = j12;
        this.f119490j = str8;
    }

    public /* synthetic */ C24902e(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11, long j12, String str8, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) != 0 ? 0L : j11, (i11 & 256) == 0 ? j12 : 0L, (i11 & 512) == 0 ? str8 : "");
    }

    public C24902e(JSONObject jSONObject) {
        this(null, null, null, null, null, null, null, 0L, 0L, null, 1023, null);
        String optString;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("id");
                AbstractC19074t.m100207e(optString, "optString(...)");
            } catch (Exception e11) {
                e = e11;
            }
            try {
                this.f119481a = optString;
                String optString2 = jSONObject.optString("name");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f119482b = optString2;
                String optString3 = jSONObject.optString("artist");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                this.f119483c = optString3;
                String optString4 = jSONObject.optString("thumb");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                this.f119484d = optString4;
                String optString5 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(optString5, "optString(...)");
                this.f119485e = optString5;
                String optString6 = jSONObject.optString("redirectUrl");
                AbstractC19074t.m100207e(optString6, "optString(...)");
                this.f119486f = optString6;
                String optString7 = jSONObject.optString("lyric");
                AbstractC19074t.m100207e(optString7, "optString(...)");
                this.f119487g = optString7;
                this.f119488h = jSONObject.optLong("chorusStart");
                this.f119489i = jSONObject.optLong("chorusEnd");
                String optString8 = jSONObject.optString("thumbRec");
                AbstractC19074t.m100207e(optString8, "optString(...)");
                this.f119490j = optString8;
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
            }
        }
    }
}
