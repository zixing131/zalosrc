package p096d9;

import p096d9.AbstractC17837d;

/* renamed from: d9.a */
/* loaded from: classes3.dex */
final class C17834a extends AbstractC17837d {

    /* renamed from: a */
    private final String f90103a;

    /* renamed from: b */
    private final String f90104b;

    /* renamed from: c */
    private final String f90105c;

    /* renamed from: d */
    private final AbstractC17839f f90106d;

    /* renamed from: e */
    private final AbstractC17837d.b f90107e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d9.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC17837d.a {

        /* renamed from: a */
        private String f90108a;

        /* renamed from: b */
        private String f90109b;

        /* renamed from: c */
        private String f90110c;

        /* renamed from: d */
        private AbstractC17839f f90111d;

        /* renamed from: e */
        private AbstractC17837d.b f90112e;

        @Override // p096d9.AbstractC17837d.a
        /* renamed from: a */
        public AbstractC17837d mo94075a() {
            return new C17834a(this.f90108a, this.f90109b, this.f90110c, this.f90111d, this.f90112e);
        }

        @Override // p096d9.AbstractC17837d.a
        /* renamed from: b */
        public AbstractC17837d.a mo94076b(AbstractC17839f abstractC17839f) {
            this.f90111d = abstractC17839f;
            return this;
        }

        @Override // p096d9.AbstractC17837d.a
        /* renamed from: c */
        public AbstractC17837d.a mo94077c(String str) {
            this.f90109b = str;
            return this;
        }

        @Override // p096d9.AbstractC17837d.a
        /* renamed from: d */
        public AbstractC17837d.a mo94078d(String str) {
            this.f90110c = str;
            return this;
        }

        @Override // p096d9.AbstractC17837d.a
        /* renamed from: e */
        public AbstractC17837d.a mo94079e(AbstractC17837d.b bVar) {
            this.f90112e = bVar;
            return this;
        }

        @Override // p096d9.AbstractC17837d.a
        /* renamed from: f */
        public AbstractC17837d.a mo94080f(String str) {
            this.f90108a = str;
            return this;
        }
    }

    /* synthetic */ C17834a(String str, String str2, String str3, AbstractC17839f abstractC17839f, AbstractC17837d.b bVar, a aVar) {
        this(str, str2, str3, abstractC17839f, bVar);
    }

    @Override // p096d9.AbstractC17837d
    /* renamed from: b */
    public AbstractC17839f mo94070b() {
        return this.f90106d;
    }

    @Override // p096d9.AbstractC17837d
    /* renamed from: c */
    public String mo94071c() {
        return this.f90104b;
    }

    @Override // p096d9.AbstractC17837d
    /* renamed from: d */
    public String mo94072d() {
        return this.f90105c;
    }

    @Override // p096d9.AbstractC17837d
    /* renamed from: e */
    public AbstractC17837d.b mo94073e() {
        return this.f90107e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17837d)) {
            return false;
        }
        AbstractC17837d abstractC17837d = (AbstractC17837d) obj;
        String str = this.f90103a;
        if (str != null ? str.equals(abstractC17837d.mo94074f()) : abstractC17837d.mo94074f() == null) {
            String str2 = this.f90104b;
            if (str2 != null ? str2.equals(abstractC17837d.mo94071c()) : abstractC17837d.mo94071c() == null) {
                String str3 = this.f90105c;
                if (str3 != null ? str3.equals(abstractC17837d.mo94072d()) : abstractC17837d.mo94072d() == null) {
                    AbstractC17839f abstractC17839f = this.f90106d;
                    if (abstractC17839f != null ? abstractC17839f.equals(abstractC17837d.mo94070b()) : abstractC17837d.mo94070b() == null) {
                        AbstractC17837d.b bVar = this.f90107e;
                        if (bVar == null) {
                            if (abstractC17837d.mo94073e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC17837d.mo94073e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p096d9.AbstractC17837d
    /* renamed from: f */
    public String mo94074f() {
        return this.f90103a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f90103a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f90104b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str3 = this.f90105c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        AbstractC17839f abstractC17839f = this.f90106d;
        if (abstractC17839f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC17839f.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        AbstractC17837d.b bVar = this.f90107e;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return i15 ^ i11;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f90103a + ", fid=" + this.f90104b + ", refreshToken=" + this.f90105c + ", authToken=" + this.f90106d + ", responseCode=" + this.f90107e + "}";
    }

    private C17834a(String str, String str2, String str3, AbstractC17839f abstractC17839f, AbstractC17837d.b bVar) {
        this.f90103a = str;
        this.f90104b = str2;
        this.f90105c = str3;
        this.f90106d = abstractC17839f;
        this.f90107e = bVar;
    }
}
