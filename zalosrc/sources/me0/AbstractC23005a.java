package me0;

import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.C31877d;

/* renamed from: me0.a */
/* loaded from: classes4.dex */
public abstract class AbstractC23005a {
    /* renamed from: a */
    public static JSONObject m117869a(JSONObject jSONObject) {
        if (jSONObject.optInt("totalApp") > 0) {
            JSONArray optJSONArray = jSONObject.optJSONArray("apps");
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (i11 < optJSONArray.length()) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                boolean z11 = true;
                i11++;
                String format = String.format(Locale.getDefault(), "app_%d", Integer.valueOf(i11));
                String optString = jSONObject2.optJSONObject(format).optString("packageName");
                JSONObject jSONObject3 = new JSONObject();
                if (!TextUtils.isEmpty(optString)) {
                    if (MainApplication.getAppContext().getPackageManager().getLaunchIntentForPackage(optString) == null) {
                        z11 = false;
                    }
                    jSONObject3.put(format, z11);
                    jSONArray.put(jSONObject3);
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("apps", jSONArray);
            return jSONObject4;
        }
        return null;
    }

    /* renamed from: b */
    public static C31877d m117870b() {
        C31877d c31877d = new C31877d();
        Bundle bundle = new Bundle();
        bundle.putInt("INT_ACTION_FROM", 696);
        c31877d.m153185d(bundle);
        return c31877d;
    }
}
