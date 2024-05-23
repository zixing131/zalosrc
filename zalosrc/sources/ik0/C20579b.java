package ik0;

import ik0.AbstractC20596s;

/* renamed from: ik0.b */
/* loaded from: classes7.dex */
final class C20579b extends AbstractC20596s {

    /* renamed from: a */
    private final int f101197a;

    /* renamed from: b */
    private final String f101198b;

    /* renamed from: c */
    private final String f101199c;

    /* renamed from: d */
    private final AbstractC20596s.b f101200d;

    /* renamed from: e */
    private final String f101201e;

    /* renamed from: f */
    private final String f101202f;

    /* renamed from: g */
    private final String f101203g;

    /* renamed from: h */
    private final String f101204h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ik0.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC20596s.a {

        /* renamed from: a */
        private Integer f101205a;

        /* renamed from: b */
        private String f101206b;

        /* renamed from: c */
        private String f101207c;

        /* renamed from: d */
        private AbstractC20596s.b f101208d;

        /* renamed from: e */
        private String f101209e;

        /* renamed from: f */
        private String f101210f;

        /* renamed from: g */
        private String f101211g;

        /* renamed from: h */
        private String f101212h;

        @Override // ik0.AbstractC20596s.a
        /* renamed from: a */
        public AbstractC20596s mo107064a() {
            String str = "";
            if (this.f101205a == null) {
                str = " type";
            }
            if (this.f101207c == null) {
                str = str + " resourceChecksum";
            }
            if (this.f101211g == null) {
                str = str + " zinstantDataId";
            }
            if (str.isEmpty()) {
                return new C20579b(this.f101205a.intValue(), this.f101206b, this.f101207c, this.f101208d, this.f101209e, this.f101210f, this.f101211g, this.f101212h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ik0.AbstractC20596s.a
        /* renamed from: b */
        public AbstractC20596s.a mo107065b(String str) {
            this.f101212h = str;
            return this;
        }

        @Override // ik0.AbstractC20596s.a
        /* renamed from: c */
        public AbstractC20596s.a mo107066c(String str) {
            this.f101209e = str;
            return this;
        }

        @Override // ik0.AbstractC20596s.a
        /* renamed from: d */
        public AbstractC20596s.a mo107067d(AbstractC20596s.b bVar) {
            this.f101208d = bVar;
            return this;
        }

        @Override // ik0.AbstractC20596s.a
        /* renamed from: e */
        public AbstractC20596s.a mo107068e(String str) {
            this.f101210f = str;
            return this;
        }

        @Override // ik0.AbstractC20596s.a
        /* renamed from: f */
        public AbstractC20596s.a mo107069f(String str) {
            if (str != null) {
                this.f101207c = str;
                return this;
            }
            throw new NullPointerException("Null resourceChecksum");
        }

        @Override // ik0.AbstractC20596s.a
        /* renamed from: g */
        public AbstractC20596s.a mo107070g(String str) {
            this.f101206b = str;
            return this;
        }

        @Override // ik0.AbstractC20596s.a
        /* renamed from: h */
        public AbstractC20596s.a mo107071h(String str) {
            if (str != null) {
                this.f101211g = str;
                return this;
            }
            throw new NullPointerException("Null zinstantDataId");
        }

        /* renamed from: i */
        public AbstractC20596s.a m107072i(int i11) {
            this.f101205a = Integer.valueOf(i11);
            return this;
        }
    }

    /* synthetic */ C20579b(int i11, String str, String str2, AbstractC20596s.b bVar, String str3, String str4, String str5, String str6, a aVar) {
        this(i11, str, str2, bVar, str3, str4, str5, str6);
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: c */
    public String mo107056c() {
        return this.f101204h;
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: d */
    public String mo107057d() {
        return this.f101201e;
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: e */
    public AbstractC20596s.b mo107058e() {
        return this.f101200d;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC20596s.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20596s)) {
            return false;
        }
        AbstractC20596s abstractC20596s = (AbstractC20596s) obj;
        if (this.f101197a == abstractC20596s.mo107062i() && ((str = this.f101198b) != null ? str.equals(abstractC20596s.mo107061h()) : abstractC20596s.mo107061h() == null) && this.f101199c.equals(abstractC20596s.mo107060g()) && ((bVar = this.f101200d) != null ? bVar.equals(abstractC20596s.mo107058e()) : abstractC20596s.mo107058e() == null) && ((str2 = this.f101201e) != null ? str2.equals(abstractC20596s.mo107057d()) : abstractC20596s.mo107057d() == null) && ((str3 = this.f101202f) != null ? str3.equals(abstractC20596s.mo107059f()) : abstractC20596s.mo107059f() == null) && this.f101203g.equals(abstractC20596s.mo107063j())) {
            String str4 = this.f101204h;
            if (str4 == null) {
                if (abstractC20596s.mo107056c() == null) {
                    return true;
                }
            } else if (str4.equals(abstractC20596s.mo107056c())) {
                return true;
            }
        }
        return false;
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: f */
    public String mo107059f() {
        return this.f101202f;
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: g */
    public String mo107060g() {
        return this.f101199c;
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: h */
    public String mo107061h() {
        return this.f101198b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i11 = (this.f101197a ^ 1000003) * 1000003;
        String str = this.f101198b;
        int i12 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((i11 ^ hashCode) * 1000003) ^ this.f101199c.hashCode()) * 1000003;
        AbstractC20596s.b bVar = this.f101200d;
        if (bVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bVar.hashCode();
        }
        int i13 = (hashCode5 ^ hashCode2) * 1000003;
        String str2 = this.f101201e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        String str3 = this.f101202f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode6 = (((i14 ^ hashCode4) * 1000003) ^ this.f101203g.hashCode()) * 1000003;
        String str4 = this.f101204h;
        if (str4 != null) {
            i12 = str4.hashCode();
        }
        return hashCode6 ^ i12;
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: i */
    public int mo107062i() {
        return this.f101197a;
    }

    @Override // ik0.AbstractC20596s
    /* renamed from: j */
    public String mo107063j() {
        return this.f101203g;
    }

    public String toString() {
        return "ZinstantDataLayoutRequest{type=" + this.f101197a + ", resourceUrl=" + this.f101198b + ", resourceChecksum=" + this.f101199c + ", dataLayoutExtra=" + this.f101200d + ", customPath=" + this.f101201e + ", identifyKey=" + this.f101202f + ", zinstantDataId=" + this.f101203g + ", bundleData=" + this.f101204h + "}";
    }

    private C20579b(int i11, String str, String str2, AbstractC20596s.b bVar, String str3, String str4, String str5, String str6) {
        this.f101197a = i11;
        this.f101198b = str;
        this.f101199c = str2;
        this.f101200d = bVar;
        this.f101201e = str3;
        this.f101202f = str4;
        this.f101203g = str5;
        this.f101204h = str6;
    }
}
