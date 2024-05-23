package fl0;

/* renamed from: fl0.a */
/* loaded from: classes7.dex */
public final class C18990a {

    /* renamed from: a */
    private final boolean f94803a;

    public C18990a(boolean z11) {
        this.f94803a = z11;
    }

    /* renamed from: a */
    public final boolean m99713a() {
        return this.f94803a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18990a) && this.f94803a == ((C18990a) obj).f94803a;
    }

    public int hashCode() {
        boolean z11 = this.f94803a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        return "Config(skipChecksum=" + this.f94803a + ')';
    }
}
