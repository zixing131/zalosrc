package p703z3;

import p703z3.AbstractC31206k;

/* renamed from: z3.e */
/* loaded from: classes.dex */
final class C31200e extends AbstractC31206k {

    /* renamed from: a */
    private final AbstractC31206k.b f144124a;

    /* renamed from: b */
    private final AbstractC31196a f144125b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z3.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC31206k.a {

        /* renamed from: a */
        private AbstractC31206k.b f144126a;

        /* renamed from: b */
        private AbstractC31196a f144127b;

        @Override // p703z3.AbstractC31206k.a
        /* renamed from: a */
        public AbstractC31206k mo152038a() {
            return new C31200e(this.f144126a, this.f144127b);
        }

        @Override // p703z3.AbstractC31206k.a
        /* renamed from: b */
        public AbstractC31206k.a mo152039b(AbstractC31196a abstractC31196a) {
            this.f144127b = abstractC31196a;
            return this;
        }

        @Override // p703z3.AbstractC31206k.a
        /* renamed from: c */
        public AbstractC31206k.a mo152040c(AbstractC31206k.b bVar) {
            this.f144126a = bVar;
            return this;
        }
    }

    /* synthetic */ C31200e(AbstractC31206k.b bVar, AbstractC31196a abstractC31196a, a aVar) {
        this(bVar, abstractC31196a);
    }

    @Override // p703z3.AbstractC31206k
    /* renamed from: b */
    public AbstractC31196a mo152036b() {
        return this.f144125b;
    }

    @Override // p703z3.AbstractC31206k
    /* renamed from: c */
    public AbstractC31206k.b mo152037c() {
        return this.f144124a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC31206k)) {
            return false;
        }
        AbstractC31206k abstractC31206k = (AbstractC31206k) obj;
        AbstractC31206k.b bVar = this.f144124a;
        if (bVar != null ? bVar.equals(abstractC31206k.mo152037c()) : abstractC31206k.mo152037c() == null) {
            AbstractC31196a abstractC31196a = this.f144125b;
            if (abstractC31196a == null) {
                if (abstractC31206k.mo152036b() == null) {
                    return true;
                }
            } else if (abstractC31196a.equals(abstractC31206k.mo152036b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC31206k.b bVar = this.f144124a;
        int i11 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i12 = (hashCode ^ 1000003) * 1000003;
        AbstractC31196a abstractC31196a = this.f144125b;
        if (abstractC31196a != null) {
            i11 = abstractC31196a.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f144124a + ", androidClientInfo=" + this.f144125b + "}";
    }

    private C31200e(AbstractC31206k.b bVar, AbstractC31196a abstractC31196a) {
        this.f144124a = bVar;
        this.f144125b = abstractC31196a;
    }
}
