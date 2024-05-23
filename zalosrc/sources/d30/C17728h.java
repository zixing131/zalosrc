package d30;

import fn0.AbstractC19074t;

/* renamed from: d30.h */
/* loaded from: classes5.dex */
public final class C17728h {

    /* renamed from: a */
    private C17727g f89859a;

    /* renamed from: b */
    private float[][] f89860b;

    /* renamed from: c */
    private String f89861c;

    public C17728h(C17727g c17727g, float[][] fArr, String str) {
        AbstractC19074t.m100208f(c17727g, "commonInfo");
        AbstractC19074t.m100208f(fArr, "gradient");
        AbstractC19074t.m100208f(str, "errorCode");
        this.f89859a = c17727g;
        this.f89860b = fArr;
        this.f89861c = str;
    }

    /* renamed from: a */
    public final C17727g m93841a() {
        return this.f89859a;
    }

    /* renamed from: b */
    public final String m93842b() {
        return this.f89861c;
    }

    /* renamed from: c */
    public final float[][] m93843c() {
        return this.f89860b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17728h(String str) {
        this(new C17727g(), new float[0], str);
        AbstractC19074t.m100208f(str, "errorCode");
    }
}
