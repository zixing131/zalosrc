package im;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import on0.AbstractC24342w;
import p239ih.C20556f;

/* renamed from: im.k */
/* loaded from: classes3.dex */
public final class C20620k extends AbstractC20613d {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final long f101400a;

    /* renamed from: b */
    private final long f101401b;

    /* renamed from: c */
    private final String f101402c;

    /* renamed from: d */
    private final int f101403d;

    /* renamed from: e */
    private final int f101404e;

    /* renamed from: f */
    private final double f101405f;

    /* renamed from: g */
    private final double f101406g;

    /* renamed from: h */
    private final double f101407h;

    /* renamed from: i */
    private final String f101408i;

    /* renamed from: j */
    private final String f101409j;

    /* renamed from: k */
    private final int f101410k;

    /* renamed from: l */
    private final int f101411l;

    /* renamed from: m */
    private final int f101412m;

    /* renamed from: n */
    private final int f101413n;

    /* renamed from: o */
    private final int f101414o;

    /* renamed from: p */
    private final boolean f101415p;

    /* renamed from: q */
    private final int f101416q;

    /* renamed from: r */
    private final String f101417r;

    /* renamed from: s */
    private final boolean f101418s;

    /* renamed from: im.k$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public long f101419a;

        /* renamed from: b */
        public long f101420b;

        /* renamed from: d */
        public int f101422d;

        /* renamed from: e */
        public int f101423e;

        /* renamed from: f */
        public double f101424f;

        /* renamed from: g */
        public double f101425g;

        /* renamed from: h */
        public double f101426h;

        /* renamed from: k */
        public int f101429k;

        /* renamed from: l */
        public int f101430l;

        /* renamed from: m */
        public int f101431m;

        /* renamed from: n */
        public int f101432n;

        /* renamed from: p */
        public boolean f101434p;

        /* renamed from: r */
        public String f101436r;

        /* renamed from: s */
        public boolean f101437s;

        /* renamed from: c */
        public String f101421c = "";

        /* renamed from: i */
        public String f101427i = "";

        /* renamed from: j */
        public String f101428j = "";

        /* renamed from: o */
        public int f101433o = -1;

        /* renamed from: q */
        public int f101435q = 3;

        /* renamed from: a */
        public final C20620k m107350a() {
            return new C20620k(this, null);
        }

        /* renamed from: b */
        public final a m107351b(String str) {
            this.f101436r = str;
            return this;
        }

        /* renamed from: c */
        public final a m107352c(double d11) {
            this.f101426h = d11;
            return this;
        }

        /* renamed from: d */
        public final a m107353d(String str) {
            AbstractC19074t.m100208f(str, "ext");
            this.f101421c = str;
            return this;
        }

        /* renamed from: e */
        public final a m107354e(String str) {
            AbstractC19074t.m100208f(str, "fileName");
            this.f101427i = str;
            return this;
        }

        /* renamed from: f */
        public final a m107355f(boolean z11) {
            this.f101434p = z11;
            return this;
        }

        /* renamed from: g */
        public final a m107356g(int i11) {
            this.f101423e = i11;
            return this;
        }

        /* renamed from: h */
        public final a m107357h(double d11) {
            this.f101425g = d11;
            return this;
        }

        /* renamed from: i */
        public final a m107358i(double d11) {
            this.f101424f = d11;
            return this;
        }

        /* renamed from: j */
        public final a m107359j(int i11) {
            this.f101433o = i11;
            return this;
        }

        /* renamed from: k */
        public final a m107360k(boolean z11) {
            this.f101437s = z11;
            return this;
        }

        /* renamed from: l */
        public final a m107361l(int i11) {
            this.f101435q = i11;
            return this;
        }

        /* renamed from: m */
        public final a m107362m(long j11) {
            this.f101420b = j11;
            return this;
        }

