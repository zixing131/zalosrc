package sl;

import fn0.AbstractC19074t;

/* renamed from: sl.a */
/* loaded from: classes3.dex */
public final class C26316a {

    /* renamed from: a */
    private final String f124971a;

    /* renamed from: b */
    private final String f124972b;

    /* renamed from: c */
    private final String f124973c;

    /* renamed from: d */
    private final int f124974d;

    public C26316a(String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "encryptKeyHash");
        AbstractC19074t.m100208f(str2, "newEncryptedPrivateKey");
        AbstractC19074t.m100208f(str3, "newEncryptKeyHash");
        this.f124971a = str;
        this.f124972b = str2;
        this.f124973c = str3;
        this.f124974d = i11;
    }

    /* renamed from: a */
    public final String m135445a() {
        return this.f124971a;
    }

    /* renamed from: b */
    public final int m135446b() {
        return this.f124974d;
    }

    /* renamed from: c */
    public final String m135447c() {
        return this.f124973c;
    }

    /* renamed from: d */
    public final String m135448d() {
        return this.f124972b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26316a)) {
            return false;
        }
        C26316a c26316a = (C26316a) obj;
        return AbstractC19074t.m100204b(this.f124971a, c26316a.f124971a) && AbstractC19074t.m100204b(this.f124972b, c26316a.f124972b) && AbstractC19074t.m100204b(this.f124973c, c26316a.f124973c) && this.f124974d == c26316a.f124974d;
    }

    public int hashCode() {
        return (((((this.f124971a.hashCode() * 31) + this.f124972b.hashCode()) * 31) + this.f124973c.hashCode()) * 31) + this.f124974d;
    }

    public String toString() {
        return "ChangeBackupKeyParams(encryptKeyHash=" + this.f124971a + ", newEncryptedPrivateKey=" + this.f124972b + ", newEncryptKeyHash=" + this.f124973c + ", encryptType=" + this.f124974d + ")";
    }
}
