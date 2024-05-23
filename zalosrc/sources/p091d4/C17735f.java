package p091d4;

/* renamed from: d4.f */
/* loaded from: classes.dex */
public final class C17735f {

    /* renamed from: c */
    private static final C17735f f89901c = new a().m93885a();

    /* renamed from: a */
    private final long f89902a;

    /* renamed from: b */
    private final long f89903b;

    /* renamed from: d4.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f89904a = 0;

        /* renamed from: b */
        private long f89905b = 0;

        a() {
        }

        /* renamed from: a */
        public C17735f m93885a() {
            return new C17735f(this.f89904a, this.f89905b);
        }

        /* renamed from: b */
        public a m93886b(long j11) {
            this.f89905b = j11;
            return this;
        }

        /* renamed from: c */
        public a m93887c(long j11) {
            this.f89904a = j11;
            return this;
        }
    }

    C17735f(long j11, long j12) {
        this.f89902a = j11;
        this.f89903b = j12;
    }

    /* renamed from: c */
    public static a m93882c() {
        return new a();
    }

    /* renamed from: a */
    public long m93883a() {
        return this.f89903b;
    }

    /* renamed from: b */
    public long m93884b() {
        return this.f89902a;
    }
}
