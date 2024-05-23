package p374ny;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* renamed from: ny.e */
/* loaded from: classes4.dex */
public final class C23961e extends AbstractC23958b {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private final String f115971g;

    /* renamed from: h */
    private final String f115972h;

    /* renamed from: i */
    private final String f115973i;

    /* renamed from: ny.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23961e m125392a(String str, long j11, String str2, String str3, String str4, String str5) {
            AbstractC19074t.m100208f(str, "content");
            AbstractC19074t.m100208f(str2, "title");
            AbstractC19074t.m100208f(str3, "domain");
            AbstractC19074t.m100208f(str4, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str4);
            jSONObject.put("thumbUrl", str5);
            jSONObject.put("domain", str3);
            return new C23961e(0L, str, j11, str2, jSONObject.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23961e(long j11, String str, long j12, String str2, String str3) {
        super(j11, str, 3, j12, str2, str3, null);
        Object m129218b;
        JSONObject jSONObject;
        String str4;
        String str5;
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, "title");
        if (str3 != null) {
            try {
                C24861r.a aVar = C24861r.f119264q;
                m129218b = C24861r.m129218b(new JSONObject(str3));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            jSONObject = (JSONObject) (C24861r.m129223g(m129218b) ? null : m129218b);
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            str4 = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        } else {
            str4 = null;
        }
        this.f115971g = str4;
        if (jSONObject != null) {
            str5 = jSONObject.optString("thumbUrl");
        } else {
            str5 = null;
        }
        this.f115972h = str5;
        this.f115973i = jSONObject != null ? jSONObject.optString("domain") : null;
    }

    /* renamed from: h */
    public final String m125389h() {
        return this.f115973i;
    }

    /* renamed from: i */
    public final String m125390i() {
        return this.f115972h;
    }

    /* renamed from: j */
    public final String m125391j() {
        return this.f115971g;
    }
}
