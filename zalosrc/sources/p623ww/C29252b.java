package p623ww;

import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ww.b */
/* loaded from: classes4.dex */
public final class C29252b {

    /* renamed from: a */
    public static final C29252b f135467a = new C29252b();

    private C29252b() {
    }

    /* renamed from: a */
    public final String m146046a(String str) {
        AbstractC19074t.m100208f(str, "sendEntryPoint");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sent_source", AbstractC19074t.m100204b(str, "chat_forward") ? 1 : 0);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
