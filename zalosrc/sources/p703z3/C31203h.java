package p703z3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z3.h */
/* loaded from: classes.dex */
public final class C31203h extends AbstractC31209n {

    /* renamed from: a */
    private final long f144156a;

    public C31203h(long j11) {
        this.f144156a = j11;
    }

    @Override // p703z3.AbstractC31209n
    /* renamed from: c */
    public long mo152071c() {
        return this.f144156a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC31209n) && this.f144156a == ((AbstractC31209n) obj).mo152071c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f144156a;
        return 1000003 ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f144156a + "}";
    }
}
