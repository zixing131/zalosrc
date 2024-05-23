package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.k */
/* loaded from: classes.dex */
final class C21580k extends AbstractC21569b0.e.c {

    /* renamed from: a */
    private final int f104814a;

    /* renamed from: b */
    private final String f104815b;

    /* renamed from: c */
    private final int f104816c;

    /* renamed from: d */
    private final long f104817d;

    /* renamed from: e */
    private final long f104818e;

    /* renamed from: f */
    private final boolean f104819f;

    /* renamed from: g */
    private final int f104820g;

    /* renamed from: h */
    private final String f104821h;

    /* renamed from: i */
    private final String f104822i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.k$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.c.a {

        /* renamed from: a */
        private Integer f104823a;

        /* renamed from: b */
        private String f104824b;

        /* renamed from: c */
        private Integer f104825c;

        /* renamed from: d */
        private Long f104826d;

        /* renamed from: e */
        private Long f104827e;

        /* renamed from: f */
        private Boolean f104828f;

        /* renamed from: g */
        private Integer f104829g;

        /* renamed from: h */
        private String f104830h;

        /* renamed from: i */
        private String f104831i;

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: a */
        public AbstractC21569b0.e.c mo111363a() {
            String str = "";
            if (this.f104823a == null) {
                str = " arch";
            }
            if (this.f104824b == null) {
                str = str + " model";
            }
            if (this.f104825c == null) {
                str = str + " cores";
            }
            if (this.f104826d == null) {
                str = str + " ram";
            }
            if (this.f104827e == null) {
                str = str + " diskSpace";
            }
            if (this.f104828f == null) {
                str = str + " simulator";
            }
            if (this.f104829g == null) {
                str = str + " state";
            }
            if (this.f104830h == null) {
                str = str + " manufacturer";
            }
            if (this.f104831i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C21580k(this.f104823a.intValue(), this.f104824b, this.f104825c.intValue(), this.f104826d.longValue(), this.f104827e.longValue(), this.f104828f.booleanValue(), this.f104829g.intValue(), this.f104830h, this.f104831i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: b */
        public AbstractC21569b0.e.c.a mo111364b(int i11) {
            this.f104823a = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: c */
        public AbstractC21569b0.e.c.a mo111365c(int i11) {
            this.f104825c = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: d */
        public AbstractC21569b0.e.c.a mo111366d(long j11) {
            this.f104827e = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: e */
        public AbstractC21569b0.e.c.a mo111367e(String str) {
            if (str != null) {
                this.f104830h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: f */
        public AbstractC21569b0.e.c.a mo111368f(String str) {
            if (str != null) {
                this.f104824b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: g */
        public AbstractC21569b0.e.c.a mo111369g(String str) {
            if (str != null) {
                this.f104831i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: h */
        public AbstractC21569b0.e.c.a mo111370h(long j11) {
            this.f104826d = Long.valueOf(j11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: i */
        public AbstractC21569b0.e.c.a mo111371i(boolean z11) {
            this.f104828f = Boolean.valueOf(z11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.c.a
        /* renamed from: j */
        public AbstractC21569b0.e.c.a mo111372j(int i11) {
            this.f104829g = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: b */
    public int mo111354b() {
        return this.f104814a;
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: c */
    public int mo111355c() {
        return this.f104816c;
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: d */
    public long mo111356d() {
        return this.f104818e;
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: e */
    public String mo111357e() {
        return this.f104821h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.c)) {
            return false;
        }
        AbstractC21569b0.e.c cVar = (AbstractC21569b0.e.c) obj;
        if (this.f104814a == cVar.mo111354b() && this.f104815b.equals(cVar.mo111358f()) && this.f104816c == cVar.mo111355c() && this.f104817d == cVar.mo111360h() && this.f104818e == cVar.mo111356d() && this.f104819f == cVar.mo111362j() && this.f104820g == cVar.mo111361i() && this.f104821h.equals(cVar.mo111357e()) && this.f104822i.equals(cVar.mo111359g())) {
            return true;
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: f */
    public String mo111358f() {
        return this.f104815b;
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: g */
    public String mo111359g() {
        return this.f104822i;
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: h */
    public long mo111360h() {
        return this.f104817d;
    }

    public int hashCode() {
        int i11;
        int hashCode = (((((this.f104814a ^ 1000003) * 1000003) ^ this.f104815b.hashCode()) * 1000003) ^ this.f104816c) * 1000003;
        long j11 = this.f104817d;
        int i12 = (hashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f104818e;
        int i13 = (i12 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        if (this.f104819f) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((((i13 ^ i11) * 1000003) ^ this.f104820g) * 1000003) ^ this.f104821h.hashCode()) * 1000003) ^ this.f104822i.hashCode();
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: i */
    public int mo111361i() {
        return this.f104820g;
    }

    @Override // p292k8.AbstractC21569b0.e.c
    /* renamed from: j */
    public boolean mo111362j() {
        return this.f104819f;
    }

    public String toString() {
        return "Device{arch=" + this.f104814a + ", model=" + this.f104815b + ", cores=" + this.f104816c + ", ram=" + this.f104817d + ", diskSpace=" + this.f104818e + ", simulator=" + this.f104819f + ", state=" + this.f104820g + ", manufacturer=" + this.f104821h + ", modelClass=" + this.f104822i + "}";
    }

    private C21580k(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f104814a = i11;
        this.f104815b = str;
        this.f104816c = i12;
        this.f104817d = j11;
        this.f104818e = j12;
        this.f104819f = z11;
        this.f104820g = i13;
        this.f104821h = str2;
        this.f104822i = str3;
    }
}
