package p485rj;

import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p394oj.C24280f;

/* renamed from: rj.c */
/* loaded from: classes3.dex */
public final class C25811c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f123108a;

    /* renamed from: b */
    private String f123109b;

    /* renamed from: c */
    private int f123110c;

    /* renamed from: d */
    private int f123111d;

    /* renamed from: e */
    private String f123112e;

    /* renamed from: f */
    private String f123113f;

    /* renamed from: g */
    private C24280f f123114g;

    /* renamed from: h */
    private int f123115h;

    /* renamed from: i */
    private int f123116i;

    /* renamed from: j */
    private int f123117j;

    /* renamed from: rj.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25811c(String str, String str2, int i11, int i12, String str3, C24280f c24280f, int i13, int i14, int i15) {
        AbstractC19074t.m100208f(str, "thumbUrl");
        AbstractC19074t.m100208f(str2, "gifUrl");
        AbstractC19074t.m100208f(str3, "id");
        this.f123108a = str;
        this.f123109b = str2;
        this.f123110c = i11;
        this.f123111d = i12;
        this.f123113f = str3;
        this.f123114g = c24280f;
        this.f123115h = i13;
        this.f123116i = i14;
        this.f123117j = i15;
        m133088m();
    }

    /* renamed from: m */
    private final void m133088m() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thumb_url", this.f123108a);
            jSONObject.put("gif_url", this.f123109b);
            jSONObject.put("width", this.f123110c);
            jSONObject.put("height", this.f123111d);
            jSONObject.put("id", this.f123113f);
            C24280f c24280f = this.f123114g;
            if (c24280f != null) {
                jSONObject.put("webp", c24280f.m126784a());
            }
            jSONObject.put("pStickerType", this.f123115h);
            jSONObject.put("pStickerRootCateId", this.f123116i);
            jSONObject.put("pStickerId", this.f123117j);
            this.f123112e = jSONObject.toString();
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: a */
    public final C25810b m133089a() {
        return new C25810b(this.f123109b, this.f123110c, this.f123111d);
    }

    /* renamed from: b */
    public final String m133090b() {
        return this.f123109b;
    }

    /* renamed from: c */
    public final int m133091c() {
        return this.f123111d;
    }

    /* renamed from: d */
    public final String m133092d() {
        return this.f123113f;
    }

    /* renamed from: e */
    public final int m133093e() {
        return this.f123117j;
    }

    /* renamed from: f */
    public final int m133094f() {
        return this.f123116i;
    }

    /* renamed from: g */
    public final int m133095g() {
        return this.f123115h;
    }

    /* renamed from: h */
    public final String m133096h() {
        return this.f123112e;
    }

    /* renamed from: i */
    public final String m133097i() {
        return this.f123108a;
    }

    /* renamed from: j */
    public final C24280f m133098j() {
        return this.f123114g;
    }

    /* renamed from: k */
    public final int m133099k() {
        return this.f123110c;
    }

    /* renamed from: l */
    public final void m133100l(C24280f c24280f) {
        this.f123114g = c24280f;
    }

    public C25811c(String str) {
        this.f123108a = "";
        this.f123109b = "";
        this.f123113f = "";
        if (str == null) {
            return;
        }
        this.f123112e = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("thumb_url");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f123108a = string;
            String string2 = jSONObject.getString("gif_url");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f123109b = string2;
            String m96089h = AbstractC18069a.m96089h(jSONObject, "id");
            AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
            this.f123113f = m96089h;
            this.f123110c = jSONObject.getInt("width");
            this.f123111d = jSONObject.getInt("height");
            this.f123114g = jSONObject.has("webp") ? new C24280f(jSONObject.optJSONObject("webp")) : null;
            this.f123115h = jSONObject.optInt("pStickerType");
            this.f123116i = jSONObject.optInt("pStickerRootCateId", -1);
            this.f123117j = jSONObject.optInt("pStickerId", -1);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public C25811c(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        String str = "";
        this.f123108a = "";
        this.f123109b = "";
        this.f123113f = "";
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("thumb");
            String optString = optJSONObject != null ? optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) : null;
            if (optString != null) {
                str = optString;
            }
            this.f123108a = str;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("normal");
            if (optJSONObject2 != null) {
                String optString2 = optJSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f123109b = optString2;
                this.f123110c = optJSONObject2.getInt("width");
                this.f123111d = optJSONObject2.getInt("height");
            }
            String optString3 = jSONObject.optString("id");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f123113f = optString3;
            this.f123114g = jSONObject.has("webp") ? new C24280f(jSONObject.optJSONObject("webp")) : null;
            this.f123115h = jSONObject.optInt("pStickerType");
            this.f123116i = jSONObject.optInt("pStickerRootCateId", -1);
            this.f123117j = jSONObject.optInt("pStickerId", -1);
            m133088m();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
