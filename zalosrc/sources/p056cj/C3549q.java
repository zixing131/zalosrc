package p056cj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: cj.q */
/* loaded from: classes3.dex */
public final class C3549q extends AbstractC3552t {

    /* renamed from: a */
    private final String f14989a;

    /* renamed from: b */
    private final long f14990b;

    /* renamed from: c */
    private final String f14991c;

    /* renamed from: d */
    private final String f14992d;

    /* renamed from: e */
    private final int f14993e;

    /* renamed from: f */
    private Integer f14994f;

    /* renamed from: g */
    private String f14995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3549q(String str, long j11, String str2, String str3, int i11, Integer num, String str4) {
        super(null);
        AbstractC19074t.m100208f(str, "fileName");
        AbstractC19074t.m100208f(str2, "fileExt");
        AbstractC19074t.m100208f(str3, "thumbUrl");
        this.f14989a = str;
        this.f14990b = j11;
        this.f14991c = str2;
        this.f14992d = str3;
        this.f14993e = i11;
        this.f14994f = num;
        this.f14995g = str4;
    }

    /* renamed from: a */
    public final String m18038a() {
        return this.f14991c;
    }

    /* renamed from: b */
    public final Integer m18039b() {
        return this.f14994f;
    }

    /* renamed from: c */
    public final String m18040c() {
        return this.f14989a;
    }

    /* renamed from: d */
    public final long m18041d() {
        return this.f14990b;
    }

    /* renamed from: e */
    public final int m18042e() {
        return this.f14993e;
    }

    /* renamed from: f */
    public final String m18043f() {
        return this.f14992d;
    }

    /* renamed from: g */
    public final void m18044g(Integer num) {
        this.f14994f = num;
    }

    public /* synthetic */ C3549q(String str, long j11, String str2, String str3, int i11, Integer num, String str4, int i12, AbstractC19060k abstractC19060k) {
        this(str, j11, str2, str3, i11, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : str4);
    }
}
