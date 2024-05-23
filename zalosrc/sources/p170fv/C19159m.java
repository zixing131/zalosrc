package p170fv;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import org.json.JSONObject;

/* renamed from: fv.m */
/* loaded from: classes4.dex */
public final class C19159m {

    /* renamed from: a */
    private int f95199a;

    /* renamed from: b */
    private int f95200b;

    /* renamed from: c */
    private String f95201c;

    /* renamed from: d */
    private String f95202d;

    public C19159m(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f95199a = jSONObject.optInt("enable");
            this.f95201c = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f95202d = jSONObject.optString("iconUrl");
            this.f95200b = jSONObject.optInt("needJump");
        }
    }

    /* renamed from: a */
    public final int m100502a() {
        return this.f95199a;
    }

    /* renamed from: b */
    public final String m100503b() {
        return this.f95202d;
    }

    /* renamed from: c */
    public final int m100504c() {
        return this.f95200b;
    }

    /* renamed from: d */
    public final String m100505d() {
        return this.f95201c;
    }
}
