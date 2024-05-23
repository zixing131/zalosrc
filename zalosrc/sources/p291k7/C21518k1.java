package p291k7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k7.k1 */
/* loaded from: classes3.dex */
public final class C21518k1 extends AbstractC21521l1 {

    /* renamed from: a */
    private final int f104556a;

    /* renamed from: b */
    private final long f104557b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21518k1(int i11, long j11) {
        this.f104556a = i11;
        this.f104557b = j11;
    }

    @Override // p291k7.AbstractC21521l1
    /* renamed from: a */
    public final int mo111170a() {
        return this.f104556a;
    }

    @Override // p291k7.AbstractC21521l1
    /* renamed from: b */
    public final long mo111171b() {
        return this.f104557b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC21521l1) {
            AbstractC21521l1 abstractC21521l1 = (AbstractC21521l1) obj;
            if (this.f104556a == abstractC21521l1.mo111170a() && this.f104557b == abstractC21521l1.mo111171b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f104556a ^ 1000003;
        long j11 = this.f104557b;
        return (i11 * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f104556a + ", eventTimestamp=" + this.f104557b + "}";
    }
}
