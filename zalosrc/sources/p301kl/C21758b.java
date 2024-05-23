package p301kl;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: kl.b */
/* loaded from: classes3.dex */
public final class C21758b {

    /* renamed from: a */
    private final String f105655a;

    /* renamed from: b */
    private final String f105656b;

    /* renamed from: c */
    private final int f105657c;

    /* renamed from: d */
    private final int f105658d;

    /* renamed from: e */
    private final String f105659e;

    /* renamed from: f */
    private final boolean f105660f;

    public C21758b(String str, String str2, int i11, int i12, String str3, boolean z11) {
        AbstractC19074t.m100208f(str, "pcName");
        AbstractC19074t.m100208f(str2, "publicKey");
        AbstractC19074t.m100208f(str3, "errorMessage");
        this.f105655a = str;
        this.f105656b = str2;
        this.f105657c = i11;
        this.f105658d = i12;
        this.f105659e = str3;
        this.f105660f = z11;
    }

    /* renamed from: a */
    public final boolean m112243a() {
        return this.f105660f;
    }

    /* renamed from: b */
    public final int m112244b() {
        return this.f105658d;
    }

    /* renamed from: c */
    public final String m112245c() {
        return this.f105659e;
    }

    /* renamed from: d */
    public final String m112246d() {
        return this.f105655a;
    }

    /* renamed from: e */
    public final String m112247e() {
        return this.f105656b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21758b)) {
            return false;
        }
        C21758b c21758b = (C21758b) obj;
        return AbstractC19074t.m100204b(this.f105655a, c21758b.f105655a) && AbstractC19074t.m100204b(this.f105656b, c21758b.f105656b) && this.f105657c == c21758b.f105657c && this.f105658d == c21758b.f105658d && AbstractC19074t.m100204b(this.f105659e, c21758b.f105659e) && this.f105660f == c21758b.f105660f;
    }

    /* renamed from: f */
    public final int m112248f() {
        return this.f105657c;
    }

    public int hashCode() {
        return (((((((((this.f105655a.hashCode() * 31) + this.f105656b.hashCode()) * 31) + this.f105657c) * 31) + this.f105658d) * 31) + this.f105659e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f105660f);
    }

    public String toString() {
        return "TransferStatusParams(pcName=" + this.f105655a + ", publicKey=" + this.f105656b + ", status=" + this.f105657c + ", errorCode=" + this.f105658d + ", errorMessage=" + this.f105659e + ", canRetry=" + this.f105660f + ")";
    }
}
