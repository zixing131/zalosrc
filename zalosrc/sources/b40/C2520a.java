package b40;

import ag0.C0815e1;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p361nb.C23648e;

/* renamed from: b40.a */
/* loaded from: classes5.dex */
public final class C2520a {

    /* renamed from: b */
    private static int f10236b;

    /* renamed from: d */
    private static int f10238d;

    /* renamed from: e */
    private static int f10239e;

    /* renamed from: a */
    public static final C2520a f10235a = new C2520a();

    /* renamed from: c */
    private static String f10237c = "ai_sticker_panel";

    private C2520a() {
    }

    /* renamed from: a */
    public final void m12619a(String str) {
        AbstractC19074t.m100208f(str, "logChatType");
        if (f10239e < 1) {
            return;
        }
        try {
            C0815e1.m2075D().m2100V(new C23648e(54, "", 0, "ai_sticker_promotion_click", str, ""), false);
            f10239e = -1;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m12620b(String str) {
        AbstractC19074t.m100208f(str, "logChatType");
        if (f10238d < 1) {
            return;
        }
        try {
            C0815e1.m2075D().m2100V(new C23648e(54, "", 1, "ai_sticker_promotion_view", str, ""), false);
            f10238d = -1;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public final int m12621c() {
        return f10236b;
    }

    /* renamed from: d */
    public final int m12622d() {
        return f10239e;
    }

    /* renamed from: e */
    public final int m12623e() {
        return f10238d;
    }

    /* renamed from: f */
    public final String m12624f() {
        return f10237c;
    }

    /* renamed from: g */
    public final void m12625g(int i11, int i12, int i13, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        try {
            JSONObject jSONObject = new JSONObject();
            int i14 = 1;
            if (f10236b != 1) {
                i14 = 0;
            }
            jSONObject.put("istip", i14);
            jSONObject.put("position", i11);
            jSONObject.put("ssID", i12);
            jSONObject.put("ID", i13);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            C0815e1.m2075D().m2100V(new C23648e(54, str, 0, "ai_sticker_send", str2, jSONObject2), false);
            f10236b = -1;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public final void m12626h(int i11) {
        f10236b = i11;
    }

    /* renamed from: i */
    public final void m12627i(int i11) {
        f10239e = i11;
    }

    /* renamed from: j */
    public final void m12628j(int i11) {
        f10238d = i11;
    }

    /* renamed from: k */
    public final void m12629k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f10237c = str;
    }

    /* renamed from: l */
    public final void m12630l(boolean z11, String str, String str2) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "logChatType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isnew", z11 ? 1 : 0);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            C0815e1.m2075D().m2100V(new C23648e(54, str, 1, "ai_sticker_view", str2, jSONObject2), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
