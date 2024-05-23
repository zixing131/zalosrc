package on0;

import fn0.AbstractC19074t;
import ln0.C22537f;

/* renamed from: on0.f */
/* loaded from: classes7.dex */
public final class C24325f {

    /* renamed from: a */
    private final String f117424a;

    /* renamed from: b */
    private final C22537f f117425b;

    public C24325f(String str, C22537f c22537f) {
        AbstractC19074t.m100208f(str, "value");
        AbstractC19074t.m100208f(c22537f, "range");
        this.f117424a = str;
        this.f117425b = c22537f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24325f)) {
            return false;
        }
        C24325f c24325f = (C24325f) obj;
        return AbstractC19074t.m100204b(this.f117424a, c24325f.f117424a) && AbstractC19074t.m100204b(this.f117425b, c24325f.f117425b);
    }

    public int hashCode() {
        return (this.f117424a.hashCode() * 31) + this.f117425b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f117424a + ", range=" + this.f117425b + ')';
    }
}
