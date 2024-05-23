package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.p */
/* loaded from: classes.dex */
final class C21585p extends AbstractC21569b0.e.d.a.b.c {

    /* renamed from: a */
    private final String f104870a;

    /* renamed from: b */
    private final String f104871b;

    /* renamed from: c */
    private final C21571c0 f104872c;

    /* renamed from: d */
    private final AbstractC21569b0.e.d.a.b.c f104873d;

    /* renamed from: e */
    private final int f104874e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.p$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.a.b.c.AbstractC32861a {

        /* renamed from: a */
        private String f104875a;

        /* renamed from: b */
        private String f104876b;

        /* renamed from: c */
        private C21571c0 f104877c;

        /* renamed from: d */
        private AbstractC21569b0.e.d.a.b.c f104878d;

        /* renamed from: e */
        private Integer f104879e;

        @Override // p292k8.AbstractC21569b0.e.d.a.b.c.AbstractC32861a
        /* renamed from: a */
        public AbstractC21569b0.e.d.a.b.c mo111423a() {
            String str = "";
            if (this.f104875a == null) {
                str = " type";
            }
            if (this.f104877c == null) {
                str = str + " frames";
            }
            if (this.f104879e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C21585p(this.f104875a, this.f104876b, this.f104877c, this.f104878d, this.f104879e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.c.AbstractC32861a
        /* renamed from: b */
        public AbstractC21569b0.e.d.a.b.c.AbstractC32861a mo111424b(AbstractC21569b0.e.d.a.b.c cVar) {
            this.f104878d = cVar;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.c.AbstractC32861a
        /* renamed from: c */
        public AbstractC21569b0.e.d.a.b.c.AbstractC32861a mo111425c(C21571c0 c21571c0) {
            if (c21571c0 != null) {
                this.f104877c = c21571c0;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.c.AbstractC32861a
        /* renamed from: d */
        public AbstractC21569b0.e.d.a.b.c.AbstractC32861a mo111426d(int i11) {
            this.f104879e = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.c.AbstractC32861a
        /* renamed from: e */
        public AbstractC21569b0.e.d.a.b.c.AbstractC32861a mo111427e(String str) {
            this.f104876b = str;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.c.AbstractC32861a
        /* renamed from: f */
        public AbstractC21569b0.e.d.a.b.c.AbstractC32861a mo111428f(String str) {
            if (str != null) {
                this.f104875a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.c
    /* renamed from: b */
    public AbstractC21569b0.e.d.a.b.c mo111418b() {
        return this.f104873d;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.c
    /* renamed from: c */
    public C21571c0 mo111419c() {
        return this.f104872c;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.c
    /* renamed from: d */
    public int mo111420d() {
        return this.f104874e;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.c
    /* renamed from: e */
    public String mo111421e() {
        return this.f104871b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC21569b0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.a.b.c)) {
            return false;
        }
        AbstractC21569b0.e.d.a.b.c cVar2 = (AbstractC21569b0.e.d.a.b.c) obj;
        if (this.f104870a.equals(cVar2.mo111422f()) && ((str = this.f104871b) != null ? str.equals(cVar2.mo111421e()) : cVar2.mo111421e() == null) && this.f104872c.equals(cVar2.mo111419c()) && ((cVar = this.f104873d) != null ? cVar.equals(cVar2.mo111418b()) : cVar2.mo111418b() == null) && this.f104874e == cVar2.mo111420d()) {
            return true;
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.c
    /* renamed from: f */
    public String mo111422f() {
        return this.f104870a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f104870a.hashCode() ^ 1000003) * 1000003;
        String str = this.f104871b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f104872c.hashCode()) * 1000003;
        AbstractC21569b0.e.d.a.b.c cVar = this.f104873d;
        if (cVar != null) {
            i11 = cVar.hashCode();
        }
        return ((hashCode3 ^ i11) * 1000003) ^ this.f104874e;
    }

    public String toString() {
        return "Exception{type=" + this.f104870a + ", reason=" + this.f104871b + ", frames=" + this.f104872c + ", causedBy=" + this.f104873d + ", overflowCount=" + this.f104874e + "}";
    }

    private C21585p(String str, String str2, C21571c0 c21571c0, AbstractC21569b0.e.d.a.b.c cVar, int i11) {
        this.f104870a = str;
        this.f104871b = str2;
        this.f104872c = c21571c0;
        this.f104873d = cVar;
        this.f104874e = i11;
    }
}
