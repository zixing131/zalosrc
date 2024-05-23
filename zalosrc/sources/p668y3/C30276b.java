package p668y3;

/* renamed from: y3.b */
/* loaded from: classes.dex */
public final class C30276b {

    /* renamed from: a */
    private final String f140652a;

    private C30276b(String str) {
        if (str != null) {
            this.f140652a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C30276b m149414b(String str) {
        return new C30276b(str);
    }

    /* renamed from: a */
    public String m149415a() {
        return this.f140652a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30276b)) {
            return false;
        }
        return this.f140652a.equals(((C30276b) obj).f140652a);
    }

    public int hashCode() {
        return this.f140652a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f140652a + "\"}";
    }
}
