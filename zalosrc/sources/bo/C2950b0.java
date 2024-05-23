package bo;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import vg.C28227x3;

/* renamed from: bo.b0 */
/* loaded from: classes4.dex */
public class C2950b0 {

    /* renamed from: a */
    private String f11641a;

    /* renamed from: b */
    private C28227x3 f11642b;

    /* renamed from: c */
    private String f11643c;

    private C2950b0() {
    }

    /* renamed from: a */
    public static C2950b0 m13969a(String str, String str2, C28227x3 c28227x3) {
        C2950b0 c2950b0 = new C2950b0();
        c2950b0.f11641a = str;
        c2950b0.f11643c = str2;
        c2950b0.f11642b = c28227x3;
        return c2950b0;
    }

    /* renamed from: b */
    public static C2950b0 m13970b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return m13969a(jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL), jSONObject.optString("thumb"), new C28227x3(jSONObject.optJSONObject("dimen")));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C28227x3 m13971c() {
        return this.f11642b;
    }

    /* renamed from: d */
    public String m13972d() {
        return this.f11643c;
    }

    /* renamed from: e */
    public String m13973e() {
        return this.f11641a;
    }
}
