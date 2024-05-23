package oh0;

import am.AbstractC0908e0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: oh0.b */
/* loaded from: classes.dex */
public final class C24267b implements InterfaceC24266a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f117218a;

    /* renamed from: oh0.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f117219q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24267b mo12V4() {
            return c.f117221b.m126723a();
        }
    }

    /* renamed from: oh0.b$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC24266a m126722a() {
            return (InterfaceC24266a) C24267b.f117218a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oh0.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f117221b = new c();

        /* renamed from: a */
        private static final C24267b f117220a = new C24267b();

        private c() {
        }

        /* renamed from: a */
        public final C24267b m126723a() {
            return f117220a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f117219q);
        f117218a = m129210a;
    }

    /* renamed from: j */
    public static final InterfaceC24266a m126719j() {
        return Companion.m126722a();
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: a */
    public void mo126710a(long j11) {
        AbstractC0908e0.m2822p("timeStartApp", j11);
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: b */
    public void mo126711b(long j11) {
        AbstractC0908e0.m2822p("elapsedTimeStartApp", j11);
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: c */
    public long mo126712c() {
        return AbstractC0908e0.m2812f("timeStartApp", 0L);
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: d */
    public void mo126713d(long j11) {
        AbstractC0908e0.m2822p("delta_time", j11);
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: e */
    public long mo126714e() {
        return AbstractC0908e0.m2812f("elapsedTimeStartApp", 0L);
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: f */
    public long mo126715f() {
        return AbstractC0908e0.m2812f("delta_time", 0L);
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: g */
    public long mo126716g() {
        long m2812f = AbstractC0908e0.m2812f("LAST_SERVER_TIME", 0L);
        if (m2812f == 0) {
            return m126720k() * 1000;
        }
        return m2812f;
    }

    @Override // oh0.InterfaceC24266a
    /* renamed from: h */
    public void mo126717h(long j11) {
        AbstractC0908e0.m2822p("LAST_SERVER_TIME", j11);
    }

    /* renamed from: k */
    public long m126720k() {
        return AbstractC0908e0.m2812f("loginTime", 0L);
    }
}
