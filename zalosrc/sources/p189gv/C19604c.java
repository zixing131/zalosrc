package p189gv;

import fn0.AbstractC19074t;
import java.io.Serializable;
import org.json.JSONObject;
import p189gv.C19603b;

/* renamed from: gv.c */
/* loaded from: classes4.dex */
public final class C19604c implements Serializable {

    /* renamed from: p */
    private String f97376p;

    /* renamed from: q */
    private String f97377q;

    public C19604c(JSONObject jSONObject) {
        String string;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        if (jSONObject.isNull("l")) {
            string = null;
        } else {
            string = jSONObject.getString("l");
        }
        this.f97376p = string;
        this.f97377q = jSONObject.isNull("d") ? null : jSONObject.getString("d");
    }

    /* renamed from: a */
    public final String m102587a() {
        return this.f97377q;
    }

    /* renamed from: b */
    public final String m102588b() {
        return this.f97376p;
    }

    /* renamed from: c */
    public final boolean m102589c() {
        C19603b.a aVar = C19603b.Companion;
        if (aVar.m102586a(this.f97376p) && aVar.m102586a(this.f97377q)) {
            return true;
        }
        return false;
    }
}
