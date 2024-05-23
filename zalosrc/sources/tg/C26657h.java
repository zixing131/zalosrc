package tg;

import android.text.TextUtils;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.File;
import me0.AbstractC23041d2;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p494rv.C25979a;
import p642xe.C29605a;

/* renamed from: tg.h */
/* loaded from: classes3.dex */
public class C26657h {

    /* renamed from: a */
    public String f126156a;

    /* renamed from: b */
    public int f126157b;

    /* renamed from: c */
    public String f126158c;

    /* renamed from: d */
    public String f126159d;

    /* renamed from: e */
    public String f126160e;

    /* renamed from: f */
    public String f126161f;

    /* renamed from: g */
    public LottieConfig f126162g = null;

    public C26657h(JSONObject jSONObject) {
        try {
            this.f126160e = AbstractC18069a.m96089h(jSONObject, "id");
            this.f126156a = AbstractC18069a.m96089h(jSONObject, "attachment");
            this.f126157b = AbstractC18069a.m96085d(jSONObject, "effectType");
            this.f126158c = AbstractC18069a.m96089h(jSONObject, "checksumZip");
            this.f126159d = AbstractC18069a.m96089h(jSONObject, "checksumFolder");
            this.f126161f = AbstractC18069a.m96089h(jSONObject, "preview");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m136819a() {
        int i11 = this.f126157b;
        return i11 == 12 || i11 == 10;
    }

    /* renamed from: b */
    public boolean m136820b() {
        if (!TextUtils.isEmpty(this.f126156a) && !TextUtils.isEmpty(this.f126158c) && !TextUtils.isEmpty(this.f126159d)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m136821c(File file, String str) {
        if (file != null) {
            try {
                if (file.exists()) {
                    String m118198E = AbstractC23041d2.m118198E(file);
                    if (!TextUtils.isEmpty(m118198E)) {
                        JSONObject jSONObject = new JSONObject(m118198E);
                        this.f126162g = new LottieConfig.C8999a().m48109c(jSONObject.optString("decor_anchor", "center_center")).m48113g(jSONObject.optString("screen_anchor", "center_center")).m48115i(Math.max(0.0f, (float) jSONObject.optDouble("translate_x", 0.0d))).m48116j(Math.max(0.0f, (float) jSONObject.optDouble("translate_y", 0.0d))).m48112f(jSONObject.optString("scale_type", "freestyle")).m48111e(C25979a.m133812c((float) jSONObject.optDouble("scale", 1.0d))).m48108b(C25979a.m133811b(jSONObject.optInt(ZMediaPlayer.OPTION_PLAYER_KEY_NUMBER_OF_LOOP, 0))).m48110d(new File(str + "/sound.mp3").exists()).m48114h(C25979a.m133811b(jSONObject.optInt("sound_loop", -1))).m48107a();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public String m136822d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("attachment", this.f126156a);
            jSONObject.put("effectType", this.f126157b);
            jSONObject.put("id", this.f126160e);
            jSONObject.put("checksumZip", this.f126158c);
            jSONObject.put("checksumFolder", this.f126159d);
            String str = this.f126161f;
            if (str == null) {
                str = "";
            }
            jSONObject.put("preview", str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    public C26657h(C29605a c29605a) {
        this.f126160e = String.valueOf(c29605a.m147131h());
        this.f126156a = c29605a.m147126c();
        this.f126157b = c29605a.m147133j();
        this.f126158c = c29605a.m147128e();
        this.f126159d = c29605a.m147127d();
    }
}
