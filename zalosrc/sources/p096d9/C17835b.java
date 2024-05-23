package p096d9;

import p096d9.AbstractC17839f;

/* renamed from: d9.b */
/* loaded from: classes3.dex */
final class C17835b extends AbstractC17839f {

    /* renamed from: a */
    private final String f90113a;

    /* renamed from: b */
    private final long f90114b;

    /* renamed from: c */
    private final AbstractC17839f.b f90115c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d9.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC17839f.a {

        /* renamed from: a */
        private String f90116a;

        /* renamed from: b */
        private Long f90117b;

        /* renamed from: c */
        private AbstractC17839f.b f90118c;

        @Override // p096d9.AbstractC17839f.a
        /* renamed from: a */
        public AbstractC17839f mo94084a() {
            String str = "";
            if (this.f90117b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C17835b(this.f90116a, this.f90117b.longValue(), this.f90118c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p096d9.AbstractC17839f.a
        /* renamed from: b */
        public AbstractC17839f.a mo94085b(AbstractC17839f.b bVar) {
            this.f90118c = bVar;
            return this;
        }

        @Override // p096d9.AbstractC17839f.a
        /* renamed from: c */
        public AbstractC17839f.a mo94086c(String str) {
            this.f90116a = str;
            return this;
        }

        @Override // p096d9.AbstractC17839f.a
        /* renamed from: d */
        public AbstractC17839f.a mo94087d(long j11) {
            this.f90117b = Long.valueOf(j11);
            return this;
        }
    }

    /* synthetic */ C17835b(String str, long j11, AbstractC17839f.b bVar, a aVar) {
        this(str, j11, bVar);
    }

    @Override // p096d9.AbstractC17839f
    /* renamed from: b */
    public AbstractC17839f.b mo94081b() {
        return this.f90115c;
    }

    @Override // p096d9.AbstractC17839f
    /* renamed from: c */
    public String mo94082c() {
        return this.f90113a;
    }

    @Override // p096d9.AbstractC17839f
    /* renamed from: d */
    public long mo94083d() {
        return this.f90114b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17839f)) {
            return false;
        }
        AbstractC17839f abstractC17839f = (AbstractC17839f) obj;
        String str = this.f90113a;
        if (str != null ? str.equals(abstractC17839f.mo94082c()) : abstractC17839f.mo94082c() == null) {
            if (this.f90114b == abstractC17839f.mo94083d()) {
                AbstractC17839f.b bVar = this.f90115c;
                if (bVar == null) {
                    if (abstractC17839f.mo94081b() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC17839f.mo94081b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f90113a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.f90114b;
        int i12 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        AbstractC17839f.b bVar = this.f90115c;
        if (bVar != null) {
            i11 = bVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "TokenResult{token=" + this.f90113a + ", tokenExpirationTimestamp=" + this.f90114b + ", responseCode=" + this.f90115c + "}";
    }

    private C17835b(String str, long j11, AbstractC17839f.b bVar) {
        this.f90113a = str;
        this.f90114b = j11;
        this.f90115c = bVar;
    }
}
