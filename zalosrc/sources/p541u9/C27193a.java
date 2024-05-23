package p541u9;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u9.a */
/* loaded from: classes3.dex */
public final class C27193a extends AbstractC27194b {

    /* renamed from: a */
    private final Set f127911a;

    public C27193a(Set set) {
        if (set != null) {
            this.f127911a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    @Override // p541u9.AbstractC27194b
    /* renamed from: b */
    public Set mo139264b() {
        return this.f127911a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27194b) {
            return this.f127911a.equals(((AbstractC27194b) obj).mo139264b());
        }
        return false;
    }

    public int hashCode() {
        return this.f127911a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f127911a + "}";
    }
}
