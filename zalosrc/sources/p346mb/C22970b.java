package p346mb;

import android.text.TextUtils;
import org.json.JSONObject;
import p545ue.C27239a;

/* renamed from: mb.b */
/* loaded from: classes3.dex */
public class C22970b {

    /* renamed from: a */
    public int f111713a = -1;

    /* renamed from: b */
    public C27239a f111714b;

    private C22970b() {
    }

    /* renamed from: a */
    public static C22970b m117720a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C22970b c22970b = new C22970b();
        c22970b.f111713a = jSONObject.optInt("cameraFacing", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("filterInfo");
        if (optJSONObject != null) {
            c22970b.f111714b = new C27239a(optJSONObject.optLong("categoryId"), optJSONObject.optLong("filterId"));
        }
        return c22970b;
    }

    /* renamed from: b */
    public static C22970b m117721b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m117720a(new JSONObject(str));
    }
}
