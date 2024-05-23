package th;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: th.f */
/* loaded from: classes.dex */
public abstract class AbstractC26685f {

    /* renamed from: a */
    public static int f126420a = 3000;

    /* renamed from: b */
    public static int f126421b = 3000;

    /* renamed from: c */
    public static int f126422c = 3000;

    /* renamed from: d */
    public static int f126423d = 3000;

    /* renamed from: a */
    static int m137050a(int i11, int i12, int i13) {
        return Math.min(i12, Math.max(i11, i13));
    }

    /* renamed from: b */
    public static void m137051b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                m137052c();
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("socket_com");
            if (optJSONObject != null) {
                f126420a = m137050a(0, 3000, optJSONObject.optInt("waiting_time_connecting", 3000));
                f126421b = m137050a(0, 3000, optJSONObject.optInt("waiting_time_no_connect", 3000));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("socket_upload");
            if (optJSONObject2 != null) {
                f126422c = m137050a(0, 3000, optJSONObject2.optInt("waiting_time_connecting", 3000));
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("socket_upload_video");
            if (optJSONObject3 != null) {
                f126423d = m137050a(0, 3000, optJSONObject3.optInt("waiting_time_connecting", 3000));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m137052c();
        }
    }

    /* renamed from: c */
    static void m137052c() {
        f126420a = 3000;
        f126421b = 3000;
        f126422c = 3000;
        f126423d = 3000;
    }
}
