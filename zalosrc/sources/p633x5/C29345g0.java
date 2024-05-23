package p633x5;

/* renamed from: x5.g0 */
/* loaded from: classes2.dex */
final class C29345g0 extends AbstractC29351j0 {

    /* renamed from: a */
    private final String f135820a;

    /* renamed from: b */
    private final boolean f135821b;

    /* renamed from: c */
    private final int f135822c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C29345g0(String str, boolean z11, int i11, AbstractC29343f0 abstractC29343f0) {
        this.f135820a = str;
        this.f135821b = z11;
        this.f135822c = i11;
    }

    @Override // p633x5.AbstractC29351j0
    /* renamed from: a */
    public final int mo146484a() {
        return this.f135822c;
    }

    @Override // p633x5.AbstractC29351j0
    /* renamed from: b */
    public final String mo146485b() {
        return this.f135820a;
    }

    @Override // p633x5.AbstractC29351j0
    /* renamed from: c */
    public final boolean mo146486c() {
        return this.f135821b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC29351j0) {
            AbstractC29351j0 abstractC29351j0 = (AbstractC29351j0) obj;
            if (this.f135820a.equals(abstractC29351j0.mo146485b()) && this.f135821b == abstractC29351j0.mo146486c() && this.f135822c == abstractC29351j0.mo146484a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = this.f135820a.hashCode() ^ 1000003;
        if (true != this.f135821b) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        return (((hashCode * 1000003) ^ i11) * 1000003) ^ this.f135822c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f135820a + ", enableFirelog=" + this.f135821b + ", firelogEventType=" + this.f135822c + "}";
    }
}
