package p703z3;

import p703z3.AbstractC31210o;

/* renamed from: z3.i */
/* loaded from: classes.dex */
final class C31204i extends AbstractC31210o {

    /* renamed from: a */
    private final AbstractC31210o.c f144157a;

    /* renamed from: b */
    private final AbstractC31210o.b f144158b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z3.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC31210o.a {

        /* renamed from: a */
        private AbstractC31210o.c f144159a;

        /* renamed from: b */
        private AbstractC31210o.b f144160b;

        @Override // p703z3.AbstractC31210o.a
        /* renamed from: a */
        public AbstractC31210o mo152074a() {
            return new C31204i(this.f144159a, this.f144160b);
        }

        @Override // p703z3.AbstractC31210o.a
        /* renamed from: b */
        public AbstractC31210o.a mo152075b(AbstractC31210o.b bVar) {
            this.f144160b = bVar;
            return this;
        }

        @Override // p703z3.AbstractC31210o.a
        /* renamed from: c */
        public AbstractC31210o.a mo152076c(AbstractC31210o.c cVar) {
            this.f144159a = cVar;
            return this;
        }
    }

    /* synthetic */ C31204i(AbstractC31210o.c cVar, AbstractC31210o.b bVar, a aVar) {
        this(cVar, bVar);
    }

    @Override // p703z3.AbstractC31210o
    /* renamed from: b */
    public AbstractC31210o.b mo152072b() {
        return this.f144158b;
    }

    @Override // p703z3.AbstractC31210o
    /* renamed from: c */
    public AbstractC31210o.c mo152073c() {
        return this.f144157a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC31210o)) {
            return false;
        }
        AbstractC31210o abstractC31210o = (AbstractC31210o) obj;
        AbstractC31210o.c cVar = this.f144157a;
        if (cVar != null ? cVar.equals(abstractC31210o.mo152073c()) : abstractC31210o.mo152073c() == null) {
            AbstractC31210o.b bVar = this.f144158b;
            if (bVar == null) {
                if (abstractC31210o.mo152072b() == null) {
                    return true;
                }
            } else if (bVar.equals(abstractC31210o.mo152072b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC31210o.c cVar = this.f144157a;
        int i11 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i12 = (hashCode ^ 1000003) * 1000003;
        AbstractC31210o.b bVar = this.f144158b;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f144157a + ", mobileSubtype=" + this.f144158b + "}";
    }

    private C31204i(AbstractC31210o.c cVar, AbstractC31210o.b bVar) {
        this.f144157a = cVar;
        this.f144158b = bVar;
    }
}
