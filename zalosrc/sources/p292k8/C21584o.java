package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.o */
/* loaded from: classes.dex */
final class C21584o extends AbstractC21569b0.e.d.a.b.AbstractC32858a {

    /* renamed from: a */
    private final long f104862a;

    /* renamed from: b */
    private final long f104863b;

    /* renamed from: c */
    private final String f104864c;

    /* renamed from: d */
    private final String f104865d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.o$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a {

        /* renamed from: a */
        private Long f104866a;

        /* renamed from: b */
        private Long f104867b;

        /* renamed from: c */
        private String f104868c;

        /* renamed from: d */
        private String f104869d;

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a
        /* renamed from: a */
        public AbstractC21569b0.e.d.a.b.AbstractC32858a mo111405a() {
            String str = "";
            if (this.f104866a == null) {
                str = " baseAddress";
            }
            if (this.f104867b == null) {
                str = str + " size";
            }
            if (this.f104868c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C21584o(this.f104866a.longValue(), this.f104867b.longValue(), this.f104868c, this.f104869d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a
        /* renamed from: b */
        public AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a mo111406b(long j11) {
            this.f104866a = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a
        /* renamed from: c */
        public AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a mo111407c(String str) {
            if (str != null) {
                this.f104868c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a
        /* renamed from: d */
        public AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a mo111408d(long j11) {
            this.f104867b = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a
        /* renamed from: e */
        public AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a mo111409e(String str) {
            this.f104869d = str;
            return this;
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a
    /* renamed from: b */
    public long mo111400b() {
        return this.f104862a;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a
    /* renamed from: c */
    public String mo111401c() {
        return this.f104864c;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a
    /* renamed from: d */
    public long mo111402d() {
        return this.f104863b;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32858a
    /* renamed from: e */
    public String mo111403e() {
        return this.f104865d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.a.b.AbstractC32858a)) {
            return false;
        }
        AbstractC21569b0.e.d.a.b.AbstractC32858a abstractC32858a = (AbstractC21569b0.e.d.a.b.AbstractC32858a) obj;
        if (this.f104862a == abstractC32858a.mo111400b() && this.f104863b == abstractC32858a.mo111402d() && this.f104864c.equals(abstractC32858a.mo111401c())) {
            String str = this.f104865d;
            if (str == null) {
                if (abstractC32858a.mo111403e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC32858a.mo111403e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j11 = this.f104862a;
        long j12 = this.f104863b;
        int hashCode2 = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f104864c.hashCode()) * 1000003;
        String str = this.f104865d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f104862a + ", size=" + this.f104863b + ", name=" + this.f104864c + ", uuid=" + this.f104865d + "}";
    }

    private C21584o(long j11, long j12, String str, String str2) {
        this.f104862a = j11;
        this.f104863b = j12;
        this.f104864c = str;
        this.f104865d = str2;
    }
}
