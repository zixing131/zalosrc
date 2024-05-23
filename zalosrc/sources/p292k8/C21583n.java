package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.n */
/* loaded from: classes.dex */
final class C21583n extends AbstractC21569b0.e.d.a.b {

    /* renamed from: a */
    private final C21571c0 f104852a;

    /* renamed from: b */
    private final AbstractC21569b0.e.d.a.b.c f104853b;

    /* renamed from: c */
    private final AbstractC21569b0.a f104854c;

    /* renamed from: d */
    private final AbstractC21569b0.e.d.a.b.AbstractC32862d f104855d;

    /* renamed from: e */
    private final C21571c0 f104856e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.n$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.a.b.AbstractC32860b {

        /* renamed from: a */
        private C21571c0 f104857a;

        /* renamed from: b */
        private AbstractC21569b0.e.d.a.b.c f104858b;

        /* renamed from: c */
        private AbstractC21569b0.a f104859c;

        /* renamed from: d */
        private AbstractC21569b0.e.d.a.b.AbstractC32862d f104860d;

        /* renamed from: e */
        private C21571c0 f104861e;

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32860b
        /* renamed from: a */
        public AbstractC21569b0.e.d.a.b mo111411a() {
            String str = "";
            if (this.f104860d == null) {
                str = " signal";
            }
            if (this.f104861e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C21583n(this.f104857a, this.f104858b, this.f104859c, this.f104860d, this.f104861e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32860b
        /* renamed from: b */
        public AbstractC21569b0.e.d.a.b.AbstractC32860b mo111412b(AbstractC21569b0.a aVar) {
            this.f104859c = aVar;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32860b
        /* renamed from: c */
        public AbstractC21569b0.e.d.a.b.AbstractC32860b mo111413c(C21571c0 c21571c0) {
            if (c21571c0 != null) {
                this.f104861e = c21571c0;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32860b
        /* renamed from: d */
        public AbstractC21569b0.e.d.a.b.AbstractC32860b mo111414d(AbstractC21569b0.e.d.a.b.c cVar) {
            this.f104858b = cVar;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32860b
        /* renamed from: e */
        public AbstractC21569b0.e.d.a.b.AbstractC32860b mo111415e(AbstractC21569b0.e.d.a.b.AbstractC32862d abstractC32862d) {
            if (abstractC32862d != null) {
                this.f104860d = abstractC32862d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.b.AbstractC32860b
        /* renamed from: f */
        public AbstractC21569b0.e.d.a.b.AbstractC32860b mo111416f(C21571c0 c21571c0) {
            this.f104857a = c21571c0;
            return this;
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b
    /* renamed from: b */
    public AbstractC21569b0.a mo111394b() {
        return this.f104854c;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b
    /* renamed from: c */
    public C21571c0 mo111395c() {
        return this.f104856e;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b
    /* renamed from: d */
    public AbstractC21569b0.e.d.a.b.c mo111396d() {
        return this.f104853b;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b
    /* renamed from: e */
    public AbstractC21569b0.e.d.a.b.AbstractC32862d mo111397e() {
        return this.f104855d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.a.b)) {
            return false;
        }
        AbstractC21569b0.e.d.a.b bVar = (AbstractC21569b0.e.d.a.b) obj;
        C21571c0 c21571c0 = this.f104852a;
        if (c21571c0 != null ? c21571c0.equals(bVar.mo111398f()) : bVar.mo111398f() == null) {
            AbstractC21569b0.e.d.a.b.c cVar = this.f104853b;
            if (cVar != null ? cVar.equals(bVar.mo111396d()) : bVar.mo111396d() == null) {
                AbstractC21569b0.a aVar = this.f104854c;
                if (aVar != null ? aVar.equals(bVar.mo111394b()) : bVar.mo111394b() == null) {
                    if (this.f104855d.equals(bVar.mo111397e()) && this.f104856e.equals(bVar.mo111395c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a.b
    /* renamed from: f */
    public C21571c0 mo111398f() {
        return this.f104852a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        C21571c0 c21571c0 = this.f104852a;
        int i11 = 0;
        if (c21571c0 == null) {
            hashCode = 0;
        } else {
            hashCode = c21571c0.hashCode();
        }
        int i12 = (hashCode ^ 1000003) * 1000003;
        AbstractC21569b0.e.d.a.b.c cVar = this.f104853b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        AbstractC21569b0.a aVar = this.f104854c;
        if (aVar != null) {
            i11 = aVar.hashCode();
        }
        return ((((i13 ^ i11) * 1000003) ^ this.f104855d.hashCode()) * 1000003) ^ this.f104856e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f104852a + ", exception=" + this.f104853b + ", appExitInfo=" + this.f104854c + ", signal=" + this.f104855d + ", binaries=" + this.f104856e + "}";
    }

    private C21583n(C21571c0 c21571c0, AbstractC21569b0.e.d.a.b.c cVar, AbstractC21569b0.a aVar, AbstractC21569b0.e.d.a.b.AbstractC32862d abstractC32862d, C21571c0 c21571c02) {
        this.f104852a = c21571c0;
        this.f104853b = cVar;
        this.f104854c = aVar;
        this.f104855d = abstractC32862d;
        this.f104856e = c21571c02;
    }
}
