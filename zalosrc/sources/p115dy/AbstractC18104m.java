package p115dy;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p624wx.C29259b;

/* renamed from: dy.m */
/* loaded from: classes4.dex */
public abstract class AbstractC18104m {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private boolean f91641a;

    /* renamed from: b */
    private boolean f91642b;

    /* renamed from: dy.m$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC18104m {

        /* renamed from: c */
        private final C29259b f91643c;

        /* renamed from: d */
        private CharSequence f91644d;

        /* renamed from: e */
        private CharSequence f91645e;

        /* renamed from: f */
        private String f91646f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29259b c29259b) {
            super(null);
            AbstractC19074t.m100208f(c29259b, "catalog");
            this.f91643c = c29259b;
            this.f91644d = "";
            this.f91645e = "";
            this.f91646f = "";
        }

        @Override // p115dy.AbstractC18104m
        /* renamed from: a */
        public long mo96297a() {
            return this.f91643c.m146158m();
        }

        /* renamed from: f */
        public final C29259b m96302f() {
            return this.f91643c;
        }

        /* renamed from: g */
        public final CharSequence m96303g() {
            return this.f91645e;
        }

        /* renamed from: h */
        public final String m96304h() {
            return this.f91646f;
        }

        /* renamed from: i */
        public final CharSequence m96305i() {
            return this.f91644d;
        }

        /* renamed from: j */
        public final void m96306j(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "<set-?>");
            this.f91645e = charSequence;
        }

        /* renamed from: k */
        public final void m96307k(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f91646f = str;
        }

        /* renamed from: l */
        public final void m96308l(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "<set-?>");
            this.f91644d = charSequence;
        }
    }

    /* renamed from: dy.m$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.m$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC18104m {

        /* renamed from: c */
        public static final c f91647c = new c();

        private c() {
            super(null);
        }

        @Override // p115dy.AbstractC18104m
        /* renamed from: a */
        public long mo96297a() {
            return -1005L;
        }
    }

    /* renamed from: dy.m$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC18104m {

        /* renamed from: c */
        public static final d f91648c = new d();

        private d() {
            super(null);
        }

        @Override // p115dy.AbstractC18104m
        /* renamed from: a */
        public long mo96297a() {
            return -1004L;
        }
    }

    /* renamed from: dy.m$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC18104m {

        /* renamed from: c */
        public static final e f91649c = new e();

        private e() {
            super(null);
        }

        @Override // p115dy.AbstractC18104m
        /* renamed from: a */
        public long mo96297a() {
            return -1003L;
        }
    }

    /* renamed from: dy.m$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC18104m {

        /* renamed from: c */
        public static final f f91650c = new f();

        private f() {
            super(null);
        }

        @Override // p115dy.AbstractC18104m
        /* renamed from: a */
        public long mo96297a() {
            return -1002L;
        }
    }

    /* renamed from: dy.m$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC18104m {

        /* renamed from: c */
        public static final g f91651c = new g();

        private g() {
            super(null);
        }

        @Override // p115dy.AbstractC18104m
        /* renamed from: a */
        public long mo96297a() {
            return -1000L;
        }
    }

    /* renamed from: dy.m$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC18104m {

        /* renamed from: c */
        public static final h f91652c = new h();

        private h() {
            super(null);
        }

        @Override // p115dy.AbstractC18104m
        /* renamed from: a */
        public long mo96297a() {
            return -1001L;
        }
    }

    public /* synthetic */ AbstractC18104m(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public abstract long mo96297a();

    /* renamed from: b */
    public final boolean m96298b() {
        return this.f91641a;
    }

    /* renamed from: c */
    public final boolean m96299c() {
        return this.f91642b;
    }

    /* renamed from: d */
    public final void m96300d(boolean z11) {
        this.f91642b = z11;
    }

    /* renamed from: e */
    public final void m96301e(boolean z11) {
        this.f91641a = z11;
    }

    private AbstractC18104m() {
        this.f91641a = true;
    }
}
