package p012a6;

/* renamed from: a6.cg */
/* loaded from: classes2.dex */
final class C0199cg extends AbstractC0275gg {

    /* renamed from: a */
    private final String f958a;

    /* renamed from: b */
    private final boolean f959b;

    /* renamed from: c */
    private final int f960c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C0199cg(String str, boolean z11, int i11, AbstractC0180bg abstractC0180bg) {
        this.f958a = str;
        this.f959b = z11;
        this.f960c = i11;
    }

    @Override // p012a6.AbstractC0275gg
    /* renamed from: a */
    public final int mo650a() {
        return this.f960c;
    }

    @Override // p012a6.AbstractC0275gg
    /* renamed from: b */
    public final String mo651b() {
        return this.f958a;
    }

    @Override // p012a6.AbstractC0275gg
    /* renamed from: c */
    public final boolean mo652c() {
        return this.f959b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0275gg) {
            AbstractC0275gg abstractC0275gg = (AbstractC0275gg) obj;
            if (this.f958a.equals(abstractC0275gg.mo651b()) && this.f959b == abstractC0275gg.mo652c() && this.f960c == abstractC0275gg.mo650a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = this.f958a.hashCode() ^ 1000003;
        if (true != this.f959b) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        return (((hashCode * 1000003) ^ i11) * 1000003) ^ this.f960c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f958a + ", enableFirelog=" + this.f959b + ", firelogEventType=" + this.f960c + "}";
    }
}
