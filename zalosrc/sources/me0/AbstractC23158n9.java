package me0;

import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: me0.n9 */
/* loaded from: classes4.dex */
public abstract class AbstractC23158n9 {
    /* renamed from: a */
    public static JSONObject m119176a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sound", AbstractC23309i.m121825dc());
            jSONObject.put("vibration", AbstractC23309i.m121827de());
            jSONObject.put("allowNotification", AbstractC23309i.m122413t());
            jSONObject.put("allowNotificationGroup", AbstractC23309i.m122450u());
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
