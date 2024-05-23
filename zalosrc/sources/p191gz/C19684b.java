package p191gz;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: gz.b */
/* loaded from: classes4.dex */
public final class C19684b {

    /* renamed from: a */
    private final boolean f97656a;

    /* renamed from: b */
    private final String f97657b;

    /* renamed from: c */
    private final JSONObject f97658c;

    public C19684b(boolean z11, String str, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "keyLv0");
        AbstractC19074t.m100208f(jSONObject, "settings");
        this.f97656a = z11;
        this.f97657b = str;
        this.f97658c = jSONObject;
    }

    /* renamed from: a */
    public final boolean m103285a() {
        return this.f97656a;
    }

    /* renamed from: b */
    public final String m103286b() {
        return this.f97657b;
    }

    /* renamed from: c */
    public final JSONObject m103287c() {
        return this.f97658c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19684b)) {
            return false;
        }
        C19684b c19684b = (C19684b) obj;
        return this.f97656a == c19684b.f97656a && AbstractC19074t.m100204b(this.f97657b, c19684b.f97657b) && AbstractC19074t.m100204b(this.f97658c, c19684b.f97658c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.f97656a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (((r02 * 31) + this.f97657b.hashCode()) * 31) + this.f97658c.hashCode();
    }

    public String toString() {
        return "RemoteConfigResponse(hasMore=" + this.f97656a + ", keyLv0=" + this.f97657b + ", settings=" + this.f97658c + ')';
    }

    public /* synthetic */ C19684b(boolean z11, String str, JSONObject jSONObject, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? new JSONObject() : jSONObject);
    }
}
