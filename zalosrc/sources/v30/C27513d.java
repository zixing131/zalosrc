package v30;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: v30.d */
/* loaded from: classes5.dex */
class C27513d {

    /* renamed from: a */
    String f129445a;

    /* renamed from: b */
    String f129446b;

    /* renamed from: c */
    String f129447c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27513d(JSONObject jSONObject) {
        try {
            this.f129445a = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f129446b = AbstractC18069a.m96089h(jSONObject, "checksum_zip");
            this.f129447c = AbstractC18069a.m96089h(jSONObject, "checksum_folder");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
