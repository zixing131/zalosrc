package er;

/* renamed from: er.a */
/* loaded from: classes4.dex */
public final class C18577a {

    /* renamed from: a */
    private final int f93333a;

    /* renamed from: b */
    private final int f93334b;

    /* renamed from: c */
    private final int f93335c;

    public C18577a(int i11, int i12, int i13) {
        this.f93333a = i11;
        this.f93334b = i12;
        this.f93335c = i13;
    }

    /* renamed from: a */
    public final int m98040a() {
        return this.f93335c;
    }

    /* renamed from: b */
    public final int m98041b() {
        return this.f93334b;
    }

    /* renamed from: c */
    public final int m98042c() {
        return this.f93333a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18577a)) {
            return false;
        }
        C18577a c18577a = (C18577a) obj;
        return this.f93333a == c18577a.f93333a && this.f93334b == c18577a.f93334b && this.f93335c == c18577a.f93335c;
    }

    public int hashCode() {
        return (((this.f93333a * 31) + this.f93334b) * 31) + this.f93335c;
    }

    public String toString() {
        return "FooterState(footerType=" + this.f93333a + ", footerPosition=" + this.f93334b + ", errorCode=" + this.f93335c + ")";
    }
}
