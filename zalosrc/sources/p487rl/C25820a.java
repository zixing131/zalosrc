package p487rl;

import fn0.AbstractC19074t;

/* renamed from: rl.a */
/* loaded from: classes3.dex */
public final class C25820a {

    /* renamed from: a */
    private final int f123151a;

    /* renamed from: b */
    private final String f123152b;

    /* renamed from: c */
    private final String f123153c;

    /* renamed from: d */
    private final String f123154d;

    public C25820a(int i11, String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "publicKey");
        AbstractC19074t.m100208f(str2, "hardwareSecuredPrivateKey");
        AbstractC19074t.m100208f(str3, "sha256Checksum");
        this.f123151a = i11;
        this.f123152b = str;
        this.f123153c = str2;
        this.f123154d = str3;
    }

    /* renamed from: a */
    public final String m133134a() {
        return this.f123153c;
    }

    /* renamed from: b */
    public final int m133135b() {
        return this.f123151a;
    }

    /* renamed from: c */
    public final String m133136c() {
        return this.f123152b;
    }

    /* renamed from: d */
    public final String m133137d() {
        return this.f123154d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25820a)) {
            return false;
        }
        C25820a c25820a = (C25820a) obj;
        return this.f123151a == c25820a.f123151a && AbstractC19074t.m100204b(this.f123152b, c25820a.f123152b) && AbstractC19074t.m100204b(this.f123153c, c25820a.f123153c) && AbstractC19074t.m100204b(this.f123154d, c25820a.f123154d);
    }

    public int hashCode() {
        return (((((this.f123151a * 31) + this.f123152b.hashCode()) * 31) + this.f123153c.hashCode()) * 31) + this.f123154d.hashCode();
    }

    public String toString() {
        return "CloudKey(keyVersion=" + this.f123151a + ", publicKey=" + this.f123152b + ", hardwareSecuredPrivateKey=" + this.f123153c + ", sha256Checksum=" + this.f123154d + ")";
    }
}
