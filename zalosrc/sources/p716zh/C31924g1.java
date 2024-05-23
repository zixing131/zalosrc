package p716zh;

import android.text.TextUtils;
import dj.C17975k0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh.g1 */
/* loaded from: classes3.dex */
public class C31924g1 {

    /* renamed from: a */
    public String f146660a;

    /* renamed from: b */
    public String f146661b;

    /* renamed from: c */
    public C17975k0 f146662c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C31924g1(JSONObject jSONObject) {
        char c11;
        try {
            this.f146660a = jSONObject.optString("action");
            this.f146661b = jSONObject.optString("params");
            String str = this.f146660a;
            int hashCode = str.hashCode();
            if (hashCode != -2138772447) {
                if (hashCode != -1103456014) {
                    if (hashCode == -302954634 && str.equals("recommened.groupcall")) {
                        c11 = 2;
                        if ((c11 != 0 || c11 == 1 || c11 == 2) && !TextUtils.isEmpty(this.f146661b)) {
                            this.f146662c = new C17975k0(new JSONObject(this.f146661b));
                            return;
                        }
                        return;
                    }
                    c11 = 65535;
                    if (c11 != 0) {
                    }
                    this.f146662c = new C17975k0(new JSONObject(this.f146661b));
                    return;
                }
                if (str.equals("recommened.calltime")) {
                    c11 = 0;
                    if (c11 != 0) {
                    }
                    this.f146662c = new C17975k0(new JSONObject(this.f146661b));
                    return;
                }
                c11 = 65535;
                if (c11 != 0) {
                }
                this.f146662c = new C17975k0(new JSONObject(this.f146661b));
                return;
            }
            if (str.equals("recommened.misscall")) {
                c11 = 1;
                if (c11 != 0) {
                }
                this.f146662c = new C17975k0(new JSONObject(this.f146661b));
                return;
            }
            c11 = 65535;
            if (c11 != 0) {
            }
            this.f146662c = new C17975k0(new JSONObject(this.f146661b));
            return;
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        e11.printStackTrace();
    }

    /* renamed from: a */
    public JSONObject m153388a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", this.f146660a);
        jSONObject.put("params", this.f146661b);
        return jSONObject;
    }

    public String toString() {
        try {
            return m153388a().toString();
        } catch (JSONException e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
