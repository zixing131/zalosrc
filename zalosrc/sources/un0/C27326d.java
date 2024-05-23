package un0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import wn0.AbstractC29112b;

/* renamed from: un0.d */
/* loaded from: classes7.dex */
public final class C27326d {

    /* renamed from: a */
    private boolean f128583a;

    /* renamed from: b */
    private boolean f128584b;

    /* renamed from: c */
    private boolean f128585c;

    /* renamed from: d */
    private boolean f128586d;

    /* renamed from: e */
    private boolean f128587e;

    /* renamed from: f */
    private boolean f128588f;

    /* renamed from: g */
    private String f128589g;

    /* renamed from: h */
    private boolean f128590h;

    /* renamed from: i */
    private boolean f128591i;

    /* renamed from: j */
    private String f128592j;

    /* renamed from: k */
    private boolean f128593k;

    /* renamed from: l */
    private boolean f128594l;

    /* renamed from: m */
    private AbstractC29112b f128595m;

    public C27326d(AbstractC27323a abstractC27323a) {
        AbstractC19074t.m100208f(abstractC27323a, "json");
        this.f128583a = abstractC27323a.m139869f().m139888e();
        this.f128584b = abstractC27323a.m139869f().m139889f();
        this.f128585c = abstractC27323a.m139869f().m139890g();
        this.f128586d = abstractC27323a.m139869f().m139896m();
        this.f128587e = abstractC27323a.m139869f().m139885b();
        this.f128588f = abstractC27323a.m139869f().m139892i();
        this.f128589g = abstractC27323a.m139869f().m139893j();
        this.f128590h = abstractC27323a.m139869f().m139887d();
        this.f128591i = abstractC27323a.m139869f().m139895l();
        this.f128592j = abstractC27323a.m139869f().m139886c();
        this.f128593k = abstractC27323a.m139869f().m139884a();
        this.f128594l = abstractC27323a.m139869f().m139894k();
        abstractC27323a.m139869f().m139891h();
        this.f128595m = abstractC27323a.mo131586a();
    }

    /* renamed from: a */
    public final C27328f m139876a() {
        if (this.f128591i && !AbstractC19074t.m100204b(this.f128592j, ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (!this.f128588f) {
            if (!AbstractC19074t.m100204b(this.f128589g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!AbstractC19074t.m100204b(this.f128589g, "    ")) {
            String str = this.f128589g;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f128589g).toString());
                }
            }
        }
        return new C27328f(this.f128583a, this.f128585c, this.f128586d, this.f128587e, this.f128588f, this.f128584b, this.f128589g, this.f128590h, this.f128591i, this.f128592j, this.f128593k, this.f128594l, null);
    }

    /* renamed from: b */
    public final AbstractC29112b m139877b() {
        return this.f128595m;
    }

    /* renamed from: c */
    public final void m139878c(boolean z11) {
        this.f128590h = z11;
    }

    /* renamed from: d */
    public final void m139879d(boolean z11) {
        this.f128583a = z11;
    }

    /* renamed from: e */
    public final void m139880e(boolean z11) {
        this.f128584b = z11;
    }

    /* renamed from: f */
    public final void m139881f(boolean z11) {
        this.f128585c = z11;
    }

    /* renamed from: g */
    public final void m139882g(boolean z11) {
        this.f128586d = z11;
    }

    /* renamed from: h */
    public final void m139883h(boolean z11) {
        this.f128588f = z11;
    }
}
