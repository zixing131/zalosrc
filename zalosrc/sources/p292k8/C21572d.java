package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.d */
/* loaded from: classes.dex */
final class C21572d extends AbstractC21569b0.a.AbstractC32854a {

    /* renamed from: a */
    private final String f104762a;

    /* renamed from: b */
    private final String f104763b;

    /* renamed from: c */
    private final String f104764c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC21569b0.a.AbstractC32854a.AbstractC32855a {

        /* renamed from: a */
        private String f104765a;

        /* renamed from: b */
        private String f104766b;

        /* renamed from: c */
        private String f104767c;

        @Override // p292k8.AbstractC21569b0.a.AbstractC32854a.AbstractC32855a
        /* renamed from: a */
        public AbstractC21569b0.a.AbstractC32854a mo111277a() {
            String str = "";
            if (this.f104765a == null) {
                str = " arch";
            }
            if (this.f104766b == null) {
                str = str + " libraryName";
            }
            if (this.f104767c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C21572d(this.f104765a, this.f104766b, this.f104767c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.a.AbstractC32854a.AbstractC32855a
        /* renamed from: b */
        public AbstractC21569b0.a.AbstractC32854a.AbstractC32855a mo111278b(String str) {
            if (str != null) {
                this.f104765a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // p292k8.AbstractC21569b0.a.AbstractC32854a.AbstractC32855a
        /* renamed from: c */
        public AbstractC21569b0.a.AbstractC32854a.AbstractC32855a mo111279c(String str) {
            if (str != null) {
                this.f104767c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // p292k8.AbstractC21569b0.a.AbstractC32854a.AbstractC32855a
        /* renamed from: d */
        public AbstractC21569b0.a.AbstractC32854a.AbstractC32855a mo111280d(String str) {
            if (str != null) {
                this.f104766b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // p292k8.AbstractC21569b0.a.AbstractC32854a
    /* renamed from: b */
    public String mo111274b() {
        return this.f104762a;
    }

    @Override // p292k8.AbstractC21569b0.a.AbstractC32854a
    /* renamed from: c */
    public String mo111275c() {
        return this.f104764c;
    }

    @Override // p292k8.AbstractC21569b0.a.AbstractC32854a
    /* renamed from: d */
    public String mo111276d() {
        return this.f104763b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.a.AbstractC32854a)) {
            return false;
        }
        AbstractC21569b0.a.AbstractC32854a abstractC32854a = (AbstractC21569b0.a.AbstractC32854a) obj;
        if (this.f104762a.equals(abstractC32854a.mo111274b()) && this.f104763b.equals(abstractC32854a.mo111276d()) && this.f104764c.equals(abstractC32854a.mo111275c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f104762a.hashCode() ^ 1000003) * 1000003) ^ this.f104763b.hashCode()) * 1000003) ^ this.f104764c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f104762a + ", libraryName=" + this.f104763b + ", buildId=" + this.f104764c + "}";
    }

    private C21572d(String str, String str2, String str3) {
        this.f104762a = str;
        this.f104763b = str2;
        this.f104764c = str3;
    }
}
