package p189gv;

import fn0.AbstractC19074t;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: gv.e */
/* loaded from: classes4.dex */
public final class C19606e implements Serializable {

    /* renamed from: p */
    private C19604c f97380p;

    /* renamed from: q */
    private C19608g f97381q;

    /* renamed from: r */
    private C19607f f97382r;

    /* renamed from: s */
    private boolean f97383s;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:            if (r4.m102589c() == true) goto L66;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C19606e(JSONObject jSONObject) {
        boolean z11;
        C19604c c19604c;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        if (jSONObject.has("img")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("img");
            if (optJSONObject != null) {
                c19604c = new C19604c(optJSONObject);
            } else {
                c19604c = null;
            }
            this.f97380p = c19604c;
        }
        if (jSONObject.has("title")) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("title");
            this.f97381q = optJSONObject2 != null ? new C19608g(optJSONObject2) : null;
        }
        if (jSONObject.has("subTitle")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("subTitle");
            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
            this.f97382r = new C19607f(jSONObject2);
        }
        C19607f c19607f = this.f97382r;
        if (c19607f != null) {
            z11 = true;
            if (c19607f.m102603c()) {
                C19608g c19608g = this.f97381q;
                if (c19608g != null) {
                    if (c19608g.m102606c()) {
                        C19604c c19604c2 = this.f97380p;
                        if (c19604c2 != null) {
                        }
                    }
                }
            }
        }
        z11 = false;
        this.f97383s = z11;
    }

    /* renamed from: a */
    public final boolean m102597a() {
        return this.f97383s;
    }

    /* renamed from: b */
    public final C19604c m102598b() {
        return this.f97380p;
    }

    /* renamed from: c */
    public final C19607f m102599c() {
        return this.f97382r;
    }

    /* renamed from: d */
    public final C19608g m102600d() {
        return this.f97381q;
    }
}
