package pk;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17990p0;
import dj.C18009w0;
import dj.C18013y0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import nh0.C23793c;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p716zh.C32094r9;

/* renamed from: pk.b */
/* loaded from: classes3.dex */
public final class C24798b {

    /* renamed from: a */
    private int f119028a;

    /* renamed from: b */
    private String f119029b;

    /* renamed from: c */
    private String f119030c;

    /* renamed from: d */
    private String f119031d;

    /* renamed from: e */
    private String f119032e;

    /* renamed from: f */
    private String f119033f;

    /* renamed from: g */
    private boolean f119034g;

    /* renamed from: h */
    private int f119035h;

    /* renamed from: i */
    private int f119036i;

    /* renamed from: j */
    private long f119037j;

    /* renamed from: k */
    private String f119038k;

    /* renamed from: l */
    private long f119039l;

    /* renamed from: m */
    private int f119040m;

    /* renamed from: n */
    private String f119041n;

    /* renamed from: o */
    private String f119042o;

    /* renamed from: p */
    private C18013y0 f119043p;

    public C24798b(int i11, String str, String str2, String str3, String str4, String str5, boolean z11, int i12, int i13, long j11, String str6, long j12, int i14, String str7, String str8, C18013y0 c18013y0) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(str2, "thumbUrl");
        AbstractC19074t.m100208f(str3, "srcUrl");
        AbstractC19074t.m100208f(str4, "hdUrl");
        AbstractC19074t.m100208f(str5, "localPath");
        AbstractC19074t.m100208f(str6, "fName");
        AbstractC19074t.m100208f(str8, "md5");
        this.f119028a = i11;
        this.f119029b = str;
        this.f119030c = str2;
        this.f119031d = str3;
        this.f119032e = str4;
        this.f119033f = str5;
        this.f119034g = z11;
        this.f119035h = i12;
        this.f119036i = i13;
        this.f119037j = j11;
        this.f119038k = str6;
        this.f119039l = j12;
        this.f119040m = i14;
        this.f119041n = str7;
        this.f119042o = str8;
        this.f119043p = c18013y0;
    }

    /* renamed from: a */
    public final C17945a0 m128812a() {
        int m102881C = AbstractC19646n0.m102881C(this.f119028a);
        if (m102881C == 3 && this.f119032e.length() > 0) {
            m102881C = 4;
        }
        MessageId.C7932a c7932a = MessageId.Companion;
        String m103086b = AbstractC23306f.m120599M0().m103086b();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C17945a0.w m95363O = new C17945a0.w(c7932a.m41064b(m103086b, "", "204278670", str), m102881C).m95382r(this.f119029b).m95363O(this.f119031d);
        if (AbstractC19656s0.m103053B(m102881C)) {
            m95363O.m95353E(new C32094r9(0, 0L, null, 0, false, false, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, 0L, 0L, 0L, 0L, 0L, 0L, false, 0L, 0L, 0L, 0L, 0L, 0, false, 0L, null, false, null, 0L, 0L, 0L, null, null, null, -1, 127, null));
            m95363O.m95357I(C23793c.Companion.m124321a().mo124319c());
        }
        int i11 = this.f119028a;
        if (i11 != 32) {
            if (i11 != 44) {
                if (i11 == 46) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fileSize", this.f119039l);
                    jSONObject.put("fType", this.f119040m);
                    jSONObject.put("fdata", this.f119041n);
                    jSONObject.put("checksum", this.f119042o);
                    m95363O.m95368d(new C17990p0(this.f119038k, 0, this.f119030c, this.f119031d, "", "", jSONObject.toString()));
                }
            } else {
                String str2 = this.f119029b;
                C17961f1 c17961f1 = new C17961f1(str2, 0, this.f119030c, this.f119031d, str2, "", "", null);
                c17961f1.m95490m0(this.f119037j);
                c17961f1.m95449D0();
                m95363O.m95368d(c17961f1);
                m95363O.m95364P(this.f119030c);
            }
        } else {
            m95363O.m95368d(new C18009w0(this.f119029b, this.f119030c, this.f119031d, this.f119032e, this.f119035h, this.f119036i));
        }
        m95363O.m95379o(this.f119033f);
        C17945a0 m95365a = m95363O.m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        m95365a.m94951M9();
        return m95365a;
    }

    /* renamed from: b */
    public final C18013y0 m128813b() {
        return this.f119043p;
    }

    /* renamed from: c */
    public final boolean m128814c() {
        return this.f119034g;
    }

    /* renamed from: d */
    public final String m128815d() {
        return this.f119029b;
    }

    /* renamed from: e */
    public final int m128816e() {
        return this.f119028a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24798b)) {
            return false;
        }
        C24798b c24798b = (C24798b) obj;
        return this.f119028a == c24798b.f119028a && AbstractC19074t.m100204b(this.f119029b, c24798b.f119029b) && AbstractC19074t.m100204b(this.f119030c, c24798b.f119030c) && AbstractC19074t.m100204b(this.f119031d, c24798b.f119031d) && AbstractC19074t.m100204b(this.f119032e, c24798b.f119032e) && AbstractC19074t.m100204b(this.f119033f, c24798b.f119033f) && this.f119034g == c24798b.f119034g && this.f119035h == c24798b.f119035h && this.f119036i == c24798b.f119036i && this.f119037j == c24798b.f119037j && AbstractC19074t.m100204b(this.f119038k, c24798b.f119038k) && this.f119039l == c24798b.f119039l && this.f119040m == c24798b.f119040m && AbstractC19074t.m100204b(this.f119041n, c24798b.f119041n) && AbstractC19074t.m100204b(this.f119042o, c24798b.f119042o) && AbstractC19074t.m100204b(this.f119043p, c24798b.f119043p);
    }

    /* renamed from: f */
    public final String m128817f() {
        return this.f119031d;
    }

    /* renamed from: g */
    public final void m128818g(C18013y0 c18013y0) {
        this.f119043p = c18013y0;
    }

    /* renamed from: h */
    public final void m128819h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f119029b = str;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f119028a * 31) + this.f119029b.hashCode()) * 31) + this.f119030c.hashCode()) * 31) + this.f119031d.hashCode()) * 31) + this.f119032e.hashCode()) * 31) + this.f119033f.hashCode()) * 31) + AbstractC2144f.m11520a(this.f119034g)) * 31) + this.f119035h) * 31) + this.f119036i) * 31) + AbstractC2147g0.m11521a(this.f119037j)) * 31) + this.f119038k.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f119039l)) * 31) + this.f119040m) * 31;
        String str = this.f119041n;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f119042o.hashCode()) * 31;
        C18013y0 c18013y0 = this.f119043p;
        return hashCode2 + (c18013y0 != null ? c18013y0.hashCode() : 0);
    }

    /* renamed from: i */
    public final void m128820i(int i11) {
        this.f119028a = i11;
    }

    public String toString() {
        return "MyCloudChatContent(msgType=" + this.f119028a + ", message=" + this.f119029b + ", thumbUrl=" + this.f119030c + ", srcUrl=" + this.f119031d + ", hdUrl=" + this.f119032e + ", localPath=" + this.f119033f + ", groupLayout=" + this.f119034g + ", width=" + this.f119035h + ", height=" + this.f119036i + ", duration=" + this.f119037j + ", fName=" + this.f119038k + ", fSize=" + this.f119039l + ", fType=" + this.f119040m + ", fData=" + this.f119041n + ", md5=" + this.f119042o + ", chatRichContentRecommend=" + this.f119043p + ")";
    }

    public /* synthetic */ C24798b(int i11, String str, String str2, String str3, String str4, String str5, boolean z11, int i12, int i13, long j11, String str6, long j12, int i14, String str7, String str8, C18013y0 c18013y0, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? "" : str3, (i15 & 16) != 0 ? "" : str4, (i15 & 32) != 0 ? "" : str5, (i15 & 64) != 0 ? false : z11, (i15 & 128) != 0 ? 0 : i12, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) != 0 ? 0L : j11, (i15 & 1024) != 0 ? "" : str6, (i15 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0 ? j12 : 0L, (i15 & 4096) != 0 ? 0 : i14, (i15 & 8192) != 0 ? null : str7, (i15 & 16384) != 0 ? "" : str8, (i15 & 32768) == 0 ? c18013y0 : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24798b(JSONObject jSONObject) {
        this(0, r16, r16, r16, r16, r16, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, null, 0L, 0, null, null, null, 65535, null);
        C24798b c24798b;
        String str = null;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("msgType")) {
                c24798b = this;
                try {
                    c24798b.f119028a = jSONObject.optInt("msgType");
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    return;
                }
            } else {
                c24798b = this;
            }
            if (jSONObject.has("message")) {
                String optString = jSONObject.optString("message");
                AbstractC19074t.m100207e(optString, "optString(...)");
                c24798b.f119029b = optString;
            }
            if (jSONObject.has("thumbUrl")) {
                String optString2 = jSONObject.optString("thumbUrl");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                c24798b.f119030c = optString2;
            }
            if (jSONObject.has("srcUrl")) {
                String optString3 = jSONObject.optString("srcUrl");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                c24798b.f119031d = optString3;
            }
            if (jSONObject.has("hdUrl")) {
                String optString4 = jSONObject.optString("hdUrl");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                c24798b.f119032e = optString4;
            }
            c24798b.f119034g = jSONObject.has("groupLayout") && jSONObject.optBoolean("groupLayout");
            if (jSONObject.has("width")) {
                c24798b.f119035h = jSONObject.optInt("width");
            }
            if (jSONObject.has("height")) {
                c24798b.f119036i = jSONObject.optInt("height");
            }
            if (jSONObject.has("duration")) {
                c24798b.f119037j = jSONObject.optLong("duration");
            }
            if (jSONObject.has("fName")) {
                String optString5 = jSONObject.optString("fName");
                AbstractC19074t.m100207e(optString5, "optString(...)");
                c24798b.f119038k = optString5;
            }
            if (jSONObject.has("fSize")) {
                c24798b.f119039l = jSONObject.optLong("fSize");
            }
            if (jSONObject.has("fType")) {
                c24798b.f119040m = jSONObject.optInt("fType");
            }
            if (jSONObject.has("fData")) {
                c24798b.f119041n = jSONObject.optString("fData");
            }
            if (jSONObject.has("md5")) {
                String optString6 = jSONObject.optString("md5");
                AbstractC19074t.m100207e(optString6, "optString(...)");
                c24798b.f119042o = optString6;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}
