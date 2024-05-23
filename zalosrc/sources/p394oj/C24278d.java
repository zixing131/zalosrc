package p394oj;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import org.json.JSONObject;

/* renamed from: oj.d */
/* loaded from: classes3.dex */
public class C24278d {

    /* renamed from: a */
    public String f117248a;

    /* renamed from: b */
    public String f117249b;

    /* renamed from: c */
    public String f117250c;

    /* renamed from: d */
    public String f117251d;

    /* renamed from: e */
    public long f117252e;

    /* renamed from: f */
    public long f117253f = System.currentTimeMillis();

    public C24278d(String str, String str2, JSONObject jSONObject) {
        this.f117250c = "";
        this.f117251d = "";
        this.f117248a = str;
        this.f117249b = str2;
        this.f117250c = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f117251d = jSONObject.optString("urlHls");
        this.f117252e = jSONObject.optLong("expired_time");
    }

    /* renamed from: a */
    public boolean m126783a() {
        if (System.currentTimeMillis() - this.f117253f >= this.f117252e * 1000) {
            return true;
        }
        return false;
    }
}
