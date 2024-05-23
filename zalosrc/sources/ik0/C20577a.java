package ik0;

import ik0.AbstractC20595r;

/* renamed from: ik0.a */
/* loaded from: classes7.dex */
final class C20577a extends AbstractC20595r {

    /* renamed from: a */
    private final String f101185a;

    /* renamed from: b */
    private final String f101186b;

    /* renamed from: c */
    private final int f101187c;

    /* renamed from: d */
    private final int f101188d;

    /* renamed from: e */
    private final String f101189e;

    /* renamed from: f */
    private final String f101190f;

    /* renamed from: ik0.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC20595r.a {

        /* renamed from: a */
        private String f101191a;

        /* renamed from: b */
        private String f101192b;

        /* renamed from: c */
        private Integer f101193c;

        /* renamed from: d */
        private Integer f101194d;

        /* renamed from: e */
        private String f101195e;

        /* renamed from: f */
        private String f101196f;

        @Override // ik0.AbstractC20595r.a
        /* renamed from: a */
        public AbstractC20595r mo107049a() {
            String str = "";
            if (this.f101192b == null) {
                str = " zinstantDataId";
            }
            if (this.f101193c == null) {
                str = str + " socketCmd";
            }
            if (this.f101194d == null) {
                str = str + " httpType";
            }
            if (str.isEmpty()) {
                return new C20577a(this.f101191a, this.f101192b, this.f101193c.intValue(), this.f101194d.intValue(), this.f101195e, this.f101196f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ik0.AbstractC20595r.a
        /* renamed from: b */
        public AbstractC20595r.a mo107050b(String str) {
            this.f101196f = str;
            return this;
        }

        @Override // ik0.AbstractC20595r.a
        /* renamed from: c */
        public AbstractC20595r.a mo107051c(String str) {
            this.f101195e = str;
            return this;
        }

        @Override // ik0.AbstractC20595r.a
        /* renamed from: d */
        public AbstractC20595r.a mo107052d(int i11) {
            this.f101194d = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20595r.a
        /* renamed from: e */
        public AbstractC20595r.a mo107053e(int i11) {
            this.f101193c = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20595r.a
        /* renamed from: f */
        public AbstractC20595r.a mo107054f(String str) {
            if (str != null) {
                this.f101192b = str;
                return this;
            }
            throw new NullPointerException("Null zinstantDataId");
        }

        /* renamed from: g */
        public AbstractC20595r.a m107055g(String str) {
            this.f101191a = str;
            return this;
        }
    }

    /* synthetic */ C20577a(String str, String str2, int i11, int i12, String str3, String str4, a aVar) {
        this(str, str2, i11, i12, str3, str4);
    }

    @Override // ik0.AbstractC20595r
    /* renamed from: a */
    public String mo107043a() {
        return this.f101185a;
    }

    @Override // ik0.AbstractC20595r
    /* renamed from: c */
    public String mo107044c() {
        return this.f101190f;
    }

    @Override // ik0.AbstractC20595r
    /* renamed from: d */
    public String mo107045d() {
        return this.f101189e;
    }

    @Override // ik0.AbstractC20595r
    /* renamed from: e */
    public int mo107046e() {
        return this.f101188d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20595r)) {
            return false;
        }
        AbstractC20595r abstractC20595r = (AbstractC20595r) obj;
        String str2 = this.f101185a;
        if (str2 != null ? str2.equals(abstractC20595r.mo107043a()) : abstractC20595r.mo107043a() == null) {
            if (this.f101186b.equals(abstractC20595r.mo107048g()) && this.f101187c == abstractC20595r.mo107047f() && this.f101188d == abstractC20595r.mo107046e() && ((str = this.f101189e) != null ? str.equals(abstractC20595r.mo107045d()) : abstractC20595r.mo107045d() == null)) {
                String str3 = this.f101190f;
                if (str3 == null) {
                    if (abstractC20595r.mo107044c() == null) {
                        return true;
                    }
                } else if (str3.equals(abstractC20595r.mo107044c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ik0.AbstractC20595r
    /* renamed from: f */
    public int mo107047f() {
        return this.f101187c;
    }

    @Override // ik0.AbstractC20595r
    /* renamed from: g */
    public String mo107048g() {
        return this.f101186b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f101185a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((hashCode ^ 1000003) * 1000003) ^ this.f101186b.hashCode()) * 1000003) ^ this.f101187c) * 1000003) ^ this.f101188d) * 1000003;
        String str2 = this.f101189e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (hashCode3 ^ hashCode2) * 1000003;
        String str3 = this.f101190f;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "ZinstantDataConfigRequest{apiUrl=" + this.f101185a + ", zinstantDataId=" + this.f101186b + ", socketCmd=" + this.f101187c + ", httpType=" + this.f101188d + ", dataExtras=" + this.f101189e + ", bundleData=" + this.f101190f + "}";
    }

    private C20577a(String str, String str2, int i11, int i12, String str3, String str4) {
        this.f101185a = str;
        this.f101186b = str2;
        this.f101187c = i11;
        this.f101188d = i12;
        this.f101189e = str3;
        this.f101190f = str4;
    }
}
