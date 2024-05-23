package p030b4;

import p030b4.AbstractC2513g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b4.b */
/* loaded from: classes.dex */
public final class C2508b extends AbstractC2513g {

    /* renamed from: a */
    private final AbstractC2513g.a f10211a;

    /* renamed from: b */
    private final long f10212b;

    public C2508b(AbstractC2513g.a aVar, long j11) {
        if (aVar != null) {
            this.f10211a = aVar;
            this.f10212b = j11;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // p030b4.AbstractC2513g
    /* renamed from: b */
    public long mo12593b() {
        return this.f10212b;
    }

    @Override // p030b4.AbstractC2513g
    /* renamed from: c */
    public AbstractC2513g.a mo12594c() {
        return this.f10211a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2513g)) {
            return false;
        }
        AbstractC2513g abstractC2513g = (AbstractC2513g) obj;
        if (this.f10211a.equals(abstractC2513g.mo12594c()) && this.f10212b == abstractC2513g.mo12593b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f10211a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f10212b;
        return hashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f10211a + ", nextRequestWaitMillis=" + this.f10212b + "}";
    }
}
