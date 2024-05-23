package uz;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: uz.b */
/* loaded from: classes4.dex */
public final class C27386b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f129028a;

    /* renamed from: b */
    private final String f129029b;

    /* renamed from: c */
    private final String f129030c;

    /* renamed from: d */
    private final String f129031d;

    /* renamed from: uz.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C27386b m140311a(String str) {
            AbstractC19074t.m100208f(str, "jsonString");
            if (str.length() != 0) {
                return new C27386b(new JSONObject(str));
            }
            throw new IllegalArgumentException("jsonString is empty, cannot parse");
        }
    }

    public C27386b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f129028a = jSONObject.optInt("version", -1);
        String optString = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f129029b = optString;
        String optString2 = jSONObject.optString("checksum");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f129030c = optString2;
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        this.f129031d = jSONObject2;
    }

    /* renamed from: a */
    public final String m140307a() {
        return this.f129030c;
    }

    /* renamed from: b */
    public final String m140308b() {
        return this.f129031d;
    }

    /* renamed from: c */
    public final String m140309c() {
        return this.f129029b;
    }

    /* renamed from: d */
    public final int m140310d() {
        return this.f129028a;
    }
}
