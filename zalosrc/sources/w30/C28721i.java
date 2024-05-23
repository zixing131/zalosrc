package w30;

import ag0.C0815e1;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p361nb.C23648e;

/* renamed from: w30.i */
/* loaded from: classes5.dex */
public final class C28721i {

    /* renamed from: a */
    public static final C28721i f133240a = new C28721i();

    private C28721i() {
    }

    /* renamed from: a */
    public final void m143848a(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "chatType");
        try {
            JSONObject jSONObject = new JSONObject();
            if (!z11) {
                i11 = 100;
            }
            jSONObject.put("percent", i11);
            jSONObject.put("stop_type", z11 ? 1 : 0);
            C0815e1.m2075D().m2100V(new C23648e(64, "csc", 0, "stop_message_to_audio", str, jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final void m143849b(String str, String str2) {
        AbstractC19074t.m100208f(str, "chatType");
        AbstractC19074t.m100208f(str2, "text");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text_length", str2.length());
            C0815e1.m2075D().m2100V(new C23648e(64, "csc_msgmenu", 0, "message_speak", str, jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m143850c(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        try {
            C0815e1.m2075D().m2100V(new C23648e(64, "csc_msgmenu", 1, "message_to_audio", str), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
