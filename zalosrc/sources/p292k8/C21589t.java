package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.t */
/* loaded from: classes.dex */
final class C21589t extends AbstractC21569b0.e.d.c {

    /* renamed from: a */
    private final Double f104902a;

    /* renamed from: b */
    private final int f104903b;

    /* renamed from: c */
    private final boolean f104904c;

    /* renamed from: d */
    private final int f104905d;

    /* renamed from: e */
    private final long f104906e;

    /* renamed from: f */
    private final long f104907f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.t$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.c.a {

        /* renamed from: a */
        private Double f104908a;

        /* renamed from: b */
        private Integer f104909b;

        /* renamed from: c */
        private Boolean f104910c;

        /* renamed from: d */
        private Integer f104911d;

        /* renamed from: e */
        private Long f104912e;

        /* renamed from: f */
        private Long f104913f;

        @Override // p292k8.AbstractC21569b0.e.d.c.a
        /* renamed from: a */
        public AbstractC21569b0.e.d.c mo111470a() {
            String str = "";
            if (this.f104909b == null) {
                str = " batteryVelocity";
            }
            if (this.f104910c == null) {
                str = str + " proximityOn";
            }
            if (this.f104911d == null) {
                str = str + " orientation";
            }
            if (this.f104912e == null) {
                str = str + " ramUsed";
            }
            if (this.f104913f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C21589t(this.f104908a, this.f104909b.intValue(), this.f104910c.booleanValue(), this.f104911d.intValue(), this.f104912e.longValue(), this.f104913f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.c.a
        /* renamed from: b */
        public AbstractC21569b0.e.d.c.a mo111471b(Double d11) {
            this.f104908a = d11;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.c.a
        /* renamed from: c */
        public AbstractC21569b0.e.d.c.a mo111472c(int i11) {
            this.f104909b = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.c.a
        /* renamed from: d */
        public AbstractC21569b0.e.d.c.a mo111473d(long j11) {
            this.f104913f = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.c.a
        /* renamed from: e */
        public AbstractC21569b0.e.d.c.a mo111474e(int i11) {
            this.f104911d = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.c.a
        /* renamed from: f */
        public AbstractC21569b0.e.d.c.a mo111475f(boolean z11) {
            this.f104910c = Boolean.valueOf(z11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.c.a
        /* renamed from: g */
        public AbstractC21569b0.e.d.c.a mo111476g(long j11) {
            this.f104912e = Long.valueOf(j11);
            return this;
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.c
    /* renamed from: b */
    public Double mo111464b() {
        return this.f104902a;
    }

    @Override // p292k8.AbstractC21569b0.e.d.c
    /* renamed from: c */
    public int mo111465c() {
        return this.f104903b;
    }

    @Override // p292k8.AbstractC21569b0.e.d.c
    /* renamed from: d */
    public long mo111466d() {
        return this.f104907f;
    }

    @Override // p292k8.AbstractC21569b0.e.d.c
    /* renamed from: e */
    public int mo111467e() {
        return this.f104905d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.c)) {
            return false;
        }
        AbstractC21569b0.e.d.c cVar = (AbstractC21569b0.e.d.c) obj;
        Double d11 = this.f104902a;
        if (d11 != null ? d11.equals(cVar.mo111464b()) : cVar.mo111464b() == null) {
            if (this.f104903b == cVar.mo111465c() && this.f104904c == cVar.mo111469g() && this.f104905d == cVar.mo111467e() && this.f104906e == cVar.mo111468f() && this.f104907f == cVar.mo111466d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.d.c
    /* renamed from: f */
    public long mo111468f() {
        return this.f104906e;
    }

    @Override // p292k8.AbstractC21569b0.e.d.c
    /* renamed from: g */
    public boolean mo111469g() {
        return this.f104904c;
    }

    public int hashCode() {
        int hashCode;
        int i11;
        Double d11 = this.f104902a;
        if (d11 == null) {
            hashCode = 0;
        } else {
            hashCode = d11.hashCode();
        }
        int i12 = (((hashCode ^ 1000003) * 1000003) ^ this.f104903b) * 1000003;
        if (this.f104904c) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i13 = (((i12 ^ i11) * 1000003) ^ this.f104905d) * 1000003;
        long j11 = this.f104906e;
        long j12 = this.f104907f;
        return ((i13 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f104902a + ", batteryVelocity=" + this.f104903b + ", proximityOn=" + this.f104904c + ", orientation=" + this.f104905d + ", ramUsed=" + this.f104906e + ", diskUsed=" + this.f104907f + "}";
    }

    private C21589t(Double d11, int i11, boolean z11, int i12, long j11, long j12) {
        this.f104902a = d11;
        this.f104903b = i11;
        this.f104904c = z11;
        this.f104905d = i12;
        this.f104906e = j11;
        this.f104907f = j12;
    }
}
