package p670y5;

/* renamed from: y5.ag */
/* loaded from: classes2.dex */
final class C30313ag extends AbstractC30409fg {

    /* renamed from: a */
    private final String f140713a;

    /* renamed from: b */
    private final boolean f140714b;

    /* renamed from: c */
    private final int f140715c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C30313ag(String str, boolean z11, int i11, AbstractC30788zf abstractC30788zf) {
        this.f140713a = str;
        this.f140714b = z11;
        this.f140715c = i11;
    }

    @Override // p670y5.AbstractC30409fg
    /* renamed from: a */
    public final int mo149458a() {
        return this.f140715c;
    }

    @Override // p670y5.AbstractC30409fg
    /* renamed from: b */
    public final String mo149459b() {
        return this.f140713a;
    }

    @Override // p670y5.AbstractC30409fg
    /* renamed from: c */
    public final boolean mo149460c() {
        return this.f140714b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC30409fg) {
            AbstractC30409fg abstractC30409fg = (AbstractC30409fg) obj;
            if (this.f140713a.equals(abstractC30409fg.mo149459b()) && this.f140714b == abstractC30409fg.mo149460c() && this.f140715c == abstractC30409fg.mo149458a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = this.f140713a.hashCode() ^ 1000003;
        if (true != this.f140714b) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        return (((hashCode * 1000003) ^ i11) * 1000003) ^ this.f140715c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f140713a + ", enableFirelog=" + this.f140714b + ", firelogEventType=" + this.f140715c + "}";
    }
}
