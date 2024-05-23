package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.v */
/* loaded from: classes.dex */
final class C21591v extends AbstractC21569b0.e.AbstractC32869e {

    /* renamed from: a */
    private final int f104916a;

    /* renamed from: b */
    private final String f104917b;

    /* renamed from: c */
    private final String f104918c;

    /* renamed from: d */
    private final boolean f104919d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.v$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.AbstractC32869e.a {

        /* renamed from: a */
        private Integer f104920a;

        /* renamed from: b */
        private String f104921b;

        /* renamed from: c */
        private String f104922c;

        /* renamed from: d */
        private Boolean f104923d;

        @Override // p292k8.AbstractC21569b0.e.AbstractC32869e.a
        /* renamed from: a */
        public AbstractC21569b0.e.AbstractC32869e mo111486a() {
            String str = "";
            if (this.f104920a == null) {
                str = " platform";
            }
            if (this.f104921b == null) {
                str = str + " version";
            }
            if (this.f104922c == null) {
                str = str + " buildVersion";
            }
            if (this.f104923d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C21591v(this.f104920a.intValue(), this.f104921b, this.f104922c, this.f104923d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.AbstractC32869e.a
        /* renamed from: b */
        public AbstractC21569b0.e.AbstractC32869e.a mo111487b(String str) {
            if (str != null) {
                this.f104922c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // p292k8.AbstractC21569b0.e.AbstractC32869e.a
        /* renamed from: c */
        public AbstractC21569b0.e.AbstractC32869e.a mo111488c(boolean z11) {
            this.f104923d = Boolean.valueOf(z11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.AbstractC32869e.a
        /* renamed from: d */
        public AbstractC21569b0.e.AbstractC32869e.a mo111489d(int i11) {
            this.f104920a = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.AbstractC32869e.a
        /* renamed from: e */
        public AbstractC21569b0.e.AbstractC32869e.a mo111490e(String str) {
            if (str != null) {
                this.f104921b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.AbstractC32869e
    /* renamed from: b */
    public String mo111482b() {
        return this.f104918c;
    }

    @Override // p292k8.AbstractC21569b0.e.AbstractC32869e
    /* renamed from: c */
    public int mo111483c() {
        return this.f104916a;
    }

    @Override // p292k8.AbstractC21569b0.e.AbstractC32869e
    /* renamed from: d */
    public String mo111484d() {
        return this.f104917b;
    }

    @Override // p292k8.AbstractC21569b0.e.AbstractC32869e
    /* renamed from: e */
    public boolean mo111485e() {
        return this.f104919d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.AbstractC32869e)) {
            return false;
        }
        AbstractC21569b0.e.AbstractC32869e abstractC32869e = (AbstractC21569b0.e.AbstractC32869e) obj;
        if (this.f104916a == abstractC32869e.mo111483c() && this.f104917b.equals(abstractC32869e.mo111484d()) && this.f104918c.equals(abstractC32869e.mo111482b()) && this.f104919d == abstractC32869e.mo111485e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i11;
        int hashCode = (((((this.f104916a ^ 1000003) * 1000003) ^ this.f104917b.hashCode()) * 1000003) ^ this.f104918c.hashCode()) * 1000003;
        if (this.f104919d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return hashCode ^ i11;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f104916a + ", version=" + this.f104917b + ", buildVersion=" + this.f104918c + ", jailbroken=" + this.f104919d + "}";
    }

    private C21591v(int i11, String str, String str2, boolean z11) {
        this.f104916a = i11;
        this.f104917b = str;
        this.f104918c = str2;
        this.f104919d = z11;
    }
}
