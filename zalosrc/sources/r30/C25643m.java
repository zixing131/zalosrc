package r30;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import vg.AbstractC28207v1;

/* renamed from: r30.m */
/* loaded from: classes5.dex */
public class C25643m {

    /* renamed from: a */
    public int f122615a;

    /* renamed from: b */
    public String f122616b;

    /* renamed from: c */
    public String f122617c;

    /* renamed from: d */
    public String f122618d;

    public C25643m() {
    }

    /* renamed from: a */
    public static C25643m m132535a() {
        C25643m c25643m = new C25643m();
        c25643m.f122615a = 1;
        c25643m.f122616b = AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_more_friend_default_text);
        c25643m.f122617c = "action.open.suggestion.phonebook";
        c25643m.f122618d = "";
        return c25643m;
    }

    /* renamed from: b */
    public boolean m132536b() {
        return this.f122615a == 1;
    }

    /* renamed from: c */
    public boolean m132537c() {
        if (!TextUtils.isEmpty(this.f122616b) && !TextUtils.isEmpty(this.f122617c) && AbstractC28207v1.m141992i1(this.f122617c)) {
            return true;
        }
        return false;
    }

    public C25643m(JSONObject jSONObject) {
        this.f122615a = jSONObject.optInt("visible", 1);
        this.f122616b = jSONObject.optString("text");
        this.f122617c = jSONObject.optString("actionId");
        this.f122618d = jSONObject.optString("actionData");
    }
}
