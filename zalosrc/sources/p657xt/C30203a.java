package p657xt;

import com.zing.zalo.leveldb.AbstractC8942a;
import fn0.AbstractC19074t;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: xt.a */
/* loaded from: classes.dex */
public final class C30203a {

    /* renamed from: a */
    private final AbstractC8942a f140316a;

    /* renamed from: b */
    private final long f140317b;

    /* renamed from: c */
    private final String f140318c;

    public C30203a(AbstractC8942a abstractC8942a, long j11) {
        AbstractC19074t.m100208f(abstractC8942a, "mLevelDB");
        this.f140316a = abstractC8942a;
        this.f140317b = j11;
        this.f140318c = "Iterator";
    }

    /* renamed from: a */
    public final void m148954a() {
        this.f140316a.mo47682b(this);
    }

    /* renamed from: b */
    public final long m148955b() {
        return this.f140317b;
    }

    /* renamed from: c */
    public final String m148956c() {
        byte[] m148957d = m148957d();
        if (m148957d != null) {
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            return new String(m148957d, charset);
        }
        return null;
    }

    /* renamed from: d */
    public final byte[] m148957d() {
        return this.f140316a.mo47688q(this);
    }

    /* renamed from: e */
    public final byte[] m148958e() {
        return this.f140316a.mo47689r(this);
    }

    /* renamed from: f */
    public final boolean m148959f() {
        return this.f140316a.mo47677F(this);
    }

    /* renamed from: g */
    public final void m148960g() {
        this.f140316a.mo47690s(this);
    }

    /* renamed from: h */
    public final void m148961h() {
        this.f140316a.mo47676E(this);
    }
}
