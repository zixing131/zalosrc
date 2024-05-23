package p053c9;

import p053c9.AbstractC3372d;
import p053c9.C3371c;

/* renamed from: c9.a */
/* loaded from: classes.dex */
final class C3369a extends AbstractC3372d {

    /* renamed from: b */
    private final String f14243b;

    /* renamed from: c */
    private final C3371c.a f14244c;

    /* renamed from: d */
    private final String f14245d;

    /* renamed from: e */
    private final String f14246e;

    /* renamed from: f */
    private final long f14247f;

    /* renamed from: g */
    private final long f14248g;

    /* renamed from: h */
    private final String f14249h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c9.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3372d.a {

        /* renamed from: a */
        private String f14250a;

        /* renamed from: b */
        private C3371c.a f14251b;

        /* renamed from: c */
        private String f14252c;

        /* renamed from: d */
        private String f14253d;

        /* renamed from: e */
        private Long f14254e;

        /* renamed from: f */
        private Long f14255f;

        /* renamed from: g */
        private String f14256g;

        /* synthetic */ b(AbstractC3372d abstractC3372d, a aVar) {
            this(abstractC3372d);
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: a */
        public AbstractC3372d mo16946a() {
            String str = "";
            if (this.f14251b == null) {
                str = " registrationStatus";
            }
            if (this.f14254e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f14255f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C3369a(this.f14250a, this.f14251b, this.f14252c, this.f14253d, this.f14254e.longValue(), this.f14255f.longValue(), this.f14256g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: b */
        public AbstractC3372d.a mo16947b(String str) {
            this.f14252c = str;
            return this;
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: c */
        public AbstractC3372d.a mo16948c(long j11) {
            this.f14254e = Long.valueOf(j11);
            return this;
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: d */
        public AbstractC3372d.a mo16949d(String str) {
            this.f14250a = str;
            return this;
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: e */
        public AbstractC3372d.a mo16950e(String str) {
            this.f14256g = str;
            return this;
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: f */
        public AbstractC3372d.a mo16951f(String str) {
            this.f14253d = str;
            return this;
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: g */
        public AbstractC3372d.a mo16952g(C3371c.a aVar) {
            if (aVar != null) {
                this.f14251b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // p053c9.AbstractC3372d.a
        /* renamed from: h */
        public AbstractC3372d.a mo16953h(long j11) {
            this.f14255f = Long.valueOf(j11);
            return this;
        }

        public b() {
        }

        private b(AbstractC3372d abstractC3372d) {
            this.f14250a = abstractC3372d.mo16940d();
            this.f14251b = abstractC3372d.mo16943g();
            this.f14252c = abstractC3372d.mo16938b();
            this.f14253d = abstractC3372d.mo16942f();
            this.f14254e = Long.valueOf(abstractC3372d.mo16939c());
            this.f14255f = Long.valueOf(abstractC3372d.mo16944h());
            this.f14256g = abstractC3372d.mo16941e();
        }
    }

    /* synthetic */ C3369a(String str, C3371c.a aVar, String str2, String str3, long j11, long j12, String str4, a aVar2) {
        this(str, aVar, str2, str3, j11, j12, str4);
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: b */
    public String mo16938b() {
        return this.f14245d;
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: c */
    public long mo16939c() {
        return this.f14247f;
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: d */
    public String mo16940d() {
        return this.f14243b;
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: e */
    public String mo16941e() {
        return this.f14249h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3372d)) {
            return false;
        }
        AbstractC3372d abstractC3372d = (AbstractC3372d) obj;
        String str3 = this.f14243b;
        if (str3 != null ? str3.equals(abstractC3372d.mo16940d()) : abstractC3372d.mo16940d() == null) {
            if (this.f14244c.equals(abstractC3372d.mo16943g()) && ((str = this.f14245d) != null ? str.equals(abstractC3372d.mo16938b()) : abstractC3372d.mo16938b() == null) && ((str2 = this.f14246e) != null ? str2.equals(abstractC3372d.mo16942f()) : abstractC3372d.mo16942f() == null) && this.f14247f == abstractC3372d.mo16939c() && this.f14248g == abstractC3372d.mo16944h()) {
                String str4 = this.f14249h;
                if (str4 == null) {
                    if (abstractC3372d.mo16941e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC3372d.mo16941e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: f */
    public String mo16942f() {
        return this.f14246e;
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: g */
    public C3371c.a mo16943g() {
        return this.f14244c;
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: h */
    public long mo16944h() {
        return this.f14248g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f14243b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f14244c.hashCode()) * 1000003;
        String str2 = this.f14245d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f14246e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        long j11 = this.f14247f;
        int i14 = (i13 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f14248g;
        int i15 = (i14 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str4 = this.f14249h;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return i15 ^ i11;
    }

    @Override // p053c9.AbstractC3372d
    /* renamed from: n */
    public AbstractC3372d.a mo16945n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f14243b + ", registrationStatus=" + this.f14244c + ", authToken=" + this.f14245d + ", refreshToken=" + this.f14246e + ", expiresInSecs=" + this.f14247f + ", tokenCreationEpochInSecs=" + this.f14248g + ", fisError=" + this.f14249h + "}";
    }

    private C3369a(String str, C3371c.a aVar, String str2, String str3, long j11, long j12, String str4) {
        this.f14243b = str;
        this.f14244c = aVar;
        this.f14245d = str2;
        this.f14246e = str3;
        this.f14247f = j11;
        this.f14248g = j12;
        this.f14249h = str4;
    }
}
