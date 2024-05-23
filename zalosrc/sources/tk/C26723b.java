package tk;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: tk.b */
/* loaded from: classes3.dex */
public final class C26723b {

    /* renamed from: a */
    private int f126741a;

    /* renamed from: b */
    private int f126742b;

    /* renamed from: c */
    private a f126743c;

    /* renamed from: d */
    private a f126744d;

    /* renamed from: e */
    private int f126745e;

    /* renamed from: f */
    private int f126746f;

    /* renamed from: tk.b$a */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: tk.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32983a extends a {

            /* renamed from: a */
            public static final C32983a f126747a = new C32983a();

            private C32983a() {
                super(null);
            }
        }

        /* renamed from: tk.b$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends a {

            /* renamed from: a */
            public static final b f126748a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: tk.b$a$c */
        /* loaded from: classes3.dex */
        public static final class c extends a {

            /* renamed from: a */
            public static final c f126749a = new c();

            private c() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26723b(int i11, int i12, a aVar, a aVar2, int i13, int i14) {
        AbstractC19074t.m100208f(aVar, "bottomLine");
        AbstractC19074t.m100208f(aVar2, "remoteBottomLine");
        this.f126741a = i11;
        this.f126742b = i12;
        this.f126743c = aVar;
        this.f126744d = aVar2;
        this.f126745e = i13;
        this.f126746f = i14;
    }

    /* renamed from: a */
    public final void m137444a(int i11, boolean z11) {
        if (z11) {
            this.f126746f = i11;
        } else {
            this.f126745e = i11;
        }
    }

    /* renamed from: b */
    public final void m137445b(int i11, boolean z11) {
        if (z11) {
            this.f126742b = i11;
        } else {
            this.f126741a = i11;
        }
    }

    /* renamed from: c */
    public final a m137446c() {
        return this.f126743c;
    }

    /* renamed from: d */
    public final int m137447d() {
        return this.f126745e;
    }

    /* renamed from: e */
    public final a m137448e() {
        return this.f126744d;
    }

    /* renamed from: f */
    public final int m137449f() {
        return this.f126746f;
    }

    /* renamed from: g */
    public final int m137450g() {
        return this.f126742b;
    }

    /* renamed from: h */
    public final int m137451h() {
        return this.f126741a;
    }

    /* renamed from: i */
    public final void m137452i(a aVar, boolean z11) {
        AbstractC19074t.m100208f(aVar, "style");
        if (z11) {
            this.f126744d = aVar;
        } else {
            this.f126743c = aVar;
        }
    }

    public /* synthetic */ C26723b(int i11, int i12, a aVar, a aVar2, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this(i11, i12, (i15 & 4) != 0 ? a.C32983a.f126747a : aVar, (i15 & 8) != 0 ? a.C32983a.f126747a : aVar2, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14);
    }
}
