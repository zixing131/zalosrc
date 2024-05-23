package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.u */
/* loaded from: classes.dex */
final class C21590u extends AbstractC21569b0.e.d.AbstractC32868d {

    /* renamed from: a */
    private final String f104914a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.u$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.AbstractC32868d.a {

        /* renamed from: a */
        private String f104915a;

        @Override // p292k8.AbstractC21569b0.e.d.AbstractC32868d.a
        /* renamed from: a */
        public AbstractC21569b0.e.d.AbstractC32868d mo111479a() {
            String str = "";
            if (this.f104915a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new C21590u(this.f104915a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.AbstractC32868d.a
        /* renamed from: b */
        public AbstractC21569b0.e.d.AbstractC32868d.a mo111480b(String str) {
            if (str != null) {
                this.f104915a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.AbstractC32868d
    /* renamed from: b */
    public String mo111478b() {
        return this.f104914a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC21569b0.e.d.AbstractC32868d) {
            return this.f104914a.equals(((AbstractC21569b0.e.d.AbstractC32868d) obj).mo111478b());
        }
        return false;
    }

    public int hashCode() {
        return this.f104914a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f104914a + "}";
    }

    private C21590u(String str) {
        this.f104914a = str;
    }
}
