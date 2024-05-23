package p703z3;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z3.d */
/* loaded from: classes.dex */
public final class C31199d extends AbstractC31205j {

    /* renamed from: a */
    private final List f144123a;

    public C31199d(List list) {
        if (list != null) {
            this.f144123a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // p703z3.AbstractC31205j
    /* renamed from: c */
    public List mo152035c() {
        return this.f144123a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC31205j) {
            return this.f144123a.equals(((AbstractC31205j) obj).mo152035c());
        }
        return false;
    }

    public int hashCode() {
        return this.f144123a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f144123a + "}";
    }
}
