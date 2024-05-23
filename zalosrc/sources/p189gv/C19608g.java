package p189gv;

import fn0.AbstractC19074t;
import java.io.Serializable;
import org.json.JSONObject;
import p189gv.C19603b;

/* renamed from: gv.g */
/* loaded from: classes4.dex */
public final class C19608g implements Serializable {

    /* renamed from: p */
    private String f97386p;

    /* renamed from: q */
    private String f97387q;

    public C19608g(JSONObject jSONObject) {
        String string;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        if (jSONObject.isNull("vi")) {
            string = null;
        } else {
            string = jSONObject.getString("vi");
        }
        this.f97386p = string;
        this.f97387q = jSONObject.isNull("en") ? null : jSONObject.getString("en");
    }

    /* renamed from: a */
    public final String m102604a() {
        return this.f97387q;
    }

    /* renamed from: b */
    public final String m102605b() {
        return this.f97386p;
    }

    /* renamed from: c */
    public final boolean m102606c() {
        C19603b.a aVar = C19603b.Companion;
        if (aVar.m102586a(this.f97386p) && aVar.m102586a(this.f97387q)) {
            return true;
        }
        return false;
    }
}
