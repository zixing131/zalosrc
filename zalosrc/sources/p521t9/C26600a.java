package p521t9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t9.a */
/* loaded from: classes.dex */
public final class C26600a extends AbstractC26605f {

    /* renamed from: a */
    private final String f125939a;

    /* renamed from: b */
    private final String f125940b;

    public C26600a(String str, String str2) {
        if (str != null) {
            this.f125939a = str;
            if (str2 != null) {
                this.f125940b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // p521t9.AbstractC26605f
    /* renamed from: b */
    public String mo136555b() {
        return this.f125939a;
    }

    @Override // p521t9.AbstractC26605f
    /* renamed from: c */
    public String mo136556c() {
        return this.f125940b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC26605f)) {
            return false;
        }
        AbstractC26605f abstractC26605f = (AbstractC26605f) obj;
        if (this.f125939a.equals(abstractC26605f.mo136555b()) && this.f125940b.equals(abstractC26605f.mo136556c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f125939a.hashCode() ^ 1000003) * 1000003) ^ this.f125940b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f125939a + ", version=" + this.f125940b + "}";
    }
}
