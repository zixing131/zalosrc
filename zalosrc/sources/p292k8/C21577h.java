package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.h */
/* loaded from: classes.dex */
final class C21577h extends AbstractC21569b0.e {

    /* renamed from: a */
    private final String f104780a;

    /* renamed from: b */
    private final String f104781b;

    /* renamed from: c */
    private final long f104782c;

    /* renamed from: d */
    private final Long f104783d;

    /* renamed from: e */
    private final boolean f104784e;

    /* renamed from: f */
    private final AbstractC21569b0.e.a f104785f;

    /* renamed from: g */
    private final AbstractC21569b0.e.f f104786g;

    /* renamed from: h */
    private final AbstractC21569b0.e.AbstractC32869e f104787h;

    /* renamed from: i */
    private final AbstractC21569b0.e.c f104788i;

    /* renamed from: j */
    private final C21571c0 f104789j;

    /* renamed from: k */
    private final int f104790k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.h$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.b {

        /* renamed from: a */
        private String f104791a;

        /* renamed from: b */
        private String f104792b;

        /* renamed from: c */
        private Long f104793c;

        /* renamed from: d */
        private Long f104794d;

        /* renamed from: e */
        private Boolean f104795e;

        /* renamed from: f */
        private AbstractC21569b0.e.a f104796f;

        /* renamed from: g */
        private AbstractC21569b0.e.f f104797g;

        /* renamed from: h */
        private AbstractC21569b0.e.AbstractC32869e f104798h;

        /* renamed from: i */
        private AbstractC21569b0.e.c f104799i;

        /* renamed from: j */
        private C21571c0 f104800j;

        /* renamed from: k */
        private Integer f104801k;

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: a */
        public AbstractC21569b0.e mo111340a() {
            String str = "";
            if (this.f104791a == null) {
                str = " generator";
            }
            if (this.f104792b == null) {
                str = str + " identifier";
            }
            if (this.f104793c == null) {
                str = str + " startedAt";
            }
            if (this.f104795e == null) {
                str = str + " crashed";
            }
            if (this.f104796f == null) {
                str = str + " app";
            }
            if (this.f104801k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C21577h(this.f104791a, this.f104792b, this.f104793c.longValue(), this.f104794d, this.f104795e.booleanValue(), this.f104796f, this.f104797g, this.f104798h, this.f104799i, this.f104800j, this.f104801k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: b */
        public AbstractC21569b0.e.b mo111341b(AbstractC21569b0.e.a aVar) {
            if (aVar != null) {
                this.f104796f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: c */
        public AbstractC21569b0.e.b mo111342c(boolean z11) {
            this.f104795e = Boolean.valueOf(z11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: d */
        public AbstractC21569b0.e.b mo111343d(AbstractC21569b0.e.c cVar) {
            this.f104799i = cVar;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: e */
        public AbstractC21569b0.e.b mo111344e(Long l11) {
            this.f104794d = l11;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: f */
        public AbstractC21569b0.e.b mo111345f(C21571c0 c21571c0) {
            this.f104800j = c21571c0;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: g */
        public AbstractC21569b0.e.b mo111346g(String str) {
            if (str != null) {
                this.f104791a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: h */
        public AbstractC21569b0.e.b mo111347h(int i11) {
            this.f104801k = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: i */
        public AbstractC21569b0.e.b mo111348i(String str) {
            if (str != null) {
                this.f104792b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: k */
        public AbstractC21569b0.e.b mo111350k(AbstractC21569b0.e.AbstractC32869e abstractC32869e) {
            this.f104798h = abstractC32869e;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: l */
        public AbstractC21569b0.e.b mo111351l(long j11) {
            this.f104793c = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.b
        /* renamed from: m */
        public AbstractC21569b0.e.b mo111352m(AbstractC21569b0.e.f fVar) {
            this.f104797g = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC21569b0.e eVar) {
            this.f104791a = eVar.mo111314f();
            this.f104792b = eVar.mo111316h();
            this.f104793c = Long.valueOf(eVar.mo111319k());
            this.f104794d = eVar.mo111312d();
            this.f104795e = Boolean.valueOf(eVar.mo111321m());
            this.f104796f = eVar.mo111310b();
            this.f104797g = eVar.mo111320l();
            this.f104798h = eVar.mo111318j();
            this.f104799i = eVar.mo111311c();
            this.f104800j = eVar.mo111313e();
            this.f104801k = Integer.valueOf(eVar.mo111315g());
        }
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: b */
    public AbstractC21569b0.e.a mo111310b() {
        return this.f104785f;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: c */
    public AbstractC21569b0.e.c mo111311c() {
        return this.f104788i;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: d */
    public Long mo111312d() {
        return this.f104783d;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: e */
    public C21571c0 mo111313e() {
        return this.f104789j;
    }

    public boolean equals(Object obj) {
        Long l11;
        AbstractC21569b0.e.f fVar;
        AbstractC21569b0.e.AbstractC32869e abstractC32869e;
        AbstractC21569b0.e.c cVar;
        C21571c0 c21571c0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e)) {
            return false;
        }
        AbstractC21569b0.e eVar = (AbstractC21569b0.e) obj;
        if (this.f104780a.equals(eVar.mo111314f()) && this.f104781b.equals(eVar.mo111316h()) && this.f104782c == eVar.mo111319k() && ((l11 = this.f104783d) != null ? l11.equals(eVar.mo111312d()) : eVar.mo111312d() == null) && this.f104784e == eVar.mo111321m() && this.f104785f.equals(eVar.mo111310b()) && ((fVar = this.f104786g) != null ? fVar.equals(eVar.mo111320l()) : eVar.mo111320l() == null) && ((abstractC32869e = this.f104787h) != null ? abstractC32869e.equals(eVar.mo111318j()) : eVar.mo111318j() == null) && ((cVar = this.f104788i) != null ? cVar.equals(eVar.mo111311c()) : eVar.mo111311c() == null) && ((c21571c0 = this.f104789j) != null ? c21571c0.equals(eVar.mo111313e()) : eVar.mo111313e() == null) && this.f104790k == eVar.mo111315g()) {
            return true;
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: f */
    public String mo111314f() {
        return this.f104780a;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: g */
    public int mo111315g() {
        return this.f104790k;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: h */
    public String mo111316h() {
        return this.f104781b;
    }

    public int hashCode() {
        int hashCode;
        int i11;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f104780a.hashCode() ^ 1000003) * 1000003) ^ this.f104781b.hashCode()) * 1000003;
        long j11 = this.f104782c;
        int i12 = (hashCode5 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        Long l11 = this.f104783d;
        int i13 = 0;
        if (l11 == null) {
            hashCode = 0;
        } else {
            hashCode = l11.hashCode();
        }
        int i14 = (i12 ^ hashCode) * 1000003;
        if (this.f104784e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int hashCode6 = (((i14 ^ i11) * 1000003) ^ this.f104785f.hashCode()) * 1000003;
        AbstractC21569b0.e.f fVar = this.f104786g;
        if (fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fVar.hashCode();
        }
        int i15 = (hashCode6 ^ hashCode2) * 1000003;
        AbstractC21569b0.e.AbstractC32869e abstractC32869e = this.f104787h;
        if (abstractC32869e == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = abstractC32869e.hashCode();
        }
        int i16 = (i15 ^ hashCode3) * 1000003;
        AbstractC21569b0.e.c cVar = this.f104788i;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i17 = (i16 ^ hashCode4) * 1000003;
        C21571c0 c21571c0 = this.f104789j;
        if (c21571c0 != null) {
            i13 = c21571c0.hashCode();
        }
        return ((i17 ^ i13) * 1000003) ^ this.f104790k;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: j */
    public AbstractC21569b0.e.AbstractC32869e mo111318j() {
        return this.f104787h;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: k */
    public long mo111319k() {
        return this.f104782c;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: l */
    public AbstractC21569b0.e.f mo111320l() {
        return this.f104786g;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: m */
    public boolean mo111321m() {
        return this.f104784e;
    }

    @Override // p292k8.AbstractC21569b0.e
    /* renamed from: n */
    public AbstractC21569b0.e.b mo111322n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f104780a + ", identifier=" + this.f104781b + ", startedAt=" + this.f104782c + ", endedAt=" + this.f104783d + ", crashed=" + this.f104784e + ", app=" + this.f104785f + ", user=" + this.f104786g + ", os=" + this.f104787h + ", device=" + this.f104788i + ", events=" + this.f104789j + ", generatorType=" + this.f104790k + "}";
    }

    private C21577h(String str, String str2, long j11, Long l11, boolean z11, AbstractC21569b0.e.a aVar, AbstractC21569b0.e.f fVar, AbstractC21569b0.e.AbstractC32869e abstractC32869e, AbstractC21569b0.e.c cVar, C21571c0 c21571c0, int i11) {
        this.f104780a = str;
        this.f104781b = str2;
        this.f104782c = j11;
        this.f104783d = l11;
        this.f104784e = z11;
        this.f104785f = aVar;
        this.f104786g = fVar;
        this.f104787h = abstractC32869e;
        this.f104788i = cVar;
        this.f104789j = c21571c0;
        this.f104790k = i11;
    }
}
