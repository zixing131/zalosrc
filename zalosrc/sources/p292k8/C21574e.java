package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.e */
/* loaded from: classes.dex */
final class C21574e extends AbstractC21569b0.c {

    /* renamed from: a */
    private final String f104768a;

    /* renamed from: b */
    private final String f104769b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.c.a {

        /* renamed from: a */
        private String f104770a;

        /* renamed from: b */
        private String f104771b;

        @Override // p292k8.AbstractC21569b0.c.a
        /* renamed from: a */
        public AbstractC21569b0.c mo111294a() {
            String str = "";
            if (this.f104770a == null) {
                str = " key";
            }
            if (this.f104771b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C21574e(this.f104770a, this.f104771b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.c.a
        /* renamed from: b */
        public AbstractC21569b0.c.a mo111295b(String str) {
            if (str != null) {
                this.f104770a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // p292k8.AbstractC21569b0.c.a
        /* renamed from: c */
        public AbstractC21569b0.c.a mo111296c(String str) {
            if (str != null) {
                this.f104771b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // p292k8.AbstractC21569b0.c
    /* renamed from: b */
    public String mo111292b() {
        return this.f104768a;
    }

    @Override // p292k8.AbstractC21569b0.c
    /* renamed from: c */
    public String mo111293c() {
        return this.f104769b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.c)) {
            return false;
        }
        AbstractC21569b0.c cVar = (AbstractC21569b0.c) obj;
        if (this.f104768a.equals(cVar.mo111292b()) && this.f104769b.equals(cVar.mo111293c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f104768a.hashCode() ^ 1000003) * 1000003) ^ this.f104769b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f104768a + ", value=" + this.f104769b + "}";
    }

    private C21574e(String str, String str2) {
        this.f104768a = str;
        this.f104769b = str2;
    }
}
