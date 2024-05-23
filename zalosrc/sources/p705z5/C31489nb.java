package p705z5;

/* renamed from: z5.nb */
/* loaded from: classes2.dex */
final class C31489nb extends AbstractC31545rb {

    /* renamed from: a */
    private final String f144991a;

    /* renamed from: b */
    private final boolean f144992b;

    /* renamed from: c */
    private final int f144993c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C31489nb(String str, boolean z11, int i11, AbstractC31461lb abstractC31461lb) {
        this.f144991a = str;
        this.f144992b = z11;
        this.f144993c = i11;
    }

    @Override // p705z5.AbstractC31545rb
    /* renamed from: a */
    public final int mo152323a() {
        return this.f144993c;
    }

    @Override // p705z5.AbstractC31545rb
    /* renamed from: b */
    public final String mo152324b() {
        return this.f144991a;
    }

    @Override // p705z5.AbstractC31545rb
    /* renamed from: c */
    public final boolean mo152325c() {
        return this.f144992b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC31545rb) {
            AbstractC31545rb abstractC31545rb = (AbstractC31545rb) obj;
            if (this.f144991a.equals(abstractC31545rb.mo152324b()) && this.f144992b == abstractC31545rb.mo152325c() && this.f144993c == abstractC31545rb.mo152323a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = this.f144991a.hashCode() ^ 1000003;
        if (true != this.f144992b) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        return (((hashCode * 1000003) ^ i11) * 1000003) ^ this.f144993c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f144991a + ", enableFirelog=" + this.f144992b + ", firelogEventType=" + this.f144993c + "}";
    }
}
