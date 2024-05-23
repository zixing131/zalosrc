package p301kl;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.io.File;
import org.json.JSONObject;

/* renamed from: kl.a */
/* loaded from: classes3.dex */
public final class C21757a {

    /* renamed from: a */
    private final File f105647a;

    /* renamed from: b */
    private final long f105648b;

    /* renamed from: c */
    private final long f105649c;

    /* renamed from: d */
    private final String f105650d;

    /* renamed from: e */
    private final String f105651e;

    /* renamed from: f */
    private final int f105652f;

    /* renamed from: g */
    private final boolean f105653g;

    /* renamed from: h */
    private final JSONObject f105654h;

    public C21757a(File file, long j11, long j12, String str, String str2, int i11, boolean z11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(file, "uploadFile");
        AbstractC19074t.m100208f(str, "publicKey");
        AbstractC19074t.m100208f(str2, "encryptedKey");
        AbstractC19074t.m100208f(jSONObject, "infoObject");
        this.f105647a = file;
        this.f105648b = j11;
        this.f105649c = j12;
        this.f105650d = str;
        this.f105651e = str2;
        this.f105652f = i11;
        this.f105653g = z11;
        this.f105654h = jSONObject;
    }

    /* renamed from: a */
    public final long m112235a() {
        return this.f105648b;
    }

    /* renamed from: b */
    public final String m112236b() {
        return this.f105651e;
    }

    /* renamed from: c */
    public final long m112237c() {
        return this.f105649c;
    }

    /* renamed from: d */
    public final JSONObject m112238d() {
        return this.f105654h;
    }

    /* renamed from: e */
    public final String m112239e() {
        return this.f105650d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21757a)) {
            return false;
        }
        C21757a c21757a = (C21757a) obj;
        return AbstractC19074t.m100204b(this.f105647a, c21757a.f105647a) && this.f105648b == c21757a.f105648b && this.f105649c == c21757a.f105649c && AbstractC19074t.m100204b(this.f105650d, c21757a.f105650d) && AbstractC19074t.m100204b(this.f105651e, c21757a.f105651e) && this.f105652f == c21757a.f105652f && this.f105653g == c21757a.f105653g && AbstractC19074t.m100204b(this.f105654h, c21757a.f105654h);
    }

    /* renamed from: f */
    public final int m112240f() {
        return this.f105652f;
    }

    /* renamed from: g */
    public final File m112241g() {
        return this.f105647a;
    }

    /* renamed from: h */
    public final boolean m112242h() {
        return this.f105653g;
    }

    public int hashCode() {
        return (((((((((((((this.f105647a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f105648b)) * 31) + AbstractC2147g0.m11521a(this.f105649c)) * 31) + this.f105650d.hashCode()) * 31) + this.f105651e.hashCode()) * 31) + this.f105652f) * 31) + AbstractC2144f.m11520a(this.f105653g)) * 31) + this.f105654h.hashCode();
    }

    public String toString() {
        return "TransferDBParams(uploadFile=" + this.f105647a + ", clientTime=" + this.f105648b + ", fromSeqId=" + this.f105649c + ", publicKey=" + this.f105650d + ", encryptedKey=" + this.f105651e + ", retrySource=" + this.f105652f + ", isTransferFull=" + this.f105653g + ", infoObject=" + this.f105654h + ")";
    }
}
