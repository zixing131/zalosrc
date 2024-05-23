package p492rr;

import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ge.C19415g;
import hm0.C20096c;
import java.util.Iterator;
import java.util.List;
import p205hc.AbstractC19963b;
import p492rr.C25972o;
import p716zh.C32002l4;
import pm0.C24860q;

/* renamed from: rr.m */
/* loaded from: classes4.dex */
public final class C25970m extends AbstractC19963b {

    /* renamed from: A */
    private final C1761c0 f123904A;

    /* renamed from: B */
    private final C1761c0 f123905B;

    /* renamed from: C */
    private C25968k f123906C;

    /* renamed from: D */
    private long f123907D;

    /* renamed from: E */
    private C32002l4 f123908E;

    /* renamed from: F */
    private final a f123909F;

    /* renamed from: G */
    private C24860q f123910G;

    /* renamed from: H */
    private boolean f123911H;

    /* renamed from: t */
    private final C25972o f123912t;

    /* renamed from: u */
    private final C25960c f123913u;

    /* renamed from: v */
    private final C1761c0 f123914v;

    /* renamed from: w */
    private final C1761c0 f123915w;

    /* renamed from: x */
    private final C1761c0 f123916x;

    /* renamed from: y */
    private final C1761c0 f123917y;

    /* renamed from: z */
    private C19415g f123918z;

    /* renamed from: rr.m$a */
    /* loaded from: classes4.dex */
    public static final class a implements C25972o.a {
        a() {
        }

        @Override // p492rr.C25972o.a
        /* renamed from: a */
        public void mo133777a() {
            C25970m.this.m133758e0();
        }

        @Override // p492rr.C25972o.a
        /* renamed from: b */
        public void mo133778b(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            C25970m.this.m133757c0();
        }
    }

