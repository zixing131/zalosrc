package ls;

import android.text.TextUtils;
import me0.AbstractC23056e6;
import org.json.JSONObject;

/* renamed from: ls.b */
/* loaded from: classes4.dex */
public class C22642b {

    /* renamed from: a */
    public String f111042a;

    /* renamed from: b */
    public String f111043b;

    /* renamed from: c */
    public String f111044c;

    public C22642b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f111042a = jSONObject.optString("uid");
        this.f111044c = jSONObject.optString("name");
        String optString = jSONObject.optString("phone");
        if (!TextUtils.isEmpty(optString)) {
            this.f111043b = AbstractC23056e6.m118285k(optString);
        }
    }
}
