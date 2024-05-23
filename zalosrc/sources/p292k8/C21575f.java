package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.f */
/* loaded from: classes.dex */
final class C21575f extends AbstractC21569b0.d {

    /* renamed from: a */
    private final C21571c0 f104772a;

    /* renamed from: b */
    private final String f104773b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC21569b0.d.a {

        /* renamed from: a */
        private C21571c0 f104774a;

        /* renamed from: b */
        private String f104775b;

        @Override // p292k8.AbstractC21569b0.d.a
        /* renamed from: a */
        public AbstractC21569b0.d mo111300a() {
            String str = "";
            if (this.f104774a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new C21575f(this.f104774a, this.f104775b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.d.a
        /* renamed from: b */
        public AbstractC21569b0.d.a mo111301b(C21571c0 c21571c0) {
            if (c21571c0 != null) {
                this.f104774a = c21571c0;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // p292k8.AbstractC21569b0.d.a
        /* renamed from: c */
        public AbstractC21569b0.d.a mo111302c(String str) {
            this.f104775b = str;
            return this;
        }
    }

    @Override // p292k8.AbstractC21569b0.d
    /* renamed from: b */
    public C21571c0 mo111298b() {
        return this.f104772a;
    }

    @Override // p292k8.AbstractC21569b0.d
    /* renamed from: c */
    public String mo111299c() {
        return this.f104773b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.d)) {
            return false;
        }
        AbstractC21569b0.d dVar = (AbstractC21569b0.d) obj;
        if (this.f104772a.equals(dVar.mo111298b())) {
            String str = this.f104773b;
            if (str == null) {
                if (dVar.mo111299c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo111299c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f104772a.hashCode() ^ 1000003) * 1000003;
        String str = this.f104773b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f104772a + ", orgId=" + this.f104773b + "}";
    }

    private C21575f(C21571c0 c21571c0, String str) {
        this.f104772a = c21571c0;
        this.f104773b = str;
    }
}