    public C25970m(C25972o c25972o, C25960c c25960c) {
        AbstractC19074t.m100208f(c25972o, "repository");
        AbstractC19074t.m100208f(c25960c, "dateManipulator");
        this.f123912t = c25972o;
        this.f123913u = c25960c;
        this.f123914v = new C1761c0();
        this.f123915w = new C1761c0(EnumC25958a.f123882s);
        this.f123916x = new C1761c0();
        this.f123917y = new C1761c0();
        this.f123904A = new C1761c0(EnumC25969l.f123900p);
        this.f123905B = new C1761c0(EnumC25974q.f123929q);
        this.f123906C = new C25968k(false, null, null, false, 0, 31, null);
        this.f123908E = C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_HAVE_ATTACHMENT_STREAM);
        this.f123909F = new a();
        this.f123910G = new C24860q(-1, -1L);
    }

    /* renamed from: R */
    private final void m133753R() {
        this.f123905B.mo9224q(m133756a0());
    }

    /* renamed from: S */
    private final void m133754S(C25968k c25968k) {
        if (c25968k.m133746f() == 5) {
            m133775n0(EnumC25969l.f123901q);
        }
    }

    /* renamed from: T */
    private final void m133755T() {
        this.f123905B.mo9221n(m133756a0());
    }

    /* renamed from: a0 */
    private final EnumC25974q m133756a0() {
        if (this.f123911H) {
            return EnumC25974q.f123930r;
        }
        if (m133765V().mo9215f() == null) {
            return EnumC25974q.f123929q;
        }
        C25968k c25968k = (C25968k) m133765V().mo9215f();
        if (c25968k != null && c25968k.m133746f() == 5 && this.f123918z == null) {
            return EnumC25974q.f123929q;
        }
        if (!m133759f0()) {
            return EnumC25974q.f123928p;
        }
        return EnumC25974q.f123929q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public final void m133757c0() {
        this.f123915w.mo9221n(EnumC25958a.f123880q);
        this.f123911H = false;
        m133755T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m133758e0() {
        this.f123912t.m133786h(((Number) this.f123910G.m129215c()).intValue(), ((Number) this.f123910G.m129216d()).longValue());
        this.f123915w.mo9221n(EnumC25958a.f123881r);
        this.f123911H = false;
        m133755T();
    }

    /* renamed from: f0 */
    private final boolean m133759f0() {
        C19415g c19415g;
        C25968k c25968k = (C25968k) m133765V().mo9215f();
        if (c25968k == null || c25968k.m133746f() != this.f123906C.m133746f()) {
            return false;
        }
        if (c25968k.m133746f() == 5 && (c19415g = this.f123918z) != null && m133766W() != this.f123913u.m133740a(c19415g)) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    private final boolean m133760g0() {
        if (m133769Z().mo9215f() == EnumC25974q.f123928p) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    private final void m133761k0() {
        this.f123914v.mo9224q(this.f123912t.m133781b());
    }

    /* renamed from: m0 */
    private final void m133762m0(C25968k c25968k) {
        boolean z11;
        this.f123916x.mo9224q(c25968k);
        List<C25968k> list = (List) this.f123914v.mo9215f();
        if (list != null) {
            for (C25968k c25968k2 : list) {
                if (c25968k2.m133746f() == c25968k.m133746f()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c25968k2.m133748h(z11);
            }
        }
        m133753R();
    }

    /* renamed from: Q */
    public final void m133763Q(C25975r c25975r) {
        AbstractC19074t.m100208f(c25975r, "args");
        this.f123908E.m154273c(c25975r.m133798a());
    }

    /* renamed from: U */
    public final LiveData m133764U() {
        return this.f123915w;
    }

    /* renamed from: V */
    public final LiveData m133765V() {
        return this.f123916x;
    }

    /* renamed from: W */
    public final long m133766W() {
        if (this.f123906C.m133746f() == 5) {
            return this.f123907D;
        }
        return 0L;
    }

    /* renamed from: X */
    public final LiveData m133767X() {
        return this.f123914v;
    }

    /* renamed from: Y */
    public final LiveData m133768Y() {
        return this.f123917y;
    }

    /* renamed from: Z */
    public final LiveData m133769Z() {
        return this.f123905B;
    }

    /* renamed from: b0 */
    public final LiveData m133770b0() {
        return this.f123904A;
    }

    public final void close() {
        this.f123915w.mo9224q(EnumC25958a.f123879p);
    }

    /* renamed from: h0 */
    public final void m133771h0() {
        C19415g c19415g = (C19415g) m133768Y().mo9215f();
        this.f123918z = c19415g;
        if (c19415g != null) {
            this.f123912t.m133787i(this.f123913u.m133740a(c19415g));
            m133761k0();
        }
        m133775n0(EnumC25969l.f123900p);
        m133753R();
    }

    /* renamed from: i0 */
    public final void m133772i0(C25968k c25968k) {
        AbstractC19074t.m100208f(c25968k, "feedVisibleTimeLimitOptionsData");
        m133762m0(c25968k);
        m133754S(c25968k);
    }

    /* renamed from: j0 */
    public final void m133773j0(int i11, int i12, int i13) {
        this.f123917y.mo9224q(new C19415g(i13, i12, i11));
    }

    /* renamed from: l0 */
    public final void m133774l0() {
        this.f123912t.m133783e();
        Iterator it = this.f123912t.m133781b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C25968k c25968k = (C25968k) it.next();
            if (c25968k.m133747g()) {
                this.f123906C = C25968k.m133741b(c25968k, false, null, null, false, 0, 31, null);
                if (c25968k.m133746f() == 5) {
                    this.f123907D = this.f123912t.m133780a();
                }
            }
        }
        m133761k0();
        m133762m0(this.f123906C);
    }

    /* renamed from: n0 */
    public final void m133775n0(EnumC25969l enumC25969l) {
        AbstractC19074t.m100208f(enumC25969l, "viewMode");
        this.f123904A.mo9224q(enumC25969l);
    }

    /* renamed from: o0 */
    public final void m133776o0() {
        if (m133760g0() && !this.f123911H) {
            this.f123912t.m133784f(this.f123909F);
            C25968k c25968k = (C25968k) m133765V().mo9215f();
            if (c25968k == null) {
                c25968k = new C25968k(false, null, null, false, 0, 31, null);
            }
            if (c25968k.m133746f() == 5) {
                C19415g c19415g = this.f123918z;
                if (c19415g != null) {
                    C24860q m133791c = C25973p.f123927a.m133791c(c25968k.m133746f(), this.f123913u.m133740a(c19415g));
                    this.f123910G = m133791c;
                    this.f123911H = true;
                    this.f123912t.m133785g(28, ((Number) m133791c.m129215c()).intValue(), ((Number) m133791c.m129216d()).longValue(), this.f123908E);
                    m133753R();
                    return;
                }
                return;
            }
            if (c25968k.m133746f() != 0) {
                C24860q m133788d = C25973p.m133788d(C25973p.f123927a, c25968k.m133746f(), 0L, 2, null);
                this.f123910G = m133788d;
                this.f123911H = true;
                this.f123912t.m133785g(28, ((Number) m133788d.m129215c()).intValue(), ((Number) m133788d.m129216d()).longValue(), this.f123908E);
                m133753R();
            }
        }
    }
}
