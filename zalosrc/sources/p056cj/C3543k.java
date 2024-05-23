package p056cj;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: cj.k */
/* loaded from: classes3.dex */
public final class C3543k {

    /* renamed from: a */
    private final JSONObject f14949a;

    /* renamed from: b */
    private final String f14950b;

    /* renamed from: c */
    private final C3533a f14951c;

    public C3543k(JSONObject jSONObject, String str, C3533a c3533a) {
        AbstractC19074t.m100208f(jSONObject, "data");
        AbstractC19074t.m100208f(str, "rawType");
        this.f14949a = jSONObject;
        this.f14950b = str;
        this.f14951c = c3533a;
    }

    /* renamed from: a */
    public final C3533a m18008a() {
        return this.f14951c;
    }

    /* renamed from: b */
    public final JSONObject m18009b() {
        return this.f14949a;
    }

    /* renamed from: c */
    public final String m18010c() {
        return this.f14950b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3543k)) {
            return false;
        }
        C3543k c3543k = (C3543k) obj;
        return AbstractC19074t.m100204b(this.f14949a, c3543k.f14949a) && AbstractC19074t.m100204b(this.f14950b, c3543k.f14950b) && AbstractC19074t.m100204b(this.f14951c, c3543k.f14951c);
    }

    public int hashCode() {
        int hashCode = ((this.f14949a.hashCode() * 31) + this.f14950b.hashCode()) * 31;
        C3533a c3533a = this.f14951c;
        return hashCode + (c3533a == null ? 0 : c3533a.hashCode());
    }

    public String toString() {
        return "MessagePacket(data=" + this.f14949a + ", rawType=" + this.f14950b + ", ackStatus=" + this.f14951c + ")";
    }
}