        /* renamed from: n */
        public final a m107363n(String str) {
            int m127177f0;
            try {
                if (!TextUtils.isEmpty(str)) {
                    C20556f c20556f = new C20556f(str);
                    if (c20556f.m106830b()) {
                        this.f101420b = c20556f.m106845r();
                        String m106835h = c20556f.m106835h();
                        if (!TextUtils.isEmpty(m106835h)) {
                            AbstractC19074t.m100205c(m106835h);
                            m127177f0 = AbstractC24342w.m127177f0(m106835h, '.', 0, false, 6, null);
                            if (m127177f0 != -1) {
                                m106835h = m106835h.substring(0, m127177f0);
                                AbstractC19074t.m100207e(m106835h, "substring(...)");
                            }
                        } else {
                            m106835h = "";
                        }
                        this.f101427i = m106835h;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return this;
        }

        /* renamed from: o */
        public final a m107364o(long j11) {
            this.f101419a = j11;
            return this;
        }

        /* renamed from: p */
        public final a m107365p(int i11) {
            this.f101429k = i11;
            return this;
        }

        /* renamed from: q */
        public final a m107366q(String str) {
            AbstractC19074t.m100208f(str, "videoCodec");
            this.f101428j = str;
            return this;
        }

        /* renamed from: r */
        public final a m107367r(int i11) {
            this.f101430l = i11;
            return this;
        }

        /* renamed from: s */
        public final a m107368s(int i11) {
            this.f101432n = i11;
            return this;
        }

        /* renamed from: t */
        public final a m107369t(int i11) {
            this.f101431m = i11;
            return this;
        }

        /* renamed from: u */
        public final a m107370u(int i11) {
            this.f101422d = i11;
            return this;
        }
    }

    /* renamed from: im.k$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final a m107371a() {
            return new a();
        }
    }

    public /* synthetic */ C20620k(a aVar, AbstractC19060k abstractC19060k) {
        this(aVar);
    }

    /* renamed from: a */
    public static final a m107330a() {
        return Companion.m107371a();
    }

    /* renamed from: b */
    public final String m107331b() {
        return this.f101417r;
    }

    /* renamed from: c */
    public final double m107332c() {
        return this.f101407h;
    }

    /* renamed from: d */
    public final String m107333d() {
        return this.f101402c;
    }

    /* renamed from: e */
    public final String m107334e() {
        return this.f101408i;
    }

    /* renamed from: f */
    public final boolean m107335f() {
        return this.f101415p;
    }

    /* renamed from: g */
    public final int m107336g() {
        return this.f101404e;
    }

    /* renamed from: h */
    public final double m107337h() {
        return this.f101406g;
    }

    /* renamed from: i */
    public final double m107338i() {
        return this.f101405f;
    }

    /* renamed from: j */
    public final int m107339j() {
        return this.f101414o;
    }

    /* renamed from: k */
    public final int m107340k() {
        return this.f101416q;
    }

    /* renamed from: l */
    public final long m107341l() {
        return this.f101401b;
    }

    /* renamed from: m */
    public final long m107342m() {
        return this.f101400a;
    }

    /* renamed from: n */
    public final int m107343n() {
        return this.f101410k;
    }

    /* renamed from: o */
    public final String m107344o() {
        return this.f101409j;
    }

    /* renamed from: p */
    public final int m107345p() {
        return this.f101411l;
    }

    /* renamed from: q */
    public final int m107346q() {
        return this.f101413n;
    }

    /* renamed from: r */
    public final int m107347r() {
        return this.f101412m;
    }

    /* renamed from: s */
    public final int m107348s() {
        return this.f101403d;
    }

    /* renamed from: t */
    public final boolean m107349t() {
        return this.f101418s;
    }

    private C20620k(a aVar) {
        super(null);
        this.f101400a = aVar.f101419a;
        this.f101401b = aVar.f101420b;
        this.f101402c = aVar.f101421c;
        this.f101403d = aVar.f101422d;
        this.f101404e = aVar.f101423e;
        this.f101405f = aVar.f101424f;
        this.f101406g = aVar.f101425g;
        this.f101407h = aVar.f101426h;
        this.f101408i = aVar.f101427i;
        this.f101409j = aVar.f101428j;
        this.f101410k = aVar.f101429k;
        this.f101411l = aVar.f101430l;
        this.f101412m = aVar.f101431m;
        this.f101413n = aVar.f101432n;
        this.f101414o = aVar.f101433o;
        this.f101415p = aVar.f101434p;
        this.f101416q = aVar.f101435q;
        this.f101417r = aVar.f101436r;
        this.f101418s = aVar.f101437s;
    }
}
