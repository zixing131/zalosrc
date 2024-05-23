package p467r;

import java.net.URL;
import p562v.AbstractC27392e;

/* renamed from: r.k */
/* loaded from: classes2.dex */
public final class C25588k {

    /* renamed from: a */
    private final String f122315a;

    /* renamed from: b */
    private final URL f122316b;

    /* renamed from: c */
    private final String f122317c;

    private C25588k(String str, URL url, String str2) {
        this.f122315a = str;
        this.f122316b = url;
        this.f122317c = str2;
    }

    /* renamed from: b */
    public static C25588k m132156b(String str, URL url, String str2) {
        AbstractC27392e.m140338d(str, "VendorKey is null or empty");
        AbstractC27392e.m140336b(url, "ResourceURL is null");
        AbstractC27392e.m140338d(str2, "VerificationParameters is null or empty");
        return new C25588k(str, url, str2);
    }

    /* renamed from: a */
    public URL m132157a() {
        return this.f122316b;
    }

    /* renamed from: c */
    public String m132158c() {
        return this.f122315a;
    }

    /* renamed from: d */
    public String m132159d() {
        return this.f122317c;
    }
}
