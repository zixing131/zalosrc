package androidx.work;

import android.os.Build;
import androidx.core.util.InterfaceC1479a;
import androidx.work.impl.C2187e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.c */
/* loaded from: classes.dex */
public final class C2138c {

    /* renamed from: p */
    public static final b f9060p = new b(null);

    /* renamed from: a */
    private final Executor f9061a;

    /* renamed from: b */
    private final Executor f9062b;

    /* renamed from: c */
    private final InterfaceC2136b f9063c;

    /* renamed from: d */
    private final AbstractC2243k0 f9064d;

    /* renamed from: e */
    private final AbstractC2247o f9065e;

    /* renamed from: f */
    private final InterfaceC2141d0 f9066f;

    /* renamed from: g */
    private final InterfaceC1479a f9067g;

    /* renamed from: h */
    private final InterfaceC1479a f9068h;

    /* renamed from: i */
    private final String f9069i;

    /* renamed from: j */
    private final int f9070j;

    /* renamed from: k */
    private final int f9071k;

    /* renamed from: l */
    private final int f9072l;

    /* renamed from: m */
    private final int f9073m;

    /* renamed from: n */
    private final int f9074n;

    /* renamed from: o */
    private final boolean f9075o;

    /* renamed from: androidx.work.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Executor f9076a;

        /* renamed from: b */
        private AbstractC2243k0 f9077b;

        /* renamed from: c */
        private AbstractC2247o f9078c;

        /* renamed from: d */
        private Executor f9079d;

        /* renamed from: e */
        private InterfaceC2136b f9080e;

        /* renamed from: f */
        private InterfaceC2141d0 f9081f;

        /* renamed from: g */
        private InterfaceC1479a f9082g;

        /* renamed from: h */
        private InterfaceC1479a f9083h;

        /* renamed from: i */
        private String f9084i;

        /* renamed from: k */
        private int f9086k;

        /* renamed from: j */
        private int f9085j = 4;

        /* renamed from: l */
        private int f9087l = Integer.MAX_VALUE;

        /* renamed from: m */
        private int f9088m = 20;

        /* renamed from: n */
        private int f9089n = AbstractC2140d.m11501c();

        /* renamed from: a */
        public final C2138c m11484a() {
            return new C2138c(this);
        }

        /* renamed from: b */
        public final InterfaceC2136b m11485b() {
            return this.f9080e;
        }

        /* renamed from: c */
        public final int m11486c() {
            return this.f9089n;
        }

        /* renamed from: d */
        public final String m11487d() {
            return this.f9084i;
        }

        /* renamed from: e */
        public final Executor m11488e() {
            return this.f9076a;
        }

        /* renamed from: f */
        public final InterfaceC1479a m11489f() {
            return this.f9082g;
        }

        /* renamed from: g */
        public final AbstractC2247o m11490g() {
            return this.f9078c;
        }

        /* renamed from: h */
        public final int m11491h() {
            return this.f9085j;
        }

        /* renamed from: i */
        public final int m11492i() {
            return this.f9087l;
        }

        /* renamed from: j */
        public final int m11493j() {
            return this.f9088m;
        }

        /* renamed from: k */
        public final int m11494k() {
            return this.f9086k;
        }

        /* renamed from: l */
        public final InterfaceC2141d0 m11495l() {
            return this.f9081f;
        }

        /* renamed from: m */
        public final InterfaceC1479a m11496m() {
            return this.f9083h;
        }

        /* renamed from: n */
        public final Executor m11497n() {
            return this.f9079d;
        }

        /* renamed from: o */
        public final AbstractC2243k0 m11498o() {
            return this.f9077b;
        }
    }

    /* renamed from: androidx.work.c$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C2138c(a aVar) {
        int m11493j;
        AbstractC19074t.m100208f(aVar, "builder");
        Executor m11488e = aVar.m11488e();
        this.f9061a = m11488e == null ? AbstractC2140d.m11500b(false) : m11488e;
        this.f9075o = aVar.m11497n() == null;
        Executor m11497n = aVar.m11497n();
        this.f9062b = m11497n == null ? AbstractC2140d.m11500b(true) : m11497n;
        InterfaceC2136b m11485b = aVar.m11485b();
        this.f9063c = m11485b == null ? new C2143e0() : m11485b;
        AbstractC2243k0 m11498o = aVar.m11498o();
        if (m11498o == null) {
            m11498o = AbstractC2243k0.m11875c();
            AbstractC19074t.m100207e(m11498o, "getDefaultWorkerFactory()");
        }
        this.f9064d = m11498o;
        AbstractC2247o m11490g = aVar.m11490g();
        this.f9065e = m11490g == null ? C2255w.f9479a : m11490g;
        InterfaceC2141d0 m11495l = aVar.m11495l();
        this.f9066f = m11495l == null ? new C2187e() : m11495l;
        this.f9070j = aVar.m11491h();
        this.f9071k = aVar.m11494k();
        this.f9072l = aVar.m11492i();
        if (Build.VERSION.SDK_INT == 23) {
            m11493j = aVar.m11493j() / 2;
        } else {
            m11493j = aVar.m11493j();
        }
        this.f9074n = m11493j;
        this.f9067g = aVar.m11489f();
        this.f9068h = aVar.m11496m();
        this.f9069i = aVar.m11487d();
        this.f9073m = aVar.m11486c();
    }

    /* renamed from: a */
    public final InterfaceC2136b m11470a() {
        return this.f9063c;
    }

    /* renamed from: b */
    public final int m11471b() {
        return this.f9073m;
    }

    /* renamed from: c */
    public final String m11472c() {
        return this.f9069i;
    }

    /* renamed from: d */
    public final Executor m11473d() {
        return this.f9061a;
    }

    /* renamed from: e */
    public final InterfaceC1479a m11474e() {
        return this.f9067g;
    }

    /* renamed from: f */
    public final AbstractC2247o m11475f() {
        return this.f9065e;
    }

    /* renamed from: g */
    public final int m11476g() {
        return this.f9072l;
    }

    /* renamed from: h */
    public final int m11477h() {
        return this.f9074n;
    }

    /* renamed from: i */
    public final int m11478i() {
        return this.f9071k;
    }

    /* renamed from: j */
    public final int m11479j() {
        return this.f9070j;
    }

    /* renamed from: k */
    public final InterfaceC2141d0 m11480k() {
        return this.f9066f;
    }

    /* renamed from: l */
    public final InterfaceC1479a m11481l() {
        return this.f9068h;
    }

    /* renamed from: m */
    public final Executor m11482m() {
        return this.f9062b;
    }

    /* renamed from: n */
    public final AbstractC2243k0 m11483n() {
        return this.f9064d;
    }
}
