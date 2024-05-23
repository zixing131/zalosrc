package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.c */
/* loaded from: classes.dex */
final class C21570c extends AbstractC21569b0.a {

    /* renamed from: a */
    private final int f104743a;

    /* renamed from: b */
    private final String f104744b;

    /* renamed from: c */
    private final int f104745c;

    /* renamed from: d */
    private final int f104746d;

    /* renamed from: e */
    private final long f104747e;

    /* renamed from: f */
    private final long f104748f;

    /* renamed from: g */
    private final long f104749g;

    /* renamed from: h */
    private final String f104750h;

    /* renamed from: i */
    private final C21571c0 f104751i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC21569b0.a.b {

        /* renamed from: a */
        private Integer f104752a;

        /* renamed from: b */
        private String f104753b;

        /* renamed from: c */
        private Integer f104754c;

        /* renamed from: d */
        private Integer f104755d;

        /* renamed from: e */
        private Long f104756e;

        /* renamed from: f */
        private Long f104757f;

        /* renamed from: g */
        private Long f104758g;

        /* renamed from: h */
        private String f104759h;

        /* renamed from: i */
        private C21571c0 f104760i;

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: a */
        public AbstractC21569b0.a mo111281a() {
            String str = "";
            if (this.f104752a == null) {
                str = " pid";
            }
            if (this.f104753b == null) {
                str = str + " processName";
            }
            if (this.f104754c == null) {
                str = str + " reasonCode";
            }
            if (this.f104755d == null) {
                str = str + " importance";
            }
            if (this.f104756e == null) {
                str = str + " pss";
            }
            if (this.f104757f == null) {
                str = str + " rss";
            }
            if (this.f104758g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C21570c(this.f104752a.intValue(), this.f104753b, this.f104754c.intValue(), this.f104755d.intValue(), this.f104756e.longValue(), this.f104757f.longValue(), this.f104758g.longValue(), this.f104759h, this.f104760i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: b */
        public AbstractC21569b0.a.b mo111282b(C21571c0 c21571c0) {
            this.f104760i = c21571c0;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: c */
        public AbstractC21569b0.a.b mo111283c(int i11) {
            this.f104755d = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: d */
        public AbstractC21569b0.a.b mo111284d(int i11) {
            this.f104752a = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: e */
        public AbstractC21569b0.a.b mo111285e(String str) {
            if (str != null) {
                this.f104753b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: f */
        public AbstractC21569b0.a.b mo111286f(long j11) {
            this.f104756e = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: g */
        public AbstractC21569b0.a.b mo111287g(int i11) {
            this.f104754c = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: h */
        public AbstractC21569b0.a.b mo111288h(long j11) {
            this.f104757f = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: i */
        public AbstractC21569b0.a.b mo111289i(long j11) {
            this.f104758g = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.a.b
        /* renamed from: j */
        public AbstractC21569b0.a.b mo111290j(String str) {
            this.f104759h = str;
            return this;
        }
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: b */
    public C21571c0 mo111264b() {
        return this.f104751i;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: c */
    public int mo111265c() {
        return this.f104746d;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: d */
    public int mo111266d() {
        return this.f104743a;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: e */
    public String mo111267e() {
        return this.f104744b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.a)) {
            return false;
        }
        AbstractC21569b0.a aVar = (AbstractC21569b0.a) obj;
        if (this.f104743a == aVar.mo111266d() && this.f104744b.equals(aVar.mo111267e()) && this.f104745c == aVar.mo111269g() && this.f104746d == aVar.mo111265c() && this.f104747e == aVar.mo111268f() && this.f104748f == aVar.mo111270h() && this.f104749g == aVar.mo111271i() && ((str = this.f104750h) != null ? str.equals(aVar.mo111272j()) : aVar.mo111272j() == null)) {
            C21571c0 c21571c0 = this.f104751i;
            if (c21571c0 == null) {
                if (aVar.mo111264b() == null) {
                    return true;
                }
            } else if (c21571c0.equals(aVar.mo111264b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: f */
    public long mo111268f() {
        return this.f104747e;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: g */
    public int mo111269g() {
        return this.f104745c;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: h */
    public long mo111270h() {
        return this.f104748f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f104743a ^ 1000003) * 1000003) ^ this.f104744b.hashCode()) * 1000003) ^ this.f104745c) * 1000003) ^ this.f104746d) * 1000003;
        long j11 = this.f104747e;
        int i11 = (hashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f104748f;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f104749g;
        int i13 = (i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        String str = this.f104750h;
        int i14 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i15 = (i13 ^ hashCode) * 1000003;
        C21571c0 c21571c0 = this.f104751i;
        if (c21571c0 != null) {
            i14 = c21571c0.hashCode();
        }
        return i15 ^ i14;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: i */
    public long mo111271i() {
        return this.f104749g;
    }

    @Override // p292k8.AbstractC21569b0.a
    /* renamed from: j */
    public String mo111272j() {
        return this.f104750h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f104743a + ", processName=" + this.f104744b + ", reasonCode=" + this.f104745c + ", importance=" + this.f104746d + ", pss=" + this.f104747e + ", rss=" + this.f104748f + ", timestamp=" + this.f104749g + ", traceFile=" + this.f104750h + ", buildIdMappingForArch=" + this.f104751i + "}";
    }

    private C21570c(int i11, String str, int i12, int i13, long j11, long j12, long j13, String str2, C21571c0 c21571c0) {
        this.f104743a = i11;
        this.f104744b = str;
        this.f104745c = i12;
        this.f104746d = i13;
        this.f104747e = j11;
        this.f104748f = j12;
        this.f104749g = j13;
        this.f104750h = str2;
        this.f104751i = c21571c0;
    }
}
