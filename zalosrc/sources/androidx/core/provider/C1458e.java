package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.AbstractC1487i;
import java.util.List;

/* renamed from: androidx.core.provider.e */
/* loaded from: classes2.dex */
public final class C1458e {

    /* renamed from: a */
    private final String f6295a;

    /* renamed from: b */
    private final String f6296b;

    /* renamed from: c */
    private final String f6297c;

    /* renamed from: d */
    private final List f6298d;

    /* renamed from: e */
    private final int f6299e;

    /* renamed from: f */
    private final String f6300f;

    public C1458e(String str, String str2, String str3, List list) {
        this.f6295a = (String) AbstractC1487i.m7492g(str);
        this.f6296b = (String) AbstractC1487i.m7492g(str2);
        this.f6297c = (String) AbstractC1487i.m7492g(str3);
        this.f6298d = (List) AbstractC1487i.m7492g(list);
        this.f6299e = 0;
        this.f6300f = m7385a(str, str2, str3);
    }

    /* renamed from: a */
    private String m7385a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List m7386b() {
        return this.f6298d;
    }

    /* renamed from: c */
    public int m7387c() {
        return this.f6299e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m7388d() {
        return this.f6300f;
    }

    /* renamed from: e */
    public String m7389e() {
        return this.f6295a;
    }

    /* renamed from: f */
    public String m7390f() {
        return this.f6296b;
    }

    /* renamed from: g */
    public String m7391g() {
        return this.f6297c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f6295a + ", mProviderPackage: " + this.f6296b + ", mQuery: " + this.f6297c + ", mCertificates:");
        for (int i11 = 0; i11 < this.f6298d.size(); i11++) {
            sb2.append(" [");
            List list = (List) this.f6298d.get(i11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f6299e);
        return sb2.toString();
    }

    public C1458e(String str, String str2, String str3, int i11) {
        this.f6295a = (String) AbstractC1487i.m7492g(str);
        this.f6296b = (String) AbstractC1487i.m7492g(str2);
        this.f6297c = (String) AbstractC1487i.m7492g(str3);
        this.f6298d = null;
        AbstractC1487i.m7486a(i11 != 0);
        this.f6299e = i11;
        this.f6300f = m7385a(str, str2, str3);
    }
}
