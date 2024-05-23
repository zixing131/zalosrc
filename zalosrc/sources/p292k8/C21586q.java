package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.q */
/* loaded from: classes.dex */
final class C21586q extends AbstractC21569b0.e.d.a.b.AbstractC32862d {

    /* renamed from: a */
    private final String f104880a;

    /* renamed from: b */
    private final String f104881b;

    /* renamed from: c */
    private final long f104882c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.q$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a {

        /* renamed from: a */
        private String f104883a;

        /* renamed from: b */
        private String f104884b;

        /* renamed from: c */
        private Long f104885c;

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a
        /* renamed from: a */
        public AbstractC21569b0.e.d.a.b.AbstractC32862d mo111433a() {
            String str = "";
            if (this.f104883a == null) {
                str = " name";
            }
            if (this.f104884b == null) {
                str = str + " code";
            }
            if (this.f104885c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C21586q(this.f104883a, this.f104884b, this.f104885c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a
        /* renamed from: b */
        public AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a mo111434b(long j11) {
            this.f104885c = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a
        /* renamed from: c */
        public AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a mo111435c(String str) {
            if (str != null) {
                this.f104884b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a
        /* renamed from: d */
        public AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a mo111436d(String str) {
            if (str != null) {
                this.f104883a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32862d
    /* renamed from: b */
    public long mo111430b() {
        return this.f104882c;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32862d
    /* renamed from: c */
    public String mo111431c() {
        return this.f104881b;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32862d
    /* renamed from: d */
    public String mo111432d() {
        return this.f104880a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.a.b.AbstractC32862d)) {
            return false;
        }
        AbstractC21569b0.e.d.a.b.AbstractC32862d abstractC32862d = (AbstractC21569b0.e.d.a.b.AbstractC32862d) obj;
        if (this.f104880a.equals(abstractC32862d.mo111432d()) && this.f104881b.equals(abstractC32862d.mo111431c()) && this.f104882c == abstractC32862d.mo111430b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f104880a.hashCode() ^ 1000003) * 1000003) ^ this.f104881b.hashCode()) * 1000003;
        long j11 = this.f104882c;
        return hashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f104880a + ", code=" + this.f104881b + ", address=" + this.f104882c + "}";
    }

    private C21586q(String str, String str2, long j11) {
        this.f104880a = str;
        this.f104881b = str2;
        this.f104882c = j11;
    }
}
