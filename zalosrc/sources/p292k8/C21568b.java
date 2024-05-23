package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.b */
/* loaded from: classes.dex */
final class C21568b extends AbstractC21569b0 {

    /* renamed from: b */
    private final String f104724b;

    /* renamed from: c */
    private final String f104725c;

    /* renamed from: d */
    private final int f104726d;

    /* renamed from: e */
    private final String f104727e;

    /* renamed from: f */
    private final String f104728f;

    /* renamed from: g */
    private final String f104729g;

    /* renamed from: h */
    private final AbstractC21569b0.e f104730h;

    /* renamed from: i */
    private final AbstractC21569b0.d f104731i;

    /* renamed from: j */
    private final AbstractC21569b0.a f104732j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.b {

        /* renamed from: a */
        private String f104733a;

        /* renamed from: b */
        private String f104734b;

        /* renamed from: c */
        private Integer f104735c;

        /* renamed from: d */
        private String f104736d;

        /* renamed from: e */
        private String f104737e;

        /* renamed from: f */
        private String f104738f;

        /* renamed from: g */
        private AbstractC21569b0.e f104739g;

        /* renamed from: h */
        private AbstractC21569b0.d f104740h;

        /* renamed from: i */
        private AbstractC21569b0.a f104741i;

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: a */
        public AbstractC21569b0 mo111247a() {
            String str = "";
            if (this.f104733a == null) {
                str = " sdkVersion";
            }
            if (this.f104734b == null) {
                str = str + " gmpAppId";
            }
            if (this.f104735c == null) {
                str = str + " platform";
            }
            if (this.f104736d == null) {
                str = str + " installationUuid";
            }
            if (this.f104737e == null) {
                str = str + " buildVersion";
            }
            if (this.f104738f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C21568b(this.f104733a, this.f104734b, this.f104735c.intValue(), this.f104736d, this.f104737e, this.f104738f, this.f104739g, this.f104740h, this.f104741i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: b */
        public AbstractC21569b0.b mo111248b(AbstractC21569b0.a aVar) {
            this.f104741i = aVar;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: c */
        public AbstractC21569b0.b mo111249c(String str) {
            if (str != null) {
                this.f104737e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: d */
        public AbstractC21569b0.b mo111250d(String str) {
            if (str != null) {
                this.f104738f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: e */
        public AbstractC21569b0.b mo111251e(String str) {
            if (str != null) {
                this.f104734b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: f */
        public AbstractC21569b0.b mo111252f(String str) {
            if (str != null) {
                this.f104736d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: g */
        public AbstractC21569b0.b mo111253g(AbstractC21569b0.d dVar) {
            this.f104740h = dVar;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: h */
        public AbstractC21569b0.b mo111254h(int i11) {
            this.f104735c = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: i */
        public AbstractC21569b0.b mo111255i(String str) {
            if (str != null) {
                this.f104733a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // p292k8.AbstractC21569b0.b
        /* renamed from: j */
        public AbstractC21569b0.b mo111256j(AbstractC21569b0.e eVar) {
            this.f104739g = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC21569b0 abstractC21569b0) {
            this.f104733a = abstractC21569b0.mo111244j();
            this.f104734b = abstractC21569b0.mo111240f();
            this.f104735c = Integer.valueOf(abstractC21569b0.mo111243i());
            this.f104736d = abstractC21569b0.mo111241g();
            this.f104737e = abstractC21569b0.mo111238d();
            this.f104738f = abstractC21569b0.mo111239e();
            this.f104739g = abstractC21569b0.mo111245k();
            this.f104740h = abstractC21569b0.mo111242h();
            this.f104741i = abstractC21569b0.mo111237c();
        }
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: c */
    public AbstractC21569b0.a mo111237c() {
        return this.f104732j;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: d */
    public String mo111238d() {
        return this.f104728f;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: e */
    public String mo111239e() {
        return this.f104729g;
    }

    public boolean equals(Object obj) {
        AbstractC21569b0.e eVar;
        AbstractC21569b0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0)) {
            return false;
        }
        AbstractC21569b0 abstractC21569b0 = (AbstractC21569b0) obj;
        if (this.f104724b.equals(abstractC21569b0.mo111244j()) && this.f104725c.equals(abstractC21569b0.mo111240f()) && this.f104726d == abstractC21569b0.mo111243i() && this.f104727e.equals(abstractC21569b0.mo111241g()) && this.f104728f.equals(abstractC21569b0.mo111238d()) && this.f104729g.equals(abstractC21569b0.mo111239e()) && ((eVar = this.f104730h) != null ? eVar.equals(abstractC21569b0.mo111245k()) : abstractC21569b0.mo111245k() == null) && ((dVar = this.f104731i) != null ? dVar.equals(abstractC21569b0.mo111242h()) : abstractC21569b0.mo111242h() == null)) {
            AbstractC21569b0.a aVar = this.f104732j;
            if (aVar == null) {
                if (abstractC21569b0.mo111237c() == null) {
                    return true;
                }
            } else if (aVar.equals(abstractC21569b0.mo111237c())) {
                return true;
            }
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: f */
    public String mo111240f() {
        return this.f104725c;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: g */
    public String mo111241g() {
        return this.f104727e;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: h */
    public AbstractC21569b0.d mo111242h() {
        return this.f104731i;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((((((this.f104724b.hashCode() ^ 1000003) * 1000003) ^ this.f104725c.hashCode()) * 1000003) ^ this.f104726d) * 1000003) ^ this.f104727e.hashCode()) * 1000003) ^ this.f104728f.hashCode()) * 1000003) ^ this.f104729g.hashCode()) * 1000003;
        AbstractC21569b0.e eVar = this.f104730h;
        int i11 = 0;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i12 = (hashCode3 ^ hashCode) * 1000003;
        AbstractC21569b0.d dVar = this.f104731i;
        if (dVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = dVar.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        AbstractC21569b0.a aVar = this.f104732j;
        if (aVar != null) {
            i11 = aVar.hashCode();
        }
        return i13 ^ i11;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: i */
    public int mo111243i() {
        return this.f104726d;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: j */
    public String mo111244j() {
        return this.f104724b;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: k */
    public AbstractC21569b0.e mo111245k() {
        return this.f104730h;
    }

    @Override // p292k8.AbstractC21569b0
    /* renamed from: l */
    protected AbstractC21569b0.b mo111246l() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f104724b + ", gmpAppId=" + this.f104725c + ", platform=" + this.f104726d + ", installationUuid=" + this.f104727e + ", buildVersion=" + this.f104728f + ", displayVersion=" + this.f104729g + ", session=" + this.f104730h + ", ndkPayload=" + this.f104731i + ", appExitInfo=" + this.f104732j + "}";
    }

    private C21568b(String str, String str2, int i11, String str3, String str4, String str5, AbstractC21569b0.e eVar, AbstractC21569b0.d dVar, AbstractC21569b0.a aVar) {
        this.f104724b = str;
        this.f104725c = str2;
        this.f104726d = i11;
        this.f104727e = str3;
        this.f104728f = str4;
        this.f104729g = str5;
        this.f104730h = eVar;
        this.f104731i = dVar;
        this.f104732j = aVar;
    }
}
