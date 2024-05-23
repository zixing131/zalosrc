package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.s */
/* loaded from: classes.dex */
final class C21588s extends AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b {

    /* renamed from: a */
    private final long f104892a;

    /* renamed from: b */
    private final String f104893b;

    /* renamed from: c */
    private final String f104894c;

    /* renamed from: d */
    private final long f104895d;

    /* renamed from: e */
    private final int f104896e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.s$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a {

        /* renamed from: a */
        private Long f104897a;

        /* renamed from: b */
        private String f104898b;

        /* renamed from: c */
        private String f104899c;

        /* renamed from: d */
        private Long f104900d;

        /* renamed from: e */
        private Integer f104901e;

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a
        /* renamed from: a */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b mo111451a() {
            String str = "";
            if (this.f104897a == null) {
                str = " pc";
            }
            if (this.f104898b == null) {
                str = str + " symbol";
            }
            if (this.f104900d == null) {
                str = str + " offset";
            }
            if (this.f104901e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C21588s(this.f104897a.longValue(), this.f104898b, this.f104899c, this.f104900d.longValue(), this.f104901e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a
        /* renamed from: b */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a mo111452b(String str) {
            this.f104899c = str;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a
        /* renamed from: c */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a mo111453c(int i11) {
            this.f104901e = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a
        /* renamed from: d */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a mo111454d(long j11) {
            this.f104900d = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a
        /* renamed from: e */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a mo111455e(long j11) {
            this.f104897a = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a
        /* renamed from: f */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a mo111456f(String str) {
            if (str != null) {
                this.f104898b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b
    /* renamed from: b */
    public String mo111446b() {
        return this.f104894c;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b
    /* renamed from: c */
    public int mo111447c() {
        return this.f104896e;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b
    /* renamed from: d */
    public long mo111448d() {
        return this.f104895d;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b
    /* renamed from: e */
    public long mo111449e() {
        return this.f104892a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b)) {
            return false;
        }
        AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b abstractC32866b = (AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b) obj;
        if (this.f104892a == abstractC32866b.mo111449e() && this.f104893b.equals(abstractC32866b.mo111450f()) && ((str = this.f104894c) != null ? str.equals(abstractC32866b.mo111446b()) : abstractC32866b.mo111446b() == null) && this.f104895d == abstractC32866b.mo111448d() && this.f104896e == abstractC32866b.mo111447c()) {
            return true;
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b
    /* renamed from: f */
    public String mo111450f() {
        return this.f104893b;
    }

    public int hashCode() {
        int hashCode;
        long j11 = this.f104892a;
        int hashCode2 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f104893b.hashCode()) * 1000003;
        String str = this.f104894c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        long j12 = this.f104895d;
        return this.f104896e ^ ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f104892a + ", symbol=" + this.f104893b + ", file=" + this.f104894c + ", offset=" + this.f104895d + ", importance=" + this.f104896e + "}";
    }

    private C21588s(long j11, String str, String str2, long j12, int i11) {
        this.f104892a = j11;
        this.f104893b = str;
        this.f104894c = str2;
        this.f104895d = j12;
        this.f104896e = i11;
    }
}
