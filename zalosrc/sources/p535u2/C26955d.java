package p535u2;

import fn0.AbstractC19074t;

/* renamed from: u2.d */
/* loaded from: classes.dex */
public final class C26955d {

    /* renamed from: a */
    private final String f127453a;

    /* renamed from: b */
    private final Long f127454b;

    public C26955d(String str, Long l11) {
        AbstractC19074t.m100208f(str, "key");
        this.f127453a = str;
        this.f127454b = l11;
    }

    /* renamed from: a */
    public final String m138918a() {
        return this.f127453a;
    }

    /* renamed from: b */
    public final Long m138919b() {
        return this.f127454b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26955d)) {
            return false;
        }
        C26955d c26955d = (C26955d) obj;
        return AbstractC19074t.m100204b(this.f127453a, c26955d.f127453a) && AbstractC19074t.m100204b(this.f127454b, c26955d.f127454b);
    }

    public int hashCode() {
        int hashCode = this.f127453a.hashCode() * 31;
        Long l11 = this.f127454b;
        return hashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f127453a + ", value=" + this.f127454b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26955d(String str, boolean z11) {
        this(str, Long.valueOf(z11 ? 1L : 0L));
        AbstractC19074t.m100208f(str, "key");
    }
}
