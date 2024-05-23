package p184g9;

import p601w8.InterfaceC28797c;

/* renamed from: g9.a */
/* loaded from: classes3.dex */
public final class C19298a {

    /* renamed from: p */
    private static final C19298a f95814p = new a().m101025a();

    /* renamed from: a */
    private final long f95815a;

    /* renamed from: b */
    private final String f95816b;

    /* renamed from: c */
    private final String f95817c;

    /* renamed from: d */
    private final c f95818d;

    /* renamed from: e */
    private final d f95819e;

    /* renamed from: f */
    private final String f95820f;

    /* renamed from: g */
    private final String f95821g;

    /* renamed from: h */
    private final int f95822h;

    /* renamed from: i */
    private final int f95823i;

    /* renamed from: j */
    private final String f95824j;

    /* renamed from: k */
    private final long f95825k;

    /* renamed from: l */
    private final b f95826l;

    /* renamed from: m */
    private final String f95827m;

    /* renamed from: n */
    private final long f95828n;

    /* renamed from: o */
    private final String f95829o;

    /* renamed from: g9.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private long f95830a = 0;

        /* renamed from: b */
        private String f95831b = "";

        /* renamed from: c */
        private String f95832c = "";

        /* renamed from: d */
        private c f95833d = c.UNKNOWN;

        /* renamed from: e */
        private d f95834e = d.UNKNOWN_OS;

        /* renamed from: f */
        private String f95835f = "";

        /* renamed from: g */
        private String f95836g = "";

        /* renamed from: h */
        private int f95837h = 0;

        /* renamed from: i */
        private int f95838i = 0;

        /* renamed from: j */
        private String f95839j = "";

        /* renamed from: k */
        private long f95840k = 0;

        /* renamed from: l */
        private b f95841l = b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f95842m = "";

        /* renamed from: n */
        private long f95843n = 0;

        /* renamed from: o */
        private String f95844o = "";

        a() {
        }

        /* renamed from: a */
        public C19298a m101025a() {
            return new C19298a(this.f95830a, this.f95831b, this.f95832c, this.f95833d, this.f95834e, this.f95835f, this.f95836g, this.f95837h, this.f95838i, this.f95839j, this.f95840k, this.f95841l, this.f95842m, this.f95843n, this.f95844o);
        }

        /* renamed from: b */
        public a m101026b(String str) {
            this.f95842m = str;
            return this;
        }

        /* renamed from: c */
        public a m101027c(String str) {
            this.f95836g = str;
            return this;
        }

        /* renamed from: d */
        public a m101028d(String str) {
            this.f95844o = str;
            return this;
        }

        /* renamed from: e */
        public a m101029e(b bVar) {
            this.f95841l = bVar;
            return this;
        }

        /* renamed from: f */
        public a m101030f(String str) {
            this.f95832c = str;
            return this;
        }

        /* renamed from: g */
        public a m101031g(String str) {
            this.f95831b = str;
            return this;
        }

        /* renamed from: h */
        public a m101032h(c cVar) {
            this.f95833d = cVar;
            return this;
        }

        /* renamed from: i */
        public a m101033i(String str) {
            this.f95835f = str;
            return this;
        }

        /* renamed from: j */
        public a m101034j(long j11) {
            this.f95830a = j11;
            return this;
        }

        /* renamed from: k */
        public a m101035k(d dVar) {
            this.f95834e = dVar;
            return this;
        }

        /* renamed from: l */
        public a m101036l(String str) {
            this.f95839j = str;
            return this;
        }

        /* renamed from: m */
        public a m101037m(int i11) {
            this.f95838i = i11;
            return this;
        }
    }

    /* renamed from: g9.a$b */
    /* loaded from: classes3.dex */
    public enum b implements InterfaceC28797c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: p */
        private final int f95849p;

        b(int i11) {
            this.f95849p = i11;
        }

        @Override // p601w8.InterfaceC28797c
        /* renamed from: a */
        public int mo93869a() {
            return this.f95849p;
        }
    }

    /* renamed from: g9.a$c */
    /* loaded from: classes3.dex */
    public enum c implements InterfaceC28797c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: p */
        private final int f95855p;

        c(int i11) {
            this.f95855p = i11;
        }

        @Override // p601w8.InterfaceC28797c
        /* renamed from: a */
        public int mo93869a() {
            return this.f95855p;
        }
    }

    /* renamed from: g9.a$d */
    /* loaded from: classes3.dex */
    public enum d implements InterfaceC28797c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: p */
        private final int f95861p;

        d(int i11) {
            this.f95861p = i11;
        }

        @Override // p601w8.InterfaceC28797c
        /* renamed from: a */
        public int mo93869a() {
            return this.f95861p;
        }
    }

    C19298a(long j11, String str, String str2, c cVar, d dVar, String str3, String str4, int i11, int i12, String str5, long j12, b bVar, String str6, long j13, String str7) {
        this.f95815a = j11;
        this.f95816b = str;
        this.f95817c = str2;
        this.f95818d = cVar;
        this.f95819e = dVar;
        this.f95820f = str3;
        this.f95821g = str4;
        this.f95822h = i11;
        this.f95823i = i12;
        this.f95824j = str5;
        this.f95825k = j12;
        this.f95826l = bVar;
        this.f95827m = str6;
        this.f95828n = j13;
        this.f95829o = str7;
    }

    /* renamed from: p */
    public static a m101009p() {
        return new a();
    }

    /* renamed from: a */
    public String m101010a() {
        return this.f95827m;
    }

    /* renamed from: b */
    public long m101011b() {
        return this.f95825k;
    }

    /* renamed from: c */
    public long m101012c() {
        return this.f95828n;
    }

    /* renamed from: d */
    public String m101013d() {
        return this.f95821g;
    }

    /* renamed from: e */
    public String m101014e() {
        return this.f95829o;
    }

    /* renamed from: f */
    public b m101015f() {
        return this.f95826l;
    }

    /* renamed from: g */
    public String m101016g() {
        return this.f95817c;
    }

    /* renamed from: h */
    public String m101017h() {
        return this.f95816b;
    }

    /* renamed from: i */
    public c m101018i() {
        return this.f95818d;
    }

    /* renamed from: j */
    public String m101019j() {
        return this.f95820f;
    }

    /* renamed from: k */
    public int m101020k() {
        return this.f95822h;
    }

    /* renamed from: l */
    public long m101021l() {
        return this.f95815a;
    }

    /* renamed from: m */
    public d m101022m() {
        return this.f95819e;
    }

    /* renamed from: n */
    public String m101023n() {
        return this.f95824j;
    }

    /* renamed from: o */
    public int m101024o() {
        return this.f95823i;
    }
}
