package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.r */
/* loaded from: classes.dex */
final class C21587r extends AbstractC21569b0.e.d.a.b.AbstractC32864e {

    /* renamed from: a */
    private final String f104886a;

    /* renamed from: b */
    private final int f104887b;

    /* renamed from: c */
    private final C21571c0 f104888c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.r$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a {

        /* renamed from: a */
        private String f104889a;

        /* renamed from: b */
        private Integer f104890b;

        /* renamed from: c */
        private C21571c0 f104891c;

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a
        /* renamed from: a */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e mo111441a() {
            String str = "";
            if (this.f104889a == null) {
                str = " name";
            }
            if (this.f104890b == null) {
                str = str + " importance";
            }
            if (this.f104891c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C21587r(this.f104889a, this.f104890b.intValue(), this.f104891c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a
        /* renamed from: b */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a mo111442b(C21571c0 c21571c0) {
            if (c21571c0 != null) {
                this.f104891c = c21571c0;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a
        /* renamed from: c */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a mo111443c(int i11) {
            this.f104890b = Integer.valueOf(i11);
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a
        /* renamed from: d */
        public AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a mo111444d(String str) {
            if (str != null) {
                this.f104889a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e
    /* renamed from: b */
    public C21571c0 mo111438b() {
        return this.f104888c;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e
    /* renamed from: c */
    public int mo111439c() {
        return this.f104887b;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32864e
    /* renamed from: d */
    public String mo111440d() {
        return this.f104886a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.a.b.AbstractC32864e)) {
            return false;
        }
        AbstractC21569b0.e.d.a.b.AbstractC32864e abstractC32864e = (AbstractC21569b0.e.d.a.b.AbstractC32864e) obj;
        if (this.f104886a.equals(abstractC32864e.mo111440d()) && this.f104887b == abstractC32864e.mo111439c() && this.f104888c.equals(abstractC32864e.mo111438b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f104886a.hashCode() ^ 1000003) * 1000003) ^ this.f104887b) * 1000003) ^ this.f104888c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f104886a + ", importance=" + this.f104887b + ", frames=" + this.f104888c + "}";
    }

    private C21587r(String str, int i11, C21571c0 c21571c0) {
        this.f104886a = str;
        this.f104887b = i11;
        this.f104888c = c21571c0;
    }
}
