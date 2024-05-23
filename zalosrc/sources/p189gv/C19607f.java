package p189gv;

import fn0.AbstractC19074t;
import java.io.Serializable;
import org.json.JSONObject;
import p189gv.C19603b;

/* renamed from: gv.f */
/* loaded from: classes4.dex */
public final class C19607f implements Serializable {

    /* renamed from: p */
    private String f97384p;

    /* renamed from: q */
    private String f97385q;

    public C19607f(JSONObject jSONObject) {
        String string;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        if (jSONObject.isNull("vi")) {
            string = null;
        } else {
            string = jSONObject.getString("vi");
        }
        this.f97384p = string;
        this.f97385q = jSONObject.isNull("en") ? null : jSONObject.getString("en");
    }

    /* renamed from: a */
    public final String m102601a() {
        return this.f97385q;
    }

    /* renamed from: b */
    public final String m102602b() {
        return this.f97384p;
    }

    /* renamed from: c */
    public final boolean m102603c() {
        C19603b.a aVar = C19603b.Companion;
        if (aVar.m102586a(this.f97384p) && aVar.m102586a(this.f97385q)) {
            return true;
        }
        return false;
    }
}
