package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.i */
/* loaded from: classes.dex */
final class C21578i extends AbstractC21569b0.e.a {

    /* renamed from: a */
    private final String f104802a;

    /* renamed from: b */
    private final String f104803b;

    /* renamed from: c */
    private final String f104804c;

    /* renamed from: d */
    private final String f104805d;

    /* renamed from: e */
    private final String f104806e;

    /* renamed from: f */
    private final String f104807f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.a.AbstractC32856a {

        /* renamed from: a */
        private String f104808a;

        /* renamed from: b */
        private String f104809b;

        /* renamed from: c */
        private String f104810c;

        /* renamed from: d */
        private String f104811d;

        /* renamed from: e */
        private String f104812e;

        /* renamed from: f */
        private String f104813f;

        @Override // p292k8.AbstractC21569b0.e.a.AbstractC32856a
        /* renamed from: a */
        public AbstractC21569b0.e.a mo111333a() {
            String str = "";
            if (this.f104808a == null) {
                str = " identifier";
            }
            if (this.f104809b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C21578i(this.f104808a, this.f104809b, this.f104810c, null, this.f104811d, this.f104812e, this.f104813f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.a.AbstractC32856a
        /* renamed from: b */
        public AbstractC21569b0.e.a.AbstractC32856a mo111334b(String str) {
            this.f104812e = str;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.a.AbstractC32856a
        /* renamed from: c */
        public AbstractC21569b0.e.a.AbstractC32856a mo111335c(String str) {
            this.f104813f = str;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.a.AbstractC32856a
        /* renamed from: d */
        public AbstractC21569b0.e.a.AbstractC32856a mo111336d(String str) {
            this.f104810c = str;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.a.AbstractC32856a
        /* renamed from: e */
        public AbstractC21569b0.e.a.AbstractC32856a mo111337e(String str) {
            if (str != null) {
                this.f104808a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // p292k8.AbstractC21569b0.e.a.AbstractC32856a
        /* renamed from: f */
        public AbstractC21569b0.e.a.AbstractC32856a mo111338f(String str) {
            this.f104811d = str;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.a.AbstractC32856a
        /* renamed from: g */
        public AbstractC21569b0.e.a.AbstractC32856a mo111339g(String str) {
            if (str != null) {
                this.f104809b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.a
    /* renamed from: b */
    public String mo111326b() {
        return this.f104806e;
    }

    @Override // p292k8.AbstractC21569b0.e.a
    /* renamed from: c */
    public String mo111327c() {
        return this.f104807f;
    }

    @Override // p292k8.AbstractC21569b0.e.a
    /* renamed from: d */
    public String mo111328d() {
        return this.f104804c;
    }

    @Override // p292k8.AbstractC21569b0.e.a
    /* renamed from: e */
    public String mo111329e() {
        return this.f104802a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.a)) {
            return false;
        }
        AbstractC21569b0.e.a aVar = (AbstractC21569b0.e.a) obj;
        if (this.f104802a.equals(aVar.mo111329e()) && this.f104803b.equals(aVar.mo111332h()) && ((str = this.f104804c) != null ? str.equals(aVar.mo111328d()) : aVar.mo111328d() == null)) {
            aVar.mo111331g();
            String str2 = this.f104805d;
            if (str2 != null ? str2.equals(aVar.mo111330f()) : aVar.mo111330f() == null) {
                String str3 = this.f104806e;
                if (str3 != null ? str3.equals(aVar.mo111326b()) : aVar.mo111326b() == null) {
                    String str4 = this.f104807f;
                    if (str4 == null) {
                        if (aVar.mo111327c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.mo111327c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.a
    /* renamed from: f */
    public String mo111330f() {
        return this.f104805d;
    }

    @Override // p292k8.AbstractC21569b0.e.a
    /* renamed from: g */
    public AbstractC21569b0.e.a.b mo111331g() {
        return null;
    }

    @Override // p292k8.AbstractC21569b0.e.a
    /* renamed from: h */
    public String mo111332h() {
        return this.f104803b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f104802a.hashCode() ^ 1000003) * 1000003) ^ this.f104803b.hashCode()) * 1000003;
        String str = this.f104804c;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.f104805d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str3 = this.f104806e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        String str4 = this.f104807f;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return i14 ^ i11;
    }

    public String toString() {
        return "Application{identifier=" + this.f104802a + ", version=" + this.f104803b + ", displayVersion=" + this.f104804c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f104805d + ", developmentPlatform=" + this.f104806e + ", developmentPlatformVersion=" + this.f104807f + "}";
    }

    private C21578i(String str, String str2, String str3, AbstractC21569b0.e.a.b bVar, String str4, String str5, String str6) {
        this.f104802a = str;
        this.f104803b = str2;
        this.f104804c = str3;
        this.f104805d = str4;
        this.f104806e = str5;
        this.f104807f = str6;
    }
}
