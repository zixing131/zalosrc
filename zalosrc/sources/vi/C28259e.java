package vi;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* renamed from: vi.e */
/* loaded from: classes3.dex */
public final class C28259e {

    /* renamed from: a */
    private final String f131760a;

    /* renamed from: b */
    private final String f131761b;

    /* renamed from: c */
    private String f131762c;

    /* renamed from: d */
    private final long f131763d;

    public C28259e(String str, String str2, String str3, long j11) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "checksumMd5");
        AbstractC19074t.m100208f(str3, "sessionURL");
        this.f131760a = str;
        this.f131761b = str2;
        this.f131762c = str3;
        this.f131763d = j11;
    }

    /* renamed from: a */
    public final String m142298a() {
        return this.f131761b;
    }

    /* renamed from: b */
    public final String m142299b() {
        return this.f131760a;
    }

    /* renamed from: c */
    public final String m142300c() {
        return this.f131762c;
    }

    /* renamed from: d */
    public final long m142301d() {
        return this.f131763d;
    }

    /* renamed from: e */
    public final void m142302e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131762c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28259e)) {
            return false;
        }
        C28259e c28259e = (C28259e) obj;
        return AbstractC19074t.m100204b(this.f131760a, c28259e.f131760a) && AbstractC19074t.m100204b(this.f131761b, c28259e.f131761b) && AbstractC19074t.m100204b(this.f131762c, c28259e.f131762c) && this.f131763d == c28259e.f131763d;
    }

    public int hashCode() {
        return (((((this.f131760a.hashCode() * 31) + this.f131761b.hashCode()) * 31) + this.f131762c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f131763d);
    }

    public String toString() {
        return "SessionResumableInfo(name=" + this.f131760a + ", checksumMd5=" + this.f131761b + ", sessionURL=" + this.f131762c + ", timestamp=" + this.f131763d + ")";
    }
}
