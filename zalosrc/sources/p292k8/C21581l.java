package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.l */
/* loaded from: classes.dex */
final class C21581l extends AbstractC21569b0.e.d {

    /* renamed from: a */
    private final long f104832a;

    /* renamed from: b */
    private final String f104833b;

    /* renamed from: c */
    private final AbstractC21569b0.e.d.a f104834c;

    /* renamed from: d */
    private final AbstractC21569b0.e.d.c f104835d;

    /* renamed from: e */
    private final AbstractC21569b0.e.d.AbstractC32868d f104836e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.l$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.b {

        /* renamed from: a */
        private Long f104837a;

        /* renamed from: b */
        private String f104838b;

        /* renamed from: c */
        private AbstractC21569b0.e.d.a f104839c;

        /* renamed from: d */
        private AbstractC21569b0.e.d.c f104840d;

        /* renamed from: e */
        private AbstractC21569b0.e.d.AbstractC32868d f104841e;

        @Override // p292k8.AbstractC21569b0.e.d.b
        /* renamed from: a */
        public AbstractC21569b0.e.d mo111457a() {
            String str = "";
            if (this.f104837a == null) {
                str = " timestamp";
            }
            if (this.f104838b == null) {
                str = str + " type";
            }
            if (this.f104839c == null) {
                str = str + " app";
            }
            if (this.f104840d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C21581l(this.f104837a.longValue(), this.f104838b, this.f104839c, this.f104840d, this.f104841e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.b
        /* renamed from: b */
        public AbstractC21569b0.e.d.b mo111458b(AbstractC21569b0.e.d.a aVar) {
            if (aVar != null) {
                this.f104839c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // p292k8.AbstractC21569b0.e.d.b
        /* renamed from: c */
        public AbstractC21569b0.e.d.b mo111459c(AbstractC21569b0.e.d.c cVar) {
            if (cVar != null) {
                this.f104840d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // p292k8.AbstractC21569b0.e.d.b
        /* renamed from: d */
        public AbstractC21569b0.e.d.b mo111460d(AbstractC21569b0.e.d.AbstractC32868d abstractC32868d) {
            this.f104841e = abstractC32868d;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.b
        /* renamed from: e */
        public AbstractC21569b0.e.d.b mo111461e(long j11) {
            this.f104837a = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.b
        /* renamed from: f */
        public AbstractC21569b0.e.d.b mo111462f(String str) {
            if (str != null) {
                this.f104838b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC21569b0.e.d dVar) {
            this.f104837a = Long.valueOf(dVar.mo111377e());
            this.f104838b = dVar.mo111378f();
            this.f104839c = dVar.mo111374b();
            this.f104840d = dVar.mo111375c();
            this.f104841e = dVar.mo111376d();
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d
    /* renamed from: b */
    public AbstractC21569b0.e.d.a mo111374b() {
        return this.f104834c;
    }

    @Override // p292k8.AbstractC21569b0.e.d
    /* renamed from: c */
    public AbstractC21569b0.e.d.c mo111375c() {
        return this.f104835d;
    }

    @Override // p292k8.AbstractC21569b0.e.d
    /* renamed from: d */
    public AbstractC21569b0.e.d.AbstractC32868d mo111376d() {
        return this.f104836e;
    }

    @Override // p292k8.AbstractC21569b0.e.d
    /* renamed from: e */
    public long mo111377e() {
        return this.f104832a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d)) {
            return false;
        }
        AbstractC21569b0.e.d dVar = (AbstractC21569b0.e.d) obj;
        if (this.f104832a == dVar.mo111377e() && this.f104833b.equals(dVar.mo111378f()) && this.f104834c.equals(dVar.mo111374b()) && this.f104835d.equals(dVar.mo111375c())) {
            AbstractC21569b0.e.d.AbstractC32868d abstractC32868d = this.f104836e;
            if (abstractC32868d == null) {
                if (dVar.mo111376d() == null) {
                    return true;
                }
            } else if (abstractC32868d.equals(dVar.mo111376d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.d
    /* renamed from: f */
    public String mo111378f() {
        return this.f104833b;
    }

    @Override // p292k8.AbstractC21569b0.e.d
    /* renamed from: g */
    public AbstractC21569b0.e.d.b mo111379g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j11 = this.f104832a;
        int hashCode2 = (((((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f104833b.hashCode()) * 1000003) ^ this.f104834c.hashCode()) * 1000003) ^ this.f104835d.hashCode()) * 1000003;
        AbstractC21569b0.e.d.AbstractC32868d abstractC32868d = this.f104836e;
        if (abstractC32868d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC32868d.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "Event{timestamp=" + this.f104832a + ", type=" + this.f104833b + ", app=" + this.f104834c + ", device=" + this.f104835d + ", log=" + this.f104836e + "}";
    }

    private C21581l(long j11, String str, AbstractC21569b0.e.d.a aVar, AbstractC21569b0.e.d.c cVar, AbstractC21569b0.e.d.AbstractC32868d abstractC32868d) {
        this.f104832a = j11;
        this.f104833b = str;
        this.f104834c = aVar;
        this.f104835d = cVar;
        this.f104836e = abstractC32868d;
    }
}
